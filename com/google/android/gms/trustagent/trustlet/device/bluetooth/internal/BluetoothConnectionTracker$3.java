package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ezfp;
import ezfs;
import j..util.Objects;

public class BluetoothConnectionTracker.3 extends TracingBroadcastReceiver {
    final ezfp a;
    final ezfs b;

    public BluetoothConnectionTracker.3(ezfs ezfs0, ezfp ezfp0) {
        this.a = ezfp0;
        Objects.requireNonNull(ezfs0);
        this.b = ezfs0;
        super("trustagent");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(Objects.equals(intent0.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int v = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if(v == 12) {
                this.a.i(true);
                return;
            }
            if(v == 10) {
                this.a.i(false);
            }
        }
        else {
            if(Objects.equals(s, "android.bluetooth.device.action.ACL_CONNECTED")) {
                BluetoothDevice bluetoothDevice0 = ezfs.a(intent0);
                String s1 = bluetoothDevice0.getAddress();
                this.a.l(s1);
                if(this.a.m(bluetoothDevice0)) {
                    String s2 = bluetoothDevice0.getAddress();
                    this.b.c.d(s2);
                }
                String s3 = bluetoothDevice0.getAddress();
                this.b.d.e(s3);
                bluetoothDevice0.getName();
                bluetoothDevice0.getAddress();
                return;
            }
            if(Objects.equals(s, "android.bluetooth.device.action.ACL_DISCONNECTED")) {
                BluetoothDevice bluetoothDevice1 = ezfs.a(intent0);
                bluetoothDevice1.getName();
                bluetoothDevice1.getAddress();
                ezfp ezfp0 = this.a;
                if(ezfp0.m(bluetoothDevice1)) {
                    String s4 = bluetoothDevice1.getAddress();
                    this.b.d.d(s4);
                }
                String s5 = bluetoothDevice1.getAddress();
                this.b.c.e(s5);
                ezfp0.l(bluetoothDevice1.getAddress());
                return;
            }
            if(Objects.equals(s, "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                BluetoothDevice bluetoothDevice2 = ezfs.a(intent0);
                this.a.k(bluetoothDevice2);
            }
        }
    }
}

