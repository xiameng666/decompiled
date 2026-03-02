import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

public interface crxi extends IInterface {
    void a(Status arg1, MdpCarrierPlanIdResponse arg2, ApiMetadata arg3);

    void b(Status arg1, ApiMetadata arg2);

    void c(Status arg1, MdpDataPlanStatusResponse arg2, ApiMetadata arg3);

    void d(Status arg1, MdpUpsellOfferResponse arg2, ApiMetadata arg3);

    void e(Status arg1, MdpPurchaseOfferResponse arg2, ApiMetadata arg3);

    void f(Status arg1, GetConsentInformationResponse arg2, ApiMetadata arg3);

    void g(Status arg1, ApiMetadata arg2);
}

