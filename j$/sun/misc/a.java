package j$.sun.misc;

import j..util.concurrent.l;
import j..util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

public final class a {
    public final Unsafe a;
    public static final a b;

    static {
        Field field0;
        try {
            field0 = Unsafe.class.getDeclaredField("theUnsafe");
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            Field[] arr_field = Unsafe.class.getDeclaredFields();
            int v = 0;
            while(v < arr_field.length) {
                Field field1 = arr_field[v];
                if(Modifier.isStatic(field1.getModifiers())) {
                    Class class0 = field1.getType();
                    if(Unsafe.class.isAssignableFrom(class0)) {
                        field0 = field1;
                        goto label_15;
                    }
                }
                ++v;
            }
            throw new AssertionError("Couldn\'t find the Unsafe", noSuchFieldException0);
        }
    label_15:
        field0.setAccessible(true);
        try {
            a.b = new a(((Unsafe)field0.get(null)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("Couldn\'t get the Unsafe", illegalAccessException0);
        }
    }

    public a(Unsafe unsafe0) {
        this.a = unsafe0;
    }

    public final int a() {
        return this.a.arrayBaseOffset(l[].class);
    }

    public final int b() {
        return this.a.arrayIndexScale(l[].class);
    }

    public final boolean c(Object object0, long v, int v1, int v2) {
        return this.a.compareAndSwapInt(object0, v, v1, v2);
    }

    public final boolean d(Object object0, long v, long v1, long v2) {
        return this.a.compareAndSwapLong(object0, v, v1, v2);
    }

    public final int e(q q0, long v) {
        int v1;
        while(true) {
            v1 = this.a.getIntVolatile(q0, v);
            if(this.a.compareAndSwapInt(q0, v, v1, v1 - 4)) {
                break;
            }
            q0 = q0;
            v = v;
        }
        return v1;
    }

    public final Object f(Object object0, long v) {
        return this.a.getObjectVolatile(object0, v);
    }

    public final long g(Class class0, String s) {
        try {
            Field field0 = class0.getDeclaredField(s);
            return this.a.objectFieldOffset(field0);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new AssertionError("Cannot find field:", noSuchFieldException0);
        }
    }

    public final void h(Object object0, long v, l l0) {
        this.a.putObjectVolatile(object0, v, l0);
    }
}

