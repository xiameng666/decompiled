import android.accounts.Account;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public final class ahuu implements azys {
    public final ahwl a;
    public final Account b;
    public final List c;
    public final String d;
    public final BeginSignInRequest e;

    public ahuu(ahwl ahwl0, Account account0, List list0, String s, BeginSignInRequest beginSignInRequest0) {
        this.a = ahwl0;
        this.b = account0;
        this.c = list0;
        this.d = s;
        this.e = beginSignInRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahvv ahvv0 = new ahvv(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.d(ahvv0, this.b, this.c, this.d, this.e, apiMetadata0);
    }
}

