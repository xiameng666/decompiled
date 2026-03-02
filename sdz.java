import android.os.PersistableBundle;

public final class sdz implements scz, sdg, sdv {
    public static final sdz a;

    static {
        sdz.a = new sdz();
    }

    @Override  // scz
    public final PersistableBundle a() {
        return new PersistableBundle();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return sdz.a;
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        ibom ibom0 = (ibom)object0;
        ibuq.f(ibom0, "value");
        return sdy.e(ibom0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof sdz)) {
            return false;
        }
        sdz sdz0 = (sdz)object0;
        return true;
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }

    @Override
    public final int hashCode() {
        return 0x8B94F8E;
    }

    @Override
    public final String toString() {
        return "PersistableUnit";
    }
}

