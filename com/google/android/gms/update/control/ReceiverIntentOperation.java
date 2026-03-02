package com.google.android.gms.update.control;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import azig;
import azzc;
import baun;
import bbpz;
import bvra;
import bvrd;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import ezwc;
import ezwn;
import ezwu;
import ezxa;
import ezxn;
import ezxy;
import ezyq;
import fabj;
import fabk;
import ggek;
import ggeo;
import gigw;
import gihf;
import java.io.IOException;

public class ReceiverIntentOperation extends IntentOperation {
    static final String a;
    public static final int b;
    private static final baun c;
    private static final ggeo d;

    static {
        ReceiverIntentOperation.c = fabk.f("ReceiverIntentOperation");
        String s = bbpz.f("com.google.android.gms.update");
        ReceiverIntentOperation.a = s;
        ggek ggek0 = new ggek();
        Integer integer0 = (int)2;
        ggek0.i("com.google.gservices.intent.action.GSERVICES_CHANGED", integer0);
        ggek0.i("com.google.android.gms.update.BASE_MODULE_INIT", Integer.valueOf(1));
        Integer integer1 = (int)6;
        ggek0.i("android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", integer1);
        ggek0.i("android.intent.action.TIME_SET", integer1);
        ggek0.i("android.intent.action.ACTION_POWER_CONNECTED", Integer.valueOf(9));
        ggek0.i("android.intent.action.USER_PRESENT", Integer.valueOf(11));
        ggek0.i("com.google.android.gms.phenotype.COMMITTED", integer0);
        ggek0.i(s, integer0);
        ggek0.i("com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED", Integer.valueOf(12));
        ReceiverIntentOperation.d = ggek0.b();
    }

    public static PendingIntent a(Context context0) {
        return PendingIntent.getService(context0, 1, IntentOperation.getStartIntent(context0, ReceiverIntentOperation.class, "com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED"), 0xA000000);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!ezwu.b(this)) {
            ReceiverIntentOperation.c.h("System update management not enabled in this context. Ignoring intent: %s", new Object[]{intent0});
            return;
        }
        String s = intent0.getAction();
        if(!"com.google.android.gms.phenotype.COMMITTED".equals(s) && !ReceiverIntentOperation.a.equals(s) || TextUtils.equals("com.google.android.gms.update", intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ReceiverIntentOperation.c.h("Received intent: %s.", new Object[]{intent0});
            ezxn ezxn0 = (ezxn)ezxn.b.b();
            String s1 = intent0.getAction();
            Integer integer0 = (Integer)ReceiverIntentOperation.d.get(s1);
            if(integer0 != null) {
                ezxn0.a(integer0.intValue());
            }
            if(ezwc.m() && "com.google.vr.powerpolicy.action.ACTION_POLICY_CHANGED".equals(s)) {
                switch(intent0.getIntExtra("com.google.vr.powerpolicy.extra.POLICY", 0)) {
                    case 0: {
                        ezxn0.a(7);
                        break;
                    }
                    case 2: {
                        ezxn0.a(5);
                    }
                }
            }
            if("com.google.android.gms.update.NOTIFICATION_ACTION".equals(s)) {
                ezxy ezxy0 = (ezxy)ezxy.b.b();
                int v = intent0.getIntExtra("notification_action", -1);
                switch(v) {
                    case 0: {
                        DownloadOptions downloadOptions0 = new DownloadOptions(true, true, true, -1);
                        ezxy0.c.d(downloadOptions0);
                        break;
                    }
                    case 1: {
                        InstallationOptions installationOptions0 = new InstallationOptions(true, true, true, false);
                        ezxy0.c.e(installationOptions0);
                        if(((int)(((Integer)ezxy0.c.n.b(ezyq.n)))) != 1) {
                            Intent intent1 = ezxa.a().addFlags(0x10000000).addFlags(0x200000);
                            ezxy0.e.startActivity(intent1);
                        }
                        break;
                    }
                    case 2: {
                        try {
                            ezxy0.c.g(true);
                        }
                        catch(IOException unused_ex) {
                            ezxy.a.f("Unable to schedule install tonight", new Object[0]);
                        }
                        break;
                    }
                    case 3: {
                        InstallationOptions installationOptions1 = new InstallationOptions(true, true, true, false);
                        ezxy0.c.q(installationOptions1);
                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 5: {
                        ezxy0.c.m();
                        break;
                    }
                    case 6: {
                        if(ezwn.a().booleanValue()) {
                            bvrd bvrd0 = new bvrd(ezxy0.e);
                            azzc azzc0 = new azzc();
                            azzc0.c = new Feature[]{azig.a};
                            azzc0.a = new bvra(bvrd0);
                            azzc0.d = 0x6D00;
                            bvrd0.iG(azzc0.a());
                        }
                        break;
                    }
                    default: {
                        ezxy.a.f("Unknown notification action: %d.", new Object[]{v});
                        return;
                    }
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gihf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gihf gihf0 = (gihf)hftp0.b_message;
                gihf0.b |= 1;
                gihf0.c = v;
                gihf gihf1 = (gihf)hftp0.N_build();
                fabj fabj0 = ezxy0.d;
                ProtoLiteBuilder hftp1 = fabj0.g(8);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gigw gigw0 = (gigw)hftp1.b_message;
                gihf1.getClass();
                gigw0.l = gihf1;
                gigw0.b |= 0x200;
                fabj0.f(((gigw)hftp1.N_build()));
            }
            return;
        }
        ReceiverIntentOperation.c.d("Ignore non-related phenotype commit", new Object[0]);
    }
}

