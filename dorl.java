import android.accounts.Account;
import com.google.android.gms.pay.GetClosedLoopBundleRequest;

public final class dorl implements azys {
    public final Account a;
    public final long b;
    public final azts c;

    public dorl(azts azts0, Account account0, long v) {
        this.c = azts0;
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        GetClosedLoopBundleRequest getClosedLoopBundleRequest0 = new GetClosedLoopBundleRequest();
        getClosedLoopBundleRequest0.a = this.a;
        getClosedLoopBundleRequest0.b = this.b;
        donm0.v(getClosedLoopBundleRequest0, new dosd(this.c, ((evqp)object1)), cclr.a(dota0.r));
    }
}

