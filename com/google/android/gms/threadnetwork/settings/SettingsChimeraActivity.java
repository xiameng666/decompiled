package com.google.android.gms.threadnetwork.settings;

import android.os.Bundle;
import bbcu;
import bbdg;
import bboh;
import ca;
import ccmq;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import ewin;
import ewio;
import ewjb;
import ewkm;
import ewkp;
import fyhn;
import ibuq;
import ibwc;
import xob;

@GmsCoreVeId(0x3FE30)
public final class SettingsChimeraActivity extends xob implements HasAndroidInjector {
    public static final ewio j;
    private final DispatchingAndroidInjector k;
    private final ewkm l;
    private final ewkp m;

    static {
        SettingsChimeraActivity.j = new ewio();
        bboh.b("SettingsChimeraActivity", bbcu.eW);
    }

    public SettingsChimeraActivity(DispatchingAndroidInjector dispatchingAndroidInjector0, ewkm ewkm0, ewkp ewkp0) {
        ibuq.f(dispatchingAndroidInjector0, "androidInjector");
        ibuq.f(ewkm0, "settingsAnalyticsLogger");
        ibuq.f(ewkp0, "pageLoggingCallbacks");
        super();
        this.k = dispatchingAndroidInjector0;
        this.l = ewkm0;
        this.m = ewkp0;
    }

    @Override  // dagger.android.HasAndroidInjector
    public final AndroidInjector androidInjector() {
        return this.k;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.oz);
        super.onCreate(bundle0);
        fyhn.b(this.getContainerActivity());
        this.setContentView(0x7F0E005B);  // layout:activity_settings
        long v = bundle0 == null || !bundle0.containsKey("session_id") ? ibwc.a.d() : bundle0.getLong("session_id");
        this.l.e(v);
        this.getSupportFragmentManager().Z(this.m, true);
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.t(0x7F0B0EEA, new ewjb());  // id:child_fragment_container
            ca0.w(null);
            ca0.a();
        }
        this.getSupportFragmentManager().r(new ewin(this));
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        ibuq.f(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putLong("session_id", this.l.a());
    }

    @UsedByReflection
    public static final SettingsChimeraActivity provideInstance() {
        return SettingsChimeraActivity.j.provideInstance();
    }
}

