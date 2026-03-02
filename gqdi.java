import com.google.gson.reflect.TypeToken;
import j..util.Objects;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public final class gqdi implements gqae {
    private final gqbc a;
    private final gqbe b;
    private final gqcu c;
    private final List d;
    private final int e;

    public gqdi(gqbc gqbc0, int v, gqbe gqbe0, gqcu gqcu0, List list0) {
        this.a = gqbc0;
        this.e = v;
        this.b = gqbe0;
        this.c = gqcu0;
        this.d = list0;
    }

    @Override  // gqae
    public final gqad a(gpzl gpzl0, TypeToken typeToken0) {
        boolean z;
        Class class0 = typeToken0.getRawType();
        if(!Object.class.isAssignableFrom(class0)) {
            return null;
        }
        if(gqev.h(class0)) {
            return new gqdc(this);
        }
        switch(gqbz.b(this.d)) {
            case 3: {
                z = true;
                return gqev.a.c(class0) ? new gqdh(class0, this.c(gpzl0, typeToken0, class0, z, true), z) : new gqdf(this.a.a(typeToken0, true), this.c(gpzl0, typeToken0, class0, z, false));
            }
            case 4: {
                throw new gpzr(a.O(class0, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
            }
            default: {
                z = false;
                return gqev.a.c(class0) ? new gqdh(class0, this.c(gpzl0, typeToken0, class0, z, true), z) : new gqdf(this.a.a(typeToken0, true), this.c(gpzl0, typeToken0, class0, z, false));
            }
        }
    }

    public static void b(Object object0, AccessibleObject accessibleObject0) {
        if(Modifier.isStatic(((Member)accessibleObject0).getModifiers())) {
            object0 = null;
        }
        if(gqbz.a(accessibleObject0, object0)) {
            return;
        }
        throw new gpzr(gqev.e(accessibleObject0, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private final gqdg c(gpzl gpzl0, TypeToken typeToken0, Class class0, boolean z, boolean z1) {
        gpzl gpzl1;
        gqad gqad0;
        Field field1;
        boolean z8;
        List list2;
        List list1;
        List list0;
        String s;
        Method method0;
        boolean z7;
        int v3;
        int v2;
        boolean z6;
        gqdi gqdi0 = this;
        if(class0.isInterface()) {
            return gqdg.a;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        TypeToken typeToken1 = typeToken0;
        boolean z2 = z;
        Class class1 = class0;
        while(class1 != Object.class) {
            Field[] arr_field = class1.getDeclaredFields();
            boolean z3 = false;
            if(class1 != class0 && arr_field.length > 0) {
                switch(gqbz.b(gqdi0.d)) {
                    case 3: {
                        z2 = true;
                        break;
                    }
                    case 4: {
                        throw new gpzr("ReflectionAccessFilter does not permit using reflection for " + class1 + " (supertype of " + class0 + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    default: {
                        z2 = false;
                    }
                }
            }
            int v = arr_field.length;
            int v1 = 0;
            while(v1 < v) {
                Field field0 = arr_field[v1];
                boolean z4 = gqdi0.e(field0, true);
                boolean z5 = gqdi0.e(field0, false);
                if(!z4) {
                    if(z5) {
                        z5 = true;
                    }
                    else {
                        z6 = z2;
                        v2 = v;
                        v3 = v1;
                        goto label_110;
                    }
                }
                if(!z1) {
                    method0 = null;
                    z7 = z5;
                }
                else if(Modifier.isStatic(field0.getModifiers())) {
                    z7 = false;
                    method0 = null;
                }
                else {
                    Method method1 = gqev.a.b(class1, field0);
                    if(!z2) {
                        gqev.g(method1);
                    }
                    if(method1.getAnnotation(gqah.class) != null && field0.getAnnotation(gqah.class) == null) {
                        throw new gpzr("@SerializedName on " + gqev.e(method1, false) + " is not supported");
                    }
                    z7 = z5;
                    method0 = method1;
                }
                if(!z2 && method0 == null) {
                    gqev.g(field0);
                }
                Type type0 = gqbi.e(typeToken1.getType(), class1, field0.getGenericType());
                gqah gqah0 = (gqah)field0.getAnnotation(gqah.class);
                if(gqah0 == null) {
                    if(gqdi0.e == 0 || gqdi0.e - 1 != 0) {
                        throw null;
                    }
                    s = field0.getName();
                    list0 = Collections.EMPTY_LIST;
                }
                else {
                    String s1 = gqah0.a();
                    list0 = Arrays.asList(gqah0.b());
                    s = s1;
                }
                if(list0.isEmpty()) {
                    list1 = Collections.singletonList(s);
                }
                else {
                    list1 = new ArrayList(list0.size() + 1);
                    list1.add(s);
                    list1.addAll(list0);
                }
                String s2 = (String)list1.get(0);
                TypeToken typeToken2 = TypeToken.get(type0);
                Class class2 = typeToken2.getRawType();
                if((class2 instanceof Class) && class2.isPrimitive()) {
                    list2 = list1;
                    z8 = true;
                }
                else {
                    list2 = list1;
                    z8 = false;
                }
                int v4 = field0.getModifiers();
                if(Modifier.isStatic(v4) && Modifier.isFinal(v4)) {
                    z3 = true;
                }
                gqag gqag0 = (gqag)field0.getAnnotation(gqag.class);
                if(gqag0 == null) {
                    v2 = v;
                    v3 = v1;
                    field1 = field0;
                    gpzl1 = gpzl0;
                    gqad0 = null;
                }
                else {
                    v3 = v1;
                    v2 = v;
                    field1 = field0;
                    gqad0 = gqdi0.c.b(gqdi0.a, gpzl0, typeToken2, gqag0, false);
                    gpzl1 = gpzl0;
                }
                gqad gqad1 = gqad0 == null ? gpzl1.a(typeToken2) : gqad0;
                gqad gqad2 = z4 && gqad0 == null ? new gqdl(gpzl1, gqad1, typeToken2.getType()) : gqad1;
                z6 = z2;
                gqde gqde0 = new gqde(gqdi0, s2, field1, z6, method0, gqad2, gqad1, z8, z3);
                if(z7) {
                    for(Object object0: list2) {
                        String s3 = (String)object0;
                        gqde gqde1 = (gqde)linkedHashMap0.put(s3, gqde0);
                        if(gqde1 != null) {
                            throw gqdi.d(class0, s3, gqde1.b, field1);
                        }
                    }
                }
                if(z4) {
                    gqde gqde2 = (gqde)linkedHashMap1.put(s2, gqde0);
                    if(gqde2 != null) {
                        throw gqdi.d(class0, s2, gqde2.b, field1);
                    }
                }
            label_110:
                v1 = v3 + 1;
                gqdi0 = this;
                z2 = z6;
                z3 = false;
                v = v2;
            }
            typeToken1 = TypeToken.get(gqbi.e(typeToken1.getType(), class1, class1.getGenericSuperclass()));
            class1 = typeToken1.getRawType();
            gqdi0 = this;
            z2 = z2;
        }
        return new gqdg(linkedHashMap0, new ArrayList(linkedHashMap1.values()));
    }

    private static IllegalArgumentException d(Class class0, String s, Field field0, Field field1) {
        throw new IllegalArgumentException("Class " + class0.getName() + " declares multiple JSON fields named \'" + s + "\'; conflict is caused by fields " + gqev.d(field0) + " and " + gqev.d(field1) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields");
    }

    private final boolean e(Field field0, boolean z) {
        gqbe gqbe0 = this.b;
        if((field0.getModifiers() & 0x88) == 0 && !field0.isSynthetic()) {
            if(gqbe0.d) {
                gqaf gqaf0 = (gqaf)field0.getAnnotation(gqaf.class);
                if(gqaf0 != null) {
                    if(!z) {
                        if(gqaf0.a()) {
                            goto label_9;
                        }
                    }
                    else if(gqaf0.b()) {
                        goto label_9;
                    }
                }
            }
            else {
            label_9:
                if(!gqbe0.c(field0.getType(), z)) {
                    List list0 = z ? gqbe0.e : gqbe0.f;
                    if(!list0.isEmpty()) {
                        Field field1 = (Field)Objects.requireNonNull(field0);
                        for(Object object0: list0) {
                            if(((gpze)object0).b()) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

