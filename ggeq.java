import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map.Entry;

abstract class ggeq extends ggfp {
    public abstract ggeo a();

    @Override  // ggds
    public final boolean contains(Object object0) {
        if((object0 instanceof Map.Entry)) {
            Object object1 = this.a().get(((Map.Entry)object0).getKey());
            return object1 != null && object1.equals(((Map.Entry)object0).getValue());
        }
        return false;
    }

    @Override  // ggfp
    public final int hashCode() {
        return this.a().hashCode();
    }

    @Override  // ggds
    public final boolean oo() {
        return this.a().c();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override
    public final int size() {
        return this.a().size();
    }

    @Override  // ggfp
    public final boolean w() {
        return false;
    }

    @Override  // ggfp
    public Object writeReplace() {
        return new ggep(this.a());
    }
}

