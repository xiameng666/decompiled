import android.os.PersistableBundle;

public final class rkb implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rkb.d(persistableBundle0);
    }

    public static final rkc d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        rkc rkc0 = rkc.d;
        int v = persistableBundle0.getInt("type", rkc0.f);
        ibot ibot0 = new ibot(((ibow)rkc.e));
        while(ibot0.hasNext()) {
            Object object0 = ibot0.next();
            if(((rkc)object0).f == v) {
                return ((rkc)object0) == null ? rkc0 : ((rkc)object0);
            }
        }
        return rkc0;
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

