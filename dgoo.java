final class dgoo extends ibsl implements ibtw {
    int a;
    final dgop b;
    final ichm c;
    private Object d;

    public dgoo(dgop dgop0, ichm ichm0, ibrl ibrl0) {
        this.b = dgop0;
        this.c = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgoo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgoo(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dgna dgna0;
        icck icck0;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            icck0 = (icck)this.d;
            ibnx.b(object0);
            goto label_13;
        }
        ibnx.b(object0);
        icck icck1 = (icck)this.d;
        this.d = icck1;
        this.a = 1;
        Object object2 = this.b.c.c(this);
        if(object2 != object1) {
            icck0 = icck1;
            object0 = object2;
        label_13:
            dgop dgop0 = this.b;
            ichm ichm0 = this.c;
            dgff dgff0 = (dgff)object0;
            synchronized(icck0) {
                icnl icnl0 = dgop0.k;
                dgnb dgnb0 = (dgnb)icnl0.b();
                if(!(dgff0 instanceof dgeh)) {
                    if(ibuq.m(dgff0, dgfz.a)) {
                        dgop0.i(gyzg.w);
                        dgmr.c(ichm0, dgme.a);
                    }
                    else if(ibuq.m(dgff0, dggk.a)) {
                        dgop0.i(gyzg.x);
                        dgmr.c(ichm0, dgmf.a);
                    }
                    else if(!ibuq.m(dgff0, dgfm.a) && !ibuq.m(dgff0, dggm.a)) {
                        if(dgff0 != null) {
                            throw new ibnq();
                        }
                        dcvz.a.e().p("Times out since no response is received.", new Object[0]);
                        if((dgnb0 instanceof dgna) && !((dgna)dgnb0).c) {
                            dgop0.i(gyzg.x);
                            dgop0.h(dgmf.a);
                        }
                    }
                    else {
                        dcvz.a.e().h("Received response %s, which doesn\'t apply to Receiver.", dgff0);
                        dgop0.i(gyzg.D);
                        dgop0.h(dgmg.a);
                    }
                }
                else if((dgnb0 instanceof dgna)) {
                    do {
                        Object object3 = icnl0.b();
                        dgnb dgnb1 = (dgnb)object3;
                        if(((dgna)dgnb0).b) {
                            ichm ichm1 = dgop0.m;
                            if(ichm1 != null) {
                                dgmr.c(ichm1, dglv.a);
                            }
                            dgna0 = new dgmx(((dgna)dgnb0).a);
                        }
                        else {
                            dgna0 = dgna.b(((dgna)dgnb0), false, true, 3);
                        }
                    }
                    while(!icnl0.h(object3, dgna0));
                }
            }
            return ibom.a;
        }
        return object1;
    }
}

