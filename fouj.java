import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import dagger.Lazy;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ibnh
final class fouj implements fotm {
    public final AtomicBoolean a;
    public final Application b;
    public final gmch c;
    public final Lazy d;
    public final IntentFilter e;
    public final fgvt f;
    public final fotj g;
    public final gful_cronetEngineProvider h;
    private final gful_cronetEngineProvider i;
    private WifiManager j;

    public fouj(fotk fotk0, Context context0, gmch gmch0, Lazy lazy0, ibnf ibnf0, fgvt fgvt0, ibnf ibnf1) {
        this.a = new AtomicBoolean(false);
        this.e = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.g = fotk0.a(gmch0, lazy0, ibnf0);
        this.b = (Application)context0;
        this.c = gmch0;
        this.d = lazy0;
        this.f = fgvt0;
        this.h = gfus.a(((gful_cronetEngineProvider)new fouf(this, context0)));
        this.i = gfus.a(((gful_cronetEngineProvider)new foug(ibnf1)));
    }

    public final iczr a(Intent intent0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczr.a).v_newBuilder();
        if(this.j == null) {
            this.j = (WifiManager)this.b.getSystemService("wifi");
        }
        boolean z = this.j.isWifiEnabled();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iczr iczr0 = (iczr)hftp0.b_message;
        iczr0.b |= 4;
        iczr0.e = z;
        Application application0 = this.b;
        boolean z1 = false;
        if(jwe.a(application0, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter bluetoothAdapter0 = BluetoothAdapter.getDefaultAdapter();
            boolean z2 = bluetoothAdapter0 != null && bluetoothAdapter0.isEnabled();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczr iczr1 = (iczr)hftp0.b_message;
            iczr1.b |= 8;
            iczr1.f = z2;
        }
        boolean z3 = foro.d(application0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iczr iczr2 = (iczr)hftp0.b_message;
        iczr2.b |= 1;
        iczr2.c = z3;
        switch(intent0.getIntExtra("status", -1)) {
            case 2: 
            case 5: {
                z1 = true;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iczr iczr3 = (iczr)hftp0.b_message;
        iczr3.b |= 2;
        iczr3.d = z1;
        return (iczr)hftp0.N_build();
    }

    public static void b(File file0) {
        try {
            if(file0.exists()) {
                file0.delete();
            }
        }
        catch(RuntimeException unused_ex) {
        }
    }

    // Detected as a lambda impl.
    public final void c(boolean z) {
        synchronized(this) {
            foud foud0 = (foud)this.d.get();
            if(foud0.b() && this.g.c(null) && (foud0.a > 0 && foud0.a <= 0x300000 && foud0.b > 0 && foud0.d > 0 && (foud0.e > 0.0))) {
                if(z) {
                    gfsx gfsx0 = (gfsx)this.h.mr();
                    if(gfsx0.i()) {
                        fouj.b(((File)gfsx0.d()));
                    }
                }
                AtomicBoolean atomicBoolean0 = this.a;
                if(!atomicBoolean0.get()) {
                    int v1 = 0;
                    while(v1 < 5) {
                        fouk fouk0 = (fouk)this.i.mr();
                        frbi.b();
                        long v2 = fouk0.b.d().toEpochMilli();
                        Long long0 = fouk0.a(v2 - v2 % fouk.a);
                        if(long0 == null) {
                            break;
                        }
                        long v3 = ((long)long0) - this.f.d().toEpochMilli();
                        if(v3 <= 0L) {
                            ++v1;
                            continue;
                        }
                        atomicBoolean0.set(true);
                        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                        this.c.g(new foui(this, ((long)long0)), v3, timeUnit0);
                        return;
                    }
                }
            }
        }
    }

    static void d(fouj fouj0) {
        fouj0.c(false);
    }

    public static final float e(Intent intent0) {
        return ((float)intent0.getIntExtra("level", -1)) / ((float)intent0.getIntExtra("scale", -1));
    }

    @Override  // fotm
    public final void k() {
        gmbu.l(() -> synchronized(this) {
            foud foud0 = (foud)this.d.get();
            if(foud0.b() && this.g.c(null) && (foud0.a > 0 && foud0.a <= 0x300000 && foud0.b > 0 && foud0.d > 0 && (foud0.e > 0.0))) {
                if(true) {
                    gfsx gfsx0 = (gfsx)this.h.mr();
                    if(gfsx0.i()) {
                        fouj.b(((File)gfsx0.d()));
                    }
                }
                AtomicBoolean atomicBoolean0 = this.a;
                if(!atomicBoolean0.get()) {
                    int v1 = 0;
                    while(v1 < 5) {
                        fouk fouk0 = (fouk)this.i.mr();
                        frbi.b();
                        long v2 = fouk0.b.d().toEpochMilli();
                        Long long0 = fouk0.a(v2 - v2 % fouk.a);
                        if(long0 == null) {
                            break;
                        }
                        long v3 = ((long)long0) - this.f.d().toEpochMilli();
                        if(v3 <= 0L) {
                            ++v1;
                            continue;
                        }
                        atomicBoolean0.set(true);
                        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                        this.c.g(new foui(this, ((long)long0)), v3, timeUnit0);
                        return;
                    }
                }
            }
        }, this.c);
    }
}

