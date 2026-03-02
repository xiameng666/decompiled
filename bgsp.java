import android.location.Location;
import j..util.Objects;

final class bgsp implements gmbg {
    final bgsq a;

    public bgsp(bgsq bgsq0) {
        Objects.requireNonNull(bgsq0);
        this.a = bgsq0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        gxel gxel0 = (gxel)object0;
        if(gxel0 != null) {
            try {
                if((gxel0.b & 2) != 0) {
                    ggzv ggzv0 = new ggzv(ggym.ab(gxel0.e).I());
                    Location location0 = new Location("cache");
                    location0.setLatitude(ggzv0.b());
                    location0.setLongitude(ggzv0.c());
                    this.a.c(location0);
                }
            }
            catch(NumberFormatException unused_ex) {
            }
        }
    }
}

