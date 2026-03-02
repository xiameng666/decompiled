import android.net.Network;
import android.os.SystemClock;
import android.text.TextUtils;
import j..time.Instant;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jeb.synthetic.FIN;

public final class gprn {
    public final List a;
    public final int b;
    public final Network c;
    public final String[] d;
    private final List e;
    private gpsa f;
    private gpsp g;
    private final List h;
    private final List i;
    private final long j;

    public gprn(long v, String[] arr_s, int v1, Network network0) {
        this.j = v;
        this.a = new LinkedList();
        this.e = new LinkedList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.b = v1;
        this.c = network0;
        this.d = arr_s;
    }

    public gprn(gprn gprn0) {
        this.a = new ArrayList(gprn0.a);
        this.e = new ArrayList(gprn0.e);
        this.f = gprn0.f;
        this.g = gprn0.g;
        this.h = new ArrayList(gprn0.h);
        this.i = new ArrayList(gprn0.i);
        this.j = gprn0.j;
        this.d = gprn0.d;
        this.b = gprn0.b;
        this.c = gprn0.c;
    }

    public final long a(long v) {
        if(this.q()) {
            long v1 = this.f.d(v);
            return v1 >= 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : v1;
        }
        return 0x7FFFFFFFFFFFFFFFL;
    }

    public final gpsa b() {
        synchronized(this) {
        }
        return this.f;
    }

    public final gpsp c() {
        synchronized(this) {
        }
        return this.g;
    }

    public final String d() {
        return this.d.length <= 0 ? null : this.d[0];
    }

    public final List e() {
        List list0;
        synchronized(this) {
            list0 = DesugarCollections.unmodifiableList(this.h);
        }
        return list0;
    }

    public final List f() {
        List list0;
        synchronized(this) {
            list0 = DesugarCollections.unmodifiableList(this.i);
        }
        return list0;
    }

    public final List g() {
        List list0;
        synchronized(this) {
            list0 = new LinkedList(this.e);
        }
        return list0;
    }

    public final List h() {
        List list0;
        synchronized(this) {
            list0 = new LinkedList(this.a);
        }
        return list0;
    }

    public final List i() {
        List list0;
        synchronized(this) {
            list0 = null;
            for(Object object0: this.e) {
                gprj gprj0 = (gprj)object0;
                String s = gprj0.c() ? gprj0.c[0] : null;
                if(s != null) {
                    if(list0 == null) {
                        list0 = new LinkedList();
                    }
                    list0.add(s);
                }
            }
        }
        return list0;
    }

    final void j() {
        synchronized(this) {
            List list0 = this.h;
            for(Object object0: list0) {
                this.a.remove(((gpra)object0));
            }
            list0.clear();
        }
    }

    final void k() {
        synchronized(this) {
            List list0 = this.i;
            for(Object object0: list0) {
                this.a.remove(((gpra)object0));
            }
            list0.clear();
        }
    }

    public final boolean l(gpra gpra0) {
        boolean z;
        synchronized(this) {
            z = this.y(gpra0, this.h);
        }
        return z;
    }

    public final boolean m(gpra gpra0) {
        boolean z;
        synchronized(this) {
            z = this.y(gpra0, this.i);
        }
        return z;
    }

    public final boolean n(gprj gprj0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(gpqj.b(this.d, gprj0.a)) {
            boolean z = this.y(gprj0, this.e);
            FIN.finallyCodeBegin$NT(v);
            return z;
        }
        throw new IllegalArgumentException("Pointer records for different service names cannot be added");
    }

    public final boolean o() {
        synchronized(this) {
        }
        return !this.h.isEmpty();
    }

    public final boolean p() {
        synchronized(this) {
        }
        return !this.i.isEmpty();
    }

    public final boolean q() {
        synchronized(this) {
        }
        return this.f != null;
    }

    public final boolean r() {
        synchronized(this) {
        }
        return this.g != null;
    }

    public final boolean s() {
        boolean z = false;
        synchronized(this) {
            if(this.f != null && this.g != null) {
                if(!this.h.isEmpty()) {
                    z = true;
                }
                else if(!this.i.isEmpty()) {
                    return true;
                }
            }
        }
        return z;
    }

    public final boolean t() {
        synchronized(this) {
            if(this.d() != null) {
                for(Object object0: this.a) {
                    gprm gprm0 = (gprm)object0;
                    if((!(gprm0 instanceof gprj) || !((gprj)gprm0).c()) && gprm0.f == 0L) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final String toString() {
        String s = TextUtils.join(".", this.d);
        String s1 = String.valueOf(this.f);
        String s2 = String.valueOf(this.g);
        String s3 = String.valueOf(Instant.now().minusMillis(SystemClock.elapsedRealtime() - this.j));
        return "Name: " + s + ", pointerRecords: " + this.e.toString() + ", serviceRecord: " + s1 + ", textRecord: " + s2 + ", inet4AddressRecords: " + this.h.toString() + ", inet6AddressRecords: " + this.i.toString() + ", interfaceIndex: " + this.b + ", network: " + this.c + ", lastUpdateTime: " + s3;
    }

    public final boolean u(gpsa gpsa0) {
        boolean z;
        synchronized(this) {
            z = gprn.x(this.f, gpsa0);
            gpsa gpsa1 = this.f;
            if(gpsa1 != null) {
                this.a.remove(gpsa1);
            }
            this.f = gpsa0;
            if(gpsa0 != null) {
                this.a.add(gpsa0);
            }
        }
        return !z;
    }

    public final boolean v(gpsp gpsp0) {
        boolean z;
        synchronized(this) {
            z = gprn.x(this.g, gpsp0);
            gpsp gpsp1 = this.g;
            if(gpsp1 != null) {
                this.a.remove(gpsp1);
            }
            this.g = gpsp0;
            if(gpsp0 != null) {
                this.a.add(gpsp0);
            }
        }
        return !z;
    }

    public final void w() {
        synchronized(this) {
            if(this.f != null) {
                int v1 = 0;
                for(Object object0: this.e()) {
                    v1 |= gpqj.b(this.f.b, ((gpra)object0).c) ^ 1;
                }
                for(Object object1: this.f()) {
                    v1 |= gpqj.b(this.f.b, ((gpra)object1).c) ^ 1;
                }
                if(v1 != 0) {
                    this.j();
                    this.k();
                }
            }
        }
    }

    public static final boolean x(gprm gprm0, gprm gprm1) {
        return Objects.equals(gprm0, gprm1) ? gprm0 == null || gprm0.f == gprm1.f : false;
    }

    private final boolean y(gprm gprm0, List list0) {
        boolean z;
        int v = list0.indexOf(gprm0);
        if(v >= 0) {
            z = gprn.x(gprm0, ((gprm)list0.get(v)));
            gprm gprm1 = (gprm)list0.remove(v);
            this.a.remove(gprm1);
        }
        else {
            z = false;
        }
        list0.add(gprm0);
        this.a.add(gprm0);
        return !z;
    }
}

