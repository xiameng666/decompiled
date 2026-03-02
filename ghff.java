import java.nio.charset.Charset;

public abstract class ghff implements ghfz {
    @Override  // ghfz
    public final ghfy a(byte[] arr_b) {
        return this.f(arr_b, arr_b.length);
    }

    @Override  // ghfz
    public ghfy b(long v) {
        ghga ghga0 = this.e(8);
        ghga0.k(v);
        return ghga0.s();
    }

    @Override  // ghfz
    public ghfy c(CharSequence charSequence0, Charset charset0) {
        return this.h().m(charSequence0, charset0).s();
    }

    @Override  // ghfz
    public ghfy d(CharSequence charSequence0) {
        int v = charSequence0.length();
        ghga ghga0 = this.e(v + v);
        ghga0.n(charSequence0);
        return ghga0.s();
    }

    public ghga e(int v) {
        gftb.d(v >= 0, "expectedInputSize must be >= 0 but was %s", v);
        return this.h();
    }

    public ghfy f(byte[] arr_b, int v) {
        gftb.p(0, v, arr_b.length);
        ghga ghga0 = this.e(v);
        ghga0.i(arr_b, 0, v);
        return ghga0.s();
    }

    @Override  // ghfz
    public final ghfy g(Object object0) {
        ghga ghga0 = this.h();
        ghga0.o(object0);
        return ghga0.s();
    }
}

