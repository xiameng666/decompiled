import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class ghgy extends ghfk {
    private long a;
    private long b;
    private int c;

    public ghgy(int v) {
        super(16, 16);
        long v1 = (long)v;
        this.a = v1;
        this.b = v1;
        this.c = 0;
    }

    @Override  // ghfk
    protected final ghfy b() {
        long v = (long)this.c;
        long v1 = v ^ this.b;
        long v2 = (this.a ^ v) + v1;
        this.a = v2;
        long v3 = v1 + v2;
        this.b = v3;
        long v4 = ghgy.p(v2);
        this.a = v4;
        long v5 = ghgy.p(v3);
        long v6 = v4 + v5;
        this.a = v6;
        this.b = v5 + v6;
        return new ghfv(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array());
    }

    @Override  // ghfk
    protected final void c(ByteBuffer byteBuffer0) {
        long v = byteBuffer0.getLong();
        long v1 = byteBuffer0.getLong();
        long v2 = ghgy.q(v) ^ this.a;
        this.a = v2;
        this.a = (Long.rotateLeft(v2, 27) + this.b) * 5L + 1390208809L;
        long v3 = ghgy.r(v1) ^ this.b;
        this.b = v3;
        this.b = (Long.rotateLeft(v3, 0x1F) + this.a) * 5L + 0x38495AB5L;
        this.c += 16;
    }

    @Override  // ghfk
    protected final void d(ByteBuffer byteBuffer0) {
        long v1;
        this.c += byteBuffer0.remaining();
        long v = 0L;
        switch(byteBuffer0.remaining()) {
            case 1: {
                v1 = (long)ghgx.a(byteBuffer0.get(0));
                break;
            }
            case 2: {
                v1 = ((long)ghgx.a(byteBuffer0.get(1))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(0)));
                break;
            }
            case 3: {
                v1 = ((long)ghgx.a(byteBuffer0.get(2))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(1))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(0)));
                break;
            }
            case 4: {
                v1 = ((long)ghgx.a(byteBuffer0.get(3))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(2))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(1))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(0)));
                break;
            }
            case 5: {
                v1 = ((long)ghgx.a(byteBuffer0.get(4))) << 0x20 ^ ((long)ghgx.a(byteBuffer0.get(3))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(2))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(1))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(0)));
                break;
            }
            case 6: {
                v1 = ((long)ghgx.a(byteBuffer0.get(5))) << 40 ^ ((long)ghgx.a(byteBuffer0.get(4))) << 0x20 ^ ((long)ghgx.a(byteBuffer0.get(3))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(2))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(1))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(0)));
                break;
            }
            case 7: {
                long v2 = ((long)ghgx.a(byteBuffer0.get(6))) << 0x30;
                v1 = ((long)ghgx.a(byteBuffer0.get(5))) << 40 ^ v2 ^ ((long)ghgx.a(byteBuffer0.get(4))) << 0x20 ^ ((long)ghgx.a(byteBuffer0.get(3))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(2))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(1))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(0)));
                break;
            }
            case 8: {
                v1 = byteBuffer0.getLong();
                break;
            }
            case 9: {
                v = (long)ghgx.a(byteBuffer0.get(8));
                v1 = byteBuffer0.getLong();
                break;
            }
            case 10: {
                v = ((long)ghgx.a(byteBuffer0.get(9))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(8)));
                v1 = byteBuffer0.getLong();
                break;
            }
            case 11: {
                v = ((long)ghgx.a(byteBuffer0.get(10))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(9))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(8)));
                v1 = byteBuffer0.getLong();
                break;
            }
            case 12: {
                v = ((long)ghgx.a(byteBuffer0.get(11))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(10))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(9))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(8)));
                v1 = byteBuffer0.getLong();
                break;
            }
            case 13: {
                v = ((long)ghgx.a(byteBuffer0.get(12))) << 0x20 ^ ((long)ghgx.a(byteBuffer0.get(11))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(10))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(9))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(8)));
                v1 = byteBuffer0.getLong();
                break;
            }
            case 14: {
                v = ((long)ghgx.a(byteBuffer0.get(13))) << 40 ^ ((long)ghgx.a(byteBuffer0.get(12))) << 0x20 ^ ((long)ghgx.a(byteBuffer0.get(11))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(10))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(9))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(8)));
                v1 = byteBuffer0.getLong();
                break;
            }
            case 15: {
                v = ((long)ghgx.a(byteBuffer0.get(14))) << 0x30 ^ ((long)ghgx.a(byteBuffer0.get(13))) << 40 ^ ((long)ghgx.a(byteBuffer0.get(12))) << 0x20 ^ ((long)ghgx.a(byteBuffer0.get(11))) << 24 ^ ((long)ghgx.a(byteBuffer0.get(10))) << 16 ^ ((long)ghgx.a(byteBuffer0.get(9))) << 8 ^ ((long)ghgx.a(byteBuffer0.get(8)));
                v1 = byteBuffer0.getLong();
                break;
            }
            default: {
                throw new AssertionError("Should never get here.");
            }
        }
        this.a ^= ghgy.q(v1);
        this.b ^= ghgy.r(v);
    }

    private static long p(long v) {
        long v1 = (v ^ v >>> 33) * 0xFF51AFD7ED558CCDL;
        long v2 = (v1 ^ v1 >>> 33) * 0xC4CEB9FE1A85EC53L;
        return v2 ^ v2 >>> 33;
    }

    private static long q(long v) {
        return Long.rotateLeft(v * 0x87C37B91114253D5L, 0x1F) * 5545529020109919103L;
    }

    private static long r(long v) {
        return Long.rotateLeft(v * 5545529020109919103L, 33) * 0x87C37B91114253D5L;
    }
}

