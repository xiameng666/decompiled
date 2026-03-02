package com.google.android.gms.wearable.node.connection;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fczq;
import felm;
import ffmn;
import ffmo;
import hzuk;
import j..util.Objects;

public class ConnectionServiceManager.2 extends TracingBroadcastReceiver {
    final felm a;

    public ConnectionServiceManager.2(felm felm0) {
        Objects.requireNonNull(felm0);
        this.a = felm0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.bluetooth.device.action.KEY_MISSING")) {
            felm felm0 = this.a;
            if(!felm0.r()) {
                ffmn.a("Wear_ConnectionMgr", "Cannot handle KEY_MISSING, feature is disabled on this device.", new Object[0]);
                return;
            }
            BluetoothDevice bluetoothDevice0 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if(bluetoothDevice0 == null) {
                ffmn.f("Wear_ConnectionMgr", "Cannot handle KEY_MISSING intent: %s with null device", new Object[]{intent0});
                return;
            }
            String s = bluetoothDevice0.getAddress();
            fczq fczq0 = felm0.c.d(s);
            if(fczq0 != null) {
                ffmn.d("Wear_ConnectionMgr", "Found config for KEY_MISSING event: %s", new Object[]{fczq0});
                felm0.j(s, this);
                return;
            }
            if(felm0.y && hzuk.a.b().e()) {
                if(bluetoothDevice0.getBluetoothClass() != null && bluetoothDevice0.getBluetoothClass().getMajorDeviceClass() == 0x200) {
                    ffmn.d("Wear_ConnectionMgr", "KEY_MISSING event for class==PHONE", new Object[0]);
                    felm0.j(s, this);
                    return;
                }
                ffmn.d("Wear_ConnectionMgr", "Ignoring KEY_MISSING intent for %s as it is not a phone device or a known config.", new Object[]{ffmo.b(s)});
                return;
            }
            ffmn.d("Wear_ConnectionMgr", "Could not find a config for %s, not handling KEY_MISSING event", new Object[]{ffmo.b(s)});
        }
    }
}

