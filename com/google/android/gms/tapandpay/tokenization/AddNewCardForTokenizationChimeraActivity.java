package com.google.android.gms.tapandpay.tokenization;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bbcu;
import bboh;
import bbqa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.firstparty.setupwizard.GetSetupWizardIntentRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.setupcompat.logging.ScreenKey;
import com.google.android.setupcompat.logging.SetupMetric;
import esge;
import esgi;
import etmv;
import etso;
import evei;
import evej;
import eveq;
import eviz;
import favz;
import faxp;
import faxq;
import fbio;
import fbjk;
import fbjw;
import fbjy;
import fbxw;
import fbxy;
import fshb;
import gadx;
import gftb;
import ggtj;
import hypg;
import hypp;
import hyxp;
import xob;

@GmsCoreVeId(0x3FE0C)
public class AddNewCardForTokenizationChimeraActivity extends xob implements fshb {
    fbio j;
    etso k;
    private static final bboh l;
    private AccountInfo m;
    private byte[] n;
    private String o;
    private String p;
    private boolean q;
    private String r;
    private ScreenKey s;
    private int t;
    private boolean u;

    static {
        AddNewCardForTokenizationChimeraActivity.l = bboh.b("TapAndPay", bbcu.aM);
    }

    public final AccountInfo a() {
        return this.b().b;
    }

    public final etso b() {
        if(this.k == null) {
            this.k = new etso(this);
        }
        return this.k;
    }

    private final void c(byte[] arr_b) {
        int v = TextUtils.isEmpty(this.getIntent().getStringExtra("nodeId")) || hypg.c() || !hypp.j() ? 0 : 1;
        fbjk fbjk0 = new fbjk(this, null);
        fbjk0.e(esge.a());
        fbjk0.c(new Account(this.m.b, "com.google"));
        fbjk0.i(arr_b);
        fbjk0.d(eveq.a());
        fbjk0.g((1 == v ? 2 : 3));
        if(this.t == 42) {
            fbjk0.f(4);
        }
        this.startActivityForResult(fbjk0.a(), 1);
    }

    private final boolean f() {
        return this.q && bbqa.d();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void finish() {
        super.finish();
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // xoi
    public final void onActivityResult(int v, int v1, Intent intent0) {
        switch(v) {
            case 1: {
                break;
            }
            case 2: {
                if(v1 == 1) {
                    Status status0 = favz.a(intent0);
                    if(status0 != null) {
                        int v2 = status0.i;
                        if(v2 == 17) {
                            byte[] arr_b = eviz.g(this.getIntent(), "extra_orchestration_add_token", new byte[0]);
                            ((ggtj)AddNewCardForTokenizationChimeraActivity.l.j()).x("SUW IM Intent isn\'t available, so let\'s fallback to the old IM.");
                            this.c(arr_b);
                            v2 = 17;
                        }
                        gadx.e(this, this.s, new SetupMetric[]{SetupMetric.a("TapAndPayAddNewCardForTokenizationChimera", v2)});
                        return;
                    }
                    v1 = 1;
                }
                break;
            }
            default: {
                super.onActivityResult(v, v1, intent0);
                return;
            }
        }
        if(v1 == -1) {
            Intent intent1 = new Intent();
            if(intent0 != null && intent0.hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN")) {
                this.n = eviz.g(intent0, "com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", new byte[0]);
                this.p = eviz.b(intent0, "com.google.android.gms.wallet.f1InstrumentId", "");
                intent1.putExtra("output_integrator_callback_data", this.n);
                intent1.putExtra("card_id", this.p);
                this.setResult(-1, intent1);
            }
            else {
                this.setResult(2);
            }
        }
        else if(intent0 == null) {
            this.setResult(v1);
        }
        else {
            this.setResult(v1, intent0);
        }
        this.finish();
        if(this.q && !this.f()) {
            evej.a(this);
        }
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        int v = 0;
        this.q = this.getIntent().getBooleanExtra("isSetupFlow", false);
        this.u = this.getIntent().getBooleanExtra("isInWearOobeFlow", false);
        this.t = this.getIntent().getIntExtra("EXTRA_TOKENIZATION_ENTRY_POINT", 0);
        this.r = eviz.b(this.getIntent(), "EXTRA_SUW_THEME", "glif_v3");
        this.s = ScreenKey.a("TapAndPayAddNewCardForTokenizationChimera", this);
        if(this.q) {
            evei.e(this, this.r, evei.h(this));
        }
        else if(hypg.c()) {
            this.setTheme(0x7F160D76);  // style:Theme.Wallet.Expressive.Translucent
        }
        else {
            this.setTheme(0x7F160F5C);  // style:TpActivityTheme.NoActionBar.Translucent
        }
        super.onCreate(bundle0);
        this.b().b();
        if(this.j == null) {
            faxp faxp0 = new faxp();
            faxp0.a(esge.a());
            this.j = new fbio(this, new faxq(faxp0));
        }
        this.setTitle("");
        if(bundle0 == null) {
            this.m = this.a();
            byte[] arr_b = eviz.g(this.getIntent(), "extra_orchestration_add_token", new byte[0]);
            gftb.check(this.m);
            int v1 = 3;
            if(!this.q) {
                goto label_53;
            }
            if(!TextUtils.isEmpty(this.getIntent().getStringExtra("nodeId")) && !hypg.c() && hypp.j()) {
                v = 1;
            }
            Account account0 = new Account(this.m.b, "com.google");
            WalletCustomTheme walletCustomTheme0 = eveq.b(this.r, this);
            fbjw fbjw0 = new fbjw();
            fbjy fbjy0 = new fbjy();
            fbjy0.a = account0;
            fbjy0.b = arr_b;
            fbxy fbxy0 = BuyFlowConfig.a();
            fbxy0.d("com.google.android.gms");
            fbxw fbxw0 = ApplicationParameters.a();
            fbxw0.d(account0);
            fbxw0.e(walletCustomTheme0);
            fbxw0.f(esge.a());
            if(1 == v) {
                v1 = 2;
            }
            fbxw0.j(v1);
            fbxy0.b(fbxw0.a);
            fbjy0.c = fbxy0.a();
            fbjy0.b();
            fbjy0.d = this.r;
            fbjw0.b(fbjy0.a());
            GetSetupWizardIntentRequest getSetupWizardIntentRequest0 = fbjw0.a();
            favz.f(this.j.g(getSetupWizardIntentRequest0), this.getContainerActivity(), 2);
            if(!this.f()) {
                this.overridePendingTransition(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
                return;
            label_53:
                if(this.u && hyxp.d()) {
                    ((ggtj)AddNewCardForTokenizationChimeraActivity.l.h()).x("Start bender activity using SUW UI for wear OOBE");
                    Account account1 = new Account(this.m.b, "com.google");
                    WalletCustomTheme walletCustomTheme1 = eveq.b("glif_expressive", this);
                    fbjw fbjw1 = new fbjw();
                    fbjy fbjy1 = new fbjy();
                    fbjy1.a = account1;
                    fbjy1.b = arr_b;
                    fbxy fbxy1 = BuyFlowConfig.a();
                    fbxy1.d("com.google.android.gms");
                    fbxw fbxw1 = ApplicationParameters.a();
                    fbxw1.d(account1);
                    fbxw1.e(walletCustomTheme1);
                    fbxw1.f(esge.a());
                    fbxw1.j(3);
                    fbxy1.b(fbxw1.a);
                    fbjy1.c = fbxy1.a();
                    fbjy1.b();
                    fbjy1.d = "glif_expressive";
                    fbjw1.b(fbjy1.a());
                    GetSetupWizardIntentRequest getSetupWizardIntentRequest1 = fbjw1.a();
                    favz.f(this.j.g(getSetupWizardIntentRequest1), this.getContainerActivity(), 1);
                    return;
                }
                this.c(arr_b);
            }
        }
        else if(bundle0.containsKey("key_integrator_callback_data")) {
            byte[] arr_b1 = new byte[0];
            byte[] arr_b2 = bundle0.getByteArray("key_integrator_callback_data");
            if(arr_b2 != null) {
                arr_b1 = arr_b2;
            }
            this.n = arr_b1;
            this.o = bundle0.getString("key_cvv", "");
            this.p = bundle0.getString("key_added_card_id", "");
        }
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(this.q) {
            gadx.e(this, this.s, new SetupMetric[]{SetupMetric.b("TapAndPayAddNewCardForTokenizationChimera")});
        }
    }

    @Override  // xnb
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putByteArray("key_integrator_callback_data", this.n);
        bundle0.putString("key_integrator_callback_data", this.o);
        bundle0.putString("key_added_card_id", this.p);
    }

    @Override  // xoi
    protected final void onStart() {
        super.onStart();
        AccountInfo accountInfo0 = this.a();
        this.m = accountInfo0;
        if(accountInfo0 != null) {
            new etmv(new esgi(this.m, esge.d(), this)).C(this.getContainerActivity().getClass().getCanonicalName());
        }
    }

    @Override  // xnb
    public final void startActivityForResult(Intent intent0, int v, Bundle bundle0) {
        this.b().a(intent0);
        super.startActivityForResult(intent0, v, bundle0);
    }
}

