import android.content.Context;
import j..util.Objects;

public final class zli implements gful_cronetEngineProvider {
    public final Context a;
    public final hoka b;
    public final zed c;
    public final aavz d;

    public zli(Context context0, hoka hoka0, zed zed0, aavz aavz0) {
        this.a = context0;
        this.b = hoka0;
        this.c = zed0;
        this.d = aavz0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0 = new zec(new bbfe_BaseGrpcServer(this.a, this.b.c, this.b.d, this.c));
        Objects.requireNonNull(object0);
        zlk zlk0 = new zlk(((zec)object0));
        this.d.a(zlk0);
        return object0;
    }
}

