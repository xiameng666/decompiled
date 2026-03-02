public final class dvrp implements evqc {
    public final dvsn a;

    public dvrp(dvsn dvsn0) {
        this.a = dvsn0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dvsn.a.i(), "Failed to fetch valuables from database.", exception0);
        this.a.Q();
    }
}

