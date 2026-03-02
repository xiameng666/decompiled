import android.os.PersistableBundle;

public final class rjy implements sdg {
    private final sdg a;

    public rjy() {
        this.a = sdj.a(rjz.j, rjz.i);
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return this.e(persistableBundle0);
    }

    public final rjz d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (rjz)sdf.a(this.a, persistableBundle0);
    }

    public final rjz e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return (rjz)this.a.c(persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.d(((PersistableBundle)object0));
    }
}

