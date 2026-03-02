import android.accounts.Account;

public final class bpro implements glzn {
    public final cljp a;
    public final Account b;

    public bpro(cljp cljp0, Account account0) {
        this.a = cljp0;
        this.b = account0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Account account0 = this.b;
        cljp cljp0 = this.a;
        bprs.p(cljp0, account0, ((Boolean)object0).booleanValue());
        if(!((Boolean)object0).booleanValue()) {
            return gmbu.i(Boolean.valueOf(false));
        }
        bprs.o(cljp0, account0);
        return gmbu.i(Boolean.valueOf(true));
    }
}

