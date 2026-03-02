import android.os.PersistableBundle;

public final class fnfa implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        rui rui0 = (rui)sdn.a(persistableBundle0, "descriptiveMetadata", rui.a);
        if(rui0 != null) {
            return new fnfb(rui0);
        }
        throw new IllegalStateException("Missing descriptive task metadata");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

