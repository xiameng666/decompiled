import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothClassic.BluetoothPairingDialogZapper;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

public final class czph {
    public final Context a;
    public final bsaq b;
    public final czvk c;
    public volatile czvg d;
    public volatile czvg e;
    public final Set f;
    public final Map g;
    private final czrr h;
    private final ScheduledExecutorService i;
    private final Map j;
    private final gmcg k;

    public czph(Context context0, czvk czvk0) {
        gmcg gmcg0 = cuui.d();
        bsaq bsaq0 = cumz.e(context0.getApplicationContext(), "BluetoothClassic");
        super();
        ScheduledExecutorService scheduledExecutorService0 = cuui.f();
        this.i = scheduledExecutorService0;
        this.j = new bxd();
        this.f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.g = new ConcurrentHashMap();
        Context context1 = context0.getApplicationContext();
        this.a = context1;
        this.c = czvk0;
        this.k = gmcg0;
        this.b = bsaq0;
        new BluetoothClassic.BluetoothPairingDialogZapper();
        if(this.n()) {
            czrv.b().h(context1);
        }
        this.h = new czrr(context1, (bsaq0 == null ? null : bsaq0.b), gmcg0, scheduledExecutorService0);
    }

    public final czle a(BluetoothDevice bluetoothDevice0, String s, cump cump0, String s1, boolean z) {
        czle czle5;
        synchronized(this) {
            if(cump0.d()) {
                return new czle(gyxo.h);
            }
            Map map0 = this.g;
            czwf czwf0 = (czwf)map0.get(bluetoothDevice0);
            if(czwf0 != null) {
                if(czwf0.o()) {
                    czrs czrs0 = (czrs)czwf0.b(s);
                    if(czrs0 == null) {
                        czke.k(s, 8, gymb.j, czwf0.h);
                        return new czle(gyxo.fk);
                    }
                    return new czle(czrs0, gyxo.b);
                }
                czkq.a.e().i("Reject the connection request for %s because already has connection to %s", s, bluetoothDevice0);
                return new czle(gyxo.aB);
            }
            czpf czpf0 = new czpf(bluetoothDevice0, s, cump0, this.b, s1, map0, z);
            Set set0 = this.f;
            set0.add(czpf0);
            if(czvk.f(this.c.a(czpf0))) {
                czrs czrs1 = czpf0.d;
                if(czrs1 != null) {
                    czwf czwf1 = (czwf)map0.get(bluetoothDevice0);
                    if(czrs1.j() && czwf1 != null) {
                        czov czov0 = new czov(this, czpf0, bluetoothDevice0);
                        czwf1.b.g(czov0);
                    }
                    else {
                        czrs1.g(new czow(this, czpf0));
                    }
                }
                return czrs1 == null ? new czle(gyxo.ca) : new czle(czrs1, gyxo.b);
            }
            set0.remove(czpf0);
            czkq.a.e().p("Failed to create client Bluetooth socket because we failed to register the MediumOperation.", new Object[0]);
            czle5 = new czle(czpf0.h);
        }
        return czle5;
    }

    public final czle b(String s) {
        czle czle4;
        synchronized(this) {
            if(s == null) {
                czkq.a.c().p("Refusing to get remote Bluetooth device because a null bluetoothMacAddress was passed in.", new Object[0]);
                return new czle(gyxo.bq);
            }
            bsaq bsaq0 = this.b;
            if(bsaq0 == null) {
                return new czle(gyxo.bv);
            }
            if(BluetoothAdapter.checkBluetoothAddress(s)) {
                try {
                    return new czle(bsaq0.g(s), gyxo.b);
                }
                catch(IllegalArgumentException unused_ex) {
                    czkq.a.b().h("A valid Bluetooth Device could not be generated from %s", s);
                    return new czle(gyxo.bX);
                }
            }
            czkq.a.c().h("%s is not a valid Bluetooth MAC address", s);
            czle4 = new czle(gyxo.ea);
        }
        return czle4;
    }

    public final czle c(String s, String s1) {
        czle czle1;
        synchronized(this) {
            bsaq bsaq0 = this.b;
            if(bsaq0 == null) {
                return new czle(Boolean.valueOf(false), gyxo.bv);
            }
            if(this.m()) {
                if(s1.equals(bsaq0.l())) {
                    czke.C(s, gymp.c);
                }
                else {
                    String s2 = String.format("Current advertising device name : %s, new device name : %s", bsaq0.l(), s1);
                    czke.l(s, 2, gymp.h, gymd.cn, s2);
                }
                return new czle(Boolean.valueOf(false), gyxo.aW);
            }
            if(!this.n()) {
                gymd gymd0 = this.s();
                czke.k(s, 2, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.O);
            }
            czpc czpc0 = new czpc(this.a, bsaq0.b, s1, s);
            if(!czvk.f(this.c.a(czpc0))) {
                czkq.a.d().h("Failed to start Bluetooth Classic advertising with deviceName %s because we were unable to register the MediumOperation", s1);
                return new czle(Boolean.valueOf(false), czpc0.d);
            }
            this.e = czpc0;
            czkq.a.b().h("Successfully started Bluetooth Classic advertising with deviceName %s", s1);
            czle1 = new czle(Boolean.valueOf(true), czpc0.d);
        }
        return czle1;
    }

    static String d(String s, boolean z) {
        return z ? s + "_second" : s;
    }

    public static UUID e(String s) {
        return UUID.nameUUIDFromBytes(s.getBytes());
    }

    public final void f(Runnable runnable0) {
        this.k.execute(runnable0);
    }

    final void g(czvg czvg0, BluetoothDevice bluetoothDevice0) {
        synchronized(this) {
            this.c.e(czvg0);
            this.f.remove(czvg0);
            if(bluetoothDevice0 != null) {
                this.g.remove(bluetoothDevice0);
            }
        }
    }

    public final void h() {
        synchronized(this) {
            cuui.h(this.k, "BluetoothClassic.singleThreadOffloader");
            cuui.h(this.i, "BluetoothClassic.onLostExecutor");
            gged_interceptors gged0 = this.h.b();
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.k(((String)gged0.get(v2)));
            }
            bxe bxe0 = new bxe(new bxf(this.j.keySet()));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                this.i(((String)object0));
            }
            this.j();
            Map map0 = this.g;
            for(Object object1: map0.values()) {
                ((czwf)object1).l();
            }
            map0.clear();
        }
    }

    public final void i(String s) {
        synchronized(this) {
            if(s == null) {
                czkq.a.c().p("Unable to stop accepting Bluetooth Classic connections because the serviceId is null.", new Object[0]);
                return;
            }
            if(!this.l(s)) {
                czkq.a.b().h("Can\'t stop accepting Bluetooth Classic connections for %s because it was never started.", s);
                return;
            }
            czwf.n(s, 2);
            try {
                BluetoothServerSocket bluetoothServerSocket0 = (BluetoothServerSocket)this.j.remove(s);
                if(bluetoothServerSocket0 != null) {
                    bluetoothServerSocket0.close();
                }
            }
            catch(IOException iOException0) {
                czke.l(s, 5, gymz.a, gymd.bR, iOException0.getMessage());
            }
            czkq.a.b().h("Stopped accepting Bluetooth Classic connections for %s.", s);
        }
    }

    public final void j() {
        synchronized(this) {
            if(!this.m()) {
                czkq.a.b().p("Can\'t stop Bluetooth Classic advertising because it was never turned on.", new Object[0]);
                return;
            }
            this.c.e(this.e);
            this.e = null;
            czkq.a.b().p("Successfully stopped Bluetooth Classic advertising", new Object[0]);
        }
    }

    public final void k(String s) {
        synchronized(this) {
            if(TextUtils.isEmpty(s)) {
                czke.k(String.valueOf(s), 7, gylz.b, gymd.b);
                return;
            }
            if(!this.o()) {
                czkq.a.d().p("Can\'t stop stop Bluetooth Classic discovery because it never started.", new Object[0]);
                return;
            }
            czrr czrr0 = this.h;
            czrr0.e(s);
            if(!czrr0.b().isEmpty()) {
                czkq.a.b().h("There are %d clients still scanning over Bluetooth Classic, do not stop scan.", Integer.valueOf(czrr0.b().size()));
                return;
            }
            this.c.e(this.d);
            this.d = null;
            czkq.a.b().p("Stopped Bluetooth Classic discovery using scanner client.", new Object[0]);
        }
    }

    public final boolean l(String s) {
        boolean z;
        synchronized(this) {
            z = this.j.containsKey(s);
        }
        return z;
    }

    public final boolean m() {
        return this.e != null;
    }

    public final boolean n() {
        return hvol.aP() && (this.a != null && this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.b != null);
    }

    public final boolean o() {
        return this.d != null;
    }

    public static boolean p(String s) {
        return s != null && BluetoothAdapter.checkBluetoothAddress(s);
    }

    public final czle q(String s, cvgg cvgg0, String s1) {
        Throwable throwable2;
        czle czle5;
        czle czle4;
        czle czle3;
        czle czle2;
        czle czle1;
        czle czle0;
        czph czph0;
        BluetoothServerSocket bluetoothServerSocket0;
        __monitor_enter(this);
        try {
            bsaq bsaq0 = this.b;
            if(bsaq0 != null) {
                if(!this.l(s)) {
                    if(this.n()) {
                        try {
                            String s2 = czph.d(s, ((boolean)(cumz.j(this.a) ^ 1)));
                            bluetoothServerSocket0 = bsaq0.h(s2, czph.e(s2));
                            goto label_26;
                        }
                        catch(IOException iOException0) {
                            goto label_9;
                        }
                        catch(SecurityException securityException0) {
                            goto label_21;
                        }
                    }
                    goto label_38;
                }
                goto label_45;
            }
            goto label_49;
        }
        catch(Throwable throwable0) {
            czph0 = this;
            throwable2 = throwable0;
            goto label_54;
        }
        try {
        label_9:
            czph0 = this;
            gymd gymd0 = gymd.a;
            if(iOException0.getMessage() == null) {
                gymd0 = gymd.cn;
            }
            else if(iOException0.getMessage().contains("Error: ")) {
                gymd0 = gymd.bz;
            }
            czke.a(new cvae(s, 4, s1), gymt.f, gymd0, iOException0.getMessage());
            czle0 = new czle(Boolean.valueOf(false), gyxo.cL);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_54;
        }
        __monitor_exit(czph0);
        return czle0;
        try {
        label_21:
            czph0 = this;
            czkq.a.b().h("Failed to startListenIncomingSocket : %s", securityException0.getMessage());
            czle1 = new czle(Boolean.valueOf(false), gyxo.cZ);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_54;
        }
        __monitor_exit(czph0);
        return czle1;
        try {
        label_26:
            czwf.h(s, 2, new czox(cvgg0));
            czph0 = this;
        }
        catch(Throwable throwable0) {
            czph0 = this;
            throwable2 = throwable0;
            goto label_54;
        }
        try {
            new czpa(czph0, bluetoothServerSocket0, s, cvgg0, s1).start();
            czph0.j.put(s, bluetoothServerSocket0);
            czkq.a.b().h("Started accepting Bluetooth Classic connections for %s.", s);
            czle2 = new czle(Boolean.valueOf(true), gyxo.b);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_54;
        }
        __monitor_exit(czph0);
        return czle2;
        try {
        label_38:
            czph0 = this;
            cvae cvae0 = new cvae(s, 4, s1);
            gymd gymd1 = czph0.s();
            czke.a(cvae0, gylz.c, gymd1, null);
            czle3 = new czle(Boolean.valueOf(false), gyxo.O);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_54;
        }
        __monitor_exit(czph0);
        return czle3;
        try {
        label_45:
            czke.a(new cvae(s, 4, s1), gymt.a, gymd.cn, null);
            czle4 = new czle(Boolean.valueOf(false), gyxo.aH);
        }
        catch(Throwable throwable1) {
            goto label_52;
        }
        __monitor_exit(this);
        return czle4;
        try {
        label_49:
            czle5 = new czle(Boolean.valueOf(false), gyxo.bv);
        }
        catch(Throwable throwable1) {
        label_52:
            throwable2 = throwable1;
            czph0 = this;
            while(true) {
                try {
                label_54:
                    __monitor_exit(czph0);
                    throw throwable2;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            throwable2 = throwable0;
            goto label_54;
        }
        __monitor_exit(this);
        return czle5;
    }

    public final czle r(String s, cvgq cvgq0) {
        synchronized(this) {
            if(!this.n()) {
                gymd gymd0 = this.s();
                czke.k(s, 6, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.O);
            }
            czrr czrr0 = this.h;
            if(czrr0.g(s)) {
                czke.l(s, 6, gymr.a, gymd.cn, String.format("Already started Bluetooth discovery for service ID %s.", s));
                return new czle(Boolean.valueOf(false), gyxo.bb);
            }
            czrr0.h(s, cvgq0);
            if(this.d == null) {
                czpg czpg0 = new czpg(czrr0);
                if(!czvk.f(this.c.a(czpg0))) {
                    czkq.a.e().p("Failed to start Bluetooth Classic discovery because we were unable to register the MediumOperation.", new Object[0]);
                    czrr0.e(s);
                    return new czle(Boolean.valueOf(false), czpg0.a);
                }
                this.d = czpg0;
            }
            czkq.a.b().h("Started Bluetooth Classic discovery using scanner from Service : %s", s);
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    private final gymd s() {
        if(!this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
            return gymd.f;
        }
        if(this.b == null) {
            return gymd.i;
        }
        return hvol.aP() ? gymd.a : gymd.d;
    }
}

