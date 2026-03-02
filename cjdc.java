import java.io.Closeable;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

public abstract class cjdc extends cjcp {
    private final cjcy c;
    private boolean d;
    private Object e;

    public cjdc() {
        super(new Object());
        this.c = new cjcy(this);
    }

    protected abstract void A();

    protected final void B() {
        synchronized(this.a) {
            if(this.c.a != 0) {
                cjcy cjcy0 = this.c;
                if(cjcy0.a == 0) {
                    throw new IllegalStateException("Check failed.");
                }
                cjcy0.b = true;
            }
            else if(this.il() != 0) {
                ArrayList arrayList0 = new ArrayList(this.il());
                Closeable closeable0 = this.e();
                try {
                    Closeable closeable1 = super.im();
                    try {
                        bzs bzs0 = this.b;
                        int v1 = bzs0.d_num;
                        for(int v = 0; v < v1; ++v) {
                            bzs0.f(v);
                            cjdm cjdm0 = (cjdm)bzs0.i(v);
                            if(cjdm0.c) {
                                arrayList0.add(cjdm0);
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
                Object object1 = this.b(arrayList0);
                if(!this.d) {
                    this.h(object1);
                    this.e = object1;
                    this.d = true;
                }
                else if(!ibuq.m(object1, this.e)) {
                    if(!this.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.i(this.e, object1);
                    this.e = object1;
                }
            }
            else if(this.d) {
                this.e = null;
                this.d = false;
                this.A();
            }
        }
    }

    protected abstract Object b(Collection arg1);

    @Override  // cjcp
    public final Closeable e() {
        ++this.c.a;
        return this.c;
    }

    protected abstract void h(Object arg1);

    protected void i(Object object0, Object object1) {
        this.h(object1);
    }

    public final Object ik(ibts ibts0, ibrl ibrl0) {
        Object object0 = icfh.a(new cjdb(this, ibts0, null), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // cjcp
    protected final String iy(cjdm cjdm0) {
        ibuq.f(cjdm0, "registration");
        return null;
    }

    public final void l(ibts ibts0) {
        this.m(new cjcx(ibts0));
    }

    @Override  // cjcp
    protected void n(PrintWriter printWriter0) {
        String s;
        ibuq.f(printWriter0, "pw");
        printWriter0.print("source: ");
        if(this.d) {
            Object object0 = this.e;
            if(object0 == null) {
                s = "registered";
            }
            else {
                s = object0.toString();
                if(s == null) {
                    s = "registered";
                }
            }
        }
        else {
            s = "unregistered";
        }
        printWriter0.print(s);
        printWriter0.println();
        synchronized(this.a) {
            super.n(printWriter0);
        }
    }

    @Override  // cjcp
    public final void v(cjdm cjdm0) {
        ibuq.f(cjdm0, "registration");
        this.B();
    }

    @Override  // cjcp
    public final void x(cjdm cjdm0) {
        ibuq.f(cjdm0, "registration");
        this.B();
    }
}

