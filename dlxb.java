public final class dlxb implements dmba {
    private static final bboh a;
    private final dmce b;

    static {
        dlxb.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlxb(dmce dmce0) {
        this.b = dmce0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 3, "Cannot evaluate this filter, since it does not have a ClickCountFilter");
        hjsf hjsf0 = hjwe0.b == 3 ? ((hjsf)hjwe0.c) : hjsf.a;
        try {
            return this.b.a(hjrn0, dlud.d) <= ((long)hjsf0.b);
        }
        catch(dmhl dmhl0) {
            a.ae(dlxb.a.i(), "Failed to get interactions count.", dmhl0);
            return 0L <= ((long)hjsf0.b);
        }
    }
}

