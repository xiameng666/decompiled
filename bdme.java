final class bdme extends ibsl implements ibtw {
    int a;
    final bdmg b;

    public bdme(bdmg bdmg0, ibrl ibrl0) {
        this.b = bdmg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdme)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdme(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = bgkw.a(this.b.c, this.b.b, this);
            if(object0 == object1) {
                return object1;
            }
        }
        String s = ((bgku)object0) == null ? null : ((bgku)object0).b;
        bdmg bdmg0 = this.b;
        do {
            icnl icnl0 = bdmg0.l;
            Object object2 = icnl0.b();
            bdtu bdtu0 = (bdtu)object2;
            bdtu bdtu1 = (bdtu0 instanceof bdtr) ? bdtu0 : null;
            if(((bdtr)bdtu1) == null) {
                ((ggtj)bdmg.a.j()).R("Cannot apply update to state %s, because we expected state %s", new ibuk(bdtu0.getClass()).c(), new ibuk(bdtr.class).c());
            }
            else {
                bdtu0 = bdtr.c(((bdtr)bdtu1), s, false, false, false, false, false, 0x7E);
            }
        }
        while(!icnl0.h(object2, bdtu0));
        return ibom.a;
    }
}

