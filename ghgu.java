import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

final class ghgu extends ghfe {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public ghgu(MessageDigest messageDigest0, int v) {
        this.a = messageDigest0;
        this.b = v;
    }

    @Override  // ghfe
    public final void a(byte b) {
        this.p();
        this.a.update(b);
    }

    @Override  // ghfe
    public final void b(ByteBuffer byteBuffer0) {
        this.p();
        this.a.update(byteBuffer0);
    }

    @Override  // ghfe
    protected final void d(byte[] arr_b, int v, int v1) {
        this.p();
        this.a.update(arr_b, v, v1);
    }

    private final void p() {
        gftb.r(((boolean)(this.c ^ 1)), "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override  // ghga
    public final ghfy s() {
        this.p();
        this.c = true;
        return this.b == this.a.getDigestLength() ? new ghfv(this.a.digest()) : new ghfv(Arrays.copyOf(this.a.digest(), this.b));
    }
}

