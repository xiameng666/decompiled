package com.google.android.gms.wallet.bender3;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import anj;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import com.google.android.wallet.bender3.framework.storage.SessionEntity;
import fbav;
import gaqj;
import gaql;
import gavw;
import gavy;
import gaxc;
import gaxn;
import gaym;
import gayy;
import gblw;
import gctn;
import gftb;
import gkyh;
import gkyi;
import gmcd;
import hzkp;
import hzmb;
import ibuq;
import icpu;
import ifvz;
import ifwa;
import java.util.concurrent.ExecutionException;
import xni;

public class Bender3RedirectChimeraActivity extends xni {
    boolean j;
    gavy k;
    gaql l;
    gaym m;
    private SessionEntity n;

    public Bender3RedirectChimeraActivity() {
        this.j = false;
    }

    public static Intent a(Context context0, Intent intent0) {
        Intent intent1 = new Intent(context0, Bender3RedirectChimeraActivity.class);
        intent1.setAction("com.google.android.wallet.bender3.intent.action.FINISH_REDIRECT");
        intent1.setClassName(context0, "com.google.android.gms.wallet.bender3.Bender3RedirectProxyActivity");
        intent1.putExtra("finishIntent", intent0);
        intent1.addFlags(0x4000000);
        return intent1;
    }

    public static Intent g(Context context0, String s) {
        Intent intent0 = new Intent(context0, Bender3RedirectChimeraActivity.class);
        intent0.setClassName(context0, "com.google.android.gms.wallet.bender3.Bender3RedirectProxyActivity");
        intent0.putExtra("initialUrl", s);
        return intent0;
    }

    public static Intent l(Context context0, String s, int v) {
        Intent intent0 = Bender3RedirectChimeraActivity.g(context0, s);
        intent0.putExtra("nightMode", v);
        return intent0;
    }

    final gaym m() {
        SessionEntity sessionEntity0;
        if(hzkp.c() && this.m == null) {
            if(this.n == null) {
                if(this.getIntent().hasExtra("sessionEntity")) {
                    this.n = (SessionEntity)this.getIntent().getParcelableExtra("sessionEntity");
                }
                else {
                    sessionEntity0 = null;
                    gmcd gmcd0 = icpu.e(this.l.d, new gaqj(this.l, null));
                    try {
                        this.n = (SessionEntity)gmcd0.get();
                        sessionEntity0 = this.n;
                    }
                    catch(InterruptedException | ExecutionException unused_ex) {
                    }
                    goto label_9;
                }
            }
            sessionEntity0 = this.n;
        label_9:
            if(sessionEntity0 != null) {
                String s = sessionEntity0.c;
                if(s != null) {
                    Integer integer0 = sessionEntity0.d;
                    if(integer0 != null) {
                        String s1 = sessionEntity0.b;
                        if(s1 != null) {
                            gaxn.a(this);
                            gaxc gaxc0 = fbav.a(this).b;
                            long v = Long.parseLong(s1);
                            WidgetConfig widgetConfig0 = new WidgetConfig();
                            widgetConfig0.a = new Account(s, "com.google");
                            widgetConfig0.b = (int)integer0;
                            widgetConfig0.e(v);
                            this.m = gaxc0.a(widgetConfig0);
                        }
                    }
                }
            }
        }
        return this.m;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        if(hzmb.g()) {
            this.setTheme(0x7F160ECF);  // style:Theme_Wallet_Blank
        }
        super.onCreate(bundle0);
        if(hzmb.g()) {
            this.setTitle("");
        }
        this.l = new gaql(this.getApplicationContext(), gblw.a);
        if(hzkp.c() && this.getIntent().hasExtra("finishIntent")) {
            gaym gaym0 = this.m();
            if(gaym0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkyh.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gkyh)hftp0.b_message).c = 2;
                ((gkyh)hftp0.b_message).b |= 1;
                gayy.d(gaym0, ((gkyh)hftp0.N_build()));
            }
            this.finish();
            return;
        }
        if(bundle0 == null) {
            this.j = true;
            goto label_23;
        }
        else {
            boolean z = bundle0.getBoolean("redirectStarted");
            this.j = z;
            if(z) {
            label_23:
                if(this.getIntent().hasExtra("initialUrl")) {
                    String s = this.getIntent().getStringExtra("initialUrl");
                    int v = this.getIntent().getIntExtra("nightMode", 0);
                    gftb.check(s);
                    if(gctn.a(this, Uri.parse(s))) {
                        gaym gaym2 = this.m();
                        if(gaym2 != null) {
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkyi.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ((gkyi)hftp2.b_message).c = (int)1;
                            ((gkyi)hftp2.b_message).b = 1;
                            gayy.e(gaym2, ((gkyi)hftp2.N_build()));
                        }
                    }
                    else {
                        gaym gaym1 = this.m();
                        if(gaym1 != null) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkyi.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gkyi)hftp1.b_message).c = (int)3;
                            ((gkyi)hftp1.b_message).b = 1;
                            gayy.e(gaym1, ((gkyi)hftp1.N_build()));
                        }
                        try {
                            ibuq.f(s, "url");
                            if(!URLUtil.isNetworkUrl(s)) {
                                throw new gavw(4);
                            }
                            if(TextUtils.isEmpty(ifvz.a(this))) {
                                throw new gavw(10);
                            }
                        }
                        catch(gavw gavw0) {
                            this.setResult(0, new Intent().putExtra("errorCode", gavw0.a));
                            this.finish();
                            return;
                        }
                        gavy gavy0 = new gavy(this, s, v);
                        this.k = gavy0;
                        gavy0.b = ifvz.a(gavy0.a);
                        gavy0.f = new ifwa(gavy0);
                        if(!anj.b(gavy0.a, gavy0.b, gavy0.f)) {
                            this.setResult(0);
                            this.finish();
                        }
                    }
                }
                else if(this.getIntent().hasExtra("launchingIntent")) {
                    gaym gaym3 = this.m();
                    if(gaym3 != null) {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkyi.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gkyi)hftp3.b_message).c = (int)4;
                        ((gkyi)hftp3.b_message).b = 1;
                        gayy.e(gaym3, ((gkyi)hftp3.N_build()));
                    }
                }
            }
        }
    }

    @Override  // xni
    protected final void onDestroy() {
        super.onDestroy();
        gavy gavy0 = this.k;
        if(gavy0 != null) {
            gavy0.c = false;
            gavy0.d = null;
            gavy0.e = null;
            ifwa ifwa0 = gavy0.f;
            if(ifwa0 != null) {
                gavy0.a.unbindService(ifwa0);
                gavy0.f = null;
            }
        }
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        gaym gaym0 = this.m();
        if(gaym0 != null) {
            if(intent0.hasExtra("finishIntent")) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkyh.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gkyh)hftp0.b_message).c = 1;
                ((gkyh)hftp0.b_message).b |= 1;
                gayy.d(gaym0, ((gkyh)hftp0.N_build()));
                goto label_20;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkyh.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gkyh)hftp1.b_message).c = 2;
            ((gkyh)hftp1.b_message).b |= 1;
            gayy.d(gaym0, ((gkyh)hftp1.N_build()));
            this.setResult(0, new Intent().putExtra("errorCode", 80000));
            this.finish();
            return;
        }
    label_20:
        this.setResult(-1, ((Intent)intent0.getParcelableExtra("finishIntent")));
        this.finish();
    }

    @Override  // xoi
    protected final void onPause() {
        super.onPause();
        this.j = false;
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(!this.j) {
            gaym gaym0 = this.m();
            if(gaym0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkyh.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gkyh)hftp0.b_message).c = 3;
                ((gkyh)hftp0.b_message).b |= 1;
                gayy.d(gaym0, ((gkyh)hftp0.N_build()));
            }
            this.setResult(0);
            this.finish();
        }
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("redirectStarted", this.j);
    }
}

