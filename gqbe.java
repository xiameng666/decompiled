import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.List;

public final class gqbe implements gqae, Cloneable {
    public static final gqbe a;
    public final double b;
    public final int c;
    public boolean d;
    public final List e;
    public final List f;

    static {
        gqbe.a = new gqbe();
    }

    public gqbe() {
        this.b = -1.0;
        this.c = 0x88;
        this.e = Collections.EMPTY_LIST;
        this.f = Collections.EMPTY_LIST;
    }

    @Override  // gqae
    public final gqad a(gpzl gpzl0, TypeToken typeToken0) {
        Class class0 = typeToken0.getRawType();
        boolean z = this.c(class0, true);
        boolean z1 = this.c(class0, false);
        return !z && !z1 ? null : new gqbd(this, z1, z, gpzl0, typeToken0);
    }

    public final gqbe b() {
        try {
            return (gqbe)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    public final boolean c(Class class0, boolean z) {
        List list0;
        if(z) {
            list0 = this.e;
        }
        else {
            if(!Enum.class.isAssignableFrom(class0) && gqev.h(class0)) {
                return true;
            }
            list0 = this.f;
        }
        for(Object object0: list0) {
            if(((gpze)object0).a()) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected final Object clone() {
        return this.b();
    }
}

