public final class lcd {
    public final icnl a;

    public lcd() {
        this.a = icnm.a(lef.a);
    }

    public final lec a() {
        return (lec)this.a.b();
    }

    public final void b(lec lec0) {
        ibuq.f(lec0, "newState");
        do {
            icnl icnl0 = this.a;
            Object object0 = icnl0.b();
            lec lec1 = (lec)object0;
            if((lec1 instanceof ldo) || ibuq.m(lec1, lef.a)) {
                lec1 = lec0;
            }
            else if(!(lec1 instanceof lah)) {
                if(!(lec1 instanceof lcs)) {
                    throw new ibnq();
                }
            }
            else if(lec0.c > ((lah)lec1).c) {
                lec1 = lec0;
            }
        }
        while(!icnl0.h(object0, lec1));
    }
}

