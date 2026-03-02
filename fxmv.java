import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Queue;
import java.util.function.Supplier;

public class fxmv {
    public final Supplier a;
    public static final int b;
    private static final SimpleDateFormat c;
    private final Queue d;

    static {
        fxmv.c = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    }

    public fxmv() {
        this(0xFA, new bgru());
    }

    public fxmv(int v, Supplier supplier0) {
        this.d = new ggpf(new ggca(v));
        this.a = supplier0;
    }

    /*
    String Decryptor: 3 succeeded, 2 failed
    - Failure: a(Lfxkh;->b<long>)<java.lang.String> @ Lfxjn;->d(Ljava/io/PrintWriter;)V+96h
    - Failure: a(Lfxjt;->b<long>)<java.lang.String> @ Lfxjn;->d(Ljava/io/PrintWriter;)V+3Ah
    */
    public static String a(long v) {
        if(v <= 0L) {
            return "n/a";
        }
        Date date0 = new Date(v);
        return fxmv.c.format(date0);
    }

    public static String b(hfwn hfwn0) {
        return hfwn0 == null ? "n/a" : fxmv.a(hfyn.b(hfwn0));
    }

    public void c(PrintWriter printWriter0) {
        if(((Boolean)this.a.get()).booleanValue()) {
            printWriter0.println("##DLog >>");
            for(Object object0: this.d) {
                printWriter0.printf("%s: %d:%s\n", new Object[]{fxmv.a(((fxmu)object0).a), ((int)((fxmu)object0).b), ((fxmu)object0).c});
            }
            printWriter0.println("##DLog <<");
        }
    }

    public final void d(int v) {
        this.e(v, "");
    }

    public final void e(int v, String s) {
        if(((Boolean)this.a.get()).booleanValue()) {
            this.d.add(new fxmu(System.currentTimeMillis(), v, s));
        }
    }

    public final void f(int v, String s, Object[] arr_object) {
        if(((Boolean)this.a.get()).booleanValue()) {
            this.d.add(new fxmu(System.currentTimeMillis(), v, String.format(s, arr_object)));
        }
    }
}

