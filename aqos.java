import android.net.Uri.Builder;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;

final class aqos extends aqpp {
    final hisv a;

    public aqos(aqov aqov0, aqwm aqwm0, hisv hisv0) {
        this.a = hisv0;
        Objects.requireNonNull(aqov0);
        super(aqwm0);
    }

    @Override  // aqpp
    protected final Object a(InputStream inputStream0) {
        hftc hftc0 = hftc.a();
        hfsl hfsl0 = hfsl.N(inputStream0);
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hisw.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
            hfwc0.g(hftv0);
        }
        catch(hfur hfur0) {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv0;
            throw hfur0;
        }
        catch(hfwr hfwr0) {
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv0;
            throw hfur1;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv0;
            throw hfur2;
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (hisw)hftv0;
    }

    @Override  // aqpp
    protected final String b() {
        Uri.Builder uri$Builder0 = aqov.a().appendEncodedPath(this.a.d).appendPath("files").appendQueryParameter("transaction_id", this.a.g).appendQueryParameter("page_size", String.valueOf(this.a.e)).appendQueryParameter("page_token", this.a.f);
        aqov.k(uri$Builder0, (this.a.c == null ? hise.a : this.a.c));
        return uri$Builder0.build().toString();
    }
}

