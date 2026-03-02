public final class fckz implements evqf {
    public final fcln a;

    public fckz(fcln fcln0) {
        this.a = fcln0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        int v = ffao.b(((ffap)object0).c);
        if(v == 0) {
            v = 1;
        }
        fcln fcln0 = this.a;
        if(v - 1 != 1) {
            if(v - 1 != 2 && v - 1 != 3) {
                fcln0.e(3, new IllegalArgumentException("KeyRecoveryResultCode is unknown: " + ffao.a(v)));
                return;
            }
            fcln0.e(3, null);
            return;
        }
        fcln0.b(fclm.f);
    }
}

