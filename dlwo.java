import java.util.concurrent.ExecutionException;

public final class dlwo implements dmba {
    private static final bboh a;
    private final etgl b;

    static {
        dlwo.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlwo(etgl etgl0) {
        this.b = etgl0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        hjrc hjrc0;
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 51, "Cannot evaluate filter that is not auth status filter", new Object[0]);
        Boolean boolean0 = null;
        switch((hjwe0.b == 51 ? ((hjrd)hjwe0.c) : hjrd.a).b) {
            case 0: {
                hjrc0 = hjrc.a;
                break;
            }
            case 1: {
                hjrc0 = hjrc.b;
                break;
            }
            case 2: {
                hjrc0 = hjrc.c;
                break;
            }
            default: {
                hjrc0 = null;
            }
        }
        if(hjrc0 == null) {
            hjrc0 = hjrc.d;
        }
        ibuq.e(hjrc0, "getCdcvmValidity(...)");
        try {
            boolean0 = (Boolean)evrg.n(this.b.cE());
        }
        catch(Exception exception0) {
            if(!(exception0 instanceof ExecutionException) && (!(exception0 instanceof InterruptedException) && !(exception0 instanceof IllegalStateException))) {
                throw exception0;
            }
            a.ae(dlwo.a.j(), "Could not get auth status.", exception0);
        }
        switch(hjrc0.ordinal()) {
            case 1: {
                return ibuq.m(boolean0, Boolean.valueOf(true));
            }
            case 2: {
                return ibuq.m(boolean0, Boolean.valueOf(false));
            }
            default: {
                return false;
            }
        }
    }
}

