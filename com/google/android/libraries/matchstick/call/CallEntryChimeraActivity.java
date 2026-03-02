package com.google.android.libraries.matchstick.call;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fidt;
import fidv;
import fidw;
import fidx;
import fidy;
import fidz;
import fiea;
import fieb;
import fiec;
import fied;
import fiee;
import fihk;
import fijc;
import ggek;
import ggeo;
import glyi;
import glzd;
import gmap;
import gmbt;
import gmbu;
import gmcd;
import wst;
import wsu;
import xob;

@GmsCoreVeId(0x3FB67)
public class CallEntryChimeraActivity extends xob {
    public static final gmcd j;
    public static final gmcd k;
    public static final ComponentName l;
    public static final ComponentName m;
    public static final ComponentName n;
    public static final ComponentName o;
    public String p;
    public fidt q;
    private ggeo r;

    static {
        CallEntryChimeraActivity.j = gmbu.i(Pair.create(Boolean.valueOf(true), null));
        CallEntryChimeraActivity.k = gmbu.i(Pair.create(Boolean.valueOf(false), null));
        CallEntryChimeraActivity.l = new ComponentName("com.google.android.gms", "com.google.android.gms.matchstick.call.ContactsVideoActionActivity");
        CallEntryChimeraActivity.m = new ComponentName("com.google.android.gms", "com.google.android.gms.matchstick.call.ContactsAudioActionActivity");
        CallEntryChimeraActivity.n = new ComponentName("com.google.android.gms", "com.google.android.gms.matchstick.call.ContactsPrivilegedVideoActionActivity");
        CallEntryChimeraActivity.o = new ComponentName("com.google.android.gms", "com.google.android.gms.matchstick.call.ContactsPrivilegedAudioActionActivity");
    }

    public final gmcd a(Uri uri0, boolean z, boolean z1) {
        if(!wsu.c(uri0)) {
            fihk.a("CallEntryActivity", "invalid data uri: %s", new Object[]{uri0});
            return CallEntryChimeraActivity.k;
        }
        this.runOnUiThread(new fidv(this, uri0, z, z1));
        return CallEntryChimeraActivity.j;
    }

    public final void b(int v) {
        fijc.b(this).h(v);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        gmcd gmcd0;
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            fihk.e("CallEntryActivity", "null intent.", new Object[0]);
            this.setResult(0);
            return;
        }
        intent0.getComponent().getClassName();
        intent0.getComponent().getPackageName();
        String s = intent0.getAction();
        if(TextUtils.isEmpty(s)) {
            fihk.e("CallEntryActivity", "No action is specified.", new Object[0]);
            this.setResult(0);
            return;
        }
        this.p = this.getCallingPackage();
        this.q = fidt.a(this.getApplicationContext());
        if(this.r == null) {
            ggek ggek0 = ggeo.i(6);
            fidy fidy0 = new fidy(this);
            ggek0.i(wst.d, fidy0);
            fidz fidz0 = new fidz(this);
            ggek0.i(wst.e, fidz0);
            fiea fiea0 = new fiea(this);
            ggek0.i(wst.f, fiea0);
            fieb fieb0 = new fieb(this);
            ggek0.i(wst.g, fieb0);
            ggek0.i("android.intent.action.VIEW", new fiec(this));
            this.r = ggek0.b();
        }
        fiee fiee0 = (fiee)this.r.get(s);
        if(fiee0 == null) {
            fihk.a("CallEntryActivity", "Unknown action: %s", new Object[]{s});
            gmcd0 = CallEntryChimeraActivity.k;
        }
        else {
            gmcd0 = fiee0.a(intent0);
        }
        gmbt gmbt0 = gmbt.h(gmcd0);
        fidw fidw0 = new fidw();
        gmbu.t(glzd.f(glyi.g(gmbt0, Throwable.class, fidw0, gmap.a), new fidx(this), gmap.a), new fied(this), gmap.a);
    }
}

