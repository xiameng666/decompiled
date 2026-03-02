package com.google.android.gms.chimera.container.zapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import awfg;
import awhf;
import awib;
import awit;
import awjg;
import com.google.android.chimera.IntentOperation;
import ggtj;
import hrzm;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class WaitDownloadCompleteOperation extends IntentOperation {
    public static Intent a(Context context0) {
        return IntentOperation.getStartIntent(context0, WaitDownloadCompleteOperation.class, "com.google.android.gms.chimera.action.WAIT_DOWNLOAD_COMPLETE");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        awjg.a(this).e();
        if(hrzm.g()) {
            awhf.a(awib.a(this).b).c();
        }
        long v = System.currentTimeMillis();
        awit awit0 = awit.f(this);
        long v1 = hrzm.b();
        CountDownLatch countDownLatch0 = awit0.h.a();
        try {
            if(!countDownLatch0.await(v1, TimeUnit.SECONDS)) {
                goto label_11;
            }
            goto label_12;
        }
        catch(InterruptedException interruptedException0) {
            ((ggtj)awit.c.i()).B("Interrupted while waiting for downloads: %s", interruptedException0);
        }
    label_11:
        awfg.e().a(awit0.f, 60);
    label_12:
        if(hrzm.g()) {
            long v2 = hrzm.b() * 1000L;
            awhf awhf0 = awhf.a(this);
            try {
                if(!awhf0.b.await(Math.max(1L, v2 - (System.currentTimeMillis() - v)), TimeUnit.MILLISECONDS)) {
                    goto label_20;
                }
                return;
            }
            catch(InterruptedException interruptedException1) {
                Thread.currentThread().interrupt();
                Log.e("ChimeraSplitInstllr", "Interrupted while waiting for all split downloads to complete.", interruptedException1);
            }
        label_20:
            awfg.e().a(awhf0.a, 130);
        }
    }
}

