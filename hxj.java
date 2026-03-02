import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

public final class hxj extends hfb implements hwo, ijc, jks {
    public Object a;
    public Object b;
    public PointerInputEventHandler c;
    public hvt d;
    public final gwq e;
    public final Object f;
    public long g;
    private iced h;
    private final gwq i;
    private hvt j;

    public hxj(Object object0, Object object1, PointerInputEventHandler pointerInputEventHandler0) {
        this.a = object0;
        this.b = object1;
        this.c = pointerInputEventHandler0;
        this.d = hxb.a;
        gwq gwq0 = new gwq(new hxg[16]);
        this.e = gwq0;
        this.f = gwq0;
        this.i = new gwq(new hxg[16]);
        this.g = 0L;
    }

    @Override  // ijc
    public final boolean B() {
        return false;
    }

    @Override  // ijc
    public final void E() {
    }

    @Override  // hfb
    public final void dH() {
        this.t();
    }

    @Override  // ijc
    public final long dQ() {
        return ijk.a;
    }

    @Override  // hfb
    public final void dR() {
        this.t();
    }

    @Override  // jks
    public final float dX() {
        return ien.d(this).q.dX();
    }

    @Override  // jlc
    public final float dY() {
        return ien.d(this).q.dY();
    }

    @Override  // jlc
    public final float ea(long v) {
        return jlb.a(this, v);
    }

    @Override  // jks
    public final float eb(float f) {
        return jkr.a(this, f);
    }

    @Override  // jks
    public final float ec(int v) {
        return jkr.b(this, v);
    }

    @Override  // jks
    public final float ed(long v) {
        return jkr.c(this, v);
    }

    @Override  // jks
    public final float eg(float f) {
        return jkr.d(this, f);
    }

    @Override  // jks
    public final int eh(long v) {
        return jkr.e(this, v);
    }

    @Override  // jks
    public final int ei(float f) {
        return jkr.f(this, f);
    }

    @Override  // jks
    public final long ej(long v) {
        return jkr.g(this, v);
    }

    @Override  // jks
    public final long ek(long v) {
        return jkr.h(this, v);
    }

    @Override  // jlc
    public final long el(float f) {
        return jlb.b(this, f);
    }

    @Override  // jks
    public final long em(float f) {
        return jkr.i(this, f);
    }

    @Override  // ijc
    public final void n() {
        hvt hvt0 = this.j;
        if(hvt0 != null) {
            List list0 = hvt0.a;
            int v = list0.size();
            for(int v2 = 0; v2 < v; ++v2) {
                if(((hwe)list0.get(v2)).d) {
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    int v3 = list0.size();
                    for(int v1 = 0; v1 < v3; ++v1) {
                        hwe hwe0 = (hwe)list0.get(v1);
                        arrayList0.add(new hwe(hwe0.a, hwe0.b, hwe0.c, false, hwe0.e, hwe0.b, hwe0.c, hwe0.d, hwe0.d, hwe0.i, 0L));
                    }
                    hvt hvt1 = new hvt(arrayList0);
                    this.d = hvt1;
                    this.u(hvt1, hvv.a);
                    this.u(hvt1, hvv.b);
                    this.u(hvt1, hvv.c);
                    this.j = null;
                    break;
                }
            }
        }
    }

    @Override  // hwo
    public final iqy o() {
        return ien.d(this).s;
    }

    @Override  // ijc
    public final void q(hvt hvt0, hvv hvv0, long v) {
        this.g = v;
        if(hvv0 == hvv.a) {
            this.d = hvt0;
        }
        if(this.h == null) {
            icck icck0 = this.J();
            hxi hxi0 = new hxi(this, null);
            this.h = icbb.b(icck0, null, iccm.d, hxi0, 1);
        }
        this.u(hvt0, hvv0);
        List list0 = hvt0.a;
        int v1 = list0.size();
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                hvt0 = null;
                break;
            }
            if(!hvu.f(((hwe)list0.get(v2)))) {
                break;
            }
        }
        this.j = hvt0;
    }

    @Override  // ijc
    public final void r() {
        this.t();
    }

    @Override  // hwo
    public final Object s(ibtw ibtw0, ibrl ibrl0) {
        icbk icbk0 = new icbk(ibsc.c(ibrl0), 1);
        icbk0.z();
        hxg hxg0 = new hxg(this, icbk0);
        synchronized(this.f) {
            this.e.n(hxg0);
            new ibrw(ibsc.c(ibsc.b(ibtw0, hxg0, hxg0)), ibrx.a).w(ibom.a);
        }
        icbk0.d(new hxh(hxg0));
        Object object0 = icbk0.k();
        if(object0 == ibrx.a) {
            ibsi.b(ibrl0);
        }
        return object0;
    }

    public final void t() {
        iced iced0 = this.h;
        if(iced0 != null) {
            iced0.x(new hwn());
            this.h = null;
        }
    }

    private final void u(hvt hvt0, hvv hvv0) {
        synchronized(this.f) {
            this.i.o(this.i.b, this.e);
        }
        try {
            switch(hvv0.ordinal()) {
                case 1: {
                    int v4 = this.i.b - 1;
                    Object[] arr_object1 = this.i.a;
                    if(v4 < arr_object1.length) {
                        while(true) {
                            if(v4 < 0) {
                                break;
                            }
                            ((hxg)arr_object1[v4]).v(hvt0, hvv0);
                            --v4;
                        }
                    }
                    break;
                }
                case 0: 
                case 2: {
                    Object[] arr_object = this.i.a;
                    int v2 = this.i.b;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        ((hxg)arr_object[v3]).v(hvt0, hvv0);
                    }
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        finally {
            this.i.g();
        }
    }
}

