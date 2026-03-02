import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;

public final class fffp extends clht {
    final esaa a;
    public volatile boolean c;
    public final ffgm d;

    public fffp(ffgm ffgm0, Looper looper0, esaa esaa0) {
        Objects.requireNonNull(ffgm0);
        this.d = ffgm0;
        super(looper0);
        this.c = false;
        this.a = esaa0;
    }

    public final Message b(fffu fffu0, int v) {
        Message message0 = this.obtainMessage(v);
        message0.obj = fffu0;
        return message0;
    }

    private final void c(fffu fffu0, boolean z) {
        Intent intent0;
        int v = 1;
        if(fffu0.c() == null) {
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", "processEvents: skipping empty service queue: " + fffu0);
            }
            if(z) {
                fffu0.e(this.d);
                return;
            }
            this.sendMessageDelayed(this.b(fffu0, 4), hzzi.h());
            return;
        }
        if(fffu0.h != null) {
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", "ServiceRecord.flush: ready: " + fffu0);
            }
            fdjb fdjb0 = fffu0.h;
            ffgn ffgn0 = fffu0.c();
            if(fdjb0 == null && ffgn0 != null) {
                Log.e("WearableService", "No service bound when flushing " + fffu0);
                fffu0.e(this.d);
                this.sendMessageDelayed(this.b(fffu0, 1), hzzi.a.i().Q());
                return;
            }
            while(ffgn0 != null) {
                try {
                    this.d.E.a(fffu0.c.b);
                    ffgn0.b(fffu0, fdjb0);
                }
                catch(RemoteException remoteException0) {
                    if(Log.isLoggable("WearableService", 3)) {
                        Log.d("WearableService", "publishEvent: Failure from remote exception: " + ffgn0.toString(), remoteException0);
                    }
                    fffu0.e(this.d);
                    this.sendMessageDelayed(this.b(fffu0, 1), hzzi.a.i().Q());
                    return;
                }
                synchronized(fffu0.f) {
                    ffgn ffgn1 = (ffgn)fffu0.f.remove();
                }
                if(Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", a.ad(fffu0, ffgn0, "ServiceRecord.flush: published: ", " "));
                }
                ffgn0 = fffu0.c();
            }
            this.sendMessageDelayed(this.b(fffu0, 4), hzzi.h());
            return;
        }
        if(!fffu0.j) {
            ffgm ffgm0 = this.d;
            fdpl fdpl0 = fffu0.c;
            if(ffgm0.b(fdpl0) == null) {
                if(!Log.isLoggable("WearableService", 3)) {
                    goto label_91;
                }
                Log.d("WearableService", "bind: unrecognized app in package record.");
                goto label_91;
            }
            try {
                ffft ffft0 = fffu0.g;
                int v2 = ffft0.e;
                if(v2 < 33) {
                    intent0 = fffu0.d;
                }
                else if(hzue.a.b().a()) {
                    intent0 = fffu0.i;
                    if(intent0 == null) {
                        intent0 = fffu0.d;
                    }
                }
                else {
                    intent0 = fffu0.d;
                }
                ffmn.e("WearableService", "bindService: binding to: %s", new Object[]{intent0});
                String s = fdpl0.b;
                if(v2 >= 33 && hzue.a.b().b()) {
                    ffft0.f = bbna.e(ffgm0, s);
                    if(ffft0.f && fffu0.i == null) {
                        if(Log.isLoggable("WearableService", 3)) {
                            Log.d("WearableService", "bindService: not binding to stopped application: " + ffmr.b(s, ffft0.d));
                        }
                        fffu0.j = false;
                        goto label_88;
                    }
                }
                else if(!ffft0.f && bbna.e(ffgm0, s)) {
                    if(Log.isLoggable("WearableService", 3)) {
                        Log.d("WearableService", "bindService (legacy): not binding to stopped application: " + ffmr.b(s, ffft0.d));
                    }
                    ffft0.f = true;
                    fffu0.j = false;
                    goto label_88;
                }
                if(!ffgp.k()) {
                    v = 0x100001;
                }
                boolean z1 = ffgm0.bindService(intent0, fffu0, v);
                fffu0.j = z1;
                if(z1) {
                    ffft0.f = false;
                    String s1 = fffu0.e.getPackageName();
                    fdny.b(fdnw.d, s1);
                }
            }
            catch(SecurityException securityException0) {
                Log.w("WearableService", "bind: Permission denied connecting to " + fffu0, securityException0);
                goto label_88;
            }
            if(!fffu0.j) {
                goto label_88;
            }
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "bind: started: " + fffu0);
                goto label_99;
            label_88:
                if(Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", "bind: bind failed, app no longer exists: " + fffu0);
                }
                fffu0.e(this.d);
            label_91:
                synchronized(fffu0.f) {
                    fffu0.f.clear();
                }
                fffu0.e(this.d);
                return;
            }
        }
    label_99:
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "processEvents: waiting for service to connect: " + fffu0);
        }
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        fdjb fdjb0;
        try {
            esaa esaa0 = this.a;
            if(esaa0 != null) {
                esaa0.b();
            }
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "handleMessage: " + message0);
            }
            if(!this.c) {
                fffu fffu0 = (fffu)message0.obj;
                this.removeMessages(4, fffu0);
                switch(message0.what) {
                    case 1: {
                        this.removeMessages(1, fffu0);
                        this.c(fffu0, false);
                        break;
                    }
                    case 2: {
                        IBinder iBinder0 = message0.getData().getBinder("binder");
                        if(iBinder0 == null) {
                            fdjb0 = null;
                        }
                        else {
                            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                            fdjb0 = (iInterface0 instanceof fdjb) ? ((fdjb)iInterface0) : new fdiz(iBinder0);
                        }
                        if(fffu0.h != null && iBinder0 != fffu0.h.asBinder()) {
                            Log.w("WearableService", "Service already exists for: " + fffu0.toString());
                        }
                        fffu0.h = fdjb0;
                        this.c(fffu0, false);
                        break;
                    }
                    default: {
                        switch(message0.what) {
                            case 3: {
                                if(Log.isLoggable("WearableService", 3)) {
                                    Log.d("WearableService", "handleMessage: disconnected " + fffu0);
                                }
                                if(fffu0.c() != null) {
                                    Log.w("WearableService", "Service disconnected before delivering all events: " + fffu0);
                                }
                                fffu0.e(this.d);
                                break;
                            }
                            case 4: {
                                if(Log.isLoggable("WearableService", 3)) {
                                    Log.d("WearableService", "handleMessage: unbind " + fffu0);
                                }
                                this.c(fffu0, true);
                            }
                        }
                    }
                }
            }
            else if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "handleMessage: shutdown.");
            }
        }
        catch(Throwable throwable0) {
            esaa esaa1 = this.a;
            if(esaa1 != null && esaa1.l()) {
                esaa1.g();
            }
            throw throwable0;
        }
        esaa esaa2 = this.a;
        if(esaa2 != null && esaa2.l()) {
            esaa2.g();
        }
    }
}

