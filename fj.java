import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

final class fj implements fh {
    final fm a;

    public fj(fm fm0) {
        this.a = fm0;
        super();
    }

    @Override  // fh
    public final boolean k(ArrayList arrayList0, ArrayList arrayList1) {
        boolean z;
        ArrayList arrayList3;
        ArrayList arrayList2;
        fm fm0 = this.a;
        if(fm.ar(2)) {
            Objects.toString(fm0.a);
        }
        if(fm0.c.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList2 = arrayList0;
            arrayList3 = arrayList1;
            z = false;
        }
        else {
            fm0.f = (ca)fm0.c.get(fm0.c.size() - 1);
            ArrayList arrayList4 = fm0.f.e;
            int v1 = arrayList4.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                du du0 = ((fy)arrayList4.get(v2)).b;
                if(du0 != null) {
                    du0.s = true;
                }
            }
            arrayList2 = arrayList0;
            arrayList3 = arrayList1;
            z = fm0.ay(arrayList2, arrayList3, null, -1, 0);
        }
        if(!fm0.m.isEmpty() && arrayList2.size() > 0) {
            boolean z1 = ((Boolean)arrayList3.get(arrayList2.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            int v3 = arrayList2.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                linkedHashSet0.addAll(fm.aB(((ca)arrayList2.get(v4))));
            }
            ArrayList arrayList5 = fm0.m;
            int v5 = arrayList5.size();
            for(int v = 0; v < v5; ++v) {
                fg fg0 = (fg)arrayList5.get(v);
                for(Object object0: linkedHashSet0) {
                    fg0.c(((du)object0), z1);
                }
            }
        }
        return z;
    }
}

