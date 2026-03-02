import android.accounts.Account;
import com.google.android.gms.nearby.sharing.DeviceVisibility;

public final class ddgq implements ibtw {
    public final DeviceVisibility a;
    public final Account b;
    public final ibth c;
    public final int d;

    public ddgq(DeviceVisibility deviceVisibility0, Account account0, ibth ibth0, int v) {
        this.a = deviceVisibility0;
        this.b = account0;
        this.c = ibth0;
        this.d = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddhe.e(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1));
        return ibom.a;
    }
}

