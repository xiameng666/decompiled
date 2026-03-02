public final class buyb {
    public final fnle a;
    public final buus b;
    public final fnkt c;
    public final icck d;
    public final fnlf e;
    public ibts f;
    public ibth g;
    public final icnj h;
    public final fnjf i;
    public final icnl j;

    public buyb(fnle fnle0, buus buus0, fnkt fnkt0, icck icck0) {
        ibuq.f(fnle0, "accountMenuManager");
        ibuq.f(buus0, "selectedAccountRepository");
        super();
        this.a = fnle0;
        this.b = buus0;
        this.c = fnkt0;
        this.d = icck0;
        ibuq.e(fnle0.b, "accountsModel(...)");
        this.e = fnle0.b;
        icnl icnl0 = icnm.a(null);
        this.j = icnl0;
        this.h = new icmp(icnl0);
        this.i = new buxy(this);
    }

    public final Object a(ibrl ibrl0) {
        buya buya0;
        if((ibrl0 instanceof buya)) {
            buya0 = (buya)ibrl0;
            int v = buya0.c;
            if((v & 0x80000000) == 0) {
                buya0 = new buya(this, ibrl0);
            }
            else {
                buya0.c = v - 0x80000000;
            }
        }
        else {
            buya0 = new buya(this, ibrl0);
        }
        Object object0 = buya0.a;
        Object object1 = ibrx.a;
        switch(buya0.c) {
            case 0: {
                ibnx.b(object0);
                buya0.c = 1;
                object0 = buvd.a(this.b, buya0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        fnlf fnlf0 = this.e;
        ggqk ggqk0 = fnlf0.f().E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            fntm fntm0 = (fntm)ggqk0.next();
            if(fntm0.c.equals(((String)object0))) {
                fnlf0.h(fntm0);
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

