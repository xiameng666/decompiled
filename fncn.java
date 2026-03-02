import android.os.PersistableBundle;

public final class fncn extends fncs {
    public static final fncn a;

    static {
        fncn.a = new fncn();
    }

    private fncn() {
        super(1, 6);
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("result_code", fncn.a.d);
        persistableBundle0.putInt("response_id", fncn.a.f);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fncn)) {
            return false;
        }
        fncn fncn0 = (fncn)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return -1260083026;
    }

    @Override
    public final String toString() {
        return "FRP_CHALLENGE_RESOLVED";
    }
}

