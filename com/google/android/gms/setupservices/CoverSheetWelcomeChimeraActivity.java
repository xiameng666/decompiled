package com.google.android.gms.setupservices;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemProperties;
import android.os.UserManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bagv;
import bagx;
import baun;
import bbnp;
import bbqa;
import cmec;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.setupdesign.view.SudLottieAnimationView;
import eozo;
import eozp;
import epdk;
import fhwp;
import gaec;
import gafj;
import gajj;
import gajk;
import gajl;
import gajp;
import gftb;
import ghon;
import ghpy;
import gltz;
import hzfr;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jys;
import kex;
import kfv;
import ris;

@GmsCoreVeId(0x3FCEF)
public final class CoverSheetWelcomeChimeraActivity extends epdk implements View.OnClickListener {
    public static final baun j;
    public cmec k;
    private Button l;
    private Bundle m;
    private ProtoLiteBuilder n;

    static {
        CoverSheetWelcomeChimeraActivity.j = new baun("SetupServices", new String[]{"CoverSheetWelcomeActivity"});
    }

    @Override  // bagc
    protected final bagx A() {
        bagx bagx0 = bagx.b(null);
        String s = gaec.l(this);
        if(s != null) {
            bagx0.a = s;
            return bagx0;
        }
        bagx0.a = "glif_v4_light";
        return bagx0;
    }

    @Override  // eozn
    protected final String a() {
        return "CoverSheetWelcomeActivity";
    }

    @Override  // bagc
    protected final void gD(String s, boolean z) {
        if(s != null) {
            bagv.h(this, s);
        }
        if(gaec.y(this)) {
            this.setTheme(gajp.a(this));
        }
        bagv.d(this, z, this.getBaseContext());
    }

    @Override  // epfi
    public final Bundle k() {
        if(this.m == null) {
            this.m = new Bundle();
        }
        return this.m;
    }

    static String o(Context context0) {
        if(bbnp.k(context0)) {
            return "PHONE";
        }
        return bbnp.n(context0) ? "TABLET" : "UNKNOWN";
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0 == this.l) {
            if(CoverSheetWelcomeChimeraActivity.m()) {
                this.k.d(gltz.e, view0);
            }
            Intent intent0 = new Intent("com.google.android.gms.auth.GOOGLE_SERVICES");
            intent0.setPackage("com.google.android.gms");
            intent0.setFlags(0x14000000);
            intent0.putExtra("theme", gaec.l(this));
            if(this.w()) {
                intent0.putExtra("post_ota_el_capitan_consent", 2);
            }
            else if(this.v()) {
                intent0.putExtra("is_el_capitan_consent", true);
                intent0.putExtra("post_ota_el_capitan_consent", 1);
            }
            ProtoLiteBuilder hftp0 = this.n;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghpy ghpy0 = (ghpy)hftp0.b_message;
            ghpy0.b |= 1;
            ghpy0.c = true;
            this.t(((ghpy)hftp0.N_build()));
            this.startActivity(intent0);
            this.c(-1);
        }
    }

    @Override  // eozn
    protected final void onCreate(Bundle bundle0) {
        if(bundle0 != null) {
            this.m = new Bundle(bundle0);
        }
        super.onCreate(bundle0);
        int v = this.p();
        ghpy ghpy0 = ((ghon)this.l().b_message).ad;
        if(ghpy0 == null) {
            ghpy0 = ghpy.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghpy0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ghpy0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghpy ghpy1 = (ghpy)hftp0.b_message;
        ghpy1.b |= 4;
        ghpy1.e = v;
        this.n = hftp0;
        Boolean boolean0 = Boolean.valueOf(hzfr.h());
        CoverSheetWelcomeChimeraActivity.j.h("Original Reviewed version: %d, elCapitanPostOtaFlowEnabled: %b, elCapitanPostOtaFlowV2Enabled: %b", new Object[]{v, boolean0, Boolean.valueOf(hzfr.i())});
        if(!this.w() && !this.v()) {
            this.s();
            return;
        }
        if(Build.VERSION.SDK_INT >= 35 && UserManager.isHeadlessSystemUserMode() && hzfr.f()) {
            Settings.Secure.putLong(this.getContentResolver(), "el_capitan_time_stamp", System.currentTimeMillis());
        }
        else {
            Settings.Global.putLong(this.getContentResolver(), "el_capitan_time_stamp", System.currentTimeMillis());
        }
        if(this.getWindow() != null) {
            kfv.a(this.getWindow(), false);
        }
        if(gaec.t(this)) {
            this.setContentView(0x7F0E0984);  // layout:setupservices_el_capitan_welcome_expressive_activity
        }
        else {
            this.setContentView(0x7F0E0983);  // layout:setupservices_el_capitan_welcome_activity
        }
        TextView textView0 = (TextView)this.findViewById(0x7F0B24F8);  // id:welcome_title
        TextView textView1 = (TextView)this.findViewById(0x7F0B24F6);  // id:welcome_description
        if(textView0 != null) {
            textView0.setText(ris.a("{DEVICE_TYPE, select, PHONE {Your Pixel is up to date} TABLET {Your Pixel Tablet is up to date} other {Your Pixel is up to date} }", new Object[]{"DEVICE_TYPE", CoverSheetWelcomeChimeraActivity.o(this.getApplicationContext())}));
        }
        if(textView1 != null) {
            textView1.setText(ris.a("{DEVICE_TYPE, select, PHONE {Check out how your Pixel just got better} TABLET {Check out how your Pixel Tablet just got better} other {Check out how your Pixel just got better} }", new Object[]{"DEVICE_TYPE", CoverSheetWelcomeChimeraActivity.o(this.getApplicationContext())}));
        }
        View view0 = this.findViewById(0x7F0B14AA);  // id:footer_bar_container
        Button button0 = (Button)this.findViewById(0x7F0B20B8);  // id:start
        this.l = button0;
        if(button0 != null) {
            button0.setOnClickListener(this);
            if(!gaec.t(this)) {
                Context context0 = this.getApplicationContext();
                Button button1 = this.l;
                gftb.check(button1);
                gafj.c(context0, button1, true);
            }
        }
        InputStream inputStream0 = this.q();
        if(inputStream0 != null) {
            if(gaec.t(this)) {
                SudLottieAnimationView sudLottieAnimationView0 = (SudLottieAnimationView)this.findViewById(0x7F0B0C44);  // id:background
                if(sudLottieAnimationView0 != null) {
                    ArrayList arrayList0 = new ArrayList();
                    gajk gajk0 = gajl.a(this, 0x7F030078);  // array:welcome_animation_customization
                    Collections.addAll(arrayList0, gajk0.a.getStringArray(gajk0.b));
                    this.r(sudLottieAnimationView0, inputStream0, arrayList0);
                }
            }
            else {
                LottieAnimationView lottieAnimationView0 = (LottieAnimationView)this.findViewById(0x7F0B0C44);  // id:background
                if(lottieAnimationView0 != null) {
                    ArrayList arrayList1 = new ArrayList();
                    Collections.addAll(arrayList1, this.getResources().getStringArray(0x7F030078));  // array:welcome_animation_customization
                    this.r(lottieAnimationView0, inputStream0, arrayList1);
                }
            }
        }
        this.getWindow().setStatusBarColor(0);
        if(CoverSheetWelcomeChimeraActivity.m()) {
            this.k.k(227270, fhwp.c());
            Button button2 = this.l;
            if(button2 != null) {
                this.k.g(button2, 0x2EDE8);
            }
        }
        kex.b(view0, new eozo());
        if(this.w()) {
            ProtoLiteBuilder hftp1 = this.n;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghpy ghpy2 = (ghpy)hftp1.b_message;
            ghpy2.b |= 8;
            ghpy2.f = 2;
            this.t(((ghpy)hftp1.N_build()));
        }
        else if(this.v()) {
            ProtoLiteBuilder hftp2 = this.n;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghpy ghpy3 = (ghpy)hftp2.b_message;
            ghpy3.b |= 8;
            ghpy3.f = 1;
            this.t(((ghpy)hftp2.N_build()));
        }
        eozp eozp0 = new eozp(this);
        this.d.b(eozp0);
    }

    private final int p() {
        return Build.VERSION.SDK_INT < 35 || !UserManager.isHeadlessSystemUserMode() || !hzfr.e() ? Settings.Global.getInt(this.getContentResolver(), "el_capitan_reviewed_version", 0) : Settings.Secure.getInt(this.getContentResolver(), "el_capitan_reviewed_version", 0);
    }

    private final InputStream q() {
        InputStream inputStream0 = this.getResources().openRawResource(0x7F140285);  // raw:welcome_bg
        if(gaec.t(this)) {
            gajk gajk0 = gajl.a(this, 0x7F140012);  // raw:bc_welcome_bg
            int v = gajk0.b;
            if(v != 0) {
                try {
                    return gajk0.a.openRawResource(v);
                }
                catch(NullPointerException | Resources.NotFoundException | IllegalAccessError throwable0) {
                    CoverSheetWelcomeChimeraActivity.j.n("Failed to open lottie animation raw resource with exception: %s", throwable0, new Object[0]);
                }
            }
        }
        return inputStream0;
    }

    private final void r(LottieAnimationView lottieAnimationView0, InputStream inputStream0, List list0) {
        lottieAnimationView0.x(inputStream0);
        gajj.a().c(this, lottieAnimationView0, list0);
        lottieAnimationView0.i();
    }

    private final void s() {
        int v = 2;
        try {
            Intent intent0 = new Intent("com.google.android.apps.tips.action.COVERSHEET");
            intent0.setPackage("com.google.android.apps.tips");
            intent0.setFlags(0x14000000);
            this.startActivity(intent0);
            ProtoLiteBuilder hftp0 = this.n;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghpy ghpy0 = (ghpy)hftp0.b_message;
            ghpy0.b |= 2;
            ghpy0.d = true;
        }
        catch(ActivityNotFoundException unused_ex) {
            CoverSheetWelcomeChimeraActivity.j.m("Coversheet was not found", new Object[0]);
        }
        if(SystemProperties.getBoolean("pixel_legal_joint_permission", false) && (Build.VERSION.SDK_INT < 35 || !UserManager.isHeadlessSystemUserMode()) && Settings.Global.getInt(this.getContentResolver(), "el_capitan_reviewed", 0) == 1 && Settings.Global.getInt(this.getContentResolver(), "el_capitan_reviewed_version", 0) <= 0) {
            Settings.Global.putInt(this.getContentResolver(), "el_capitan_reviewed_version", 1);
        }
        CoverSheetWelcomeChimeraActivity.j.h("Skip el-cap Coversheet.", new Object[0]);
        if(!hzfr.i()) {
            v = 3;
        }
        else if(!this.u()) {
            v = jys.d() ? 1 : 4;
        }
        ProtoLiteBuilder hftp1 = this.n;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghpy)hftp1.b_message).g = v - 1;
        ((ghpy)hftp1.b_message).b |= 16;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghpy ghpy1 = (ghpy)hftp1.b_message;
        ghpy1.b |= 1;
        ghpy1.c = false;
        this.t(((ghpy)hftp1.N_build()));
        this.h.c();
        this.finish();
    }

    private final void t(ghpy ghpy0) {
        ProtoLiteBuilder hftp0 = this.l();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp0.b_message;
        ghpy0.getClass();
        ghon0.ad = ghpy0;
        ghon0.c |= 0x40000000;
    }

    private final boolean u() {
        return this.p() == 2 || SystemProperties.getBoolean("pixel_legal_joint_permission_v2", false);
    }

    private final boolean v() {
        return hzfr.g() && hzfr.h() && bbqa.d() && bbnp.m(this) && !hzfr.i() && this.p() != 1 && !SystemProperties.getBoolean("pixel_legal_joint_permission", false) && !this.u();
    }

    private final boolean w() {
        return hzfr.g() && hzfr.i() && jys.d() && bbnp.m(this) && !this.u();
    }
}

