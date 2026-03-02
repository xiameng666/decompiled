import android.content.Context;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;

public final class govf extends goua {
    private final StartMfaPhoneNumberSignInAidlRequest e;

    public govf(String s, String s1, goxi goxi0, StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest0, goxg goxg0) {
        super(s, s1, goxi0, goxg0, "VerifyPhoneNumberForMfaSignInOperation");
        this.e = startMfaPhoneNumberSignInAidlRequest0;
    }

    @Override  // goua
    protected final void b(Context context0, gowy gowy0) {
        StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest0 = this.e;
        String s = startMfaPhoneNumberSignInAidlRequest0.a.a;
        String s1 = startMfaPhoneNumberSignInAidlRequest0.a.d;
        batl.q(s1);
        goyv goyv0 = new goyv(startMfaPhoneNumberSignInAidlRequest0.b, s, s1, startMfaPhoneNumberSignInAidlRequest0.c);
        String s2 = goss.a.a(context0, goyv0.a, goyv0.b);
        if(s2 == null) {
            s2 = goyv0.d;
        }
        gotb.b(goyv0, context0, this.b, gowy0, this.a, s2, startMfaPhoneNumberSignInAidlRequest0.d, startMfaPhoneNumberSignInAidlRequest0.e, startMfaPhoneNumberSignInAidlRequest0.f);
    }
}

