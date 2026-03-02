public final class ebim extends ebhb {
    public static final ebik a;
    public static final bboh b;
    public dtrf c;
    public ibrt d;

    static {
        ebim.a = new ebik();
        ebim.b = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // ebhb
    public final ftcg a() {
        if(hwfk.a.b().i()) {
            this.d().d(new ebil(this));
        }
        else {
            this.e();
        }
        ibuq.e(ftcg.a, "getDefaultInstance(...)");
        return ftcg.a;
    }

    public final dtrf d() {
        dtrf dtrf0 = this.c;
        if(dtrf0 != null) {
            return dtrf0;
        }
        ibuq.j("credmanRegistrationManager");
        return null;
    }

    public final void e() {
        this.d().f(new dtrd("SyncCredmanRegistryOperation: success", "SyncCredmanRegistryOperation: failure"));
    }
}

