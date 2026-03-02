import java.lang.annotation.Annotation;
import java.util.Map;

public final class gpcw {
    public final String a;
    private final Map b;

    public gpcw(String s, Map map0) {
        this.a = s;
        this.b = map0;
    }

    public final Annotation a(Class class0) {
        return (Annotation)this.b.get(class0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof gpcw) ? this.a.equals(((gpcw)object0).a) && this.b.equals(((gpcw)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.b.values());
        return "FieldDescriptor{name=" + this.a + ", properties=" + s + "}";
    }
}

