import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.firebase.pnv.internal.api.DigitalCredentialPayloadResult;
import com.google.firebase.pnv.internal.api.VerificationSupportResultInternal;
import com.google.firebase.pnv.internal.api.VerifiedPhoneNumberTokenResultInternal;

public final class gpfu extends wbx implements IInterface {
    public gpfu(IBinder iBinder0) {
        super(iBinder0, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }

    public final void a(Status status0, VerifiedPhoneNumberTokenResultInternal verifiedPhoneNumberTokenResultInternal0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, verifiedPhoneNumberTokenResultInternal0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(5, parcel0);
    }

    public final void b(Status status0, DigitalCredentialPayloadResult digitalCredentialPayloadResult0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, digitalCredentialPayloadResult0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(4, parcel0);
    }

    public final void c(Status status0, VerificationSupportResultInternal verificationSupportResultInternal0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, verificationSupportResultInternal0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(3, parcel0);
    }
}

