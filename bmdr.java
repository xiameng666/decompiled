import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class bmdr implements azys {
    public final bmdz a;
    public final Account b;
    public final String c;
    public final byte[] d;

    public bmdr(bmdz bmdz0, Account account0, String s, byte[] arr_b) {
        this.a = bmdz0;
        this.b = account0;
        this.c = s;
        this.d = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmcv bmcv0 = (bmcv)object0;
        bmdv bmdv0 = new bmdv(this.a, ((evqp)object1));
        bmcy bmcy0 = (bmcy)bmcv0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmcv0.r);
        bmcy0.b(bmdv0, this.b, this.c, this.d, apiMetadata0);
    }
}

