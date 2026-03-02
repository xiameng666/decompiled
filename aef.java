import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class aef {
    private final String a;
    private ArrayList b;
    private LinkedHashSet c;
    private final Set d;
    private boolean e;

    public aef(String s) {
        this.b = new ArrayList();
        this.c = new LinkedHashSet();
        this.d = new bxf();
        this.e = false;
        kay.i(s);
        this.a = s;
    }

    public final aes a() {
        this.e = true;
        ArrayList arrayList0 = this.b;
        ArrayList arrayList1 = new ArrayList(this.c);
        return new aes(this.a, arrayList0, arrayList1);
    }

    public final void b(String s) {
        kay.i(s);
        this.d();
        this.c.add(s);
    }

    public final void c(aep aep0) {
        kay.i(aep0);
        this.d();
        String s = aep0.g();
        if(!this.d.add(s)) {
            throw new agt("Property defined more than once: " + s);
        }
        this.b.add(aep0.a);
    }

    private final void d() {
        if(this.e) {
            this.b = new ArrayList(this.b);
            this.c = new LinkedHashSet(this.c);
            this.e = false;
        }
    }
}

