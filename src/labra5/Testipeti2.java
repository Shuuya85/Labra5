/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labra5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author miikahen
 */
public class Testipeti2 {
    
    public static void main(String[] args) {
        TimeUtils tu = new TimeUtils();
        int testilkm = 0;
        int testilapilkm = 0;
        int testifaillkm = 0;
        int tmp =0;
        String rivi = null;
        int j =0;
        int i = 0;
        int ajat[] = new int[11];
        String odtulok[] = new String[22];
        try{
            FileReader fileReader = new FileReader(new File("data.txt"));
            BufferedReader br = new BufferedReader(fileReader);
            while((rivi = br.readLine()) != null){
                System.out.println(rivi);
                if(j <=10){
                    ajat[j] = Integer.parseInt(rivi);
                }else{
                    odtulok[i] = rivi;
                    i++;
                }
                j++;
            }
            PrintWriter writer = new PrintWriter("loki.txt","UTF-8");
            for(i = 0; i<ajat.length;i++){
                testilkm++;
                String testiaika = tu.secToTime(ajat[i]);
                if(testiaika.equals(odtulok[i])){
                    testilapilkm++;
                    writer.println("Testi " + (i + 1) + " läpi. Testattiin arvolla " + ajat[i] + " odotettiin tulosta: " + odtulok[i] + " saatiin: " + testiaika + "\n");
                }else{
                  testifaillkm++;
                    writer.println("Testi " + (i + 1) + " FAIL. Testattiin arvolla " + ajat[i] + " odotettiin tulosta: " + odtulok[i] + " saatiin: " + testiaika + "\n");  
                }
            }
            writer.println();
            writer.println("Testejä suoritettu: " + testilkm + " kappaletta.");
            writer.println("Testejä läpi: " + testilapilkm);
            writer.println("Testejä fail: " + testifaillkm);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
