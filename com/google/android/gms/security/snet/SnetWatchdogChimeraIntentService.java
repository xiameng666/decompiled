package com.google.android.gms.security.snet;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.util.EventLog.Event;
import android.util.EventLog;
import bbib;
import com.google.android.chimera.IntentOperation;
import elhb;
import elrg;
import hxvy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SnetWatchdogChimeraIntentService extends IntentOperation {
    public static final long a = 0L;
    public static final long b = 0L;
    private static final String c = "SnetWatchdogChimeraIntentService";

    static {
        SnetWatchdogChimeraIntentService.a = TimeUnit.MINUTES.toMillis(2L);
        SnetWatchdogChimeraIntentService.b = TimeUnit.MINUTES.toMillis(10L);
    }

    public static void a(Context context0, String s) {
        if(s == null) {
            return;
        }
        new bbib(context0).a(SnetWatchdogChimeraIntentService.c(context0, -1, -1L, "", "", s));
    }

    public static void b(Context context0, int v, String s, String s1, String s2) {
        bbib bbib0 = new bbib(context0);
        long v1 = "com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(s2) ? SnetWatchdogChimeraIntentService.b : SnetWatchdogChimeraIntentService.a;
        bbib0.d("SnetWatchdogChimeraIntentService", 0, System.currentTimeMillis() + v1, SnetWatchdogChimeraIntentService.c(context0, v, v1, s, s1, s2), "com.google.android.gms");
    }

    private static PendingIntent c(Context context0, int v, long v1, String s, String s1, String s2) {
        Intent intent0 = IntentOperation.getStartIntent(context0, SnetWatchdogChimeraIntentService.class, s2);
        intent0.putExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", v);
        intent0.putExtra("snet.watchdog.intent.extra.TIMEOUT", v1);
        intent0.putExtra("snet.watchdog.intent.extra.SESSION_UUID", s);
        intent0.putExtra("snet.watchdog.intent.extra.DEVICE_UUID", s1);
        return PendingIntent.getService(context0, 0, intent0, 0x2000000);
    }

    private static final void d(elrg elrg0, long v) {
        elrg.b(v);
        if(hxvy.p()) {
            ArrayList arrayList0 = new ArrayList();
            String s = null;
            try {
                EventLog.readEvents(new int[]{0x534E4554}, arrayList0);
                String s1 = null;
                for(Object object0: arrayList0) {
                    Object[] arr_object = (Object[])((EventLog.Event)object0).getData();
                    if(arr_object.length == 3 && "do-not-log-execution-checkpoint-tag".equals(arr_object[0])) {
                        s1 = (String)arr_object[2];
                    }
                }
                s = s1;
            }
            catch(ClassCastException | IOException unused_ex) {
            }
            if(!TextUtils.isEmpty(s)) {
                elrg.e = s;
                EventLog.writeEvent(0x534E4554, new Object[]{"do-not-log-execution-checkpoint-tag", ((int)-1), "done"});
            }
        }
        elrg0.c(4);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null) {
            int v = intent0.getIntExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", -1);
            long v1 = intent0.getLongExtra("snet.watchdog.intent.extra.TIMEOUT", -1L);
            String s = intent0.getStringExtra("snet.watchdog.intent.extra.SESSION_UUID");
            String s1 = intent0.getStringExtra("snet.watchdog.intent.extra.DEVICE_UUID");
            elrg elrg0 = new elrg(this, v);
            elrg0.f = s;
            elrg0.g = s1;
            if("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(intent0.getAction())) {
                this.stopService(elhb.b(this, SnetLaunchInProcessChimeraIntentService.class));
                SnetWatchdogChimeraIntentService.d(elrg0, v1);
                return;
            }
            this.stopService(elhb.b(this, SnetLaunchChimeraIntentService.class));
            ActivityManager activityManager0 = (ActivityManager)this.getSystemService("activity");
            if(activityManager0 != null) {
                for(Object object0: activityManager0.getRunningAppProcesses()) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if("com.google.android.gms:snet".equals(activityManager$RunningAppProcessInfo0.processName)) {
                        SnetWatchdogChimeraIntentService.d(elrg0, v1);
                        Process.killProcess(activityManager$RunningAppProcessInfo0.pid);
                        return;
                    }
                }
            }
        }
    }
}

