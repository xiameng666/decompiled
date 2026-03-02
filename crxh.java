import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

public class crxh extends wby implements crxi {
    public crxh() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
    }

    @Override  // crxi
    public void a(Status status0, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // crxi
    public final void b(Status status0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // crxi
    public void c(Status status0, MdpDataPlanStatusResponse mdpDataPlanStatusResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // crxi
    public void d(Status status0, MdpUpsellOfferResponse mdpUpsellOfferResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // crxi
    public void e(Status status0, MdpPurchaseOfferResponse mdpPurchaseOfferResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // crxi
    public void f(Status status0, GetConsentInformationResponse getConsentInformationResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0 = (MdpCarrierPlanIdResponse)wbz.a(parcel0, MdpCarrierPlanIdResponse.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxh.gr(parcel0);
                this.a(status0, mdpCarrierPlanIdResponse0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                MdpDataPlanStatusResponse mdpDataPlanStatusResponse0 = (MdpDataPlanStatusResponse)wbz.a(parcel0, MdpDataPlanStatusResponse.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxh.gr(parcel0);
                this.c(status1, mdpDataPlanStatusResponse0, apiMetadata1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                MdpUpsellOfferResponse mdpUpsellOfferResponse0 = (MdpUpsellOfferResponse)wbz.a(parcel0, MdpUpsellOfferResponse.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxh.gr(parcel0);
                this.d(status2, mdpUpsellOfferResponse0, apiMetadata2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                MdpPurchaseOfferResponse mdpPurchaseOfferResponse0 = (MdpPurchaseOfferResponse)wbz.a(parcel0, MdpPurchaseOfferResponse.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxh.gr(parcel0);
                this.e(status3, mdpPurchaseOfferResponse0, apiMetadata3);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxh.gr(parcel0);
                this.b(status4, apiMetadata4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetConsentInformationResponse getConsentInformationResponse0 = (GetConsentInformationResponse)wbz.a(parcel0, GetConsentInformationResponse.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxh.gr(parcel0);
                this.f(status5, getConsentInformationResponse0, apiMetadata5);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxh.gr(parcel0);
                this.g(status6, apiMetadata6);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // crxi
    public void g(Status status0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }
}

