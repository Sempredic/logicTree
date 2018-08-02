/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logictree;

import java.util.ArrayList;

/**
 *
 * @author 311015
 */
public class TreeManager {
    
    Node root;
    
    public TreeManager(String data){
        root = new Node("Q1",data);
        
    }
    
    public Node getRoot(){
        return this.root;
    }
    
    public Node findNode(Node head,String name){
        
        Node temp = new Node();

        if(head !=null){
            if(head.getName()!=name){
                if(!head.getChildren().isEmpty()){
                    for(Node node:head.getChildren()){
                        if(node !=null){
                            if(node.getName()==name){
                                return node;
                            }else{
                               temp= findNode(node,name);  
                            }     
                        } 
                    }
                }else{
                    temp = head;
                }
            }
        }

        return temp;
    }
    
    public void addNode(Node c_Node,String name,String data){
        Node n_Node = new Node(name,data);
        c_Node.setChild(n_Node);
        n_Node.setParent(c_Node);
    }
    
    public void displayTree(Node head){
        
        Node temp = new Node();
    
        if(head !=null){
            System.out.println("<" + head.getName() + ": " + head.getData() + ">");
            if(!head.getChildren().isEmpty()){
                for(Node node:head.getChildren()){
                    if(node !=null){
                        System.out.print("(" + node.getName() + ": " + node.getData() + ")");          
                    }
                    
                }
                
                System.out.println();
                
                for(Node node:head.getChildren()){
                    System.out.println();
                    displayTree(node);
                }     
            }  
        }
    }    
}
