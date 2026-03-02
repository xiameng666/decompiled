import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class ggkl extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    @Override
    public final Set entrySet() {
        Set set0 = this.a;
        if(set0 == null) {
            set0 = this.b();
            this.a = set0;
        }
        return set0;
    }

    public Set g() {
        return new ggkf(this);
    }

    @Override
    public Set keySet() {
        Set set0 = this.b;
        if(set0 == null) {
            set0 = this.g();
            this.b = set0;
        }
        return set0;
    }

    public Collection oj() {
        return new ggkk(this);
    }

    @Override
    public final Collection values() {
        Collection collection0 = this.c;
        if(collection0 == null) {
            collection0 = this.oj();
            this.c = collection0;
        }
        return collection0;
    }
}

