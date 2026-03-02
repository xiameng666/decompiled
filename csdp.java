import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.ui.ConsentWebView;

public final class csdp extends du {
    public Button a;
    private static final bboh ag;
    private xob ah;
    private final Intent ai;
    private ConsentAgreementText aj;
    private View ak;
    private boolean al;
    public Button b;
    public ConsentWebView c;
    public final int d;

    static {
        csdp.ag = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public csdp() {
        this.al = true;
        xob xob0 = (xob)this.getContext();
        this.ah = xob0;
        Intent intent0 = xob0.getIntent();
        this.ai = intent0;
        this.d = intent0.getIntExtra("EventFlowId", crxn.a());
    }

    public csdp(xob xob0, Intent intent0) {
        this.al = true;
        this.ah = xob0;
        this.ai = intent0;
        this.d = intent0.getIntExtra("EventFlowId", crxn.a());
    }

    private final void A() {
        xob xob0 = this.ah;
        if(xob0 != null) {
            xob0.finish();
            this.ah = null;
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0238, viewGroup0, false);  // layout:consent_fragment
        this.ak = view0;
        if(this.ah == null) {
            return view0;
        }
        if(hvko.C()) {
            Intent intent0 = this.ai;
            String s = intent0 == null ? null : intent0.getStringExtra("ComeFrom");
            if(s == null) {
                ComponentName componentName0 = this.ah.getCallingActivity();
                if(componentName0 == null) {
                    Uri uri0 = this.ah.getReferrer();
                    if(uri0 != null) {
                        s = uri0.toString();
                    }
                }
                else {
                    s = componentName0.flattenToString();
                }
                crxn.c().Q(39, s, "R.layout.consent_fragment", hhct.bn, System.currentTimeMillis(), Integer.valueOf(this.d));
            }
            else if(s.equals("com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity")) {
                crxn.c().Q(38, s, "R.layout.consent_fragment", hhct.bm, System.currentTimeMillis(), Integer.valueOf(this.d));
            }
            else {
                crxn.c().Q(39, s, "R.layout.consent_fragment", hhct.bn, System.currentTimeMillis(), Integer.valueOf(this.d));
            }
            xob xob0 = this.ah;
            if((xob0 instanceof xni)) {
                im im0 = ((xni)xob0).hL();
                if(im0 != null) {
                    im0.h();
                }
            }
            this.a = (Button)this.ak.findViewById(0x7F0B0B6E);  // id:agree_button
            this.b = (Button)this.ak.findViewById(0x7F0B10BD);  // id:decline_button
            this.c = (ConsentWebView)this.ak.findViewById(0x7F0B0FA3);  // id:consent_html_view
            ConsentAgreementText consentAgreementText0 = (ConsentAgreementText)bauc.b(intent0, "AgreementText", ConsentAgreementText.CREATOR);
            this.aj = consentAgreementText0;
            if(consentAgreementText0 == null) {
                ((ggtj)csdp.ag.j()).x("MobileDataPlanDetailChimeraActivity receives null consent agreement text");
                this.ah.setResult(0);
                this.A();
                return this.ak;
            }
            this.c.b(consentAgreementText0);
            ConsentWebView consentWebView0 = this.c;
            consentWebView0.b = new csdo(this);
            if(TextUtils.isEmpty(this.aj.f)) {
                this.al = false;
                this.y(false);
            }
            else {
                this.a.setText(this.aj.f);
                this.a.setOnClickListener(new csdl(this));
            }
            if(!TextUtils.isEmpty(this.aj.e)) {
                this.b.setText(this.aj.e);
            }
            this.b.setOnClickListener(new csdm(this));
            return this.ak;
        }
        ((ggtj)csdp.ag.j()).x("Consent is not required, finish this activity");
        this.A();
        return this.ak;
    }

    @Override  // du
    public final void onDestroyView() {
        this.ah = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.aj = null;
        super.onDestroyView();
    }

    public final void y(boolean z) {
        if(TextUtils.isEmpty(this.aj.d)) {
            this.a.setText(0x7F150962);  // string:consent_agree_button_text "I agree"
        }
        else {
            this.a.setText(this.aj.d);
        }
        this.a.setOnClickListener(new csdn(this));
        boolean z1 = z || this.c.canScrollVertically(-1) && this.al;
        crxn.c().Q((z1 ? 49 : 0x30), this.a.getText().toString(), csgn.f(this.c), (z1 ? hhct.cj : hhct.ci), System.currentTimeMillis(), Integer.valueOf(this.d));
    }

    public final void z(boolean z) {
        xob xob0 = this.ah;
        if(xob0 != null) {
            xob0.setResult((z ? -1 : 0));
            this.A();
        }
    }
}

