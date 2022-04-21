package FilEksempler;

import java.util.ArrayList;

/**
 * Regnemaskineklasse
 * Udviklet d. 21/2-20222
 */

public class Regnemaskine {
    public ArrayList<Integer> tabel=new ArrayList<>();



    public int sum(int a, int b){
        return a+b;
    }



    public boolean strengeens(String s1,String s2){
        if(s1==s2)
            return true;
        else
            return false;
    }

    /**
     * @param a
     * @param b
     * @return
     */

    public int mindst(int a, int b){
        if(a<b)
            return a;
        else
            return b;
}


    public void indsaet(Integer a){
        tabel.add(a);
    }

}
