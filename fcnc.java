import android.accounts.Account;
import j..util.Collection.-EL;
import j..util.Optional;

public final class fcnc implements gfsi {
    public final String a;

    public fcnc(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Optional optional0 = Collection.-EL.stream(((gged_interceptors)object0)).filter(new fcmx(this.a)).findFirst();
        gftb.f(optional0.isPresent(), "Invalid account: %s", baun.q(this.a));
        return (Account)optional0.get();
    }
}

