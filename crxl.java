import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

public interface crxl extends IInterface {
    void a(crxi arg1, MdpCarrierPlanIdRequest arg2, ApiMetadata arg3);

    void b(crxi arg1, GetConsentInformationRequest arg2, ApiMetadata arg3);

    void c(crxi arg1, MdpDataPlanStatusRequest arg2, ApiMetadata arg3);

    void d(crxi arg1, MdpUpsellOfferRequest arg2, ApiMetadata arg3);

    void e(crxi arg1, MdpPurchaseOfferRequest arg2, ApiMetadata arg3);

    void f(crxi arg1, SetConsentStatusRequest arg2, ApiMetadata arg3);
}

