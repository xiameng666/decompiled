import android.accounts.Account;

public final class dlou {
    public final ibrt a;
    public final dyac b;

    public dlou(ibrt ibrt0, dyac dyac0) {
        this.a = ibrt0;
        this.b = dyac0;
    }

    public final Object a(Account account0, ibrl ibrl0) {
        dlos dlos0;
        if((ibrl0 instanceof dlos)) {
            dlos0 = (dlos)ibrl0;
            int v = dlos0.c;
            if((v & 0x80000000) == 0) {
                dlos0 = new dlos(this, ibrl0);
            }
            else {
                dlos0.c = v - 0x80000000;
            }
        }
        else {
            dlos0 = new dlos(this, ibrl0);
        }
        Object object0 = dlos0.a;
        Object object1 = ibrx.a;
        switch(dlos0.c) {
            case 0: {
                ibnx.b(object0);
                dlot dlot0 = new dlot(this.b.a(account0), null);
                dlos0.c = 1;
                object0 = icbd.a(this.a, dlot0, dlos0);
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
        ibuq.e(object0, "withContext(...)");
        return object0;
    }
}

