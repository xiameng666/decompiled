import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

public final class fogu implements azuk {
    public final gmcu a;
    public final Executor b;
    public final gfsi c;

    public fogu(gmcu gmcu0, Executor executor0, gfsi gfsi0) {
        this.a = gmcu0;
        this.b = executor0;
        this.c = gfsi0;
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        Status status0 = azuj0.a();
        if(status0.i == 14) {
            throw new AssertionError("We never use the blocking API for these calls: " + azuj0);
        }
        gmcu gmcu0 = this.a;
        if(!status0.e()) {
            gmcu0.r(new fogk(azuj0, status0));
            fogx.b(azuj0);
            return;
        }
        fogt fogt0 = new fogt(gmcu0, this.c, azuj0);
        this.b.execute(fogt0);
    }
}

