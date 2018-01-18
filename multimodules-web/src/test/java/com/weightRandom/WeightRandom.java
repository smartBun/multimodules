package com.weightRandom;

import java.util.*;

public class WeightRandom {
      
    private static Map<String, Integer> servers = new HashMap<>();
  
    static{  
        servers.put("192.168.20.101", 4);
        servers.put("192.168.20.102", 3);
        servers.put("192.168.20.103", 2);
        servers.put("192.168.20.104", 1);
    }  
      
    private static String selectServer(Map<String, Integer> servers){
        if(servers == null || servers.size() == 0) return null;  
          
        Integer sum = 0;
        Set<Map.Entry<String, Integer>> entrySet = servers.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()){  
            sum += iterator.next().getValue();  
        }
        Integer rand = new Random().nextInt(sum) + 1;
        for(Map.Entry<String, Integer> entry : entrySet){  
            rand -= entry.getValue();
            if(rand <=0){
                return entry.getKey();
            }
        }
        return null;
    }  
      
    public static void main(String[] args){  
        Map<String, Integer> map = new HashMap<>();
        String key;
        for(int i = 0; i < 100000; i++){
            key = selectServer(servers);  
            if(map.containsKey(key)){  
                map.put(key, map.get(key) + 1);  
            }else{  
                map.put(key, 1);  
            }  
        }  
        for(String key1 : map.keySet()){  
            System.out.println(key1 + " " + map.get(key1));  
        }  
    }  
      
}  