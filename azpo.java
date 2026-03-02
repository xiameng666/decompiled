import java.util.concurrent.Callable;

public final class azpo implements Callable {
    public final boolean a;
    public final String b;
    public final basd c;

    public azpo(boolean z, String s, basd basd0) {
        this.a = z;
        this.b = s;
        this.c = basd0;
    }

    @Override
    public final Object call() {
        return this.a || !azpy.e(this.b, this.c, true, false).b ? String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", "not allowed", this.b, this.c.c(), Boolean.valueOf(this.a), "253434029.true") : String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", "debug cert rejected", this.b, this.c.c(), Boolean.valueOf(this.a), "253434029.true");
    }
}

