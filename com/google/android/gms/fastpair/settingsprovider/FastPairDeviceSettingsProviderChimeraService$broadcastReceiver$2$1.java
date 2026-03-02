package com.google.android.gms.fastpair.settingsprovider;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import bkrh;
import bkso;
import com.android.settingslib.bluetooth.devicesettings.DeviceInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cust;
import ggtj;
import ibuq;

public final class FastPairDeviceSettingsProviderChimeraService.broadcastReceiver.2.1 extends TracingBroadcastReceiver {
    final bkso a;

    public FastPairDeviceSettingsProviderChimeraService.broadcastReceiver.2.1(bkso bkso0) {
        this.a = bkso0;
        super("nearby", "BroadcastReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        String s = intent0.getAction();
        if(s != null) {
            switch(s.hashCode()) {
                case -1948892510: {
                    if(s.equals("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MULTI_POINT_UPDATE_SUCCESS")) {
                        goto label_10;
                    }
                    break;
                }
                case 0xBA5D3429: {
                    if(!s.equals("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MULTI_POINT_UPDATE_FAILURE")) {
                        return;
                    }
                label_10:
                    cust cust0 = bkrh.a;
                    cust0.d().B("FastPairDeviceSettingsProviderChimeraService: Multipoint update received: %s", intent0.getAction());
                    String s1 = intent0.getStringExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ADDRESS");
                    bkso bkso0 = this.a;
                    DeviceInfo deviceInfo0 = (DeviceInfo)bkso0.b.get(s1);
                    if(deviceInfo0 == null) {
                        cust0.g().B("FastPairDeviceSettingsProviderChimeraService: Multipoint update failed because device %s is not registered", s1);
                        return;
                    }
                    if(ibuq.m(intent0.getAction(), "com.google.android.gms.nearby.fastpair.sass.device.ACTION_MULTI_POINT_UPDATE_SUCCESS")) {
                        bkso0.b().f(deviceInfo0);
                        return;
                    }
                    cust0.g().B("FastPairDeviceSettingsProviderChimeraService: Multipoint update failed for device %s", s1);
                    return;
                }
                case 0xEE0884B5: {
                    if(s.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        goto label_33;
                    }
                    break;
                }
                case 0xA480416: {
                    if(s.equals("android.intent.action.PACKAGE_CHANGED")) {
                        ggtj ggtj0 = bkrh.a.d();
                        Uri uri0 = intent0.getData();
                        ggtj0.B("FastPairDeviceSettingsProviderChimeraService: Package change received: %s", (uri0 == null ? null : uri0.getSchemeSpecificPart()));
                        this.a.d();
                        return;
                    }
                    break;
                }
                case 0x6C9330EF: {
                    if(!s.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        return;
                    }
                label_33:
                    bkrh.a.d().B("FastPairDeviceSettingsProviderChimeraService: ACL change received: %s", intent0.getAction());
                    this.a.d();
                }
            }
        }
    }
}

