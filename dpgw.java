import java.io.IOException;

public final class dpgw implements gful_cronetEngineProvider {
    public final dpha a;
    public final long b;

    public dpgw(dpha dpha0, long v) {
        this.a = dpha0;
        this.b = v;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        long v = 0L;
        try {
            v = this.a.a.b(String.valueOf(this.b), 0L);
        }
        catch(IOException unused_ex) {
        }
        return v;
    }
}

