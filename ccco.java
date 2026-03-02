import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import j..util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ccco {
    static final fnaa a;
    public static final Object b;
    public final Context c;
    public cccn d;
    public gmcg e;
    public fmzu f;
    public cbyw g;
    public ccgo h;
    public cbzh i;
    public fmzy j;
    private fnau k;
    private ccbr l;
    private final cccd m;

    static {
        ccco.a = fmzv.b("brella", "TrainingJob");
        ccco.b = new Object();
    }

    public ccco(cccd cccd0, gmcg gmcg0) {
        this.d = null;
        try {
            this.m = cccd0;
            this.e = gmcg0;
            Context context0 = cccd0.a.getApplicationContext();
            this.c = context0;
            fmzu fmzu0 = fmzu.b(context0);
            this.f = fmzu0;
            this.g = (cbyw)fmzu0.c(cbyw.class);
            this.k = (fnau)this.f.c(fnau.class);
            this.h = (ccgo)this.f.c(ccgo.class);
            this.i = (cbzh)this.f.c(cbzh.class);
            this.j = (fmzy)this.f.c(fmzy.class);
            this.l = (ccbr)this.f.c(ccbr.class);
            this.i.c(1200);
        }
        catch(Throwable throwable0) {
            cbzh cbzh0 = this.i;
            if(cbzh0 != null) {
                cbzh0.c(0x4AF);
            }
            bbni.f(cccd0.a.getApplicationContext(), throwable0);
            throw throwable0;
        }
    }

    public static cccq a(fnan fnan0) {
        int v = fnan0.c;
        if(v == 4) {
            fnaf fnaf0 = (fnaf)fnan0.d;
            Objects.requireNonNull(fnaf0);
            return new ccca(fnaf0);
        }
        fnah fnah0 = v == 13 ? ((fnah)fnan0.d) : fnah.a;
        Objects.requireNonNull(fnah0);
        return new cccb(fnah0);
    }

    public static void b(gmcd gmcd0, Context context0) {
        try {
            gmbu.r(gmcd0);
        }
        catch(CancellationException unused_ex) {
        }
        catch(ExecutionException executionException0) {
            ccco.a.j(executionException0, "Training failed");
            gmdd gmdd0 = new gmdd(executionException0);
            bbni.f(context0, gmdd0);
            throw gmdd0;
        }
    }

    public final void c(cccn cccn0) {
        int v19;
        grhj grhj0;
        int v14;
        byte[] arr_b3;
        cbzh cbzh2;
        byte[] arr_b1;
        String s5;
        gmcu gmcu2;
        boolean z2;
        boolean z1;
        fnaj fnaj1;
        int v12;
        fnaf fnaf0;
        String s4;
        ccce ccce0;
        int v10;
        cccf cccf0;
        ccck ccck1;
        cccq cccq0;
        byte[] arr_b;
        fnan fnan0;
        Runnable runnable0;
        ccck ccck0;
        gmcu gmcu1;
        cbzh cbzh1;
        IBinder iBinder0;
        gmcu gmcu0;
        Object object0;
        String s2;
        String s = cccn0.c.f;
        cbzh cbzh0 = cccn0.e;
        String s1 = cccn0.c.c == 4 ? ((fnaf)cccn0.c.d).c : null;
        try {
            s2 = fnar.a(("com.google.android.gms/" + s), gfta.b(s1));
            if(this.e(cccn0.c.c == 4, s2, (cccn0.c.n == null ? fnaj.a : cccn0.c.n))) {
                if(s1 == null) {
                    goto label_18;
                }
                else {
                    long v = this.g.t();
                    if(v > 0L && this.l.a.getCacheDir().getUsableSpace() < v) {
                        cbzh0.c(0x469);
                        ccco.a.i("Available disk space is not enough (before starting training)!");
                        goto label_10;
                    }
                }
                goto label_34;
            }
            goto label_456;
        }
        catch(RuntimeException runtimeException0) {
            goto label_459;
        }
        catch(Throwable throwable0) {
            goto label_467;
        }
    label_10:
        cbzh0.c(1190);
        synchronized(ccco.b) {
            this.d(cccn0, false);
        }
        return;
        try {
        label_18:
            long v2 = this.g.u();
            if(v2 > 0L) {
                try {
                    if(ccgw.a(this.f.a(), ccgw.b((cccn0.c.c == 13 ? ((fnah)cccn0.c.d) : fnah.a).e)).getUsableSpace() < v2) {
                        cbzh0.c(0x469);
                        ccco.a.i("Available disk space is not enough (before starting training)!");
                        goto label_26;
                    }
                }
                catch(ErrorStatusException errorStatusException0) {
                    throw new IllegalStateException(errorStatusException0);
                }
            }
            goto label_34;
        }
        catch(RuntimeException runtimeException0) {
            goto label_459;
        }
        catch(Throwable throwable0) {
            goto label_467;
        }
    label_26:
        cbzh0.c(1190);
        synchronized(ccco.b) {
            this.d(cccn0, false);
        }
        return;
        try {
        label_34:
            cbzh0.c(0x4A7);
            object0 = ccco.b;
            __monitor_enter(object0);
        }
        catch(RuntimeException runtimeException0) {
            goto label_459;
        }
        catch(Throwable throwable0) {
            goto label_467;
        }
        try {
            if(this.d == cccn0) {
                Intent intent0 = new Intent("com.google.android.gms.learning.training.background.START").setPackage("com.google.android.gms");
                gmcu0 = new gmcu();
                cccn0.g = new cccm(this, gmcu0);
                String s3 = fnar.a(s, (s1 == null ? "" : s1));
                int v4 = this.g.X(s3) ? 33 : 1;
                if(this.g.U(s3)) {
                    v4 |= 16;
                }
                if(this.g.V(s3)) {
                    v4 |= 4;
                }
                if(this.g.W(s3)) {
                    v4 |= 0x100;
                }
                if(!this.c.bindService(intent0, cccn0.g, v4)) {
                    ccco.a.i("bindService returned false");
                    cbzh0.c(0x4A5);
                    __monitor_exit(object0);
                    goto label_53;
                }
                goto label_62;
            }
            goto label_434;
        }
        catch(Throwable throwable1) {
            goto label_437;
        }
    label_53:
        cbzh0.c(1190);
        synchronized(object0) {
            this.d(cccn0, false);
        }
        __monitor_exit(object0);
        return;
        try {
        label_62:
            __monitor_exit(object0);
        }
        catch(Throwable throwable1) {
            goto label_437;
        }
        try {
            iBinder0 = (IBinder)gmcu0.v(this.g.o(), TimeUnit.SECONDS);
            goto label_92;
        }
        catch(InterruptedException interruptedException0) {
            try {
                cbzh1 = cbzh0;
                cbzh1.c(0x4A4);
                ccco.a.j(interruptedException0, "Interrupted while waiting for service connection");
            }
            catch(RuntimeException runtimeException0) {
                goto label_460;
            }
            catch(Throwable throwable0) {
                goto label_468;
            }
            cbzh1.c(1190);
            synchronized(ccco.b) {
                this.d(cccn0, false);
            }
            return;
        }
        catch(TimeoutException timeoutException0) {
            try {
                cbzh1 = cbzh0;
                cbzh1.c(0x4A3);
                ccco.a.j(timeoutException0, "Timed out while waiting for service connection");
            }
            catch(RuntimeException runtimeException0) {
                goto label_460;
            }
            catch(Throwable throwable0) {
                goto label_468;
            }
            cbzh1.c(1190);
            synchronized(ccco.b) {
                this.d(cccn0, false);
            }
            return;
        }
        catch(ExecutionException executionException0) {
            try {
                cbzh1 = cbzh0;
                throw new gmdd(executionException0);
            }
            catch(RuntimeException runtimeException0) {
                goto label_460;
            }
            catch(Throwable throwable0) {
                goto label_468;
            }
            try {
            label_92:
                if(!this.e(cccn0.c.c == 4, s2, (cccn0.c.n == null ? fnaj.a : cccn0.c.n))) {
                    ccco.a.i("Training conditions not satisfied (before starting training)!");
                    goto label_94;
                }
                goto label_103;
            }
            catch(RuntimeException runtimeException0) {
                goto label_459;
            }
            catch(Throwable throwable0) {
                goto label_467;
            }
        label_94:
            cbzh0.c(1190);
            synchronized(object0) {
                this.d(cccn0, false);
            }
            __monitor_exit(object0);
            return;
            try {
            label_103:
                gmcu1 = new gmcu();
                __monitor_enter(object0);
            }
            catch(RuntimeException runtimeException0) {
                goto label_459;
            }
            catch(Throwable throwable0) {
                goto label_467;
            }
            try {
                if(this.d != cccn0) {
                    __monitor_exit(object0);
                    goto label_107;
                }
                goto label_116;
            }
            catch(Throwable throwable4) {
                cbzh1 = cbzh0;
                runnable0 = null;
                goto label_305;
            }
        label_107:
            cbzh0.c(1190);
            synchronized(object0) {
                this.d(cccn0, false);
            }
            __monitor_exit(object0);
            return;
            try {
            label_116:
                cccj cccj0 = new cccj(this, gmcu1);
                iBinder0.linkToDeath(cccj0, 0);
                ccck0 = new ccck(iBinder0, cccj0);
                goto label_140;
            }
            catch(RemoteException remoteException0) {
                try {
                    cbzh1 = cbzh0;
                    ccco.a.j(remoteException0, "Could not link to death, process probably already died");
                    cbzh1.c(0x4A2);
                    __monitor_exit(object0);
                }
                catch(Throwable throwable4) {
                    runnable0 = null;
                    goto label_305;
                }
                cbzh1.c(1190);
                synchronized(ccco.b) {
                    this.d(cccn0, false);
                }
                return;
            }
            catch(Throwable throwable4) {
                cbzh1 = cbzh0;
            }
            runnable0 = null;
            goto label_305;
            try {
            label_140:
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.learning.dynamite.training.IInAppTrainingController");
                cccn0.h = (iInterface0 instanceof ccce) ? ((ccce)iInterface0) : new ccce(iBinder0);
                if(this.g.aa()) {
                    try {
                        Parcel parcel0 = cccn0.h.hM(6, cccn0.h.jo());
                        boolean z = wbz.i(parcel0);
                        parcel0.recycle();
                        goto label_173;
                    }
                    catch(RemoteException remoteException1) {
                    }
                    catch(RuntimeException runtimeException1) {
                        goto label_161;
                    }
                    ccco.a.j(remoteException1, "Failed to call validateConnection, process probably already died");
                    cbzh0.c(0x4A2);
                    __monitor_exit(object0);
                    goto label_151;
                }
                goto label_187;
            }
            catch(Throwable throwable4) {
                ccck1 = ccck0;
                cbzh1 = cbzh0;
                goto label_304;
            }
        label_151:
            cbzh0.c(1190);
            ccck0.run();
            synchronized(ccco.b) {
                this.d(cccn0, false);
            }
            return;
            try {
            label_161:
                ccco.a.j(runtimeException1, "RuntimeException returned from validateConnection");
                cbzh0.c(0x45D);
                __monitor_exit(object0);
            }
            catch(Throwable throwable4) {
                ccck1 = ccck0;
                cbzh1 = cbzh0;
                goto label_304;
            }
            cbzh0.c(1190);
            ccck0.run();
            synchronized(ccco.b) {
                this.d(cccn0, false);
            }
            return;
        label_173:
            if(!z) {
                try {
                    ccco.a.i("validateConnection returned false");
                    cbzh0.c(0x45C);
                    __monitor_exit(object0);
                }
                catch(Throwable throwable4) {
                    ccck1 = ccck0;
                    cbzh1 = cbzh0;
                    goto label_304;
                }
                cbzh0.c(1190);
                ccck0.run();
                synchronized(object0) {
                    this.d(cccn0, false);
                }
                __monitor_exit(object0);
                return;
            }
            try {
            label_187:
                fnan0 = cccn0.c;
                arr_b = fnan0.p.toByteArray();
                cccq0 = ccco.a(fnan0);
                ccck1 = ccck0;
            }
            catch(Throwable throwable4) {
                ccck1 = ccck0;
                cbzh1 = cbzh0;
                goto label_304;
            }
            try {
                cccf0 = new cccf(this, gmcu1, s2, s, cccq0, arr_b);
                fnaj fnaj0 = fnan0.n;
                if(((fnaj0 == null ? fnaj.a : fnaj0).b & 2) == 0) {
                    v10 = 1;
                }
                else {
                    if(fnaj0 == null) {
                        fnaj0 = fnaj.a;
                    }
                    v10 = (fnaj0.g == null ? hfrr.a : fnaj0.g).b ? 1 : 0;
                }
            }
            catch(Throwable throwable4) {
                cbzh1 = cbzh0;
                goto label_304;
            }
            if(s1 == null) {
                goto label_267;
            label_284:
                cbzh1 = cbzh2;
                try {
                label_285:
                    ccco.a.j(remoteException2, "Failed to call runTraining, process probably already died");
                    cbzh1.c(0x4A2);
                    __monitor_exit(object0);
                }
                catch(Throwable throwable4) {
                    goto label_304;
                }
                cbzh1.c(1190);
                ccck1.run();
                synchronized(ccco.b) {
                    this.d(cccn0, false);
                }
                return;
            }
            else {
                try {
                    ccce0 = cccn0.h;
                    s4 = fnan0.m;
                    if(fnan0.c != 4) {
                        fnaf0 = fnaf.a;
                        goto label_214;
                    }
                }
                catch(RemoteException remoteException2) {
                    cbzh2 = cbzh0;
                    goto label_284;
                }
                catch(Throwable throwable4) {
                    cbzh2 = cbzh0;
                    goto label_303;
                }
                try {
                    fnaf0 = (fnaf)fnan0.d;
                }
                catch(RemoteException remoteException2) {
                    cbzh1 = cbzh0;
                    goto label_285;
                }
                catch(Throwable throwable4) {
                    cbzh1 = cbzh0;
                    goto label_304;
                }
                try {
                label_214:
                    int v11 = 3;
                    switch(fnaf0.d) {
                        case 0: {
                            v11 = 2;
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            v11 = 4;
                            break;
                        }
                        case 3: {
                            v11 = 5;
                            break;
                        }
                        default: {
                            v11 = 0;
                        }
                    }
                    if(v11 == 0) {
                        v11 = 1;
                    }
                    v12 = fnae.a(v11);
                    fnaj1 = fnan0.n;
                    if(fnaj1 == null) {
                        goto label_228;
                    }
                    else {
                        goto label_230;
                    }
                    goto label_231;
                }
                catch(RemoteException remoteException2) {
                    cbzh2 = cbzh0;
                    goto label_284;
                }
                catch(Throwable throwable4) {
                    cbzh2 = cbzh0;
                    goto label_303;
                }
                try {
                label_228:
                    fnaj fnaj2 = fnaj.a;
                    goto label_231;
                label_230:
                    fnaj2 = fnaj1;
                    try {
                    label_231:
                        z1 = fnaj2.e;
                        if(fnaj1 == null) {
                            goto label_233;
                        }
                        goto label_241;
                    }
                    catch(RemoteException remoteException2) {
                        cbzh2 = cbzh0;
                        goto label_284;
                    }
                    catch(Throwable throwable4) {
                        cbzh2 = cbzh0;
                        goto label_303;
                    }
                    try {
                    label_233:
                        fnaj1 = fnaj.a;
                    }
                    catch(RemoteException remoteException2) {
                        cbzh1 = cbzh0;
                        goto label_285;
                    }
                    catch(Throwable throwable4) {
                        cbzh1 = cbzh0;
                        goto label_304;
                    }
                }
                catch(RemoteException remoteException2) {
                    cbzh1 = cbzh0;
                    goto label_285;
                }
                catch(Throwable throwable4) {
                    cbzh1 = cbzh0;
                    goto label_304;
                }
                try {
                label_241:
                    z2 = fnaj1.f;
                    gmcu2 = gmcu1;
                    s5 = s2;
                    arr_b1 = fnan0.q.toByteArray();
                    cbzh2 = cbzh0;
                    goto label_253;
                }
                catch(RemoteException remoteException2) {
                }
                catch(Throwable throwable4) {
                    cbzh2 = cbzh0;
                    goto label_303;
                }
                try {
                    cbzh2 = cbzh0;
                    goto label_284;
                label_253:
                    Parcel parcel1 = ccce0.jo();
                    parcel1.writeString(s);
                    parcel1.writeString(s1);
                    parcel1.writeString(s4);
                    parcel1.writeInt(v12);
                    parcel1.writeInt(v10);
                    parcel1.writeInt(((int)z1));
                    parcel1.writeInt(((int)z2));
                    parcel1.writeByteArray(arr_b);
                    wbz.h(parcel1, cccf0);
                    parcel1.writeLong(cccn0.b);
                    parcel1.writeByteArray(arr_b1);
                    ccce0.jq(2, parcel1);
                    goto label_300;
                label_267:
                    gmcu2 = gmcu1;
                    s5 = s2;
                    cbzh2 = cbzh0;
                    ccce ccce1 = cccn0.h;
                    byte[] arr_b2 = (fnan0.c == 13 ? ((fnah)fnan0.d) : fnah.a).toBytesArray();
                    boolean z3 = (fnan0.n == null ? fnaj.a : fnan0.n).e;
                    Parcel parcel2 = ccce1.jo();
                    parcel2.writeString(s);
                    parcel2.writeByteArray(arr_b2);
                    parcel2.writeInt(v10);
                    parcel2.writeInt(((int)z3));
                    parcel2.writeByteArray(arr_b);
                    wbz.h(parcel2, cccf0);
                    parcel2.writeLong(cccn0.b);
                    ccce1.jq(5, parcel2);
                }
                catch(RemoteException remoteException2) {
                    goto label_284;
                }
                catch(Throwable throwable4) {
                    goto label_303;
                }
            }
            try {
            label_300:
                __monitor_exit(object0);
                goto label_314;
            }
            catch(Throwable throwable4) {
            }
        label_303:
            cbzh1 = cbzh2;
        label_304:
            runnable0 = ccck1;
            while(true) {
            label_305:
                __monitor_exit(object0);
                break;
            }
            try {
                throw throwable4;
            }
            catch(RuntimeException runtimeException0) {
                goto label_461;
            }
            catch(Throwable throwable0) {
                goto label_469;
            }
            try {
            label_314:
                gfsz gfsz0 = (gfsz)gmcu2.v(this.g.p(s5), TimeUnit.SECONDS);
                arr_b3 = (byte[])gfsz0.a;
                v14 = (int)(((Integer)gfsz0.b));
                goto label_351;
            }
            catch(InterruptedException interruptedException1) {
                try {
                    cbzh1 = cbzh2;
                    ccco.a.j(interruptedException1, "Interrupted while waiting for result callback");
                    cbzh1.c(0x4A1);
                }
                catch(RuntimeException runtimeException0) {
                    runnable0 = ccck1;
                    goto label_461;
                }
                catch(Throwable throwable0) {
                    runnable0 = ccck1;
                    goto label_469;
                }
                cbzh1.c(1190);
                ccck1.run();
                synchronized(ccco.b) {
                    this.d(cccn0, false);
                }
                return;
            }
            catch(TimeoutException timeoutException1) {
                try {
                    cbzh1 = cbzh2;
                    ccco.a.j(timeoutException1, "Timed out while waiting for result callback");
                    cbzh1.c(0x4A0);
                }
                catch(RuntimeException runtimeException0) {
                    runnable0 = ccck1;
                    goto label_461;
                }
                catch(Throwable throwable0) {
                    runnable0 = ccck1;
                    goto label_469;
                }
                cbzh1.c(1190);
                ccck1.run();
                synchronized(ccco.b) {
                    this.d(cccn0, false);
                }
                return;
            }
            catch(ExecutionException executionException1) {
                try {
                    cbzh1 = cbzh2;
                    throw new gmdd(executionException1);
                }
                catch(RuntimeException runtimeException0) {
                    runnable0 = ccck1;
                    goto label_461;
                }
                catch(Throwable throwable0) {
                    runnable0 = ccck1;
                    goto label_469;
                }
                try {
                label_351:
                    __monitor_enter(object0);
                    goto label_361;
                }
                catch(RuntimeException runtimeException0) {
                    cbzh1 = cbzh2;
                    runnable0 = ccck1;
                    goto label_461;
                }
                catch(Throwable throwable0) {
                    cbzh1 = cbzh2;
                    runnable0 = ccck1;
                    goto label_469;
                }
            }
            catch(RuntimeException runtimeException0) {
                cbzh1 = cbzh2;
                runnable0 = ccck1;
                goto label_461;
            }
            catch(Throwable throwable0) {
                cbzh1 = cbzh2;
            }
            runnable0 = ccck1;
            goto label_469;
            try {
            label_361:
                if(this.d != cccn0) {
                    __monitor_exit(object0);
                    goto label_367;
                }
                goto label_377;
            }
            catch(Throwable throwable7) {
                cbzh1 = cbzh2;
                goto label_410;
            }
        label_367:
            cbzh2.c(1190);
            ccck1.run();
            synchronized(object0) {
                this.d(cccn0, false);
            }
            __monitor_exit(object0);
            return;
            try {
            label_377:
                cbzh1 = cbzh2;
                cccn0.h = null;
                if(arr_b3 == null) {
                    cbzh1.c(0x49E);
                    __monitor_exit(object0);
                    goto label_382;
                }
                goto label_392;
            }
            catch(Throwable throwable7) {
                goto label_410;
            }
        label_382:
            cbzh1.c(1190);
            ccck1.run();
            synchronized(object0) {
                this.d(cccn0, false);
            }
            __monitor_exit(object0);
            return;
            try {
                try {
                label_392:
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grhj.a), arr_b3, 0, arr_b3.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    grhj0 = (grhj)hftv0;
                    goto label_412;
                }
                catch(hfur hfur0) {
                }
                ccco.a.f(hfur0, "Could not parse TaskRetry result proto");
                cbzh1.c(0x49D);
                __monitor_exit(object0);
            }
            catch(Throwable throwable7) {
                goto label_410;
            }
            cbzh1.c(1190);
            ccck1.run();
            synchronized(ccco.b) {
                this.d(cccn0, false);
            }
            return;
        label_410:
            int v18 = 0;
            goto label_418;
            try {
            label_412:
                this.g(cccn0, grhj0, v14, false);
                cbzh1.c(0x49F);
                __monitor_exit(object0);
                goto label_431;
            }
            catch(Throwable throwable7) {
                v18 = 1;
            }
            while(true) {
            label_418:
                __monitor_exit(object0);
                break;
            }
            try {
                throw throwable7;
            }
            catch(RuntimeException runtimeException0) {
                v19 = v18;
                runnable0 = ccck1;
                goto label_462;
            }
            catch(Throwable throwable0) {
                v19 = v18;
                runnable0 = ccck1;
                goto label_470;
            }
        label_431:
            cbzh1.c(1190);
            ccck1.run();
            return;
            try {
            label_434:
                __monitor_exit(object0);
            }
            catch(Throwable throwable1) {
            label_437:
                cbzh1 = cbzh0;
                while(true) {
                    __monitor_exit(object0);
                    break;
                }
                try {
                    throw throwable1;
                }
                catch(RuntimeException runtimeException0) {
                }
                catch(Throwable throwable0) {
                    goto label_468;
                }
                goto label_460;
            }
            cbzh0.c(1190);
            synchronized(object0) {
                this.d(cccn0, false);
            }
            __monitor_exit(object0);
            return;
            try {
            label_456:
                ccco.a.i("Training conditions not satisfied (before starting training)!");
                goto label_481;
            }
            catch(RuntimeException runtimeException0) {
                goto label_459;
            }
            catch(Throwable throwable0) {
                goto label_467;
            }
        }
        catch(RuntimeException runtimeException0) {
        label_459:
            cbzh1 = cbzh0;
        label_460:
            runnable0 = null;
        label_461:
            v19 = 0;
            try {
            label_462:
                cbzh1.c(1180);
                throw runtimeException0;
            }
            catch(Throwable throwable0) {
                goto label_470;
            }
        }
        catch(Throwable throwable0) {
        label_467:
            cbzh1 = cbzh0;
        }
    label_468:
        runnable0 = null;
    label_469:
        v19 = 0;
    label_470:
        cbzh1.c(1190);
        if(runnable0 != null) {
            runnable0.run();
        }
        if(v19 == 0) {
            synchronized(ccco.b) {
                this.d(cccn0, false);
            }
        }
        throw throwable0;
    label_481:
        cbzh0.c(1190);
        synchronized(ccco.b) {
            this.d(cccn0, false);
        }
    }

    public final void d(cccn cccn0, boolean z) {
        this.g(cccn0, null, 1, z);
    }

    public final boolean e(boolean z, String s, fnaj fnaj0) {
        Set set0 = z ? this.k.a(fnaj0, s) : this.k.b(fnaj0, s);
        for(Object object0: set0) {
            switch(((fnat)object0).ordinal()) {
                case 0: {
                    this.f(0x49A);
                    break;
                }
                case 1: {
                    this.f(0x49B);
                    break;
                }
                case 2: {
                    this.f(0x499);
                    break;
                }
                case 3: {
                    this.f(0x461);
                }
            }
        }
        return set0.isEmpty();
    }

    public final void f(int v) {
        synchronized(ccco.b) {
            cccn cccn0 = this.d;
            if(cccn0 == null) {
                this.i.c(v);
            }
            else {
                cccn0.e.c(v);
            }
        }
    }

    private final void g(cccn cccn0, grhj grhj0, int v, boolean z) {
        if(this.d != cccn0) {
            return;
        }
        this.d = null;
        if(grhj0 == null) {
            ccco.a.i("Cancelling: " + cccn0.h + " - " + z);
            ccce ccce0 = cccn0.h;
            if(ccce0 != null) {
                try {
                    Parcel parcel0 = ccce0.jo();
                    parcel0.writeLong(cccn0.b);
                    ccce0.jq(3, parcel0);
                }
                catch(RemoteException unused_ex) {
                }
            }
            if(z) {
                cccn0.f.cancel(true);
            }
        }
        ServiceConnection serviceConnection0 = cccn0.g;
        if(serviceConnection0 != null) {
            try {
                this.c.unbindService(serviceConnection0);
            }
            catch(IllegalArgumentException unused_ex) {
                this.f(0x45B);
            }
        }
        String s = cccn0.c.f;
        cccq cccq0 = ccco.a(cccn0.c);
        gmbu.s(this.h.j(cccn0.a, s, cccq0, grhj0, v));
        ((gmcu)cccn0.d).q(Integer.valueOf(0));
    }
}

