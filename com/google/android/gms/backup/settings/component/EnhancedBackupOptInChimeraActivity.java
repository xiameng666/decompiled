package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import aqnb;
import aqnk;
import aqpj;
import aqql;
import aqrd;
import aqsm;
import aqvc;
import aqvd;
import aqzc;
import aqzi;
import aqzk;
import aqzx;
import ashq;
import ashr;
import asht;
import ashu;
import ashv;
import asid;
import asie;
import asit;
import aspm;
import asxb;
import atbi;
import atbw;
import atbx;
import atca;
import atcb;
import atce;
import atcm;
import atcn;
import baun;
import bbdg;
import bblp;
import ca;
import ccmq;
import com.google.android.gms.backup.common.util.session.ParcelableSession;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import du;
import fpxr;
import fpxs;
import gaec;
import gajp;
import gajq;
import gfsi;
import gftb;
import gful_cronetEngineProvider;
import gfus;
import giah;
import gqtz;
import grkh;
import hgwl;
import hqky;
import ibuq;
import java.util.concurrent.ExecutorService;
import xob;

@GmsCoreVeId(0x3EE10)
public class EnhancedBackupOptInChimeraActivity extends xob implements asid, atbw, atca, atcm {
    private ParcelableSession A;
    private asit B;
    public static final baun j;
    public ExecutorService k;
    public aqnb l;
    public boolean m;
    public boolean n;
    public aqsm o;
    public aspm p;
    public asxb q;
    private final gful_cronetEngineProvider r;
    private hgwl s;
    private boolean t;
    private asie u;
    private final gfsi v;
    private aqzk w;
    private boolean x;
    private du y;
    private aqrd z;

    static {
        EnhancedBackupOptInChimeraActivity.j = aqql.a("EnhancedBackupOptIn");
    }

    public EnhancedBackupOptInChimeraActivity() {
        this.r = gfus.a(((gful_cronetEngineProvider)new ashq()));
        this.s = hgwl.a;
        this.v = new ashr();
    }

    @Override  // atbw
    public final void a(Account account0, Intent intent0) {
        if(this.u == null) {
            this.u = new asie();
        }
        asit asit0 = asit.g(this, new aqnk(this), account0, intent0, false, this.A);
        this.B = asit0;
        if(this.t(atce.class)) {
            this.s();
            asit0.b(gqtz.T);
            return;
        }
        this.p.h(5);
        this.n(((du)this.v.apply(account0)));
    }

    public final void b() {
        this.c(null);
    }

    // Detected as a lambda impl.
    public final void c(PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo0) {
        EnhancedBackupOptInChimeraActivity.j.j("navigateToBackupSettings: optInFromBackupSettings=%b", new Object[]{Boolean.valueOf(this.t)});
        if(this.t) {
            if(photosEnablementSnackbarInfo0 == null) {
                this.setResult(-1);
            }
            else {
                Intent intent0 = new Intent();
                intent0.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo0);
                this.setResult(-1, intent0);
            }
            this.finishAndRemoveTask();
            this.overridePendingTransition(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
            return;
        }
        Intent intent1 = aqzc.a(this, giah.d);
        if(photosEnablementSnackbarInfo0 != null) {
            intent1.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo0);
        }
        this.startActivity(intent1);
        if(fpxs.b() && ibuq.m(intent1.getAction(), "android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY")) {
            this.finishAndRemoveTask();
            return;
        }
        this.finishAfterTransition();
    }

    @Override  // atca
    public final void f() {
        this.runOnUiThread(() -> this.m(null, null));
    }

    @Override  // asid
    public final void g(Account account0, PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo0) {
        this.runOnUiThread(() -> {
            String s = account0 == null ? null : account0.name;
            aqrd aqrd0 = this.z;
            grkh grkh0 = this.A.c();
            aqrd0.a(s, aqrd.c, aqrd.b, grkh0).z((/* MISSING LAMBDA PARAMETER */) -> {
                EnhancedBackupOptInChimeraActivity.j.j("navigateToBackupSettings: optInFromBackupSettings=%b", new Object[]{Boolean.valueOf(this.t)});
                if(this.t) {
                    if(photosEnablementSnackbarInfo0 == null) {
                        this.setResult(-1);
                    }
                    else {
                        Intent intent0 = new Intent();
                        intent0.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo0);
                        this.setResult(-1, intent0);
                    }
                    this.finishAndRemoveTask();
                    this.overridePendingTransition(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
                    return;
                }
                Intent intent1 = aqzc.a(this, giah.d);
                if(photosEnablementSnackbarInfo0 != null) {
                    intent1.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo0);
                }
                this.startActivity(intent1);
                if(fpxs.b() && ibuq.m(intent1.getAction(), "android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY")) {
                    this.finishAndRemoveTask();
                    return;
                }
                this.finishAfterTransition();
            });
        });
    }

    @Override  // atcm
    public final void h() {
        asit asit0 = this.B;
        if(asit0 != null) {
            this.s();
            asit0.b(gqtz.U);
            return;
        }
        EnhancedBackupOptInChimeraActivity.j.m("photosEnablementController null in onPhotosPreludeFragmentContinuePressed. This shouldn\'t happen.", new Object[0]);
        this.b();
    }

    @Override  // atcm
    public final void i(Account account0) {
        this.l(account0);
    }

    // Detected as a lambda impl.
    @Override  // atbw
    public final void l(Account account0) {
        this.m(account0, null);
    }

    // Detected as a lambda impl.
    @Override  // atbw
    public final void m(Account account0, PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo0) {
        String s = account0 == null ? null : account0.name;
        aqrd aqrd0 = this.z;
        grkh grkh0 = this.A.c();
        aqrd0.a(s, aqrd.c, aqrd.b, grkh0).z((/* MISSING LAMBDA PARAMETER */) -> {
            EnhancedBackupOptInChimeraActivity.j.j("navigateToBackupSettings: optInFromBackupSettings=%b", new Object[]{Boolean.valueOf(this.t)});
            if(this.t) {
                if(photosEnablementSnackbarInfo0 == null) {
                    this.setResult(-1);
                }
                else {
                    Intent intent0 = new Intent();
                    intent0.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo0);
                    this.setResult(-1, intent0);
                }
                this.finishAndRemoveTask();
                this.overridePendingTransition(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
                return;
            }
            Intent intent1 = aqzc.a(this, giah.d);
            if(photosEnablementSnackbarInfo0 != null) {
                intent1.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo0);
            }
            this.startActivity(intent1);
            if(fpxs.b() && ibuq.m(intent1.getAction(), "android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY")) {
                this.finishAndRemoveTask();
                return;
            }
            this.finishAfterTransition();
        });
    }

    public final void n(du du0) {
        gftb.check(du0);
        if(this.t(du0.getClass())) {
            return;
        }
        if(this.x) {
            Object[] arr_object = {du0.getClass().getName()};
            EnhancedBackupOptInChimeraActivity.j.d("Activity is paused, preserving fragment %s", arr_object);
            this.y = du0;
            return;
        }
        ParcelableSession parcelableSession0 = this.A;
        if(parcelableSession0 != null) {
            Bundle bundle0 = du0.getArguments();
            if(bundle0 == null) {
                Bundle bundle1 = new Bundle();
                bundle1.putParcelable("backup_flow_session", parcelableSession0);
                du0.setArguments(bundle1);
            }
            else {
                bundle0.putParcelable("backup_flow_session", parcelableSession0);
            }
        }
        if(((Boolean)this.r.mr()).booleanValue()) {
            Bundle bundle2 = du0.getArguments();
            if(bundle2 == null) {
                Bundle bundle3 = new Bundle();
                bundle3.putInt("opt_in_caller", this.s.v);
                du0.setArguments(bundle3);
            }
            else {
                bundle2.putInt("opt_in_caller", this.s.v);
            }
        }
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.z(0x7F0B188A, du0, du0.getClass().getName());  // id:main_content
        ca0.a();
    }

    public final void o() {
        this.r(new atbi(this.l, this.w, this.m, this.n));
    }

    @Override  // xoi
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 10004) {
            if(v1 != -1) {
                EnhancedBackupOptInChimeraActivity.j.d("Adding a new account was cancelled or failed: resultCode=" + v1, new Object[0]);
                return;
            }
            if(intent0 != null) {
                String s = intent0.getStringExtra("authAccount");
                String s1 = intent0.getStringExtra("accountType");
                baun baun0 = EnhancedBackupOptInChimeraActivity.j;
                String s2 = baun.q(s);
                if(s1 == null) {
                    s1 = "null";
                }
                baun0.d("Account successfully added: name=%s, type=%s", new Object[]{s2, s1});
                this.p();
                return;
            }
            EnhancedBackupOptInChimeraActivity.j.m("No intent was returned for add account flow, even though it was successful.", new Object[0]);
        }
    }

    @Override  // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme resources$Theme0, int v, boolean z) {
        if(gaec.x(this) && gaec.B(this)) {
            EnhancedBackupOptInChimeraActivity.j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            resources$Theme0.applyStyle(0x7F160289, true);  // style:BcStyleThemeOverlay
        }
        else {
            EnhancedBackupOptInChimeraActivity.j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            resources$Theme0.applyStyle(0x7F160440, true);  // style:HeavyThemeOverlay
        }
        super.onApplyThemeResource(resources$Theme0, v, z);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        EnhancedBackupOptInChimeraActivity enhancedBackupOptInChimeraActivity0;
        ccmq.a().a(bbdg.mj);
        boolean z = false;
        EnhancedBackupOptInChimeraActivity.j.j("onCreate", new Object[0]);
        String s = this.getIntent().getStringExtra("theme");
        gajq.d();
        this.setTheme(new gajq(0x7F16095B, true).c(s, ((boolean)(gaec.x(this) ^ 1))));  // style:SudThemeGlifV3.DayNight
        if(gaec.y(this)) {
            this.setTheme(gajp.a(this));
        }
        super.onCreate(bundle0);
        this.setContentView(0x7F0E017E);  // layout:backup_settings_activity_main
        this.A = aqzx.a(bundle0);
        Intent intent0 = this.getIntent();
        ibuq.f(intent0, "intent");
        if(intent0.getBooleanExtra("optInFromBackupSettings", false) || intent0.getBooleanExtra("optInFromBackupSettingsWithMissingDollyConsent", false)) {
            z = true;
        }
        this.t = z;
        if(((Boolean)this.r.mr()).booleanValue()) {
            this.s = fpxr.b(this.getIntent());
        }
        if(this.k == null) {
            this.k = new bblp(3, 9);
        }
        if(this.w == null) {
            this.w = new aqzk(this.k, this);
        }
        if(this.o == null) {
            this.o = aqsm.b(this.getApplicationContext());
        }
        if(this.p == null) {
            this.p = new aspm(this);
        }
        if(bundle0 == null) {
            enhancedBackupOptInChimeraActivity0 = this;
        }
        else {
            if(this.u == null) {
                this.u = new asie();
            }
            aqnk aqnk0 = new aqnk(this);
            ParcelableSession parcelableSession0 = this.A;
            Account account0 = (Account)bundle0.getParcelable("photos-enablement-account");
            Intent intent1 = (Intent)bundle0.getParcelable("photos-enablement-intent");
            asit asit0 = null;
            if(account0 != null && intent1 != null) {
                enhancedBackupOptInChimeraActivity0 = this;
                asit0 = asit.g(enhancedBackupOptInChimeraActivity0, aqnk0, account0, intent1, bundle0.getBoolean("photos-enablement-attempted"), parcelableSession0);
            }
            else {
                enhancedBackupOptInChimeraActivity0 = this;
            }
            enhancedBackupOptInChimeraActivity0.B = asit0;
        }
        if(enhancedBackupOptInChimeraActivity0.z == null) {
            enhancedBackupOptInChimeraActivity0.z = new aqrd(enhancedBackupOptInChimeraActivity0, new bblp(0x7FFFFFFF, 9));
        }
        if(hqky.e()) {
            Context context0 = enhancedBackupOptInChimeraActivity0.getApplicationContext();
            ibuq.f(context0, "context");
            enhancedBackupOptInChimeraActivity0.q = new asxb(context0, new aqpj(context0));
        }
        ashu ashu0 = new ashu(enhancedBackupOptInChimeraActivity0);
        new aqzi(enhancedBackupOptInChimeraActivity0.k).b(ashu0);
    }

    @Override  // xoi
    protected final void onDestroy() {
        super.onDestroy();
        this.k.shutdown();
    }

    @Override  // xoi
    protected final void onPause() {
        EnhancedBackupOptInChimeraActivity.j.j("onPause", new Object[0]);
        super.onPause();
        this.x = true;
    }

    @Override  // xoi
    protected final void onResume() {
        baun baun0 = EnhancedBackupOptInChimeraActivity.j;
        baun0.j("onResume", new Object[0]);
        super.onResume();
        this.x = false;
        du du0 = this.y;
        if(du0 != null) {
            baun0.d("Showing queued fragment %s", new Object[]{du0.getClass().getName()});
            this.n(this.y);
            this.y = null;
        }
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        asit asit0 = this.B;
        if(asit0 != null) {
            bundle0.putParcelable("photos-enablement-account", asit0.d);
            bundle0.putParcelable("photos-enablement-intent", asit0.i);
            bundle0.putBoolean("photos-enablement-attempted", asit0.k);
        }
        ParcelableSession parcelableSession0 = this.A;
        if(parcelableSession0 != null) {
            bundle0.putParcelable("backup_flow_session", parcelableSession0);
        }
    }

    public final void p() {
        baun baun0 = EnhancedBackupOptInChimeraActivity.j;
        baun0.d("updateScreenToShowOptIn account=" + this.getIntent().getParcelableExtra("account"), new Object[0]);
        if(this.B != null && (this.t(atcn.class) || this.t(atce.class))) {
            baun0.d("We are in the process of enabling Photos AB, do not change the opt-in fragment. Aborting updateScreenToShowOptIn.", new Object[0]);
            return;
        }
        if(this.t) {
            this.o();
            return;
        }
        if(ashv.a(this.getIntent(), "showPhotosOptIn")) {
            this.r(new atce(this.l, this.w, this.m, this.n));
            return;
        }
        aqvc aqvc0 = aqvd.a();
        aqvc0.c(7);
        aqvd aqvd0 = aqvc0.a();
        this.l.c(new asht(this), aqvd0);
    }

    public final boolean q() {
        return ashv.a(this.getIntent(), "showPhotosOptIn");
    }

    private final void r(atbx atbx0) {
        Account account0 = (Account)this.getIntent().getParcelableExtra("account");
        if(account0 != null) {
            atbx0.M(account0);
        }
        this.n(atbx0);
    }

    private final void s() {
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.F(atcb.class, atcb.class.getName());
        ca0.a();
    }

    private final boolean t(Class class0) {
        return this.getSupportFragmentManager().h(class0.getName()) != null;
    }
}

