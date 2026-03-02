import android.os.Bundle;
import android.os.PersistableBundle;

public final class fncp extends fncs {
    public static final fncp a;

    static {
        fncp.a = new fncp();
    }

    private fncp() {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("intentionally_canceled", true);
        super(0, bundle0, 8);
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("result_code", fncp.a.d);
        persistableBundle0.putInt("response_id", fncp.a.f);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fncp)) {
            return false;
        }
        fncp fncp0 = (fncp)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0x39F7EE37;
    }

    @Override
    public final String toString() {
        return "INTENTIONALLY_CANCELLED";
    }
}

