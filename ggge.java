import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ggge extends gfyy implements Serializable {
    private static final long serialVersionUID = 0xDECAFL;

    @Override  // gfyy
    @Deprecated
    public final Object b(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override  // gfyy
    @Deprecated
    public final Object c(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // gfyy
    public final Iterator e() {
        throw new AssertionError("should never be called");
    }

    @Override  // gfyy
    public final Set f() {
        return this.q();
    }

    @Override  // gfyy
    public final Set h() {
        return this.s();
    }

    @Override  // gfyy
    @Deprecated
    public final void i() {
        throw new UnsupportedOperationException();
    }

    public abstract ggeo l();

    public abstract ggeo m();

    @Override  // ggpj
    public Map p() {
        throw null;
    }

    public final ggfp q() {
        return (ggfp)super.f();
    }

    public final ggfp r() {
        return this.l().w();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ggfp s() {
        return this.m().w();
    }

    public static ggpi t(Object object0, Object object1, Object object2) {
        gftb.z(object0, "rowKey");
        gftb.z(object1, "columnKey");
        gftb.z(object2, "value");
        return new ggpl(object0, object1, object2);
    }

    abstract Object writeReplace();
}

