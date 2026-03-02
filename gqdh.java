import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

final class gqdh extends gqdd {
    static final Map a;
    private final Constructor b;
    private final Object[] c;
    private final Map d;

    static {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(Byte.TYPE, Byte.valueOf(((byte)0)));
        hashMap0.put(Short.TYPE, Short.valueOf(((short)0)));
        hashMap0.put(Integer.TYPE, Integer.valueOf(0));
        hashMap0.put(Long.TYPE, Long.valueOf(0L));
        hashMap0.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap0.put(Double.TYPE, Double.valueOf(0.0));
        hashMap0.put(Character.TYPE, Character.valueOf('\u0000'));
        hashMap0.put(Boolean.TYPE, Boolean.valueOf(false));
        gqdh.a = hashMap0;
    }

    public gqdh(Class class0, gqdg gqdg0, boolean z) {
        super(gqdg0);
        this.d = new HashMap();
        gqes gqes0 = gqev.a;
        Constructor constructor0 = gqes0.a(class0);
        this.b = constructor0;
        if(z) {
            gqdi.b(null, constructor0);
        }
        else {
            gqev.g(constructor0);
        }
        String[] arr_s = gqes0.d(class0);
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            this.d.put(arr_s[v1], Integer.valueOf(v1));
        }
        Class[] arr_class = this.b.getParameterTypes();
        this.c = new Object[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            this.c[v] = gqdh.a.get(arr_class[v]);
        }
    }

    @Override  // gqdd
    public final Object c() {
        return (Object[])this.c.clone();
    }

    @Override  // gqdd
    public final Object e(Object object0) {
        return this.g(((Object[])object0));
    }

    @Override  // gqdd
    public final void f(Object object0, gqff gqff0, gqde gqde0) {
        String s = gqde0.c;
        Integer integer0 = (Integer)this.d.get(s);
        if(integer0 == null) {
            throw new IllegalStateException(a.d(s, gqev.c(this.b), "Could not find the index in the constructor \'", "\' for field with name \'", "\', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
        int v = (int)integer0;
        Object object1 = gqde0.g.a(gqff0);
        if(object1 == null && gqde0.h) {
            throw new gpzu("null is not allowed as value for record component \'" + s + "\' of primitive type; at path " + gqff0.e());
        }
        ((Object[])object0)[v] = object1;
    }

    final Object g(Object[] arr_object) {
        try {
            return this.b.newInstance(arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw gqev.b(illegalAccessException0);
        }
        catch(InstantiationException | IllegalArgumentException exception0) {
            throw new RuntimeException("Failed to invoke constructor \'" + gqev.c(this.b) + "\' with args " + Arrays.toString(arr_object), exception0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("Failed to invoke constructor \'" + gqev.c(this.b) + "\' with args " + Arrays.toString(arr_object), invocationTargetException0.getCause());
        }
    }
}

