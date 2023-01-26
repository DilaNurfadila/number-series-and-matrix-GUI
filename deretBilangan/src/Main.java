//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int nilaiAwal, kolom, limit;
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Masukan nilai awal : ");
//        nilaiAwal = input.nextInt();
//        System.out.print("Masukan kolom ke berapa : ");
//        kolom = input.nextInt();
//        System.out.print("Masukan nilai akhir : ");
//        limit = input.nextInt();
//
//        if (kolom == 1) {
//            for (int i = nilaiAwal; i <= limit; i+=kolom) {
//                System.out.println(i);
//            }
//        }
//        else if (kolom == 2) {
//            for (int i = nilaiAwal; i < limit; i+=kolom) {
//                System.out.println(i);
//            }
//        } else if (kolom == 3) {
//            for (int i = nilaiAwal; i < limit; i+=kolom) {
//                System.out.println(i);
//            }
//        } else if (kolom == 4) {
//            for (int i = nilaiAwal; i <= limit; i+=kolom) {
//                System.out.println(i);
//            }
//        } else if (kolom == 5) {
//            for (int i = nilaiAwal; i <= limit; i+=kolom) {
//                System.out.println(i);
//            }
//        }

//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                if(j == 0){
//                    System.out.print(i+4+" ");
//                    System.out.print((i+1)*2+" ");
//                    System.out.print((i+1)*3+" ");
//                    System.out.print((i+2.5)*4+" ");
//                    System.out.print((i+2.4)*5+" ");
//                }
//            }
//            System.out.println();
//        }


        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    System.out.print(i+3+ "\t");
                }
                if (j == 2) {
                    System.out.print(i*2+ "\t");
                }
                if (j == 3) {
                    System.out.print(i*3+1+ "\t");
                }
                if (j == 4) {
                    System.out.print(i*4+6+ "\t");
                }
                if (j == 5) {
                    System.out.print(i*5+7+ "\t");
                }
            }
            System.out.println();
        }
    }
}