
package com.inteliger.portfel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Voltrix
 */
public class ProgramContent {
    
    public ProgramContent(){
    }
    
    int nrPensji;
    int nrParagonu;
    private final String filePath = "C:\\Users\\48602\\Desktop";
    private final String filePathModuleWallet = "C:\\Users\\48602\\Desktop\\moduleWallet.txt";
    private final String filePathModuleShop = "C:\\Users\\48602\\Desktop\\moduleShop.txt";
    
    public int getNrParagonu() throws FileNotFoundException{
        Scanner odczyt = new Scanner(new File(filePath, "moduleShop.txt"));
        nrParagonu = odczyt.nextInt();
        odczyt.close();
        return nrParagonu;
    }
    void setShopNumber() throws IOException{
        int kolejnyNumer = nrParagonu+1;
        int setNumer = 1;
        
        FileWriter zapis = new FileWriter(filePathModuleShop);
        BufferedWriter z = new BufferedWriter(zapis);
        
        z.write(Integer.toString(kolejnyNumer));
        z.close();
    }
    
    public int getNrPensji() throws FileNotFoundException{
        Scanner odczyt = new Scanner(new File(filePath, "moduleWallet.txt"));
        nrPensji = odczyt.nextInt();
        odczyt.close();
        return nrPensji;
    }
    void setModuleNumber() throws IOException{
        int kolejnyNumber = nrPensji+1;
        
        FileWriter zapis = new FileWriter(filePathModuleWallet);
        BufferedWriter z = new BufferedWriter(zapis);
        
        z.write(Integer.toString(kolejnyNumber));
        z.close();
    }
}