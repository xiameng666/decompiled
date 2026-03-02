import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class afs {
    public List a;
    public List b;
    private final String c;
    private final String d;
    private afa e;
    private double f;
    private Bundle g;
    private List h;
    private boolean i;

    public afs(afx afx0) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.g = new Bundle();
        this.h = new ArrayList();
        this.i = false;
        this.c = afx0.c;
        this.d = afx0.d;
        this.e = afx0.a();
        this.f = afx0.e;
        this.b = new ArrayList(afx0.g);
        Set set0 = afx0.h.keySet();
        bxd bxd0 = new bxd(set0.size());
        for(Object object0: set0) {
            String s = (String)object0;
            ArrayList arrayList0 = afx0.h.getStringArrayList(s);
            if(arrayList0 != null) {
                bxd0.put(s, arrayList0);
            }
        }
        this.f(bxd0);
        List list0 = afx0.b();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.d(new aft(((afu)list0.get(v1))).a());
        }
        List list1 = afx0.f;
        for(int v = 0; v < list1.size(); ++v) {
            this.c(((afx)list1.get(v)));
        }
    }

    public afs(String s, String s1) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.g = new Bundle();
        this.h = new ArrayList();
        this.i = false;
        kay.i(s);
        this.c = s;
        kay.i(s1);
        this.d = s1;
    }

    public final afx a() {
        this.i = true;
        return new afx(this.e.a, this.a, this.c, this.d, this.f, this.h, this.b, this.g);
    }

    public final void b() {
        if(this.i) {
            this.a = new ArrayList(this.a);
            this.h = new ArrayList(this.h);
            this.b = new ArrayList(this.b);
            this.g = ajy.a(this.g);
            this.i = false;
        }
    }

    public final void c(afx afx0) {
        this.b();
        this.h.add(afx0);
    }

    public final void d(afu afu0) {
        kay.d(afu0.e == null, "This MatchInfo is already associated with a SearchResult and can\'t be reassigned");
        this.b();
        this.a.add(afu0);
    }

    public final void e(afa afa0) {
        this.b();
        this.e = afa0;
    }

    public final void f(Map map0) {
        kay.i(map0);
        this.b();
        this.g.clear();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            kay.i(((String)map$Entry0.getKey()));
            kay.i(((List)map$Entry0.getValue()));
            ArrayList arrayList0 = new ArrayList(((List)map$Entry0.getValue()).size());
            for(int v = 0; v < ((List)map$Entry0.getValue()).size(); ++v) {
                String s = (String)((List)map$Entry0.getValue()).get(v);
                kay.i(s);
                arrayList0.add(s);
            }
            this.g.putStringArrayList(((String)map$Entry0.getKey()), arrayList0);
        }
    }

    public final void g(double f) {
        this.b();
        this.f = f;
    }
}

