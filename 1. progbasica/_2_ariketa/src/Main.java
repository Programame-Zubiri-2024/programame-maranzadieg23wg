public class Main {
    public static void main(String[] args) {


        int data1 = 5041980;
        int data2 = 19122052;


        if (data1<data2){
            int temp = data1;
            data1 = data2;
            data2 = temp;
        }



        String dat1 = data1+"";
        String dat2 = data2+"";

        if (dat1.length() < 8) {
            dat1 = "0" + dat1;
        }
        if (dat2.length() < 8) {
            dat2 = "0" + dat2;
        }


        String[] egunak = {dat1.substring(0, 2), dat2.substring(0, 2)};
        String[] hilabeteak = {dat1.substring(2, 4), dat2.substring(2, 4)};
        String[] urteak = {dat1.substring(4, 8), dat2.substring(4, 8)};

        int egunDiferentzia = (Integer.parseInt(egunak[0])+egunak(hilabeteak[0])+urteak(urteak[0])) -  (Integer.parseInt(egunak[1])+egunak(hilabeteak[1])+urteak(urteak[1]));
        System.out.println(egunDiferentzia);



    }

    public static int egunak(String hilabetea){

        int hilabetea1 = Integer.parseInt(hilabetea);


        int[] egunKop = {31,28,31,30,31,30,31,31,30,31,30,31};

        int egunak =0;

        for (int i=0;i<hilabetea1;i++){
            egunak+= egunKop[i];
        }


        return egunak;

    }

    public static int urteak(String urtea){
        int urte =Integer.parseInt(urtea);

        urte*=365;

        if (bisiesto(urtea)){
            urte++;
        }
        //System.out.println(urte);
        return urte;
    }
    public static boolean bisiesto(String urtea) {
        int z = Integer.parseInt(urtea);
        if (urtea.substring(2, 4).equals("00") && z % 400 == 0) {
            return true;
        } else if (z % 4 == 0 && !urtea.substring(2, 4).equals("00")) {
            return true;
        } else {
            return false;
        }
    }

}