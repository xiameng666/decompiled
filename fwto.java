import android.app.AlarmManager.AlarmClockInfo;
import android.app.AlarmManager;
import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.google.android.gms.location.internal.NlpTestingRequest;
import com.google.android.location.os.real.CallbackRunner.MyBroadcastReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fwto implements Runnable {
    public final CallbackRunner.MyBroadcastReceiver a;
    public final Intent b;

    public fwto(CallbackRunner.MyBroadcastReceiver callbackRunner$MyBroadcastReceiver0, Intent intent0) {
        this.a = callbackRunner$MyBroadcastReceiver0;
        this.b = intent0;
    }

    @Override
    public final void run() {
        ArrayList arrayList0;
        CallbackRunner.MyBroadcastReceiver callbackRunner$MyBroadcastReceiver0 = this.a;
        Intent intent0 = this.b;
        try {
            String s = intent0.getAction();
            if(s != null) {
                try {
                    if(s.equals("android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED")) {
                        callbackRunner$MyBroadcastReceiver0.a.i();
                    }
                    else {
                        int v = 0;
                        List list0 = null;
                    alab1:
                        switch(s) {
                            case "android.app.action.NEXT_ALARM_CLOCK_CHANGED": {
                                fwtu fwtu1 = callbackRunner$MyBroadcastReceiver0.b;
                                AlarmManager.AlarmClockInfo alarmManager$AlarmClockInfo0 = ((AlarmManager)fwtu1.b.getSystemService("alarm")).getNextAlarmClock();
                                long v2 = alarmManager$AlarmClockInfo0 == null ? 0L : alarmManager$AlarmClockInfo0.getTriggerTime();
                                fwtu1.q.o(v2);
                                break;
                            }
                            case "android.bluetooth.adapter.action.STATE_CHANGED": {
                                futl futl0 = callbackRunner$MyBroadcastReceiver0.b.r;
                                if(futl0 != null) {
                                    int v1 = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                                    fuvy fuvy0 = futl0.b;
                                    if(v1 == 10) {
                                        Object object0 = fuvy0.f;
                                        synchronized(object0) {
                                            for(Object object1: fuvy0.g.values()) {
                                                fuvx fuvx0 = (fuvx)object1;
                                                if(fuvx0.b) {
                                                    fuvy0.d(fuvx0.c, 5);
                                                }
                                            }
                                            fuvy0.c(null);
                                        }
                                    }
                                }
                                break;
                            }
                            case "android.bluetooth.device.action.ACL_CONNECTED": {
                                callbackRunner$MyBroadcastReceiver0.b(intent0, 1);
                                break;
                            }
                            case "android.bluetooth.device.action.ACL_DISCONNECTED": {
                                callbackRunner$MyBroadcastReceiver0.b(intent0, 2);
                                break;
                            }
                            case "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED": {
                                callbackRunner$MyBroadcastReceiver0.b(intent0, 3);
                                break;
                            }
                            case "android.intent.action.ACTION_POWER_CONNECTED": 
                            case "android.intent.action.ACTION_POWER_DISCONNECTED": {
                                if(humr.r()) {
                                    callbackRunner$MyBroadcastReceiver0.b.g(callbackRunner$MyBroadcastReceiver0.a);
                                }
                                break;
                            }
                            case "android.intent.action.AIRPLANE_MODE": {
                                boolean z = fwtu.o(callbackRunner$MyBroadcastReceiver0.b.b);
                                fwso.a(callbackRunner$MyBroadcastReceiver0.b.e, z);
                                callbackRunner$MyBroadcastReceiver0.a.a(z);
                                break;
                            }
                            case "android.intent.action.SCREEN_OFF": {
                                callbackRunner$MyBroadcastReceiver0.b.k(false);
                                break;
                            }
                            case "android.intent.action.SCREEN_ON": {
                                callbackRunner$MyBroadcastReceiver0.b.k(true);
                                break;
                            }
                            case "android.intent.action.USER_BACKGROUND": {
                                callbackRunner$MyBroadcastReceiver0.a.w();
                                callbackRunner$MyBroadcastReceiver0.b.n = false;
                                break;
                            }
                            case "android.intent.action.USER_FOREGROUND": {
                                callbackRunner$MyBroadcastReceiver0.a.x();
                                callbackRunner$MyBroadcastReceiver0.b.n = true;
                                break;
                            }
                            case "android.intent.action.USER_PRESENT": {
                                fvwx fvwx0 = new fvwx(19, callbackRunner$MyBroadcastReceiver0.b.e.f());
                                callbackRunner$MyBroadcastReceiver0.b.e.a(fvwx0);
                                callbackRunner$MyBroadcastReceiver0.a.y();
                                break;
                            }
                            case "android.location.MODE_CHANGED": {
                                LocationManager locationManager0 = (LocationManager)callbackRunner$MyBroadcastReceiver0.b.b.getSystemService("location");
                                if(locationManager0 != null) {
                                    boolean z1 = locationManager0.isLocationEnabled();
                                    callbackRunner$MyBroadcastReceiver0.a.n(z1);
                                }
                                break;
                            }
                            case "android.net.conn.CONNECTIVITY_CHANGE": {
                                fwtu fwtu0 = callbackRunner$MyBroadcastReceiver0.b;
                                if(!fwtu0.p()) {
                                    WifiManager wifiManager0 = (WifiManager)fwtu0.d.getSystemService("wifi");
                                    fwtu0.h(((ConnectivityManager)fwtu0.d.getSystemService("connectivity")), wifiManager0, callbackRunner$MyBroadcastReceiver0.a);
                                }
                                break;
                            }
                            case "android.net.wifi.SCAN_RESULTS": {
                                try {
                                    fwtu fwtu3 = callbackRunner$MyBroadcastReceiver0.b;
                                    if(fwtu3.n) {
                                        WifiManager wifiManager1 = (WifiManager)fwtu3.c.getSystemService("wifi");
                                        if(wifiManager1 != null) {
                                            list0 = wifiManager1.getScanResults();
                                        }
                                    }
                                }
                                catch(RuntimeException unused_ex) {
                                }
                                if(list0 == null) {
                                    arrayList0 = new ArrayList(0);
                                }
                                else if(!list0.isEmpty()) {
                                    fwwn fwwn0 = fwwn.h();
                                    fwvy[] arr_fwvy = new fwvy[list0.size()];
                                    Collections.sort(list0, new fwtn());
                                    for(Object object2: list0) {
                                        arr_fwvy[v] = fwwn0.g(((ScanResult)object2));
                                        ++v;
                                    }
                                    arrayList0 = new ArrayList(1);
                                    arrayList0.add(arr_fwvy);
                                }
                                else {
                                    arrayList0 = new ArrayList(0);
                                }
                                callbackRunner$MyBroadcastReceiver0.b.s(arrayList0);
                                break;
                            }
                            case "android.net.wifi.WIFI_STATE_CHANGED": {
                                switch(intent0.getIntExtra("wifi_state", 4)) {
                                    case 1: 
                                    case 3: {
                                        callbackRunner$MyBroadcastReceiver0.b.c(callbackRunner$MyBroadcastReceiver0.a);
                                        break alab1;
                                    }
                                    default: {
                                        break alab1;
                                    }
                                }
                            }
                            case "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED": {
                                fwtu.f(callbackRunner$MyBroadcastReceiver0.b.e, callbackRunner$MyBroadcastReceiver0.b.b);
                                break;
                            }
                            case "android.os.action.DEVICE_IDLE_MODE_CHANGED": {
                                PowerManager powerManager0 = (PowerManager)callbackRunner$MyBroadcastReceiver0.b.b.getSystemService("power");
                                boolean z2 = fwwn.h().d(powerManager0);
                                callbackRunner$MyBroadcastReceiver0.b.t = z2;
                                fwso.g(callbackRunner$MyBroadcastReceiver0.b.e, z2);
                                callbackRunner$MyBroadcastReceiver0.a.e(callbackRunner$MyBroadcastReceiver0.b.t);
                                callbackRunner$MyBroadcastReceiver0.b.j.j.e(callbackRunner$MyBroadcastReceiver0.b.t);
                                break;
                            }
                            case "android.os.action.POWER_SAVE_MODE_CHANGED": {
                                fwtu fwtu2 = callbackRunner$MyBroadcastReceiver0.b;
                                PowerManager powerManager1 = (PowerManager)fwtu2.b.getSystemService("power");
                                if(powerManager1 != null) {
                                    fwtu2.j(powerManager1.isPowerSaveMode());
                                }
                                break;
                            }
                            case "com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION": {
                                callbackRunner$MyBroadcastReceiver0.b.b(fwzf.i, -1);
                                break;
                            }
                            case "com.google.android.location.internal.intent.action.NLP_TESTING": {
                                if(huvd.s()) {
                                    byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.location.internal.EXTRA_NLP_TESTING_REQUEST");
                                    if(arr_b != null) {
                                        list0 = (NlpTestingRequest)bauc.a(arr_b, NlpTestingRequest.CREATOR);
                                    }
                                    if(list0 != null) {
                                        callbackRunner$MyBroadcastReceiver0.a.p(list0.a);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    throw exception0;
                }
            }
        }
        catch(Throwable throwable0) {
            callbackRunner$MyBroadcastReceiver0.b.j.k.j(fwzf.q);
            throw throwable0;
        }
        callbackRunner$MyBroadcastReceiver0.b.j.k.j(fwzf.q);
    }
}

