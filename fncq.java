import android.os.PersistableBundle;

public final class fncq extends fncs {
    public static final fncq a;

    static {
        fncq.a = new fncq();
    }

    private fncq() {
        super(1, 5);
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("result_code", fncq.a.d);
        persistableBundle0.putInt("response_id", fncq.a.f);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fncq)) {
            return false;
        }
        fncq fncq0 = (fncq)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return -878907922;
    }

    @Override
    public final String toString() {
        return "SKIP_ADD_ACCOUNT";
    }
}

