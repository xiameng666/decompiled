import java.util.concurrent.atomic.AtomicLong;

public final class iaml {
    public final long a;
    private static final AtomicLong b;
    private final String c;
    private final String d;

    static {
        iaml.b = new AtomicLong();
    }

    public iaml(String s, String s1, long v) {
        gftb.z(s, "typeName");
        gftb.b(((boolean)(s.isEmpty() ^ 1)), "empty type");
        this.c = s;
        this.d = s1;
        this.a = v;
    }

    public static iaml a(Class class0, String s) {
        gftb.z(class0, "type");
        return iaml.b((class0.getSimpleName().isEmpty() ? class0.getName().substring(class0.getPackage().getName().length() + 1) : class0.getSimpleName()), s);
    }

    public static iaml b(String s, String s1) {
        return new iaml(s, s1, iaml.b.incrementAndGet());
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.c + "<" + this.a + ">");
        String s = this.d;
        if(s != null) {
            stringBuilder0.append(": (");
            stringBuilder0.append(s);
            stringBuilder0.append(')');
        }
        return stringBuilder0.toString();
    }
}

