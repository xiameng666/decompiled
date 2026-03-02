import java.util.ArrayList;
import java.util.HashMap;

final class fvqg {
    final ArrayList a;
    final HashMap b;
    final HashMap c;
    final HashMap d;
    public final int e;
    public long f;

    public fvqg(int v) {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = 0L;
        this.e = v;
    }

    public final void a(int v) {
        if(v >= 0) {
            ArrayList arrayList0 = this.a;
            if(v < arrayList0.size()) {
                cjds cjds0 = (cjds)arrayList0.get(v);
                arrayList0.remove(v);
                this.b.remove(cjds0);
                this.c.remove(cjds0);
                this.d.remove(cjds0);
            }
        }
    }

    public final cjds b() {
        return this.a.isEmpty() ? null : ((cjds)this.a.get(this.a.size() - 1));
    }
}

