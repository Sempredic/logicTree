/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logictree;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author 311015
 */
public class TreeManager {
    
    private Node root;
    private ArrayList<Object> uID_Registry;
    private Stack<Node> rNodes;
    
    public TreeManager(String data){
        uID_Registry = new ArrayList<Object>();
        root = new Node("N1",data);
        uID_Registry.add(root.getName());
        rNodes = new Stack<Node>();
    }
    
    public Node getRoot(){
        return this.root;
    }
    
    public ArrayList<Object> getUIDRegistry(){
        return uID_Registry;
    }
    
    public Node findNode(Node head,String name){

        if(head == null){
            return null;
        }

        if(head.getName() == name){
            return head;
        }

        if(head !=null){
            if(head.getName()!=name){
                if(!head.getChildren().isEmpty()){ 
                    for(Node node:head.getChildren()){
                        if(node.getName()==name){
                            return node;
                        }else{
                            head = findNode(node,name);
                            if(head!=null){
                                if(head.getName()==name){
                                    return head;
                                }
                            }
                        }           
                    }
                }else{
                    head = null;
                }
            }
        }

        return head;
    }
    
    public Node findNode(String name){
        
        Node head = root;

        if(head == null){
            return null;
        }

        if(head.getName() == name){
            return head;
        }

        if(head !=null){
            if(head.getName()!=name){
                if(!head.getChildren().isEmpty()){ 
                    for(Node node:head.getChildren()){
                        if(node.getName()==name){
                            return node;
                        }else{
                            head = findNode(node,name);
                            if(head!=null){
                                if(head.getName()==name){
                                    return head;
                                }
                            }
                        }           
                    }
                }else{
                    head = null;
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
    
    public void addNode(Node c_Node,Node n_Node){
        if(c_Node != null && n_Node != null){
            if(!uID_Registry.contains(n_Node.getName())){
                uID_Registry.add(n_Node.getName());
                c_Node.setChild(n_Node);
                n_Node.setParent(c_Node); 
            }else{
                System.out.println("Node Name Already Exists");
            }
        }else{
            System.out.println("Node Null");
        }
    }
    
    public void removeNode(Node head){
        
        if(head!=null){
            if(uID_Registry.contains(head.getName())){
                String name = null;

                if(head !=null){
                    if(!rNodes.contains(head)){
                        rNodes.push(head);
                    }

                    if(!head.getChildren().isEmpty()){
                        for(Node node:head.getChildren()){
                            if(node !=null){
                                if(!rNodes.contains(node)){
                                    rNodes.push(node);
                                }
                            }
                        }

                        for(Node node:head.getChildren()){
                            removeNode(node);
                        }     
                    }  
                }

                if(head == rNodes.firstElement()){
                    while(!rNodes.empty()){

                        String type = rNodes.peek().getClass().getSimpleName();
                        Object n = rNodes.pop();

                        switch(type){
                            case "scenarioNode":
                                scenarioNode sn = (scenarioNode)n;
                                name = sn.getName();
                                sn.getChildren().clear();
                                if(rNodes.isEmpty()){
                                    if(sn.getParent()!=null){
                                        if(!sn.getParent().getChildren().isEmpty()){
                                            sn.getParent().getChildren().remove(sn);
                                        }     
                                    }
                                }
                                uID_Registry.remove(name);
                                break;
                            case "Node":
                                Node node = (Node)n;
                                name = node.getName();
                                node.getChildren().clear();
                                if(rNodes.isEmpty()){
                                    if(node.getParent()!=null){
                                        if(!node.getParent().getChildren().isEmpty()){
                                            node.getParent().getChildren().remove(node);
                                        }     
                                    }
                                }
                                uID_Registry.remove(name);
                                break;
                        }

                    }
                }
            }else{
                System.out.println("Node Doesn't Exist");
            }
        }else{
            System.out.println("Node Doesn't Exist");
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
