import android.location.Location;
import j..util.Objects;
import java.util.concurrent.ExecutionException;

final class fxkq implements gmbg {
    final gmcd a;
    final fxkt b;

    public fxkq(fxkt fxkt0, gmcd gmcd0) {
        this.a = gmcd0;
        Objects.requireNonNull(fxkt0);
        this.b = fxkt0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        gxel gxel0 = (gxel)object0;
        try {
            gxel gxel1 = (gxel)gmbu.r(this.a);
            if(gxel1 != null && (gxel1.b & 2) != 0) {
                synchronized(this) {
                    fxkt fxkt0 = this.b;
                    fxmv fxmv0 = fxkt0.a;
                    fxmv0.d(1);
                    if(fxkt0.b != fxob.a) {
                        return;
                    }
                    fxmv0.d(2);
                    ggzv ggzv0 = new ggzv(new ggyi(ggym.ab(gxel1.e)).e());
                    Location location0 = new Location("cache");
                    location0.setLatitude(ggzv0.b());
                    location0.setLongitude(ggzv0.c());
                    fxkt0.c(location0);
                }
            }
        }
        catch(ExecutionException | NumberFormatException unused_ex) {
        }
    }
}

