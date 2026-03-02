public final class dlxf implements dmba {
    private final dmck a;

    public dlxf(dmck dmck0) {
        this.a = dmck0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 18, "Cannot evaluate filter that is not closed loop transit agency nearby filter.");
        return (hjwe0.b == 18 ? ((hjsn)hjwe0.c) : hjsn.a).b && this.a.a();
    }
}

