final class ebuz extends ibsl implements ibtw {
    final ebva a;

    public ebuz(ebva ebva0, ibrl ibrl0) {
        this.a = ebva0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebuz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebuz(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ebva ebva0 = this.a;
        String s = ebva0.c;
        ibuq.f(s, "receiverPackageName");
        ibuq.f(s, "receiverPackageName");
        dzap dzap0 = (dzap)ebva0.a;
        dzai dzai0 = new dzai();
        hfuo hfuo0 = ((dyeq)dyzd.a(dzap.a, dzai0)).b;
        ibuq.e(hfuo0, "getBroadcastQueueList(...)");
        Long long0 = (Long)ibxv.h(new ibym(new ibxm(new ibxo(ibpo.aA(hfuo0), new dzaj(), ibye.a), true, new dzak(s)), new dzal()));
        if(long0 == null) {
            ibuq.f(s, "receiverPackageName");
            dzam dzam0 = new dzam(dzap0, s);
            long0 = (Long)dyzd.a(dzap.b, dzam0);
        }
        return long0 == null ? null : new ebuy(((long)long0), ebva0.b);
    }
}

