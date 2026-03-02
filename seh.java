import android.os.PersistableBundle;

public final class seh implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        if(persistableBundle0.containsKey("value")) {
            String s = persistableBundle0.getString("value");
            if(s != null) {
                return new sei(s);
            }
            throw new IllegalStateException("Missing string resource value");
        }
        String s1 = persistableBundle0.getString("packageName");
        if(s1 != null) {
            return new sei(null, new ibns(s1, persistableBundle0.getInt("resourceId")));
        }
        throw new IllegalStateException("Missing string package name");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

