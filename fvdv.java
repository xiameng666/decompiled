import j..util.DesugarCollections;
import java.util.Collection;

public final class fvdv {
    public final Collection a;
    public final Collection b;

    public fvdv(Collection collection0, Collection collection1) {
        this.a = DesugarCollections.unmodifiableCollection(collection0);
        this.b = DesugarCollections.unmodifiableCollection(collection1);
    }
}

