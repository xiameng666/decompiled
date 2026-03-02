import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

public final class atzl {
    public final Set a;

    public atzl() {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }
}

