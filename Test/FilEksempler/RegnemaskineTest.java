package FilEksempler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class RegnemaskineTest {

    @Test
    public void sum() {
        Regnemaskine rm=new Regnemaskine();
        int res=rm.sum(3,5);
        assertEquals(8,res);
    }

    @Test
    public void strengeens() {
        Regnemaskine rm=new Regnemaskine();
        boolean ens=rm.strengeens("Anne","");
        assertEquals(false,ens);
    }

    @Test
    public void indsaet() {
        Regnemaskine rm=new Regnemaskine();
        rm.indsaet(5);
        rm.indsaet(6);
        assertEquals(2,rm.tabel.size());
    }

    @Test
    public void mindst() {
        Regnemaskine rm=new Regnemaskine();
        int res=rm.mindst(2,4);
        assertEquals(2,res);
    }


    @Test
    public void mindst1() {
        Regnemaskine rm=new Regnemaskine();
        int res=rm.mindst(2,2);
        assertEquals(2,res);
    }


    @Test
    public void mindst2() {
        Regnemaskine rm=new Regnemaskine();
        int res=rm.mindst(5,4);
        assertEquals(4,res);
    }
}