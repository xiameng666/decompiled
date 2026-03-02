import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

public final class gozv {
    public final Set a;
    public final Set b;
    public final int c;
    public final gpaa d;
    public final Set e;
    private final int f;

    public gozv(Set set0, Set set1, int v, int v1, gpaa gpaa0, Set set2) {
        this.a = DesugarCollections.unmodifiableSet(set0);
        this.b = DesugarCollections.unmodifiableSet(set1);
        this.c = v;
        this.f = v1;
        this.d = gpaa0;
        this.e = DesugarCollections.unmodifiableSet(set2);
    }

    public static gozu a(gpay gpay0) {
        return new gozu(gpay0, new gpay[0]);
    }

    public static gozu b(Class class0) {
        return new gozu(class0, new Class[0]);
    }

    public static gozu c(Class class0) {
        gozu gozu0 = gozv.b(class0);
        gozu0.a = 1;
        return gozu0;
    }

    public static gozv d(Object object0, Class class0) {
        gozu gozu0 = gozv.c(class0);
        gozu0.b = new gozs(object0);
        return gozu0.a();
    }

    @SafeVarargs
    public static gozv e(Object object0, Class class0, Class[] arr_class) {
        gozu gozu0 = new gozu(class0, arr_class);
        gozu0.b = new gozt(object0);
        return gozu0.a();
    }

    public final boolean f() {
        return this.f == 0;
    }

    @Override
    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}

