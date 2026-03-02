package com.google.android.gms.tapandpay.diagnostics;

import android.app.Activity;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import azts;
import batl;
import bkyf;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.TapDiagnosticsIntentSource;
import com.google.android.libraries.tapandpay.ui.viewheader.ViewHeader;
import dagger.internal.Preconditions;
import domu;
import domv;
import dydw;
import esgb;
import eshp;
import eshq;
import eshr;
import eshs;
import esht;
import eshu;
import eshz;
import esii;
import esil;
import esin;
import esiq;
import esir;
import esiy;
import esiz;
import esjc;
import etgl;
import etsq;
import evjj;
import fhvo;
import fhwk;
import fhwp;
import fshb;
import fuop;
import fuor;
import ggeo;
import hwke;
import hwoz;
import hypg;
import im;
import kfe;
import lpg;
import lqd;

@GmsCoreVeId(0x3FE2A)
public final class TapDiagnosticsChimeraActivity extends etsq implements fshb {
    public eshz j;
    esil k;
    public fhwk l;
    eshp m;
    public azts n;
    private AccountInfo o;
    private String p;

    public final void a(boolean z) {
        ViewHeader viewHeader0 = (ViewHeader)this.findViewById(0x7F0B09B9);  // id:WalletTapDiagnosticsHeader
        viewHeader0.l((z ? 0x7F1533E5 : 0x7F1533E4));  // string:tp_wallet_tap_diagnostics_title_setup "You\'re ready to tap to pay with your 
                                                       // phone"
        if(z) {
            viewHeader0.i("");
            return;
        }
        viewHeader0.k(0x7F1533E3);  // string:tp_wallet_tap_diagnostics_subtitle_not_setup "Let\'s get you set up to tap 
                                    // to pay with your phone"
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // etsq
    protected final boolean l() {
        return true;
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(this.m == null) {
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.m = new eshp(domv0);
        }
        this.m.inject(this);
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        this.o = accountInfo0;
        if(accountInfo0 != null) {
            this.p = accountInfo0.b;
        }
        if(!hypg.c()) {
            this.setTheme(0x7F16106D);  // style:WalletTheme.NoActionBar
        }
        this.setContentView(0x7F0E0BCF);  // layout:tp_wallet_component_activity_tap_diagnostics
        this.setTitle(" ");
        ViewSwitcher viewSwitcher0 = (ViewSwitcher)this.findViewById(0x7F0B0875);  // id:TapDiagnosticsSwitcher
        ViewHeader viewHeader0 = (ViewHeader)this.findViewById(0x7F0B09B9);  // id:WalletTapDiagnosticsHeader
        RecyclerView recyclerView0 = (RecyclerView)this.findViewById(0x7F0B0873);  // id:TapDiagnosticsRecyclerView
        this.hG(((Toolbar)this.findViewById(0x7F0B08D8)));  // id:Toolbar
        im im0 = this.hL();
        if(im0 != null) {
            im0.B("");
            im0.o(true);
            im0.w(0x7F080AF0);  // drawable:quantum_gm_ic_arrow_back_vd_theme_24
            im0.u(0x7F1507EB);  // string:common_back "Back"
        }
        esin esin0 = new esin(this, this.getLifecycle());
        int v = (int)this.getResources().getDimension(0x7F0713F6);  // dimen:tp_medium_spacing
        int v1 = (int)this.getResources().getDimension(0x7F0713D8);  // dimen:tp_20_dp
        int v2 = (int)this.getResources().getDimension(0x7F0713D5);  // dimen:tp_12_dp
        fuor fuor0 = fuor.c;
        if(this.I.a.a == fuor0 && this.I.a.b == fuor0) {
            viewHeader0.setPadding(v, 0, v2, 0);
            viewSwitcher0.setPadding(v2, 0, v, 0);
        }
        if(this.I.a.a == fuor.d && this.I.a.b == fuor0) {
            viewHeader0.setPadding(v, 0, v1, 0);
            viewSwitcher0.setPadding(v1, 0, v, 0);
        }
        TapDiagnosticsIntentSource tapDiagnosticsIntentSource0 = (TapDiagnosticsIntentSource)dydw.b(this.getIntent(), "extra_source", TapDiagnosticsIntentSource.CREATOR);
        if(tapDiagnosticsIntentSource0 == null) {
            esin0.h = 1;
        }
        else {
            int v3 = 2;
            int v4 = tapDiagnosticsIntentSource0.a;
            switch(v4) {
                case 1: {
                    esin0.h = 3;
                    break;
                }
                case 2: {
                    esin0.h = v3;
                    break;
                }
                default: {
                    v3 = 4;
                    switch(v4) {
                        case 3: {
                            esin0.h = v3;
                            break;
                        }
                        case 4: {
                            esin0.h = 5;
                            break;
                        }
                        default: {
                            esin0.h = 1;
                        }
                    }
                }
            }
        }
        esin0.b = this.o;
        boolean z = esgb.c(this);
        esin0.c = Boolean.valueOf(z);
        if(z) {
            fuop.b(this.J, recyclerView0);
            viewHeader0.l(0x7F15333F);  // string:tp_tap_diagnostics_title_loading "Checking your settings"
            kfe.k(viewHeader0, true);
            viewHeader0.k(0x7F15333D);  // string:tp_tap_diagnostics_subtitle_loading "This will just take a minute"
            if(this.j == null) {
                lpg lpg0 = this.getLifecycle();
                AccountInfo accountInfo1 = this.o;
                lqd lqd0 = new lqd(lpg0, this, evjj.f(this));
                lqd lqd1 = new lqd(lpg0, evjj.f(this));
                lqd lqd2 = new lqd(lpg0, this);
                esiz esiz0 = new esiz(new etgl(this));
                esiz0.b();
                lpg0.c(new esiy(esiz0));
                esir esir0 = new esir(new etgl(this), this, accountInfo1);
                esir0.b(true);
                lpg0.c(new esiq(esir0));
                this.j = new eshz(ggeo.p(esjc.b, lqd0, esjc.c, lqd1, esjc.d, lqd2, esjc.e, esiz0, esjc.f, esir0));
            }
            recyclerView0.ap(new LinearLayoutManager());
            AccountInfo accountInfo2 = this.o;
            esil esil0 = new esil(this.j, this, new eshq(this, evjj.f(this), accountInfo2, esin0));
            this.k = esil0;
            esii esii0 = new esii(esil0);
            esil0.f.c.g(this, esii0);
            recyclerView0.an(this.k);
            this.j.a.g(this, new eshs(this, esin0, viewSwitcher0));
            this.j.b.g(this, new esht(this));
            this.j.c.g(this, new eshu(this, esin0));
        }
        else {
            this.setContentView(0x7F0E0B86);  // layout:tp_activity_tap_diagnostics_error
            batl.s(im0);
            im0.h();
            TextView textView0 = (TextView)this.findViewById(0x7F0B08BD);  // id:Title
            TextView textView1 = (TextView)this.findViewById(0x7F0B0853);  // id:Subtitle
            ((Button)this.findViewById(0x7F0B0120)).setOnClickListener(new eshr(this));  // id:Button
            View view0 = this.findViewById(0x7F0B2333);  // id:tp_tap_diagnostics_error_root
            fuop.a(this.J, view0);
            textView0.setText(0x7F153340);  // string:tp_tap_diagnostics_title_unrecoverable_error "You won\'t be able to tap to 
                                            // pay with this phone"
            textView1.setText(0x7F15333E);  // string:tp_tap_diagnostics_subtitle_unrecoverable_error "This phone doesn\'t support 
                                            // tap to pay"
        }
        if(this.p == null) {
            return;
        }
        fhwk fhwk0 = this.l;
        Activity activity0 = this.getContainerActivity();
        fhvo fhvo0 = this.l.a.a(207332);
        String s = this.p;
        batl.s(s);
        fhvo0.e(fhwp.b(s));
        fhwk0.i(activity0, fhvo0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        if(hwoz.a.b().n() && (this.o == null || ((Boolean)this.o.b().d()).booleanValue())) {
            return false;
        }
        this.getMenuInflater().inflate(0x7F10003F, menu0);  // menu:tp_activity_diagnostics_feedback_menu
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        Bitmap bitmap0;
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.finish();
                return true;
            }
            case 0x7F0B03E1: {  // id:FeedbackItem
                azts azts0 = this.n;
                if(azts0 != null) {
                    bkyf bkyf0 = new bkyf(this);
                    ThemeSettings themeSettings0 = new ThemeSettings();
                    themeSettings0.a = 3;
                    bkyf0.e = themeSettings0;
                    String s = this.p;
                    if(s != null) {
                        bkyf0.b = s;
                    }
                    if(!hwke.g().isEmpty()) {
                        bkyf0.d = hwke.g();
                    }
                    View view0 = this.getWindow().getDecorView().getRootView();
                    if(view0.getWidth() <= 0) {
                        bitmap0 = null;
                    }
                    else {
                        Bitmap bitmap1 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
                        view0.draw(new Canvas(bitmap1));
                        bitmap0 = bitmap1;
                    }
                    if(bitmap0 != null) {
                        bkyf0.a = bitmap0;
                    }
                    azts0.ab(bkyf0.a());
                    return true;
                }
                return super.onOptionsItemSelected(menuItem0);
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

