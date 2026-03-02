import android.accounts.Account;

public final class bvpl {
    public final bvpn a;

    public bvpl(bvpn bvpn0) {
        ibuq.f(bvpn0, "flexagonApiGrpc");
        super();
        this.a = bvpn0;
    }

    public static final baqr a(String s) {
        ibuq.f(s, "accountName");
        Account account0 = new Account(s, "com.google");
        baqr baqr0 = new baqr();
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        baqr0.a = bbmq.b;
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.l("https://www.googleapis.com/auth/mobile_user_preferences");
        return baqr0;
    }
}

