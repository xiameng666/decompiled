import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import java.io.IOException;

public final class czco implements azys {
    public final czdu a;
    public final String b;
    public final cuwu c;

    public czco(czdu czdu0, String s, cuwu cuwu0) {
        this.a = czdu0;
        this.b = s;
        this.c = cuwu0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        Pair pair0;
        czds czds0 = new czds(this.a, ((evqp)object1));
        String[] arr_s = {this.b};
        cuwu cuwu0 = this.c;
        try {
            pair0 = czho.a(cuwu0);
        }
        catch(IOException iOException0) {
            Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", iOException0);
            czds0.b(czbf.s(8013));
            return;
        }
        czft czft0 = (czft)((czbf)object0).H();
        SendPayloadParams sendPayloadParams0 = new SendPayloadParams();
        sendPayloadParams0.a = new czbc(czds0);
        sendPayloadParams0.b = arr_s;
        sendPayloadParams0.c = (ParcelablePayload)pair0.first;
        czft0.p(sendPayloadParams0);
        if(((gfsx)pair0.second).i()) {
            Pair pair1 = (Pair)((gfsx)pair0.second).d();
            czhf czhf0 = ((czbf)object0).h;
            if(czhf0 != null) {
                batl.s(cuwu0.m);
                czhf0.b(cuwu0.m.b(), new ParcelFileDescriptor.AutoCloseOutputStream(((ParcelFileDescriptor)pair1.first)), new ParcelFileDescriptor.AutoCloseOutputStream(((ParcelFileDescriptor)pair1.second)), ((ParcelablePayload)pair0.first), cuwu0.i);
            }
        }
    }
}

