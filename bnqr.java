import android.accounts.Account;

public final class bnqr implements gfsi {
    public final cljp a;

    public bnqr(cljp cljp0) {
        this.a = cljp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggqj ggqj0 = ((ggfp)object0).om();
        while(ggqj0.hasNext()) {
            Object object1 = ggqj0.next();
            bprs.j(this.a, ((Account)object1));
        }
        return null;
    }
}

