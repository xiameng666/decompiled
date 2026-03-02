import j..util.Optional;
import java.util.concurrent.ExecutionException;

public final class dlxz implements dmba {
    private static final bboh a;
    private final dyyn b;

    static {
        dlxz.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlxz(dyyn dyyn0) {
        this.b = dyyn0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b == 49) {
            try {
                dyyn dyyn0 = this.b;
                String s = ((hjte)hjwe0.c).b;
                ibuq.e(s, "getLowerThanVersion(...)");
                ibuq.f(s, "minVersion");
                ecul ecul0 = dyyn0.a.b.e;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ecxy.a).v_newBuilder();
                hfsw hfsw0 = hfsw.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ecxy ecxy0 = (ecxy)hftp0.b_message;
                hfsw0.getClass();
                ecxy0.d = hfsw0;
                ecxy0.c = 43;
                ecvc ecvc0 = new ecvc();
                dyyl dyyl0 = new dyyl(s);
                return ((Boolean)evrg.n(((ecvy)ecul0).i(hftp0, hhag.N, Optional.empty(), ecvc0).f(dyyn0.b, dyyl0))).booleanValue() ^ 1;
            }
            catch(ExecutionException executionException0) {
                a.ae(dlxz.a.i(), "Failed to check MFI Client version.", executionException0);
                return false;
            }
        }
        throw new IllegalArgumentException("Cannot evaluate filter that is not FelicaMfiClientVersionFilter");
    }
}

