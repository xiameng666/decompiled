import java.nio.ByteBuffer;
import javax.crypto.Mac;

final class ghgs extends ghfe {
    private final Mac a;
    private boolean b;

    public ghgs(Mac mac0) {
        this.a = mac0;
    }

    @Override  // ghfe
    public final void a(byte b) {
        this.p();
        this.a.update(b);
    }

    @Override  // ghfe
    public final void b(ByteBuffer byteBuffer0) {
        this.p();
        gftb.check(byteBuffer0);
        this.a.update(byteBuffer0);
    }

    @Override  // ghfe
    protected final void c(byte[] arr_b) {
        this.p();
        this.a.update(arr_b);
    }

    @Override  // ghfe
    protected final void d(byte[] arr_b, int v, int v1) {
        this.p();
        this.a.update(arr_b, v, v1);
    }

    private final void p() {
        gftb.r(((boolean)(this.b ^ 1)), "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override  // ghga
    public final ghfy s() {
        this.p();
        this.b = true;
        return new ghfv(this.a.doFinal());
    }
}

