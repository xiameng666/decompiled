import android.os.PersistableBundle;

public enum rkc implements scz {
    USER_CANCELLED(1),
    RESULT_NO_LONGER_NEEDED(2),
    UNKNOWN(-1);

    public static final rkb a;
    public final int f;

    static {
        rkc.g = arr_rkc;
        rkc.e = ibsn.a(arr_rkc);
        rkc.a = new rkb();
    }

    private rkc(int v1) {
        this.f = v1;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("type", this.f);
        return persistableBundle0;
    }
}

