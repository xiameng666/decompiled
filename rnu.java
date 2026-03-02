import android.os.PersistableBundle;
import j..time.Instant;

public final class rnu implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rnu.d(persistableBundle0);
    }

    public static final rnv d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        if(persistableBundle0.isEmpty()) {
            return new rnv();
        }
        Instant instant0 = Instant.ofEpochSecond(persistableBundle0.getLong("lastUpdate"));
        ibuq.e(instant0, "ofEpochSecond(...)");
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("bundle");
        if(persistableBundle1 != null) {
            return new rnv(instant0, persistableBundle1);
        }
        throw new IllegalStateException("Missing bundle in OnboardingMetadataStore");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

