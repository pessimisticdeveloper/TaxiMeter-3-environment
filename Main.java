import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double tutar;
    int minTutar = 20;
    int acilisUcret = 10;
    double km = 2.20;

    System.out.println("HOŞ GELDİNİZ.");
    System.out.println("NEREYE GİDECEKSİNİZ ? (KM): ");
    int kac_km = input.nextInt();

    if (kac_km <= 0){
      System.out.println("Yolculuk İptal Edildi! Teşekkürler..");
      
    }else if (kac_km <10){
      System.out.println("Ödenecek Tutar : "+ minTutar+"₺");
      System.out.println("Yolculuk Sona Erdi, İyi Günler Dileriz.");
    }else if (kac_km > 10){
      tutar = (kac_km * km) + acilisUcret;
      System.out.println("Ödenecek Tutar : "+ tutar+"₺");
      System.out.println("Yolculuk Sona Erdi, İyi Günler Dileriz.");
    }else{
      System.out.println("Yolculuk İptal Edildi! Teşekkürler..");
    }  
  }
}