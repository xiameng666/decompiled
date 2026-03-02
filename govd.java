import android.content.Context;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;

public final class govd extends goua {
    private final VerifyBeforeUpdateEmailAidlRequest e;

    public govd(String s, String s1, goxi goxi0, VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest0, goxg goxg0) {
        super(s, s1, goxi0, goxg0, "VerifyBeforeUpdateEmail");
        this.e = verifyBeforeUpdateEmailAidlRequest0;
    }

    @Override  // goua
    protected final void b(Context context0, gowy gowy0) {
        batl.q(this.e.a);
        batl.q(this.e.b);
        batl.s(this.e.c);
        gowy0.c(new goye(gqqm.h, this.e.c, this.e.b, this.e.a), this.a);
    }
}

