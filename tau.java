import java.util.Iterator;
import java.util.LinkedList;

public class tau implements tat {
    protected szf a;

    public tau() {
        this.a = null;
        this.a = new szf();
    }

    public tau(byte[] arr_b) {
        this.a = null;
        this.a = sze.c(arr_b);
    }

    @Override  // tat
    public final boolean a(byte[] arr_b) {
        return tav.b(this.a, arr_b);
    }

    @Override  // tat
    public final byte[] b(byte[] arr_b) {
        return tav.d(this.a, arr_b);
    }

    public final void c(tak tak0) {
        byte[] arr_b = tak0.a.b;
        szf szf0 = this.a;
        szg szg0 = szf0.c(new szi(arr_b));
        if(szg0 == null) {
            szf0.e(sze.b(arr_b, tak0.f()));
            return;
        }
        szg0.b(tak0.f());
    }

    public final byte[] d() {
        return this.a.a();
    }

    public final void e(szf szf0) {
        szf szf1 = this.a;
        Iterator iterator0 = szf0.iterator();
        LinkedList linkedList0 = new LinkedList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            szg szg0 = (szg)object0;
            szg szg1 = szf1.b(szg0.a);
            if(szg1 == null) {
                linkedList0.add(szg0.f());
            }
            else {
                szg1.h(szg0);
            }
        }
        for(Object object1: linkedList0) {
            szf1.e(((szg)object1));
        }
    }

    public final byte[] f(szi szi0) {
        return tav.c(this.a, szi0);
    }

    public tdc g() {
        return this.a(tdc.c) ? new tdc(this.b(tdc.c)) : null;
    }

    public tdd h() {
        return this.a(tdd.c) ? new tdd(this.b(tdd.c)) : null;
    }

    public tdk i() {
        return this.a(tdk.d) ? new tdk(this.b(tdk.d)) : null;
    }

    public final tdm j() {
        return this.a(tdm.c) ? new tdm(this.b(tdm.c)) : null;
    }

    public final tdn k() {
        return this.a(tdn.c) ? new tdn(this.b(tdn.c)) : null;
    }

    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}

