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
        
        TM.addNode(TM.getRoot(),"N1Q1", "What Is The Type of Unit?");
        
        TM.addNode(TM.findNode(TM.getRoot(), "N1Q1"),"N1A1", "iPhone");
        TM.addNode(TM.findNode(TM.getRoot(), "N1Q1"),"N1A2", "iPad");
        TM.addNode(TM.findNode(TM.getRoot(), "N1Q1"),"N1A3", "iTouch");
        TM.addNode(TM.findNode(TM.getRoot(), "N1Q1"),"N1A4", "iPod");
        
        TM.addNode(TM.findNode(TM.getRoot(), "N1A3"),"N2Q1", "Is iTouch A Generation 5 16GB?");
        TM.addNode(TM.findNode(TM.getRoot(), "N1A1"),"N2Q2", "iPhone Blah?");


        TM.displayTree(TM.getRoot());
        System.out.println(TM.getUIDRegistry());

    }
    
}
