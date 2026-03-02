import android.accounts.Account;
import com.google.android.gms.nearby.sharing.DeviceVisibility;

public final class ddgn implements ibtw {
    public final DeviceVisibility a;
    public final String b;
    public final Account c;
    public final ibth d;
    public final ibth e;
    public final ibts f;
    public final int g;

    public ddgn(DeviceVisibility deviceVisibility0, String s, Account account0, ibth ibth0, ibth ibth1, ibts ibts0, int v) {
        this.a = deviceVisibility0;
        this.b = s;
        this.c = account0;
        this.d = ibth0;
        this.e = ibth1;
        this.f = ibts0;
        this.g = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddhe.d(this.a, this.b, this.c, this.d, this.e, this.f, ((goz)object0), gsc.a(this.g | 1));
        return ibom.a;
    }
}

