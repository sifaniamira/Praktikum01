public class program_kalkulator {

    public static void main(String[] args) {

        int Angka1  = Integer.parseInt(args[0]);
        int Angka2  = Integer.parseInt(args[1]);
        String operator = args[2];
        System.out.println("Hasil :" + hasil(Angka1,Angka2,operator));
    }

    static int hasil(int x,int y, String n) {
        switch (n) {
            case "1":
                return x+y;

            case "2":
                return x-y;

            case "3":
                return x*y;

            default:
                System.out.println("Tolong masukkan operator yang tepat");
                return 0;
        }
    }
}