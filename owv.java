import java.lang.reflect.Method;

final class owv {
    public static final Method a() {
        return (Method)oww.b.a();
    }

    public static final Method b() {
        return (Method)oww.a.a();
    }
}

