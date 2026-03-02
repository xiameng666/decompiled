import java.util.AbstractList;
import java.util.List;

public abstract class ibpa extends AbstractList implements ibvl, List {
    public abstract int b();

    public abstract Object d(int arg1);

    @Override
    public final Object remove(int v) {
        return this.d(v);
    }

    @Override
    public final int size() {
        return this.b();
    }
}

