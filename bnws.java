import java.util.TreeSet;
import java.util.concurrent.Callable;

public final class bnws implements Callable {
    public final TreeSet a;

    public bnws(TreeSet treeSet0) {
        this.a = treeSet0;
    }

    @Override
    public final Object call() {
        return this.a;
    }
}

