import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqgd implements eqgj {
    public static final erqc a;
    public final Context b;
    public final eqgk c;
    public final eqgb d;
    public int e;
    public epzz f;
    public ParcelFileDescriptor[] g;
    public ParcelFileDescriptor[] h;
    public erpg i;
    public erpy j;
    public final gmcg k;
    private final String l;
    private final eqls m;

    static {
        eqgd.a = new erqc(new String[]{"AtvSetupProtocolController"});
    }

    public eqgd(Context context0, InetAddress inetAddress0, String s, eqgb eqgb0, eqls eqls0) {
        this.k = new bblp(3, 9);
        this.b = context0;
        this.d = eqgb0;
        this.l = s;
        this.m = eqls0;
        this.c = new eqgk(inetAddress0, this);
    }

    public final void a() {
        try {
            erpg erpg0 = this.i;
            if(erpg0 != null) {
                erpg0.a();
            }
            eqgd.c(this.h);
            eqgd.c(this.g);
            eqgk eqgk0 = this.c;
            eqgk.a.d("Shutting down socket...", new Object[0]);
            eqgk0.e = false;
            Socket socket0 = eqgk0.f;
            if(socket0 != null) {
                socket0.close();
            }
            erpg erpg1 = eqgk0.g;
            if(erpg1 != null) {
                erpg1.a();
            }
            DataOutputStream dataOutputStream0 = eqgk0.h;
            if(dataOutputStream0 != null) {
                dataOutputStream0.close();
            }
        }
        catch(IOException iOException0) {
            eqgd.a.i("Close threw exception", iOException0, new Object[0]);
        }
    }

    public final void b() {
        epwg epwg0;
        try {
            JSONObject jSONObject0 = new JSONObject();
            int v = this.e;
            if(v == 2) {
                jSONObject0.put("request_accounts_signed_in_tv", true);
                jSONObject0.put("pairing_key", this.l);
                epwg0 = epwg.a(jSONObject0);
            }
            else if(v == 3) {
                jSONObject0.put("request_tv_start_sddt", true);
                if(hyjh.c()) {
                    jSONObject0.put("session_id", Long.toString(((gjoc)this.m.d.b_message).c));
                }
                epwg0 = epwg.a(jSONObject0);
            }
            else {
                epwg0 = null;
            }
            if(epwg0 == null) {
                eqgd.a.m("Called sendNextPacketForState for state %d, which does not have a packet", new Object[]{((int)this.e)});
                return;
            }
            gmbu.t(this.c.a(epwg0), new eqgc("Send packet to ATV device", this.d), this.k);
        }
        catch(JSONException jSONException0) {
            eqgd.a.g("Failed to build packet to send to ATV: ", jSONException0, new Object[0]);
            this.d.a(-17);
        }
    }

    private static final void c(ParcelFileDescriptor[] arr_parcelFileDescriptor) {
        if(arr_parcelFileDescriptor != null) {
            try {
                for(int v = 0; v < arr_parcelFileDescriptor.length; ++v) {
                    arr_parcelFileDescriptor[v].close();
                }
            }
            catch(IOException iOException0) {
                eqgd.a.m("IOException while closing ParcelFileDescriptor: " + iOException0.toString(), new Object[0]);
            }
        }
    }
}

