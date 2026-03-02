import java.util.Map;

public final class gbbd implements gcsn {
    private final gcso a;

    public gbbd(gcso gcso0) {
        this.a = gcso0;
    }

    @Override  // gcsn
    public final int a() {
        throw null;
    }

    @Override  // gcsn
    public final Object b() {
        gcso gcso0 = this.a;
        if(gcso0.d >= 200 && gcso0.d < 300) {
            return gcso0.a;
        }
        hhna hhna0 = gbbe.b(gcso0.a);
        throw new gcqz(hhna0, new clbw("Gms network request to endpoint " + gcso0.e + " failed with http status code " + gcso0.d + " and rpc status: " + hhna0));
    }

    @Override  // gcsn
    public final Map c() {
        return this.a.b;
    }
}

