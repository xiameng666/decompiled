import android.content.IntentFilter;
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
import java.util.List;

public final class fdmt extends fdja {
    public azyf a;
    public azyf b;
    public azyf c;
    public azyf d;
    public azyf e;
    public final IntentFilter[] f;

    public fdmt(IntentFilter[] arr_intentFilter) {
        this.f = arr_intentFilter;
    }

    @Override  // fdjb
    public final void a(ChannelEventParcelable channelEventParcelable0) {
    }

    @Override  // fdjb
    public final void c(CapabilityInfoParcelable capabilityInfoParcelable0) {
        azyf azyf0 = this.d;
        if(azyf0 != null) {
            azyf0.b(new fdmn(capabilityInfoParcelable0));
        }
    }

    @Override  // fdjb
    public final void d(List list0) {
    }

    @Override  // fdjb
    public final void e(ConnectionStateEventParcelable connectionStateEventParcelable0) {
        azyf azyf0 = this.e;
        if(azyf0 != null) {
            azyf0.b(new fdmo(connectionStateEventParcelable0));
        }
    }

    @Override  // fdjb
    public final void f(ConsentResponse consentResponse0) {
    }

    @Override  // fdjb
    public final void g(DataHolder dataHolder0) {
        azyf azyf0 = this.a;
        if(azyf0 != null) {
            azyf0.b(new fdmp(dataHolder0));
            return;
        }
        dataHolder0.close();
    }

    @Override  // fdjb
    public final void h(AmsEntityUpdateParcelable amsEntityUpdateParcelable0) {
    }

    @Override  // fdjb
    public final void i(MessageEventParcelable messageEventParcelable0) {
        azyf azyf0 = this.b;
        if(azyf0 != null) {
            azyf0.b(new fdmq(messageEventParcelable0));
        }
    }

    @Override  // fdjb
    public final void j(NodeMigratedEventParcelable nodeMigratedEventParcelable0) {
        nodeMigratedEventParcelable0.b.close();
    }

    @Override  // fdjb
    public final void k(AncsNotificationParcelable ancsNotificationParcelable0) {
    }

    @Override  // fdjb
    public final void l(NodeParcelable nodeParcelable0) {
    }

    @Override  // fdjb
    public final void m(NodeParcelable nodeParcelable0) {
    }

    @Override  // fdjb
    public final void n(MessageEventParcelable messageEventParcelable0, fdiv fdiv0) {
        azyf azyf0 = this.c;
        if(azyf0 != null) {
            azyf0.b(new fdms(messageEventParcelable0, fdiv0));
        }
    }

    @Override  // fdjb
    public final void o(RestoreCompletedEventParcelable restoreCompletedEventParcelable0) {
    }

    public final void p() {
        fdmt.s(this.a);
        this.a = null;
        fdmt.s(this.b);
        this.b = null;
        fdmt.s(this.c);
        this.c = null;
        fdmt.s(this.d);
        this.d = null;
        fdmt.s(this.e);
        this.e = null;
    }

    public static void q(fdiv fdiv0) {
        fdmt.r(fdiv0, false, null);
    }

    public static void r(fdiv fdiv0, boolean z, byte[] arr_b) {
        try {
            fdiv0.a(z, arr_b);
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableListenerStub", "Failed to send a response back", remoteException0);
        }
    }

    private static void s(azyf azyf0) {
        if(azyf0 != null) {
            azyf0.a();
        }
    }
}

