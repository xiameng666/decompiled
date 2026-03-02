public final class bfew {
    public final grrq a;
    private static final bboh b;
    private final ibrt c;

    static {
        bfew.b = bboh.b("PWMPasswordSharingRecipientsProvider", bbcu.cX);
    }

    public bfew(grrq grrq0, ibrt ibrt0) {
        this.a = grrq0;
        this.c = ibrt0;
    }

    static Object a(bfew bfew0, ibrl ibrl0) {
        bfeu bfeu0;
        if((ibrl0 instanceof bfeu)) {
            bfeu0 = (bfeu)ibrl0;
            int v = bfeu0.c;
            if((v & 0x80000000) == 0) {
                bfeu0 = new bfeu(bfew0, ibrl0);
            }
            else {
                bfeu0.c = v - 0x80000000;
            }
        }
        else {
            bfeu0 = new bfeu(bfew0, ibrl0);
        }
        Object object0 = bfeu0.a;
        Object object1 = ibrx.a;
        switch(bfeu0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bfeu0.c = 1;
                    bfev bfev0 = new bfev(bfew0, null);
                    object0 = icbd.a(bfew0.c, bfev0, bfeu0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    if(((grqu)object0) == null) {
                        ((ggtj)bfew.b.j()).x("`listPasswordSharingRecipients` rpc didn\'t fail, but the result was `null`.");
                        return bffd.a;
                    }
                    if(((grqu)object0).b.isEmpty()) {
                        return bffe.a;
                    }
                    hfuo hfuo0 = ((grqu)object0).b;
                    ibuq.e(hfuo0, "getRecipientsList(...)");
                    return new bffg(hfuo0);
                }
                catch(iapn iapn0) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(iapn0.a.t == iapk.g.t) {
            return bfff.a;
        }
        a.ae(bfew.b.j(), "`listPasswordSharingRecipients` rpc failed with unexpected status code.", iapn0);
        return bffd.a;
    }
}

