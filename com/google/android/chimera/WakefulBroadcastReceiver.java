package com.google.android.chimera;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import clhu;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0L)
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final SparseArray b;
    private static int c;

    static {
        WakefulBroadcastReceiver.b = new SparseArray();
        WakefulBroadcastReceiver.c = 1;
    }

    public static boolean completeWakefulIntent(Intent intent0) {
        int v = intent0.getIntExtra("android.support.content.wakelockid", 0);
        if(v == 0) {
            return false;
        }
        SparseArray sparseArray0 = WakefulBroadcastReceiver.b;
        synchronized(sparseArray0) {
            PowerManager.WakeLock powerManager$WakeLock0 = (PowerManager.WakeLock)sparseArray0.get(v);
            if(powerManager$WakeLock0 != null) {
                powerManager$WakeLock0.release();
                sparseArray0.remove(v);
                return true;
            }
            Log.w("WakefulBroadcastReceiver", "No active wake lock id #" + v);
        }
        return true;
    }

    public static ComponentName startWakefulService(Context context0, Intent intent0) {
        ComponentName componentName0;
        SparseArray sparseArray0 = WakefulBroadcastReceiver.b;
        synchronized(sparseArray0) {
            int v1 = WakefulBroadcastReceiver.c;
            WakefulBroadcastReceiver.c = v1 + 1;
            if(v1 + 1 <= 0) {
                WakefulBroadcastReceiver.c = 1;
            }
            intent0.putExtra("android.support.content.wakelockid", v1);
            componentName0 = context0.startService(intent0);
            if(componentName0 == null) {
                return null;
            }
            if(Log.isLoggable("WakefulBroadcastRcvr", 4)) {
                Log.i("WakefulBroadcastRcvr", "Processing wakeful broadcast: " + intent0.getAction());
            }
            PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)context0.getSystemService("power")).newWakeLock(1, "wake:" + componentName0.flattenToShortString() + " - " + clhu.a(intent0.getAction()));
            powerManager$WakeLock0.setReferenceCounted(false);
            powerManager$WakeLock0.acquire(60000L);
            sparseArray0.put(v1, powerManager$WakeLock0);
        }
        return componentName0;
    }
}

