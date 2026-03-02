import j..util.Objects;

final class cyrw extends gxum {
    final cysc a;
    final int b;

    public cyrw(cysc cysc0, int v) {
        this.b = v;
        Objects.requireNonNull(cysc0);
        this.a = cysc0;
        super("WearOsTriggerStopScan");
    }

    @Override
    public final void run() {
        cysc cysc0 = this.a;
        if(cysc0.o) {
            cxnb cxnb0 = cysc0.b;
            if(!cxnb0.n()) {
                cysc0.e.b(7, cysc0.k);
                return;
            }
            ((ggtj)cysc0.n.d().ar(8059)).B("WearScannerHelper: stopScan, stopScanReason=%s", cysb.a(this.b));
            cysc0.o = false;
            cxnb0.h(cxna.u);
            cysc0.e.b(this.b, cysc0.k);
            if(this.b == 6) {
                Objects.requireNonNull(cysc0);
                cysc0.i(new cyrv(cysc0), hvpg.a.aY().dv());
            }
        }
    }
}

