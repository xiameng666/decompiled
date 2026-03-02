import android.os.PersistableBundle;
import java.util.List;

public final class seb implements sdg {
    private final sdg a;
    private final ibts b;

    public seb(sdg sdg0) {
        this(sdg0, sea.a);
    }

    public seb(sdg sdg0, ibts ibts0) {
        this.a = sdg0;
        this.b = ibts0;
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    public final List d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        ibqm ibqm0 = new ibqm(null);
        int v = persistableBundle0.getInt("size");
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = sdn.a(persistableBundle0, "item_" + v1, this.a);
            if(object0 == null) {
                object0 = this.b.a(Integer.valueOf(v1));
            }
            ibqm0.add(object0);
        }
        return ibpo.a(ibqm0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

