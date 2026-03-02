import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.GetCachedDevicesRequest;
import java.util.concurrent.Executor;

public final class bplx implements bpnj {
    private final fquu a;
    private final Executor b;

    public bplx(fquu fquu0, Executor executor0) {
        this.a = fquu0;
        this.b = executor0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        Account account0 = ((GetCachedDevicesRequest)object0).a;
        if(account0 == null) {
            cjuh cjuh0 = new cjuh(13, "Account is null", null);
            cjuh0.b = true;
            return gmbu.h(cjuh0);
        }
        return gdtf.j(this.a.i(account0), new bplw(), this.b);
    }
}

