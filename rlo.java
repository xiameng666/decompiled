import android.os.PersistableBundle;

public final class rlo implements sdg, sdv {
    static final rlo a;

    static {
        rlo.a = new rlo();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rlo.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return rlo.f(((rlm)object0));
    }

    public static final rlq e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        Object object0 = sdn.a(persistableBundle0, "NODE", roo.c);
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String s = persistableBundle0.getString("QUALIFIED_NAME");
        if(s != null) {
            return new rlq(((roo)object0), s);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final PersistableBundle f(rlm rlm0) {
        ibuq.f(rlm0, "value");
        rlp.d(rlm0);
        return rln.a(new rlp(rlm0));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

