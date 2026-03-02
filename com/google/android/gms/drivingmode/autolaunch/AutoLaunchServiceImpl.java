package com.google.android.gms.drivingmode.autolaunch;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import bahu;
import bhjb;
import bhjc;
import bhjd;
import bhmr;
import com.google.android.chimera.Service;
import hqoi;

public class AutoLaunchServiceImpl extends Service {
    public bhjd a;

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        bhjd bhjd0 = new bhjd(this);
        this.a = bhjd0;
        bhjd0.g = new bhmr(this);
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        if(intent0 == null) {
            return 2;
        }
        if(hqoi.e()) {
            bhjd bhjd0 = this.a;
            String s = intent0.getAction();
            if("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START".equals(s) || "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END".equals(s) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(s) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT".equals(s) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL".equals(s)) {
                goto label_18;
            }
            BluetoothDevice bluetoothDevice0 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            BluetoothDevice bluetoothDevice1 = bluetoothDevice0 == null ? null : bahu.a(bhjd0.a).getRemoteDevice(bluetoothDevice0.getAddress());
            if(bluetoothDevice1 == null) {
                Log.i("CAR.DRIVINGMODE", "No device: " + intent0.toString());
                return 2;
            }
            boolean z = intent0.getBooleanExtra("car_startup.HAS_WIFI", true);
            if(bluetoothDevice1.getBondState() != 10 && ("android.bluetooth.device.action.ACL_CONNECTED".equals(s) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(s))) {
                bhjd0.e = true;
                bhjc bhjc0 = new bhjc(bhjd0, s, bluetoothDevice1, z);
                bhjd0.d.i(bhjc0);
                bhjd0.d.e();
                return 1;
            label_18:
                Log.i("CAR.DRIVINGMODE", "DrivingModeAutoLaunch received intent: " + intent0.toString());
                bhjd0.e = true;
                bhjb bhjb0 = new bhjb(bhjd0, s);
                bhjd0.d.i(bhjb0);
                bhjd0.d.e();
                return 1;
            }
        }
        return 2;
    }
}

