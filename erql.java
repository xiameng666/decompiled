import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources.NotFoundException;
import android.os.Build;
import android.os.HandlerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.utils.bluetooth.BluetoothController.1;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class erql {
    public static final baun a;
    public static final Object b;
    public final Context c;
    public final erqj d;
    public BroadcastReceiver e;
    private boolean f;

    static {
        erql.a = new erqc(new String[]{"Utils", "Bluetooth", "BluetoothController"});
        erql.b = new Object();
    }

    public erql(Context context0, erqj erqj0) {
        this.f = false;
        this.c = context0;
        this.d = erqj0;
    }

    public final Status a(boolean z, boolean z1) {
        erqj erqj0 = this.d;
        if(erqj0 == null) {
            this.f = false;
            erql.a.f("btAdapter was null: Bluetooth unavailable.", new Object[0]);
            return new Status(10550);
        }
        if(!z) {
            if(!hyig.a.c().c()) {
            label_10:
                if(!erqj0.d()) {
                    if(!hyig.d()) {
                        this.f = true;
                    }
                    CountDownLatch countDownLatch0 = new CountDownLatch(1);
                    HandlerThread handlerThread0 = new HandlerThread("BluetoothController", 10);
                    handlerThread0.start();
                    clht clht0 = new clht(handlerThread0.getLooper());
                    BluetoothController.1 bluetoothController$10 = new BluetoothController.1(this, countDownLatch0);
                    IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
                    this.c.registerReceiver(bluetoothController$10, intentFilter0, null, clht0);
                    if(erqj0.c()) {
                        try {
                            countDownLatch0.await(10L, TimeUnit.SECONDS);
                        }
                        catch(InterruptedException interruptedException0) {
                            erql.a.k("Interrupted", interruptedException0, new Object[0]);
                        }
                        handlerThread0.quitSafely();
                        if(this.d.d()) {
                            erql.a.d("Bluetooth is enabled.", new Object[0]);
                            return Status.b;
                        }
                        erql.a.j("Bluetooth initialization took longer than %d seconds", new Object[]{((int)10)});
                        erql.e(this.c, bluetoothController$10);
                        return new Status(10550);
                    }
                    erql.e(this.c, bluetoothController$10);
                    handlerThread0.quitSafely();
                    return new Status(10550);
                }
            }
        }
        else if(z1) {
            new bblp(1, 10).execute(new erqk(this));
            goto label_10;
        }
        else {
            goto label_10;
        }
        return Status.b;
    }

    public final String b() {
        try {
            String s = gajc.a(this.c).toString();
            return s.equals("device") ? Build.MODEL : s;
        }
        catch(Resources.NotFoundException unused_ex) {
            return Build.MODEL;
        }
    }

    public final void c(boolean z, boolean z1) {
        boolean z2;
        Object object0;
        erqj erqj0 = this.d;
        if(erqj0 != null) {
            if(z1) {
                if(z) {
                    cjpc cjpc0 = cjqh.a(this.c, "smartdevice", "bluetooth_state", 4);
                    try {
                        object0 = erql.b;
                        __monitor_enter(object0);
                    }
                    catch(IOException | ExecutionException | InterruptedException exception0) {
                        z2 = false;
                        goto label_22;
                    }
                    try {
                        z2 = false;
                        z2 = cjpc0.i("bluetooth_state", false);
                        cjpa cjpa0 = cjpc0.c();
                        cjpa0.j("bluetooth_state");
                        cjpa0.b().get();
                        __monitor_exit(object0);
                    }
                    catch(IOException | ExecutionException | InterruptedException exception0) {
                    }
                    finally {
                        FIN.finallyCodeEnd$NT(v);
                    }
                label_22:
                    erql.a.g("Failed to read bluetooth state from disk", exception0, new Object[0]);
                    if(!z2) {
                        erqj0.e();
                    }
                }
            }
            else if(this.f) {
                this.f = false;
                erqj0.e();
            }
        }
    }

    public final void d() {
        erql.a.d("Stop monitoring Bluetooth status changes", new Object[0]);
        BroadcastReceiver broadcastReceiver0 = this.e;
        if(broadcastReceiver0 != null) {
            erql.e(this.c, broadcastReceiver0);
        }
    }

    public static void e(Context context0, BroadcastReceiver broadcastReceiver0) {
        try {
            context0.unregisterReceiver(broadcastReceiver0);
        }
        catch(IllegalArgumentException | IllegalStateException exception0) {
            erql.a.l(exception0);
        }
    }
}

