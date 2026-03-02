public final class awe implements bkp {
    public final awk a;

    public awe(awk awk0) {
        this.a = awk0;
    }

    @Override  // bkp
    public final void a(bkq bkq0) {
        Object object0;
        try {
            awk awk0 = this.a;
            bcn bcn0 = bkq0.f();
            if(bcn0 != null) {
                brf brf0 = awk0.j;
                bhv bhv0 = bhw.a(bcn0.e());
                if(bhv0 != null && (bhv0.d() == bhr.f || bhv0.d() == bhr.d) && bhv0.c() == bhq.e && bhv0.e() == bhs.d) {
                    synchronized(brf0.b) {
                        object0 = brf0.a.size() < 3 ? null : brf0.a();
                        brf0.a.addFirst(bcn0);
                    }
                    if(object0 != null) {
                        awg.a(object0);
                    }
                }
                else {
                    awg.a(bcn0);
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
            bcs.a("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + illegalStateException0.getMessage());
        }
    }
}

