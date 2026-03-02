import android.content.Context;
import java.util.Collections;

public final class hbrg implements hbqo {
    private gpew a;
    private final gpew b;
    private final hbqp c;

    public hbrg(Context context0, hbqp hbqp0) {
        this.c = hbqp0;
        yho.b(context0);
        yhn yhn0 = yho.a().c();
        if(Collections.singleton(new yhi("proto")).contains(new yhi("json"))) {
            this.a = new gpar(new hbrd(yhn0));
        }
        this.b = new gpar(new hbre(yhn0));
    }

    @Override  // hbqo
    public final void a(hbrb hbrb0) {
        hbqp hbqp0 = this.c;
        if(hbqp0.c == 0) {
            gpew gpew0 = this.a;
            if(gpew0 != null) {
                ((yhm)gpew0.a()).a(hbrg.b(hbqp0, hbrb0));
            }
            return;
        }
        ((yhm)this.b.a()).a(hbrg.b(hbqp0, hbrb0));
    }

    static yhj b(hbqp hbqp0, hbrb hbrb0) {
        return hbrb0.c == 0 ? new yhj(hbrb0.a(hbqp0.c), 2) : new yhj(hbrb0.a(hbqp0.c), 1);
    }
}

