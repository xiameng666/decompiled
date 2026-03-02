package com.google.android.gms.kids.settings.flows.devicesupervisionoptin;

import android.content.Intent;
import android.os.Bundle;
import bbcu;
import bboh;
import ca;
import cbau;
import cbav;
import cbsk;
import cbuo;
import cbuq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gaec;
import gajp;
import gajq;
import gful_cronetEngineProvider;
import ggtj;
import gvku;
import gvkw;
import hukf;
import ibns;
import ibuq;
import jyu;
import xni;

@GmsCoreVeId(260830)
public final class DeviceSupervisionOptInChimeraActivity extends xni {
    private static final bboh j;

    static {
        DeviceSupervisionOptInChimeraActivity.j = bboh.b("DeviceSupervisionOptInChimeraActivity", bbcu.ac);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setTheme(0x7F160C6A);  // style:Theme.GoogleMaterial3.DayNight
        if(hukf.f()) {
            this.setTheme(gajp.b(this));
            gajp.c(this);
        }
        else {
            this.setTheme(new gajq(0x7F16095B, true).a(this.getIntent()));  // style:SudThemeGlifV3.DayNight
            if(gaec.y(this)) {
                int v = gajp.a(this);
                if(v != 0) {
                    this.setTheme(v);
                }
            }
        }
        String s = "";
        if(hukf.g()) {
            cbau cbau0 = new cbau(this);
            if(!((Boolean)cbav.a.e(((gful_cronetEngineProvider)cbau0))).booleanValue()) {
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.G(0x1020002, cbuq.a("", 1));
                ca0.a();
                return;
            }
        }
        if(bundle0 == null) {
            Intent intent0 = this.getIntent();
            gvku gvku0 = gvku.a;
            int v1 = intent0.getIntExtra("entry_point", gvku0.i);
            if(ibuq.m(this.getIntent().getStringExtra("destination"), "accounts_removal")) {
                ((ggtj)DeviceSupervisionOptInChimeraActivity.j.h()).x("Accounts Removal fragment initiated");
                String s1 = this.getIntent().getStringExtra("selected_account");
                String s2 = this.getIntent().getStringExtra("session_id");
                if(s2 != null) {
                    s = s2;
                }
                cbsk cbsk0 = new cbsk();
                cbsk0.setArguments((s1 == null ? new Bundle() : jyu.a(new ibns[]{new ibns("selected_account", s1), new ibns("session_id", s)})));
                ca ca1 = new ca(this.getSupportFragmentManager());
                ca1.G(0x1020002, cbsk0);
                ca1.a();
                return;
            }
            gvkw gvkw0 = gvkw.T;
            gvku gvku1 = gvku.b(v1);
            if(gvku1 != null) {
                gvku0 = gvku1;
            }
            ibuq.f(gvkw0, "flowType");
            ibuq.f(gvku0, "entryPoint");
            cbuo cbuo0 = new cbuo();
            cbuo0.setArguments(jyu.a(new ibns[]{new ibns("flow_type", ((int)gvkw0.aa)), new ibns("entry_point", ((int)gvku0.i))}));
            ca ca2 = new ca(this.getSupportFragmentManager());
            ca2.G(0x1020002, cbuo0);
            ca2.w("fragment");
            ca2.a();
        }
    }
}

