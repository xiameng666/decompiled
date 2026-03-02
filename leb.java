public final class leb implements lct {
    private final lad a;
    private final icig b;
    private final icta c;

    public leb(String s) {
        ibuq.f(s, "filePath");
        super();
        this.c = new icta();
        this.a = new lad();
        this.b = new icht(new lea(null));
    }

    @Override  // lct
    public final Object a(ibrl ibrl0) {
        return new Integer(this.a.a());
    }

    @Override  // lct
    public final Object b(ibrl ibrl0) {
        return new Integer(this.a.a.incrementAndGet());
    }

    @Override  // lct
    public final Object c(ibts ibts0, ibrl ibrl0) {
        icta icta0;
        ldy ldy0;
        if((ibrl0 instanceof ldy)) {
            ldy0 = (ldy)ibrl0;
            int v = ldy0.d;
            if((v & 0x80000000) == 0) {
                ldy0 = new ldy(this, ibrl0);
            }
            else {
                ldy0.d = v - 0x80000000;
            }
        }
        else {
            ldy0 = new ldy(this, ibrl0);
        }
        Object object0 = ldy0.b;
        Object object1 = ibrx.a;
        switch(ldy0.d) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.c;
                ldy0.a = ibts0;
                ldy0.e = icta0;
                ldy0.d = 1;
                if(icta0.b(ldy0) == object1) {
                    return object1;
                }
                goto label_23;
            }
            case 1: {
                icta0 = ldy0.e;
                ibts0 = (ibts)ldy0.a;
                ibnx.b(object0);
                try {
                label_23:
                    ldy0.a = icta0;
                    ldy0.e = null;
                    ldy0.d = 2;
                    object0 = ibts0.a(ldy0);
                    if(object0 == object1) {
                        return object1;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    icta0.d();
                    throw throwable0;
                }
                return object1;
            }
            case 2: {
                icta0 = (icta)ldy0.a;
                try {
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    icta0.d();
                    throw throwable0;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta0.d();
        return object0;
    }

    @Override  // lct
    public final Object d(ibtw ibtw0, ibrl ibrl0) {
        Throwable throwable1;
        boolean z1;
        icta icta1;
        Object object2;
        ldz ldz0;
        if((ibrl0 instanceof ldz)) {
            ldz0 = (ldz)ibrl0;
            int v = ldz0.d;
            if((v & 0x80000000) == 0) {
                ldz0 = new ldz(this, ibrl0);
            }
            else {
                ldz0.d = v - 0x80000000;
            }
        }
        else {
            ldz0 = new ldz(this, ibrl0);
        }
        Object object0 = ldz0.b;
        Object object1 = ibrx.a;
        switch(ldz0.d) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.c;
                boolean z = icta0.c();
                try {
                    ldz0.e = icta0;
                    ldz0.a = z;
                    ldz0.d = 1;
                    object2 = ibtw0.a(Boolean.valueOf(z), ldz0);
                }
                catch(Throwable throwable0) {
                    icta1 = icta0;
                    z1 = z;
                    throwable1 = throwable0;
                    goto label_37;
                }
                if(object2 != object1) {
                    icta1 = icta0;
                    z1 = z;
                    object0 = object2;
                    break;
                }
                return object1;
            }
            case 1: {
                try {
                    z1 = ldz0.a;
                    icta1 = ldz0.e;
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
            label_37:
                if(z1) {
                    icta1.d();
                }
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(z1) {
            icta1.d();
        }
        return object0;
    }

    @Override  // lct
    public final icig e() {
        return this.b;
    }
}

