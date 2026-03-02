package com.google.android.gms.magictether.logging;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import ccwp;
import ccwq;
import ccyv;
import ccyx;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import cpev;
import hvbk;
import hvbn;

public class MetricTaskDurationTimerIntentOperation extends IntentOperation {
    private final SharedPreferences a;

    public MetricTaskDurationTimerIntentOperation() {
        this.a = AppContextProvider.a().getSharedPreferences("com.google.android.gms.magictether.logging.MetricTaskDurationTimer.PREFERENCE_FILE", 0);
    }

    public static void a(Context context0, String s) {
        MetricTaskDurationTimerIntentOperation.b(context0, s, null);
    }

    public static void b(Context context0, String s, String s1) {
        context0.startService(MetricTaskDurationTimerIntentOperation.g(context0, "com.google.android.gms.magictether.logging.CLEAR_TIMER", s, -1L, s1));
    }

    public static void c(Context context0, String s) {
        MetricTaskDurationTimerIntentOperation.d(context0, s, null);
    }

    public static void d(Context context0, String s, String s1) {
        context0.startService(MetricTaskDurationTimerIntentOperation.g(context0, "com.google.android.gms.magictether.logging.START_TIMER", s, SystemClock.elapsedRealtime(), s1));
    }

    public static void e(Context context0, String s) {
        MetricTaskDurationTimerIntentOperation.f(context0, s, null);
    }

    public static void f(Context context0, String s, String s1) {
        context0.startService(MetricTaskDurationTimerIntentOperation.g(context0, "com.google.android.gms.magictether.logging.STOP_TIMER", s, SystemClock.elapsedRealtime(), s1));
    }

    private static Intent g(Context context0, String s, String s1, long v, String s2) {
        return IntentOperation.getStartIntent(context0, MetricTaskDurationTimerIntentOperation.class, s).putExtra("EXTRA_METRIC_KEY", s1).putExtra("EXTRA_TIMESTAMP", v).putExtra("EXTRA_TASK_ID", s2);
    }

    private final void h(String s, String s1) {
        if(s1 != null) {
            s = s + s1;
        }
        this.a.edit().remove(s).apply();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s2;
        if(hvbk.e()) {
            String s = intent0.getStringExtra("EXTRA_METRIC_KEY");
            if(s != null) {
                String s1 = intent0.getStringExtra("EXTRA_TASK_ID");
                if("com.google.android.gms.magictether.logging.CLEAR_TIMER".equals(intent0.getAction())) {
                    this.h(s, s1);
                }
                long v = intent0.getLongExtra("EXTRA_TIMESTAMP", -1L);
                if(v > 0L) {
                    if("com.google.android.gms.magictether.logging.START_TIMER".equals(intent0.getAction())) {
                        if(s1 != null) {
                            s = s + s1;
                        }
                        this.a.edit().putLong(s, v).apply();
                        return;
                    }
                    if("com.google.android.gms.magictether.logging.STOP_TIMER".equals(intent0.getAction())) {
                        if(s1 == null) {
                            s1 = null;
                            s2 = s;
                        }
                        else {
                            s2 = s + s1;
                        }
                        long v1 = this.a.getLong(s2, -1L);
                        if(v1 > 0L) {
                            cpev cpev0 = new cpev();
                            if(hvbn.e() && cpev.a.contains(s) && hvbn.e()) {
                                ccyx ccyx0 = cpev0.b.f(s + "_ms");
                                ccyv ccyv0 = ccyx0.f.f;
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
                                String s3 = ccyx0.a;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                s3.getClass();
                                ((ccwq)hftv0).b |= 1;
                                ((ccwq)hftv0).c = s3;
                                ccwp ccwp0 = ccwp.e;
                                if(!hftv0.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((ccwq)hftp0.b_message).d = ccwp0.g;
                                ((ccwq)hftp0.b_message).b |= 2;
                                long v2 = ccyx0.b.a(v - v1);
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv1 = hftp0.b_message;
                                ((ccwq)hftv1).b |= 16;
                                ((ccwq)hftv1).g = v2;
                                if(!hftv1.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ccwq ccwq0 = (ccwq)hftp0.b_message;
                                ccwq0.b |= 0x20;
                                ccwq0.h = 1L;
                                ccyx0.a(hftp0, ccyv0);
                                cpev0.f();
                            }
                            this.h(s, s1);
                        }
                    }
                }
            }
        }
    }
}

