import android.accounts.Account;

public final class buuk {
    private final buus a;
    private final cchj b;

    public buuk(buus buus0, cchj cchj0) {
        ibuq.f(buus0, "selectedAccountRepository");
        ibuq.f(cchj0, "gmsAccountManager");
        super();
        this.a = buus0;
        this.b = cchj0;
    }

    public final Object a(ibrl ibrl0) {
        buuj buuj0;
        if((ibrl0 instanceof buuj)) {
            buuj0 = (buuj)ibrl0;
            int v = buuj0.c;
            if((v & 0x80000000) == 0) {
                buuj0 = new buuj(this, ibrl0);
            }
            else {
                buuj0.c = v - 0x80000000;
            }
        }
        else {
            buuj0 = new buuj(this, ibrl0);
        }
        Object object0 = buuj0.a;
        Object object1 = ibrx.a;
        switch(buuj0.c) {
            case 0: {
                ibnx.b(object0);
                buuj0.c = 1;
                object0 = buvd.a(this.a, buuj0);
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
        if(((String)object0) != null) {
            Account[] arr_account = this.b.p("com.google");
            ibuq.e(arr_account, "getAccountsByType(...)");
            for(int v1 = 0; v1 < arr_account.length; ++v1) {
                Object object2 = arr_account[v1];
                if(ibuq.m(object2.name, ((String)object0))) {
                    return object2;
                }
            }
        }
        return null;
    }
}

