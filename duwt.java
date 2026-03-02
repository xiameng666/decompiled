import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class duwt extends dokz {
    public static final bboh a;
    public AndroidInjector ag;
    public acp ah;
    private final ibnn ai;
    private Account aj;
    private acp ak;
    public ibnf b;
    public dtzg c;
    public dttm d;

    static {
        duwt.a = bboh.b("Pay", bbcu.cZ);
    }

    public duwt() {
        duwo duwo0 = new duwo(this);
        duwq duwq0 = new duwq(new duwp(this));
        ibnn ibnn0 = ibno.a(ibnp.c, duwq0);
        this.ai = new lsd(new ibuk(duyb.class), new duwr(ibnn0), duwo0, new duws(ibnn0));
    }

    public final fyju A() {
        fyju fyju0 = new fyju(this.requireContext());
        fyju0.O(this.getString(0x7F151D4E));  // string:pay_drivers_license_id_exists_dialog_title "You already have an ID"
        fyju0.D(this.getString(0x7F151D4D));  // string:pay_drivers_license_id_exists_dialog_text "This Google Account already has 
                                              // an ID card or pending request on this device. To add a new ID, remove your current 
                                              // one or switch Google Accounts."
        fyju0.x(false);
        fyju0.M(this.getString(0x7F151FF1), new duwf(this));  // string:pay_onboarding_button_got_it "Got it"
        return fyju0;
    }

    static void B(duwt duwt0, ByteString hfsf0, String s, int v) {
        Account account0 = null;
        int v1 = 1;
        if(1 == (v & 1)) {
            hfsf0 = null;
        }
        if(hfsf0 != null) {
            acp acp0 = duwt0.ak;
            if(acp0 == null) {
                ibuq.j("idvWidgetLauncher");
                acp0 = null;
            }
            dtzg dtzg0 = duwt0.y();
            Context context0 = duwt0.requireContext();
            Account account1 = duwt0.aj;
            if(account1 == null) {
                ibuq.j("account");
            }
            else {
                account0 = account1;
            }
            if(dtzg0.c == null) {
                ((ggtj)dtzg.b.i()).x("\'environment\' variable in IDVWidgetUtils not set. Defaulting to PRODUCTION");
                dtzg0.c = "PROD";
            }
            ggeo ggeo0 = dtzg.a;
            if(ggeo0.containsKey(dtzg0.c)) {
                v1 = (int)(((Integer)ggeo0.get(dtzg0.c)));
            }
            else {
                ((ggtj)dtzg.b.i()).B("%s value \'environment\' contains no mapping in IDVWidgetUtils. Defaulting to ENVIRONMENT_PRODUCTION", dtzg0.c);
            }
            fbjj fbjj0 = new fbjj(context0);
            fbjj0.e(v1);
            fbjj0.c(account0);
            fbjj0.f(3);
            fbjj0.d(dtzg0.d);
            fbjj0.g(3);
            if(hwmp.a.l().L()) {
                fbjj0.i(hfsf0.toByteArray());
            }
            else {
                fbjj0.h(hfsf0.toByteArray());
            }
            Intent intent0 = fbjj0.a();
            ibuq.e(intent0, "createPushProvisioningIntent(...)");
            acp0.b(intent0);
            return;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if(s != null) {
            acp acp1 = duwt0.ak;
            if(acp1 == null) {
                ibuq.j("idvWidgetLauncher");
                acp1 = null;
            }
            dtzg dtzg1 = duwt0.y();
            Context context1 = duwt0.requireContext();
            Account account2 = duwt0.aj;
            if(account2 == null) {
                ibuq.j("account");
            }
            else {
                account0 = account2;
            }
            Intent intent1 = dtzg1.e(context1, s, account0, gfqx.a);
            ibuq.e(intent1, "createVerificationWidgetIntentV2(...)");
            acp1.b(intent1);
        }
    }

    public final void D(goz goz0, int v) {
        goz goz1 = goz0.ao(0x9143059B);
        int v1 = (v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            duxk duxk0 = (duxk)gtr.a(this.z().f, goz1).a();
            int v2 = v1 << 3 & 0x70;
            this.E(duxk0, goz1, v2);
            this.F(duxk0, goz1, v2);
            this.G(duxk0, goz1, v2);
            if(duxk0.c) {
                goz1.M(1285042570);
                dull.b(null, null, goz1, 0);
            }
            else {
                hkas hkas0 = duxk0.a;
                if(hkas0 != null && duxk0.b == null) {
                    goz1.M(1285045899);
                    goz1.M(-1633490746);
                    int v3 = goz1.Z(this) | goz1.Z(duxk0);
                    Object object0 = goz1.j();
                    if(v3 != 0 || object0 == gop.a) {
                        object0 = new duwb(this, duxk0);
                        goz1.P(object0);
                    }
                    goz1.x();
                    goz1.M(5004770);
                    boolean z = goz1.Z(this);
                    Object object1 = goz1.j();
                    if(z || object1 == gop.a) {
                        object1 = new duwg(this);
                        goz1.P(object1);
                    }
                    goz1.x();
                    goz1.M(5004770);
                    boolean z1 = goz1.Z(this);
                    Object object2 = goz1.j();
                    if(z1 || object2 == gop.a) {
                        object2 = new duwh(this);
                        goz1.P(object2);
                    }
                    goz1.x();
                    duxi.g(null, hkas0, ((ibth)object0), ((ibth)(((ibwx)object1))), ((ibth)(((ibwx)object2))), goz1, 0);
                }
                else {
                    goz1.M(0x46735225);
                }
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duwc(this, v);
        }
    }

    public final void E(duxk duxk0, goz goz0, int v) {
        goz goz1 = goz0.ao(1219286190);
        int v1 = (v & 6) == 0 ? (goz1.Z(duxk0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            Boolean boolean0 = Boolean.valueOf(duxk0.e);
            goz1.M(-1633490746);
            int v2 = goz1.Z(duxk0) | goz1.Z(this);
            Object object0 = goz1.j();
            if(v2 != 0 || object0 == gop.a) {
                object0 = new duwi(duxk0, this, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(boolean0, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duvx(this, duxk0, v);
        }
    }

    public final void F(duxk duxk0, goz goz0, int v) {
        goz goz1 = goz0.ao(-517092629);
        int v1 = (v & 6) == 0 ? (goz1.Z(duxk0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            ByteString hfsf0 = duxk0.b;
            goz1.M(-1633490746);
            int v2 = goz1.Z(duxk0) | goz1.Z(this);
            Object object0 = goz1.j();
            if(v2 != 0 || object0 == gop.a) {
                object0 = new duwj(duxk0, this, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(hfsf0, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duvy(this, duxk0, v);
        }
    }

    public final void G(duxk duxk0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x551FEE3);
        int v1 = (v & 6) == 0 ? (goz1.Z(duxk0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            gtxg gtxg0 = duxk0.d;
            goz1.M(-1633490746);
            int v2 = goz1.Z(duxk0) | goz1.Z(this);
            Object object0 = goz1.j();
            if(v2 != 0 || object0 == gop.a) {
                object0 = new duwk(duxk0, this, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(gtxg0, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duwa(this, duxk0, v);
        }
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.ag == null) {
            doly doly0 = dolz.a(this);
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            done done0 = new done();
            dmgr dmgr0 = new dmgr("com.google.android.gms");
            doma doma0 = new doma(this);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.ag = new duvm(dmgr0, doma0, dolg0, done0, domv0, dpsw.a(doly0, this.ap()));
        }
        AndroidInjector androidInjector0 = this.ag;
        if(androidInjector0 == null) {
            ibuq.j("injector");
            androidInjector0 = null;
        }
        androidInjector0.inject(this);
        dolg dolg1 = this.ap();
        if(dolg1 == null) {
            throw new RuntimeException("No valid account when starting push provisioning");
        }
        this.aj = dolg1.a();
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.ak = this.registerForActivityResult(new adt(), new duwd(this));
        this.ah = this.registerForActivityResult(new adt(), new duwe(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s2;
        CharSequence charSequence0;
        ibuq.f(layoutInflater0, "inflater");
        duyb duyb0 = this.z();
        Intent intent0 = this.ao().getIntent();
        ibuq.e(intent0, "getIntent(...)");
        ibuq.f(intent0, "intent");
        duxk duxk0 = duxk.a(((duxk)duyb0.h.b()), null, null, true, null, null, false, 51);
        duyb0.h.g(duxk0);
        String s = dtqt.b(intent0);
        if(s == null) {
            charSequence0 = null;
        }
        else {
            try {
                JSONArray jSONArray0 = new JSONObject(s).optJSONArray("requests");
                if(jSONArray0 != null && jSONArray0.length() > 0) {
                    JSONObject jSONObject0 = jSONArray0.optJSONObject(0);
                    if(jSONObject0 == null) {
                        charSequence0 = null;
                    }
                    else {
                        JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
                        charSequence0 = jSONObject1 == null ? null : jSONObject1.optString("credential_issuer", "");
                    }
                }
                else {
                    charSequence0 = null;
                }
            }
            catch(JSONException jSONException0) {
                a.ae(dtqt.a.j(), "JSONException parsing credential offer for issuer ID from Intent", jSONException0);
                charSequence0 = null;
            }
        }
        if(charSequence0 != null && charSequence0.length() != 0) {
            String s1 = dtqt.b(intent0);
            if(s1 == null) {
                s2 = null;
            }
            else {
                try {
                    JSONArray jSONArray1 = new JSONObject(s1).optJSONArray("requests");
                    if(jSONArray1 != null && jSONArray1.length() != 0) {
                        JSONObject jSONObject2 = jSONArray1.optJSONObject(0);
                        if(jSONObject2 == null) {
                            s2 = null;
                        }
                        else {
                            JSONObject jSONObject3 = jSONObject2.optJSONObject("data");
                            if(jSONObject3 == null) {
                                s2 = null;
                            }
                            else {
                                JSONObject jSONObject4 = jSONObject3.optJSONObject("grants");
                                if(jSONObject4 == null) {
                                    s2 = null;
                                }
                                else {
                                    JSONObject jSONObject5 = jSONObject4.optJSONObject("authorization_code");
                                    s2 = jSONObject5 == null ? null : jSONObject5.optString("issuer_state", "");
                                }
                            }
                        }
                    }
                    else {
                        s2 = null;
                    }
                }
                catch(JSONException jSONException1) {
                    a.ae(dtqt.a.j(), "JSONException parsing credential offer for authorization code from Intent", jSONException1);
                    s2 = null;
                }
            }
            if(s2 != null && s2.length() != 0) {
                duyb0.g = s2;
                icck icck0 = lsc.a(duyb0);
                duxy duxy0 = new duxy(duyb0, ((String)charSequence0), null);
                icbb.b(icck0, cclw.d, null, duxy0, 2);
            }
            else {
                ((ggtj)duyb.a.j()).x("Could not parse authorization code in credential offer. Returning");
                duxk duxk1 = duxk.a(((duxk)duyb0.h.b()), null, null, false, new Exception("No valid authorization code in credential offer"), null, false, 51);
                duyb0.h.g(duxk1);
            }
        }
        else {
            ((ggtj)duyb.a.j()).x("Could not parse issuer id in credential offer. Returning");
            duxk duxk2 = duxk.a(((duxk)duyb0.h.b()), null, null, false, new Exception("No valid issuer id in credential offer"), null, false, 51);
            duyb0.h.g(duxk2);
        }
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0xD0E6284A, true, new duwm(this)));
        return view0;
    }

    public final dtzg y() {
        dtzg dtzg0 = this.c;
        if(dtzg0 != null) {
            return dtzg0;
        }
        ibuq.j("idvWidgetUtils");
        return null;
    }

    public final duyb z() {
        return (duyb)this.ai.a();
    }
}

