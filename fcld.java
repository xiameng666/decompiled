public final class fcld implements evqf {
    public final fcln a;

    public fcld(fcln fcln0) {
        this.a = fcln0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        fcln fcln0 = this.a;
        if(((ffbt)object0).c) {
            fcln0.c();
            return;
        }
        int v = ffbs.a(((ffbt)object0).d);
        if(v == 0) {
            v = 1;
        }
        switch(v - 1) {
            case 1: {
                fcln.a.j("Waiting for charging to start restore.", new Object[0]);
                fcli fcli0 = new fcli(fcln0);
                fcln0.c.d(fcli0).A(new fclj(fcln0, "Failed to set observer for ready_to_restore message", 4));
                fcln0.b(fclm.g);
                return;
            }
            case 2: {
                return;
            }
            default: {
                fcln0.e(4, null);
            }
        }
    }
}

