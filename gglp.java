import j..util.DesugarCollections;
import j..util.Objects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class gglp extends gfyw {
    transient gful_cronetEngineProvider c;
    private static final long serialVersionUID;

    public gglp(Map map0, gful_cronetEngineProvider gful0) {
        super(map0);
        this.c = gful0;
    }

    @Override  // gfyw
    public final Collection a() {
        return (Set)this.c.mr();
    }

    @Override  // gfyw
    public final Collection e(Collection collection0) {
        if((collection0 instanceof NavigableSet)) {
            return ggog.j(((NavigableSet)collection0));
        }
        return (collection0 instanceof SortedSet) ? DesugarCollections.unmodifiableSortedSet(((SortedSet)collection0)) : DesugarCollections.unmodifiableSet(((Set)collection0));
    }

    @Override  // gfyw
    public final Collection f(Object object0, Collection collection0) {
        if((collection0 instanceof NavigableSet)) {
            return new gfyg(this, object0, ((NavigableSet)collection0), null);
        }
        return (collection0 instanceof SortedSet) ? new gfyi(this, object0, ((SortedSet)collection0), null) : new gfyh(this, object0, ((Set)collection0));
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

