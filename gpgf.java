import java.nio.ByteBuffer;
import java.util.Arrays;

public final class gpgf {
    public ByteBuffer a;
    public int b;
    int c;
    int[] d;
    int e;
    boolean f;
    boolean g;
    int h;
    int[] i;
    int j;
    int k;
    public boolean l;
    gpgd m;

    public gpgf() {
        this(0x400);
    }

    public gpgf(int v) {
        gpge gpge0 = gpge.a;
        gpgj.a();
        super();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.m = gpge0;
        if(v <= 0) {
            v = 0x400;
        }
        ByteBuffer byteBuffer0 = gpge0.a(v);
        this.a = byteBuffer0;
        this.b = byteBuffer0.capacity();
    }

    public final void A(int v, boolean z) {
        if(!this.l) {
            if(z) {
                z = true;
                goto label_5;
            }
            return;
        }
    label_5:
        this.s(1, 0);
        int v1 = this.b - 1;
        this.b = v1;
        this.a.put(v1, ((byte)z));
        this.v(v);
    }

    public final void B(int v, double f) {
        if(!this.l && f == 0.0) {
            return;
        }
        this.s(8, 0);
        int v1 = this.b - 8;
        this.b = v1;
        this.a.putDouble(v1, f);
        this.v(v);
    }

    public final void C(int v, float f) {
        if(!this.l && ((double)f) == 0.0) {
            return;
        }
        this.s(4, 0);
        int v1 = this.b - 4;
        this.b = v1;
        this.a.putFloat(v1, f);
        this.v(v);
    }

    public final void D(int v, int v1) {
        if(!this.l && v1 == 0) {
            return;
        }
        this.l(v1);
        this.v(v);
    }

    public final void E(int v, short v1) {
        if(!this.l && v1 == 0) {
            return;
        }
        this.m(v1);
        this.v(v);
    }

    public final int a(byte[] arr_b) {
        this.x(1, arr_b.length, 1);
        int v = this.b - arr_b.length;
        this.b = v;
        this.a.position(v);
        this.a.put(arr_b);
        return this.e();
    }

    public final int b(CharSequence charSequence0) {
        int v17;
        int v15;
        int v = charSequence0.length();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v && charSequence0.charAt(v2) < 0x80; ++v2) {
        }
        int v3 = v;
        while(v2 < v) {
            int v4 = charSequence0.charAt(v2);
            if(v4 < 0x800) {
                v3 += 0x7F - v4 >>> 0x1F;
                ++v2;
                continue;
            }
            else {
                int v5 = charSequence0.length();
                int v6 = 0;
                while(v2 < v5) {
                    int v7 = charSequence0.charAt(v2);
                    if(v7 < 0x800) {
                        v6 += 0x7F - v7 >>> 0x1F;
                    }
                    else {
                        v6 += 2;
                        if(v7 >= 0xD800 && v7 <= 0xDFFF) {
                            if(Character.codePointAt(charSequence0, v2) < 0x10000) {
                                throw new gpgk(v2, v5);
                            }
                            ++v2;
                        }
                    }
                    ++v2;
                }
                v3 += v6;
            }
            break;
        }
        if(v3 < v) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long)v3) + 0x100000000L));
        }
        this.h(0);
        this.x(1, v3, 1);
        int v8 = this.b - v3;
        this.b = v8;
        this.a.position(v8);
        ByteBuffer byteBuffer0 = this.a;
        if(byteBuffer0.hasArray()) {
            int v9 = byteBuffer0.arrayOffset();
            byte[] arr_b = byteBuffer0.array();
            int v10 = byteBuffer0.position() + v9;
            int v11 = charSequence0.length();
            int v12 = byteBuffer0.remaining() + v10;
            while(v1 < v11) {
                int v13 = v1 + v10;
                if(v13 >= v12) {
                    break;
                }
                int v14 = charSequence0.charAt(v1);
                if(v14 >= 0x80) {
                    break;
                }
                arr_b[v13] = (byte)v14;
                ++v1;
            }
            if(v1 == v11) {
                v15 = v10 + v11;
            }
            else {
                v15 = v10 + v1;
                while(v1 < v11) {
                    int v16 = charSequence0.charAt(v1);
                    if(v16 < 0x80 && v15 < v12) {
                        arr_b[v15] = (byte)v16;
                        ++v15;
                        ++v1;
                        continue;
                    }
                    if(v16 < 0x800 && v15 <= v12 - 2) {
                        v17 = v15 + 2;
                        arr_b[v15] = (byte)(v16 >>> 6 | 960);
                        arr_b[v15 + 1] = (byte)(v16 & 0x3F | 0x80);
                        v15 = v17;
                        ++v1;
                        continue;
                    }
                    if((v16 < 0xD800 || v16 > 0xDFFF) && v15 <= v12 - 3) {
                        v17 = v15 + 3;
                        arr_b[v15] = (byte)(v16 >>> 12 | 480);
                        arr_b[v15 + 1] = (byte)(v16 >>> 6 & 0x3F | 0x80);
                        arr_b[v15 + 2] = (byte)(v16 & 0x3F | 0x80);
                        v15 = v17;
                        ++v1;
                        continue;
                    }
                    if(v15 <= v12 - 4) {
                        if(v1 + 1 != charSequence0.length()) {
                            int v18 = charSequence0.charAt(v1 + 1);
                            if(Character.isSurrogatePair(((char)v16), ((char)v18))) {
                                int v19 = v15 + 3;
                                int v20 = Character.toCodePoint(((char)v16), ((char)v18));
                                arr_b[v15] = (byte)(v20 >>> 18 | 0xF0);
                                arr_b[v15 + 1] = (byte)(v20 >>> 12 & 0x3F | 0x80);
                                arr_b[v15 + 2] = (byte)(v20 >>> 6 & 0x3F | 0x80);
                                v15 += 4;
                                arr_b[v19] = (byte)(v20 & 0x3F | 0x80);
                                ++v1;
                                ++v1;
                                continue;
                            }
                            ++v1;
                        }
                        throw new gpgk(v1 - 1, v11);
                    }
                    if(v16 >= 0xD800 && v16 <= 0xDFFF && (v1 + 1 == charSequence0.length() || !Character.isSurrogatePair(((char)v16), charSequence0.charAt(v1 + 1)))) {
                        throw new gpgk(v1, v11);
                    }
                    throw new ArrayIndexOutOfBoundsException(a.G(v15, ((char)v16), "Failed writing "));
                }
            }
            byteBuffer0.position(v15 - v9);
            return this.e();
        }
        gpgj.b(charSequence0, byteBuffer0);
        return this.e();
    }

    public final int c(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        this.h(0);
        this.x(1, v, 1);
        int v1 = this.b - v;
        this.b = v1;
        this.a.position(v1);
        this.a.put(byteBuffer0);
        return this.e();
    }

    public final int d() {
        int v6;
        if(this.d != null && this.f) {
            this.i(0);
            int v = this.f();
            int v1 = this.e;
            do {
                --v1;
            }
            while(v1 >= 0 && this.d[v1] == 0);
            for(int v2 = v1; v2 >= 0; --v2) {
                int v3 = this.d[v2];
                this.m(((short)(v3 == 0 ? 0 : v - v3)));
            }
            this.m(((short)(v - this.h)));
            int v4 = v1 + 3;
            this.m(((short)(v4 + v4)));
            int v5 = 0;
            while(true) {
                v6 = 0;
                if(v5 >= this.j) {
                    break;
                }
                int v7 = this.a.capacity() - this.i[v5];
                int v8 = this.b;
                int v9 = this.a.getShort(v7);
                if(v9 == this.a.getShort(v8)) {
                    int v10 = 2;
                    while(v10 < v9) {
                        if(this.a.getShort(v7 + v10) == this.a.getShort(v8 + v10)) {
                            v10 += 2;
                            continue;
                        }
                        else {
                            goto label_29;
                        }
                        break;
                    }
                    v6 = this.i[v5];
                    break;
                }
            label_29:
                ++v5;
            }
            if(v6 == 0) {
                int v12 = this.j;
                int[] arr_v = this.i;
                if(v12 == arr_v.length) {
                    this.i = Arrays.copyOf(arr_v, v12 + v12);
                }
                int v13 = this.j;
                this.j = v13 + 1;
                this.i[v13] = this.f();
                this.a.putInt(this.a.capacity() - v, this.f() - v);
            }
            else {
                int v11 = this.a.capacity() - v;
                this.b = v11;
                this.a.putInt(v11, v6 - v);
            }
            this.f = false;
            return v;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public final int e() {
        if(!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        this.t(this.k);
        return this.f();
    }

    public final int f() {
        return this.a.capacity() - this.b;
    }

    public final ByteBuffer g() {
        this.q();
        return this.a;
    }

    public final void h(byte b) {
        this.s(1, 0);
        int v = this.b - 1;
        this.b = v;
        this.a.put(v, b);
    }

    public final void i(int v) {
        this.s(4, 0);
        this.t(v);
    }

    public final void j(int v, int v1, int v2) {
        if(!this.l && v1 == v2) {
            return;
        }
        this.i(v1);
        this.v(v);
    }

    public final void k(int v, long v1, long v2) {
        if(!this.l && v1 == v2) {
            return;
        }
        this.s(8, 0);
        int v3 = this.b - 8;
        this.b = v3;
        this.a.putLong(v3, v1);
        this.v(v);
    }

    public final void l(int v) {
        this.s(4, 0);
        this.t(this.f() - v + 4);
    }

    public final void m(short v) {
        this.s(2, 0);
        int v1 = this.b - 2;
        this.b = v1;
        this.a.putShort(v1, v);
    }

    public final void n(int v) {
        this.p(v, false);
    }

    public final void o(int v, String s) {
        this.s(this.c, 8);
        if(s.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for(int v1 = 3; v1 >= 0; --v1) {
            this.h(((byte)s.charAt(v1)));
        }
        this.p(v, false);
    }

    public final void p(int v, boolean z) {
        this.s(this.c, (z ? 4 : 0) + 4);
        this.l(v);
        if(z) {
            this.i(this.a.capacity() - this.b);
        }
        this.a.position(this.b);
        this.g = true;
    }

    public final void q() {
        if(this.g) {
            return;
        }
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    public final void r() {
        if(!this.f) {
            return;
        }
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    public final void s(int v, int v1) {
        if(v > this.c) {
            this.c = v;
        }
        int v2 = ~(this.a.capacity() - this.b + v1);
        while(true) {
            int v3 = v2 + 1 & v - 1;
            if(this.b >= v3 + v + v1) {
                break;
            }
            int v4 = 0x7FFFFFF7;
            int v5 = this.a.capacity();
            ByteBuffer byteBuffer0 = this.a;
            gpgd gpgd0 = this.m;
            int v6 = byteBuffer0.capacity();
            if(v6 == 0) {
                v4 = 0x400;
            }
            else {
                if(v6 == 0x7FFFFFF7) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if((0xC0000000 & v6) == 0) {
                    v4 = v6 + v6;
                }
            }
            byteBuffer0.position(0);
            ByteBuffer byteBuffer1 = gpgd0.a(v4);
            byteBuffer1.position(byteBuffer1.clear().capacity() - v6);
            byteBuffer1.put(byteBuffer0);
            this.a = byteBuffer1;
            this.b += byteBuffer1.capacity() - v5;
            continue;
        }
        for(int v7 = 0; v7 < v3; ++v7) {
            int v8 = this.b - 1;
            this.b = v8;
            this.a.put(v8, 0);
        }
    }

    public final void t(int v) {
        int v1 = this.b - 4;
        this.b = v1;
        this.a.putInt(v1, v);
    }

    public final void u(int v, int v1) {
        int v2 = this.a.capacity() - v;
        int v3 = v2 - this.a.getInt(v2);
        if(this.a.getShort(v3 + v1) != 0) {
            return;
        }
        throw new AssertionError(a.f(v1, "FlatBuffers: field ", " must be set"));
    }

    public final void v(int v) {
        this.d[v] = this.f();
    }

    public final void w(int v) {
        this.r();
        if(this.d == null || this.d.length < v) {
            this.d = new int[v];
        }
        this.e = v;
        Arrays.fill(this.d, 0, v, 0);
        this.f = true;
        this.h = this.f();
    }

    public final void x(int v, int v1, int v2) {
        this.r();
        this.k = v1;
        int v3 = v * v1;
        this.s(4, v3);
        this.s(v2, v3);
        this.f = true;
    }

    public static boolean y(gpgh gpgh0, int v) {
        return gpgh0.__offset(v) != 0;
    }

    public final byte[] z() {
        int v = this.b;
        int v1 = this.a.capacity() - this.b;
        this.q();
        byte[] arr_b = new byte[v1];
        this.a.position(v);
        this.a.get(arr_b);
        return arr_b;
    }
}

