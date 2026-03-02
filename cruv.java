import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;

public final class cruv extends azts implements crvr {
    private static final azta_api a;
    private String b;
    private String c;
    private int d;
    private static final azss e;
    private static final azsy f;

    static {
        azss azss0 = new azss();
        cruv.e = azss0;
        cruo cruo0 = new cruo();
        cruv.f = cruo0;
        cruv.a = new azta_api("MobileDataPlan.API", cruo0, azss0);
    }

    public cruv(Context context0, crvq crvq0) {
        super(context0, cruv.a, crvq0, aztr_settings.a);
        this.b = "com.google.android.gms";
        try {
            PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo(this.b, 0);
            this.c = packageInfo0.versionName;
            this.d = packageInfo0.versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            this.b = "PACKAGE_NAME_NOT_FOUND";
            this.c = "PACKAGE_VERSION_NOT_FOUND";
            this.d = -1;
        }
    }

    public final Bundle e(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putString("client_package_name", this.b);
        bundle0.putString("client_version_name", this.c);
        bundle0.putLong("client_version_code", ((long)this.d));
        return bundle0;
    }

    @Override  // crvr
    public final evql f(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0) {
        batl.r(mdpCarrierPlanIdRequest0.a, "getCarrierPlanId needs a valid API key provided by GTAF team.");
        cruw cruw0 = new cruw(mdpCarrierPlanIdRequest0);
        cruw0.a.b = this.e(mdpCarrierPlanIdRequest0.b);
        azzc azzc0 = new azzc();
        azzc0.d = 0x3F49;
        azzc0.a = new crui(this, cruw0);
        return this.jn(azzc0.a());
    }

    @Override  // crvr
    public final evql g(MdpUpsellOfferRequest mdpUpsellOfferRequest0) {
        batl.r(mdpUpsellOfferRequest0.a, "getUpsellOffer needs a non-empty Carrier Plan Id.");
        crvl crvl0 = new crvl(mdpUpsellOfferRequest0);
        crvl0.b = this.e(mdpUpsellOfferRequest0.b);
        azzc azzc0 = new azzc();
        azzc0.d = 0x3F4B;
        azzc0.a = new cruk(this, crvl0);
        return this.jn(azzc0.a());
    }

    @Override  // crvr
    public final evql h(MdpPurchaseOfferRequest mdpPurchaseOfferRequest0) {
        batl.r(mdpPurchaseOfferRequest0.a, "purchaseOffer needs a non-empty Carrier Plan Id.");
        batl.r(mdpPurchaseOfferRequest0.b, "purchaseOffer needs a non-empty Plan ID (from the upsell offers) for purchase.");
        batl.r(mdpPurchaseOfferRequest0.d, "purchaseOffer needs a non-empty (self-generated) Transaction ID for purchase.");
        crvi crvi0 = new crvi(mdpPurchaseOfferRequest0);
        crvi0.e = this.e(mdpPurchaseOfferRequest0.e);
        azzc azzc0 = new azzc();
        azzc0.d = 0x3F4C;
        azzc0.a = new crum(this, crvi0);
        return this.jn(azzc0.a());
    }
}

