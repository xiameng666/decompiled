import android.accounts.Account;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahut implements azys {
    public final ahwl a;
    public final SaveAccountLinkingTokenRequest b;
    public final Account c;
    public final String d;

    public ahut(ahwl ahwl0, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest0, Account account0, String s) {
        this.a = ahwl0;
        this.b = saveAccountLinkingTokenRequest0;
        this.c = account0;
        this.d = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahrz ahrz0 = new ahrz(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.e(ahrz0, this.b, this.c, this.d, apiMetadata0);
    }
}

