package com.google.android.location.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import bbdg;
import bboh;
import bbry;
import bhhu;
import bhin;
import bhio;
import bhip;
import bhit;
import bhix;
import bhme;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fuyc;
import fxwf;
import fxwh;
import fxzr;
import ggtj;
import gkee;
import gkef;
import gmap;
import gmbu;
import hqoi;
import huue;
import jys;

@GmsCoreVeId(0x3FAED)
public class DrivingBehaviorSettingChimeraActivity extends bbry {
    public static final bboh j;
    public fuyc k;
    public bhio l;
    private bhhu m;
    private bhix n;
    private Context o;

    static {
        DrivingBehaviorSettingChimeraActivity.j = bboh.a("DBSetting");
    }

    public final void g() {
        new bhio(this).a();
        if(this.m != null) {
            ((ggtj)DrivingBehaviorSettingChimeraActivity.j.h()).x("Stop driving behavior, un-registering transition client.");
            fxzr.f(this.o, bhip.e);
            if(huue.m()) {
                bhix bhix0 = this.n;
                if(bhix0 != null) {
                    bhix0.b(gkef.bO, gkee.I);
                }
            }
            this.m.c();
        }
    }

    @Override  // bbry
    protected final void l(boolean z) {
        if(huue.n()) {
            this.q(z);
            if(z) {
                if(!this.l.c()) {
                    if(huue.v()) {
                        bhit.b(this.k);
                    }
                    fxzr.f(this.o, bhip.d);
                    this.r();
                    return;
                }
                this.p();
                return;
            }
            this.g();
        }
    }

    @Override  // bbry
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.jk);
        super.onCreate(bundle0);
        this.o = this;
        if(jys.d() && fxzr.h(this)) {
            if(fxzr.i(this)) {
                if(jys.d()) {
                    Pair pair0 = fxzr.b(this);
                    String s = pair0 == null ? fxzr.c(this, false) : ((String)pair0.first);
                    Intent intent0 = new Intent("android.settings.AUTOMATIC_ZEN_RULE_SETTINGS").putExtra("android.provider.extra.AUTOMATIC_ZEN_RULE_ID", s);
                    intent0.addFlags(0x10008000);
                    this.startActivity(intent0);
                    this.finish();
                }
                return;
            }
            this.r();
            return;
        }
        if(hqoi.e()) {
            Intent intent1 = new Intent();
            intent1.setComponent(bhin.c());
            intent1.addFlags(0x10008000);
            this.startActivity(intent1);
            return;
        }
        if(huue.o()) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.google.android.gms", "com.google.android.location.settings.DrivingBehaviorSettingV31Activity"));
            this.startActivity(intent2);
            this.finish();
            return;
        }
        this.setContentView(0x7F0E02F8);  // layout:driving_behavior_setting
        this.n(true);
        this.l = new bhio(this);
        this.k = fuyc.a();
        bhme.b();
        this.m = bhme.a(this);
        this.n = new bhix(this);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(huue.n() && menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return false;
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(hqoi.e()) {
            this.finish();
        }
        if(huue.n()) {
            fuyc fuyc0 = this.k;
            if(fuyc0 != null) {
                gmbu.t(fuyc0.c(), new fxwf(this), gmap.a);
            }
        }
    }

    public final void p() {
        if(this.m != null) {
            ((ggtj)DrivingBehaviorSettingChimeraActivity.j.h()).x("Starting driving behavior, registering transition client.");
            fxzr.f(this.o, bhip.c);
            if(huue.m()) {
                bhix bhix0 = this.n;
                if(bhix0 != null) {
                    bhix0.b(gkef.bO, gkee.H);
                }
            }
            this.m.b();
        }
    }

    public final void q(boolean z) {
        gmbu.t(this.k.d(z), new fxwh(this, z), gmap.a);
    }

    private final void r() {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.location.settings.ACTIVITY_RECOGNITION_PERMISSION");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("secondIntroPage", true);
        this.startActivity(intent0);
        this.finish();
    }
}

