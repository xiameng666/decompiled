import java.util.Map;

public final class eswr implements Runnable {
    public final eswy a;
    public final eswu b;

    public eswr(eswy eswy0, eswu eswu0) {
        this.a = eswy0;
        this.b = eswu0;
    }

    @Override
    public final void run() {
        eswu eswu0 = this.b;
        ibuq.f(eswu0, "event");
        esxe esxe0 = this.a.j;
        Map map0 = (Map)esxe0.d.get(esxe0.c);
        Object object0 = map0 == null ? null : map0.get(eswu0);
        if(object0 != null) {
            if(!ibuq.m(object0, esxe0.c)) {
                Object object1 = esxe0.c;
                esxe0.c = object0;
                ibtw ibtw0 = esxe0.b;
                if(ibtw0 != null) {
                    ibtw0.a(object1, object0);
                }
            }
            return;
        }
        ((ggtj)esxe.a.j()).R("Invalid state transition, from: %s, event: %s", esxe0.c, eswu0);
    }
}

