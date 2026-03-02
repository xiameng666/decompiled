import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.ConnectionOptions;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParamsV3;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class czji implements azys {
    public final czjq a;
    public final byte[] b;
    public final cuwd c;
    public final azyf d;
    public final ConnectionOptions e;

    public czji(czjq czjq0, byte[] arr_b, cuwd cuwd0, azyf azyf0, ConnectionOptions connectionOptions0) {
        this.a = czjq0;
        this.b = arr_b;
        this.c = cuwd0;
        this.d = azyf0;
        this.e = connectionOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        boolean z = true;
        czjo czjo0 = new czjo(((evqp)object1));
        czae czae0 = new czae(this.d);
        ((czbf)object0).g.add(czae0);
        SendConnectionRequestParamsV3 sendConnectionRequestParamsV30 = new SendConnectionRequestParamsV3();
        sendConnectionRequestParamsV30.a = new czbc(czjo0);
        sendConnectionRequestParamsV30.i = this.a.b;
        sendConnectionRequestParamsV30.b = czae0;
        sendConnectionRequestParamsV30.c = this.e;
        cuwd cuwd0 = this.c;
        sendConnectionRequestParamsV30.e = cuwd0.a();
        cuvq cuvq0 = new cuvq();
        cuvq0.a = this.b;
        sendConnectionRequestParamsV30.d = cuvq0.a();
        int v = cuwd0.a();
        sendConnectionRequestParamsV30.e = v;
        if(v == 2) {
            sendConnectionRequestParamsV30.f = (PresenceDevice)cuwd0;
        }
        else {
            switch(v) {
                case 1: {
                    sendConnectionRequestParamsV30.g = (ConnectionsDevice)cuwd0;
                    break;
                }
                case 3: {
                    sendConnectionRequestParamsV30.h = (DctDevice)cuwd0;
                }
            }
            if(v == 0) {
                z = false;
            }
            batl.b(z);
        }
        ((czft)((czbf)object0).H()).o(sendConnectionRequestParamsV30);
    }
}

