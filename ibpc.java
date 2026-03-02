import java.util.AbstractSet;
import java.util.Set;

public abstract class ibpc extends AbstractSet implements ibvo, Set {
    public abstract int a();

    @Override
    public final int size() {
        return this.a();
    }
}

