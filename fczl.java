import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import j..util.Objects;
import java.util.List;
import jeb.synthetic.TWR;

final class fczl extends fdja {
    final fczm a;
    private volatile int b;

    public fczl(fczm fczm0) {
        Objects.requireNonNull(fczm0);
        this.a = fczm0;
        super();
        this.b = -1;
    }

    @Override  // fdjb
    public final void a(ChannelEventParcelable channelEventParcelable0) {
        this.r(new fczk(this, channelEventParcelable0), "onChannelEvent", channelEventParcelable0);
    }

    @Override  // fdjb
    public final void c(CapabilityInfoParcelable capabilityInfoParcelable0) {
        this.r(new fczh(this, capabilityInfoParcelable0), "onConnectedCapabilityChanged", capabilityInfoParcelable0);
    }

    @Override  // fdjb
    public final void d(List list0) {
        this.r(new fczg(this), "onConnectedNodes", list0);
    }

    @Override  // fdjb
    public final void e(ConnectionStateEventParcelable connectionStateEventParcelable0) {
    }

    @Override  // fdjb
    public final void f(ConsentResponse consentResponse0) {
    }

    @Override  // fdjb
    public final void g(DataHolder dataHolder0) {
        fczc fczc0 = new fczc(this, dataHolder0);
        try {
            if(!this.r(fczc0, "onDataItemChanged", a.g(dataHolder0.i, String.valueOf(dataHolder0), ", rows="))) {
                goto label_6;
            }
            return;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(dataHolder0, throwable0);
            throw throwable0;
        }
    label_6:
        dataHolder0.close();
    }

    @Override  // fdjb
    public final void h(AmsEntityUpdateParcelable amsEntityUpdateParcelable0) {
        this.r(new fczj(this), "onEntityUpdate", amsEntityUpdateParcelable0);
    }

    @Override  // fdjb
    public final void i(MessageEventParcelable messageEventParcelable0) {
        this.r(new fczd(this, messageEventParcelable0), "onMessageReceived", messageEventParcelable0);
    }

    @Override  // fdjb
    public final void j(NodeMigratedEventParcelable nodeMigratedEventParcelable0) {
        fczb fczb0 = new fczb(nodeMigratedEventParcelable0);
        DataHolder dataHolder0 = nodeMigratedEventParcelable0.b;
        if(!this.r(fczb0, "onNodeMigrated", "DataHolder[rows=" + dataHolder0.i + "]")) {
            dataHolder0.close();
        }
    }

    @Override  // fdjb
    public final void k(AncsNotificationParcelable ancsNotificationParcelable0) {
        this.r(new fczi(this), "onNotificationReceived", ancsNotificationParcelable0);
    }

    @Override  // fdjb
    public final void l(NodeParcelable nodeParcelable0) {
        this.r(new fcze(this, nodeParcelable0), "onPeerConnected", nodeParcelable0);
    }

    @Override  // fdjb
    public final void m(NodeParcelable nodeParcelable0) {
        this.r(new fczf(this, nodeParcelable0), "onPeerDisconnected", nodeParcelable0);
    }

    @Override  // fdjb
    public final void n(MessageEventParcelable messageEventParcelable0, fdiv fdiv0) {
        this.r(new fcyz(this, messageEventParcelable0, fdiv0), "onRequestReceived", messageEventParcelable0);
    }

    @Override  // fdjb
    public final void o(RestoreCompletedEventParcelable restoreCompletedEventParcelable0) {
    }

    public static final void p(fdiv fdiv0, boolean z, byte[] arr_b) {
        try {
            fdiv0.a(z, arr_b);
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableLS", "Failed to send a response back", remoteException0);
        }
    }

    public static final void q(fdiv fdiv0) {
        fczl.p(fdiv0, false, null);
    }

    private final boolean r(Runnable runnable0, String s, Object object0) {
        if(Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", s, this.a.n.toString(), object0));
        }
        int v = Binder.getCallingUid();
        if(v != this.b) {
            fdmu.a(this.a);
            if(bbqw.a(this.a, v)) {
                this.b = v;
                goto label_10;
            }
            Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + v);
            return false;
        }
    label_10:
        fczm fczm0 = this.a;
        synchronized(fczm0.q) {
            if(fczm0.r) {
                return false;
            }
            fczm0.o.post(runnable0);
        }
        return true;
    }
}

