import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothClassic.AdvertisingOperation.1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class czpb implements Runnable {
    public final czpc a;
    public final int b;

    public czpb(czpc czpc0, int v) {
        this.a = czpc0;
        this.b = v;
    }

    @Override
    public final void run() {
        czpc czpc0 = this.a;
        int v = this.b;
        bsaq bsaq0 = czpc0.b;
        if(bsaq0 == null) {
            throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", v));
        }
        if(bsaq0.b() != v) {
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            BluetoothClassic.AdvertisingOperation.1 bluetoothClassic$AdvertisingOperation$10 = new BluetoothClassic.AdvertisingOperation.1(czpc0, v, countDownLatch0);
            IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
            int v1 = 2;
            jwe.b(czpc0.a, bluetoothClassic$AdvertisingOperation$10, intentFilter0, 2);
            boolean z = false;
            int v2 = v == 23 ? 1 : 0;
            try {
                try {
                    if(bbqa.c()) {
                        Object object0 = new cuni(bsaq0.b).a("setScanMode", new Class[]{Integer.TYPE}).a(new Object[]{v});
                        if(object0 == null) {
                            throw new cunj(new NoSuchMethodException("Failed to call setScanMode"));
                        }
                        if(((int)(((Integer)object0))) == 0) {
                            z = true;
                        }
                    }
                    else {
                        Object object1 = new cuni(bsaq0.b).a("setScanMode", new Class[]{Integer.TYPE}).a(new Object[]{v});
                        if(object1 == null) {
                            throw new cunj(new NoSuchMethodException("Failed to call setScanMode"));
                        }
                        z = ((Boolean)object1).booleanValue();
                    }
                    if(z) {
                        goto label_40;
                    }
                    else {
                        String s = czpc0.c;
                        gymp gymp0 = v2 == 0 ? gymv.a : gymp.k;
                        czke.k(s, (v2 == 0 ? 3 : 2), gymp0, gymd.w);
                        goto label_51;
                    }
                    throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", v));
                }
                catch(cunj unused_ex) {
                    String s1 = czpc0.c;
                    if(1 != v2) {
                        v1 = 3;
                    }
                    gymp gymp1 = v2 == 0 ? gymv.a : gymp.k;
                    czke.k(s1, v1, gymp1, gymd.x);
                    goto label_51;
                }
                try {
                label_40:
                    countDownLatch0.await(hvog.a.bk().O(), TimeUnit.SECONDS);
                    goto label_56;
                }
                catch(InterruptedException unused_ex) {
                    String s2 = czpc0.c;
                    if(v2 == 0) {
                        v1 = 3;
                    }
                    gymp gymp2 = v2 == 0 ? gymv.a : gymp.k;
                    czke.k(s2, v1, gymp2, gymd.t);
                    Thread.currentThread().interrupt();
                }
            }
            catch(Throwable throwable0) {
                cutr.f(czpc0.a, bluetoothClassic$AdvertisingOperation$10);
                throw throwable0;
            }
        label_51:
            cutr.f(czpc0.a, bluetoothClassic$AdvertisingOperation$10);
            throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", v));
        label_56:
            cutr.f(czpc0.a, bluetoothClassic$AdvertisingOperation$10);
            if(czpc0.b.b() != v) {
                String s3 = czpc0.c;
                if(v2 == 0) {
                    v1 = 3;
                }
                gymp gymp3 = v2 == 0 ? gymv.a : gymp.k;
                czke.k(s3, v1, gymp3, gymd.y);
                throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", v));
            }
        }
    }
}

