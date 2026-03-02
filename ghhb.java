import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class ghhb extends ghff implements Serializable {
    public static final ghfz a;
    public static final ghfz b;
    static final ghfz c;
    public final int d;
    private final boolean e;
    private static final long serialVersionUID;

    static {
        ghhb.a = new ghhb(0, false);
        ghhb.b = new ghhb(0, true);
        ghhb.c = new ghhb(ghgf.a, true);
    }

    public ghhb(int v, boolean z) {
        this.d = v;
        this.e = z;
    }

    @Override  // ghff
    public final ghfy b(long v) {
        return ghhb.o(ghhb.j(ghhb.j(this.d, ghhb.k(((int)v))), ghhb.k(((int)(v >>> 0x20)))), 8);
    }

    @Override  // ghff
    public final ghfy c(CharSequence charSequence0, Charset charset0) {
        long v5;
        if(charset0.equals(StandardCharsets.UTF_8)) {
            int v = charSequence0.length();
            int v1 = this.d;
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            while(true) {
                v5 = 0L;
                if(v3 + 4 > v) {
                    break;
                }
                int v6 = charSequence0.charAt(v3);
                int v7 = charSequence0.charAt(v3 + 1);
                int v8 = charSequence0.charAt(v3 + 2);
                int v9 = charSequence0.charAt(v3 + 3);
                if(v6 >= 0x80 || v7 >= 0x80 || v8 >= 0x80 || v9 >= 0x80) {
                    break;
                }
                v1 = ghhb.j(v1, ghhb.k(v7 << 8 | v6 | v8 << 16 | v9 << 24));
                v4 += 4;
                v3 += 4;
            }
            while(v3 < v) {
                int v10 = charSequence0.charAt(v3);
                if(v10 < 0x80) {
                    v5 |= ((long)v10) << v2;
                    ++v4;
                    v2 += 8;
                }
                else if(v10 < 0x800) {
                    v5 |= ghhb.m(((char)v10)) << v2;
                    v4 += 2;
                    v2 += 16;
                }
                else if(v10 >= 0xD800 && v10 <= 0xDFFF) {
                    int v11 = Character.codePointAt(charSequence0, v3);
                    if(v11 == v10) {
                        return this.a(charSequence0.toString().getBytes(charset0));
                    }
                    ++v3;
                    v5 |= ghhb.n(v11) << v2;
                    if(this.e) {
                        v2 += 0x20;
                    }
                    v4 += 4;
                }
                else {
                    v5 |= ghhb.l(((char)v10)) << v2;
                    v4 += 3;
                    v2 += 24;
                }
                if(v2 >= 0x20) {
                    v1 = ghhb.j(v1, ghhb.k(((int)v5)));
                    v5 >>>= 0x20;
                    v2 += 0xFFFFFFE0;
                }
                ++v3;
            }
            return ghhb.o(ghhb.k(((int)v5)) ^ v1, v4);
        }
        return this.a(charSequence0.toString().getBytes(charset0));
    }

    @Override  // ghff
    public final ghfy d(CharSequence charSequence0) {
        int v = this.d;
        for(int v1 = 1; v1 < charSequence0.length(); v1 += 2) {
            v = ghhb.j(v, ghhb.k(charSequence0.charAt(v1 - 1) | charSequence0.charAt(v1) << 16));
        }
        if((charSequence0.length() & 1) == 1) {
            v ^= ghhb.k(charSequence0.charAt(charSequence0.length() - 1));
        }
        int v2 = charSequence0.length();
        return ghhb.o(v, v2 + v2);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghhb) && this.d == ((ghhb)object0).d && this.e == ((ghhb)object0).e;
    }

    @Override  // ghff
    public final ghfy f(byte[] arr_b, int v) {
        int v1 = 0;
        gftb.p(0, v, arr_b.length);
        int v2 = this.d;
        int v3;
        for(v3 = 0; v3 + 4 <= v; v3 += 4) {
            v2 = ghhb.j(v2, ghhb.k(ghhb.i(arr_b, v3)));
        }
        for(int v4 = 0; v3 < v; v4 += 8) {
            v1 ^= (arr_b[v3] & 0xFF) << v4;
            ++v3;
        }
        return ghhb.o(v2 ^ ghhb.k(v1), v);
    }

    @Override  // ghfz
    public final ghga h() {
        return new ghha(this.d);
    }

    @Override
    public final int hashCode() {
        int v = this.getClass().hashCode();
        return this.d ^ v;
    }

    public static int i(byte[] arr_b, int v) {
        return glwy.d(arr_b[v + 3], arr_b[v + 2], arr_b[v + 1], arr_b[v]);
    }

    public static int j(int v, int v1) {
        return Integer.rotateLeft(v ^ v1, 13) * 5 - 430675100;
    }

    public static int k(int v) {
        return Integer.rotateLeft(v * 0xCC9E2D51, 15) * 461845907;
    }

    public static long l(char c) {
        return ((long)(c >>> 12)) | 0xE0L | ((long)((c >>> 6 & 0x3F | 0x80) << 8)) | ((long)((c & 0x3F | 0x80) << 16));
    }

    public static long m(char c) {
        return ((long)(c >>> 6)) | 0xC0L | ((long)((c & 0x3F | 0x80) << 8));
    }

    public static long n(int v) {
        return (((long)(v & 0x3F)) | 0x80L) << 24 | ((((long)(v >>> 12 & 0x3F)) | 0x80L) << 8 | (((long)(v >>> 18)) | 0xF0L) | (((long)(v >>> 6 & 0x3F)) | 0x80L) << 16);
    }

    public static ghfy o(int v, int v1) {
        int v2 = v ^ v1;
        int v3 = (v2 ^ v2 >>> 16) * -2048144789;
        int v4 = (v3 ^ v3 >>> 13) * -1028477387;
        return new ghfw(v4 ^ v4 >>> 16);
    }

    @Override
    public final String toString() {
        return "Hashing.murmur3_32(" + this.d + ")";
    }
}

