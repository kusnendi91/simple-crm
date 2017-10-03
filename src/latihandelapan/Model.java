/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandelapan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Model {
    
    public List<Person> getDataFromFile(String path) throws FileNotFoundException, IOException{
        List<Person> entry = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line=null;
        while((line=reader.readLine())!=null){
            String[] arrayLine = line.split(",");
            Person someone = new Person(arrayLine[0],arrayLine[1],Boolean.parseBoolean(arrayLine[2]),Integer.parseInt(arrayLine[3]));
            entry.add(someone);
        }
        return entry;
               
    }
    
}
