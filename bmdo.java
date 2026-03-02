import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.concurrent.Executor;

public final class bmdo implements azys {
    public final bmdz a;
    public final Executor b;
    public final Account c;
    public final gfsx d;

    public bmdo(bmdz bmdz0, Executor executor0, Account account0, gfsx gfsx0) {
        this.a = bmdz0;
        this.b = executor0;
        this.c = account0;
        this.d = gfsx0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmcv bmcv0 = (bmcv)object0;
        bmda bmda0 = new bmda(this.a, ((evqp)object1), this.b);
        bmcy bmcy0 = (bmcy)bmcv0.H();
        byte[] arr_b = (byte[])this.d.g();
        ApiMetadata apiMetadata0 = cclr.a(bmcv0.r);
        bmcy0.e(bmda0, this.c, null, arr_b, apiMetadata0);
    }
}

