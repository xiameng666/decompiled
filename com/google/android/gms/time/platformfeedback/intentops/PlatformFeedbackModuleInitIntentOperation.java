package com.google.android.gms.time.platformfeedback.intentops;

import android.content.Intent;
import avzf;
import bbmq;
import ewww;
import foqg;
import foqj;
import ggtj;
import hzbg;

public final class PlatformFeedbackModuleInitIntentOperation extends avzf {
    private static final foqg a;

    static {
        PlatformFeedbackModuleInitIntentOperation.a = new foqj("PlatformFeedbackModuleInitIntentOperation");
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        if(hzbg.c()) {
            bbmq.J("com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchActivity", true);
            ggtj ggtj0 = (ggtj)((ggtj)ewww.a.h()).ar(0x42FA);
            foqj foqj0 = new foqj("com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchActivity");
            ggtj0.R("%s %s enabled", PlatformFeedbackModuleInitIntentOperation.a, foqj0);
        }
    }
}

