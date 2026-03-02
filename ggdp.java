import j..util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;

public abstract class ggdp extends ggeo implements gfzc, Map {
    private static final long serialVersionUID = 0xDECAFL;

    @Override  // gfzc
    public gfzc a() {
        throw null;
    }

    @Override  // gfzc
    public final Set b() {
        return this.h();
    }

    public abstract ggdp e();

    @Override  // ggeo
    public final ggds f() {
        throw new AssertionError("should never be called");
    }

    @Override  // ggeo
    public final ggds g() {
        return this.h();
    }

    public final ggfp h() {
        return this.e().w();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override  // ggeo
    public final Collection values() {
        return this.h();
    }

    @Override  // ggeo
    public Object writeReplace() {
        return new ggdo(this);
    }
}

