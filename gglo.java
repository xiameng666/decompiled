import j..util.Objects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class gglo extends gfxo {
    transient gful_cronetEngineProvider c;
    private static final long serialVersionUID;

    public gglo(Map map0, gful_cronetEngineProvider gful0) {
        super(map0);
        this.c = gful0;
    }

    @Override  // gfxo
    public final Collection a() {
        return (List)this.c.mr();
    }

    @Override  // gfyj
    public final Map o() {
        return this.p();
    }

    @Override  // gfyj
    public final Set q() {
        return this.r();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.c = (gful_cronetEngineProvider)Objects.requireNonNull(objectInputStream0.readObject());
        this.t(((Map)Objects.requireNonNull(objectInputStream0.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.c);
        objectOutputStream0.writeObject(this.a);
    }
}

