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

        scenarioNode sn = new scenarioNode("Scenario","Data");
        
        sn.setScenarioTemplate("You have an 'device' in a 'color' bag. What grade is the unit?");
        sn.addElement("'color'", "WHITE");
        sn.addElement("'color'", "BLUE");
        sn.addElement("'color'", "RED");
        sn.addElement("'color'", "YELLOW");
        sn.addElement("'device'","IPHONE");
        sn.addElement("'device'","IPAD");
        sn.addElement("'device'","ITOUCH");
        sn.addElement("'device'","IPOD SHUFFLE");
        sn.addElement("'device'","IPOD CLASSIC");
        sn.addElement("'device'","IPOD NANO");
        sn.addElement("'device'","JOSE");
        sn.randomizeElements();
        System.out.println(sn.getElements());
        
        TM.addNode(TM.findNode(TM.getRoot(), "N1Q1"),sn);
        TM.addNode(TM.findNode(TM.getRoot(), "Scenario"),"A1","YES");
        TM.addNode(TM.findNode(TM.getRoot(), "Scenario"),"A2","NO");

        TM.displayTree(TM.getRoot());
        System.out.println(TM.getUIDRegistry());

    }
    
}
