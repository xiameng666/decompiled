import j..util.Objects;
import java.util.Arrays;

final class czqc extends fguy {
    final int a;
    final czri b;

    public czqc(czri czri0, int v) {
        this.a = v;
        Objects.requireNonNull(czri0);
        this.b = czri0;
        super();
    }

    @Override  // fguy
    public final byte[] a(int v) {
        czqf czqf0 = (czqf)this.b.h.get(Integer.valueOf(this.a));
        return czqf0 == null ? new byte[0] : Arrays.copyOfRange(czqf0.b, v, czqf0.b.length);
    }
}

