package com.google.android.gms.googlesettings.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import bbcu;
import bbdg;
import bboh;
import buzv;
import bvbl;
import bvbq;
import ccmq;
import cjan;
import cmfe;
import cmft;
import cmge;
import cmgf;
import cmhh;
import cmhi;
import ggtj;
import htva;
import ibpo;
import ibts;
import ibuq;
import ibvd;
import jwh;

public final class GoogleSettingsLauncherChimeraActivity extends bvbq {
    public cmhi j;
    public buzv k;
    private static final bboh m;
    private boolean n;

    static {
        GoogleSettingsLauncherChimeraActivity.m = bboh.b("GoogleSettingsLauncherChimeraActivity", bbcu.fK);
    }

    public final buzv a() {
        buzv buzv0 = this.k;
        if(buzv0 != null) {
            return buzv0;
        }
        ibuq.j("sessionManager");
        return null;
    }

    public static final int l(Intent intent0) {
        return intent0.getIntExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_FACET_ID", 0);
    }

    public static final int m(Intent intent0) {
        return intent0.getIntExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_ITEM_ID", 0);
    }

    private final int o() {
        return this.getIntent().getIntExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_REQUEST_CODE", 0);
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == this.o()) {
            this.setResult(v1, intent0);
        }
        this.p(0x36304, null);
        this.finish();
    }

    @Override  // bvbq
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.mF);
        super.onCreate(bundle0);
        ibvd ibvd0 = new ibvd();
        Intent intent0 = this.getIntent();
        ibuq.e(intent0, "getIntent(...)");
        ibuq.f(intent0, "<this>");
        ibvd0.a = (Intent)jwh.a(intent0, "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT", Intent.class);
        boolean z = true;
        if(ibvd0.a == null) {
            String s = this.getIntent().getStringExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI");
            if(s != null) {
                ibvd0.a = Intent.parseUri(s, 1);
            }
        }
        if(ibvd0.a == null) {
            this.finish();
            return;
        }
        Intent intent1 = (Intent)ibvd0.a;
        ibuq.f(intent1, "<this>");
        ComponentName componentName0 = intent1.getComponent();
        if(ibpo.aB(cjan.a, componentName0)) {
            Intent intent2 = (Intent)ibvd0.a;
            ibuq.f(intent2, "<this>");
            if(ibuq.m(intent2.getComponent(), new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsActivity"))) {
                Intent intent3 = (Intent)ibvd0.a;
                if(this.getPackageManager().queryIntentActivities(intent3, 0x10000).size() <= 0) {
                    ((ggtj)GoogleSettingsLauncherChimeraActivity.m.h()).x("Legacy activity not found - trying link");
                    Intent intent4 = (Intent)ibvd0.a;
                    ibuq.f(intent4, "<this>");
                    Intent intent5 = intent4.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsLink"));
                    ibuq.e(intent5, "setComponent(...)");
                    ibvd0.a = intent5;
                }
            }
            if(!htva.f()) {
                ((Intent)ibvd0.a).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_SESSION_ID", this.a().a());
            }
        }
        Intent intent6 = (Intent)ibvd0.a;
        if(!cjan.c(intent6) && GoogleSettingsLauncherChimeraActivity.m(intent6) == 0 && GoogleSettingsLauncherChimeraActivity.l(intent6) == 0) {
            z = false;
        }
        this.n = z;
        this.p(0x36303, new bvbl(ibvd0));
        this.startActivityForResult(((Intent)ibvd0.a), this.o());
    }

    private final void p(int v, ibts ibts0) {
        if(!htva.f() && this.n) {
            cmhi cmhi0 = this.j;
            if(cmhi0 == null) {
                ibuq.j("gmsCoreMetrics");
                cmhi0 = null;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cmft.a).v_newBuilder();
            cmgf cmgf0 = cmge.a(((ProtoLiteMessage)cmfe.a).v_newBuilder());
            cmgf0.e(this.a().a());
            if(ibts0 != null) {
                ibts0.a(cmgf0);
            }
            cmfe cmfe0 = cmgf0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cmft cmft0 = (cmft)hftp0.b_message;
            cmfe0.getClass();
            cmft0.e = cmfe0;
            cmft0.b |= 4;
            cmhh.a(cmhi0, v, ((cmft)hftp0.N_build()), 4);
        }
    }
}

