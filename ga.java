import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class ga {
    public static final gi a;
    public static final gi b;

    static {
        ga.a = new gg();
        gi gi0 = null;
        try {
            ibuq.d(FragmentTransitionSupport.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            gi0 = new FragmentTransitionSupport();
        }
        catch(Exception unused_ex) {
        }
        ga.b = gi0;
    }

    public static final void a(du du0, du du1, boolean z, bxd bxd0, boolean z1) {
        ibuq.f(du0, "inFragment");
        ibuq.f(du1, "outFragment");
        if((z ? du1.iV() : du0.iV()) != null) {
            ArrayList arrayList0 = new ArrayList(bxd0.d_num);
            for(Object object0: bxd0.entrySet()) {
                arrayList0.add(((View)((Map.Entry)object0).getValue()));
            }
            ArrayList arrayList1 = new ArrayList(bxd0.d_num);
            for(Object object1: bxd0.entrySet()) {
                arrayList1.add(((String)((Map.Entry)object1).getKey()));
            }
            throw null;
        }
    }

    public static final void b(List list0, int v) {
        ibuq.f(list0, "views");
        for(Object object0: list0) {
            ((View)object0).setVisibility(v);
        }
    }
}

