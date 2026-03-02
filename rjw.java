import android.os.PersistableBundle;

public final class rjw implements sdg {
    private final sdg a;

    public rjw() {
        this.a = sdj.a(rjx.e, rjx.b);
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return this.e(persistableBundle0);
    }

    public final rjx d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (rjx)sdf.a(this.a, persistableBundle0);
    }

    public final rjx e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return (rjx)this.a.c(persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.d(((PersistableBundle)object0));
    }
}

