import android.content.Context;
import java.io.IOException;

public final class ffof implements ffoe {
    private final Context a;

    static {
        bboh.b("PhenotypeFlagReaderImpl", bbcu.ea);
    }

    public ffof(Context context0) {
        this.a = context0;
    }

    @Override  // ffoe
    public final gged_interceptors a() {
        ggdy ggdy0 = new ggdy();
        fpim fpim0 = fpim.b(this.a);
        for(Object object0: iaao.a.a(fpim0, fppj.a.b).a().f) {
            fpjo fpjo0 = (fpjo)object0;
            if(fpjo0.e.startsWith(iabs.a.f().l())) {
                goto label_7;
            }
            continue;
            try {
            label_7:
                ByteString hfsf0 = fpjo0.c == 5 ? ((ByteString)fpjo0.d) : ByteString.b;
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)rfi.a).x_newMutableInstance();
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
                try {
                    hfsl0.z(0);
                }
                catch(hfur hfur3) {
                    hfur3.a = hftv0;
                    throw hfur3;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ggdy0.i(((rfi)hftv0));
            }
            catch(hfur unused_ex) {
                throw null;
            }
        }
        return ggdy0.h();
    }
}

