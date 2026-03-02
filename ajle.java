import com.google.android.gms.auth.proximity.RemoteDevice;
import j..util.Objects;
import org.json.JSONException;

final class ajle implements gmbg {
    final RemoteDevice a;
    final ajlf b;

    public ajle(ajlf ajlf0, RemoteDevice remoteDevice0) {
        this.a = remoteDevice0;
        Objects.requireNonNull(ajlf0);
        this.b = ajlf0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(ajlf.a.j(), "Error when decrypting message message.", throwable0);
        try {
            byte[] arr_b = new ajln(new byte[0]).a();
            this.b.b.f(this.a.b, arr_b);
        }
        catch(JSONException jSONException0) {
            a.ae(ajlf.a.j(), "Error when serializing failed decrypt.", jSONException0);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        byte[] arr_b = (byte[])object0;
        try {
            ((ggtj)ajlf.a.h()).z("Successfully decrypted challenge (%d bytes), sending response...", arr_b.length);
            byte[] arr_b1 = new ajln(arr_b).a();
            this.b.b.f(this.a.b, arr_b1);
        }
        catch(JSONException jSONException0) {
            a.ae(ajlf.a.j(), "Error when serializing decrypted message.", jSONException0);
        }
    }
}

