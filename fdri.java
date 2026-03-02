import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import java.util.EnumMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;

public final class fdri {
    public final Handler a;
    public final ffdl b;
    public final fdrf c;
    public final fdrk d;
    public final ffew e;
    public final fdxp f;
    public final AtomicBoolean g;
    public final Runnable h;
    public final fduj i;
    private final Object j;
    private final EnumMap k;
    private final fdwi l;
    private final fffm m;

    public fdri(fdxp fdxp0, ffew ffew0, Handler handler0, ffdl ffdl0, Random random0, fdwi fdwi0, fffm fffm0) {
        this.j = new Object();
        this.k = new EnumMap(feyi.class);
        this.g = new AtomicBoolean();
        this.h = new fdrd(this);
        this.i = new fdqz(this);
        this.f = fdxp0;
        batl.s(ffew0);
        this.e = ffew0;
        this.a = handler0;
        this.b = ffdl0;
        this.c = new fdrf(ffdl0);
        this.l = fdwi0;
        this.d = new fdrk(random0);
        this.m = fffm0;
    }

    public final fdro a(feyi feyi0, fdrq fdrq0, boolean z) {
        ffep ffep0;
        fdre fdre0 = new fdre(this.c, fdrq0);
        fdrb fdrb0 = new fdrb(this, fdrq0);
        synchronized(this.j) {
            ffep0 = (ffep)this.k.get(feyi0);
            batl.m(ffep0 != null, "No callbacks set for " + feyi0);
        }
        fdrh fdrh0 = new fdrh(this, fdrq0);
        return new fdro(fdrq0, feyi0, fdre0, this.l, fdrb0, ffep0, z, this.m, fdrh0);
    }

    public final void b(Runnable runnable0) {
        if(!this.g.get()) {
            Log.w("ChannelManager", "Called methods on ChannelManager while not running");
            return;
        }
        this.a.post(runnable0);
        this.b.f();
    }

    public final void c(feyi feyi0, ffep ffep0) {
        Object object0 = this.j;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(ffep0 == null) {
            this.k.remove(feyi0);
            goto label_9;
        }
        EnumMap enumMap0 = this.k;
        if(!enumMap0.containsKey(feyi0)) {
            enumMap0.put(feyi0, ffep0);
        label_9:
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Called setCallbacks twice for same origin: " + feyi0);
    }

    public static final void d(fdiy fdiy0, int v) {
        try {
            fdiy0.h(new ChannelSendFileResponse(v));
        }
        catch(RemoteException remoteException0) {
            Log.w("ChannelManager", "Failed to set result on Channel.sendFile", remoteException0);
        }
    }

    public static final void e(fdiy fdiy0, int v) {
        try {
            fdiy0.q(new GetChannelInputStreamResponse(v, null));
        }
        catch(RemoteException remoteException0) {
            Log.w("ChannelManager", "Failed to set failure result on Channel.getInputStream", remoteException0);
        }
    }

    public static final void f(fdiy fdiy0, int v) {
        try {
            fdiy0.v(new GetChannelOutputStreamResponse(v, null));
        }
        catch(RemoteException remoteException0) {
            Log.w("ChannelManager", "Failed to set failure result on Channel.getOutputStream", remoteException0);
        }
    }

    public static final void g(fdiy fdiy0, int v) {
        try {
            fdiy0.g(new ChannelReceiveFileResponse(v));
        }
        catch(RemoteException remoteException0) {
            Log.w("ChannelManager", "Failed to set result on Channel.receiveFile", remoteException0);
        }
    }
}

