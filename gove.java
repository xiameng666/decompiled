import android.content.Context;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberEnrollmentAidlRequest;

public final class gove extends goua {
    private final StartMfaPhoneNumberEnrollmentAidlRequest e;

    public gove(String s, String s1, goxi goxi0, StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest0, goxg goxg0) {
        super(s, s1, goxi0, goxg0, "VerifyPhoneNumberForMfaEnrollmentOperation");
        this.e = startMfaPhoneNumberEnrollmentAidlRequest0;
    }

    @Override  // goua
    protected final void b(Context context0, gowy gowy0) {
        batl.q(this.e.b);
        gotb.b(new goyt(this.e.a, this.e.b, this.e.c), context0, this.b, gowy0, this.a, this.e.b, this.e.d, this.e.e, this.e.f);
    }
}

