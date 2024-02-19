import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        String testua = "Aupag";

        testua = testua.toLowerCase();

        HashMap<String, Integer> lista = new HashMap<String, Integer>();
        lista.put(" ",0);

        for (int i =0;i<testua.length();i++){
            lista =gehitu(testua.charAt(i), lista);
        }

        gehienDagoena(lista);

    }

    public static HashMap<String, Integer> gehitu(char i, HashMap<String, Integer> lista){
        String proba = String.valueOf(i);
        if (lista.containsKey(proba)){
            int zenbat = lista.get(proba);
            zenbat++;
            lista.put(String.valueOf(i),zenbat);
        }else {
            lista.put(String.valueOf(i), 1);
        }
        return lista;
    }

    public static void gehienDagoena(HashMap<String, Integer> lista){
        String max = " ";
        for (String karaktere: lista.keySet()){
            if (lista.get(max)<lista.get(karaktere)){
                max = karaktere;
            }
        }

        System.out.println(max+": "+lista.get(max));

    }
}