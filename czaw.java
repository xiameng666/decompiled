import android.content.Context;
import android.util.Log;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import java.util.Map.Entry;
import java.util.Map;

final class czaw extends czfv implements czaq {
    private final Context a;
    private final azyf b;
    private final Map c;
    private final czhf d;

    public czaw(Context context0, azyf azyf0, czhf czhf0) {
        this.c = new bxd();
        this.a = context0;
        this.b = azyf0;
        this.d = czhf0;
    }

    @Override  // czfw
    public final void a(OnPayloadReceivedParams onPayloadReceivedParams0) {
        synchronized(this) {
            cuwu cuwu0 = czho.b(this.a, onPayloadReceivedParams0.b);
            if(cuwu0 == null) {
                Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", ((long)onPayloadReceivedParams0.b.a)));
                return;
            }
            long v1 = onPayloadReceivedParams0.b.a;
            czav czav0 = new czav(onPayloadReceivedParams0.a, v1);
            PayloadTransferUpdate payloadTransferUpdate0 = new PayloadTransferUpdate();
            payloadTransferUpdate0.a = v1;
            this.c.put(czav0, payloadTransferUpdate0);
            czas czas0 = new czas(this, onPayloadReceivedParams0, cuwu0);
            this.b.b(czas0);
        }
    }

    @Override  // czfw
    public final void c(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams0) {
        synchronized(this) {
            PayloadTransferUpdate payloadTransferUpdate0 = onPayloadTransferUpdateParams0.b;
            if(payloadTransferUpdate0.b == 3) {
                czav czav0 = new czav(onPayloadTransferUpdateParams0.a, payloadTransferUpdate0.a);
                this.c.put(czav0, payloadTransferUpdate0);
            }
            else {
                czav czav1 = new czav(onPayloadTransferUpdateParams0.a, payloadTransferUpdate0.a);
                this.c.remove(czav1);
                czhf czhf0 = this.d;
                if(czhf0 != null) {
                    czhf0.a(onPayloadTransferUpdateParams0.b.a);
                }
            }
            czat czat0 = new czat(this, onPayloadTransferUpdateParams0);
            this.b.b(czat0);
        }
    }

    @Override  // czaq
    public final void i() {
        synchronized(this) {
            Map map0 = this.c;
            for(Object object0: map0.entrySet()) {
                czau czau0 = new czau(this, ((czav)((Map.Entry)object0).getKey()).a, ((PayloadTransferUpdate)((Map.Entry)object0).getValue()));
                this.b.b(czau0);
            }
            map0.clear();
        }
    }
}

