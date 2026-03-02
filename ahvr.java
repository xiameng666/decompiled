import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahvr implements azys {
    public final ahwl a;
    public final Account b;
    public final String c;
    public final String d;

    public ahvr(ahwl ahwl0, Account account0, String s, String s1) {
        this.a = ahwl0;
        this.b = account0;
        this.c = s;
        this.d = s1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahvx ahvx0 = new ahvx(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.C(ahvx0, this.b, this.c, true, this.d, apiMetadata0);
    }
}

