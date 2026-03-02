package com.google.android.gms.mdm;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import avzf;
import azpm;
import bbmq;
import bbnp;
import bosa;
import cljp;
import clkm;
import clkq;
import clks;
import clkz;
import clla;
import com.google.android.gms.mdm.receivers.GoogleAccountsAddedChimeraReceiver;
import com.google.android.gms.mdm.services.LockscreenMessageChimeraService;
import com.google.android.gms.mdm.services.PeriodicSitrepService;
import com.google.android.gms.mdm.services.QrlLoggerService;
import cqhx;
import cqhy;
import cqiw;
import cqix;
import cqjm;
import cqjr;
import cqnf;
import cqqa;
import eibx;
import hrwa;
import hxvi;
import hxwi;
import hxwm;

public class FmdModuleInitIntentOperation extends avzf {
    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        if((v & 4) == 0 && (v & 8) == 0) {
            if((v & 2) != 0) {
                LockscreenMessageChimeraService.b(this);
                long v1 = (long)(((Long)cqix.l.c()));
                if(v1 > 0L) {
                    cqjm.c(this, v1);
                }
                cqhy.a(this);
                this.e();
                return;
            }
            if((v & 1) != 0) {
                String s = cqix.i.a(this);
                String s1 = cqix.j.a(this);
                if(!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1)) {
                    cqjr.a(this, s, s1);
                }
            }
            return;
        }
        cqhy.a(this);
        cqix.m.e();
        GoogleAccountsAddedChimeraReceiver.b();
        this.e();
    }

    private final void e() {
        if(hxvi.l()) {
            cqhx.a(cljp.a(this));
        }
        else if(hxvi.i() && hxvi.j()) {
            cljp cljp0 = cljp.a(this);
            if(hrwa.a.b().D()) {
                clks clks0 = new clks();
                clks0.w(LogFmdEnabledBoundService.class.getName());
                clks0.q("log_fmd_settings_task");
                clks0.a = clkz.l;
                clks0.v(2);
                clks0.l(false);
                cljp0.f(clks0.a());
            }
            else {
                clkq clkq0 = new clkq();
                clkq0.q("log_fmd_settings_task");
                clkq0.w(LogFmdEnabledBoundService.class.getName());
                clkq0.j(clkm.l);
                clkq0.v(2);
                cljp0.f(clkq0.a());
            }
        }
        if(!new cqnf(this).d()) {
            FmdModuleInitIntentOperation.f(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity");
            FmdModuleInitIntentOperation.f(this, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity");
            FmdModuleInitIntentOperation.f(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
            return;
        }
        bosa bosa0 = new bosa(this);
        cqhx.b(azpm.a, bosa0, this);
        FmdModuleInitIntentOperation.f(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity");
        FmdModuleInitIntentOperation.g(this, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity");
        if(cqnf.f(this)) {
            FmdModuleInitIntentOperation.g(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
            clks clks1 = new clks();
            clks1.w(QrlLoggerService.class.getName());
            clks1.q("qrl_logging");
            clks1.a = clkz.j;
            clks1.l(false);
            clks1.v(2);
            clla clla0 = clks1.a();
            cljp.a(this).f(clla0);
            if(hxwm.l()) {
                cqiw cqiw0 = cqix.p;
                if(hxwm.l()) {
                    eibx.c(this, "remote_lock_setting", cqiw0.b(this));
                }
            }
        }
        else {
            FmdModuleInitIntentOperation.f(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
        }
        if(!bbnp.d(this)) {
            cqqa.c(this, true);
            if(hxwi.e()) {
                clks clks2 = new clks();
                clks2.w(PeriodicSitrepService.class.getName());
                clks2.q("periodic_sitrep_check");
                clks2.a = clkz.k;
                clks2.v(2);
                clks2.l(false);
                clla clla1 = clks2.a();
                cljp.a(this).f(clla1);
            }
        }
    }

    private static final void f(Context context0, String s) {
        if(bbmq.a(context0, s) != 2) {
            bbmq.G(context0, s, false);
        }
    }

    private static final void g(Context context0, String s) {
        if(bbmq.a(context0, s) != 1) {
            bbmq.G(context0, s, true);
        }
    }
}

