package j$.com.android.tools.r8;

import j..util.concurrent.ConcurrentLinkedQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

public final class b {
    public final Unsafe a;
    public final Class b;
    public final long c;

    public b(Class class0, String s, Class class1) {
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
                    Class class2 = field1.getType();
                    if(Unsafe.class.isAssignableFrom(class2)) {
                        field0 = field1;
                        goto label_16;
                    }
                }
                ++v;
            }
            throw new UnsupportedOperationException("Couldn\'t find the Unsafe", noSuchFieldException0);
        }
    label_16:
        field0.setAccessible(true);
        Unsafe unsafe0 = (Unsafe)field0.get(null);
        this.a = unsafe0;
        this.b = class0.getDeclaredField(s).getType();
        if(class1.isPrimitive() && class1 != Integer.TYPE && class1 != Long.TYPE) {
            throw new UnsupportedOperationException("Using a VarHandle for a field of type \'" + class1.getName() + "\' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
        }
        this.c = unsafe0.objectFieldOffset(class0.getDeclaredField(s));
    }

    public final boolean a(Object object0, Object object1, Object object2) {
        Class class0 = this.b;
        if(class0 == Integer.TYPE) {
            int v = b.e(object1);
            int v1 = b.e(object2);
            return this.a.compareAndSwapInt(object0, this.c, v, v1);
        }
        if(class0 == Long.TYPE) {
            long v2 = b.f(object1);
            long v3 = b.f(object2);
            return this.a.compareAndSwapLong(object0, this.c, v2, v3);
        }
        return a.a(this.a, object0, this.c, object1, object2);
    }

    public final Object b(Object object0) {
        long v = this.c;
        Class class0 = this.b;
        if(class0 == Integer.TYPE) {
            return this.a.getInt(object0, v);
        }
        return class0 == Long.TYPE ? this.a.getLong(object0, v) : this.a.getObject(object0, v);
    }

    public final void c(Object object0, Object object1) {
        Class class0 = this.b;
        Class class1 = Integer.TYPE;
        if(class0 == class1) {
            int v = b.e(object1);
            Class class2 = this.b;
            if(class2 == Integer.TYPE) {
                this.a.putInt(object0, this.c, v);
                return;
            }
            if(class2 == Long.TYPE) {
                this.a.putLong(object0, this.c, ((long)v));
                return;
            }
            this.c(object0, Integer.valueOf(v));
            return;
        }
        long v1 = this.c;
        Class class3 = Long.TYPE;
        if(class0 == class3) {
            long v2 = b.f(object1);
            if(class0 == class3) {
                this.a.putLong(object0, this.c, v2);
                return;
            }
            if(class0 == class1) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            this.a.putObject(object0, v1, Long.valueOf(v2));
            return;
        }
        this.a.putObject(object0, v1, object1);
    }

    public final void d(Object object0, Object object1) {
        Class class0 = this.b;
        Class class1 = Integer.TYPE;
        if(class0 == class1) {
            int v = b.e(object1);
            Class class2 = this.b;
            if(class2 == Integer.TYPE) {
                this.a.putOrderedInt(object0, this.c, v);
                return;
            }
            if(class2 == Long.TYPE) {
                this.a.putOrderedLong(object0, this.c, ((long)v));
                return;
            }
            this.d(object0, Integer.valueOf(v));
            return;
        }
        long v1 = this.c;
        Class class3 = Long.TYPE;
        if(class0 == class3) {
            long v2 = b.f(object1);
            if(class0 == class3) {
                this.a.putOrderedLong(object0, this.c, v2);
                return;
            }
            if(class0 == class1) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            this.a.putOrderedObject(object0, v1, Long.valueOf(v2));
            return;
        }
        this.a.putOrderedObject(object0, v1, object1);
    }

    public static int e(Object object0) {
        if((object0 instanceof Integer)) {
            return (int)(((Integer)object0));
        }
        if((object0 instanceof Byte)) {
            return (byte)(((Byte)object0));
        }
        if((object0 instanceof Character)) {
            return ((Character)object0).charValue();
        }
        if((object0 instanceof Short)) {
            return (short)(((Short)object0));
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public static long f(Object object0) {
        return (object0 instanceof Long) ? ((long)(((Long)object0))) : ((long)b.e(object0));
    }

    public final boolean g(ConcurrentLinkedQueue concurrentLinkedQueue0, Object object0, Object object1) {
        Class class0 = this.b;
        if(class0 == Integer.TYPE) {
            int v = b.e(object0);
            int v1 = b.e(object1);
            return this.a.compareAndSwapInt(concurrentLinkedQueue0, this.c, v, v1);
        }
        if(class0 == Long.TYPE) {
            long v2 = b.f(object0);
            long v3 = b.f(object1);
            return this.a.compareAndSwapLong(concurrentLinkedQueue0, this.c, v2, v3);
        }
        return a.a(this.a, concurrentLinkedQueue0, this.c, object0, object1);
    }
}

