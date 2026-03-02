import android.accounts.Account;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahvh implements azys {
    public final ahwl a;
    public final SaveAccountLinkingTokenRequest b;
    public final String c;
    public final String d;
    public final Account e;
    public final String f;

    public ahvh(ahwl ahwl0, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest0, String s, String s1, Account account0, String s2) {
        this.a = ahwl0;
        this.b = saveAccountLinkingTokenRequest0;
        this.c = s;
        this.d = s1;
        this.e = account0;
        this.f = s2;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahvu ahvu0 = new ahvu(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.b(ahvu0, this.b, this.c, this.d, this.e, this.f, apiMetadata0);
    }
}

