import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class gqdd extends gqad {
    private final gqdg a;

    public gqdd(gqdg gqdg0) {
        this.a = gqdg0;
    }

    @Override  // gqad
    public final Object a(gqff gqff0) {
        if(gqff0.u() == 9) {
            gqff0.p();
            return null;
        }
        Object object0 = this.c();
        Map map0 = this.a.b;
        try {
            gqff0.m();
            while(gqff0.s()) {
                gqde gqde0 = (gqde)map0.get(gqff0.h());
                if(gqde0 == null) {
                    gqff0.r();
                }
                else {
                    this.f(object0, gqff0, gqde0);
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
            throw new gpzy(illegalStateException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw gqev.b(illegalAccessException0);
        }
        gqff0.o();
        return this.e(object0);
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        Object object2;
        if(object0 == null) {
            gqfh0.j();
            return;
        }
        gqfh0.f();
        try {
            for(Object object1: this.a.c) {
                gqde gqde0 = (gqde)object1;
                if(gqde0.d) {
                    Method method0 = gqde0.e;
                    if(method0 == null) {
                        gqdi.b(object0, gqde0.b);
                    }
                    else {
                        gqdi.b(object0, method0);
                    }
                }
                Method method1 = gqde0.e;
                if(method1 == null) {
                    object2 = gqde0.b.get(object0);
                }
                else {
                    try {
                        object2 = method1.invoke(object0, null);
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        throw new gpzr(a.a(gqev.e(gqde0.e, false), "Accessor ", " threw exception"), invocationTargetException0.getCause());
                    }
                }
                if(object2 != object0) {
                    gqfh0.i(gqde0.a);
                    gqde0.f.b(gqfh0, object2);
                }
            }
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw gqev.b(illegalAccessException0);
        }
        gqfh0.h();
    }

    public abstract Object c();

    public abstract Object e(Object arg1);

    public abstract void f(Object arg1, gqff arg2, gqde arg3);
}

