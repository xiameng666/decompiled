import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class aqgd implements azys {
    public final aqgg a;
    public final Account b;

    public aqgd(aqgg aqgg0, Account account0) {
        this.a = aqgg0;
        this.b = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        asae asae0 = (asae)object0;
        asar asar0 = new asar(this.a, ((evqp)object1));
        asav asav0 = (asav)asae0.H();
        ApiMetadata apiMetadata0 = cclr.a(asae0.r);
        asav0.c(asar0, this.b, apiMetadata0);
    }
}

