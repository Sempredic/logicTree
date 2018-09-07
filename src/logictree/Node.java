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
public class Node {
    
    String name;
    
    String data;
    Node parent;
    ArrayList<Node> children;
    
    public Node(){}
    
    public Node(String name,String data){
        this.name = name;
        this.data = data;
        this.children = new ArrayList<Node>();
        
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setParent(Node parent){
        this.parent = parent;
    }
    
    public void setChild(Node child){
        this.children.add(child);
    }
    
    public String getData(){
        return this.data;
    }
    
    public String getName(){
        return this.name;
    }
    
    public ArrayList<Node> getChildren(){
        return this.children;
    }
    
    public Node getParent(){
        return this.parent;
    }
    
 
}
