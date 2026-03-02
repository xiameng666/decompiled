import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;

public class ggft extends ggfd implements ggns {
    private transient ggfp a;
    private final transient ggfp emptySet;
    private static final long serialVersionUID;

    public ggft(ggeo ggeo0, int v) {
        super(ggeo0, v);
        this.emptySet = ggft.f(null);
    }

    @Override  // ggns
    @Deprecated
    public final Set G(Object object0) {
        throw null;
    }

    @Override  // ggns
    @Deprecated
    public final void H(Object object0, Iterable iterable0) {
        throw null;
    }

    @Override  // ggfd
    public final ggds a(Object object0) {
        return this.e(object0);
    }

    public final ggfp b() {
        ggfp ggfp0 = this.a;
        if(ggfp0 == null) {
            ggfp0 = new ggfr(this);
            this.a = ggfp0;
        }
        return ggfp0;
    }

    @Override  // ggfd, ggla
    public final Collection c(Object object0) {
        return this.e(object0);
    }

    @Override  // ggfd, ggla
    @Deprecated
    public final Collection d(Object object0) {
        throw null;
    }

    public final ggfp e(Object object0) {
        return (ggfp)MoreObjects.firstNonNull(((ggfp)this.map.get(object0)), this.emptySet);
    }

    private static ggfp f(Comparator comparator0) {
        return comparator0 == null ? ggnj.a : gggc.W(comparator0);
    }

    @Override  // ggns
    public final Set g() {
        throw null;
    }

    @Override  // ggns
    public final Set h(Object object0) {
        throw null;
    }

    @Override  // ggfd
    public final ggds n() {
        return this.b();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        ggeo ggeo0;
        objectInputStream0.defaultReadObject();
        Comparator comparator0 = (Comparator)objectInputStream0.readObject();
        int v = objectInputStream0.readInt();
        if(v < 0) {
            throw new InvalidObjectException("Invalid key count " + v);
        }
        ggek ggek0 = new ggek();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            Object object0 = Objects.requireNonNull(objectInputStream0.readObject());
            int v3 = objectInputStream0.readInt();
            if(v3 <= 0) {
                throw new InvalidObjectException("Invalid value count " + v3);
            }
            ggfn ggfn0 = comparator0 == null ? new ggfn() : new ggga(comparator0);
            for(int v4 = 0; v4 < v3; ++v4) {
                ggfn0.i(Objects.requireNonNull(objectInputStream0.readObject()));
            }
            ggfp ggfp0 = ggfn0.h();
            if(ggfp0.size() != v3) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object0);
            }
            ggek0.i(object0, ggfp0);
            v2 += v3;
            ++v1;
            continue;
        }
        try {
            ggeo0 = ggek0.b();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw (InvalidObjectException)new InvalidObjectException(illegalArgumentException0.getMessage()).initCause(illegalArgumentException0);
        }
        ggfb.a.b(this, ggeo0);
        ggfb.b.a(this, v2);
        ggfp ggfp1 = ggft.f(comparator0);
        ggfs.a.b(this, ggfp1);
    }

    @Override  // ggfd, ggla
    public final Collection w() {
        return this.b();
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(((this.emptySet instanceof gggc) ? ((gggc)this.emptySet).b : null));
        ggnr.c(this, objectOutputStream0);
    }
}

