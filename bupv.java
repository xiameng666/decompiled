import java.util.concurrent.CancellationException;

final class bupv extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final bupw d;
    private Object e;

    public bupv(bupw bupw0, ibrl ibrl0) {
        this.d = bupw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bupv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bupv(this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icnl icnl0;
        hivr hivr0;
        hivx hivx0;
        iccs iccs4;
        icnl icnl2;
        iccs iccs3;
        Object object1 = ibrx.a;
        Boolean boolean0 = Boolean.valueOf(false);
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                icck icck0 = (icck)this.e;
                try {
                    iccs iccs0 = icbb.a(icck0, null, null, new bups(this.d, null), 3);
                    iccs iccs1 = icbb.a(icck0, null, null, new bupt(this.d, null), 3);
                    iccs iccs2 = icbb.a(icck0, null, null, new bupu(this.d, null), 3);
                    icnl icnl1 = this.d.k;
                    this.e = iccs1;
                    this.a = iccs2;
                    this.b = icnl1;
                    this.c = 1;
                    Object object2 = iccs0.n(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    iccs3 = iccs2;
                    object0 = object2;
                    icnl2 = icnl1;
                    iccs4 = iccs1;
                    goto label_29;
                }
                catch(iapl iapl0) {
                    goto label_60;
                }
                catch(iapn iapn0) {
                    goto label_64;
                }
                catch(CancellationException cancellationException0) {
                    goto label_68;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                icnl2 = (icnl)this.b;
                iccs3 = (iccs)this.a;
                iccs4 = (iccs)this.e;
                try {
                    ibnx.b(object0);
                label_29:
                    ibnx.b(((ibnw)object0).a);
                    hivr hivr1 = (hivr)((ibnw)object0).a;
                    this.e = iccs3;
                    this.a = icnl2;
                    this.b = hivr1;
                    this.c = 2;
                    Object object3 = iccs4.n(this);
                    if(object3 == object1) {
                        return object1;
                    }
                    hivr0 = hivr1;
                    object0 = object3;
                    icnl0 = icnl2;
                    goto label_45;
                }
                catch(iapl iapl0) {
                    goto label_60;
                }
                catch(iapn iapn0) {
                    goto label_64;
                }
                catch(CancellationException cancellationException0) {
                    goto label_68;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                hivr0 = (hivr)this.b;
                icnl0 = (icnl)this.a;
                iccs3 = (iccs)this.e;
                try {
                    try {
                        ibnx.b(object0);
                    label_45:
                        ibnx.b(((ibnw)object0).a);
                        hivx hivx1 = (hivx)((ibnw)object0).a;
                        this.e = icnl0;
                        this.a = hivr0;
                        this.b = hivx1;
                        this.c = 3;
                        Object object4 = iccs3.n(this);
                        if(object4 == object1) {
                            return object1;
                        }
                        hivx0 = hivx1;
                        object0 = object4;
                    label_56:
                        ibnx.b(((ibnw)object0).a);
                        icnl0.g(new bupp(hivr0, hivx0, ((hiwb)((ibnw)object0).a)));
                    }
                    catch(iapl iapl0) {
                    label_60:
                        bupn bupn0 = new bupn(iapl0);
                        this.d.k.g(bupn0);
                    }
                    catch(iapn iapn0) {
                    label_64:
                        bupn bupn1 = new bupn(iapn0);
                        this.d.k.g(bupn1);
                    }
                    catch(CancellationException cancellationException0) {
                    label_68:
                        bupn bupn2 = new bupn(cancellationException0);
                        this.d.k.g(bupn2);
                    }
                    goto label_74;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                hivx0 = (hivx)this.b;
                hivr0 = (hivr)this.a;
                icnl0 = (icnl)this.e;
                try {
                    ibnx.b(object0);
                }
                catch(iapl iapl0) {
                    goto label_60;
                }
                catch(iapn iapn0) {
                    goto label_64;
                }
                catch(CancellationException cancellationException0) {
                    goto label_68;
                }
                catch(Throwable throwable0) {
                    break;
                }
                goto label_56;
            }
        }
        this.d.m.g(boolean0);
        throw throwable0;
    label_74:
        this.d.m.g(boolean0);
        return ibom.a;
    }
}

