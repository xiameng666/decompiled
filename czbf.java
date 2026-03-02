import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import com.google.android.gms.nearby.internal.connection.StopAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StopDiscoveryParams;
import com.google.android.gms.nearby.presence.PresenceDevice;
import java.io.IOException;
import java.util.Set;

public final class czbf extends bark {
    public long a;
    public String b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    public czhf h;
    private final String i;
    private final Set j;

    protected czbf(Context context0, Looper looper0, baqv baqv0, cuvt cuvt0, aztu aztu0, aztv aztv0) {
        super(context0, looper0, 54, baqv0, aztu0, aztv0);
        this.c = new bxf();
        this.d = new bxf();
        this.e = new bxf();
        this.j = new bxf();
        this.f = new bxf();
        this.g = new bxf();
        this.i = cuvt0 == null ? null : cuvt0.a;
        czho.d(context0.getCacheDir());
    }

    public czbf(Context context0, Looper looper0, baqv baqv0, cvxl cvxl0, azvy azvy0, azyj azyj0) {
        super(context0, looper0, 54, baqv0, azvy0, azyj0);
        this.c = new bxf();
        this.d = new bxf();
        this.e = new bxf();
        this.j = new bxf();
        this.f = new bxf();
        this.g = new bxf();
        this.i = cvxl0 == null ? null : cvxl0.a;
        czho.d(context0.getCacheDir());
    }

    @Override  // baqp, azsz
    public final boolean C() {
        return cumi.i(this.r);
    }

    @Override  // baqp
    protected final void O(IInterface iInterface0) {
        super.O(((czft)iInterface0));
        this.h = new czhf();
    }

    @Override  // baqp
    public final void P(int v) {
        if(v == 1) {
            this.aa();
            v = 1;
        }
        super.P(v);
    }

    public final void V(azvd azvd0, cuwd cuwd0, azyf azyf0) {
        boolean z = true;
        czbb czbb0 = new czbb(this.r, azyf0, this.h);
        this.j.add(czbb0);
        AcceptConnectionRequestParams acceptConnectionRequestParams0 = new AcceptConnectionRequestParams();
        acceptConnectionRequestParams0.c = cuwd0.e();
        acceptConnectionRequestParams0.a = new czbc(azvd0);
        acceptConnectionRequestParams0.e = czbb0;
        acceptConnectionRequestParams0.f = cuwd0.a();
        if(cuwd0.a() == 2) {
            acceptConnectionRequestParams0.f = cuwd0.a();
            acceptConnectionRequestParams0.g = (PresenceDevice)cuwd0;
        }
        else {
            switch(cuwd0.a()) {
                case 1: {
                    acceptConnectionRequestParams0.f = cuwd0.a();
                    acceptConnectionRequestParams0.h = (ConnectionsDevice)cuwd0;
                    break;
                }
                case 3: {
                    acceptConnectionRequestParams0.f = cuwd0.a();
                    acceptConnectionRequestParams0.i = (DctDevice)cuwd0;
                }
            }
            if(acceptConnectionRequestParams0.f == 0) {
                z = false;
            }
            batl.b(z);
        }
        ((czft)this.H()).d(acceptConnectionRequestParams0);
    }

    public final void W(azvd azvd0, String s, byte[] arr_b, cuwd cuwd0, azyf azyf0, ConnectionOptions connectionOptions0) {
        boolean z = true;
        cyzw cyzw0 = new cyzw(azyf0);
        this.g.add(cyzw0);
        SendConnectionRequestParams sendConnectionRequestParams0 = new SendConnectionRequestParams();
        sendConnectionRequestParams0.a = new czbc(azvd0);
        sendConnectionRequestParams0.o = s;
        sendConnectionRequestParams0.h = arr_b;
        sendConnectionRequestParams0.e = cuwd0.e();
        sendConnectionRequestParams0.g = cyzw0;
        sendConnectionRequestParams0.i = connectionOptions0;
        sendConnectionRequestParams0.j = cuwd0.a();
        if(cuwd0.a() == 2) {
            sendConnectionRequestParams0.j = cuwd0.a();
            sendConnectionRequestParams0.k = (PresenceDevice)cuwd0;
        }
        else {
            switch(cuwd0.a()) {
                case 1: {
                    sendConnectionRequestParams0.j = cuwd0.a();
                    sendConnectionRequestParams0.l = (ConnectionsDevice)cuwd0;
                    break;
                }
                case 3: {
                    sendConnectionRequestParams0.j = cuwd0.a();
                    sendConnectionRequestParams0.m = (DctDevice)cuwd0;
                }
            }
            if(sendConnectionRequestParams0.j == 0) {
                z = false;
            }
            batl.b(z);
        }
        ((czft)this.H()).n(sendConnectionRequestParams0);
    }

    public final void X() {
        ((czft)this.H()).A(new StopAdvertisingParams());
    }

    public final void Y() {
        ((czft)this.H()).D(new StopDiscoveryParams());
    }

    public final void Z(azvd azvd0, cuwd cuwd0, cuwu cuwu0) {
        Pair pair0;
        try {
            pair0 = czho.a(cuwu0);
        }
        catch(IOException iOException0) {
            Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", iOException0);
            azvd0.b(czbf.s(8013));
            return;
        }
        boolean z = true;
        SendPayloadParams sendPayloadParams0 = new SendPayloadParams();
        sendPayloadParams0.a = new czbc(azvd0);
        sendPayloadParams0.b = new String[]{cuwd0.e()};
        sendPayloadParams0.c = (ParcelablePayload)pair0.first;
        sendPayloadParams0.e = cuwd0.a();
        if(cuwd0.a() == 2) {
            sendPayloadParams0.e = cuwd0.a();
            sendPayloadParams0.f = (PresenceDevice)cuwd0;
        }
        else {
            switch(cuwd0.a()) {
                case 1: {
                    sendPayloadParams0.e = cuwd0.a();
                    sendPayloadParams0.g = (ConnectionsDevice)cuwd0;
                    break;
                }
                case 3: {
                    sendPayloadParams0.e = cuwd0.a();
                    sendPayloadParams0.h = (DctDevice)cuwd0;
                }
            }
            if(sendPayloadParams0.e == 0) {
                z = false;
            }
            batl.b(z);
        }
        ((czft)this.H()).p(sendPayloadParams0);
        if(((gfsx)pair0.second).i()) {
            Pair pair1 = (Pair)((gfsx)pair0.second).d();
            czhf czhf0 = this.h;
            if(czhf0 != null) {
                batl.s(cuwu0.m);
                czhf0.b(cuwu0.m.b(), new ParcelFileDescriptor.AutoCloseOutputStream(((ParcelFileDescriptor)pair1.first)), new ParcelFileDescriptor.AutoCloseOutputStream(((ParcelFileDescriptor)pair1.second)), ((ParcelablePayload)pair0.first), cuwu0.i);
            }
        }
    }

    @Override  // baqp, azsz
    public final int a() {
        return 12451000;
    }

    private final void aa() {
        Set set0 = this.c;
        bxe bxe0 = new bxe(((bxf)set0));
        while(bxe0.hasNext()) {
            Object object0 = bxe0.next();
            ((czap)object0).f();
        }
        Set set1 = this.d;
        bxe bxe1 = new bxe(((bxf)set1));
        while(bxe1.hasNext()) {
            Object object1 = bxe1.next();
            ((czaj)object1).f();
        }
        Set set2 = this.e;
        bxe bxe2 = new bxe(((bxf)set2));
        while(bxe2.hasNext()) {
            Object object2 = bxe2.next();
            ((czaq)object2).i();
        }
        Set set3 = this.j;
        bxe bxe3 = new bxe(((bxf)set3));
        while(bxe3.hasNext()) {
            Object object3 = bxe3.next();
            ((czaq)object3).i();
        }
        Set set4 = this.f;
        bxe bxe4 = new bxe(((bxf)set4));
        while(bxe4.hasNext()) {
            Object object4 = bxe4.next();
            ((czaq)object4).i();
        }
        Set set5 = this.g;
        bxe bxe5 = new bxe(((bxf)set5));
        while(bxe5.hasNext()) {
            Object object5 = bxe5.next();
            ((czaq)object5).i();
        }
        set0.clear();
        set1.clear();
        set2.clear();
        set3.clear();
        set4.clear();
        set5.clear();
        czhf czhf0 = this.h;
        if(czhf0 != null) {
            czhf0.c();
            this.h = null;
        }
    }

    @Override  // baqp
    protected final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("clientId", this.a);
        String s = this.b;
        if(s != null) {
            bundle0.putString("downloadsDirectory", s);
        }
        String s1 = this.i;
        if(s1 != null) {
            bundle0.putString("zeroPartyIdentifier", s1);
        }
        return bundle0;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return (iInterface0 instanceof czft) ? ((czft)iInterface0) : new czfr(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }

    @Override  // baqp
    public final Feature[] h() {
        return new Feature[]{cumh.f, cumh.z, cumh.D, cumh.B, cumh.E, cumh.A, cumh.g, cumh.C, cumh.h, cumh.F};
    }

    @Override  // baqp, azsz
    public final void m() {
        if(this.A()) {
            try {
                ((czft)this.H()).g(new ClientDisconnectingParams());
            }
            catch(RemoteException remoteException0) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", remoteException0);
            }
        }
        this.aa();
        super.m();
    }

    public static int r(int v) {
        return v == 1 || v == 2 || (v == 3 || v == 4) || v == 5 ? 1 : 0;
    }

    public static Status s(int v) {
        return new Status(v, cuvu.a(v));
    }

    public static czbf t(Context context0, Looper looper0, baqv baqv0, cuvt cuvt0, aztu aztu0, aztv aztv0) {
        czbf czbf0 = new czbf(context0, looper0, baqv0, cuvt0, aztu0, aztv0);
        czbf0.a = (long)czbf0.hashCode();
        return czbf0;
    }
}

