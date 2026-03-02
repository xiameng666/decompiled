import j..util.DesugarCollections;
import java.util.List;

public final class sup {
    public final List a;
    public final int b;

    public sup(List list0, int v) {
        this.a = DesugarCollections.unmodifiableList(list0);
        this.b = v;
    }
}

