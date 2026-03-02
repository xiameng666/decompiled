import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahyj extends wbx implements ahyl {
    public ahyj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverInternal");
    }

    @Override  // ahyl
    public final RequestResult a(String s, VerificationToken verificationToken0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        wbz.f(parcel0, verificationToken0);
        wbz.f(parcel0, apiMetadata0);
        Parcel parcel1 = this.hM(1, parcel0);
        RequestResult requestResult0 = (RequestResult)wbz.a(parcel1, RequestResult.CREATOR);
        parcel1.recycle();
        return requestResult0;
    }

    @Override  // ahyl
    public final void b(SmsRetrieverEvent smsRetrieverEvent0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, smsRetrieverEvent0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(3, parcel0);
    }

    @Override  // ahyl
    public final void c(ConsentPromptUserResponse consentPromptUserResponse0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, consentPromptUserResponse0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(2, parcel0);
    }
}

