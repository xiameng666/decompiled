import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;

public final class gpwt extends gpwr {
    private final cnlr c;

    public gpwt(String s, long v, cnlr cnlr0, gfsi gfsi0, gfsi gfsi1) {
        super(s, v, gfsi0, gfsi1);
        this.c = cnlr0;
    }

    @Override  // gpwr
    public final void c(long v, MessageLite hfvm0) {
        synchronized(this) {
            super.c(v, hfvm0);
            if(((long)this.a()) >= huqv.a.c().av()) {
                String s = this.g();
                this.c.d(s);
            }
        }
    }

    @Override  // gpwr
    public final void e() {
        synchronized(this) {
            super.e();
            cnln cnln0 = new cnln(this.c);
            gmbu.t(this.c.d.e(cnln0), new gpws(this), gmap.a);
        }
    }

    @Override  // gpwr
    public final void f(PrintWriter printWriter0) {
        String s = this.g();
        if(s != null && !s.isEmpty()) {
            this.c.d(s);
        }
        StringWriter stringWriter0 = new StringWriter();
        PrintWriter printWriter1 = new PrintWriter(stringWriter0);
        this.c.b(printWriter1);
        printWriter0.println();
        printWriter0.println(String.format(Locale.US, "### start %s log (v3) ###", this.a));
        printWriter0.println(stringWriter0.toString());
        printWriter0.println(String.format(Locale.US, "### end %s log ###", this.a));
        printWriter0.println();
    }

    private final String g() {
        String s;
        synchronized(this) {
            s = this.b();
            super.e();
        }
        return s;
    }
}

