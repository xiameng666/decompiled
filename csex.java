import android.content.Intent;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;

final class csex implements evqf {
    final csdj a;

    public csex(csdj csdj0) {
        this.a = csdj0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((GetConsentInformationResponse)object0) == null) {
            ((ggtj)csff.a.j()).x("GetConsentInformation API call returned null");
            this.a.o(new NullPointerException());
            return;
        }
        csdj csdj0 = this.a;
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity0 = csdj0.f;
        if(mobileDataPlanSettingsChimeraActivity0 == null) {
            return;
        }
        csdj0.y = (GetConsentInformationResponse)object0;
        int v = ((GetConsentInformationResponse)object0).a.a;
        if(v != 1 && v != 3) {
            switch(v) {
                case 6: 
                case 7: {
                    csdj0.D = true;
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    mobileDataPlanSettingsChimeraActivity0.o(csfg.f);
                    return;
                }
                default: {
                    ConsentAgreementText consentAgreementText0 = ((GetConsentInformationResponse)object0).b;
                    Intent intent0 = new Intent("com.google.android.gms.mobiledataplan.ui.CONSENT").setClassName(mobileDataPlanSettingsChimeraActivity0, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
                    if(hvkk.e() && csfi.a() != null) {
                        intent0.putExtra("EventFlowId", csfi.a());
                    }
                    bauc.l(consentAgreementText0, intent0, "AgreementText");
                    intent0.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                    mobileDataPlanSettingsChimeraActivity0.m = true;
                    mobileDataPlanSettingsChimeraActivity0.startActivityForResult(intent0, 0x91D);
                    return;
                }
            }
        }
        csdj0.w(csdj0.q.f);
        csff.a(csdj0.q.a, csdj0);
    }
}

