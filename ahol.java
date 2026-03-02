import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahol implements azys {
    public final ahow a;
    public final String b;
    public final Account c;
    public final hery d;

    public ahol(ahow ahow0, String s, Account account0, hery hery0) {
        this.a = ahow0;
        this.b = s;
        this.c = account0;
        this.d = hery0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahnf ahnf0 = (ahnf)object0;
        ahos ahos0 = new ahos(this.a, ((evqp)object1));
        ahnk ahnk0 = (ahnk)ahnf0.H();
        byte[] arr_b = this.d.toBytesArray();
        ApiMetadata apiMetadata0 = cclr.a(ahnf0.r);
        ahnk0.g(ahos0, this.b, this.c, arr_b, apiMetadata0);
    }
}

