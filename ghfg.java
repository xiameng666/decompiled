import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class ghfg implements ghga {
    @Override  // ghga
    public void f(char c) {
        this.e(((byte)c));
        this.e(((byte)(c >>> 8)));
    }

    @Override  // ghhc
    public void g(long v) {
        this.k(v);
    }

    @Override  // ghga
    public void h(ByteBuffer byteBuffer0) {
        throw null;
    }

    @Override  // ghga
    public void i(byte[] arr_b, int v, int v1) {
        throw null;
    }

    @Override  // ghga
    public void j(int v) {
        this.e(((byte)v));
        this.e(((byte)(v >>> 8)));
        this.e(((byte)(v >>> 16)));
        this.e(((byte)(v >> 24)));
    }

    @Override  // ghga
    public void k(long v) {
        for(int v1 = 0; v1 < 0x40; v1 += 8) {
            this.e(((byte)(((int)(v >>> v1)))));
        }
    }

    @Override  // ghga
    public void l(byte[] arr_b) {
        this.i(arr_b, 0, arr_b.length);
    }

    @Override  // ghga
    public ghga m(CharSequence charSequence0, Charset charset0) {
        this.l(charSequence0.toString().getBytes(charset0));
        return this;
    }

    @Override  // ghga
    public final void n(CharSequence charSequence0) {
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            this.f(charSequence0.charAt(v1));
        }
    }

    @Override  // ghga
    public final void o(Object object0) {
        this.g(((Long)object0).longValue());
    }
}

