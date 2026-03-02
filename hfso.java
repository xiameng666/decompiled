import java.nio.ByteBuffer;
import java.util.Locale;

public final class hfso extends CodedOutputStream {
    private final byte[] a;
    private final int b;
    private int c;

    public hfso(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            throw new NullPointerException("buffer");
        }
        int v2 = v + v1;
        if((v | v1 | arr_b.length - v2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
        }
        this.a = arr_b;
        this.c = v;
        this.b = v2;
    }

    @Override  // CodedOutputStream
    public final void A(int v, int v1) {
        this.writeRawVarint32(hfxg.c(v, v1));
    }

    @Override  // CodedOutputStream
    public final void B(int v, int v1) {
        this.A(v, 0);
        this.writeRawVarint32(v1);
    }

    @Override  // CodedOutputStream
    public final void writeRawVarint32(int v) {
        int v2;
        int v1 = this.c;
        try {
            while(true) {
                if((v & 0xFFFFFF80) == 0) {
                    v2 = v1 + 1;
                    this.a[v1] = (byte)v;
                    this.c = v2;
                    return;
                }
                v2 = v1 + 1;
                this.a[v1] = (byte)(v | 0x80);
                v >>>= 7;
                v1 = v2;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new hfsp(v2, this.b, 1, indexOutOfBoundsException0);
        }
    }

    @Override  // CodedOutputStream
    public final void D(int v, long v1) {
        this.A(v, 0);
        this.writeRawVarint64(v1);
    }

    @Override  // CodedOutputStream
    public final void writeRawVarint64(long v) {
        int v3;
        int v2;
        int v1 = this.c;
        if(CodedOutputStream.e && this.spaceLeft() >= 10) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                hfwy.n(this.a, ((long)v1), ((byte)(((int)v) | 0x80)));
                v >>>= 7;
                ++v1;
            }
            v2 = v1 + 1;
            hfwy.n(this.a, ((long)v1), ((byte)(((int)v))));
            this.c = v2;
            return;
        }
        while(true) {
            if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                try {
                    v2 = v1 + 1;
                    this.a[v1] = (byte)(((int)v));
                }
                catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                    v3 = v2;
                    break;
                }
                this.c = v2;
                return;
            }
            try {
                this.a[v1] = (byte)(((int)v) | 0x80);
                v >>>= 7;
                ++v1;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                v3 = v1 + 1;
                break;
            }
        }
        throw new hfsp(v3, this.b, 1, indexOutOfBoundsException0);
    }

    @Override  // CodedOutputStream
    public final void F(byte[] arr_b, int v) {
        this.writeRawVarint32(v);
        this.l(arr_b, 0, v);
    }

    @Override  // hfrt
    public final void a(ByteBuffer byteBuffer0) {
        this.d(byteBuffer0);
    }

    @Override  // CodedOutputStream
    public final void b(byte[] arr_b, int v, int v1) {
        this.l(arr_b, v, v1);
    }

    @Override  // CodedOutputStream
    public final int spaceLeft() {
        return this.b - this.c;
    }

    public final void d(ByteBuffer byteBuffer0) {
        int v;
        try {
            v = byteBuffer0.remaining();
            byteBuffer0.get(this.a, this.c, v);
            this.c += v;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new hfsp(this.c, this.b, v, indexOutOfBoundsException0);
        }
    }

    @Override  // CodedOutputStream
    public final void flush() {
    }

    @Override  // CodedOutputStream
    public final void k(byte b) {
        int v;
        try {
            v = this.c;
            this.a[v] = b;
            this.c = v + 1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new hfsp(v + 1, this.b, 1, indexOutOfBoundsException0);
        }
    }

    @Override  // CodedOutputStream
    public final void l(byte[] arr_b, int v, int v1) {
        try {
            System.arraycopy(arr_b, v, this.a, this.c, v1);
            this.c += v1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new hfsp(this.c, this.b, v1, indexOutOfBoundsException0);
        }
    }

    @Override  // CodedOutputStream
    public final void writeBool(int v, boolean z) {
        this.A(v, 0);
        this.k(((byte)z));
    }

    @Override  // CodedOutputStream
    public final void writeBytes(int v, ByteString hfsf0) {
        this.A(v, 2);
        this.o(hfsf0);
    }

    @Override  // CodedOutputStream
    public final void o(ByteString hfsf0) {
        this.writeRawVarint32(hfsf0.size());
        hfsf0.o(this);
    }

    @Override  // CodedOutputStream
    public final void p(int v, int v1) {
        this.A(v, 5);
        this.q(v1);
    }

    @Override  // CodedOutputStream
    public final void q(int v) {
        int v1;
        try {
            v1 = this.c;
            this.a[v1] = (byte)v;
            this.a[v1 + 1] = (byte)(v >> 8);
            this.a[v1 + 2] = (byte)(v >> 16);
            this.a[v1 + 3] = (byte)(v >> 24);
            this.c = v1 + 4;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new hfsp(v1, this.b, 4, indexOutOfBoundsException0);
        }
    }

    @Override  // CodedOutputStream
    public final void r(int v, long v1) {
        this.A(v, 1);
        this.s(v1);
    }

    @Override  // CodedOutputStream
    public final void s(long v) {
        int v1;
        try {
            v1 = this.c;
            this.a[v1] = (byte)(((int)v));
            this.a[v1 + 1] = (byte)(((int)(v >> 8)));
            this.a[v1 + 2] = (byte)(((int)(v >> 16)));
            this.a[v1 + 3] = (byte)(((int)(v >> 24)));
            this.a[v1 + 4] = (byte)(((int)(v >> 0x20)));
            this.a[v1 + 5] = (byte)(((int)(v >> 40)));
            this.a[v1 + 6] = (byte)(((int)(v >> 0x30)));
            this.a[v1 + 7] = (byte)(((int)(v >> 56)));
            this.c = v1 + 8;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new hfsp(v1, this.b, 8, indexOutOfBoundsException0);
        }
    }

    @Override  // CodedOutputStream
    public final void writeInt32(int v, int v1) {
        this.A(v, 0);
        this.u(v1);
    }

    @Override  // CodedOutputStream
    public final void u(int v) {
        if(v >= 0) {
            this.writeRawVarint32(v);
            return;
        }
        this.writeRawVarint64(((long)v));
    }

    @Override  // CodedOutputStream
    public final void v(MessageLite hfvm0) {
        this.writeRawVarint32(hfvm0.getSerializedSize());
        hfvm0.writeTo(((CodedOutputStream)this));
    }

    @Override  // CodedOutputStream
    public final void writeMessage(int v, MessageLite hfvm0) {
        this.A(1, 3);
        this.B(2, v);
        this.A(3, 2);
        this.v(hfvm0);
        this.A(1, 4);
    }

    @Override  // CodedOutputStream
    public final void x(int v, ByteString hfsf0) {
        this.A(1, 3);
        this.B(2, v);
        this.writeBytes(3, hfsf0);
        this.A(1, 4);
    }

    @Override  // CodedOutputStream
    public final void writeString(int v, String s) {
        this.A(v, 2);
        this.z(s);
    }

    @Override  // CodedOutputStream
    public final void z(String s) {
        int v;
        try {
            v = this.c;
            int v1 = hfso.Y(s.length());
            if(v1 == hfso.Y(s.length() * 3)) {
                int v2 = v + v1;
                this.c = v2;
                int v3 = hfxc.a(s, this.a, v2, this.spaceLeft());
                this.c = v;
                this.writeRawVarint32(v3 - v - v1);
                this.c = v3;
                return;
            }
            this.writeRawVarint32(hfxc.b(s));
            this.c = hfxc.a(s, this.a, this.c, this.spaceLeft());
        }
        catch(hfxb hfxb0) {
            this.c = v;
            ((CodedOutputStream)this).af(s, hfxb0);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new hfsp(indexOutOfBoundsException0);
        }
    }
}

