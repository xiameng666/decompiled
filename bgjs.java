import androidx.activity.result.ActivityResult;
import com.google.android.gms.credential.manager.smsotpretrieval.SmsOtpRetrievalConsentDialogChimeraActivity;

public final class bgjs implements acn {
    public final SmsOtpRetrievalConsentDialogChimeraActivity a;

    public bgjs(SmsOtpRetrievalConsentDialogChimeraActivity smsOtpRetrievalConsentDialogChimeraActivity0) {
        this.a = smsOtpRetrievalConsentDialogChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        if(((ActivityResult)object0).a == -1) {
            ((ggtj)SmsOtpRetrievalConsentDialogChimeraActivity.k.h()).x("SMS retrieval consent activity finished successfully");
        }
        else {
            ((ggtj)SmsOtpRetrievalConsentDialogChimeraActivity.k.i()).x("SMS retrieval consent activity didn\'t finish successfully");
        }
        this.a.finish();
    }
}

