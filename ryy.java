import android.os.PersistableBundle;

public final class ryy implements sdg {
    private final sdg a;

    public ryy() {
        this.a = sdj.a(ryz.j, ryz.b);
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return this.e(persistableBundle0);
    }

    public final ryz d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (ryz)sdf.a(this.a, persistableBundle0);
    }

    public final ryz e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return (ryz)this.a.c(persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.d(((PersistableBundle)object0));
    }
}

