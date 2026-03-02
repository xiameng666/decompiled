import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahva implements azys {
    public final ahwl a;
    public final Account b;

    public ahva(ahwl ahwl0, Account account0) {
        this.a = ahwl0;
        this.b = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahwe ahwe0 = new ahwe(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.x(ahwe0, this.b, apiMetadata0);
    }
}

