package com.google.android.gms.wearable.node.connection;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import ayvf;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fczq;
import felm;
import ffmn;
import hzuk;
import j..util.Objects;
import java.util.Set;

public class ConnectionServiceManager.1 extends TracingBroadcastReceiver {
    final felm a;

    public ConnectionServiceManager.1(felm felm0) {
        Objects.requireNonNull(felm0);
        this.a = felm0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        boolean z;
        if(Objects.equals(intent0.getAction(), "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
            felm felm0 = this.a;
            BluetoothDevice bluetoothDevice0 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if(bluetoothDevice0 == null) {
                ffmn.f("Wear_ConnectionMgr", "Cannot handle bond state changed intent: %s with null device", new Object[]{intent0});
                return;
            }
            if(intent0.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10) == 12 && intent0.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10) == 10) {
                int v = intent0.getIntExtra("android.bluetooth.device.extra.REASON", -1);
                ffmn.d("Wear_ConnectionMgr", "Bluetooth device %s unbonded for reason %s", new Object[]{bluetoothDevice0, v});
                String s = bluetoothDevice0.getAddress();
                if(felm0.r()) {
                    Set set0 = felm0.D;
                    if(set0.contains(s)) {
                        ffmn.d("Wear_ConnectionMgr", "Unbond of %s is not user triggered; it was due to KEY_MISSING", new Object[]{s});
                        set0.remove(s);
                        z = false;
                        goto label_18;
                    }
                    goto label_17;
                }
                else {
                label_17:
                    z = v == 9;
                }
            label_18:
                String s1 = bluetoothDevice0.getAddress();
                fczq fczq0 = felm0.c.d(s1);
                if(fczq0 == null) {
                    ffmn.f("Wear_ConnectionMgr", "Could not find a config for %s, not handling unbond event", new Object[]{s1});
                    return;
                }
                if(!felm.p(fczq0)) {
                    ffmn.f("Wear_ConnectionMgr", "Cannot handle unbond event for %s as it is not a client config.", new Object[]{fczq0});
                    return;
                }
                if(!z) {
                    ffmn.f("Wear_ConnectionMgr", "Spurious bond loss detected for device config %s", new Object[]{fczq0});
                    felm0.C.a(0L, 1L, ayvf.b);
                    return;
                }
                ffmn.d("Wear_ConnectionMgr", "Handling user-triggered bond removal for %s", new Object[]{fczq0});
                hzuk hzuk0 = hzuk.a;
                if(hzuk0.b().c()) {
                    String s2 = fczq0.k;
                    if((!fczq0.q || hzuk0.b().d()) && s2 != null) {
                        try {
                            felm0.b.getPackageManager().getApplicationInfo(s2, 0);
                        }
                        catch(PackageManager.NameNotFoundException unused_ex) {
                            ffmn.d("Wear_ConnectionMgr", "Package %s is not installed; removing configuration.", new Object[]{s2});
                            goto label_41;
                        }
                        ffmn.d("Wear_ConnectionMgr", "Package %s is still installed and bond loss delegation is enabled. Leaving unbond of config %s for companion app to handle.", new Object[]{s2, fczq0});
                        return;
                    }
                }
            label_41:
                ffmn.d("Wear_ConnectionMgr", "Removing ConnectionConfig %s because it was unbonded by user. ", new Object[]{fczq0});
                felm0.k(fczq0.b, null, true);
            }
        }
    }
}

