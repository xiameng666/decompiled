import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.pay.GetMdocCredentialRequest;
import com.google.android.gms.pay.MdocError;
import com.google.android.gms.pay.MdocResult;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;
import com.google.android.gms.wallet.bender3.Bender3RedirectChimeraActivity;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import com.google.android.wallet.bender3.framework.storage.SessionEntity;
import java.io.Serializable;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public abstract class garj extends gani implements gaoz {
    private alo a;
    protected boolean ap;
    public fbae aq;

    public garj() {
        this.ap = false;
    }

    @Override  // gani
    protected final void M(gano gano0) {
        SessionEntity sessionEntity0;
        fbae fbae0 = this.aq;
        Parcelable parcelable0 = null;
        gavs.g(fbae0, "BE_BAEF_01", null);
        switch(gano0.g()) {
            case "BiometricAction": {
                this.a(gano0.a.getStringExtra("biometricTitle"), gano0.a.getStringExtra("biometricSubtitle"), gano0.a.getStringExtra("biometricDescription"), gano0.a.getStringExtra("biometricNegativeButtonText"), gano0.a.getBooleanExtra("biometricDeviceCredentialAllowed", false), gano0.a.getBooleanExtra("biometricConfirmationRequired", false), gano0.a.getIntExtra("biometricAllowedAuthenticators", 0));
                return;
            }
            case "CredentialPresentationAction": {
                ibuq.f(gano0, "actionRequest");
                GetMdocCredentialRequest getMdocCredentialRequest0 = new GetMdocCredentialRequest();
                ibuq.f(gano0, "<this>");
                getMdocCredentialRequest0.a = gano0.a.getStringExtra("appParametersId");
                ibuq.f(gano0, "<this>");
                getMdocCredentialRequest0.b = gano0.a.getByteArrayExtra("nonce");
                ibuq.f(gano0, "<this>");
                getMdocCredentialRequest0.c = gano0.a.getByteArrayExtra("publicKey");
                fm fm0 = fbae0.a.getSupportFragmentManager();
                dpsr dpsr0 = (dpsr)new lso(fbae0.a).a(dpsr.class);
                fbad fbad0 = new fbad(fbae0);
                if(getMdocCredentialRequest0.b == null || getMdocCredentialRequest0.b.length == 0) {
                    throw new NullPointerException("Null or empty nonce is not permitted");
                }
                if(getMdocCredentialRequest0.c == null || getMdocCredentialRequest0.c.length == 0) {
                    throw new NullPointerException("Null or empty public key cert is not permitted");
                }
                String s6 = getMdocCredentialRequest0.a;
                batl.t(s6, "Null request ID is not permitted.");
                dpsr0.a.put(s6, fbad0);
                dpsq dpsq0 = new dpsq();
                Bundle bundle0 = new Bundle();
                bundle0.putParcelable("EXTRA_MDOC_CREDENTIAL_REQUEST", getMdocCredentialRequest0);
                dpsq0.setArguments(bundle0);
                ca ca0 = new ca(fm0);
                ca0.v(dpsq0, "MdocInAppPresentationManagerFragment");
                ca0.b();
                return;
            }
            case "DialNumberAction": {
                String s8 = gano0.a.getStringExtra("number");
                Intent intent4 = new Intent("android.intent.action.DIAL");
                fbae0.a.startActivity(intent4.setData(Uri.parse(("tel:" + s8))));
                fbol.P(fbae0.a).K(new ganp(ganp.e(0)));
                return;
            }
            case "LaunchGoogleHelpAction": {
                WidgetConfig widgetConfig0 = gano0.f();
                String s3 = gano0.a.getStringExtra("appContext");
                gftb.z(s3, "The appContext is required.");
                String s4 = gano0.a.getStringExtra("appPackageName");
                gftb.z(s4, "The appPackageName is required.");
                String s5 = gano0.a.getStringExtra("countryCode");
                gftb.z(s5, "The countryCode is required.");
                Serializable serializable0 = gano0.a.getSerializableExtra("productSpecificDataMap");
                gftb.z(serializable0, "The productSpecificDataMap is required.");
                int v1 = widgetConfig0.k;
                gcuz.c();
                Intent intent2 = gcuz.a(s3, widgetConfig0.a, s4, ((ggeo)serializable0), s5, v1);
                gcuz.c();
                gcuz.b(fbae0.a, intent2);
                fbol.P(fbae0.a).K(new ganp(ganp.e(0)));
                return;
            }
            case "LoadO1WidgetAction": {
                gano0.a.getIntExtra("widgetType", 0);
                gano0.a.getByteArrayExtra("encryptedParameters");
                return;
            }
            case "RedirectAction": {
                gbgr gbgr0 = this.ah;
                gbfq gbfq0 = this.ai;
                gaxl.a();
                if(hzkp.c() && gbgr0 != null && gbfq0 != null) {
                    WidgetConfig widgetConfig2 = gano0.f();
                    try {
                        String s9 = String.valueOf(widgetConfig2.r);
                        int v3 = widgetConfig2.b;
                        String s10 = widgetConfig2.c();
                        ibuq.f(s9, "newClientSessionId");
                        ibuq.f(s10, "accountName");
                        gbgl gbgl0 = new gbgl(gbgr0, s9, v3, s10, null);
                        sessionEntity0 = (SessionEntity)icpu.e(gbgr0.d, gbgl0).get();
                    }
                    catch(InterruptedException | ExecutionException exception0) {
                        Log.e("RedirectAction", "Failed to insert session.", exception0);
                        sessionEntity0 = null;
                    }
                    if(sessionEntity0 != null) {
                        Bundle bundle1 = gano0.a.getExtras();
                        Bundle bundle2 = bundle1 == null ? new Bundle() : bundle1.deepCopy();
                        int v4 = UUID.randomUUID().hashCode();
                        if(bundle2 == null) {
                            bundle2 = new Bundle(0);
                        }
                        gbks gbks0 = new gbfk(v4, "RedirectAction", 3, bundle2, null).a(gbfq0.a);
                        gbfq0.a().put(gbks0.b, gbks0);
                        gbfq0.b(new gbfn(gbks0, null));
                    }
                    parcelable0 = sessionEntity0;
                }
                Intent intent6 = gano0.a;
                if(intent6.hasExtra("redirectUrl")) {
                    gaxl.a();
                    if(hzlv.p()) {
                        gaxl.a();
                        if(hzkp.c() && parcelable0 != null) {
                            String s11 = intent6.getStringExtra("redirectUrl");
                            int v5 = gano0.f().k;
                            Intent intent7 = Bender3RedirectChimeraActivity.l(fbae0.a, s11, v5);
                            intent7.putExtra("sessionEntity", parcelable0);
                            fbae0.a.startActivityForResult(intent7, 800);
                            return;
                        }
                        String s12 = intent6.getStringExtra("redirectUrl");
                        int v6 = gano0.f().k;
                        Intent intent8 = Bender3RedirectChimeraActivity.l(fbae0.a, s12, v6);
                        fbae0.a.startActivityForResult(intent8, 800);
                        return;
                    }
                    String s13 = intent6.getStringExtra("redirectUrl");
                    Intent intent9 = Bender3RedirectChimeraActivity.g(fbae0.a, s13);
                    fbae0.a.startActivityForResult(intent9, 800);
                    return;
                }
                if(!intent6.hasExtra("redirectIntent")) {
                    throw new IllegalStateException("Perform action intent does not set the correct extra.");
                }
                Intent intent10 = (Intent)intent6.getParcelableExtra("redirectIntent");
                if(intent10 == null) {
                    throw new IllegalStateException("redirect intent is null");
                }
                gaxl.a();
                if(hzkp.c() && parcelable0 != null) {
                    intent10.putExtra("sessionEntity", parcelable0);
                }
                Intent intent11 = new Intent().setClassName(fbae0.a, "com.google.android.gms.wallet.bender3.Bender3RedirectProxyActivity");
                intent11.putExtra("launchingIntent", intent10);
                fbae0.a.startActivityForResult(intent11, 801);
                return;
            }
            case "RequestPermissionsAction": {
                String[] arr_s = gano0.a.getStringArrayExtra("permissionsRequested");
                fbae0.a.requestPermissions(arr_s, 700);
                return;
            }
            case "SmsSenderAction": {
                ibuq.f(gano0, "actionRequest");
                ibuq.f(gano0, "<this>");
                Intent intent1 = gano0.a;
                String s = intent1.getStringExtra("NUMBER");
                String s1 = "";
                if(s == null) {
                    s = "";
                }
                ibuq.f(gano0, "<this>");
                int v = intent1.getIntExtra("SUBSCRIPTION_ID", -1);
                ibuq.f(gano0, "<this>");
                String s2 = intent1.getStringExtra("MESSAGE");
                if(s2 != null) {
                    s1 = s2;
                }
                xni xni0 = fbae0.a;
                garj garj0 = fbol.P(xni0);
                jwe.b(xni0, new gcfq(garj0), new IntentFilter("com.google.android.wallet.bender3.SMS_SENDER_ACTION"), 2);
                SmsManager smsManager0 = v == -1 ? bbhx.a(xni0) : bbhx.b(xni0, v);
                if(smsManager0 != null) {
                    if(!gcvv.c(smsManager0, s, s1, PendingIntent.getBroadcast(xni0, 0, new Intent("com.google.android.wallet.bender3.SMS_SENDER_ACTION"), 0x4000000))) {
                        garj0.S(2);
                        return;
                    }
                    return;
                }
                garj0.S(2);
                return;
            }
            case "StartActivityAction": {
                ibuq.f(gano0, "actionRequest");
                ibuq.f(gano0, "<this>");
                Object object0 = jwh.a(gano0.a, "launchingIntent", Intent.class);
                ibuq.c(object0);
                fbae0.a.startActivity(((Intent)object0));
                fbol.P(fbae0.a).K(new ganp(ganp.e(0)));
                return;
            }
            case "TokenizeCardWithToken": {
                ibuq.f(gano0, "actionRequest");
                etbu etbu0 = new etbu();
                etbu0.a(null);
                ibuq.f(gano0, "<this>");
                Intent intent3 = gano0.a;
                byte[] arr_b1 = intent3.getByteArrayExtra("actionToken");
                if(arr_b1 == null) {
                    throw new IllegalStateException("actionToken cannot be null.");
                }
                etbu0.e(arr_b1);
                etbu0.n(true);
                etbu0.g(1);
                etbu0.c(20);
                String s7 = gano0.f().c();
                FirstPartyTokenizePanRequest firstPartyTokenizePanRequest0 = etbu0.a;
                firstPartyTokenizePanRequest0.s = s7;
                ibuq.f(gano0, "<this>");
                MessageLite hfvm0 = gawi.i(intent3, "flowCustomizations", ((MessageLite)hdaa.a));
                ibuq.e(hfvm0, "requireTrustedProto(...)");
                if((((hdaa)hfvm0).b & 1) == 0) {
                    etbu0.d(true);
                }
                else {
                    etbu0.d(((hdaa)hfvm0).c);
                }
                firstPartyTokenizePanRequest0.q = ((hdaa)hfvm0).d;
                gaxl.a();
                if(hzlv.a.b().E()) {
                    ibuq.f(gano0, "<this>");
                    if(intent3.getBooleanExtra("isExistingCard", false)) {
                        etbu0.g(2);
                    }
                }
                gaxl.a();
                if(hzoz.m()) {
                    if(garf.a(gano0) != null) {
                        etbu0.j(garf.a(gano0));
                    }
                    ibuq.f(gano0, "<this>");
                    if(ibuq.m(intent3.getStringExtra("flowType"), "FLOW_TYPE_COMPLETE_THIRD_PARTY_AUTHENTICATION")) {
                        etbu0.c(38);
                    }
                }
                if((((hdaa)hfvm0).b & 4) != 0) {
                    etbu0.c(((hdaa)hfvm0).e);
                }
                etgl etgl0 = new etgl(fbae0.a.getContainerActivity());
                Activity activity0 = fbae0.a.getContainerActivity();
                etbu0.b("com.google.android.gms");
                etgl0.cW(activity0, 1100, etbu0);
                return;
            }
            case "startActivityForResult": {
                IntentSender intentSender0 = (IntentSender)gano0.a.getParcelableExtra("launchingIntentSender");
                if(intentSender0 != null) {
                    fbae0.w(intentSender0);
                    return;
                }
                Intent intent5 = garc.b(gano0);
                fbae0.a.startActivityForResult(intent5, 900);
                return;
            }
            case "tokenizeAccount": {
                ibuq.f(gano0, "actionRequest");
                TokenizeAccountRequest tokenizeAccountRequest0 = new TokenizeAccountRequest();
                tokenizeAccountRequest0.c = gano0.f().c();
                tokenizeAccountRequest0.a = 5;
                ibuq.f(gano0, "<this>");
                tokenizeAccountRequest0.b = gano0.a.getLongExtra("instrumentId", 0L);
                ibuq.f(gano0, "<this>");
                tokenizeAccountRequest0.d = gano0.a.getByteArrayExtra("tokenizationParams");
                gaxl.a();
                if(hzoz.m() && gare.a(gano0) != null) {
                    tokenizeAccountRequest0.g = gare.a(gano0);
                }
                new etgl(fbae0.a.getContainerActivity()).dm(fbae0.a.getContainerActivity(), tokenizeAccountRequest0, 1000);
                return;
            }
            case "tokenizeInstrument": {
                WidgetConfig widgetConfig1 = gano0.f();
                byte[] arr_b = gano0.a.getByteArrayExtra("tokenizationParams");
                int v2 = gano0.a.getIntExtra("tokenizableType", 0);
                Account account0 = widgetConfig1.a;
                new etgl(fbae0.a.getContainerActivity()).db(fbae0.a.getContainerActivity(), account0, v2, arr_b, 600);
                return;
            }
            default: {
                if(!TextUtils.equals(gano0.g(), "startActivityForResult")) {
                    return;
                }
                Intent intent0 = garc.b(gano0);
                if(intent0 != null) {
                    this.startActivityForResult(intent0, 1000);
                    return;
                }
                this.K(garc.f(0, null));
            }
        }
    }

    @Override  // gani
    protected final boolean N(gano gano0) {
        String s = gano0.g();
        switch(s.hashCode()) {
            case 0x907CD4A4: {
                return s.equals("SmsSenderAction");
            }
            case 0x90B89B07: {
                return s.equals("StartActivityAction");
            }
            case -1008936477: {
                return s.equals("LaunchGoogleHelpAction");
            }
            case 0xD0AA1EC7: {
                return s.equals("CredentialPresentationAction");
            }
            case 0xDB374302: {
                return s.equals("tokenizeInstrument");
            }
            case 0xDE19ED2B: {
                return s.equals("RequestPermissionsAction");
            }
            case -262008184: {
                return s.equals("TokenizeCardWithToken");
            }
            case 0x231CE68F: {
                return s.equals("DialNumberAction");
            }
            case 0x4E5478F2: {
                return s.equals("tokenizeAccount");
            }
            case 0x5DC77FB5: {
                return s.equals("startActivityForResult");
            }
            case 1721620818: {
                return s.equals("RedirectAction");
            }
            case 0x6D99C302: {
                return s.equals("LoadO1WidgetAction");
            }
            case 0x7AF044EE: {
                return s.equals("BiometricAction");
            }
            default: {
                return false;
            }
        }
    }

    public static garj P(xob xob0) {
        return (garj)garj.F(xob0);
    }

    public final void Q(int v, Intent intent0) {
        this.K(garc.f(v, intent0));
    }

    public final void R(int v, MdocResult mdocResult0, MdocError mdocError0) {
        Intent intent0 = ganp.e(v);
        switch(v) {
            case 0: {
                intent0.putExtra("mDocResult", bauc.n(mdocResult0));
                break;
            }
            case 2: {
                intent0.putExtra("mDocError", bauc.n(mdocError0));
            }
        }
        this.K(new ganp(intent0));
    }

    public final void S(int v) {
        this.K(ganp.h(v));
    }

    private final void T() {
        this.a = new alo(this, this.requireContext().getMainExecutor(), new gari(this));
    }

    @Override  // gaoz
    public final void a(String s, String s1, String s2, String s3, boolean z, boolean z1, int v) {
        this.ap = true;
        this.T();
        alo alo0 = this.a;
        all all0 = new all();
        all0.d = s;
        all0.e = s1;
        all0.f = s2;
        all0.h = z1;
        gaxl.a();
        if(!hzlv.a.b().f()) {
            if(z) {
                all0.b();
            }
            else {
                all0.g = s3;
            }
        }
        else if(v > 0) {
            if(v == 0x8000) {
                v = 0x80FF;
            }
            all0.i = v;
            if((v & 0x8000) != 0x8000) {
                all0.g = s3;
            }
        }
        else if(z) {
            all0.i = 0x80FF;
        }
        else {
            all0.g = s3;
        }
        gaxl.a();
        if(hzlv.o() && jys.d()) {
            all0.a = 0x7F080A64;
            all0.c = "Google Pay";
        }
        alo0.c(all0.a());
    }

    @Override  // gani
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            boolean z = bundle0.getBoolean("biometricInProgressKey");
            this.ap = z;
            if(z) {
                this.T();
            }
        }
    }

    @Override  // du
    public final void onDetach() {
        super.onDetach();
        this.aq = null;
    }

    @Override  // gani
    public final void onSaveInstanceState(Bundle bundle0) {
        super.J(bundle0);
        bundle0.putBoolean("biometricInProgressKey", this.ap);
    }
}

