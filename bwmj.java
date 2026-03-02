import j..util.Objects;

public final class bwmj {
    public final bwmx a;

    public bwmj(bwmx bwmx0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super();
    }

    public final void a(String s) {
        bwmx bwmx0 = this.a;
        if(!bwmx0.s && s.equals("com.google.android.gms")) {
            bwne.s("Skipping remove pkg from self resource");
            return;
        }
        bwmx0.y(s);
    }
}

