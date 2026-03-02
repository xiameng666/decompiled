import java.io.PrintWriter;

public abstract class fxpd {
    public final String e;
    public fxpd f;
    public fxpd g;
    public fxpk h;

    protected fxpd(String s) {
        this.e = a.a(s, "[", "]");
    }

    public void a() {
    }

    public void b(fxpi fxpi0) {
    }

    public abstract boolean c(fxpj arg1);

    protected void d(PrintWriter printWriter0) {
        printWriter0.println("#St." + this.e);
    }

    protected final void g(fxpi fxpi0) {
        fxpk fxpk0 = this.h;
        fxpk0.a(this, fxpi0);
        if(fxpk0.e) {
            fxpp fxpp0 = fxpk0.d;
            if(fxpp0 != null) {
                fxpp0.c(fxpi0.a());
            }
        }
    }

    protected final void h(PrintWriter printWriter0) {
        printWriter0.println("#St." + this.e + " <");
    }

    protected final void i(PrintWriter printWriter0) {
        printWriter0.println("#St." + this.e + " >");
    }

    protected final void j() {
        this.h.i();
    }

    public final boolean k() {
        return this.h.j(this);
    }
}

