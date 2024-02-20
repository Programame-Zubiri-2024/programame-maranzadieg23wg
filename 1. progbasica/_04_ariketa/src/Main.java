public class Main {
    public static void main(String[] args) {

        int zen1 = 50;
        int zen2 = zen1*2;

        boolean lehenak = false;

        for (int i =zen1;i<zen2;i++){
            if (zenLehena(i)){
                lehenak = true;
                //System.out.println(i);
            }
        }

        System.out.println(lehenak);



    }

    public static boolean zenLehena (int zenbakia){


        for (int i=2;i<zenbakia;i++){
            if (zenbakia%i == 0){
                return false;
            }
        }

        return true;

    }
}