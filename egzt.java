import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class egzt {
    public final egzs a;
    public String b;
    public final List c;
    public final Map d;

    public egzt(egzs egzs0) {
        this.a = egzs0;
        this.d = new HashMap();
        this.c = new ArrayList();
    }

    public final void a(egzy egzy0) {
        if(this.b()) {
            List list0 = this.a.c;
            gged_interceptors gged0 = gged_interceptors.i(list0);
            if(!gged0.isEmpty()) {
                this.d.put(egzy0, gged0);
                list0.clear();
            }
            this.c.add(egzy0);
        }
    }

    public final boolean b() {
        return !this.a.c.isEmpty();
    }

    public final boolean c() {
        return !this.c.isEmpty() || this.b();
    }
}

