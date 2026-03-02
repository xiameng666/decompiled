import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

public final class czgx {
    public final OnPayloadReceivedParams a;

    public czgx() {
        this.a = new OnPayloadReceivedParams();
    }

    public czgx(OnPayloadReceivedParams onPayloadReceivedParams0) {
        OnPayloadReceivedParams onPayloadReceivedParams1 = new OnPayloadReceivedParams();
        this.a = onPayloadReceivedParams1;
        onPayloadReceivedParams1.a = onPayloadReceivedParams0.a;
        onPayloadReceivedParams1.b = onPayloadReceivedParams0.b;
        onPayloadReceivedParams1.c = onPayloadReceivedParams0.c;
        onPayloadReceivedParams1.d = onPayloadReceivedParams0.d;
        onPayloadReceivedParams1.e = onPayloadReceivedParams0.e;
        onPayloadReceivedParams1.f = onPayloadReceivedParams0.f;
        onPayloadReceivedParams1.g = onPayloadReceivedParams0.g;
    }

    public final void a(ConnectionsDevice connectionsDevice0) {
        this.a.f = connectionsDevice0;
    }

    public final void b(int v) {
        this.a.d = v;
    }

    public final void c(ParcelablePayload parcelablePayload0) {
        this.a.b = parcelablePayload0;
    }

    public final void d(String s) {
        this.a.a = s;
    }
}

