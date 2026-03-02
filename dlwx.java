public final class dlwx implements dmba {
    private final dxxm a;

    public dlwx(dxxm dxxm0) {
        this.a = dxxm0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 50, "Cannot evaluate filter that is not authentication user cohort filter.");
        hhki hhki0 = this.a.a();
        if(hhki0 == null) {
            return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.g) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.g);
        }
        switch(hhki0.ordinal()) {
            case 0: {
                return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.a) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.a);
            }
            case 1: {
                return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.b) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.b);
            }
            case 2: {
                return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.c) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.c);
            }
            case 3: {
                return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.d) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.d);
            }
            case 4: {
                return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.e) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.e);
            }
            case 5: {
                return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.f) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.f);
            }
            default: {
                return hjwe0.b == 50 ? new hfuh(((hjrg)hjwe0.c).c, hjrg.a).contains(hjrf.g) : new hfuh(hjrg.b.c, hjrg.a).contains(hjrf.g);
            }
        }
    }
}

