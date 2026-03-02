import java.io.PrintWriter;
import java.util.Locale;

public final class fvwy extends fvwx {
    public fvwy(int v, long v1, String s, Object object0, int v2, int v3, int v4) {
        super(v, v1, s, object0, v2, v3, v4);
    }

    @Override  // fvwx
    public final void a(PrintWriter printWriter0) {
        String s = this.h == null ? "" : this.h.toString();
        String s1 = this.j;
        if(s1 != null) {
            printWriter0.print(String.format(Locale.US, s1, s, ((int)this.e), ((int)this.f), ((int)this.g)));
            return;
        }
        printWriter0.print(s);
    }
}

