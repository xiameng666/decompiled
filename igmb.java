import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class igmb {
    public long a;
    public final List b;

    public igmb() {
        this.b = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(iglj iglj0) {
        this.b.remove(iglj0);
    }
}

