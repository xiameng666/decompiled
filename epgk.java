import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;

public final class epgk implements ibts {
    public final SignificantPlacesRequest a;
    public final epgz b;
    public final ClientIdentity c;
    public final ephb d;

    public epgk(ephb ephb0, SignificantPlacesRequest significantPlacesRequest0, epgz epgz0, ClientIdentity clientIdentity0) {
        this.d = ephb0;
        this.a = significantPlacesRequest0;
        this.b = epgz0;
        this.c = clientIdentity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "it");
        IBinder iBinder0 = this.b.asBinder();
        ibuq.e(iBinder0, "asBinder(...)");
        ibuq.f(this.a, "request");
        ibuq.f(iBinder0, "listenerKey");
        ibuq.f(this.b, "listener");
        ibuq.f(this.a, "request");
        ibuq.f(iBinder0, "listenerKey");
        ibuq.f(this.b, "listener");
        iccl.f(this.d.a.a.d);
        epow epow0 = new epow(this.d.a.a, this.c, this.a, this.b);
        this.d.a.a.s(iBinder0, epow0);
        return ibom.a;
    }
}

