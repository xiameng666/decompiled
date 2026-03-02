final class byod extends ibsl implements ibtw {
    final byof a;
    final byak b;

    public byod(byof byof0, byak byak0, ibrl ibrl0) {
        this.a = byof0;
        this.b = byak0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byod)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byod(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v1;
        ibnx.b(object0);
        long v = this.a.a();
        byak byak0 = this.b;
        ibuq.f(byak0, "uiEvent");
        if(bxzl.b() != null) {
            ibuq.f(byak0, "uiEvent");
            switch(byak0.ordinal()) {
                case 0: {
                    v1 = 0;
                    break;
                }
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    break;
                }
                case 3: {
                    v1 = 3;
                    break;
                }
                case 4: {
                    v1 = 4;
                    break;
                }
                case 5: {
                    v1 = 5;
                    break;
                }
                case 6: {
                    v1 = 6;
                    break;
                }
                case 7: {
                    v1 = 7;
                    break;
                }
                case 8: {
                    v1 = 8;
                    break;
                }
                case 9: {
                    v1 = 9;
                    break;
                }
                case 10: {
                    v1 = 10;
                    break;
                }
                case 11: {
                    v1 = 11;
                    break;
                }
                case 12: {
                    v1 = 12;
                    break;
                }
                case 13: {
                    v1 = 13;
                    break;
                }
                case 14: {
                    v1 = 14;
                    break;
                }
                case 15: {
                    v1 = 15;
                    break;
                }
                case 16: {
                    v1 = 16;
                    break;
                }
                case 17: {
                    v1 = 17;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            bxzi.a(211802, v, v1);
        }
        return ibom.a;
    }
}

