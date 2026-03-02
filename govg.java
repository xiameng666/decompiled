import android.content.Context;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

public final class govg extends goua {
    private final SendVerificationCodeRequest e;

    public govg(String s, String s1, goxi goxi0, SendVerificationCodeRequest sendVerificationCodeRequest0, goxg goxg0) {
        super(s, s1, goxi0, goxg0, "VerifyPhoneNumberOperation");
        this.e = sendVerificationCodeRequest0;
    }

    @Override  // goua
    protected final void b(Context context0, gowy gowy0) {
        gotb.b(this.e, context0, this.b, gowy0, this.a, this.e.a, this.e.b, this.e.c, false);
    }
}

