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
        
        TM.addNode(TM.getRoot(),"Q1A1", "What Is The Type of Unit?");
        
        TM.addNode(TM.findNode(TM.getRoot(), "Q1A1"),"Q2A1", "iPhone");
        TM.addNode(TM.findNode(TM.getRoot(), "Q1A1"),"Q2A2", "iPad");
        TM.addNode(TM.findNode(TM.getRoot(), "Q1A1"),"Q2A3", "iTouch");
        TM.addNode(TM.findNode(TM.getRoot(), "Q1A1"),"Q2A4", "iPod");
        
        TM.addNode(TM.findNode(TM.getRoot(), "Q2A3"),"Q3A1", "Is iTouch A Generation 5 16GB?");
        TM.addNode(TM.findNode(TM.getRoot(), "Q2A1"),"Q3A2", "iPhone Blah?");
        
        
        TM.addNode(TM.findNode(TM.getRoot(), "Q3A1"),"Q4A1", "Yes");
        TM.addNode(TM.findNode(TM.getRoot(), "Q3A1"),"Q4A2", "No");
        
        TM.addNode(TM.findNode(TM.getRoot(), "Q3A2"),"Q4A3", "iPhone BLAH BLAH");
        TM.addNode(TM.findNode(TM.getRoot(), "Q3A2"),"Q4A4", "iPhone BLAH BLAH BLAH");

        TM.displayTree(TM.getRoot());
    }
    
}
