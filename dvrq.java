public final class dvrq implements evpz {
    public final dvsn a;

    public dvrq(dvsn dvsn0) {
        this.a = dvsn0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        dvsn dvsn0 = this.a;
        xob xob0 = dvsn0.an();
        if(xob0 != null && !xob0.isFinishing()) {
            dvsn0.aT.aS(dvsn0.aC).x(xob0, new dvrt(dvsn0));
            return;
        }
        ((ggtj)dvsn.a.i()).x("Could not find activity.");
    }
}

