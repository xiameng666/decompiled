import java.util.Arrays;

public final class hmen extends hmeb {
    public hmen() {
        try {
            this.b(new hmgz(3));
        }
        catch(hmdl unused_ex) {
        }
    }

    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9F33");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = hmgz0;
    }

    public final boolean c() {
        return ((hmgz)this.a).a(1) == 8;
    }

    public final boolean d() {
        return !Arrays.equals(((hmgz)this.a).a, new byte[3]);
    }

    public final boolean e(int v) {
        return (((hmgz)this.a).a(1) & 1 << v) != 0;
    }
}

