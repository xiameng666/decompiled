import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

final class fx {
    public final ArrayList a;
    public final HashMap b;
    public final HashMap c;
    public fp d;

    public fx() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    final Bundle a(String s, Bundle bundle0) {
        return bundle0 == null ? ((Bundle)this.c.remove(s)) : ((Bundle)this.c.put(s, bundle0));
    }

    final du b(String s) {
        fv fv0 = (fv)this.b.get(s);
        return fv0 == null ? null : fv0.a;
    }

    final du c(String s) {
        for(Object object0: this.b.values()) {
            fv fv0 = (fv)object0;
            if(fv0 != null) {
                du du0 = s.equals(fv0.a.k) ? fv0.a : fv0.a.C.b.c(s);
                if(du0 != null) {
                    return du0;
                }
            }
        }
        return null;
    }

    final fv d(String s) {
        return (fv)this.b.get(s);
    }

    final List e() {
        List list0 = new ArrayList();
        for(Object object0: this.b.values()) {
            fv fv0 = (fv)object0;
            if(fv0 != null) {
                ((ArrayList)list0).add(fv0);
            }
        }
        return list0;
    }

    final List f() {
        List list0 = new ArrayList();
        for(Object object0: this.b.values()) {
            fv fv0 = (fv)object0;
            if(fv0 == null) {
                ((ArrayList)list0).add(null);
            }
            else {
                ((ArrayList)list0).add(fv0.a);
            }
        }
        return list0;
    }

    final List g() {
        ArrayList arrayList0 = this.a;
        return arrayList0.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(arrayList0);
    }

    final void h(du du0) {
        ArrayList arrayList0 = this.a;
        if(!arrayList0.contains(du0)) {
            synchronized(arrayList0) {
                arrayList0.add(du0);
            }
            du0.q = true;
            return;
        }
        Objects.toString(du0);
        throw new IllegalStateException("Fragment already added: " + du0);
    }

    final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void j(fv fv0) {
        du du0 = fv0.a;
        if(!this.m(du0.k)) {
            this.b.put(du0.k, fv0);
            if(du0.K) {
                if(du0.J) {
                    this.d.a(du0);
                }
                else {
                    this.d.e(du0);
                }
                du0.K = false;
            }
            if(fm.ar(2)) {
                Objects.toString(du0);
            }
        }
    }

    final void k(fv fv0) {
        du du0 = fv0.a;
        if(du0.J) {
            this.d.e(du0);
        }
        if(this.b.get(du0.k) == fv0 && ((fv)this.b.put(du0.k, null)) != null && fm.ar(2)) {
            Objects.toString(du0);
        }
    }

    final void l(du du0) {
        synchronized(this.a) {
            this.a.remove(du0);
        }
        du0.q = false;
    }

    final boolean m(String s) {
        return this.b.get(s) != null;
    }
}

