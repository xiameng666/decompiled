import java.util.Arrays;

public final class hmer extends hmeb {
    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9F1D");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = hmgz0;
    }

    public final boolean c() {
        return (((hmgz)this.a).a(0) & 4) == 4;
    }

    public final boolean d() {
        return !Arrays.equals(((hmgz)this.a).a, new byte[8]);
    }
}

