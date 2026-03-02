import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahux implements azys {
    public final ahwl a;
    public final String b;
    public final String c;
    public final Account d;

    public ahux(ahwl ahwl0, String s, String s1, Account account0) {
        this.a = ahwl0;
        this.b = s;
        this.c = s1;
        this.d = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahwh ahwh0 = new ahwh(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.F(ahwh0, this.b, this.c, this.d, apiMetadata0);
    }
}

