import j..util.DesugarCollections;
import j..util.Objects;
import java.util.List;
import java.util.Set;

public final class afp extends ajk {
    public final String a;
    final List b;
    private Set c;

    public afp(String s, List list0) {
        this.a = (String)Objects.requireNonNull(s);
        this.b = (List)Objects.requireNonNull(list0);
    }

    public final Set a() {
        if(this.c == null) {
            this.c = DesugarCollections.unmodifiableSet(new bxf(this.b));
        }
        return this.c;
    }
}

