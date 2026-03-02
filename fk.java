import android.os.Bundle;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentState;
import java.util.ArrayList;
import java.util.HashMap;

public final class fk implements fh {
    final fm a;
    private final String b;

    public fk(fm fm0, String s) {
        this.a = fm0;
        super();
        this.b = s;
    }

    @Override  // fh
    public final boolean k(ArrayList arrayList0, ArrayList arrayList1) {
        fm fm0 = this.a;
        BackStackState backStackState0 = (BackStackState)fm0.j.remove(this.b);
        boolean z = false;
        if(backStackState0 == null) {
            return false;
        }
        HashMap hashMap0 = new HashMap();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ca ca0 = (ca)arrayList0.get(v1);
            if(ca0.d) {
                ArrayList arrayList2 = ca0.e;
                int v2 = arrayList2.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    du du0 = ((fy)arrayList2.get(v3)).b;
                    if(du0 != null) {
                        hashMap0.put(du0.k, du0);
                    }
                }
            }
        }
        HashMap hashMap1 = new HashMap(backStackState0.a.size());
        for(Object object0: backStackState0.a) {
            String s = (String)object0;
            du du1 = (du)hashMap0.get(s);
            if(du1 == null) {
                Bundle bundle0 = fm0.b.a(s, null);
                if(bundle0 == null) {
                    continue;
                }
                ClassLoader classLoader0 = fm0.q.c.getClassLoader();
                du du2 = ((FragmentState)bundle0.getParcelable("state")).a(fm0.l());
                du2.g = bundle0;
                if(du2.g.getBundle("savedInstanceState") == null) {
                    du2.g.putBundle("savedInstanceState", new Bundle());
                }
                Bundle bundle1 = bundle0.getBundle("arguments");
                if(bundle1 != null) {
                    bundle1.setClassLoader(classLoader0);
                }
                du2.setArguments(bundle1);
                hashMap1.put(du2.k, du2);
            }
            else {
                hashMap1.put(du1.k, du1);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object1: backStackState0.b) {
            BackStackRecordState backStackRecordState0 = (BackStackRecordState)object1;
            ca ca1 = new ca(fm0);
            backStackRecordState0.a(ca1);
            for(int v4 = 0; true; ++v4) {
                ArrayList arrayList4 = backStackRecordState0.b;
                if(v4 >= arrayList4.size()) {
                    break;
                }
                String s1 = (String)arrayList4.get(v4);
                if(s1 != null) {
                    du du3 = (du)hashMap1.get(s1);
                    if(du3 == null) {
                        throw new IllegalStateException("Restoring FragmentTransaction " + backStackRecordState0.f + " failed due to missing saved state for Fragment (" + s1 + ")");
                    }
                    ((fy)ca1.e.get(v4)).b = du3;
                    continue;
                }
            }
            arrayList3.add(ca1);
        }
        for(Object object2: arrayList3) {
            ((ca)object2).k(arrayList0, arrayList1);
            z = true;
        }
        return z;
    }
}

