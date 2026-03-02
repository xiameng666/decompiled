import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.os.Vibrator;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Future;
import java.util.logging.Level;

public final class esys extends esyn {
    public static volatile esyy a;
    boolean b;
    private static final bboh c;
    private final euiv d;

    static {
        esys.c = bboh.b("TapAndPay", bbcu.aM);
    }

    public esys() {
        this.d = new euiv();
    }

    @Override  // esyn
    public final void a(Context context0, esqi esqi0, int v) {
        if(!hypp.h()) {
            esqi0.ah = this.b ? 9 : new dyct().g();
        }
        boolean z = false;
        if(!esys.j(esqi0)) {
            int v1 = esqi0.v;
            if(v1 != 19 && (v1 != 1 && v1 != 21) && (v1 != 7 && v1 != 11 && v1 != 41) && (v1 != 9 && v1 != 30)) {
                switch(v1) {
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: {
                        z = true;
                    }
                }
            }
            else {
                z = true;
            }
        }
        this.b = z;
        if(hypp.g()) {
            esys.i(context0, esqi0);
        }
        if(esys.j(esqi0)) {
            if(!esys.g(esqi0)) {
                esqi0.s = SystemClock.elapsedRealtime() - esqi0.p;
                boolean z1 = esys.h(esqi0);
                context0.startService(eudx.d(context0, esqi0.y, z1));
            }
            this.d(context0, esqi0, v);
            esqi0.t = SystemClock.elapsedRealtime() - esqi0.p;
            if(!hypp.g()) {
                esys.i(context0, esqi0);
            }
        }
    }

    @Override  // esyn
    public final void b(Context context0, esqi esqi0) {
        Level level0 = esgh.a();
        esys.c.g(level0).x("Starting service for payment failure.");
        boolean z = esys.h(esqi0);
        context0.startService(eudx.b(context0, esqi0.v, esqi0.y, z));
    }

    @Override  // esyn
    public final void c(Context context0, esqi esqi0, esqf esqf0) {
        if(hypp.h() && esqi0.ah == 0) {
            esqi0.ah = this.b ? 9 : new dyct().g();
            gjxs gjxs0 = new dyct().c().d;
            if(gjxs0 == null) {
                gjxs0 = gjxs.a;
            }
            esqi0.U = gjxs0;
        }
        if(esqi0.L) {
            ((ggtj)esys.c.h()).x("skipping UI for backwards tag session");
            return;
        }
        if(!esys.g(esqi0) && !esqi0.u) {
            int v = esqi0.v;
            switch(v) {
                case 18: {
                    if(hyxp.a.c().e()) {
                        goto label_14;
                    }
                    break;
                }
                case 10: 
                case 17: 
                case 37: 
                case 39: 
                case 46: {
                    break;
                }
                case -1: 
                case 0: 
                case 1: 
                case 4: 
                case 5: 
                case 7: 
                case 9: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 19: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 38: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 45: 
                case 0x2F: {
                label_14:
                    if(esyy.b(context0)) {
                        esqi0.u = true;
                    }
                    else {
                        this.e(context0, esqi0);
                        esqi0.s = SystemClock.elapsedRealtime() - esqi0.p;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Illegal failure: " + v);
                }
            }
        }
        if((esys.g(esqi0) || esqi0.u) && !esys.f(esqi0)) {
            int v1 = esqi0.v;
            switch(v1) {
                case -1: 
                case 1: 
                case 4: 
                case 5: 
                case 7: 
                case 9: 
                case 10: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 45: 
                case 46: {
                    if(esqi0.u) {
                        this.e(context0, esqi0);
                        esqi0.s = SystemClock.elapsedRealtime() - esqi0.p;
                    }
                    this.d(context0, esqi0, 0);
                    esqi0.t = SystemClock.elapsedRealtime() - esqi0.p;
                    break;
                }
                case 0: 
                case 11: 
                case 12: 
                case 39: 
                case 0x2F: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Illegal failure: " + v1);
                }
            }
        }
    }

    private final void d(Context context0, esqi esqi0, int v) {
        int v1 = esqi0.v;
        String s = null;
        if(esqi0.v != 19 && esqi0.v != 21 || esqi0.ae != 0) {
            if(v1 != -1) {
                this.d.a(context0);
                if(v1 == 19) {
                    esvr.d = SystemClock.elapsedRealtime() + hyvu.a.d().i();
                    Level level0 = esgh.a();
                    ((ggtj)esvr.a.g(level0).ar(0x3D5F)).A("notifyCdcvmRequiredFailure: %d", esvr.d);
                    v1 = 19;
                }
                context0.startService(eudx.a(context0, v1, esys.h(esqi0)));
            }
            else if(v == 0) {
                byte[] arr_b = esqi0.O == null ? null : esqi0.O.d(0x9F4E);
                if(arr_b != null) {
                    s = new String(arr_b, StandardCharsets.US_ASCII).trim();
                }
                boolean z = false;
                if(hyvv.c()) {
                    esqg esqg0 = esqi0.x;
                    if(esqg0 != null) {
                        z = esyz.a(esqg0, esqi0.y);
                    }
                }
                context0.startService(eudx.c(context0, esqi0.y, s, z));
            }
            switch(v1) {
                case -1: {
                    euiv.f(context0);
                    return;
                }
                case 42: {
                    PendingIntent pendingIntent0 = esqi0.T;
                    if(pendingIntent0 != null) {
                        try {
                            pendingIntent0.send();
                            return;
                        }
                        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                            a.aw(esys.c.i(), pendingIntent$CanceledException0);
                        }
                    }
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw null;
    }

    private final void e(Context context0, esqi esqi0) {
        euiv euiv0 = this.d;
        Future future0 = euiv0.d;
        if(future0 != null) {
            future0.cancel(true);
            euiv0.d = null;
        }
        if(SystemClock.elapsedRealtime() > euiv0.c + 400L) {
            Vibrator vibrator0 = euiv.b(context0);
            vibrator0.cancel();
            if(!hyvu.g()) {
                euiv.e(vibrator0);
            }
            euiv0.c = SystemClock.elapsedRealtime();
        }
        boolean z = esys.h(esqi0);
        context0.startService(eudx.d(context0, esqi0.y, z));
    }

    private static boolean f(esqi esqi0) {
        return esqi0.t != -1L;
    }

    private static boolean g(esqi esqi0) {
        return esqi0.s != -1L;
    }

    private static boolean h(esqi esqi0) {
        return esqi0.y == null && ((ggna)esqi0.N).c > 1;
    }

    private static final void i(Context context0, esqi esqi0) {
        String s = esqi0.d;
        String s1 = esqi0.e;
        String s2 = esqi0.c;
        Uri uri0 = esqi0.y == null ? null : esqi0.y.i;
        if(s != null && s1 != null && s2 != null && uri0 != null) {
            String s3 = new esfs(context0, s1, s).a(uri0.toString());
            if(!(hrnt.i() ? new File(ccsb.a.a(s3)) : new File(s3)).exists()) {
                ((ggtj)esys.c.h()).x("Requesting missing card art");
                context0.startService(esfq.a(new esgi(s, s1, s2, context0), null));
            }
        }
    }

    private static final boolean j(esqi esqi0) {
        if(esys.f(esqi0)) {
            return false;
        }
        if(!esys.g(esqi0) && !esqi0.u) {
            return !esqi0.K || esqi0.a() <= 0 ? esqi0.v == 27 : true;
        }
        return true;
    }
}

