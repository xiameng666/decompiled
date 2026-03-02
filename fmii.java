import java.util.concurrent.Callable;

public final class fmii implements Callable {
    public final gmcd a;
    public final gmcd b;

    public fmii(gmcd gmcd0, gmcd gmcd1) {
        this.a = gmcd0;
        this.b = gmcd1;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(((Boolean)gmbu.r(this.a)).booleanValue() && ((Boolean)gmbu.r(this.b)).booleanValue());
    }
}

