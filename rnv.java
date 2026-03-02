import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;
import j..time.Instant;
import java.util.Set;

public final class rnv implements scz {
    public static final rnu a;
    public Instant b;
    public PersistableBundle c;
    private final Instant d;

    static {
        rnv.a = new rnu();
    }

    public rnv() {
        Instant instant0 = Instant.now();
        ibuq.e(instant0, "now(...)");
        this(instant0, new PersistableBundle());
    }

    public rnv(Instant instant0, PersistableBundle persistableBundle0) {
        this.b = instant0;
        this.c = this.b(persistableBundle0);
        this.d = this.b;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putLong("lastUpdate", this.b.getEpochSecond());
        persistableBundle0.putPersistableBundle("bundle", this.c);
        return persistableBundle0;
    }

    public final PersistableBundle b(PersistableBundle persistableBundle0) {
        PersistableBundle persistableBundle1 = new PersistableBundle();
        persistableBundle1.putAll(persistableBundle0);
        for(Object object0: persistableBundle0.keySet()) {
            String s = (String)object0;
            Object object1 = persistableBundle0.get(s);
            if((object1 instanceof PersistableBundle)) {
                persistableBundle1.putPersistableBundle(s, this.b(((PersistableBundle)object1)));
            }
        }
        return persistableBundle1;
    }

    public final rnt c(Class class0, sdg sdg0) {
        try {
            String s = rjb.a(class0);
            return s == null ? null : ((rnt)sdn.a(this.c, s, sdg0));
        }
        catch(Exception unused_ex) {
            sct.h("OnboardingMetadataStore", a.i(class0, "Error reading ", " from persistableBundle"));
            return null;
        }
    }

    public final void d() {
        synchronized(this.c) {
            Instant instant0 = Instant.now();
            ibuq.e(instant0, "now(...)");
            this.b = instant0;
            this.c.clear();
        }
    }

    @InternalOnboardingApi
    public final void e(rnv rnv0) {
        synchronized(this.c) {
            this.b = rnv0.b;
            this.c = rnv0.c;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rnv)) {
            return false;
        }
        return this.b.getEpochSecond() == ((rnv)object0).b.getEpochSecond() ? sco.c(this.c, ((rnv)object0).c) : false;
    }

    public final boolean f() {
        return this.c.isEmpty();
    }

    @Override
    public final int hashCode() {
        return ((int)this.b.getEpochSecond()) * 0x1F + sco.d(this.c);
    }

    @Override
    public final String toString() {
        Set set0 = this.c.keySet();
        ibuq.e(set0, "keySet(...)");
        String s = ibpo.aK(set0, ",", null, null, null, 62);
        return "OnboardingMetadataStore{lastUpdate=" + this.d + ", metadata=" + s + "}";
    }
}

