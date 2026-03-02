import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class lf {
    public final lu a;
    final la b;
    Executor c;
    public List d;
    public List e;
    int f;
    private static final Executor g;
    private final List h;

    static {
        lf.g = new le();
    }

    public lf(lu lu0, la la0) {
        this.h = new CopyOnWriteArrayList();
        this.e = Collections.EMPTY_LIST;
        this.a = lu0;
        this.b = la0;
        this.c = lf.g;
    }

    public lf(tk tk0, lp lp0) {
        this(new lj(tk0), new kz(lp0).a());
    }

    public final void a(List list0) {
        int v = this.f + 1;
        this.f = v;
        List list1 = this.d;
        if(list0 == list1) {
            return;
        }
        List list2 = this.e;
        if(list0 == null) {
            this.d = null;
            this.e = Collections.EMPTY_LIST;
            this.a.d(0, list1.size());
            this.c(list2);
            return;
        }
        if(list1 == null) {
            this.d = list0;
            this.e = DesugarCollections.unmodifiableList(list0);
            this.a.b(0, list0.size());
            this.c(list2);
            return;
        }
        ld ld0 = new ld(this, list1, list0, v);
        this.b.a.execute(ld0);
    }

    public final void b(lg lg0) {
        this.h.add(lg0);
    }

    public final void c(List list0) {
        for(Object object0: this.h) {
            ((lg)object0).a.e(list0, this.e);
        }
    }
}

