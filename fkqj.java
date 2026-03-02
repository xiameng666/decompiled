import android.content.Context;
import java.util.concurrent.TimeUnit;

final class fkqj implements fkpz {
    private final Context a;
    private final ayud b;
    private final fkqn c;

    public fkqj(Context context0, ayud ayud0, fkqn fkqn0) {
        this.a = context0;
        this.b = ayud0;
        this.c = fkqn0;
    }

    @Override  // fkpz
    public final void a(fkpq fkpq0, fkpo fkpo0) {
        icwk icwk0 = new icwk();
        ayvm ayvm0 = fhbe.b(this.a, icwk0);
        ayud ayud0 = this.b;
        ayuc ayuc0 = ayud0.j(((MessageLite)fkpo0), ayvm0);
        ayuc0.k(fkpq0.y);
        ayuc0.d();
        if(this.c.a()) {
            ayud0.e(10L, TimeUnit.SECONDS);
        }
    }
}

