import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class bmds implements azys {
    public final bmdz a;
    public final Account b;
    public final hery c;

    public bmds(bmdz bmdz0, Account account0, hery hery0) {
        this.a = bmdz0;
        this.b = account0;
        this.c = hery0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmcv bmcv0 = (bmcv)object0;
        bmdy bmdy0 = new bmdy(this.a, ((evqp)object1));
        bmcy bmcy0 = (bmcy)bmcv0.H();
        byte[] arr_b = this.c.toBytesArray();
        ApiMetadata apiMetadata0 = cclr.a(bmcv0.r);
        bmcy0.h(bmdy0, this.b, arr_b, apiMetadata0);
    }
}

