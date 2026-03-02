import j..util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class gqde {
    final String a;
    final Field b;
    final String c;
    final boolean d;
    final Method e;
    final gqad f;
    final gqad g;
    final boolean h;
    final boolean i;

    public gqde(gqdi gqdi0, String s, Field field0, boolean z, Method method0, gqad gqad0, gqad gqad1, boolean z1, boolean z2) {
        this.d = z;
        this.e = method0;
        this.f = gqad0;
        this.g = gqad1;
        this.h = z1;
        this.i = z2;
        Objects.requireNonNull(gqdi0);
        super();
        this.a = s;
        this.b = field0;
        this.c = field0.getName();
    }
}

