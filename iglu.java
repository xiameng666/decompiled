import j..util.Objects;
import java.util.HashMap;

final class iglu extends HashMap {
    final iglv a;

    public iglu(iglv iglv0) {
        Objects.requireNonNull(iglv0);
        this.a = iglv0;
        super();
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.a.b.put((((String)object0) == null ? ((String)object0) : ((String)object0).toLowerCase()), ((String)object1));
        return (String)super.put(((String)object0), ((String)object1));
    }
}

