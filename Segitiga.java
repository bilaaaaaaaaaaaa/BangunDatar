
public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;
    
     @Override
    float luas() {
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga \t \t : " + luas);
        return luas;
    }   
    
}
