package com.google.android.gms.wearable.backgroundschedulertasks;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import bbdg;
import ccmq;
import cllr;
import com.google.android.gms.chimera.modules.wearable.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;

public class CloudSyncHeartbeatBackgroundTask extends GmsTaskBoundService {
    public static final int a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        int v1;
        ccmq.a().a(bbdg.nB);
        Bundle bundle0 = cllr0.b;
        long v = 0L;
        if(bundle0 == null) {
            v1 = 0;
        }
        else {
            v1 = bundle0.getInt("initial_heartbeat_num", 0);
            v = bundle0.getLong("heartbeat_scheduled_time", 0L);
        }
        CloudSyncHeartbeatBackgroundTask.d("%s is now running, heartBeatNum: %s", new Object[]{"CloudSyncHeartbeatTask", v1});
        Intent intent0 = new Intent("com.google.android.gms.wearable.node.CLOUD_SYNC_SCHEDULER_HEARTBEAT_NOTIFICATION").setPackage("com.google.android.gms").putExtra("initial_heartbeat_num", v1).putExtra("heartbeat_scheduled_time", v);
        AppContextProvider.a().sendBroadcast(intent0);
        return 0;
    }

    public static void d(String s, Object[] arr_object) {
        if(Log.isLoggable("CloudHeartbeatBkgdTsk", 3)) {
            Log.d("CloudHeartbeatBkgdTsk", String.format(s, arr_object));
        }
    }
}

