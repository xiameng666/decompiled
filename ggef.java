import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class ggef extends ggfd implements gghp {
    private static final long serialVersionUID;

    public ggef(ggeo ggeo0, int v) {
        super(ggeo0, v);
    }

    @Override  // ggfd
    public final ggds a(Object object0) {
        return this.b(object0);
    }

    public final gged_interceptors b(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)this.map.get(object0);
        return gged0 == null ? ggna.a : gged0;
    }

    @Override  // ggfd, ggla
    public final Collection c(Object object0) {
        return this.b(object0);
    }

    @Override  // ggfd, ggla
    @Deprecated
    public final Collection d(Object object0) {
        return ggef.f();
    }

    public static ggef e(ggla ggla0) {
        if(ggla0.C()) {
            return ggby.a;
        }
        Set set0 = ggla0.y().entrySet();
        if(set0.isEmpty()) {
            return ggby.a;
        }
        ggek ggek0 = new ggek(set0.size());
        int v = 0;
        for(Object object0: set0) {
            Object object1 = ((Map.Entry)object0).getKey();
            gged_interceptors gged0 = gged_interceptors.i(((Collection)((Map.Entry)object0).getValue()));
            if(!gged0.isEmpty()) {
                ggek0.i(object1, gged0);
                v += gged0.size();
            }
        }
        return new ggef(ggek0.b(), v);
    }

    @Deprecated
    public static final gged_interceptors f() {
        throw new UnsupportedOperationException();
    }

    @Override  // gghp
    public final List g(Object object0) {
        return this.b(object0);
    }

    @Override  // gghp
    @Deprecated
    public final List h(Object object0) {
        return ggef.f();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        ggeo ggeo0;
        objectInputStream0.defaultReadObject();
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
            ggdy ggdy0 = new ggdy();
            for(int v4 = 0; v4 < v3; ++v4) {
                ggdy0.i(Objects.requireNonNull(objectInputStream0.readObject()));
            }
            ggek0.i(object0, ggdy0.h());
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
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        ggnr.c(this, objectOutputStream0);
    }
}

