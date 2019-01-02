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
        
        TreeManager TM = new TreeManager("Welcome Node");
        
        TM.addNode(TM.getRoot(),"Start", "Do you have money to buy 100 shares of preferred stock?");
        
        TM.addNode(TM.findNode("Start"),"N2Q1","YES");
        TM.addNode(TM.findNode("Start"),"N2Q2","NO");
        
        TM.addNode(TM.findNode("N2Q2"),"N3Q1","Would You Like to Bet Stock is Going UP or DOWN?");
        TM.addNode(TM.findNode("N3Q1"),"N3A1","UP");
        TM.addNode(TM.findNode("N3Q1"),"N3A2","DOWN");

//        scenarioNode sn = new scenarioNode("Scenario","Data");
//        
//        sn.setScenarioTemplate("You have an 'device' in a 'color' bag. 'sentence'");
//        sn.addElement("'color'", "WHITE");
//        sn.addElement("'color'", "BLUE");
//        sn.addElement("'color'", "RED");
//        sn.addElement("'color'", "YELLOW");
//        sn.addElement("'device'","IPHONE");
//        sn.addElement("'device'","IPAD");
//        sn.addElement("'device'","ITOUCH");
//        sn.addElement("'sentence'", "What Grade is the Unit?");
//        sn.addElement("'sentence'", "Is This Color a Conversion?");
//        sn.randomizeElements();
//
//        
//        TM.addNode(TM.findNode("N1Q1"),"N2Q1","YES");
//        TM.addNode(TM.findNode("N1Q1"),"N2Q2","NO");
//        TM.addNode(TM.findNode("N2Q1"),sn);
//        TM.addNode(TM.findNode("Scenario"),"N3Q1","YES");
//        TM.addNode(TM.findNode("Scenario"),"N3Q2","NO");
//
//        TM.displayTree(TM.getRoot());
//        
//        System.out.println(TM.getUIDRegistry());
          TM.displayTree(TM.getRoot());

    }
    
}
