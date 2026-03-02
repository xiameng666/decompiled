import android.app.PendingIntent;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class algc {
    public static final SecureChannelSubscription a(PendingIntent pendingIntent0, String s, Role role0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            RemoteDevice remoteDevice0 = (RemoteDevice)object0;
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("n", remoteDevice0.c);
                jSONObject0.put("t", remoteDevice0.h);
                jSONObject0.put("i", remoteDevice0.b);
                jSONObject0.put("a", remoteDevice0.d);
                arrayList0.add(jSONObject0.toString());
            }
            catch(JSONException unused_ex) {
            }
        }
        return new SecureChannelSubscription(pendingIntent0, role0.b, role0.c, arrayList0, s);
    }

    public static final void b(List list0, List list1) {
        list1.clear();
        list1.addAll(list0);
    }
}

