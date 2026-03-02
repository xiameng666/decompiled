import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqxy implements erpf {
    public final eqyb a;

    public eqxy(eqyb eqyb0) {
        this.a = eqyb0;
    }

    @Override  // erpf
    public final void a(byte[] arr_b) {
        try {
            eqyb eqyb0 = this.a;
            MessagePayload messagePayload0 = eqrj.a(arr_b);
            if(messagePayload0 != null) {
                eqyb.a.d("Payload received.", new Object[0]);
                if(new JSONObject(new String(messagePayload0.r, StandardCharsets.UTF_8)).optBoolean("request_second_connection")) {
                    eqyb0.h.e(gjkj.A);
                    eqam eqam0 = eqyb0.d;
                    String s = bbmu.c(eqyb0.c);
                    long v = hyis.a.k().g();
                    if(eqam0.v.getAndSet(true)) {
                        eqam.b.m("Already try to reconnect.", new Object[0]);
                        evrg.c(new aztb(new Status(10566)));
                        return;
                    }
                    eqam0.k();
                    eqam0.f(s, v, new eqal(eqam0, new eqak(eqam0, eqam0.j)));
                }
            }
        }
        catch(erpd | JSONException exception0) {
            eqyb.a.l(exception0);
        }
    }
}

