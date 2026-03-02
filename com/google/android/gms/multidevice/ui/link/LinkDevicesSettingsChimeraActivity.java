package com.google.android.gms.multidevice.ui.link;

import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import bboh;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.material.appbar.AppBarLayout;
import csvh;
import csxk;
import ctdo;
import cuip;
import cuir;
import cukh;
import cume;
import du;
import fyhn;
import ggtj;
import hvms;
import hvmz;
import ibuk;
import ibuq;
import nry;
import ntd;
import sku;

@GmsCoreVeId(261000)
public class LinkDevicesSettingsChimeraActivity extends cukh implements cuir {
    public csvh j;
    public csxk k;
    public ctdo l;
    private static final bboh n;

    static {
        LinkDevicesSettingsChimeraActivity.n = cume.a(new ibuk(LinkDevicesSettingsChimeraActivity.class));
    }

    @Override  // cuir
    public final csxk a() {
        csxk csxk0 = this.k;
        if(csxk0 != null) {
            return csxk0;
        }
        ibuq.j("settingsManager");
        return null;
    }

    @Override  // cuir
    public final void b() {
        AppBarLayout appBarLayout0 = this.f();
        if(appBarLayout0 != null) {
            appBarLayout0.setVisibility(8);
        }
    }

    @Override  // cuir
    public final void c(int v) {
        this.setTitle(v);
    }

    @Override  // cuir
    public final void d() {
        AppBarLayout appBarLayout0 = this.f();
        if(appBarLayout0 != null) {
            appBarLayout0.setVisibility(0);
        }
        AppBarLayout appBarLayout1 = this.f();
        if(appBarLayout1 != null) {
            appBarLayout1.l(true);
        }
    }

    @Override  // cuir
    public final boolean e() {
        return cuip.b(this);
    }

    @Override  // xos
    public final void onBackPressed() {
        this.getOnBackPressedDispatcher().d();
    }

    @Override  // cukh
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        csvh csvh0 = null;
        this.setTitle((bundle0 == null ? null : bundle0.getCharSequence("LINK_DEVICES_TITLE_KEY", "Cross-device services")));
        if(hvmz.e() && sku.a(this)) {
            this.setTheme(0x7F16052E);  // style:MultideviceSettingsTheme.Expressive
        }
        else if(fyhn.c()) {
            this.setTheme(0x7F16052D);  // style:MultideviceSettingsTheme.DynamicColors
        }
        else {
            this.setTheme(0x7F16052C);  // style:MultideviceSettingsTheme
        }
        ((ggtj)LinkDevicesSettingsChimeraActivity.n.h()).x("Creating navigation");
        this.setContentView(0x7F0E0053);  // layout:activity_enrollment_main
        du du0 = this.getSupportFragmentManager().g(0x7F0B19B7);  // id:nav_host_fragment
        ibuq.d(du0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        nry nry0 = ((NavHostFragment)du0).z();
        ntd ntd0 = nry0.f().a(0x7F12000A);  // navigation:settings_navigation
        ntd0.w(nry0.f().a(0x7F120004));  // navigation:feature_settings_navigation
        if(cuip.a(this)) {
            if(!hvms.c() || this.getResources().getConfiguration().smallestScreenWidthDp < 600) {
                this.setRequestedOrientation(1);
            }
            ntd0.y(0x7F0B125D);  // id:enrollment_navigation
        }
        else {
            if(bundle0 == null) {
                Intent intent0 = this.getIntent();
                ctdo ctdo0 = this.l;
                if(ctdo0 == null) {
                    ibuq.j("metricsLogger");
                    ctdo0 = null;
                }
                cuip.c(intent0, ctdo0);
                csvh csvh1 = this.j;
                if(csvh1 == null) {
                    ibuq.j("notificationsRepository");
                }
                else {
                    csvh0 = csvh1;
                }
                cuip.d(csvh0, this.getIntent());
            }
            ntd0.y(0x7F0B1812);  // id:link_settings_fragment
        }
        nry0.o(ntd0);
    }

    @Override  // xos
    public final boolean onNavigateUp() {
        this.getOnBackPressedDispatcher().d();
        return true;
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        ibuq.f(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putCharSequence("LINK_DEVICES_TITLE_KEY", this.getTitle());
    }
}

