import java.io.Closeable;
import java.io.PrintWriter;
import java.util.AbstractMap.SimpleImmutableEntry;

public abstract class cjcp {
    public final Object a;
    public final bzs b;
    private final cjco c;
    private int d;

    public cjcp(Object object0) {
        this.a = object0;
        this.c = new cjco(this);
        this.b = new bzs(0);
    }

    private final void a(cjdm cjdm0) {
        cjdm0.a = null;
        this.p(cjdm0);
    }

    public abstract Closeable e();

    protected final Object f(ibtw ibtw0) {
        Object object1;
        Closeable closeable1;
        Closeable closeable0;
        synchronized(this.a) {
            closeable0 = this.e();
        }
        try {
            closeable1 = this.im();
        }
        catch(Throwable throwable1) {
            goto label_22;
        }
        try {
            bzs bzs0 = this.b;
            int v = bzs0.d_num;
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    goto label_19;
                }
                object1 = ibtw0.a(bzs0.f(v1), ((cjdm)bzs0.i(v1)));
                if(object1 != null) {
                    goto label_15;
                }
                ++v1;
            }
        }
        catch(Throwable throwable2) {
            try {
                ibsx.a(closeable1, throwable2);
                throw throwable2;
            label_15:
                ibsx.a(closeable1, null);
            }
            catch(Throwable throwable1) {
                goto label_22;
            }
        }
        ibsx.a(closeable0, null);
        return object1;
        try {
        label_19:
            ibsx.a(closeable1, null);
            goto label_24;
        }
        catch(Throwable throwable1) {
            try {
            label_22:
                ibsx.a(closeable0, throwable1);
                throw throwable1;
            label_24:
                ibsx.a(closeable0, null);
                return null;
            }
            catch(Throwable throwable0) {
            }
        }
        throw throwable0;
    }

    protected final int il() {
        synchronized(this.a) {
        }
        return this.d;
    }

    public final Closeable im() {
        ++this.c.a;
        return this.c;
    }

    protected String iy(cjdm cjdm0) {
        throw null;
    }

    public final void j() {
        synchronized(this.a) {
            if(this.c.a != 0) {
                throw new IllegalStateException("illegal reentrant mutation");
            }
            Closeable closeable0 = this.e();
            try {
                Closeable closeable1 = this.im();
                try {
                    bzs bzs0 = this.b;
                    boolean z = bzs0.isEmpty();
                    int v = bzs0.d_num;
                    for(int v1 = 0; v1 < v; ++v1) {
                        cjdm cjdm0 = (cjdm)bzs0.i(v1);
                        this.a(cjdm0);
                        cjdm0.f();
                    }
                    bzs0.clear();
                    if(!z) {
                        this.r();
                    }
                }
                catch(Throwable throwable2) {
                    ibsx.a(closeable1, throwable2);
                    throw throwable2;
                }
                ibsx.a(closeable1, null);
            }
            catch(Throwable throwable1) {
                ibsx.a(closeable0, throwable1);
                throw throwable1;
            }
            ibsx.a(closeable0, null);
        }
    }

    public final void k(PrintWriter printWriter0) {
        ibuq.f(printWriter0, "pw");
        synchronized(this.a) {
            this.n(printWriter0);
        }
    }

    protected final void m(ibtw ibtw0) {
        synchronized(this.a) {
            Closeable closeable0 = this.e();
            try {
                Closeable closeable1 = this.im();
                try {
                    bzs bzs0 = this.b;
                    int v = bzs0.d_num;
                    for(int v1 = 0; v1 < v; ++v1) {
                        ibtw0.a(bzs0.f(v1), bzs0.i(v1));
                    }
                }
                catch(Throwable throwable2) {
                    ibsx.a(closeable1, throwable2);
                    throw throwable2;
                }
                ibsx.a(closeable1, null);
            }
            catch(Throwable throwable1) {
                ibsx.a(closeable0, throwable1);
                throw throwable1;
            }
            ibsx.a(closeable0, null);
        }
    }

    protected void n(PrintWriter printWriter0) {
        ibuq.f(printWriter0, "pw");
        printWriter0.println("listeners:");
        Closeable closeable0 = this.e();
        try {
            Closeable closeable1 = this.im();
            try {
                bzs bzs0 = this.b;
                int v = bzs0.d_num;
                for(int v1 = 0; v1 < v; ++v1) {
                    bzs0.f(v1);
                    cjdm cjdm0 = (cjdm)bzs0.i(v1);
                    synchronized(this.a) {
                        printWriter0.print("  ");
                        printWriter0.print(cjdm0);
                        if(cjdm0.c) {
                            printWriter0.println();
                        }
                        else {
                            printWriter0.println(" (inactive)");
                        }
                        String s = this.iy(cjdm0);
                        if(s != null) {
                            printWriter0.print("    ");
                            printWriter0.println(s);
                        }
                    }
                }
            }
            catch(Throwable throwable1) {
                ibsx.a(closeable1, throwable1);
                throw throwable1;
            }
            ibsx.a(closeable1, null);
        }
        catch(Throwable throwable0) {
            ibsx.a(closeable0, throwable0);
            throw throwable0;
        }
        ibsx.a(closeable0, null);
    }

    protected void o() {
    }

    public final void p(cjdm cjdm0) {
        boolean z = false;
        if(this.c.a == 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(cjdm0.h() && this.y(cjdm0)) {
            z = true;
        }
        if(z != cjdm0.c) {
            cjdm0.c = z;
            if(z) {
                ++this.d;
                cjdm0.b();
                this.x(cjdm0);
                return;
            }
            cjdm0.c();
            --this.d;
            this.v(cjdm0);
        }
    }

    protected void q(Object object0, cjdm cjdm0, Object object1, cjdm cjdm1) {
        ibuq.f(object0, "oldKey");
        ibuq.f(object1, "newKey");
    }

    protected void r() {
    }

    public final void s(Object object0, cjdm cjdm0) {
        ibuq.f(object0, "key");
        this.w(object0, object0, cjdm0);
    }

    protected final void t(Object object0, cjdm cjdm0) {
        ibuq.f(object0, "key");
        ibuq.f(cjdm0, "registration");
        synchronized(this.a) {
            cjdm cjdm1 = (cjdm)this.b.get(object0);
            if(ibuq.m(cjdm1, cjdm0)) {
                if(this.c.a == 0) {
                    this.z(object0);
                }
                else {
                    Closeable closeable0 = this.e();
                    try {
                        this.a(cjdm1);
                    }
                    catch(Throwable throwable0) {
                        ibsx.a(closeable0, throwable0);
                        throw throwable0;
                    }
                    ibsx.a(closeable0, null);
                    cjco cjco0 = this.c;
                    ibuq.f(object0, "key");
                    ibuq.f(cjdm1, "registration");
                    if(cjco0.a == 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    bxf bxf0 = cjco0.b;
                    if(bxf0 == null) {
                        bxf0 = new bxf(1);
                        cjco0.b = bxf0;
                    }
                    bxf0.add(new AbstractMap.SimpleImmutableEntry(object0, cjdm1));
                }
            }
        }
    }

    public final void u(ibtw ibtw0) {
        synchronized(this.a) {
            Closeable closeable0 = this.e();
            try {
                Closeable closeable1 = this.im();
                try {
                    bzs bzs0 = this.b;
                    int v = bzs0.d_num;
                    for(int v1 = 0; v1 < v; ++v1) {
                        Object object1 = bzs0.f(v1);
                        cjdm cjdm0 = (cjdm)bzs0.i(v1);
                        if(((Boolean)ibtw0.a(object1, cjdm0)).booleanValue()) {
                            this.t(object1, cjdm0);
                        }
                    }
                }
                catch(Throwable throwable2) {
                    ibsx.a(closeable1, throwable2);
                    throw throwable2;
                }
                ibsx.a(closeable1, null);
            }
            catch(Throwable throwable1) {
                ibsx.a(closeable0, throwable1);
                throw throwable1;
            }
            ibsx.a(closeable0, null);
        }
    }

    public abstract void v(cjdm arg1);

    protected final void w(Object object0, Object object1, cjdm cjdm0) {
        ibuq.f(object1, "key");
        if(object0 == null) {
            object0 = object1;
        }
        boolean z = ibuq.m(object0, object1);
        synchronized(this.a) {
            if(!z && this.b.containsKey(object1)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            bzs bzs0 = this.b;
            if(bzs0.containsValue(cjdm0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if(this.c.a != 0) {
                throw new IllegalStateException("illegal reentrant mutation");
            }
            Closeable closeable0 = this.e();
            try {
                Closeable closeable1 = this.im();
                try {
                    boolean z1 = bzs0.isEmpty();
                    Object object3 = z ? bzs0.get(object0) : bzs0.remove(object0);
                    if(((cjdm)object3) != null) {
                        this.a(((cjdm)object3));
                        ((cjdm)object3).f();
                    }
                    bzs0.put(object1, cjdm0);
                    if(z1) {
                        this.o();
                    }
                    if(((cjdm)object3) != null) {
                        this.q(object0, ((cjdm)object3), object1, cjdm0);
                    }
                    cjdm0.b = true;
                    cjdm0.e(object1);
                    this.p(cjdm0);
                }
                catch(Throwable throwable2) {
                    ibsx.a(closeable1, throwable2);
                    throw throwable2;
                }
                ibsx.a(closeable1, null);
            }
            catch(Throwable throwable1) {
                ibsx.a(closeable0, throwable1);
                throw throwable1;
            }
            ibsx.a(closeable0, null);
        }
    }

    public abstract void x(cjdm arg1);

    protected abstract boolean y(cjdm arg1);

    public final boolean z(Object object0) {
        boolean z;
        ibuq.f(object0, "key");
        synchronized(this.a) {
            if(this.c.a != 0) {
                throw new IllegalStateException("illegal reentrant mutation");
            }
            Closeable closeable0 = this.e();
            try {
                Closeable closeable1 = this.im();
                try {
                    bzs bzs0 = this.b;
                    cjdm cjdm0 = (cjdm)bzs0.get(object0);
                    if(cjdm0 == null) {
                        z = false;
                    }
                    else {
                        this.a(cjdm0);
                        cjdm0.f();
                        bzs0.remove(object0);
                        z = true;
                        if(bzs0.isEmpty()) {
                            this.r();
                        }
                    }
                }
                catch(Throwable throwable2) {
                    ibsx.a(closeable1, throwable2);
                    throw throwable2;
                }
                ibsx.a(closeable1, null);
            }
            catch(Throwable throwable1) {
                ibsx.a(closeable0, throwable1);
                throw throwable1;
            }
            ibsx.a(closeable0, null);
        }
        return z;
    }
}

