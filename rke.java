import android.os.PersistableBundle;

public final class rke implements sdg {
    private final sdg a;

    public rke() {
        this.a = sdj.a(rkf.e, rkf.b);
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return this.e(persistableBundle0);
    }

    public final rkf d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (rkf)sdf.a(this.a, persistableBundle0);
    }

    public final rkf e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return (rkf)this.a.c(persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.d(((PersistableBundle)object0));
    }
}

