import android.os.Bundle;
import android.os.PersistableBundle;

public final class fnco extends fncs {
    public static final fnco a;

    static {
        fnco.a = new fnco();
    }

    private fnco() {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("intentionally_canceled", true);
        super(0, bundle0, 7);
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("result_code", fnco.a.d);
        persistableBundle0.putInt("response_id", fnco.a.f);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fnco)) {
            return false;
        }
        fnco fnco0 = (fnco)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0x2BA6879A;
    }

    @Override
    public final String toString() {
        return "FRP_CHALLENGE_SKIPPED";
    }
}

