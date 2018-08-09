/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logictree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author 311015
 */
public class scenarioNode extends Node{
    
    LinkedHashMap<String,ArrayList> elementsMap;
    ArrayList elements;
    String scenarioTemplate;
    
    
    scenarioNode(String name,String data){
        super(name,data);
        elementsMap = new LinkedHashMap<String,ArrayList>();
        elements = new ArrayList();
        scenarioTemplate = null;
    }
    
    public void addElement(String key,String element){
        if(elementsMap.containsKey(key)){
            if(!elementsMap.get(key).contains(element)){
                elementsMap.get(key).add(element);
            }else{
                System.out.println("Element Already Exists");
            }    
        }else{
            ArrayList newList = new ArrayList();
            newList.add(element);
            elementsMap.put(key,newList);
            elements.add(key);
        }
    }
    
    public void setScenarioTemplate(String template){
        scenarioTemplate = template;
    }
    
    public void randomizeElements(){
 
        Random rand = new Random();
        int numElements = elementsMap.size();
        LinkedHashMap<Object,Object> randomList = new LinkedHashMap();

        for(Object obj:elements){
            if(elementsMap.containsKey(obj)){
                int r = rand.nextInt(elementsMap.get(obj).size());
                randomList.put(obj, elementsMap.get(obj).get(r));
            }
        }
        
        for(Map.Entry<Object,Object> ob:randomList.entrySet()){
            if(scenarioTemplate.contains((String)ob.getKey())){
                scenarioTemplate = scenarioTemplate.replaceAll((String)ob.getKey(), (String)ob.getValue());
            }
                    
        }
       
  
        System.out.println(scenarioTemplate);

    }
    
}
