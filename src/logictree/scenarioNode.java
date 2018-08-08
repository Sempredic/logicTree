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
public class scenarioNode extends Node{
    
    ArrayList<Object> elements;
    String scenarioTemplate;
    
    scenarioNode(String name,String data){
        super(name,data);
        elements = new ArrayList<Object>();
        scenarioTemplate = null;
    }
    
    public void addElement(String element){
        elements.add(element);
    }
    
    public void setScenarioTemplate(String template){
        scenarioTemplate = template;
    }
    
    public String[] randomizeElements(){
 
        StringBuilder builder = new StringBuilder();
        String[] templateList = scenarioTemplate.split("\\*");
        int numElements = templateList.length-1;
        
        System.out.println(numElements);
        
        
        return templateList;
    }
    
}
