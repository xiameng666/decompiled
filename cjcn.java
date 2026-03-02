import java.util.AbstractMap.SimpleImmutableEntry;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public abstract class cjcn {
    public final Object a;
    public final bxd b;
    public final cjcm c;
    private int d;

    public cjcn() {
        this.a = new Object();
        this.b = new bxd();
        this.c = new cjcm(this);
        this.d = 0;
    }

    private final void a(int v) {
        bxd bxd0 = this.b;
        cjdf cjdf0 = (cjdf)bxd0.i(v);
        cjcv cjcv0 = this.r();
        try {
            cjcm cjcm0 = this.c;
            cjcm0.b();
            try {
                this.b(cjdf0);
                cjdf0.f();
                bxd0.g(v);
                if(bxd0.isEmpty()) {
                    this.f();
                }
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(cjcm0, throwable1);
                throw throwable1;
            }
            cjcm0.close();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cjcv0, throwable0);
            throw throwable0;
        }
        cjcv0.close();
    }

    private final void b(cjdf cjdf0) {
        synchronized(cjdf0.a) {
            cjdf0.d = null;
        }
        this.iu(cjdf0);
    }

    protected void d() {
    }

    protected void f() {
    }

    protected final void it(kar kar0) {
        synchronized(this.a) {
            cjcm cjcm0 = this.c;
            cjcm0.b();
            try {
                bxd bxd0 = this.b;
                int v1 = bxd0.d_num;
                for(int v2 = 0; v2 < v1; ++v2) {
                    cjdf cjdf0 = (cjdf)bxd0.i(v2);
                    if(cjdf0.b) {
                        kar0.accept(cjdf0);
                    }
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cjcm0, throwable0);
                throw throwable0;
            }
            cjcm0.close();
        }
    }

    public final void iu(cjdf cjdf0) {
        boolean z = cjdf0.g() && this.q(cjdf0);
        if(z != cjdf0.b) {
            cjdf0.b = z;
            if(z) {
                ++this.d;
                cjdf0.b();
                this.u();
                return;
            }
            cjdf0.c();
            --this.d;
            this.t();
        }
    }

    public final void iv(Object object0, cjdf cjdf0) {
        this.n(null, object0, cjdf0);
    }

    public final void iw(Object object0) {
        synchronized(this.a) {
            gftb.q(((boolean)(this.c.a() ^ 1)));
            int v1 = this.b.e(object0);
            if(v1 < 0) {
                return;
            }
            this.a(v1);
        }
    }

    public final void ix(Object object0, cjdf cjdf0) {
        synchronized(this.a) {
            bxd bxd0 = this.b;
            int v1 = bxd0.e(object0);
            if(v1 < 0) {
                return;
            }
            cjdf cjdf1 = (cjdf)bxd0.i(v1);
            if(cjdf1 != cjdf0) {
                return;
            }
            cjcm cjcm0 = this.c;
            if(cjcm0.a()) {
                this.b(cjdf1);
                cjcn cjcn0 = cjcm0.b;
                synchronized(cjcn0.a) {
                    gftb.q(cjcm0.a());
                    if(cjcm0.a == null) {
                        cjcm0.a = new bxf(cjcn0.b.d_num);
                    }
                    cjcm0.a.add(new AbstractMap.SimpleImmutableEntry(object0, cjdf1));
                }
            }
            else {
                this.a(v1);
            }
        }
    }

    public final void m(gftc gftc0) {
        synchronized(this.a) {
            cjcm cjcm0 = this.c;
            gftb.q(((boolean)(cjcm0.a() ^ 1)));
            cjcv cjcv0 = this.r();
            try {
                cjcm0.b();
                try {
                    bxd bxd0 = this.b;
                    int v = bxd0.d_num;
                    for(int v1 = 0; v1 < v; ++v1) {
                        Object object1 = bxd0.f(v1);
                        if(gftc0.a(object1)) {
                            this.ix(object1, ((cjdf)bxd0.i(v1)));
                        }
                    }
                }
                catch(Throwable throwable2) {
                    TWR.safeClose$NT(cjcm0, throwable2);
                    throw throwable2;
                }
                cjcm0.close();
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(cjcv0, throwable1);
                throw throwable1;
            }
            cjcv0.close();
        }
    }

    protected final void n(Object object0, Object object1, cjdf cjdf0) {
        cjdf cjdf1;
        gftb.check(object1);
        if(object0 == null) {
            object0 = object1;
        }
        Object object2 = this.a;
        boolean z = object0.equals(object1);
        synchronized(object2) {
            cjcm cjcm0 = this.c;
            gftb.q(((boolean)(cjcm0.a() ^ 1)));
            gftb.checkTrue(z || !this.b.containsKey(object1));
            bxd bxd0 = this.b;
            gftb.checkTrue(((boolean)(bxd0.containsValue(cjdf0) ^ 1)));
            cjcv cjcv0 = this.r();
            try {
                cjcm0.b();
                try {
                    boolean z1 = bxd0.isEmpty();
                    int v = bxd0.e(object0);
                    if(v >= 0) {
                        cjdf1 = (cjdf)bxd0.i(v);
                        this.b(cjdf1);
                        cjdf1.f();
                        if(!z) {
                            bxd0.g(v);
                        }
                    }
                    else {
                        cjdf1 = null;
                    }
                    if(z && v >= 0) {
                        bxd0.h(v, cjdf0);
                    }
                    else {
                        bxd0.put(object1, cjdf0);
                    }
                    if(z1) {
                        this.d();
                    }
                    if(cjdf1 != null) {
                        this.s(cjdf1, cjdf0);
                    }
                    cjdf0.c = true;
                    cjdf0.e(object1);
                    this.iu(cjdf0);
                }
                catch(Throwable throwable2) {
                    TWR.safeClose$NT(cjcm0, throwable2);
                    throw throwable2;
                }
                cjcm0.close();
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(cjcv0, throwable1);
                throw throwable1;
            }
            cjcv0.close();
        }
    }

    public final void o(gftc gftc0) {
        synchronized(this.a) {
            cjcv cjcv0 = this.r();
            try {
                cjcm cjcm0 = this.c;
                cjcm0.b();
                try {
                    bxd bxd0 = this.b;
                    int v = bxd0.d_num;
                    for(int v1 = 0; v1 < v; ++v1) {
                        cjdf cjdf0 = (cjdf)bxd0.i(v1);
                        if(gftc0.a(cjdf0)) {
                            this.iu(cjdf0);
                        }
                    }
                }
                catch(Throwable throwable2) {
                    TWR.safeClose$NT(cjcm0, throwable2);
                    throw throwable2;
                }
                cjcm0.close();
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(cjcv0, throwable1);
                throw throwable1;
            }
            cjcv0.close();
        }
    }

    public final boolean p(gftc gftc0) {
        int v2;
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            cjcm cjcm0 = this.c;
            cjcm0.b();
            try {
                bxd bxd0 = this.b;
                int v1 = bxd0.d_num;
                v2 = 0;
                while(true) {
                label_8:
                    if(v2 >= v1) {
                        goto label_21;
                    }
                    if(gftc0.a(((cjdf)bxd0.i(v2)))) {
                        break;
                    }
                    goto label_19;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cjcm0, throwable0);
                throw throwable0;
            }
            cjcm0.close();
            FIN.finallyCodeBegin$NT(v);
            return true;
        label_19:
            ++v2;
            goto label_8;
        label_21:
            cjcm0.close();
            FIN.finallyExec$NT(v);
            return false;
        }
        finally {
            __monitor_exit(object0);
        }
    }

    protected abstract boolean q(cjdf arg1);

    public abstract cjcv r();

    protected void s(cjdf cjdf0, cjdf cjdf1) {
    }

    public abstract void t();

    public abstract void u();
}

