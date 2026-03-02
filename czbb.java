import android.content.Context;
import android.util.Log;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.presence.PresenceDevice;
import java.util.Map.Entry;
import java.util.Map;

final class czbb extends czfv implements czaq {
    private final Context a;
    private final azyf b;
    private final Map c;
    private final czhf d;

    public czbb(Context context0, azyf azyf0, czhf czhf0) {
        this.c = new bxd();
        this.a = context0;
        this.b = azyf0;
        this.d = czhf0;
    }

    @Override  // czfw
    public final void a(OnPayloadReceivedParams onPayloadReceivedParams0) {
        PresenceDevice presenceDevice0;
        synchronized(this) {
            cuwu cuwu0 = czho.b(this.a, onPayloadReceivedParams0.b);
            if(cuwu0 == null) {
                Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", ((long)onPayloadReceivedParams0.b.a)));
                return;
            }
            if(onPayloadReceivedParams0.d == 0) {
                czgx czgx0 = new czgx(onPayloadReceivedParams0);
                czgx0.b(1);
                cuvq cuvq0 = new cuvq();
                cuvq0.d(onPayloadReceivedParams0.a);
                czgx0.a(cuvq0.a());
                onPayloadReceivedParams0 = czgx0.a;
            }
            int v1 = onPayloadReceivedParams0.d;
            if(v1 == 2) {
                presenceDevice0 = onPayloadReceivedParams0.e;
                batl.s(presenceDevice0);
            }
            else if(v1 == 1) {
                presenceDevice0 = onPayloadReceivedParams0.f;
                batl.s(presenceDevice0);
            }
            else if(v1 == 3) {
                presenceDevice0 = onPayloadReceivedParams0.g;
                batl.s(presenceDevice0);
            }
            else {
                presenceDevice0 = null;
            }
            batl.s(presenceDevice0);
            long v2 = onPayloadReceivedParams0.b.a;
            czba czba0 = new czba(presenceDevice0, v2);
            PayloadTransferUpdate payloadTransferUpdate0 = new PayloadTransferUpdate();
            payloadTransferUpdate0.a = v2;
            this.c.put(czba0, payloadTransferUpdate0);
            czax czax0 = new czax(this, presenceDevice0, cuwu0);
            this.b.b(czax0);
        }
    }

    @Override  // czfw
    public final void c(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams0) {
        PresenceDevice presenceDevice0;
        synchronized(this) {
            if(onPayloadTransferUpdateParams0.c == 0) {
                OnPayloadTransferUpdateParams onPayloadTransferUpdateParams1 = new OnPayloadTransferUpdateParams();
                onPayloadTransferUpdateParams1.a = onPayloadTransferUpdateParams0.a;
                onPayloadTransferUpdateParams1.b = onPayloadTransferUpdateParams0.b;
                onPayloadTransferUpdateParams1.c = 0;
                onPayloadTransferUpdateParams1.d = onPayloadTransferUpdateParams0.d;
                onPayloadTransferUpdateParams1.e = onPayloadTransferUpdateParams0.e;
                onPayloadTransferUpdateParams1.f = onPayloadTransferUpdateParams0.f;
                onPayloadTransferUpdateParams1.c = 1;
                cuvq cuvq0 = new cuvq();
                cuvq0.d(onPayloadTransferUpdateParams0.a);
                onPayloadTransferUpdateParams1.e = cuvq0.a();
                onPayloadTransferUpdateParams0 = onPayloadTransferUpdateParams1;
            }
            int v1 = onPayloadTransferUpdateParams0.c;
            if(v1 == 2) {
                presenceDevice0 = onPayloadTransferUpdateParams0.d;
                batl.s(presenceDevice0);
            }
            else if(v1 == 1) {
                presenceDevice0 = onPayloadTransferUpdateParams0.e;
                batl.s(presenceDevice0);
            }
            else if(v1 == 3) {
                presenceDevice0 = onPayloadTransferUpdateParams0.f;
                batl.s(presenceDevice0);
            }
            else {
                presenceDevice0 = null;
            }
            batl.s(presenceDevice0);
            PayloadTransferUpdate payloadTransferUpdate0 = onPayloadTransferUpdateParams0.b;
            if(payloadTransferUpdate0.b == 3) {
                czba czba0 = new czba(presenceDevice0, payloadTransferUpdate0.a);
                this.c.put(czba0, payloadTransferUpdate0);
            }
            else {
                czba czba1 = new czba(presenceDevice0, payloadTransferUpdate0.a);
                this.c.remove(czba1);
                czhf czhf0 = this.d;
                if(czhf0 != null) {
                    czhf0.a(onPayloadTransferUpdateParams0.b.a);
                }
            }
            czay czay0 = new czay(this, presenceDevice0, onPayloadTransferUpdateParams0);
            this.b.b(czay0);
        }
    }

    @Override  // czaq
    public final void i() {
        synchronized(this) {
            Map map0 = this.c;
            for(Object object0: map0.entrySet()) {
                czaz czaz0 = new czaz(this, ((czba)((Map.Entry)object0).getKey()).a, ((PayloadTransferUpdate)((Map.Entry)object0).getValue()));
                this.b.b(czaz0);
            }
            map0.clear();
        }
    }
}

