import com.google.android.gms.auth.aang.GetAccountsRequest;
import java.io.IOException;

public final class ahds implements bxmw {
    public final aheo a;

    public ahds(aheo aheo0) {
        this.a = aheo0;
    }

    @Override  // bxmw
    public final gmcd a() {
        actm actm0 = GetAccountsRequest.a();
        actm0.b("com.google");
        GetAccountsRequest getAccountsRequest0 = actm0.a();
        return bxsy.g(this.a.c.c(getAccountsRequest0)).k(new ahed(this.a)).e(new bxlw(IOException.class).d(0x6F35));
    }
}

