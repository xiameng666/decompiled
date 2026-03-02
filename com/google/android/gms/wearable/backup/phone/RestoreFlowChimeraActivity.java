package com.google.android.gms.wearable.backup.phone;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import aztr_settings;
import azts;
import baun;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.wearable.AppTheme;
import evql;
import fcfo;
import fcgf;
import fcgh;
import fckl;
import fckn;
import fcko;
import fckp;
import fckq;
import fckr;
import fcks;
import fckt;
import fcku;
import fckv;
import fckw;
import fckx;
import fcky;
import fclc;
import fcll;
import fclm;
import fcln;
import fczo;
import fdlt;
import fyhn;
import gftb;
import hzyp;
import java.util.Locale;
import lqi;
import lsj;
import lso;
import ltw;
import lua;
import lub;
import nry;
import xni;

@GmsCoreVeId(0x3FEB4)
public final class RestoreFlowChimeraActivity extends xni implements fcll {
    public static final baun j;
    public static final ltw k;
    public static final ltw l;
    public static final ltw m;
    public static final ltw n;
    public static final ltw o;
    public static final ltw p;
    public static final ltw q;
    public nry r;
    public AppTheme s;
    private lua t;

    static {
        RestoreFlowChimeraActivity.j = new fcgf(new String[]{"RestoreFlowActivity"});
        RestoreFlowChimeraActivity.k = new fckq();
        RestoreFlowChimeraActivity.l = new fckr();
        RestoreFlowChimeraActivity.m = new fcks();
        RestoreFlowChimeraActivity.n = new fckt();
        RestoreFlowChimeraActivity.o = new fcku();
        RestoreFlowChimeraActivity.p = new fckv();
        RestoreFlowChimeraActivity.q = new fckw();
    }

    public RestoreFlowChimeraActivity() {
        this.r = null;
        this.t = null;
    }

    // Detected as a lambda impl.
    public final void a(AppTheme appTheme0) {
        String s;
        this.s = appTheme0;
        fczo.g(appTheme0, this.getIntent(), this);
        this.setContentView(0x7F0E022A);  // layout:companion_restore_flow_activity
        if(hzyp.i()) {
            s = null;
        }
        else {
            s = this.l("deviceName");
            if(s.equals("watch")) {
                s = "watch";
            }
        }
        fcln fcln0 = (fcln)new lso(this.getViewModelStore(), lsj.a(new lub[]{fcln.b}), this.g()).a(fcln.class);
        NavHostFragment navHostFragment0 = (NavHostFragment)this.getSupportFragmentManager().g(0x7F0B19B6);  // id:nav_host
        if(navHostFragment0 == null) {
            throw new IllegalStateException("NavHostFragment not found.");
        }
        this.getOnBackPressedDispatcher().c(navHostFragment0, new fckx(this));
        this.r = navHostFragment0.z();
        lqi lqi0 = fcln0.h;
        lqi0.g(this, new fckp(this));
        fcln0.k = this;
        if(!hzyp.i()) {
            gftb.check(s);
            fcln0.j = s;
        }
        if(!lqi0.n()) {
            if(!this.getIntent().getBooleanExtra("resume", false)) {
                fcln.a.j("Start restore flow", new Object[0]);
                if(hzyp.c()) {
                    fcln0.b(fclm.b);
                    return;
                }
                fcln0.b(fclm.a);
                return;
            }
            nry nry0 = this.r;
            gftb.check(nry0);
            nry0.i(0x7F0B0CC2);  // id:blank_fragment
            fcln.a.j("Resume restore flow", new Object[0]);
            evql evql0 = fcln0.d.f(fcln0.e);
            evql0.b(new fcky(fcln0));
            evql0.A(new fclc(fcln0));
        }
    }

    private final lua g() {
        if(this.t == null) {
            String s = this.l("nodeId");
            String s1 = this.l("accountName");
            lua lua0 = new lua();
            this.t = lua0;
            fckl fckl0 = fckl.h(this, s, s1);
            lua0.b(RestoreFlowChimeraActivity.k, fckl0);
            lua lua1 = this.t;
            fdlt fdlt0 = new fdlt(this, aztr_settings.a);
            lua1.b(RestoreFlowChimeraActivity.l, fdlt0);
            lua lua2 = this.t;
            fcgh fcgh0 = new fcgh();
            lua2.b(RestoreFlowChimeraActivity.m, fcgh0);
            this.t.b(RestoreFlowChimeraActivity.n, s);
            if(hzyp.c()) {
                this.t.b(RestoreFlowChimeraActivity.o, s1);
            }
            lua lua3 = this.t;
            boolean z = false;
            Boolean boolean0 = Boolean.valueOf(this.getIntent().getBooleanExtra("requireWifi", false));
            lua3.b(RestoreFlowChimeraActivity.p, boolean0);
            lua lua4 = this.t;
            ltw ltw0 = RestoreFlowChimeraActivity.q;
            if(!hzyp.a.b().j() || this.getIntent().getBooleanExtra("requireCharging", true)) {
                z = true;
            }
            lua4.b(ltw0, Boolean.valueOf(z));
        }
        return this.t;
    }

    private final String l(String s) {
        String s1 = this.getIntent().getStringExtra(s);
        if(s1 != null) {
            return s1;
        }
        throw new IllegalStateException(String.format(Locale.getDefault(), "Extra %s is required.", s));
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.nK);
        super.onCreate(bundle0);
        RestoreFlowChimeraActivity.j.j("onCreate", new Object[0]);
        this.setTheme(0x7F1602EB);  // style:CompanionBackupTheme
        if(fyhn.c()) {
            fyhn.b(this.getContainerActivity());
        }
        azts azts0 = fcfo.f(this);
        String s = this.getCallingPackage();
        ((fcln)new lso(this.getViewModelStore(), lsj.a(new lub[]{fcln.b}), this.g()).a(fcln.class)).k = this;
        if(s == null) {
            this.a(fczo.d());
            return;
        }
        evql evql0 = azts0.cl(s);
        evql0.b((AppTheme appTheme0) -> {
            String s;
            this.s = appTheme0;
            fczo.g(appTheme0, this.getIntent(), this);
            this.setContentView(0x7F0E022A);  // layout:companion_restore_flow_activity
            if(hzyp.i()) {
                s = null;
            }
            else {
                s = this.l("deviceName");
                if(s.equals("watch")) {
                    s = "watch";
                }
            }
            fcln fcln0 = (fcln)new lso(this.getViewModelStore(), lsj.a(new lub[]{fcln.b}), this.g()).a(fcln.class);
            NavHostFragment navHostFragment0 = (NavHostFragment)this.getSupportFragmentManager().g(0x7F0B19B6);  // id:nav_host
            if(navHostFragment0 == null) {
                throw new IllegalStateException("NavHostFragment not found.");
            }
            this.getOnBackPressedDispatcher().c(navHostFragment0, new fckx(this));
            this.r = navHostFragment0.z();
            lqi lqi0 = fcln0.h;
            lqi0.g(this, new fckp(this));
            fcln0.k = this;
            if(!hzyp.i()) {
                gftb.check(s);
                fcln0.j = s;
            }
            if(!lqi0.n()) {
                if(!this.getIntent().getBooleanExtra("resume", false)) {
                    fcln.a.j("Start restore flow", new Object[0]);
                    if(hzyp.c()) {
                        fcln0.b(fclm.b);
                        return;
                    }
                    fcln0.b(fclm.a);
                    return;
                }
                nry nry0 = this.r;
                gftb.check(nry0);
                nry0.i(0x7F0B0CC2);  // id:blank_fragment
                fcln.a.j("Resume restore flow", new Object[0]);
                evql evql0 = fcln0.d.f(fcln0.e);
                evql0.b(new fcky(fcln0));
                evql0.A(new fclc(fcln0));
            }
        });
        evql0.A(new fckn(this));
        evql0.a(new fcko(this));
    }
}

