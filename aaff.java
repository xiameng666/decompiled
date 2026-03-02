import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class aaff extends aaeo {
    public aaff(Context context0, List list0, aacf aacf0, zem zem0) {
        super(context0, aaff.G(list0), aacf0, zem0);
    }

    public static List G(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            gryj gryj0 = (gryj)object0;
            if((gryj0.b & 1) != 0) {
                ((ArrayList)list1).add(new aafd(gryj0.c));
            }
            for(Object object1: gryj0.d) {
                ((ArrayList)list1).add(new aafb(((gryi)object1)));
            }
            if((gryj0.b & 2) != 0) {
                ((ArrayList)list1).add(new aaez((gryj0.e == null ? gryi.a : gryj0.e)));
            }
        }
        return list1;
    }

    @Override  // tk
    public final int dx(int v) {
        int v1 = ((aaem)this.g.get(v)).a();
        return v1 == 5 || v1 == 11 || v1 == 12 ? v1 - 1 : 0;
    }

    @Override  // aaeo
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.i);
        if(v == aael.a(5)) {
            return new aafc(this, layoutInflater0.inflate(0x7F0E00E1, viewGroup0, false));  // layout:as_search_item
        }
        if(v == aael.a(11)) {
            return new aafe(layoutInflater0.inflate(0x7F0E00E4, viewGroup0, false));  // layout:as_search_section_title
        }
        return v == aael.a(12) ? new aafa(this, layoutInflater0.inflate(0x7F0E00E0, viewGroup0, false)) : new aaet(LayoutInflater.from(this.i).inflate(0x7F0E00D1, viewGroup0, false), this.j);  // layout:as_search_fallback_item
    }
}

