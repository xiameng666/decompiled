import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class gqdb extends gqad {
    public static final gqae a;
    private final gpzl b;
    private final gqab c;

    static {
        gqdb.a = new gqda(gqab.a);
    }

    public gqdb(gpzl gpzl0, gqab gqab0) {
        this.b = gpzl0;
        this.c = gqab0;
    }

    @Override  // gqad
    public final Object a(gqff gqff0) {
        int v = gqff0.u();
        Object object0 = gqdb.e(gqff0, v);
        if(object0 == null) {
            return this.c(gqff0, v);
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        while(true) {
            if(gqff0.s()) {
                String s = (object0 instanceof Map) ? gqff0.h() : null;
                int v1 = gqff0.u();
                Object object1 = gqdb.e(gqff0, v1);
                Object object2 = object1 == null ? this.c(gqff0, v1) : object1;
                if((object0 instanceof List)) {
                    ((List)object0).add(object2);
                }
                else {
                    ((Map)object0).put(s, object2);
                }
                if(object1 == null) {
                    continue;
                }
                arrayDeque0.addLast(object0);
                object0 = object2;
            }
            else {
                if((object0 instanceof List)) {
                    gqff0.n();
                }
                else {
                    gqff0.o();
                }
                if(arrayDeque0.isEmpty()) {
                    break;
                }
                object0 = arrayDeque0.removeLast();
            }
        }
        return object0;
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        if(object0 == null) {
            gqfh0.j();
            return;
        }
        Class class0 = object0.getClass();
        gqad gqad0 = this.b.b(class0);
        if((gqad0 instanceof gqdb)) {
            gqfh0.f();
            gqfh0.h();
            return;
        }
        gqad0.b(gqfh0, object0);
    }

    private final Object c(gqff gqff0, int v) {
        switch(v - 1) {
            case 5: {
                return gqff0.j();
            }
            case 6: {
                return this.c.a(gqff0);
            }
            case 7: {
                return Boolean.valueOf(gqff0.t());
            }
            case 8: {
                gqff0.p();
                return null;
            }
            default: {
                throw new IllegalStateException("Unexpected token: " + gqfg.a(v));
            }
        }
    }

    private static final Object e(gqff gqff0, int v) {
        switch(v - 1) {
            case 0: {
                gqff0.l();
                return new ArrayList();
            }
            case 2: {
                gqff0.m();
                return new gqbt();
            }
            default: {
                return null;
            }
        }
    }
}

