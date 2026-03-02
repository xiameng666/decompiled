public final class dlxv implements dmba {
    private static final bboh a;
    private final dmce b;

    static {
        dlxv.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlxv(dmce dmce0) {
        this.b = dmce0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b == 57) {
            try {
                return this.b.a(hjrn0, dlud.c) <= ((long)(hjwe0.b == 57 ? ((hjsx)hjwe0.c) : hjsx.a).b);
            }
            catch(dmhl dmhl0) {
                a.ae(dlxv.a.i(), "Failed to get interactions count.", dmhl0);
                return 0L <= ((long)(hjwe0.b == 57 ? ((hjsx)hjwe0.c) : hjsx.a).b);
            }
        }
        throw new IllegalArgumentException("Cannot evaluate filter that is not DismissCountFilter");
    }
}

