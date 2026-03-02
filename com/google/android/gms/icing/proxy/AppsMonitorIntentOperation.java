package com.google.android.gms.icing.proxy;

import android.content.Intent;
import bbdg;
import bwwv;
import bwwy;
import bwzd;
import bwzg;
import bwzh;
import ccmq;
import com.google.android.chimera.IntentOperation;
import hrqf;
import j..util.Objects;

public class AppsMonitorIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.nn);
        if(intent0 != null && (!Objects.equals(intent0.getAction(), "android.intent.action.PACKAGE_CHANGED") || !hrqf.c())) {
            if(Objects.equals(intent0.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
                intent0.setAction("android.intent.action.PACKAGE_CHANGED");
            }
            try {
                bwwy bwwy0 = bwwy.c(this);
                if(bwwy0 != null && intent0.getAction() != null) {
                    bwzh.a().b(new bwzg(new bwwv(bwwy0, intent0), "AppsCorpusProcessChangeRunnable"));
                }
            }
            catch(Exception exception0) {
                bwzd.i(exception0, "Failed to handle package changes", new Object[0]);
            }
            Intent intent1 = UpdateIcingCorporaIntentOperation.b(this);
            if(intent1 != null) {
                this.startService(intent1);
            }
        }
    }
}

