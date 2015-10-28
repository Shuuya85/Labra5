/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labra5;

/**
 *
 * @author miikahen
 */
public class Testipeti {
    
    public static void main(String[] args) {
        TimeUtils tu = new TimeUtils();
        int testilkm = 0;
        int testilapilkm = 0;
        int testifaillkm = 0;
        int ajat[] = {-1,0,1,32000,31999,60,59,3600,3599,600,32001};
        String odtulok[] = {"-1","0:00:00","0:00:01","8:53:20","8:53:19","0:01:00","0:00:59","1:00:00","0:59:59","0:10:00","8:53:21"};
        for (int i = 0;i<ajat.length;i++){
            testilkm++;
            String testiaika = tu.secToTime(ajat[i]);
            if(testiaika.equals(odtulok[i])){
                testilapilkm++;
                System.out.println("Testi " + (i +1)+ "PASS. Testattiin arvolla "+ajat[i]+" odotettiin tulosta: " +odtulok[i]+ " saatiin: "+ testiaika +"\n");
            }else{
                testifaillkm++;
                System.out.println("Testi " + (i +1)+ "FAIL. Testattiin arvolla "+ajat[i]+" odotettiin tulosta: " +odtulok[i]+ " saatiin: "+ testiaika +"\n");
            }
        }
        System.out.println("Testejä suoritettu: "+testilkm + "kappaletta.");
        System.out.println("Testejä läpi: "+testilapilkm);
        System.out.println("Testejä FAIL: "+testifaillkm);
    }
}
