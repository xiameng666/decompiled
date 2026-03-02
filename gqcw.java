import j..util.Objects;
import java.util.Map.Entry;
import java.util.Map;

final class gqcw extends gqad {
    private final gqad a;
    private final gqad b;
    private final gqbv c;

    public gqcw(gqcx gqcx0, gqad gqad0, gqad gqad1, gqbv gqbv0) {
        Objects.requireNonNull(gqcx0);
        super();
        this.a = gqad0;
        this.b = gqad1;
        this.c = gqbv0;
    }

    @Override  // gqad
    public final Object a(gqff gqff0) {
        int v1;
        int v = gqff0.u();
        if(v == 9) {
            gqff0.p();
            return null;
        }
        Object object0 = (Map)this.c.a();
        if(v == 1) {
            gqff0.l();
            while(gqff0.s()) {
                gqff0.l();
                Object object1 = this.a.a(gqff0);
                if(((Map)object0).put(object1, this.b.a(gqff0)) != null) {
                    throw new gpzy("duplicate key: " + object1);
                }
                gqff0.n();
                continue;
            }
            gqff0.n();
            return object0;
        }
        gqff0.m();
        while(gqff0.s()) {
            switch((gqff0.d == 0 ? gqff0.b() : gqff0.d)) {
                case 12: {
                    v1 = 8;
                    break;
                }
                case 13: {
                    v1 = 9;
                    break;
                }
                case 14: {
                    v1 = 10;
                    break;
                }
                default: {
                    throw gqff0.d("a name");
                }
            }
            gqff0.d = v1;
            Object object2 = this.a.a(gqff0);
            if(((Map)object0).put(object2, this.b.a(gqff0)) != null) {
                throw new gpzy("duplicate key: " + object2);
            }
        }
        gqff0.o();
        return object0;
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        if(((Map)object0) == null) {
            gqfh0.j();
            return;
        }
        gqfh0.f();
        for(Object object1: ((Map)object0).entrySet()) {
            gqfh0.i(String.valueOf(((Map.Entry)object1).getKey()));
            Object object2 = ((Map.Entry)object1).getValue();
            this.b.b(gqfh0, object2);
        }
        gqfh0.h();
    }
}

