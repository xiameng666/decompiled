import java.util.Comparator;
import java.util.Map.Entry;

public final class anlu implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Integer.compare(((anmg)((Map.Entry)object1).getValue()).d, ((anmg)((Map.Entry)object0).getValue()).d);
        if(v != 0) {
            return v;
        }
        hfwn hfwn0 = ((anmg)((Map.Entry)object0).getValue()).e;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        hfwn hfwn1 = ((anmg)((Map.Entry)object1).getValue()).e;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        return hfym.a(hfwn0, hfwn1);
    }
}

