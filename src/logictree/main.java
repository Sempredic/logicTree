/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logictree;

/**
 *
 * @author 311015
 */
public class main {
    
    public static void main(String args[]){
        
        TreeManager TM = new TreeManager("Why Won't Unit Sync To Blancco?");
        
        TM.addNode(TM.getRoot(),"Q1A1", "Is Unit A Phone?");
        TM.addNode(TM.getRoot(),"Third", "Is Unit An iPod Touch?");
        TM.addNode(TM.findNode(TM.getRoot(), "Third"),"Fourth", "This is the Fourth");
        TM.addNode(TM.findNode(TM.getRoot(), "Fourth"),"Fifth", "This is the Fifth");
        TM.addNode(TM.findNode(TM.getRoot(), "Second"),"2nd-First", "One");
        TM.addNode(TM.findNode(TM.getRoot(), "Second"),"2nd-Second", "Two");
        TM.addNode(TM.findNode(TM.getRoot(), "Second"),"2nd-Third", "Three");
        TM.addNode(TM.findNode(TM.getRoot(), "Fifth"),"5th-First", "One");

        TM.displayTree(TM.getRoot());
    }
    
}
