import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public final class ahvm implements azys {
    public final ahwl a;
    public final Account b;
    public final String c;
    public final String d;
    public final List e;

    public ahvm(ahwl ahwl0, Account account0, String s, String s1, List list0) {
        this.a = ahwl0;
        this.b = account0;
        this.c = s;
        this.d = s1;
        this.e = list0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahsi ahsi0 = new ahsi(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.i(ahsi0, this.b, this.c, this.d, 6, this.e, apiMetadata0);
    }
}

