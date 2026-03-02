import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqxw extends clil {
    final eqxx a;

    public eqxw(eqxx eqxx0) {
        Objects.requireNonNull(eqxx0);
        this.a = eqxx0;
        super("SmartDevice");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        gaks gaks0;
        if(iBinder0 == null) {
            gaks0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.setupwizard.util.IBackupConnectionService");
            gaks0 = (iInterface0 instanceof gaks) ? ((gaks)iInterface0) : new gaks(iBinder0);
        }
        if(gaks0 == null) {
            eqxx.a.m("backupConnectionService is null.", new Object[0]);
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("request_second_connection", true);
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.al(jSONObject0.toString().getBytes(StandardCharsets.UTF_8));
            byte[] arr_b = messagePayload0.ax();
            Parcel parcel0 = gaks0.jo();
            parcel0.writeByteArray(arr_b);
            gaks0.jq(4, parcel0);
            this.a.d.o(gjjm.I);
        }
        catch(RemoteException | JSONException exception0) {
            eqxx.a.l(exception0);
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
    }
}

