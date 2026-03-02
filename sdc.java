import android.os.PersistableBundle;
import java.util.Objects;

public final class sdc implements sdg, sdv {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        ibuq.f(persistableBundle0, "persistableBundle");
        if(persistableBundle0.containsKey("value")) {
            return () -> {
                PersistableBundle persistableBundle0 = new PersistableBundle();
                persistableBundle0.putBoolean("value", rjc.a(persistableBundle0, "value"));
                return persistableBundle0;
            };
        }
        Objects.toString(persistableBundle0);
        throw new IllegalStateException(persistableBundle0 + " doesn\'t contain value");
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return sdc.e(((Boolean)object0).booleanValue());
    }

    // Detected as a lambda impl.
    public static final PersistableBundle e(boolean z) {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putBoolean("value", z);
        return persistableBundle0;
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

