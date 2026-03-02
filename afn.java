import j..util.DesugarCollections;
import java.util.List;

public final class afn {
    private final List a;
    private final List b;

    public afn(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.b);
    }
}

