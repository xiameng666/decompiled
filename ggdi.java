import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public final class ggdi extends gfyw {
    transient int c;
    private static final long serialVersionUID;

    public ggdi() {
        this(12, 2);
    }

    public ggdi(int v, int v1) {
        super(new ggav(v));
        this.c = 2;
        this.c = v1;
    }

    @Override  // gfyw
    public final Collection a() {
        return new ggax(this.c);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.c = 2;
        int v = objectInputStream0.readInt();
        this.t(new ggav(12));
        ggnr.b(this, objectInputStream0, v);
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        ggnr.c(this, objectOutputStream0);
    }
}

