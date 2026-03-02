package com.google.android.gms.auth.proximity.exo;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import alcq;
import alcx;
import alcz;
import alda;
import aldi;
import alhq;
import alol;
import alsw;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.text.TextUtils;
import batl;
import baun;
import bbmn;
import com.google.android.chimera.IntentOperation;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import hpzm;
import j..util.Objects;
import ywm;

public class ExoPackageChangedIntentOperation extends IntentOperation {
    private static final baun a;

    static {
        ExoPackageChangedIntentOperation.a = new baun("ProximityAuth", new String[]{"ExoPackageChangedIntentOperation"});
    }

    public ExoPackageChangedIntentOperation() {
    }

    ExoPackageChangedIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    private static String a(Intent intent0) {
        Uri uri0 = intent0.getData();
        return uri0 == null ? null : uri0.getSchemeSpecificPart();
    }

    private final void b(Intent intent0) {
        String s = intent0.getAction();
        String s1 = ExoPackageChangedIntentOperation.a(intent0);
        if(TextUtils.equals("com.google.ambient.streaming", s1)) {
            if(s1 != null) {
                ExoPackageChangedIntentOperation.a.h("Handling intent: %s for Exo packageName: %s", new Object[]{s, s1});
            }
            this.startService(((Intent)Objects.requireNonNull(alhq.a(this.getBaseContext(), false))));
            if("android.intent.action.PACKAGE_REMOVED".equals(s) && intent0.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                for(Object object0: bbmn.h(this.getBaseContext(), "com.google.android.gms")) {
                    alol.a(((Account)object0).name).k(false);
                }
            }
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(s != null) {
            switch(s.hashCode()) {
                case 0xCFB12EEE: {
                    if(!s.equals("android.intent.action.PACKAGE_REPLACED")) {
                        return;
                    }
                    this.b(intent0);
                    return;
                }
                case 0x1F50B9C2: {
                    if(!s.equals("android.intent.action.PACKAGE_REMOVED")) {
                        return;
                    }
                    this.b(intent0);
                    if(hpzm.v() && intent0.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                        aldi aldi0 = aldi.a(AppContextProvider.a());
                        String s1 = ExoPackageChangedIntentOperation.a(intent0);
                        Object[] arr_object = {Process.myUserHandle(), s1};
                        aldi.a.h("Package removed: (user=%s) %s", arr_object);
                        if(s1 != null) {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsw.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((alsw)hftp0.b_message).c = s1;
                            long v = (long)Process.myUserHandle().getIdentifier();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((alsw)hftp0.b_message).f = v;
                            alsw alsw0 = (alsw)hftp0.N_build();
                            alcq.d(alsw0);
                            if(aldi0.e()) {
                                try {
                                    batl.s(aldi0.d);
                                    alda alda0 = aldi0.d.a();
                                    Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
                                    BundlerType bundlerType0 = BundlerType.a("com.google.android.gms.auth.proximity.phonehub.proto.App");
                                    alcx.b.c(bundle0, "appInfo", alsw0, bundlerType0);
                                    ((alcz)alda0).a.b().a(0x8A47B9FB702378C2L, 3, bundle0);
                                }
                                catch(ywm ywm0) {
                                    aldi.a.g("Profile unavailable", ywm0, new Object[0]);
                                }
                                return;
                            }
                        }
                    }
                    break;
                }
                case 0x5C1076E2: {
                    if(!s.equals("android.intent.action.PACKAGE_ADDED")) {
                        return;
                    }
                    this.b(intent0);
                    if(hpzm.v()) {
                        aldi aldi1 = aldi.a(AppContextProvider.a());
                        String s2 = ExoPackageChangedIntentOperation.a(intent0);
                        baun baun0 = aldi.a;
                        baun0.h("Package added: (user=%s) %s", new Object[]{Process.myUserHandle(), s2});
                        if(s2 != null) {
                            UserHandle userHandle0 = Process.myUserHandle();
                            alsw alsw1 = aldi1.c.b(s2, userHandle0);
                            if(alsw1 == null) {
                                baun0.m("Cannot get app info for package (user=%s) %s", new Object[]{Process.myUserHandle(), s2});
                                return;
                            }
                            aldi1.b.c(alsw1);
                            if(aldi1.e()) {
                                try {
                                    batl.s(aldi1.d);
                                    alda alda1 = aldi1.d.a();
                                    Bundle bundle1 = new Bundle(Bundler.class.getClassLoader());
                                    BundlerType bundlerType1 = BundlerType.a("com.google.android.gms.auth.proximity.phonehub.proto.App");
                                    alcx.b.c(bundle1, "appInfo", alsw1, bundlerType1);
                                    ((alcz)alda1).a.b().a(0x8A47B9FB702378C2L, 2, bundle1);
                                }
                                catch(ywm ywm1) {
                                    aldi.a.g("Profile unavailable", ywm1, new Object[0]);
                                }
                                return;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
}

