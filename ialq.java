import java.util.logging.Logger;

public final class ialq {
    static final Logger a;
    public static final ialq b;

    static {
        ialq.a = Logger.getLogger(ialq.class.getName());
        ialq.b = new ialq();
    }

    public final ialq a() {
        ialq ialq0 = ialo.a.b(this);
        return ialq0 == null ? ialq.b : ialq0;
    }

    public static ialq b() {
        ialq ialq0 = ialo.a.a();
        return ialq0 == null ? ialq.b : ialq0;
    }

    public final void c(ialq ialq0) {
        ialq.d(ialq0, "toAttach");
        ialo.a.c(this, ialq0);
    }

    public static void d(Object object0, Object object1) {
        if(object0 != null) {
            return;
        }
        throw new NullPointerException(((String)object1));
    }
}

