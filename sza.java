import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class sza implements Iterable {
    public final List a;

    public sza() {
        this.a = new ArrayList();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}

