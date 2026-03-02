package com.google.android.gms.time.platformfeedback;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import azts;
import bbdg;
import bkyf;
import bkzl;
import blan;
import cchj;
import ccmq;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ewwt;
import ewwu;
import ewww;
import foqg;
import foqj;
import ggtj;
import hzbg;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import xob;

@GmsCoreVeId(0x3FE4A)
public final class PlatformFeedbackLaunchChimeraActivity extends xob {
    private static final foqg j;
    private static final String[] k;
    private boolean l;
    private ewwt m;

    static {
        PlatformFeedbackLaunchChimeraActivity.j = new foqj(PlatformFeedbackLaunchChimeraActivity.class);
        PlatformFeedbackLaunchChimeraActivity.k = new String[]{"--feedback"};
    }

    public PlatformFeedbackLaunchChimeraActivity() {
        this(new ewwu());
    }

    private PlatformFeedbackLaunchChimeraActivity(ewwt ewwt0) {
        this.l = false;
        this.m = (ewwt)Objects.requireNonNull(ewwt0);
    }

    // Detected as a lambda impl.
    public final void a() {
        this.l = true;
        this.finish();
    }

    private static String[] b(String s) {
        ArrayList arrayList0 = new ArrayList(3);
        Collections.addAll(arrayList0, new String[]{"service", s});
        Collections.addAll(arrayList0, PlatformFeedbackLaunchChimeraActivity.k);
        return (String[])arrayList0.toArray(new String[0]);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.tP);
        super.onCreate(bundle0);
        if(!hzbg.c()) {
            ((ggtj)((ggtj)ewww.a.j()).ar(0x42F9)).B("%s Platform Feedback feature is disabled", PlatformFeedbackLaunchChimeraActivity.j);
            this.a();
            return;
        }
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            ((ggtj)((ggtj)ewww.a.j()).ar(0x42F8)).B("%s No intent found", PlatformFeedbackLaunchChimeraActivity.j);
            this.a();
            return;
        }
        if(!Objects.equals(intent0.getAction(), "com.google.android.gms.time.platformfeedback.LAUNCH_USER_FEEDBACK")) {
            ggtj ggtj0 = (ggtj)((ggtj)ewww.a.j()).ar(0x42F7);
            String s = intent0.getAction();
            ggtj0.R("%s Unexpected action received %s", PlatformFeedbackLaunchChimeraActivity.j, s);
            this.a();
            return;
        }
        ((ggtj)ewww.a.g(Level.INFO).ar(0x42F6)).x("Activity intent received. onCreate");
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(!this.l && hzbg.c()) {
            Account[] arr_account = cchj.b(this).p("com.google");
            Object object0 = null;
            if(arr_account != null && arr_account.length != 0) {
                object0 = arr_account[0].name;
            }
            String s = (String)Objects.requireNonNullElse(object0, "anonymous");
            Object object1 = this.m.a(this);
            bkzl bkzl0 = new bkzl();
            bkzl0.a = "*";
            bkzl0.c = true;
            bkzl0.b = true;
            bkzl0.b();
            ServiceDumpRequest[] arr_serviceDumpRequest = new ServiceDumpRequest[4];
            blan blan0 = new blan();
            blan0.a = "time_detector";
            blan0.b = "time_detector";
            blan0.c = PlatformFeedbackLaunchChimeraActivity.k;
            blan0.b();
            blan0.c();
            arr_serviceDumpRequest[0] = blan0.a();
            blan blan1 = new blan();
            blan1.a = "time_zone_detector";
            blan1.b = "time_zone_detector";
            blan1.c = PlatformFeedbackLaunchChimeraActivity.k;
            blan1.b();
            blan1.c();
            arr_serviceDumpRequest[1] = blan1.a();
            blan blan2 = new blan();
            blan2.a = "com.android.phone/.TelephonyDebugService";
            blan2.b = "activity";
            blan2.c = PlatformFeedbackLaunchChimeraActivity.b("com.android.phone/.TelephonyDebugService");
            blan2.b();
            blan2.c();
            arr_serviceDumpRequest[2] = blan2.a();
            blan blan3 = new blan();
            blan3.a = "GeoTimeZoneService";
            blan3.b = "activity";
            blan3.c = PlatformFeedbackLaunchChimeraActivity.b("GeoTimeZoneService");
            blan3.b();
            blan3.c();
            arr_serviceDumpRequest[3] = blan3.a();
            bkzl0.d = arr_serviceDumpRequest;
            LogOptions logOptions0 = bkzl0.a();
            bkyf bkyf0 = new bkyf(this);
            bkyf0.f = logOptions0;
            bkyf0.c = "Thank you for providing this information. This will help us investigate and resolve the issue. If you have any other details you\'d like to share (e.g., steps to reproduce the problem), please feel free to add them below.";
            bkyf0.d = "com.google.android.gms.time.PLATFORM_FEEDBACK";
            bkyf0.b = s;
            ((azts)object1).ab(bkyf0.a()).r(this, (/* MISSING LAMBDA PARAMETER */) -> {
                this.l = true;
                this.finish();
            });
        }
    }
}

