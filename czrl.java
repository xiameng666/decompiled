import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothRadio.1;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothRadio.2;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothRadio.3;
import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class czrl {
    public final cupr a;
    public final AtomicBoolean b;
    private final Context c;
    private final gmcg d;
    private final czvk e;
    private final AtomicBoolean f;
    private CountDownLatch g;
    private czvg h;
    private czvg i;
    private final BroadcastReceiver j;
    private final BroadcastReceiver k;

    public czrl(Context context0, czvk czvk0) {
        gmcg gmcg0 = cuui.d();
        cupr cupr0 = cupr.d(context0, "BluetoothRadio");
        super();
        this.g = null;
        this.b = new AtomicBoolean(false);
        this.j = new BluetoothRadio.1(this);
        BluetoothRadio.2 bluetoothRadio$20 = new BluetoothRadio.2(this);
        this.k = bluetoothRadio$20;
        Context context1 = context0.getApplicationContext();
        this.c = context1;
        this.e = czvk0;
        this.d = gmcg0;
        this.a = cupr0;
        if(cupr0 == null) {
            czkq.a.e().p("Failed to retrieve default BluetoothAdapter, Bluetooth is unsupported.", new Object[0]);
            this.f = null;
            return;
        }
        if(cupr0 != null) {
            if(cupr0.h()) {
                this.m();
            }
            else {
                this.x();
            }
            if(cupr0.c() == 12) {
                this.n();
                goto label_26;
            }
            if(this.v()) {
            label_26:
                AtomicBoolean atomicBoolean0 = new AtomicBoolean(cupr0.g());
                this.f = atomicBoolean0;
                czkq.a.d().i("%s Took initial snapshot of Bluetooth Radio state enabled %b", "[BLUETOOTH_RADIO]", Boolean.valueOf(atomicBoolean0.get()));
                this.l();
                if(context1 == null) {
                    return;
                }
                jwe.b(context1, bluetoothRadio$20, new IntentFilter("android.bluetooth.adapter.action.BLE_STATE_CHANGED"), 2);
                return;
            }
        }
        czkq.a.e().h("%s Failed to take register radio state upon initialization.", "[BLUETOOTH_RADIO]");
        this.f = null;
    }

    public final void a() {
        synchronized(this) {
            this.g = null;
        }
    }

    public final void b(Runnable runnable0) {
        gmcg gmcg0 = this.d;
        if(gmcg0 != null) {
            gmcg0.execute(runnable0);
        }
    }

    public final void c(Intent intent0) {
        synchronized(this) {
            if(!this.t()) {
                czkq.a.e().h("%s Unable to process BLE state change since Bluetooth Radio was never initialized.", "[BLUETOOTH_RADIO]");
                return;
            }
            if(Objects.equals(intent0.getAction(), "android.bluetooth.adapter.action.BLE_STATE_CHANGED")) {
                if(this.a.h()) {
                    this.m();
                    return;
                }
                this.x();
            }
        }
    }

    public final void d(Intent intent0) {
        String s;
        synchronized(this) {
            if(!this.t()) {
                czkq.a.e().h("%s Unable to process manual radio state change since Bluetooth Radio was never initialized.", "[BLUETOOTH_RADIO]");
                return;
            }
            if(Objects.equals(intent0.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                int v1 = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 0x80000000);
                cunf cunf0 = czkq.a;
                cunf cunf1 = cunf0.d();
                switch(v1) {
                    case 10: {
                        s = "STATE_OFF";
                        break;
                    }
                    case 11: {
                        s = "STATE_TURNING_ON";
                        break;
                    }
                    case 12: {
                        s = "STATE_ON";
                        break;
                    }
                    case 13: {
                        s = "STATE_TURNING_OFF";
                        break;
                    }
                    default: {
                        s = "STATE_UNKNOWN";
                    }
                }
                cunf1.i("%s Long-running receiver got broadcast for state change %s. About to process", "[BLUETOOTH_RADIO]", String.format(Locale.ENGLISH, "[%d]%s", v1, s));
                if(v1 != 10 && v1 != 12 && v1 != 13) {
                    cunf0.d().h("%s Long-running receiver ignoring irrelevant broadcast.", "[BLUETOOTH_RADIO]");
                    return;
                }
                if(v1 != 10 && v1 != 13) {
                    this.n();
                    CountDownLatch countDownLatch0 = this.g;
                    if(countDownLatch0 != null) {
                        countDownLatch0.countDown();
                    }
                }
                else {
                    this.v();
                }
                cunf0.e().h("%s State was changed outside of our control. Updating the snapshot to match current radio state.", "[BLUETOOTH_RADIO]");
                cupr cupr0 = this.a;
                if(cupr0 != null) {
                    AtomicBoolean atomicBoolean0 = this.f;
                    if(atomicBoolean0 != null) {
                        boolean z = cupr0.g();
                        boolean z1 = atomicBoolean0.getAndSet(z);
                        this.b.set(false);
                        cunf0.d().j("%s Updating snapshot of Bluetooth Radio state enabled from %b to %b", "[BLUETOOTH_RADIO]", Boolean.valueOf(z1), Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    public final void e() {
        AtomicBoolean atomicBoolean1;
        synchronized(this) {
            if(!this.t()) {
                czkq.a.e().h("%s Unable to revert Bluetooth Radio since it was never initialized.", "[BLUETOOTH_RADIO]");
                return;
            }
            cunf cunf0 = czkq.a;
            cunf cunf1 = cunf0.d();
            AtomicBoolean atomicBoolean0 = this.f;
            cunf1.i("%s Reverting Bluetooth Radio to its most recent manually-set state enabled %b", "[BLUETOOTH_RADIO]", Boolean.valueOf(atomicBoolean0.get()));
            try {
                atomicBoolean1 = this.b;
                if(!atomicBoolean1.get()) {
                    cunf0.d().p("Do not revert BT enabling state since we did not change it.", new Object[0]);
                }
                else if(!this.w(atomicBoolean0.get())) {
                    cunf0.e().h("%s Failed to revert Bluetooth back to its most recent manually-set state.", "[BLUETOOTH_RADIO]");
                }
            }
            catch(Throwable throwable0) {
                this.b.set(false);
                this.p();
                this.o();
                cuui.h(this.d, "BluetoothRadio.singleThreadOffloader");
                throw throwable0;
            }
            atomicBoolean1.set(false);
            this.p();
            this.o();
            cuui.h(this.d, "BluetoothRadio.singleThreadOffloader");
        }
    }

    public final void f(CountDownLatch countDownLatch0) {
        synchronized(this) {
            this.g = countDownLatch0;
        }
    }

    public final boolean g() {
        synchronized(this) {
            if(!this.t()) {
                czkq.a.e().h("%s Unable to enable Bluetooth Radio since it was never initialized.", "[BLUETOOTH_RADIO]");
                return false;
            }
            if(this.s(true)) {
                czkq.a.d().h("%s No need to enable Bluetooth Radio since it is already enabled.", "[BLUETOOTH_RADIO]");
                this.n();
                return true;
            }
            if(!this.w(true)) {
                czkq.a.d().h("%s Unable to enable Bluetooth Radio since Nearby Mediums was unable to change the Bluetooth state.", "[BLUETOOTH_RADIO]");
                this.v();
                return false;
            }
            this.n();
            czkq.a.b().h("%s Bluetooth Radio has been enabled and marked as on.", "[BLUETOOTH_RADIO]");
        }
        return true;
    }

    public final boolean h() {
        return this.a != null && this.a.c() == 12;
    }

    public final boolean i() {
        synchronized(this) {
            if(!this.t()) {
                return false;
            }
            cupr cupr0 = this.a;
            if(cupr0.b(7) == 0 && cupr0.b(8) == 0) {
                if(cupr0.b(10) == 0) {
                    if(cupr0.b(19) == 0) {
                        return cupr0.b(21) == 0 ? !cupr0.a.u() && cupr0.b(2) == 0 && cupr0.b(1) == 0 && cupr0.b(3) == 0 : false;
                    }
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean j() {
        synchronized(this) {
            if(this.t() && !this.u()) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        synchronized(this) {
            if(!this.t()) {
                czkq.a.e().h("%s Unable to disable Bluetooth Radio since it was never initialized.", "[BLUETOOTH_RADIO]");
                return;
            }
            if(!this.s(false) && !this.r()) {
                if(!this.v()) {
                    czkq.a.d().h("%s Unable to disable Bluetooth Radio since Nearby Mediums failed to register the Radio as off.", "[BLUETOOTH_RADIO]");
                    return;
                }
                if(!this.w(false)) {
                    czkq.a.d().h("%s Unable to disable Bluetooth Radio since Nearby Mediums was unable to change the Bluetooth state.", "[BLUETOOTH_RADIO]");
                    this.n();
                    return;
                }
                czkq.a.b().h("%s Bluetooth Radio has been disabled and marked as off.", "[BLUETOOTH_RADIO]");
                return;
            }
            czkq.a.d().h("%s No need to disable Bluetooth Radio since it is already disabled.", "[BLUETOOTH_RADIO]");
            this.v();
        }
    }

    private final void l() {
        Context context0 = this.c;
        if(context0 == null) {
            return;
        }
        try {
            IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
            jwe.b(context0, this.j, intentFilter0, 2);
        }
        catch(SecurityException securityException0) {
            czkq.a.c().f(securityException0).p("Failed to register BroadcastReceiver", new Object[0]);
        }
    }

    private final void m() {
        if(!hvol.y()) {
            return;
        }
        if(!this.q()) {
            czkq.a.d().h("%s BLE is already marked as on - no need to mark it again.", "[BLUETOOTH_RADIO]");
            return;
        }
        czvk czvk0 = this.e;
        if(czvk0 != null) {
            czvk0.e(this.i);
        }
        this.i = null;
        czkq.a.d().h("%s BLE has been marked as on.", "[BLUETOOTH_RADIO]");
    }

    private final void n() {
        if(!this.u()) {
            czkq.a.d().h("%s Radio is already marked as on - no need to mark it again.", "[BLUETOOTH_RADIO]");
            return;
        }
        czvk czvk0 = this.e;
        if(czvk0 != null) {
            try {
                czvk0.e(this.h);
            }
            catch(SecurityException securityException0) {
                czkq.a.b().f(securityException0).h("%s Failed to unregister radioOffOperation.", "[BLUETOOTH_RADIO]");
            }
        }
        this.h = null;
        czkq.a.d().h("%s Radio has been marked as on.", "[BLUETOOTH_RADIO]");
    }

    private final void o() {
        cutr.f(this.c, this.k);
    }

    private final void p() {
        cutr.f(this.c, this.j);
    }

    private final boolean q() {
        return this.i != null;
    }

    private final boolean r() {
        return this.a != null && this.a.c() == 13;
    }

    private final boolean s(boolean z) {
        return z ? this.h() : this.a != null && this.a.c() == 10;
    }

    private final boolean t() {
        return this.a != null && this.f != null;
    }

    private final boolean u() {
        return this.h != null;
    }

    private final boolean v() {
        if(this.u()) {
            czkq.a.d().h("%s Radio is already marked as off - no need to mark it again.", "[BLUETOOTH_RADIO]");
            return true;
        }
        czvg czvg0 = new czvg(1);
        czvk czvk0 = this.e;
        if(czvk0 != null) {
            try {
                czvj czvj0 = czvk0.a(czvg0);
                if(czvj.b != czvj0) {
                    czkq.a.e().h("%s Failed to mark Bluetooth as disabled because we were unable to register the MediumOperation.", "[BLUETOOTH_RADIO]");
                    return false;
                }
            }
            catch(SecurityException securityException0) {
                czkq.a.e().f(securityException0).h("%s Failed to mark Bluetooth as disabled because of security exception.", "[BLUETOOTH_RADIO]");
                return false;
            }
        }
        this.h = czvg0;
        czkq.a.d().h("%s Radio has been marked as off.", "[BLUETOOTH_RADIO]");
        return true;
    }

    private final boolean w(boolean z) {
        cupr cupr0 = this.a;
        if(cupr0 == null) {
            return false;
        }
        if(this.s(z)) {
            return true;
        }
        String s = z ? "enable" : "disable";
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        BluetoothRadio.3 bluetoothRadio$30 = new BluetoothRadio.3(this, z, countDownLatch0);
        Context context0 = this.c;
        jwe.b(context0, bluetoothRadio$30, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
        this.p();
        try {
            if(cupr0.c() != 11 && !this.r()) {
                cunf cunf0 = czkq.a;
                cunf0.b().i("%s Change Bluetooth State to %s", "[BLUETOOTH_RADIO]", s);
                boolean z1 = z ? cupr0.f() : cupr0.e();
                this.b.set(true);
                if(!z1) {
                    cunf0.c().h("Failed to begin transition to %s Bluetooth.", s);
                    goto label_18;
                }
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
            cutr.f(this.c, bluetoothRadio$30);
            this.l();
            throw throwable0;
        }
    label_18:
        cutr.f(context0, bluetoothRadio$30);
        this.l();
        return false;
        try {
        label_21:
            if(countDownLatch0.await(hvog.q(), TimeUnit.SECONDS)) {
                czkq.a.d().h("%s successfully waited for latch to signal Bluetooth state change completion.", "[BLUETOOTH_RADIO]");
            }
            else {
                czkq.a.e().h("%s timed out while waiting for latch to signal Bluetooth state change completion.", "[BLUETOOTH_RADIO]");
            }
        }
        catch(InterruptedException interruptedException0) {
            goto label_29;
        }
        catch(Throwable throwable0) {
            cutr.f(this.c, bluetoothRadio$30);
            this.l();
            throw throwable0;
        }
        if(z) {
            try {
                try {
                    Thread.sleep(hvog.a.bk().ae());
                    goto label_38;
                }
                catch(InterruptedException interruptedException0) {
                }
            label_29:
                Thread.currentThread().interrupt();
                czkq.a.c().f(interruptedException0).h("Interrupted while waiting to %s Bluetooth, bailing.", s);
            }
            catch(Throwable throwable0) {
                cutr.f(this.c, bluetoothRadio$30);
                this.l();
                throw throwable0;
            }
            cutr.f(this.c, bluetoothRadio$30);
            this.l();
            return false;
        }
    label_38:
        cutr.f(this.c, bluetoothRadio$30);
        this.l();
        if(!this.s(z)) {
            czkq.a.c().i("Failed to %s Bluetooth after waiting %d seconds, bailing.", s, Long.valueOf(hvog.q()));
            return false;
        }
        czkq.a.d().h("BluetoothRadio was successfully %s.", (z ? "enabled" : "disabled"));
        return true;
    }

    private final void x() {
        if(!hvol.y()) {
            return;
        }
        if(this.q()) {
            czkq.a.d().h("%s BLE is already marked as off - no need to mark it again.", "[BLUETOOTH_RADIO]");
            return;
        }
        czvg czvg0 = new czvg(3);
        if(this.e != null && this.e.a(czvg0) != czvj.b) {
            czkq.a.e().h("%s Failed to mark BLE as disabled because we were unable to register the MediumOperation.", "[BLUETOOTH_RADIO]");
            return;
        }
        this.i = czvg0;
        czkq.a.d().h("%s BLE has been marked as off.", "[BLUETOOTH_RADIO]");
    }
}

