import java.util.Map.Entry;

public final class gqbs implements Map.Entry {
    gqbs a;
    gqbs b;
    gqbs c;
    gqbs d;
    gqbs e;
    public final Object f;
    final boolean g;
    public Object h;
    int i;

    public gqbs(boolean z) {
        this.f = null;
        this.g = z;
        this.e = this;
        this.d = this;
    }

    public gqbs(boolean z, gqbs gqbs0, Object object0, gqbs gqbs1, gqbs gqbs2) {
        this.a = gqbs0;
        this.f = object0;
        this.g = z;
        this.i = 1;
        this.d = gqbs1;
        this.e = gqbs2;
        gqbs2.d = this;
        gqbs1.e = this;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof Map.Entry)) {
            Object object1 = this.f;
            if(object1 == null) {
                if(((Map.Entry)object0).getKey() == null) {
                    return this.h == null ? ((Map.Entry)object0).getValue() == null : this.h.equals(((Map.Entry)object0).getValue());
                }
            }
            else if(object1.equals(((Map.Entry)object0).getKey())) {
                return this.h == null ? ((Map.Entry)object0).getValue() == null : this.h.equals(((Map.Entry)object0).getValue());
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f;
    }

    @Override
    public final Object getValue() {
        return this.h;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.f == null ? 0 : this.f.hashCode();
        Object object0 = this.h;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final Object setValue(Object object0) {
        if(object0 == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        Object object1 = this.h;
        this.h = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.f + "=" + this.h;
    }
}

