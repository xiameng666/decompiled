import java.io.PrintWriter;
import java.util.function.Supplier;

public final class fxoy extends fxpd implements Supplier {
    public final fxnw a;
    private final fxow b;
    private final fxox c;
    private boolean d;
    private volatile Object i;
    private final fxmv j;

    public fxoy(String s, fxow fxow0, fxnw fxnw0, fxox fxox0, Supplier supplier0) {
        super(s);
        this.b = fxow0;
        this.a = fxnw0;
        this.c = fxox0;
        this.j = new fxmv(10, supplier0);
        fxow0.d = this;
    }

    @Override  // fxpd
    public final void a() {
        synchronized(this) {
            this.d = true;
            this.b.a();
            this.a.a();
        }
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        synchronized(this) {
            this.b.b();
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        synchronized(this) {
            if(fxpj0.a == this.a.a) {
                this.e();
                if(this.d) {
                    this.d = false;
                    this.j();
                }
                return true;
            }
        }
        return false;
    }

    @Override  // fxpd
    protected final void d(PrintWriter printWriter0) {
        this.i(printWriter0);
        this.j.c(printWriter0);
        this.h(printWriter0);
    }

    private final void e() {
        Object object0 = this.b.get();
        if(this.i != null && this.i.equals(object0)) {
            return;
        }
        Object object1 = this.i;
        this.i = object0;
        Object object2 = this.get();
        this.c.a(object1, object2);
        fxmv fxmv0 = this.j;
        if(object1 == null) {
            object1 = "[null]";
        }
        fxmv0.f(1, "%s->%s", new Object[]{object1, object0});
    }

    @Override
    public final Object get() {
        if(this.i == null) {
            this.e();
        }
        return this.i;
    }
}

