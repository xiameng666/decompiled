import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public final class fl implements fh {
    final fm a;
    private final String b;

    public fl(fm fm0, String s) {
        this.a = fm0;
        super();
        this.b = s;
    }

    @Override  // fh
    public final boolean k(ArrayList arrayList0, ArrayList arrayList1) {
        String s1;
        int v5;
        fm fm0 = this.a;
        String s = this.b;
        int v = fm0.a(s, -1, true);
        if(v < 0) {
            return false;
        }
        for(int v1 = v; v1 < fm0.c.size(); ++v1) {
            ca ca0 = (ca)fm0.c.get(v1);
            if(!ca0.t) {
                fm0.ai(new IllegalArgumentException("saveBackStack(\"" + s + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + ca0 + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet0 = new HashSet();
        for(int v2 = v; v2 < fm0.c.size(); ++v2) {
            ca ca1 = (ca)fm0.c.get(v2);
            HashSet hashSet1 = new HashSet();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = ca1.e;
            int v3 = arrayList2.size();
            int v4 = 0;
            while(v4 < v3) {
                fy fy0 = (fy)arrayList2.get(v4);
                du du0 = fy0.b;
                if(du0 == null) {
                    v5 = v2;
                }
                else {
                    if(fy0.c) {
                        v5 = v2;
                        if(fy0.a == 1 || fy0.a == 2 || fy0.a == 8) {
                            hashSet0.add(du0);
                            hashSet1.add(du0);
                        }
                    }
                    else {
                        v5 = v2;
                        hashSet0.add(du0);
                        hashSet1.add(du0);
                    }
                    if(fy0.a == 1 || fy0.a == 2) {
                        hashSet2.add(du0);
                    }
                }
                ++v4;
                v2 = v5;
            }
            hashSet1.removeAll(hashSet2);
            if(!hashSet1.isEmpty()) {
                StringBuilder stringBuilder0 = new StringBuilder("saveBackStack(\"");
                stringBuilder0.append(s);
                stringBuilder0.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if(hashSet1.size() == 1) {
                    Object object0 = hashSet1.iterator().next();
                    Objects.toString(object0);
                    s1 = " " + object0;
                }
                else {
                    s1 = "s " + hashSet1.toString();
                }
                stringBuilder0.append(s1);
                stringBuilder0.append(" in ");
                stringBuilder0.append(ca1);
                stringBuilder0.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                fm0.ai(new IllegalArgumentException(stringBuilder0.toString()));
            }
        }
        ArrayDeque arrayDeque0 = new ArrayDeque(hashSet0);
        while(!arrayDeque0.isEmpty()) {
            du du1 = (du)arrayDeque0.removeFirst();
            if(du1.J) {
                fm0.ai(new IllegalArgumentException("saveBackStack(\"" + s + "\") must not contain retained fragments. Found " + (hashSet0.contains(du1) ? "direct reference to retained " : "retained child ") + "fragment " + du1));
            }
            for(Object object1: du1.C.b.f()) {
                du du2 = (du)object1;
                if(du2 != null) {
                    arrayDeque0.addLast(du2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object2: hashSet0) {
            arrayList3.add(((du)object2).k);
        }
        ArrayList arrayList4 = new ArrayList(fm0.c.size() - v);
        for(int v6 = v; v6 < fm0.c.size(); ++v6) {
            arrayList4.add(null);
        }
        BackStackState backStackState0 = new BackStackState(arrayList3, arrayList4);
        for(int v7 = fm0.c.size() - 1; v7 >= v; --v7) {
            ca ca2 = (ca)fm0.c.remove(v7);
            ca ca3 = new ca(ca2);
            ca3.e();
            arrayList4.set(v7 - v, new BackStackRecordState(ca3));
            ca2.d = true;
            arrayList0.add(ca2);
            arrayList1.add(Boolean.valueOf(true));
        }
        fm0.j.put(s, backStackState0);
        return true;
    }
}

