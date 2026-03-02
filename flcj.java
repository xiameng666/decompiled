import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class flcj implements iakw {
    static final iaoa a;
    public volatile String b;
    public volatile gmcu c;
    private final Context d;

    static {
        flcj.a = new iant("X-Goog-Spatula", iaof_metadata.c);
    }

    public flcj(Context context0) {
        this.d = context0;
        this.b();
    }

    @Override  // iakw
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0, iakr iakr0) {
        try {
            ((glyq)this.b()).v(20L, TimeUnit.SECONDS);
            return new flci(this, iakr0.a(iaoj0, iakq0));
        }
        catch(Exception exception0) {
            flbj.c("ClntIntrcptrFctryV12", "Error connecting GoogleApiClient: " + exception0.getMessage());
            return new flci(this, iakr0.a(iaoj0, iakq0));
        }
    }

    public final gmcd b() {
        gmcu gmcu0;
        synchronized(this) {
            gmcd gmcd0 = this.c;
            if(gmcd0 != null) {
                return gmcd0;
            }
            gmcu0 = new gmcu();
            this.c = gmcu0;
            aztt aztt0 = new aztt(this.d);
            aztt0.c(adsv.a);
            aztw aztw0 = aztt0.a();
            aztw0.j(new flch(this, aztw0, gmcu0));
            aztw0.k(new flcf(this, gmcu0, aztw0));
            aztw0.f();
        }
        return gmcu0;
    }
}

