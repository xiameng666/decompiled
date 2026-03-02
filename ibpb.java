import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class ibpb extends AbstractMap implements ibvn, Map {
    public int b() {
        throw null;
    }

    public Collection d() {
        return super.values();
    }

    public abstract Set e();

    @Override
    public final Set entrySet() {
        return this.e();
    }

    public Set f() {
        throw null;
    }

    @Override
    public final Set keySet() {
        return this.f();
    }

    @Override
    public final int size() {
        return this.b();
    }

    @Override
    public final Collection values() {
        return this.d();
    }
}

