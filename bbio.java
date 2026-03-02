import java.util.concurrent.TimeUnit;

public final class bbio extends bbiu {
    static {
        bboh.b("PrimesStatsUploadTask", bbcu.dH);
    }

    @Override  // bbiu
    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(hrul.a.o().t());
    }

    @Override  // bbiu
    public final String b() {
        return "primes";
    }

    @Override  // bbiu
    public final boolean c() {
        return hrul.a.o().B() && hrul.B();
    }

    @Override  // bbiu
    public final void d() {
        fokj.a().h();
    }
}

