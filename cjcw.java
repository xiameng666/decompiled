import j..util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

public abstract class cjcw extends cjcn {
    private final cjcv d;
    private boolean e;
    private Object f;

    public cjcw() {
        this.d = new cjcv(this);
        this.e = false;
    }

    protected abstract void A();

    public final void B() {
        synchronized(this.a) {
            cjcv cjcv0 = this.d;
            if(cjcv0.b()) {
                cjcv0.a();
                return;
            }
            ArrayList arrayList0 = new ArrayList(this.b.d_num);
            Objects.requireNonNull(arrayList0);
            this.it(new cjcu(arrayList0));
            if(!arrayList0.isEmpty()) {
                Object object1 = this.v(arrayList0);
                if(!this.e) {
                    this.C(object1);
                    this.e = true;
                    this.f = object1;
                }
                else if(!Objects.equals(object1, this.f)) {
                    gftb.q(this.e);
                    this.D(this.f, object1);
                    this.f = object1;
                }
            }
            else if(this.e) {
                this.f = null;
                this.e = false;
                this.A();
            }
        }
    }

    protected abstract void C(Object arg1);

    protected void D(Object object0, Object object1) {
        this.C(object1);
    }

    @Override  // cjcn
    public final cjcv r() {
        this.d.c();
        return this.d;
    }

    @Override  // cjcn
    public final void t() {
        this.B();
    }

    @Override  // cjcn
    public final void u() {
        this.B();
    }

    protected abstract Object v(Collection arg1);

    protected String w() {
        if(this.e) {
            return this.f == null ? "registered" : this.f.toString();
        }
        return "unregistered";
    }

    public final void x(cjde cjde0) {
        this.it(new cjct(cjde0));
    }

    public final void y(gfsi gfsi0) {
        this.it(new cjcs(gfsi0));
    }

    public void z(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        synchronized(this.a) {
            printWriter0.print("source: ");
            printWriter0.print(this.w());
            printWriter0.println();
            synchronized(this.a) {
                bxd bxd0 = this.b;
                if(!bxd0.isEmpty()) {
                    printWriter0.println("listeners:");
                    int v2 = bxd0.d_num;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        cjdf cjdf0 = (cjdf)bxd0.i(v3);
                        printWriter0.print("  ");
                        printWriter0.print(cjdf0);
                        if(cjdf0.b) {
                            printWriter0.println();
                        }
                        else {
                            printWriter0.println(" (inactive)");
                        }
                    }
                }
            }
        }
    }
}

