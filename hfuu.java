import java.util.Map.Entry;

final class hfuu implements Map.Entry {
    public final Map.Entry a;

    public hfuu(Map.Entry map$Entry0) {
        this.a = map$Entry0;
    }

    @Override
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override
    public final Object getValue() {
        if(((hfuw)this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof MessageLite)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        hfuw hfuw0 = (hfuw)this.a.getValue();
        Object object1 = hfuw0.a;
        hfuw0.b = null;
        hfuw0.a = (MessageLite)object0;
        return object1;
    }
}

