import com.android.onboarding.contracts.annotations.InternalOnboardingApi;

public enum rjz implements sdk {
    @ibni
    OTHER,
    @ibni
    INVISIBLE,
    @ibni
    LOADING,
    EDUCATION,
    INPUT,
    HOST,
    ERROR,
    @InternalOnboardingApi
    UNKNOWN;

    public static final rjy a;
    private final String m;

    static {
        rjz.l = arr_rjz;
        rjz.j = ibsn.a(arr_rjz);
        rjz.a = new rjy();
    }

    private rjz() {
        this.m = this.name();
    }

    @Override  // sdk
    public final String b() {
        return this.m;
    }
}

