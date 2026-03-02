import android.content.Context;
import java.util.List;

public final class leo implements ibvu {
    public final String a;
    private final lek b;
    private final ibts c;
    private final icck d;
    private final Object e;
    private volatile lap f;

    public leo(String s, lek lek0, ibts ibts0, icck icck0) {
        this.a = s;
        this.b = lek0;
        this.c = ibts0;
        this.d = icck0;
        this.e = new Object();
    }

    @Override  // ibvu
    public final Object a(Object object0, ibxd ibxd0) {
        Object object4;
        ibuq.f(object0, "thisRef");
        ibuq.f(ibxd0, "property");
        Object object1 = this.f;
        if(object1 == null) {
            synchronized(this.e) {
                if(this.f == null) {
                    Context context0 = ((Context)object0).getApplicationContext();
                    ibuq.c(context0);
                    Object object3 = this.c.a(context0);
                    lex lex0 = new lex(new len(context0, this));
                    this.f = new lew(new lew(laq.a(new lcl(lfc.a, lex0), this.b, ((List)object3), this.d)));
                }
                object4 = this.f;
                ibuq.c(object4);
            }
            return object4;
        }
        return object1;
    }
}

