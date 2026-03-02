import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class ByteString implements Serializable, Iterable {
    public static final ByteString b = null;
    public static final Comparator c = null;
    public int d;
    private static final long serialVersionUID = 1L;

    static {
        ByteString.b = new hfsb(hfup.b);
        ByteString.c = new hfrv();
    }

    public ByteString() {
        this.d = 0;
    }

    public static ByteString A(String s) {
        return new hfsb(s.getBytes(hfup.a));
    }

    public static ByteString B(String s) {
        if(s.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + s + " of length " + s.length() + " must be even.");
        }
        int v = s.length() / 2;
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = v1 + v1;
            int v3 = ByteString.c(s, v2);
            arr_b[v1] = (byte)(ByteString.c(s, v2 + 1) | v3 << 4);
        }
        return new hfsb(arr_b);
    }

    public static ByteString C(InputStream inputStream0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0x100; true; v = Math.min(v + v, 0x2000)) {
            byte[] arr_b = new byte[v];
            int v1;
            for(v1 = 0; v1 < v; v1 += v2) {
                int v2 = inputStream0.read(arr_b, v1, v - v1);
                if(v2 == -1) {
                    break;
                }
            }
            ByteString hfsf0 = v1 == 0 ? null : ByteString.z(arr_b, 0, v1);
            if(hfsf0 == null) {
                break;
            }
            arrayList0.add(hfsf0);
        }
        return ByteString.u(arrayList0);
    }

    public final ByteString D(int v) {
        return this.j(v, this.size());
    }

    static ByteString E(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            int v = byteBuffer0.arrayOffset();
            return new hfrx(byteBuffer0.array(), v + byteBuffer0.position(), byteBuffer0.remaining());
        }
        return new hfsd(byteBuffer0);
    }

    public final String F(String s) {
        try {
            return this.G(Charset.forName(s));
        }
        catch(UnsupportedCharsetException unsupportedCharsetException0) {
            UnsupportedEncodingException unsupportedEncodingException0 = new UnsupportedEncodingException(s);
            unsupportedEncodingException0.initCause(unsupportedCharsetException0);
            throw unsupportedEncodingException0;
        }
    }

    public final String G(Charset charset0) {
        return this.size() == 0 ? "" : this.m(charset0);
    }

    public final String toStringUtf8() {
        return this.G(hfup.a);
    }

    static void I(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException(a.z(v1, v, "Index > length: ", ", ")) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    @Deprecated
    public final void J(byte[] arr_b, int v, int v1, int v2) {
        ByteString.q(v, v + v2, this.size());
        ByteString.q(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.e(arr_b, v, v1, v2);
        }
    }

    public final boolean isEmpty() {
        return this.size() == 0;
    }

    public final boolean L(ByteString hfsf0) {
        return this.size() >= hfsf0.size() && this.j(0, hfsf0.size()).equals(hfsf0);
    }

    public final byte[] toByteArray() {
        int v = this.size();
        if(v == 0) {
            return hfup.b;
        }
        byte[] arr_b = new byte[v];
        this.e(arr_b, 0, 0, v);
        return arr_b;
    }

    public abstract byte a(int arg1);

    public abstract byte b(int arg1);

    private static int c(String s, int v) {
        int v2;
        int v1 = s.charAt(v);
        if(v1 >= 0x30 && v1 <= 57) {
            v2 = v1 - 0x30;
        }
        else if(v1 >= 65 && v1 <= 70) {
            v2 = v1 - 55;
        }
        else {
            v2 = v1 < 97 || v1 > 102 ? -1 : v1 - 87;
        }
        if(v2 != -1) {
            return v2;
        }
        throw new NumberFormatException("Invalid hexString " + s + " must only contain [0-9a-fA-F] but contained " + s.charAt(v) + " at index " + v);
    }

    public abstract int size();

    protected abstract void e(byte[] arg1, int arg2, int arg3, int arg4);

    @Override
    public abstract boolean equals(Object arg1);

    protected abstract int f();

    private static ByteString g(Iterator iterator0, int v) {
        if(v > 0) {
            return v == 1 ? iterator0.next() : ByteString.g(iterator0, v >>> 1).t(ByteString.g(iterator0, v - (v >>> 1)));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", v));
    }

    protected abstract boolean h();

    @Override
    public final int hashCode() {
        int v = this.d;
        if(v == 0) {
            int v1 = this.size();
            v = this.i(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.d = v;
        }
        return v;
    }

    protected abstract int i(int arg1, int arg2, int arg3);

    @Override
    public Iterator iterator() {
        return this.s();
    }

    public abstract ByteString j(int arg1, int arg2);

    public abstract hfsl k();

    public abstract InputStream newInput();

    protected abstract String m(Charset arg1);

    public abstract ByteBuffer n();

    public abstract void o(hfrt arg1);

    public abstract void p(OutputStream arg1);

    static int q(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v >= 0) {
                throw v1 >= v ? new IndexOutOfBoundsException(a.z(v2, v1, "End index: ", " >= ")) : new IndexOutOfBoundsException(a.z(v1, v, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(a.f(v, "Beginning index: ", " < 0"));
        }
        return v3;
    }

    public static int r(byte b) {
        return b & 0xFF;
    }

    public hfry s() {
        return new hfru(this);
    }

    public final ByteString t(ByteString hfsf0) {
        if(0x7FFFFFFF - this.size() < hfsf0.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + this.size() + "+" + hfsf0.size());
        }
        if(hfsf0.size() != 0) {
            if(this.size() == 0) {
                return hfsf0;
            }
            int v = this.size() + hfsf0.size();
            if(v < 0x80) {
                return hfwb.g(this, hfsf0);
            }
            if((this instanceof hfwb)) {
                ByteString hfsf1 = ((hfwb)this).g;
                if(hfsf1.size() + hfsf0.size() < 0x80) {
                    ByteString hfsf2 = hfwb.g(hfsf1, hfsf0);
                    return new hfwb(((hfwb)this).f, hfsf2);
                }
                ByteString hfsf3 = ((hfwb)this).f;
                if(hfsf3.f() > hfsf1.f()) {
                    int v1 = hfsf0.f();
                    if(((hfwb)this).h > v1) {
                        return new hfwb(hfsf3, new hfwb(hfsf1, hfsf0));
                    }
                }
            }
            if(v >= hfwb.c(Math.max(this.f(), hfsf0.f()) + 1)) {
                return new hfwb(this, hfsf0);
            }
            ArrayDeque arrayDeque0 = new ArrayDeque();
            hfvy.a(this, arrayDeque0);
            hfvy.a(hfsf0, arrayDeque0);
            for(this = (ByteString)arrayDeque0.pop(); !arrayDeque0.isEmpty(); this = new hfwb(((ByteString)arrayDeque0.pop()), this)) {
            }
        }
        return this;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = Integer.toHexString(System.identityHashCode(this));
        Integer integer0 = this.size();
        return this.size() > 50 ? String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, hfwm.a(this.j(0, 0x2F)) + "...") : String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, hfwm.a(this));
    }

    public static ByteString u(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? ByteString.b : ByteString.g(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? ByteString.b : ByteString.g(iterable0.iterator(), v);
    }

    public static ByteString v(ByteBuffer byteBuffer0) {
        return ByteString.y(byteBuffer0, byteBuffer0.remaining());
    }

    public static ByteString copyFrom(byte[] arr_b) {
        return ByteString.z(arr_b, 0, arr_b.length);
    }

    public static ByteString x(String s, Charset charset0) {
        return new hfsb(s.getBytes(charset0));
    }

    public static ByteString y(ByteBuffer byteBuffer0, int v) {
        ByteString.q(0, v, byteBuffer0.remaining());
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return new hfsb(arr_b);
    }

    public static ByteString z(byte[] arr_b, int v, int v1) {
        ByteString.q(v, v + v1, arr_b.length);
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return new hfsb(arr_b1);
    }
}

