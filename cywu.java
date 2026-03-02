final class cywu implements icih {
    final cyww a;

    public cywu(cyww cyww0) {
        this.a = cyww0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cyjh.a.d().R("%s: broadcastState update to %b", "TempBondManager", ((Boolean)object0));
        if(((Boolean)object0) != null && !((Boolean)object0).booleanValue()) {
            this.a.m.clear();
            this.a.m();
            return ibom.a;
        }
        return ibom.a;
    }
}

