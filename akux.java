import android.os.Handler;
import j..util.Objects;
import java.util.Map;

final class akux extends akzg {
    final akvf a;

    public akux(akvf akvf0, Handler handler0) {
        Objects.requireNonNull(akvf0);
        this.a = akvf0;
        super(handler0);
    }

    @Override  // akzg
    public final void a(Map map0) {
        akvf.i(this.a);
        this.a.q = map0;
        this.a.d();
    }

    @Override  // akzg
    public final void b() {
        akvf.a.m("Error fetching device data.", new Object[0]);
        akvf.i(this.a);
        this.a.b();
    }
}

