package com.google.android.gms.personalsafety.scanners;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import eicb;
import eifk;
import eifl;
import gwng;
import gwns;
import hrtd;
import j..util.Objects;
import java.util.NavigableMap;

public class ActivityRecognitionScanner.ActivityRecognitionBroadcastReceiver extends TracingBroadcastReceiver {
    final eifl a;

    public ActivityRecognitionScanner.ActivityRecognitionBroadcastReceiver(eifl eifl0) {
        Objects.requireNonNull(eifl0);
        this.a = eifl0;
        super("personalsafety");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(!ActivityRecognitionResult.g(intent0)) {
            return;
        }
        ActivityRecognitionResult activityRecognitionResult0 = ActivityRecognitionResult.c(intent0);
        if(activityRecognitionResult0 == null) {
            return;
        }
        eifl eifl0 = this.a;
        ++eifl0.e;
        if(hrtd.Y()) {
            NavigableMap navigableMap0 = eifl0.d;
            if(((long)navigableMap0.size()) > 100L) {
                navigableMap0.remove(navigableMap0.firstKey());
            }
        }
        eifl0.d.put(Long.valueOf(activityRecognitionResult0.b), activityRecognitionResult0);
        DetectedActivity detectedActivity0 = activityRecognitionResult0.d();
        eicb eicb0 = eifl0.b;
        long v = System.currentTimeMillis();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwng.a).v_newBuilder();
        int v1 = detectedActivity0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwng)hftv0).b |= 2;
        ((gwng)hftv0).c = v1;
        float f = (float)detectedActivity0.e;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwng gwng0 = (gwng)hftp0.b_message;
        gwng0.b |= 4;
        gwng0.d = f;
        long v2 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwng gwng1 = (gwng)hftp0.b_message;
        gwng1.b |= 8;
        gwng1.e = v2;
        long v3 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwng gwng2 = (gwng)hftp0.b_message;
        gwng2.b |= 16;
        gwng2.f = v3;
        gwng gwng3 = (gwng)hftp0.N_build();
        if(eicb.m()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwns.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gwns)hftv1).b |= 0x20;
            ((gwns)hftv1).g = v;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwns gwns0 = (gwns)hftp1.b_message;
            gwng3.getClass();
            gwns0.n = gwng3;
            gwns0.b |= 0x1000;
            eicb0.h(((gwns)hftp1.N_build()));
        }
        for(Object object0: eifl0.c.keySet()) {
            ((eifk)object0).d(activityRecognitionResult0);
        }
    }
}

