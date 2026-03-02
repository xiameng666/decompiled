import java.util.Iterator;
import java.util.Map;

class ggkf extends ggod {
    final Map d;

    public ggkf(Map map0) {
        gftb.check(map0);
        this.d = map0;
    }

    public Map c() {
        return this.d;
    }

    @Override
    public void clear() {
        this.c().clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.c().containsKey(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.c().isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new ggjp(this.c().entrySet().iterator());
    }

    @Override
    public boolean remove(Object object0) {
        if(this.contains(object0)) {
            this.c().remove(object0);
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.c().size();
    }
}

