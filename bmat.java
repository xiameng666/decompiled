import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class bmat implements blzd {
    public static final bboh a;
    public final DataOutputStream b;
    public final DataInputStream c;
    private final gmcg d;

    static {
        bmat.a = bnaa.g("DirectTransferChannel");
    }

    public bmat(DataInputStream dataInputStream0, DataOutputStream dataOutputStream0, gmcg gmcg0) {
        this.b = dataOutputStream0;
        this.c = dataInputStream0;
        this.d = gmcg0;
    }

    @Override  // blzd
    public final gmcd a() {
        throw null;
    }

    @Override  // blzd
    public final gmcd b() {
        throw null;
    }

    @Override  // blzd
    public final gmcd c(blzt blzt0) {
        blzt0.d();
        blzt0.a();
        bmas bmas0 = new bmas(this, blzt0);
        return this.d.e(bmas0);
    }

    @Override  // blzd
    public final gmcd d(bmbb bmbb0) {
        throw new UnsupportedOperationException("U2f not supported over Direct Transfer");
    }

    @Override  // blzd
    public final boolean e() {
        return true;
    }
}

