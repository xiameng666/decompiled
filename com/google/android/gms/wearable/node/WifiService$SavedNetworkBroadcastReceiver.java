package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import feah;
import j..util.Objects;

public final class WifiService.SavedNetworkBroadcastReceiver extends TracingBroadcastReceiver {
    final feah a;

    public WifiService.SavedNetworkBroadcastReceiver(feah feah0) {
        Objects.requireNonNull(feah0);
        this.a = feah0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.net.wifi.CONFIGURED_NETWORKS_CHANGE")) {
            feah feah0 = this.a;
            if(!feah0.d) {
                int v = intent0.getIntExtra("changeReason", 0);
                if(v == 0 || v == 2) {
                    if(Log.isLoggable("Wear_WifiService", 3)) {
                        Log.d("Wear_WifiService", "Wifi credentials " + (v == 0 ? "ADDED" : "CHANGED") + ", syncing...");
                    }
                    WifiConfiguration wifiConfiguration0 = (WifiConfiguration)intent0.getParcelableExtra("wifiConfiguration");
                    if(wifiConfiguration0 == null || !wifiConfiguration0.isEphemeral()) {
                        feah0.k.sendEmptyMessage(4);
                    }
                    else if(Log.isLoggable("Wear_WifiService", 3)) {
                        Log.d("Wear_WifiService", "Not syncing change to ephemeral credential: " + wifiConfiguration0.SSID);
                    }
                }
                else if(Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Not syncing credentials for change reason: " + v);
                }
            }
        }
    }
}

