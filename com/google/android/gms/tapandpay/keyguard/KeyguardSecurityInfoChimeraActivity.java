package com.google.android.gms.tapandpay.keyguard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import batl;
import ckkp;
import clba;
import clbc;
import clbd;
import clcf;
import clcg;
import cldm;
import clgp;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.setupdesign.GlifLayout;
import dagger.internal.Preconditions;
import domu;
import domv;
import dydw;
import esfh;
import etlu;
import etlw;
import etlz;
import etma;
import etmb;
import etmc;
import etmv;
import etsq;
import evei;
import evft;
import evji;
import evjj;
import fhvo;
import fhwk;
import fhwp;
import fipx;
import fshb;
import fuok;
import fuop;
import gaff;
import gafg;
import gjsj;
import hnns;
import hyov;
import hypg;
import hyrs;
import uoy;

@GmsCoreVeId(0x3FE1E)
public class KeyguardSecurityInfoChimeraActivity extends etsq implements fshb {
    public etmv j;
    public fhwk k;
    private boolean l;
    private boolean m;
    private boolean n;
    private AccountInfo o;
    private evji p;

    // Detected as a lambda impl.
    public final void a() {
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B08D8);  // id:Toolbar
        ScrollView scrollView0 = (ScrollView)this.findViewById(0x7F0B07A9);  // id:ScrollView
        int v = fipx.a(this, 0x7F04033A);  // attr:colorSurfaceContainerHigh
        if(scrollView0.canScrollVertically(-1)) {
            toolbar0.setBackgroundColor(v);
        }
        else {
            toolbar0.setBackgroundColor(0);
        }
        if(scrollView0.canScrollVertically(1)) {
            this.p(true, v);
            return;
        }
        this.p(false, 0);
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    private final int m() {
        if(this.l) {
            return 0x7F15328F;  // string:tp_screen_lock_body_text_wallet_qr "Your phone must be unlocked to scan a 
                                // QR code"
        }
        if(this.m) {
            return 0x7F15328C;  // string:tp_screen_lock_body_text_wallet "If you remove your screen lock, your payment 
                                // cards and other items in Wallet will be removed"
        }
        return this.p == null || !this.p.e() ? 0x7F15328E : 0x7F15328D;  // string:tp_screen_lock_body_text_wallet_nolink_non_nfc_row "This helps keep your 
                                                                         // information in Wallet safe"
    }

    private final int n() {
        return this.m ? 0x7F153297 : 0x7F153296;  // string:tp_screen_lock_prompt_title_wallet_keyguard_missing "For your security, you 
                                                  // must set a screen lock to use Google Wallet"
    }

    private final void o(AccountInfo accountInfo0) {
        if(accountInfo0 != null) {
            fhwk fhwk0 = this.k;
            Activity activity0 = this.getContainerActivity();
            fhvo fhvo0 = this.k.a.a(92634);
            fhvo0.e(fhwp.b(accountInfo0.b));
            fhwk0.i(activity0, fhvo0);
        }
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(this.getIntent().getBooleanExtra("intent_to_settings", false)) {
            Intent intent1 = new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity");
            intent1.setFlags(0x10000000);
            this.startActivity(intent1);
        }
        this.j.ad((esfh.b(this) ? 3 : 2));
        this.setResult(v1);
        this.finish();
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new etlu(domv0).inject(this);
        hyrs.d();
        this.m = hyrs.c();
        this.l = this.getIntent().getBooleanExtra("EXTRA_USE_WALLET_QR_UI", false);
        if(!hypg.c()) {
            this.setTheme(0x7F16106D);  // style:WalletTheme.NoActionBar
        }
        this.p = evjj.f(this);
        this.o = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        this.j = new etmv(this, this.o);
        this.n = this.getIntent().getBooleanExtra("extra.KEYGUARD_VALID", false);
        if(this.getIntent().getBooleanExtra("isSetupFlow", false) && this.n) {
            evei.e(this, this.getIntent().getStringExtra("EXTRA_SUW_THEME"), evei.h(this));
            this.getWindow().requestFeature(13);
            this.setContentView(0x7F0E0BA5);  // layout:tp_oobe_splash_glide
            GlifLayout glifLayout0 = (GlifLayout)this.findViewById(0x7F0B061C);  // id:OobeSplashGlifLayout
            glifLayout0.findViewById(0x7F0B061E).setVisibility(8);  // id:OobeSplashProgressBar
            glifLayout0.M((evei.g(this) ? evei.i(this) : evei.b(this)));
            glifLayout0.L(0x7F153294);  // string:tp_screen_lock_notification_title_monet_nonus "Your screen lock will be used 
                                        // for contactless payments"
            glifLayout0.J(0x7F153239);  // string:tp_oobe_screen_lock_subtitle_text "For your security, you\'ll be asked to 
                                        // unlock your phone for larger purchases. Google Pay will be set as a device administrator. 
                                        // To make changes, visit settings."
            ImageView imageView0 = (ImageView)glifLayout0.findViewById(0x7F0B061B);  // id:OobeScreenLockImage
            imageView0.setVisibility(0);
            hnns hnns0 = (this.getResources().getConfiguration().uiMode & 0x30) == 0x20 ? hyov.a.b().g() : hyov.a.b().f();
            clbc clbc0 = new clbc(null);
            clbc0.c(hnns0);
            clcf clcf0 = clcg.b(new clbd(clbc0), new cldm(new clba(null)), ckkp.a);
            clgp.b(imageView0).a().b(clcf0).a(new uoy().B(0x80000000, 0x80000000)).e(imageView0);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof FrameLayout.LayoutParams)) {
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity = 17;
            }
            imageView0.setLayoutParams(viewGroup$LayoutParams0);
            gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
            gafg gafg0 = new gafg(glifLayout0.getContext());
            gafg0.c = 5;
            gafg0.b(0x7F15089B);  // string:common_next "Next"
            gafg0.b = new etma(this);
            gaff0.c(gafg0.a());
            return;
        }
        if(hypg.c()) {
            this.setContentView(0x7F0E0B95);  // layout:tp_device_admin_prompt_activity_exp
            this.o(this.o);
            fuok fuok0 = this.J;
            fuop.d(fuok0, this.findViewById(0x7F0B0080));  // id:AppBar
            fuop.b(fuok0, this.findViewById(0x7F0B0016));  // id:ActionBarContainer
            ((Toolbar)this.findViewById(0x7F0B08D8)).x(new etlw(this));  // id:Toolbar
            ScrollView scrollView0 = (ScrollView)this.findViewById(0x7F0B07A9);  // id:ScrollView
            scrollView0.setOnScrollChangeListener((/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
                Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B08D8);  // id:Toolbar
                ScrollView scrollView0 = (ScrollView)this.findViewById(0x7F0B07A9);  // id:ScrollView
                int v = fipx.a(this, 0x7F04033A);  // attr:colorSurfaceContainerHigh
                if(scrollView0.canScrollVertically(-1)) {
                    toolbar0.setBackgroundColor(v);
                }
                else {
                    toolbar0.setBackgroundColor(0);
                }
                if(scrollView0.canScrollVertically(1)) {
                    this.p(true, v);
                    return;
                }
                this.p(false, 0);
            });
            scrollView0.post(() -> {
                Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B08D8);  // id:Toolbar
                ScrollView scrollView0 = (ScrollView)this.findViewById(0x7F0B07A9);  // id:ScrollView
                int v = fipx.a(this, 0x7F04033A);  // attr:colorSurfaceContainerHigh
                if(scrollView0.canScrollVertically(-1)) {
                    toolbar0.setBackgroundColor(v);
                }
                else {
                    toolbar0.setBackgroundColor(0);
                }
                if(scrollView0.canScrollVertically(1)) {
                    this.p(true, v);
                    return;
                }
                this.p(false, 0);
            });
            evft.c(((ComposeViewHeader)this.findViewById(0x7F0B0995)), Integer.valueOf(0x7F080E72), null, this.getString(this.n()), this.getString(this.m()));  // id:ViewHeader
            evft.e(((ComposeActionBar)this.findViewById(0x7F0B020A)), "Set a screen lock", 0, new etlz(this));  // id:ComposeActionBar
            return;
        }
        this.setContentView(0x7F0E0B96);  // layout:tp_device_admin_prompt_activity_wallet_foldable
        this.o(this.o);
        ((TextView)this.findViewById(0x7F0B00E0)).setText(this.m());  // id:Body
        TextView textView0 = (TextView)this.findViewById(0x7F0B08BD);  // id:Title
        Button button0 = (Button)this.findViewById(0x7F0B0120);  // id:Button
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B08D8);  // id:Toolbar
        toolbar0.v(0x7F080AF0);  // drawable:quantum_gm_ic_arrow_back_vd_theme_24
        toolbar0.x(new etmc(this));
        toolbar0.t(0x7F1507EB);  // string:common_back "Back"
        textView0.setText(this.n());
        button0.setOnClickListener(new etmb(this));
    }

    @Override  // etsq
    protected final void onStart() {
        super.onStart();
        this.j.l(this.j.f(gjsj.aa));
    }

    private final void p(boolean z, int v) {
        ComposeActionBar composeActionBar0 = (ComposeActionBar)this.findViewById(0x7F0B020A);  // id:ComposeActionBar
        ConstraintLayout constraintLayout0 = (ConstraintLayout)this.findViewById(0x7F0B0016);  // id:ActionBarContainer
        batl.s(composeActionBar0);
        batl.s(constraintLayout0);
        evft.d(composeActionBar0, z, constraintLayout0, v);
    }
}

