import android.content.Context;
import com.google.android.gms.credential.manager.smsotpretrieval.SmsOtpRetrievalConsentDialogChimeraActivity;
import j..util.Objects;

final class bgjn implements acl {
    final bgjo a;

    public bgjn(bgjo bgjo0) {
        Objects.requireNonNull(bgjo0);
        this.a = bgjo0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        bgjo bgjo0 = this.a;
        if(!bgjo0.j) {
            bgjo0.j = true;
            bgjt bgjt0 = (bgjt)bgjo0.h();
            SmsOtpRetrievalConsentDialogChimeraActivity smsOtpRetrievalConsentDialogChimeraActivity0 = (SmsOtpRetrievalConsentDialogChimeraActivity)bgjo0;
            bgjt0.g();
        }
    }
}

