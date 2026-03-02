import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import com.google.android.gms.mobiledataplan.internal.EventListenerRequest;

public final class crxk extends wby implements cjug, crxl {
    private final cjts a;
    private final String b;
    private final String c;

    public crxk() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
    }

    public crxk(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // crxl
    public final void a(crxi crxi0, MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dm);
        azuf0.g(bbdq.ar);
        azuf0.d(this.b);
        azuf0.c(this.c);
        crzj crzj0 = new crzj(crxi0, mdpCarrierPlanIdRequest0, azuf0.a());
        this.a.b(crzj0);
    }

    @Override  // crxl
    public final void b(crxi crxi0, GetConsentInformationRequest getConsentInformationRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dm);
        azuf0.g(bbdq.ar);
        azuf0.d(this.b);
        azuf0.c(this.c);
        crzk crzk0 = new crzk(crxi0, getConsentInformationRequest0, azuf0.a());
        this.a.b(crzk0);
    }

    @Override  // crxl
    public final void c(crxi crxi0, MdpDataPlanStatusRequest mdpDataPlanStatusRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dm);
        azuf0.g(bbdq.ar);
        azuf0.d(this.b);
        azuf0.c(this.c);
        crzl crzl0 = new crzl(crxi0, mdpDataPlanStatusRequest0, azuf0.a());
        this.a.b(crzl0);
    }

    @Override  // crxl
    public final void d(crxi crxi0, MdpUpsellOfferRequest mdpUpsellOfferRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dm);
        azuf0.g(bbdq.ar);
        azuf0.d(this.b);
        azuf0.c(this.c);
        crzm crzm0 = new crzm(crxi0, mdpUpsellOfferRequest0, azuf0.a());
        this.a.b(crzm0);
    }

    @Override  // crxl
    public final void e(crxi crxi0, MdpPurchaseOfferRequest mdpPurchaseOfferRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dm);
        azuf0.g(bbdq.ar);
        azuf0.d(this.b);
        azuf0.c(this.c);
        crzn crzn0 = new crzn(crxi0, mdpPurchaseOfferRequest0, azuf0.a());
        this.a.b(crzn0);
    }

    @Override  // crxl
    public final void f(crxi crxi0, SetConsentStatusRequest setConsentStatusRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dm);
        azuf0.g(bbdq.ar);
        azuf0.d(this.b);
        azuf0.c(this.c);
        crzq crzq0 = new crzq(crxi0, setConsentStatusRequest0, azuf0.a());
        this.a.b(crzq0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        crxi crxi0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    crxi0 = (iInterface0 instanceof crxi) ? ((crxi)iInterface0) : new crxg(iBinder0);
                }
                MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0 = (MdpCarrierPlanIdRequest)wbz.a(parcel0, MdpCarrierPlanIdRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxk.gr(parcel0);
                this.a(crxi0, mdpCarrierPlanIdRequest0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    crxi0 = (iInterface1 instanceof crxi) ? ((crxi)iInterface1) : new crxg(iBinder1);
                }
                MdpDataPlanStatusRequest mdpDataPlanStatusRequest0 = (MdpDataPlanStatusRequest)wbz.a(parcel0, MdpDataPlanStatusRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxk.gr(parcel0);
                this.c(crxi0, mdpDataPlanStatusRequest0, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    crxi0 = (iInterface2 instanceof crxi) ? ((crxi)iInterface2) : new crxg(iBinder2);
                }
                MdpUpsellOfferRequest mdpUpsellOfferRequest0 = (MdpUpsellOfferRequest)wbz.a(parcel0, MdpUpsellOfferRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxk.gr(parcel0);
                this.d(crxi0, mdpUpsellOfferRequest0, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    crxi0 = (iInterface3 instanceof crxi) ? ((crxi)iInterface3) : new crxg(iBinder3);
                }
                MdpPurchaseOfferRequest mdpPurchaseOfferRequest0 = (MdpPurchaseOfferRequest)wbz.a(parcel0, MdpPurchaseOfferRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxk.gr(parcel0);
                this.e(crxi0, mdpPurchaseOfferRequest0, apiMetadata3);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    crxi0 = (iInterface4 instanceof crxi) ? ((crxi)iInterface4) : new crxg(iBinder4);
                }
                EventListenerRequest eventListenerRequest0 = (EventListenerRequest)wbz.a(parcel0, EventListenerRequest.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxk.gr(parcel0);
                azuf azuf0 = azug.b(apiMetadata4);
                azuf0.f(azud.a);
                azuf0.e(bbdp.dm);
                azuf0.g(bbdq.ar);
                azuf0.d(this.b);
                azuf0.c(this.c);
                crzr crzr0 = new crzr(crxi0, eventListenerRequest0, azuf0.a());
                this.a.b(crzr0);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    crxi0 = (iInterface5 instanceof crxi) ? ((crxi)iInterface5) : new crxg(iBinder5);
                }
                GetConsentInformationRequest getConsentInformationRequest0 = (GetConsentInformationRequest)wbz.a(parcel0, GetConsentInformationRequest.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxk.gr(parcel0);
                this.b(crxi0, getConsentInformationRequest0, apiMetadata5);
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    crxi0 = (iInterface6 instanceof crxi) ? ((crxi)iInterface6) : new crxg(iBinder6);
                }
                SetConsentStatusRequest setConsentStatusRequest0 = (SetConsentStatusRequest)wbz.a(parcel0, SetConsentStatusRequest.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                crxk.gr(parcel0);
                this.f(crxi0, setConsentStatusRequest0, apiMetadata6);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

