import java.util.concurrent.ExecutionException;

public final class hfna {
    private final hfle a;
    private final hfme b;

    public hfna(hfle hfle0, hfme hfme0) {
        this.a = hfle0;
        this.b = hfme0;
    }

    public final gmcd a(hfnh hfnh0, hfnp hfnp0, hfnl hfnl0, hfni hfni0) {
        gmcd gmcd0;
        if(this.b.a()) {
            try(gdqb gdqb0 = gdsp.e("com/google/privacy/ptoken/ondevice/client/impl/PolicyEngineBackedEvaluator", "canForward", 40, "PolicyEvaluator:canForward")) {
                gmcd0 = this.a.a(hfnh0, hfnp0, hfnl0, hfni0);
                gdqb0.a(gmcd0);
            }
            return gmcd0;
        }
        return this.a.a(hfnh0, hfnp0, hfnl0, hfni0);
    }

    public final hfnm b(hfnh hfnh0, hfnp hfnp0, hfnl hfnl0, hfni hfni0) {
        gmcd gmcd0;
        if(this.b.a()) {
            try(gdqb gdqb0 = gdsp.e("com/google/privacy/ptoken/ondevice/client/impl/PolicyEngineBackedEvaluator", "canForwardLocalMode", 57, "PolicyEvaluator:canForwardLocalMode")) {
                gmcd0 = this.a.a(hfnh0, hfnp0, hfnl0, hfni0);
            }
        }
        else {
            gmcd0 = this.a.a(hfnh0, hfnp0, hfnl0, hfni0);
        }
        if(gmcd0.isDone()) {
            try {
                return (hfnm)gmbu.r(gmcd0);
            }
            catch(ExecutionException executionException0) {
                throw new hfmd(executionException0.getCause());
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfnm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfnm hfnm0 = (hfnm)hftp0.b_message;
        hfnm0.b |= 1;
        hfnm0.c = false;
        return (hfnm)hftp0.N_build();
    }
}

