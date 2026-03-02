import java.nio.ByteBuffer;

final class ghhd extends ghfk {
    private long a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;

    public ghhd() {
        super(8, 8);
        this.e = 0L;
        this.f = 0L;
        this.a = 0x7469686173716475L;
        this.b = 0x6B617F6D656E6665L;
        this.c = 0x6B7F62616D677361L;
        this.d = 0x7B6B696E727E6C7BL;
    }

    @Override  // ghfk
    protected final ghfy b() {
        long v = this.f ^ this.e << 56;
        this.f = v;
        this.p(v);
        this.c ^= 0xFFL;
        this.q(4);
        return new ghfx(this.a ^ this.b ^ this.c ^ this.d);
    }

    @Override  // ghfk
    protected final void c(ByteBuffer byteBuffer0) {
        this.e += 8L;
        this.p(byteBuffer0.getLong());
    }

    @Override  // ghfk
    protected final void d(ByteBuffer byteBuffer0) {
        this.e += (long)byteBuffer0.remaining();
        for(int v = 0; byteBuffer0.hasRemaining(); v += 8) {
            this.f ^= (((long)byteBuffer0.get()) & 0xFFL) << v;
        }
    }

    private final void p(long v) {
        this.d ^= v;
        this.q(2);
        this.a ^= v;
    }

    private final void q(int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            this.a += this.b;
            this.c += this.d;
            this.b = Long.rotateLeft(this.b, 13);
            this.b ^= this.a;
            this.d = Long.rotateLeft(this.d, 16) ^ this.c;
            this.c += this.b;
            this.a = Long.rotateLeft(this.a, 0x20) + this.d;
            this.b = Long.rotateLeft(this.b, 17);
            this.b ^= this.c;
            this.d = Long.rotateLeft(this.d, 21) ^ this.a;
            this.c = Long.rotateLeft(this.c, 0x20);
        }
    }
}

