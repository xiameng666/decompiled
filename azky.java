import java.util.function.Supplier;

public final class azky implements Supplier {
    public final azla a;
    public final int b;
    public final int c;

    public azky(azla azla0, int v, int v1) {
        this.a = azla0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final Object get() {
        this.a.d.b("MISSING_PROJECT_CONFIG", this.b, this.c);
        return new cjuh(10, String.format("Project not found in the Cobalt Mendel flag: %d-%d", ((int)this.b), ((int)this.c)));
    }
}

