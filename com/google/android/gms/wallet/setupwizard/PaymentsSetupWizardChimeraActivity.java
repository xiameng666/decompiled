package com.google.android.gms.wallet.setupwizard;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import bbmq;
import cchj;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fayb;
import fbxn;
import fbxo;
import fbxt;
import fbxu;
import fbxw;
import fbxy;
import gaec;
import gajp;
import gciq;
import gcjb;
import gcuj;
import gcuk;
import gdcb;
import gfhe;
import gklu;
import hcdi;
import hzrg;
import hzrj;
import kau;

public class PaymentsSetupWizardChimeraActivity extends fayb {
    protected Account q;
    protected hcdi r;
    protected String s;
    protected WalletGlifLayout t;
    protected int u;

    @Override  // fayb
    public final void H(Bundle bundle0) {
        bundle0.putBoolean("savedSpinnerState", this.U());
    }

    @Override  // fayb
    public final void L(gfhe gfhe0, boolean z) {
    }

    @Override  // fayb
    public final void N(String s) {
    }

    @Override  // fayb
    public final void Q(boolean z) {
        if(this.t != null) {
            if(hzrg.g()) {
                fbxn.a(this.t, z);
                return;
            }
            this.t.O(z);
        }
    }

    @Override  // fayb
    public final boolean U() {
        return this.t != null && this.t.S();
    }

    protected fbxt ae() {
        return fbxt.aA(this.q(), this.j, this.r, this.s, false, this.u, this.k);
    }

    protected final String af() {
        return gcuj.k(this.getIntent());
    }

    public final void ag(Drawable drawable0) {
        this.t.M(drawable0);
    }

    public final void ah(String s) {
        View view0 = this.t.r(0x7F0B216C);  // id:sud_layout_icon
        if(view0 != null) {
            if(hzrg.e() && !TextUtils.isEmpty(s)) {
                view0.setContentDescription(s);
                view0.setImportantForAccessibility(1);
                return;
            }
            view0.setContentDescription(null);
            view0.setImportantForAccessibility(2);
        }
    }

    @Override  // fayb
    public final Account oc() {
        return this.q;
    }

    @Override  // fayb
    protected final void onCreate(Bundle bundle0) {
        int v2;
        hcdi hcdi0;
        Account[] arr_account = cchj.b(this.getApplicationContext()).p("com.google");
        if(arr_account == null || arr_account.length == 0) {
            Log.i("PaymentsSuw", "Payments Setup-Wizard requires at least one login account.");
        }
        else if(gcuk.b(this.getApplicationContext())) {
            Intent intent0 = this.getIntent();
            this.q = arr_account[0];
            hzrg hzrg0 = hzrg.a;
            this.u = (int)hzrg0.d().b();
            if(intent0.hasExtra("com.google.android.gms.wallet.firstparty.setupwizard.EXTRA_SETUP_WIZARD_INITIALIZE_TYPE")) {
                this.u = intent0.getIntExtra("com.google.android.gms.wallet.firstparty.setupwizard.EXTRA_SETUP_WIZARD_INITIALIZE_TYPE", this.u);
            }
            else if(intent0.hasExtra("com.google.android.gms.wallet.firstparty.setupwizard.EXTRA_SETUP_WIZARD_REQUIRE_CACHED_RESPONSE")) {
                this.u = intent0.getBooleanExtra("com.google.android.gms.wallet.firstparty.setupwizard.EXTRA_SETUP_WIZARD_REQUIRE_CACHED_RESPONSE", true) ? 2 : 3;
            }
            this.s = this.af();
            kau kau0 = null;
            if(this.u == 1 || this.u == 2) {
                if(bundle0 == null) {
                    fbxu fbxu0 = new fbxu(this);
                    for(int v = 0; true; ++v) {
                        if(v >= arr_account.length) {
                            Log.e("PaymentsSuwAct", "No responses found for usable accounts.");
                            break;
                        }
                        Account account0 = arr_account[v];
                        String s = fbxu.a(account0);
                        String s1 = fbxu0.a.getString(s, null);
                        if(TextUtils.isEmpty(s1)) {
                            hcdi0 = null;
                        }
                        else {
                            gcjb gcjb0 = new gcjb(s1);
                            hcdi0 = (hcdi)gcjb0.b(((Parser)((ProtoLiteMessage)hcdi.a).jf(7, null)), null);
                            long v1 = hzrj.b();
                            if(System.currentTimeMillis() - gcjb0.a(0L) > v1) {
                                fbxu0.b(account0);
                                hcdi0 = null;
                            }
                        }
                        if(hcdi0 != null) {
                            kau0 = new kau(account0, hcdi0);
                            break;
                        }
                    }
                label_40:
                    if(kau0 != null) {
                        this.q = (Account)kau0.a;
                        hcdi hcdi1 = (hcdi)kau0.b;
                        this.r = hcdi1;
                        if(hcdi1 != null && (hcdi1.b & 1) != 0) {
                            super.onCreate(bundle0);
                            this.setResult(1);
                            this.finish();
                            return;
                        }
                    }
                }
                else {
                    kau0 = new kau(((Account)bundle0.getParcelable("account")), ((hcdi)gciq.a(bundle0, "initializeResponse", ((Parser)((ProtoLiteMessage)hcdi.a).jf(7, null)))));
                    goto label_40;
                }
            }
            Account account1 = this.q;
            Intent intent1 = this.getIntent();
            WalletCustomTheme walletCustomTheme0 = gcuj.d(this.s, gcuj.j(this.getApplicationContext()));
            fbxy fbxy0 = BuyFlowConfig.a();
            fbxy0.e("flow_setupwizard");
            fbxw fbxw0 = ApplicationParameters.a();
            fbxw0.c(0);
            fbxw0.d(account1);
            fbxw0.f(((int)hzrg.b()));
            if(gaec.x(this)) {
                v2 = 3;
            }
            else {
                v2 = gajp.e(this.s) ? 1 : 2;
            }
            fbxw0.j(v2);
            fbxw0.e(walletCustomTheme0);
            fbxy0.b(fbxw0.a);
            fbxy0.d(bbmq.p(this));
            long v3 = gcuk.a(this);
            switch(((int)hzrg0.d().e())) {
                case 2: {
                    if(gcuk.c(v3)) {
                        fbxy0.f(String.valueOf(v3));
                    }
                    break;
                }
                case 3: {
                    fbxy0.f(String.valueOf(v3));
                }
            }
            intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", fbxy0.a());
            this.setIntent(intent1);
            int[] arr_v = fbxo.c(this, this.s);
            this.setTheme(arr_v[0]);
            for(int v4 = 1; v4 < 4; ++v4) {
                this.getTheme().applyStyle(arr_v[v4], true);
            }
            this.overridePendingTransition(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
            this.v(bundle0, true, 11, gklu.l);
            super.onCreate(bundle0);
            if(this.u == 2 && kau0 == null) {
                this.B(1);
                Log.e("PaymentsSuwAct", "No responses found for usable accounts.");
                return;
            }
            this.setContentView(0x7F0E0C93);  // layout:wallet_activity_setupwizard
            this.t = (WalletGlifLayout)this.findViewById(0x7F0B2009);  // id:setup_wizard_layout
            BitmapDrawable bitmapDrawable0 = gdcb.ar(this);
            bitmapDrawable0.setTintList(this.t.n);
            this.ag(bitmapDrawable0);
            if(hzrg.e()) {
                this.ah("Google Payments");
            }
            View view0 = this.findViewById(0x7F0B20E1);  // id:sticky_button_container
            if(view0 != null) {
                view0.setVisibility(8);
            }
            if(((fbxt)this.r()) == null) {
                this.G(this.ae(), 0x7F0B14C8);  // id:fragment_holder
            }
            return;
        }
        super.onCreate(bundle0);
        this.setResult(1);
        this.finish();
    }

    @Override  // fayb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("account", this.q);
        gciq.j(bundle0, "initializeResponse", ((MessageLite)this.r));
    }

    @Override  // xni
    protected final void onTitleChanged(CharSequence charSequence0, int v) {
        super.onTitleChanged(charSequence0, v);
        WalletGlifLayout walletGlifLayout0 = this.t;
        if(walletGlifLayout0 != null) {
            walletGlifLayout0.b(charSequence0);
        }
    }

    @Override  // fayb
    public final void x(Bundle bundle0) {
        this.Q(bundle0.getBoolean("savedSpinnerState"));
    }
}

