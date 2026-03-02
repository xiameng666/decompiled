package com.google.android.gms.appinvite.notification;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import acbb;
import acbc;
import acbk;
import acbu;
import acfi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import baqr;
import bbcu;
import bbdg;
import bboh;
import ccmg;
import ccmp;
import ccmq;
import cjuh;
import com.google.android.chimera.IntentOperation;
import ggtj;
import giii;
import giis;
import giix;
import hikz;
import j..util.Objects;

public class AppInviteInstallIntentOperation extends IntentOperation {
    private static final bboh a;
    private ccmg b;
    private acbc c;

    static {
        AppInviteInstallIntentOperation.a = bboh.b("AppInstallOperation", bbcu.aK);
    }

    public AppInviteInstallIntentOperation() {
        this.c = null;
    }

    public AppInviteInstallIntentOperation(Context context0, acbc acbc0) {
        this.c = null;
        this.attachBaseContext(context0);
        this.c = acbc0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if(this.c == null) {
            this.c = new acbc(null);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        bbdg bbdg0 = bbdg.hB;
        if(this.b == null) {
            this.b = new ccmp();
        }
        this.b.a(bbdg0);
        String s = intent0.getAction();
        if(Objects.equals(s, "android.intent.action.PACKAGE_ADDED") || Objects.equals(s, "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            String s1 = intent0.getAction();
            Uri uri0 = intent0.getData();
            String s2 = uri0 == null ? null : uri0.getSchemeSpecificPart();
            if(TextUtils.isEmpty(s2)) {
                ((ggtj)AppInviteInstallIntentOperation.a.i()).x("Package name not found in the intent.");
            }
            else if(acfi.l(this, s2)) {
                if(s1.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
                    acfi.j(this, s2);
                }
                else if(!acfi.k("loggerInstallEvent", true, this, s2)) {
                    acfi.o("loggerInstallEvent", this, s2);
                    acbc acbc0 = this.c;
                    int v = acfi.p(this, s2);
                    int v1 = acfi.k("isInlineInstall", false, this, s2) ? 3 : 2;
                    boolean z = acfi.k("launchFromContinueUrl", false, this, s2);
                    boolean z1 = intent0.getBooleanExtra("android.intent.extra.REPLACING", false);
                    String s3 = acfi.f(this, s2);
                    int v2 = hikz.a(acfi.a(this, s2));
                    String s4 = acfi.d(this, s2);
                    String s5 = acfi.e(this, s2);
                    String s6 = acfi.h(this, s2);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giii.a).v_newBuilder();
                    if(!TextUtils.isEmpty(s2)) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giix.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        giix giix0 = (giix)hftp1.b_message;
                        s2.getClass();
                        giix0.b |= 2;
                        giix0.c = s2;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        giii giii0 = (giii)hftp0.b_message;
                        giix giix1 = (giix)hftp1.N_build();
                        giix1.getClass();
                        giii0.c = giix1;
                        giii0.b |= 1;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((giii)hftv0).d = v - 1;
                    ((giii)hftv0).b |= 2;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((giii)hftv1).e = v1 - 1;
                    ((giii)hftv1).b |= 4;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    giii giii1 = (giii)hftp0.b_message;
                    giii1.b |= 8;
                    giii1.f = z;
                    if(!TextUtils.isEmpty(s4) || !TextUtils.isEmpty(s5)) {
                        giis giis0 = acbc.c(s4, s5, s3, v2, "");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        giii giii2 = (giii)hftp0.b_message;
                        giis0.getClass();
                        giii2.g = giis0;
                        giii2.b |= 0x20;
                    }
                    int v3 = acbc.d(true, z1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giii)hftp0.b_message).h = v3 - 1;
                    ((giii)hftp0.b_message).b |= 0x40;
                    acbc0.f(((giii)hftp0.N_build()), 11, s6);
                    baqr baqr0 = new baqr();
                    baqr0.a = this.getApplicationInfo().uid;
                    baqr0.d = "com.google.android.gms";
                    baqr0.e = "com.google.android.gms";
                    acbu acbu0 = new acbu(baqr0, acbk.a(this), new acbb(this), acfi.i("invitationId", this, s2), null);
                    try {
                        acbu0.f(this);
                    }
                    catch(cjuh | RemoteException exception0) {
                        a.ae(AppInviteInstallIntentOperation.a.i(), "Failed to complete invitation.", exception0);
                    }
                }
            }
        }
        ccmq.a().a(bbdg.hs);
    }
}

