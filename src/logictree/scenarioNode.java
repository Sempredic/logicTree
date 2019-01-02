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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 311015
 */
public class scenarioNode extends Node{
    
    LinkedHashMap<String,ArrayList> elementsMap;
    ArrayList elements;
    ArrayList sentenceElements;
    String scenarioTemplate;
    
    
    scenarioNode(String name,String data){
        super(name,data);
        elementsMap = new LinkedHashMap<String,ArrayList>();
        elements = new ArrayList();
        elements = new ArrayList();
        scenarioTemplate = null;
    }
    
    public void addElement(String key,String element){
        
        // add element key as "'example'"
        
        if(elementsMap.containsKey(key)){
            if(!elementsMap.get(key).contains(element)){
                elementsMap.get(key).add(element);
            }else{
                System.out.println(element + " Already Exists");
            }    
        }else{
            ArrayList newList = new ArrayList();
            newList.add(element);
            elementsMap.put(key,newList);
            elements.add(key);
        }
    }

    public void setScenarioTemplate(String template){
        
        //include element key in template as single quote marks, 'example'
        
        scenarioTemplate = template;
    }
    
    public ArrayList getElements(){
        return elements;
    }
    
    public LinkedHashMap<String,ArrayList>  getElementMap(){
        return elementsMap;
    }
    
    public String getScenario(){
        return scenarioTemplate;
    }
    
    public void randomizeElements(){
 
        // 
        Random rand = new Random();
        LinkedHashMap<Object,Integer> wordOccurances = new LinkedHashMap<Object,Integer>();
        Pattern p;
        Matcher m;

        for(Object word:elements){
            int occur = 0;
            
            p = Pattern.compile((String)word);
            m = p.matcher(scenarioTemplate);
            
            while(m.find()){
                occur++;
            }
            
            wordOccurances.put(word, occur);
            
        }

        for(Map.Entry<Object,Integer> entry:wordOccurances.entrySet()){
            String key = (String)entry.getKey();
            int r =0;

            for(int i=0;i<entry.getValue();i++){
                
                if(elementsMap.containsKey(key)){
                    r = rand.nextInt(elementsMap.get(key).size());
                }
                
                scenarioTemplate = scenarioTemplate.replaceFirst((String)entry.getKey(), (String)elementsMap.get(key).get(r));
            }
        }

        data = scenarioTemplate;
    }
}
