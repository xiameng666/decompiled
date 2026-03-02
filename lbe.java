public final class lbe implements icih {
    final icih a;

    public lbe(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        lbd lbd0;
        if((ibrl0 instanceof lbd)) {
            lbd0 = (lbd)ibrl0;
            int v = lbd0.b;
            if((v & 0x80000000) == 0) {
                lbd0 = new lbd(this, ibrl0);
            }
            else {
                lbd0.b = v - 0x80000000;
            }
        }
        else {
            lbd0 = new lbd(this, ibrl0);
        }
        Object object1 = lbd0.a;
        Object object2 = ibrx.a;
        switch(lbd0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if((((lec)object0) instanceof ldo)) {
                    throw ((ldo)(((lec)object0))).a;
                }
                if((((lec)object0) instanceof lah)) {
                    lbd0.b = 1;
                    return icih0.a(((lah)(((lec)object0))).a, lbd0) == object2 ? object2 : ibom.a;
                }
                if(!(((lec)object0) instanceof lcs) && !(((lec)object0) instanceof lef)) {
                    throw new ibnq();
                }
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

