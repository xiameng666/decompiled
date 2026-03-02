import j..util.Objects;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.function.Supplier;

final class fxpn extends fxmv {
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    final fxpp h;
    public int i;
    public int j;
    public static final int k;

    public fxpn(fxpp fxpp0, Supplier supplier0) {
        Objects.requireNonNull(fxpp0);
        this.h = fxpp0;
        super(200, supplier0);
        this.i = 2;
        this.j = 2;
        this.f = -1L;
        this.g = -1L;
    }

    @Override  // fxmv
    public final void c(PrintWriter printWriter0) {
        if(!((Boolean)this.a.get()).booleanValue()) {
            return;
        }
        printWriter0.println("##SACR Start");
        fxpp fxpp0 = this.h;
        Locale locale0 = Locale.getDefault();
        int v = fxpp0.d - 1;
        if(fxpp0.d == 0) {
            throw null;
        }
        Integer integer0 = v;
        int v1 = fxpp0.e - 1;
        if(fxpp0.e == 0) {
            throw null;
        }
        printWriter0.println(String.format(locale0, "CR: %d:%d@%s", integer0, v1, fxmv.a(this.e)));
        Locale locale1 = Locale.getDefault();
        int v2 = this.j - 1;
        if(this.j == 0) {
            throw null;
        }
        printWriter0.println(String.format(locale1, "TF: %d@%s", v2, fxmv.a(this.d)));
        Locale locale2 = Locale.getDefault();
        int v3 = this.i - 1;
        if(this.i == 0) {
            throw null;
        }
        printWriter0.println(String.format(locale2, "TL: %d@%s", v3, fxmv.a(this.c)));
        printWriter0.printf("AF: @%s%n", new Object[]{fxmv.a(this.f)});
        printWriter0.printf("AL: @%s%n", new Object[]{fxmv.a(this.g)});
        super.c(printWriter0);
        printWriter0.println("##SACR End");
    }
}

