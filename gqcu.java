import com.google.gson.reflect.TypeToken;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class gqcu implements gqae {
    public static final gqae a;
    public final gqbc b;
    public final ConcurrentMap c;
    private static final gqae d;

    static {
        gqcu.a = new gqct();
        gqcu.d = new gqct();
    }

    public gqcu(gqbc gqbc0) {
        this.b = gqbc0;
        this.c = new ConcurrentHashMap();
    }

    @Override  // gqae
    public final gqad a(gpzl gpzl0, TypeToken typeToken0) {
        gqag gqag0 = gqcu.d(typeToken0.getRawType());
        return gqag0 == null ? null : this.b(this.b, gpzl0, typeToken0, gqag0, true);
    }

    final gqad b(gqbc gqbc0, gpzl gpzl0, TypeToken typeToken0, gqag gqag0, boolean z) {
        gpzx gpzx0;
        gqad gqad0;
        gpzp gpzp0 = null;
        Object object0 = gqcu.e(gqbc0, gqag0.a());
        boolean z1 = gqag0.b();
        if((object0 instanceof gqad)) {
            gqad0 = (gqad)object0;
            return gqad0 == null || !z1 ? gqad0 : gqad0.d();
        }
        if((object0 instanceof gqae)) {
            gqae gqae0 = (gqae)object0;
            if(z) {
                gqae0 = this.c(typeToken0.getRawType(), gqae0);
            }
            gqad0 = gqae0.a(gpzl0, typeToken0);
            return gqad0 == null || !z1 ? gqad0 : gqad0.d();
        }
        if((object0 instanceof gpzx)) {
            gpzx0 = (gpzx)object0;
        }
        else {
            if(!(object0 instanceof gpzp)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + object0.getClass().getName() + " as a @JsonAdapter for " + typeToken0.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            gpzx0 = null;
        }
        if((object0 instanceof gpzp)) {
            gpzp0 = (gpzp)object0;
        }
        return new gqdk(gpzx0, gpzp0, gpzl0, typeToken0, (z ? gqcu.a : gqcu.d), z1);
    }

    public final gqae c(Class class0, gqae gqae0) {
        gqae gqae1 = (gqae)this.c.putIfAbsent(class0, gqae0);
        return gqae1 == null ? gqae0 : gqae1;
    }

    public static gqag d(Class class0) {
        return (gqag)class0.getAnnotation(gqag.class);
    }

    public static Object e(gqbc gqbc0, Class class0) {
        return gqbc0.a(TypeToken.get(class0), true).a();
    }
}

