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
        
        TM.addNode(TM.getRoot(),"N1Q1", "Start Test?");

        scenarioNode sn = new scenarioNode("Scenario","Data");
        
        sn.setScenarioTemplate("You have an 'device' in a 'color' bag. What grade is the unit? 'sentence'. 'sentence' , 'color' 'device'");
        sn.addElement("'color'", "WHITE");
        sn.addElement("'color'", "BLUE");
        sn.addElement("'color'", "RED");
        sn.addElement("'color'", "YELLOW");
        sn.addElement("'device'","IPHONE");
        sn.addElement("'device'","IPAD");
        sn.addElement("'device'","ITOUCH");
        sn.addElement("'sentence'", "This is a Sentence");
        sn.addElement("'sentence'", "This is another Sentence");
        sn.addElement("'sentence'", "This is again seriously the last Sentence");
        sn.randomizeElements();

        
        TM.addNode(TM.findNode("N1Q1"),"N2Q1","YES");
        TM.addNode(TM.findNode("N1Q1"),"N2Q2","NO");
        TM.addNode(TM.findNode("N2Q1"),sn);

        
        
        TM.removeNode(TM.findNode("N1Q1"));
      
        TM.displayTree(TM.getRoot());
        
        System.out.println(TM.getUIDRegistry());

    }
    
}
