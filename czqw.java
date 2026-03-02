import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class czqw extends czvg {
    public final bsaq a;
    public final fgva b;
    public final fgug c;
    public final Context d;
    public final Set e;
    fgud f;
    czsg g;
    private final czrx h;
    private final int i;
    private final boolean j;

    public czqw(Context context0, BluetoothAdapter bluetoothAdapter0, fgva fgva0, fgug fgug0, int v, czrx czrx0, cump cump0, int v1, Set set0, boolean z) {
        super(36, cump0);
        czsg czsg0;
        BluetoothDevice bluetoothDevice0;
        this.d = context0;
        this.a = bsaq.i(bluetoothAdapter0, "nearby", "BluetoothLowEnergy");
        this.b = fgva0;
        this.c = fgug0;
        this.i = v;
        this.h = czrx0;
        this.e = set0;
        if(v1 > 0 && czri.V()) {
            try {
                bluetoothDevice0 = fgva0.a;
                czsg0 = new czsg(bluetoothDevice0, v1);
            }
            catch(IOException iOException0) {
                czkq.a.c().f(iOException0).i("Failed to create BleL2capClient with address %s and psm %s", bluetoothDevice0.getAddress(), Integer.valueOf(v1));
                czsg0 = null;
            }
            this.g = czsg0;
        }
        this.j = z;
    }

    @Override  // czvg
    public final czvf a() {
        czsf czsf3;
        czsf czsf2;
        czsf czsf1;
        czsg czsg1;
        cunf cunf0;
        String s;
        ArrayList arrayList0;
        DataOutputStream dataOutputStream0;
        DataInputStream dataInputStream0;
        long v;
        cumn cumn0;
        czsf czsf0;
        czrx czrx0;
        Set set0;
        if(czri.V()) {
            czsg czsg0 = this.g;
            if(czsg0 != null) {
                try {
                    set0 = this.e;
                    czrx0 = this.h;
                    czsf0 = czsg0.f(new gfss(", ").b(set0), 6);
                    if(czsf0.a) {
                        cumn0 = czsg0.a();
                        v = SystemClock.elapsedRealtime();
                        goto label_9;
                    }
                    else {
                        czsg1 = czsg0;
                        czsf2 = czsf0;
                    }
                    goto label_92;
                }
                catch(Throwable throwable0) {
                    czsg1 = czsg0;
                    czsg1.d();
                    throw throwable0;
                }
                try {
                label_9:
                    dataInputStream0 = new DataInputStream(new BufferedInputStream(czsg0.c.getInputStream()));
                    dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(czsg0.c.getOutputStream()));
                    arrayList0 = new ArrayList();
                    bxe bxe0 = new bxe(((bxf)set0));
                    while(true) {
                    label_13:
                        if(!bxe0.hasNext()) {
                            goto label_49;
                        }
                        Object object0 = bxe0.next();
                        s = (String)object0;
                        if(TextUtils.isEmpty(s)) {
                            cunf0 = czkq.a.b();
                            czsg1 = czsg0;
                            czsf1 = czsf0;
                            break;
                        }
                        else {
                            goto label_30;
                        }
                        goto label_33;
                    }
                }
                catch(IOException iOException0) {
                    czsg1 = czsg0;
                    goto label_58;
                }
                catch(Throwable throwable1) {
                    czsg1 = czsg0;
                    goto label_75;
                }
                try {
                    cunf0.p("Cannot serialize BleL2capPacket for REQUEST_ADVERTISEMENT without serviceId", new Object[0]);
                    byte[] arr_b = null;
                    goto label_33;
                label_30:
                    czsg1 = czsg0;
                    czsf1 = czsf0;
                    arr_b = czsq.d(1, czsq.c(s));
                label_33:
                    if(arr_b != null) {
                        czsg.e(dataOutputStream0, arr_b);
                        czsq czsq0 = czsg.b(dataInputStream0);
                        byte[] arr_b1 = czsq0.c;
                        int v1 = czsq0.a;
                        if(v1 == 21) {
                            if(arr_b1 == null) {
                                v1 = 21;
                            }
                            else {
                                arrayList0.add(arr_b1);
                                czsg0 = czsg1;
                                czsf0 = czsf1;
                                goto label_13;
                            }
                        }
                        if(v1 == 22) {
                            czkq.a.d().h("Request advertisement got reject! Remote device doesn\'t have service ID : %s", s);
                        }
                    }
                    czsg0 = czsg1;
                    czsf0 = czsf1;
                    goto label_13;
                label_49:
                    czsg1 = czsg0;
                    czsf2 = czsf0;
                    czsg.e(dataOutputStream0, czsq.d(2, null));
                    int v2 = 0;
                    while(true) {
                        if(v2 >= arrayList0.size()) {
                            goto label_79;
                        }
                        czrx0.c(v2, ((byte[])arrayList0.get(v2)));
                        ++v2;
                    }
                }
                catch(IOException iOException0) {
                    try {
                    label_58:
                        if(iOException0.getMessage() == null) {
                            czke.h(new gfss(", ").b(set0), 6, gymr.h);
                        }
                        else if(iOException0.getMessage().contains("Got invalid length of BleL2capPacket from server")) {
                            czke.j(new gfss(", ").b(set0), 6, gymr.h, gymd.ah, iOException0.getMessage());
                        }
                        else if(iOException0.getMessage().contains("Got invalid BleL2capPacket bytes from server")) {
                            czke.j(new gfss(", ").b(set0), 6, gymr.h, gymd.ai, iOException0.getMessage());
                        }
                        else {
                            czke.j(new gfss(", ").b(set0), 6, gymr.h, gymd.ar, iOException0.getMessage());
                        }
                    }
                    catch(Throwable throwable1) {
                        goto label_75;
                    }
                    try {
                        cumn0.b();
                        if(hvol.aa()) {
                            czkq.a.b().h("[PERFORMANCE] Discovery : L2CAP fetch advertisement took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - v));
                        }
                    }
                    catch(Throwable throwable0) {
                        czsg1.d();
                        throw throwable0;
                    }
                    czsg1.d();
                    czsf3 = new czsf(false);
                    goto label_94;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_75:
                    cumn0.b();
                    if(hvol.aa()) {
                        czkq.a.b().h("[PERFORMANCE] Discovery : L2CAP fetch advertisement took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - v));
                    }
                    throw throwable1;
                label_79:
                    cumn0.b();
                    if(hvol.aa()) {
                        czkq.a.b().h("[PERFORMANCE] Discovery : L2CAP fetch advertisement took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - v));
                    }
                    goto label_92;
                }
                catch(Throwable throwable0) {
                    czsg1.d();
                    throw throwable0;
                }
                try {
                    czsg1 = czsg0;
                    czsf2 = czsf0;
                }
                catch(Throwable throwable0) {
                    czsg1 = czsg0;
                    czsg1.d();
                    throw throwable0;
                }
            label_92:
                czsg1.d();
                czsf3 = czsf2;
            label_94:
                if(czsf3.a) {
                    this.h.d(true);
                    return czvf.b;
                }
                if((czsf3.b instanceof TimeoutException)) {
                    this.h.d(false);
                    czkq.a.b().p("Do not retry fetching advertisements from GATT connection after L2CAP timeout.", new Object[0]);
                    return czvf.b;
                }
            }
        }
        long v3 = SystemClock.elapsedRealtime();
        boolean z = this.c();
        if(hvol.aa()) {
            czkq.a.b().i("[PERFORMANCE] Discovery : create Gatt connection took %d ms, success = %s.", Long.valueOf(SystemClock.elapsedRealtime() - v3), Boolean.valueOf(z));
        }
        if(z) {
            long v4 = SystemClock.elapsedRealtime();
            boolean z1 = true;
            for(int v5 = 0; v5 < this.i; ++v5) {
                if(!this.h.e(v5)) {
                    fgud fgud0 = this.f;
                    if(fgud0 != null) {
                        try {
                            fgud0.a(czup.e(this.j), czup.d(v5));
                        }
                        catch(BluetoothException bluetoothException0) {
                            cunf cunf1 = czkq.a.e().f(bluetoothException0);
                            fgva fgva0 = fgud0.d.b();
                            cunf1.i("Can\'t read advertisement for slot %d on peripheral %s. Failed to find the corresponding characteristic.", Integer.valueOf(v5), gxyf.b(gxye.a, fgva0));
                            continue;
                        }
                        try {
                            byte[] arr_b2 = this.f.p(czup.e(this.j), czup.d(v5));
                            this.h.c(v5, arr_b2);
                            czkq.a.d().i("Successfully read advertisement at slot %d on peripheral %s.", Integer.valueOf(v5), this.b);
                        }
                        catch(BluetoothException bluetoothException1) {
                            czke.j(new gfss(", ").b(this.e), 6, gymr.g, gymd.as, String.format(Locale.US, "Slot : %d, BluetoothDevice : %s, Exception : %s", v5, this.b, bluetoothException1.getMessage()));
                            z1 = false;
                        }
                    }
                }
            }
            if(hvol.aa()) {
                czkq.a.b().i("[PERFORMANCE] Discovery : Read Gatt advertisements took %d ms, success = %s.", Long.valueOf(SystemClock.elapsedRealtime() - v4), Boolean.valueOf(z1));
            }
            boolean z2 = !this.h.b().isEmpty() && z1;
            this.h.d(z2);
            return czvf.b;
        }
        this.h.d(false);
        return czvf.b;
    }

    private final boolean c() {
        gmcu gmcu0 = new gmcu();
        czqv czqv0 = new czqv(this, gmcu0);
        try {
            czqv0.start();
            this.f = (fgud)gmcu0.v(hvog.m(), TimeUnit.MILLISECONDS);
            return true;
        }
        catch(InterruptedException unused_ex) {
            czke.i(new gfss(", ").b(this.e), 6, gymr.g, gymd.t);
            gmcu0.cancel(false);
            Thread.currentThread().interrupt();
            return false;
        }
        catch(ExecutionException executionException0) {
            czke.j(new gfss(", ").b(this.e), 6, gymr.g, gymd.u, String.format(Locale.US, "BluetoothDevice : %s, Exception : %s", this.b, executionException0.getMessage()));
            return false;
        }
        catch(TimeoutException unused_ex) {
            czke.j(new gfss(", ").b(this.e), 6, gymr.g, gymd.y, String.format(Locale.US, "BluetoothDevice : %s", this.b));
            return false;
        }
    }

    @Override  // czvg
    public final void g() {
        try {
            fgud fgud0 = this.f;
            if(fgud0 != null) {
                fgud0.close();
                this.f = null;
            }
        }
        catch(BluetoothException unused_ex) {
        }
    }
}

