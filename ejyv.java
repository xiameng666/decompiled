import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class ejyv {
    public final Map a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public List f;
    public final ekaq g;
    private static ejyv h;
    private final List i;
    private final Map j;
    private bxox k;

    static {
        bboh.b("CBR_RestorePrefUtils", bbcu.bN);
    }

    public ejyv(ekaq ekaq0) {
        this.i = new ArrayList();
        int[] arr_v = gith.c();
        int v = 0;
        while(v < 10) {
            int v1 = arr_v[v];
            List list0 = this.i;
            String s = gith.a(v1);
            if(v1 == 0) {
                throw null;
            }
            list0.add(s);
            ++v;
            continue;
        }
        this.j = new HashMap();
        this.a = new HashMap();
        this.g = ekaq0;
    }

    public final void A(int v) {
        ekaq.e(this.g.b.b(new ekaj(v), gmap.a));
    }

    public final boolean B() {
        try {
            return ((Boolean)((glyq)glzd.f(this.g.b.a(), new ekag(), gmap.a)).u()).booleanValue();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return false;
        }
    }

    public final boolean C(String s) {
        return this.a.get(s) != null;
    }

    public final boolean D(String s) {
        return this.j.containsKey(s);
    }

    public final int a(String s) {
        return (int)(((Integer)this.a.get(s)));
    }

    public final int b() {
        try {
            return (int)(((Integer)((glyq)glzd.f(this.g.b.a(), new ekab(), gmap.a)).u()));
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return 0;
        }
    }

    public final bxox c() {
        if(this.k == null) {
            this.k = new bxox();
        }
        return this.k;
    }

    public static ejyv d(Context context0) {
        synchronized(ejyv.class) {
            if(ejyv.h == null) {
                ejyv.h = new ejyv(ekar.a(context0));
            }
        }
        return ejyv.h;
    }

    public final ejyy e(String s) {
        return (ejyy)this.j.get(s);
    }

    public final Long f(String s, String s1) {
        ejxm ejxm0;
        try {
            for(Object object0: ((List)((glyq)glzd.f(this.g.b.a(), new ejzk(), this.g.a)).u())) {
                ejxm0 = (ejxm)object0;
                if(!ejxm0.c.equals(s) || !ejxm0.d.equals(s1)) {
                    continue;
                }
                return (long)ejxm0.e;
            }
            return (long)0L;
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return (long)0L;
        }
        return (long)ejxm0.e;
    }

    public final String g() {
        try {
            return (String)((glyq)glzd.f(this.g.b.a(), new ekai(), gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return "";
        }
    }

    public final String h() {
        try {
            return (String)((glyq)glzd.f(this.g.b.a(), new ejzn(), gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return "";
        }
    }

    public final String i() {
        try {
            return (String)((glyq)glzd.f(this.g.b.a(), new ekal(), gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return "";
        }
    }

    public final String j() {
        try {
            return (String)((glyq)glzd.f(this.g.b.a(), new ekak(), gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return "";
        }
    }

    public final String k() {
        try {
            return (String)((glyq)glzd.f(this.g.b.a(), new ejzl(), gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return "";
        }
    }

    public final Set l() {
        try {
            List list0 = (List)((glyq)glzd.f(this.g.b.a(), new ejzz(), gmap.a)).u();
            return list0 == null ? null : ggog.g(list0);
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return null;
        }
    }

    public final Set m() {
        Set set0 = new HashSet();
        try {
            set0.addAll(((Collection)((glyq)glzd.f(this.g.b.a(), new ejzi(), gmap.a)).u()));
        }
        catch(InterruptedException | ExecutionException unused_ex) {
        }
        return set0;
    }

    public final Set n() {
        try {
            return new HashSet(((Collection)((glyq)glzd.f(this.g.b.a(), new ejzs(), gmap.a)).u()));
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return ggnj.a;
        }
    }

    public final void o(String s, ejyy ejyy0) {
        this.j.put(s, ejyy0);
    }

    public final void p() {
        this.g.b.b(new ejzm(), gmap.a);
    }

    public final void q() {
        this.j.clear();
    }

    public final void r(boolean z) {
        ekaq.e(this.g.b.b(new ekaa(Boolean.valueOf(z)), gmap.a));
    }

    public final void s(Set set0) {
        ekaq.e(this.g.b.b(new ekan(set0), gmap.a));
    }

    public final void t(String s) {
        ekaq.e(this.g.b.b(new ejzw(s), gmap.a));
    }

    public final void u(String s) {
        ekaq.e(this.g.b.b(new ekao(s), gmap.a));
    }

    public final void v(String s) {
        if(!this.i.contains(s)) {
            s = "UNKNOWN_ENTRY_POINT";
        }
        ekaq.e(this.g.b.b(new ejzj(s), gmap.a));
    }

    public final void w(List list0) {
        this.f = gged_interceptors.i(list0);
    }

    public final void x(String[] arr_s) {
        HashSet hashSet0 = new HashSet();
        Collections.addAll(hashSet0, arr_s);
        ekaq.e(this.g.b.b(new ejzg(hashSet0), gmap.a));
    }

    public final void y(String s) {
        ekaq.e(this.g.b.b(new ekap(s), gmap.a));
    }

    public final void z(String s) {
        ekaq.e(this.g.b.b(new ejzp(s), gmap.a));
    }
}

