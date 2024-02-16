public class Main {
    public static void main(String[] args) {

        String textua = args[0];

        char karakter =' ';
        boolean p = false;
        int zenbat =0;

        for (int i =0;i<textua.length()-1;i++){

            /*karakter = textua.charAt(i);

            if (karakter =='p'){
                p = true;
            } else if (karakter=='a'&&p){
                zenbat++;
                p = false;
            }else {
                p = false;
            }*/

            //System.out.println(textua.substring(i,i+2));
            if (textua.substring(i,i+2).equals("pa")){
                zenbat++;
            }

        }

        System.out.println(textua);
        System.out.println(zenbat);


    }
}