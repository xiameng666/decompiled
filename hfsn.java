import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class hfsn extends CodedOutputStream {
    final byte[] a;
    final int b;
    int c;
    public int d;
    private final OutputStream g;

    public hfsn(OutputStream outputStream0, int v) {
        if(v < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] arr_b = new byte[Math.max(v, 20)];
        this.a = arr_b;
        this.b = arr_b.length;
        if(outputStream0 == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream0;
    }

    @Override  // CodedOutputStream
    public final void A(int v, int v1) {
        this.writeRawVarint32(hfxg.c(v, v1));
    }

    @Override  // CodedOutputStream
    public final void B(int v, int v1) {
        this.az(20);
        this.g(v, 0);
        this.h(v1);
    }

    @Override  // CodedOutputStream
    public final void writeRawVarint32(int v) {
        this.az(5);
        this.h(v);
    }

    @Override  // CodedOutputStream
    public final void D(int v, long v1) {
        this.az(20);
        this.g(v, 0);
        this.i(v1);
    }

    @Override  // CodedOutputStream
    public final void writeRawVarint64(long v) {
        this.az(10);
        this.i(v);
    }

    @Override  // CodedOutputStream
    public final void F(byte[] arr_b, int v) {
        this.writeRawVarint32(v);
        this.l(arr_b, 0, v);
    }

    @Override  // hfrt
    public final void a(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        int v1 = this.b;
        int v2 = this.c;
        int v3 = v1 - v2;
        if(v3 >= v) {
            byteBuffer0.get(this.a, v2, v);
            this.c += v;
            this.d += v;
            return;
        }
        byte[] arr_b = this.a;
        byteBuffer0.get(arr_b, v2, v3);
        this.c = v1;
        this.d += v3;
        this.ay();
        int v4;
        for(v4 = v - v3; v4 > v1; v4 -= v1) {
            byteBuffer0.get(arr_b, 0, v1);
            this.g.write(arr_b, 0, v1);
            this.d += v1;
        }
        byteBuffer0.get(arr_b, 0, v4);
        this.c = v4;
        this.d += v4;
    }

    private final void ay() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void az(int v) {
        if(this.b - this.c < v) {
            this.ay();
        }
    }

    @Override  // CodedOutputStream
    public final void b(byte[] arr_b, int v, int v1) {
        this.l(arr_b, v, v1);
    }

    @Override  // CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void d(byte b) {
        int v = this.c;
        this.a[v] = b;
        this.c = v + 1;
        ++this.d;
    }

    final void e(int v) {
        int v1 = this.c;
        this.a[v1] = (byte)v;
        this.a[v1 + 1] = (byte)(v >> 8);
        this.a[v1 + 2] = (byte)(v >> 16);
        this.a[v1 + 3] = (byte)(v >> 24);
        this.c = v1 + 4;
        this.d += 4;
    }

    final void f(long v) {
        int v1 = this.c;
        this.a[v1] = (byte)(((int)v));
        this.a[v1 + 1] = (byte)(((int)(v >> 8)));
        this.a[v1 + 2] = (byte)(((int)(v >> 16)));
        this.a[v1 + 3] = (byte)(((int)(v >> 24)));
        this.a[v1 + 4] = (byte)(((int)(v >> 0x20)));
        this.a[v1 + 5] = (byte)(((int)(v >> 40)));
        this.a[v1 + 6] = (byte)(((int)(v >> 0x30)));
        this.a[v1 + 7] = (byte)(((int)(v >> 56)));
        this.c = v1 + 8;
        this.d += 8;
    }

    final void g(int v, int v1) {
        this.h(hfxg.c(v, v1));
    }

    final void h(int v) {
        if(CodedOutputStream.e) {
            long v1 = (long)this.c;
            while((v & 0xFFFFFF80) != 0) {
                int v2 = this.c;
                this.c = v2 + 1;
                hfwy.n(this.a, ((long)v2), ((byte)(v | 0x80)));
                v >>>= 7;
            }
            int v3 = this.c;
            this.c = v3 + 1;
            hfwy.n(this.a, ((long)v3), ((byte)v));
            this.d += (int)(((long)this.c) - v1);
            return;
        }
        while((v & 0xFFFFFF80) != 0) {
            int v4 = this.c;
            this.c = v4 + 1;
            this.a[v4] = (byte)(v | 0x80);
            ++this.d;
            v >>>= 7;
        }
        int v5 = this.c;
        this.c = v5 + 1;
        this.a[v5] = (byte)v;
        ++this.d;
    }

    final void i(long v) {
        if(CodedOutputStream.e) {
            long v1 = (long)this.c;
            while(Long.compare(v & 0xFFFFFFFFFFFFFF80L, 0L) != 0) {
                int v2 = this.c;
                this.c = v2 + 1;
                hfwy.n(this.a, ((long)v2), ((byte)(((int)v) | 0x80)));
                v >>>= 7;
            }
            int v3 = this.c;
            this.c = v3 + 1;
            hfwy.n(this.a, ((long)v3), ((byte)(((int)v))));
            this.d += (int)(((long)this.c) - v1);
            return;
        }
        while(Long.compare(v & 0xFFFFFFFFFFFFFF80L, 0L) != 0) {
            int v4 = this.c;
            this.c = v4 + 1;
            this.a[v4] = (byte)(((int)v) | 0x80);
            ++this.d;
            v >>>= 7;
        }
        int v5 = this.c;
        this.c = v5 + 1;
        this.a[v5] = (byte)(((int)v));
        ++this.d;
    }

    @Override  // CodedOutputStream
    public final void flush() {
        if(this.c > 0) {
            this.ay();
        }
    }

    @Override  // CodedOutputStream
    public final void k(byte b) {
        if(this.c == this.b) {
            this.ay();
        }
        this.d(b);
    }

    @Override  // CodedOutputStream
    public final void l(byte[] arr_b, int v, int v1) {
        int v2 = this.b;
        int v3 = this.c;
        int v4 = v2 - v3;
        if(v4 >= v1) {
            System.arraycopy(arr_b, v, this.a, v3, v1);
            this.c += v1;
            this.d += v1;
            return;
        }
        byte[] arr_b1 = this.a;
        System.arraycopy(arr_b, v, arr_b1, v3, v4);
        int v5 = v + v4;
        this.c = v2;
        this.d += v4;
        this.ay();
        int v6 = v1 - v4;
        if(v6 <= v2) {
            System.arraycopy(arr_b, v5, arr_b1, 0, v6);
            this.c = v6;
        }
        else {
            this.g.write(arr_b, v5, v6);
        }
        this.d += v6;
    }

    @Override  // CodedOutputStream
    public final void writeBool(int v, boolean z) {
        this.az(11);
        this.g(v, 0);
        this.d(((byte)z));
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
        this.az(14);
        this.g(v, 5);
        this.e(v1);
    }

    @Override  // CodedOutputStream
    public final void q(int v) {
        this.az(4);
        this.e(v);
    }

    @Override  // CodedOutputStream
    public final void r(int v, long v1) {
        this.az(18);
        this.g(v, 1);
        this.f(v1);
    }

    @Override  // CodedOutputStream
    public final void s(long v) {
        this.az(8);
        this.f(v);
    }

    @Override  // CodedOutputStream
    public final void writeInt32(int v, int v1) {
        this.az(20);
        this.g(v, 0);
        if(v1 >= 0) {
            this.h(v1);
            return;
        }
        this.i(((long)v1));
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
        int v9;
        try {
            int v = s.length() * 3;
            int v1 = hfsn.Y(v);
            int v2 = v1 + v;
            int v3 = this.b;
            if(v2 > v3) {
                byte[] arr_b = new byte[v];
                int v4 = hfxc.a(s, arr_b, 0, v);
                this.writeRawVarint32(v4);
                this.l(arr_b, 0, v4);
                return;
            }
            if(v2 > v3 - this.c) {
                this.ay();
            }
            int v5 = hfsn.Y(s.length());
            int v6 = this.c;
            if(v5 == v1) {
                try {
                    int v7 = v6 + v5;
                    this.c = v7;
                    int v8 = hfxc.a(s, this.a, v7, v3 - v7);
                    this.c = v6;
                    v9 = v8 - v6 - v5;
                    this.h(v9);
                    this.c = v8;
                    this.d += v9;
                    return;
                label_23:
                    v9 = hfxc.b(s);
                    this.h(v9);
                    this.c = hfxc.a(s, this.a, this.c, v9);
                    this.d += v9;
                    return;
                }
                catch(hfxb hfxb1) {
                    this.d -= this.c - v6;
                    this.c = v6;
                    throw hfxb1;
                }
                catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                    throw new hfsp(arrayIndexOutOfBoundsException0);
                }
            }
            else {
                goto label_23;
            }
            this.d += v9;
        }
        catch(hfxb hfxb0) {
            ((CodedOutputStream)this).af(s, hfxb0);
        }
    }
}

