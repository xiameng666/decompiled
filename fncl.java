import android.os.PersistableBundle;

public final class fncl extends fncs {
    public static final fncl a;

    static {
        fncl.a = new fncl();
    }

    private fncl() {
        super(0, 3);
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("result_code", fncl.a.d);
        persistableBundle0.putInt("response_id", fncl.a.f);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fncl)) {
            return false;
        }
        fncl fncl0 = (fncl)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0x9A3D05B2;
    }

    @Override
    public final String toString() {
        return "CANCELLED";
    }
}

