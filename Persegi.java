
// package com.mycompany.BangunDatar;
    
    public class Persegi extends BangunDatar {
    float sisi; 
    
    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi \t \t : " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi \t : " + keliling);
        return keliling;
    }
    }
    

