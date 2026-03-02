import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class gqbt extends AbstractMap implements Serializable {
    public static final Comparator a;
    gqbs b;
    int c;
    int d;
    final gqbs e;
    private final Comparator f;
    private final boolean g;
    private gqbo h;
    private gqbq i;

    static {
        gqbt.a = new gqbm();
    }

    public gqbt() {
        this(gqbt.a, true);
    }

    public gqbt(Comparator comparator0, boolean z) {
        this.c = 0;
        this.d = 0;
        this.f = comparator0;
        this.g = z;
        this.e = new gqbs(z);
    }

    final gqbs a(Object object0, boolean z) {
        gqbs gqbs3;
        int v;
        Comparator comparator0 = this.f;
        gqbs gqbs0 = this.b;
        if(gqbs0 == null) {
            v = 0;
        }
        else {
            Comparable comparable0 = comparator0 == gqbt.a ? ((Comparable)object0) : null;
            while(true) {
                v = comparable0 == null ? comparator0.compare(object0, gqbs0.f) : comparable0.compareTo(gqbs0.f);
                if(v == 0) {
                    return gqbs0;
                }
                gqbs gqbs1 = v >= 0 ? gqbs0.c : gqbs0.b;
                if(gqbs1 == null) {
                    break;
                }
                gqbs0 = gqbs1;
            }
        }
        if(!z) {
            return null;
        }
        gqbs gqbs2 = this.e;
        if(gqbs0 == null) {
            if(comparator0 == gqbt.a && !(object0 instanceof Comparable)) {
                throw new ClassCastException(object0.getClass().getName() + " is not Comparable");
            }
            gqbs3 = new gqbs(this.g, null, object0, gqbs2, gqbs2.e);
            this.b = gqbs3;
        }
        else {
            gqbs3 = new gqbs(this.g, gqbs0, object0, gqbs2, gqbs2.e);
            if(v < 0) {
                gqbs0.b = gqbs3;
            }
            else {
                gqbs0.c = gqbs3;
            }
            this.f(gqbs0, true);
        }
        ++this.c;
        ++this.d;
        return gqbs3;
    }

    final gqbs b(Map.Entry map$Entry0) {
        gqbs gqbs0 = this.c(map$Entry0.getKey());
        return gqbs0 == null || !Objects.equals(gqbs0.h, map$Entry0.getValue()) ? null : gqbs0;
    }

    final gqbs c(Object object0) {
        if(object0 != null) {
            try {
                return this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return null;
    }

    @Override
    public final void clear() {
        this.b = null;
        this.c = 0;
        ++this.d;
        this.e.e = this.e;
        this.e.d = this.e;
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.c(object0) != null;
    }

    final gqbs d(Object object0) {
        gqbs gqbs0 = this.c(object0);
        if(gqbs0 != null) {
            this.e(gqbs0, true);
        }
        return gqbs0;
    }

    final void e(gqbs gqbs0, boolean z) {
        int v1;
        gqbs gqbs6;
        gqbs gqbs4;
        if(z) {
            gqbs0.e.d = gqbs0.d;
            gqbs0.d.e = gqbs0.e;
        }
        gqbs gqbs1 = gqbs0.b;
        gqbs gqbs2 = gqbs0.c;
        gqbs gqbs3 = gqbs0.a;
        int v = 0;
        if(gqbs1 != null && gqbs2 != null) {
            if(gqbs1.i > gqbs2.i) {
                while(true) {
                    gqbs4 = gqbs1;
                    gqbs1 = gqbs1.c;
                    if(gqbs1 == null) {
                        break;
                    }
                }
            }
            else {
                do {
                    gqbs gqbs5 = gqbs2;
                    gqbs2 = gqbs2.b;
                    gqbs6 = gqbs5;
                }
                while(gqbs2 != null);
                gqbs4 = gqbs6;
            }
            this.e(gqbs4, false);
            gqbs gqbs7 = gqbs0.b;
            if(gqbs7 == null) {
                v1 = 0;
            }
            else {
                v1 = gqbs7.i;
                gqbs4.b = gqbs7;
                gqbs7.a = gqbs4;
                gqbs0.b = null;
            }
            gqbs gqbs8 = gqbs0.c;
            if(gqbs8 != null) {
                v = gqbs8.i;
                gqbs4.c = gqbs8;
                gqbs8.a = gqbs4;
                gqbs0.c = null;
            }
            gqbs4.i = Math.max(v1, v) + 1;
            this.g(gqbs0, gqbs4);
            return;
        }
        if(gqbs1 != null) {
            this.g(gqbs0, gqbs1);
            gqbs0.b = null;
        }
        else if(gqbs2 == null) {
            this.g(gqbs0, null);
        }
        else {
            this.g(gqbs0, gqbs2);
            gqbs0.c = null;
        }
        this.f(gqbs3, false);
        --this.c;
        ++this.d;
    }

    @Override
    public final Set entrySet() {
        gqbo gqbo0 = this.h;
        if(gqbo0 == null) {
            gqbo0 = new gqbo(this);
            this.h = gqbo0;
        }
        return gqbo0;
    }

    private final void f(gqbs gqbs0, boolean z) {
        while(gqbs0 != null) {
            gqbs gqbs1 = gqbs0.b;
            gqbs gqbs2 = gqbs0.c;
            int v = gqbs1 == null ? 0 : gqbs1.i;
            int v1 = gqbs2 == null ? 0 : gqbs2.i;
            int v2 = v - v1;
            boolean z1 = true;
            if(v2 == -2) {
                switch((gqbs2.b == null ? 0 : gqbs2.b.i) - (gqbs2.c == null ? 0 : gqbs2.c.i)) {
                    case -1: {
                        this.h(gqbs0);
                        z1 = z;
                        break;
                    }
                    case 0: {
                        if(z) {
                            this.i(gqbs2);
                            this.h(gqbs0);
                        }
                        else {
                            this.h(gqbs0);
                            z1 = false;
                        }
                        break;
                    }
                    default: {
                        z1 = z;
                        this.i(gqbs2);
                        this.h(gqbs0);
                    }
                }
                if(!z1) {
                    gqbs0 = gqbs0.a;
                    continue;
                }
            }
            else {
                switch(v2) {
                    case 0: {
                        gqbs0.i = v + 1;
                        if(z) {
                            return;
                        }
                        gqbs0 = gqbs0.a;
                        continue;
                    }
                    case 2: {
                        switch((gqbs1.b == null ? 0 : gqbs1.b.i) - (gqbs1.c == null ? 0 : gqbs1.c.i)) {
                            case 0: {
                                if(z) {
                                    this.h(gqbs1);
                                    this.i(gqbs0);
                                }
                                else {
                                    this.i(gqbs0);
                                    z1 = false;
                                }
                                break;
                            }
                            case 1: {
                                this.i(gqbs0);
                                z1 = z;
                                break;
                            }
                            default: {
                                z1 = z;
                                this.h(gqbs1);
                                this.i(gqbs0);
                            }
                        }
                        if(z1) {
                            return;
                        }
                        gqbs0 = gqbs0.a;
                        continue;
                    }
                    default: {
                        gqbs0.i = Math.max(v, v1) + 1;
                        if(z) {
                            gqbs0 = gqbs0.a;
                            continue;
                        }
                    }
                }
            }
            break;
        }
    }

    private final void g(gqbs gqbs0, gqbs gqbs1) {
        gqbs gqbs2 = gqbs0.a;
        gqbs0.a = null;
        if(gqbs1 != null) {
            gqbs1.a = gqbs2;
        }
        if(gqbs2 != null) {
            if(gqbs2.b == gqbs0) {
                gqbs2.b = gqbs1;
                return;
            }
            gqbs2.c = gqbs1;
            return;
        }
        this.b = gqbs1;
    }

    @Override
    public final Object get(Object object0) {
        gqbs gqbs0 = this.c(object0);
        return gqbs0 == null ? null : gqbs0.h;
    }

    private final void h(gqbs gqbs0) {
        gqbs gqbs1 = gqbs0.b;
        gqbs gqbs2 = gqbs0.c;
        gqbs gqbs3 = gqbs2.b;
        gqbs gqbs4 = gqbs2.c;
        gqbs0.c = gqbs3;
        if(gqbs3 != null) {
            gqbs3.a = gqbs0;
        }
        this.g(gqbs0, gqbs2);
        gqbs2.b = gqbs0;
        gqbs0.a = gqbs2;
        int v = 0;
        int v1 = Math.max((gqbs1 == null ? 0 : gqbs1.i), (gqbs3 == null ? 0 : gqbs3.i)) + 1;
        gqbs0.i = v1;
        if(gqbs4 != null) {
            v = gqbs4.i;
        }
        gqbs2.i = Math.max(v1, v) + 1;
    }

    private final void i(gqbs gqbs0) {
        gqbs gqbs1 = gqbs0.b;
        gqbs gqbs2 = gqbs0.c;
        gqbs gqbs3 = gqbs1.b;
        gqbs gqbs4 = gqbs1.c;
        gqbs0.b = gqbs4;
        if(gqbs4 != null) {
            gqbs4.a = gqbs0;
        }
        this.g(gqbs0, gqbs1);
        gqbs1.c = gqbs0;
        gqbs0.a = gqbs1;
        int v = 0;
        int v1 = Math.max((gqbs2 == null ? 0 : gqbs2.i), (gqbs4 == null ? 0 : gqbs4.i)) + 1;
        gqbs0.i = v1;
        if(gqbs3 != null) {
            v = gqbs3.i;
        }
        gqbs1.i = Math.max(v1, v) + 1;
    }

    @Override
    public final Set keySet() {
        gqbq gqbq0 = this.i;
        if(gqbq0 == null) {
            gqbq0 = new gqbq(this);
            this.i = gqbq0;
        }
        return gqbq0;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        if(object1 == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        gqbs gqbs0 = this.a(object0, true);
        Object object2 = gqbs0.h;
        gqbs0.h = object1;
        return object2;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    @Override
    public final Object remove(Object object0) {
        gqbs gqbs0 = this.d(object0);
        return gqbs0 == null ? null : gqbs0.h;
    }

    @Override
    public final int size() {
        return this.c;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
}

