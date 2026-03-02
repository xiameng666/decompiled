import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

public abstract class ggke extends AbstractMap {
    public abstract Iterator b();

    @Override
    public void clear() {
        gghd.m(this.b());
    }

    @Override
    public final Set entrySet() {
        return new ggkd(this);
    }
}

