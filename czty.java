import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.AdvertisingSetCallback;
import android.bluetooth.le.AdvertisingSetParameters.Builder;
import android.bluetooth.le.AdvertisingSetParameters;
import android.content.Context;
import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class czty {
    final Map a;
    final gfvb b;
    public int c;
    AdvertiseCallback d;
    AdvertisingSetCallback e;
    private static final ParcelUuid f;
    private final Context g;
    private final ScheduledExecutorService h;
    private cumn i;

    static {
        czty.f = new ParcelUuid(czup.b);
    }

    public czty(Context context0, ScheduledExecutorService scheduledExecutorService0) {
        this.a = new bxd();
        this.c = 0;
        this.g = context0;
        this.h = scheduledExecutorService0;
        gfvh gfvh0 = new gfvh();
        gfvh0.g(hvog.S(), TimeUnit.MILLISECONDS);
        gfvh0.h(5L);
        this.b = gfvh0.b();
    }

    public final void a(String s, byte[] arr_b) {
        synchronized(this) {
            if(hvol.aL() && czty.l(s) && !this.g()) {
                byte[] arr_b1 = cztq.i(arr_b);
                czkq.a.d().j("[%s] onAdvertisingStarted from service id : %s, hash : %s", "InstantOnLostManager", s, czmk.g(arr_b1));
                this.a.put(s, arr_b1);
            }
        }
    }

    public final void b(String s) {
        synchronized(this) {
            if(hvol.aL() && czty.l(s) && !this.g()) {
                byte[] arr_b = (byte[])this.a.remove(s);
                if(arr_b != null) {
                    String s1 = bbmu.c(arr_b);
                    this.b.h(s1, arr_b);
                    cumn cumn0 = this.i;
                    if(cumn0 != null) {
                        cumn0.b();
                        this.i = null;
                    }
                    this.e();
                    if(!(this.f() ? this.h() : this.i())) {
                        this.e();
                        czkq.a.b().h("[%s] Failed to advertise instant onLost BLE.", "InstantOnLostManager");
                        return;
                    }
                    cztv cztv0 = () -> synchronized(this) {
                        this.e();
                        this.i = null;
                    };
                    long v1 = hvog.S();
                    this.i = cumn.d(czkq.a, cztv0, v1, this.h);
                }
            }
        }
    }

    // Detected as a lambda impl.
    public final void c() {
        synchronized(this) {
            this.e();
            this.i = null;
        }
    }

    public final void d() {
        synchronized(this) {
            cumn cumn0 = this.i;
            if(cumn0 != null) {
                cumn0.b();
                this.i = null;
            }
            this.e();
            this.c = 0;
            this.b.e();
            this.a.clear();
        }
    }

    final void e() {
        synchronized(this) {
            cupu cupu0 = cupu.b(this.g, "InstantOnLostManager");
            if(cupu0 == null) {
                return;
            }
            AdvertiseCallback advertiseCallback0 = this.d;
            if(advertiseCallback0 != null) {
                cupu0.g(advertiseCallback0);
                this.d = null;
            }
            if(this.f()) {
                AdvertisingSetCallback advertisingSetCallback0 = this.e;
                if(advertisingSetCallback0 != null) {
                    cupu0.d(advertisingSetCallback0);
                    this.e = null;
                }
            }
            czkq.a.d().h("[%s] Stop on lost advertising.", "InstantOnLostManager");
        }
    }

    final boolean f() {
        return czri.U(this.g);
    }

    public final boolean g() {
        return this.c != 0;
    }

    final boolean h() {
        cupu cupu0 = cupu.b(this.g, "InstantOnLostManager");
        if(cupu0 == null) {
            return false;
        }
        gged_interceptors gged0 = this.j();
        AdvertiseData advertiseData0 = czty.k(gged0);
        if(advertiseData0 == null) {
            return false;
        }
        AdvertisingSetParameters advertisingSetParameters0 = new AdvertisingSetParameters.Builder().setConnectable(false).setLegacyMode(true).setScannable(((boolean)(hvol.u() ^ 1))).setInterval(0xA0).build();
        gmcu gmcu0 = new gmcu();
        cztx cztx0 = new cztx(this, gmcu0, gged0);
        this.e = cztx0;
        if(!cupu0.e(advertisingSetParameters0, advertiseData0, null, cztx0)) {
            this.c = 10;
            return false;
        }
        try {
            gmcu0.v(hvog.S(), TimeUnit.MILLISECONDS);
            return true;
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    final boolean i() {
        cupu cupu0 = cupu.b(this.g, "InstantOnLostManager");
        if(cupu0 == null) {
            return false;
        }
        AdvertiseSettings advertiseSettings0 = new AdvertiseSettings.Builder().setAdvertiseMode(2).setConnectable(false).build();
        gged_interceptors gged0 = this.j();
        AdvertiseData advertiseData0 = czty.k(gged0);
        if(advertiseData0 == null) {
            return false;
        }
        gmcu gmcu0 = new gmcu();
        cztw cztw0 = new cztw(this, gmcu0, gged0);
        this.d = cztw0;
        if(!cupu0.c(advertiseSettings0, advertiseData0, cztw0)) {
            this.c = 10;
            return false;
        }
        try {
            gmcu0.v(hvog.S(), TimeUnit.MILLISECONDS);
            return true;
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    private final gged_interceptors j() {
        return gged_interceptors.i(((gfwl)this.b).a.values());
    }

    private static final AdvertiseData k(List list0) {
        if(!list0.isEmpty() && list0.size() <= 5) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(list0.size() * 4 + 2);
            byteBuffer0.put(17);
            byteBuffer0.put(((byte)(list0.size() & 7)));
            for(Object object0: list0) {
                byte[] arr_b = (byte[])object0;
                if(arr_b.length != 4) {
                    czkq.a.e().i("[%s] Failed to convert hashes to advertisement due to invalid hash : %s.", "InstantOnLostAdvertisementV2", czmk.g(arr_b));
                    return null;
                }
                byteBuffer0.put(arr_b);
            }
            byte[] arr_b1 = byteBuffer0.array();
            return arr_b1 == null ? null : new AdvertiseData.Builder().addServiceData(czty.f, arr_b1).setIncludeDeviceName(false).setIncludeTxPowerLevel(false).build();
        }
        czkq.a.e().i("[%s] Failed to convert hashes due to hash size is not valid, size = %d.", "InstantOnLostAdvertisementV2", Integer.valueOf(list0.size()));
        return null;
    }

    private static final boolean l(String s) {
        for(Object object0: hvog.a.bk().eA().b) {
            if(((String)object0).equals(s)) {
                return true;
            }
        }
        return false;
    }
}

