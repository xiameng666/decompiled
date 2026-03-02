import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;
import java.util.Set;

final class azxl implements baqj {
    public final azsz a;
    public final azux b;
    public bary c;
    public Set d;
    public boolean e;
    final azxm f;

    public azxl(azxm azxm0, azsz azsz0, azux azux0) {
        Objects.requireNonNull(azxm0);
        this.f = azxm0;
        super();
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = azsz0;
        this.b = azux0;
    }

    @Override  // baqj
    public final void a(ConnectionResult connectionResult0) {
        azxk azxk0 = new azxk(this, connectionResult0);
        this.f.n.post(azxk0);
    }

    public final void b(ConnectionResult connectionResult0) {
        azxi azxi0 = (azxi)this.f.k.get(this.b);
        if(azxi0 != null) {
            azxi0.i(connectionResult0);
        }
    }

    public final void c() {
        if(this.e) {
            bary bary0 = this.c;
            if(bary0 != null) {
                this.a.z(bary0, this.d);
            }
        }
    }
}

