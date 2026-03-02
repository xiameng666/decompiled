import java.io.IOException;
import java.io.InputStream;

public abstract class hfrl implements Parser {
    private static final hftc a;

    static {
        hfrl.a = hftc.a;
    }

    public final MessageLite a(InputStream inputStream0, hftc hftc0) {
        int v1;
        MessageLite hfvm0;
        try {
            int v = inputStream0.read();
            if(v == -1) {
                hfvm0 = null;
            }
            else {
                v1 = hfsl.L(v, inputStream0);
                goto label_8;
            }
            goto label_9;
        }
        catch(IOException iOException0) {
            throw new hfur(iOException0);
        }
    label_8:
        hfvm0 = this.f(new hfri(inputStream0, v1), hftc0);
    label_9:
        hfrl.t(hfvm0);
        return hfvm0;
    }

    public final MessageLite b(ByteString hfsf0, hftc hftc0) {
        hfsl hfsl0 = hfsf0.k();
        MessageLite hfvm0 = this.s(hfsl0, hftc0);
        try {
            hfsl0.z(0);
        }
        catch(hfur hfur0) {
            hfur0.a = hfvm0;
            throw hfur0;
        }
        hfrl.t(hfvm0);
        return hfvm0;
    }

    public final MessageLite c(InputStream inputStream0, hftc hftc0) {
        MessageLite hfvm0 = this.f(inputStream0, hftc0);
        hfrl.t(hfvm0);
        return hfvm0;
    }

    public final MessageLite d(byte[] arr_b, hftc hftc0) {
        return this.e(arr_b, 0, arr_b.length, hftc0);
    }

    public final MessageLite e(byte[] arr_b, int v, int v1, hftc hftc0) {
        MessageLite hfvm0 = this.g(arr_b, v, v1, hftc0);
        hfrl.t(hfvm0);
        return hfvm0;
    }

    public final MessageLite f(InputStream inputStream0, hftc hftc0) {
        hfsl hfsl0 = hfsl.N(inputStream0);
        MessageLite hfvm0 = this.s(hfsl0, hftc0);
        try {
            hfsl0.z(0);
            return hfvm0;
        }
        catch(hfur hfur0) {
            hfur0.a = hfvm0;
            throw hfur0;
        }
    }

    public MessageLite g(byte[] arr_b, int v, int v1, hftc hftc0) {
        throw null;
    }

    @Override  // Parser
    public final Object h(InputStream inputStream0) {
        return this.a(inputStream0, hfrl.a);
    }

    @Override  // Parser
    public final Object i(InputStream inputStream0, hftc hftc0) {
        return this.a(inputStream0, hftc0);
    }

    @Override  // Parser
    public final Object j(ByteString hfsf0) {
        return this.b(hfsf0, hfrl.a);
    }

    @Override  // Parser
    public final Object k(InputStream inputStream0) {
        return this.c(inputStream0, hfrl.a);
    }

    @Override  // Parser
    public final Object parseFrom(byte[] arr_b) {
        return this.d(arr_b, hfrl.a);
    }

    @Override  // Parser
    public final Object m(ByteString hfsf0, hftc hftc0) {
        return this.b(hfsf0, hftc0);
    }

    @Override  // Parser
    public final Object n(hfsl hfsl0, hftc hftc0) {
        Object object0 = this.s(hfsl0, hftc0);
        hfrl.t(((MessageLite)object0));
        return object0;
    }

    @Override  // Parser
    public final Object o(InputStream inputStream0, hftc hftc0) {
        return this.c(inputStream0, hftc0);
    }

    @Override  // Parser
    public final Object p(byte[] arr_b, hftc hftc0) {
        return this.d(arr_b, hftc0);
    }

    @Override  // Parser
    public final Object q(byte[] arr_b, int v, int v1) {
        return this.e(arr_b, v, v1, hfrl.a);
    }

    @Override  // Parser
    public final Object r(byte[] arr_b, int v, int v1, hftc hftc0) {
        return this.e(arr_b, v, v1, hftc0);
    }

    private static final void t(MessageLite hfvm0) {
        if(hfvm0 != null && !hfvm0.isInitialized()) {
            hfur hfur0 = new hfwr().a();
            hfur0.a = hfvm0;
            throw hfur0;
        }
    }
}

