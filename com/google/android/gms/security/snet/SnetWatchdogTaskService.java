package com.google.android.gms.security.snet;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.EventLog.Event;
import android.util.EventLog;
import cljp;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import elrg;
import elri;
import hxvy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SnetWatchdogTaskService extends GmsTaskBoundService {
    public static final long a;
    public static final long b;
    private Context c;

    static {
        SnetWatchdogTaskService.a = TimeUnit.MINUTES.toMillis(2L);
        SnetWatchdogTaskService.b = TimeUnit.MINUTES.toMillis(10L);
    }

    public SnetWatchdogTaskService() {
    }

    SnetWatchdogTaskService(elri elri0, Context context0) {
        this.c = context0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        String s = "";
        Bundle bundle0 = cllr0.b;
        if(bundle0 == null) {
            return 2;
        }
        int v = bundle0.getInt("snet.watchdog.intent.extra.GMS_CORE_VERSION");
        long v1 = bundle0.getLong("snet.watchdog.intent.extra.TIMEOUT");
        String s1 = bundle0.getString("snet.watchdog.intent.extra.SESSION_UUID");
        String s2 = bundle0.getString("snet.watchdog.intent.extra.DEVICE_UUID");
        if(s1 != null && s2 != null) {
            elrg elrg0 = new elrg(this.c, v);
            elrg0.f = s1;
            elrg0.g = s2;
            ActivityManager activityManager0 = (ActivityManager)this.c.getSystemService("activity");
            if(activityManager0 == null) {
                return 0;
            }
            for(Object object0: activityManager0.getRunningAppProcesses()) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if("com.google.android.gms:snet".equals(activityManager$RunningAppProcessInfo0.processName)) {
                    elrg.b(v1);
                    if(hxvy.p()) {
                        ArrayList arrayList0 = new ArrayList();
                        try {
                            EventLog.readEvents(new int[]{0x534E4554}, arrayList0);
                            String s3 = "";
                            for(Object object1: arrayList0) {
                                Object[] arr_object = (Object[])((EventLog.Event)object1).getData();
                                if(arr_object.length == 3 && "do-not-log-execution-checkpoint-tag".equals(arr_object[0])) {
                                    s3 = (String)arr_object[2];
                                }
                            }
                            s = s3;
                        }
                        catch(ClassCastException | IOException unused_ex) {
                        }
                        if(!TextUtils.isEmpty(s)) {
                            elrg.e = s;
                            EventLog.writeEvent(0x534E4554, new Object[]{"do-not-log-execution-checkpoint-tag", ((int)-1), "done"});
                        }
                    }
                    elrg0.c(4);
                    Process.killProcess(activityManager$RunningAppProcessInfo0.pid);
                    return 0;
                }
            }
            return 0;
        }
        return 2;
    }

    public static void d(Context context0) {
        cljp.a(context0).d("snet_watchdog_task_tag", SnetWatchdogTaskService.class.getName());
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final void onCreate() {
        this.c = this;
        super.onCreate();
    }
}

