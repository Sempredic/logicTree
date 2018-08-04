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
    
    private Node root;
    private ArrayList<Object> uID_Registry;
    
    public TreeManager(String data){
        uID_Registry = new ArrayList<Object>();
        root = new Node("N1",data);
        uID_Registry.add(root.getName());
    }
    
    public Node getRoot(){
        return this.root;
    }
    
    public ArrayList<Object> getUIDRegistry(){
        return uID_Registry;
    }
    
    public Node findNode(Node head,String name){

        if(head !=null){
            if(head.getName()==name){
                return head;
            }else{
                if(!head.getChildren().isEmpty()){
                    for(Node node:head.getChildren()){
                        
                        if(node.getName()==name){
                            return node;
                        }else{
                           node= findNode(node,name); 
                           if(node!=null){
                               if(node.getName()==name){
                                   return node;
                               }else{
                                   return null;
                               }
                           } 
                        }     
                        
                    }
                }else{
                    return null;
                }
            }
        }

        return head;
    }
    
    public void addNode(Node c_Node,String name,String data){
        if(c_Node != null){
            if(!uID_Registry.contains(name)){
                uID_Registry.add(name);
                Node n_Node = new Node(name,data);
                c_Node.setChild(n_Node);
                n_Node.setParent(c_Node); 
            }else{
                System.out.println("Node Name Already Exists");
            }
            
        }else{
            System.out.println("Node Null");
        }
        
    }
    
    public void displayTree(Node head){

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
