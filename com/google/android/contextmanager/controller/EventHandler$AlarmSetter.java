package com.google.android.contextmanager.controller;

import a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Pair;
import android.util.SparseArray;
import bbib;
import bbrd;
import cjnm;
import cjnr;
import clht;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import hrgt;
import j..util.Objects;
import java.util.HashMap;
import jyy;
import xrn;
import xsi;
import xsl;
import xth;

public class EventHandler.AlarmSetter extends TracingBroadcastReceiver {
    public final SparseArray a;
    public final HashMap b;
    public final HashMap c;
    public final long d;
    public final String e;
    public boolean f;
    public final xsl g;
    private final bbib h;
    private final boolean i;
    private int j;
    private final cjnr k;

    public EventHandler.AlarmSetter(xsl xsl0) {
        Objects.requireNonNull(xsl0);
        this.g = xsl0;
        super("contextmanager");
        this.j = 0;
        this.h = new bbib(xsl0.a);
        this.k = cjnm.b(xsl0.a);
        this.a = new SparseArray();
        this.c = new HashMap();
        this.b = new HashMap();
        this.d = SystemClock.elapsedRealtime();
        this.e = "CONTEXT_MANAGER_ALARM_WAKEUP";
        this.i = true;
        this.f = true;
    }

    public final void b(Runnable runnable0) {
        this.g.e();
        if(this.i) {
            Pair pair0 = (Pair)this.b.get(runnable0);
            if(pair0 != null) {
                this.k.d(((GmsAlarmManagerCompat.OnAlarmListener)pair0.second));
            }
        }
        else {
            HashMap hashMap0 = this.c;
            Pair pair1 = (Pair)hashMap0.get(runnable0);
            if(pair1 != null) {
                int v = (int)(((Integer)pair1.first));
                this.h.a(((PendingIntent)pair1.second));
                hashMap0.remove(runnable0);
                this.a.remove(v);
            }
        }
    }

    public final void c(Runnable runnable0, long v, xrn xrn0) {
        xsl xsl0 = this.g;
        xsl0.e();
        this.b(runnable0);
        if(this.i) {
            EventHandler.AlarmSetter.1 eventHandler$AlarmSetter$10 = new EventHandler.AlarmSetter.1(this, runnable0, xrn0);
            this.b.put(runnable0, Pair.create(Long.valueOf(this.d), eventHandler$AlarmSetter$10));
            long v1 = SystemClock.elapsedRealtime() + v;
            WorkSource workSource0 = bbrd.b(xsl0.a, xrn0.h);
            if(xrn0.f) {
                jyy jyy0 = new jyy(new clht(Looper.getMainLooper()));
                this.k.c("CMAlarm", 3, v1, 3600000L, workSource0, jyy0, eventHandler$AlarmSetter$10);
                return;
            }
            jyy jyy1 = new jyy(new clht(Looper.getMainLooper()));
            this.k.a("CMAlarm", 2, v1, workSource0, jyy1, eventHandler$AlarmSetter$10);
            return;
        }
        long v2 = SystemClock.elapsedRealtime() + v;
        int v3 = this.j + 1;
        this.j = v3;
        Intent intent0 = new Intent(this.e);
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("alarmId", v3);
        intent0.putExtra("sessionId", this.d);
        Context context0 = xsl0.a;
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, v3, intent0, 0x22000000);
        if(pendingIntent0 != null) {
            this.h.a(pendingIntent0);
        }
        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(context0, v3, intent0, 0xA000000);
        Pair pair0 = Pair.create(runnable0, xrn0);
        this.a.put(v3, pair0);
        this.c.put(runnable0, Pair.create(Integer.valueOf(v3), pendingIntent1));
        if(hrgt.C() && xrn0.f) {
            this.h.d("CMAlarm", 3, v2, pendingIntent1, xrn0.h);
            return;
        }
        this.h.i("CMAlarm", 2, v2, pendingIntent1, xrn0.h);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0.hasExtra("alarmId") && intent0.hasExtra("sessionId")) {
            if(!this.f) {
                a.ag(xth.a.j(), "[EventHandler] Received an alarm but AlarmSetter has been stopped. intent=%s", intent0, 'E');
                return;
            }
            xsi xsi0 = new xsi(this, intent0.getIntExtra("alarmId", 0x80000000), intent0);
            xrn xrn0 = new xrn("EventHandler-delayed", "com.google.android.gms", null);
            this.g.b(xsi0, xrn0);
            return;
        }
        a.ag(xth.a.j(), "[EventHandler] No alarm id or session id found for intent: %s", intent0, 'D');
    }
}

