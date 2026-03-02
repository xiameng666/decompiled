import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.firebase.pnv.internal.ExchangeCredentialResponseForPhoneNumberRequest;
import com.google.firebase.pnv.internal.GetDigitalCredentialPayloadRequest;
import com.google.firebase.pnv.internal.GetVerificationSupportInfoRequest;

public interface gpfw extends IInterface {
    void a(gpfu arg1, ExchangeCredentialResponseForPhoneNumberRequest arg2, ApiMetadata arg3);

    void c(gpfu arg1, GetDigitalCredentialPayloadRequest arg2, ApiMetadata arg3);

    void d(gpfu arg1, GetVerificationSupportInfoRequest arg2, ApiMetadata arg3);
}

