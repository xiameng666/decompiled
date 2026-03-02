import com.google.gson.reflect.TypeToken;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

public final class gqbc {
    private final Map a;
    private final List b;

    public gqbc(Map map0, List list0) {
        this.a = map0;
        this.b = list0;
    }

    public final gqbv a(TypeToken typeToken0, boolean z) {
        String s;
        Constructor constructor0;
        gqbv gqbv1;
        Map map0 = this.a;
        Type type0 = typeToken0.getType();
        Class class0 = typeToken0.getRawType();
        gpzn gpzn0 = (gpzn)map0.get(type0);
        if(gpzn0 != null) {
            return new gqai(gpzn0);
        }
        gqbv gqbv0 = null;
        gpzn gpzn1 = (gpzn)map0.get(class0);
        if(gpzn1 == null) {
            if(EnumSet.class.isAssignableFrom(class0)) {
                gqbv1 = new gqaj(type0);
            }
            else if(class0 == EnumMap.class) {
                gqbv1 = new gqak(type0);
            }
            else {
                gqbv1 = null;
            }
            if(gqbv1 != null) {
                return gqbv1;
            }
            int v = gqbz.b(this.b);
            gqbv gqbv2 = null;
            if(!Modifier.isAbstract(class0.getModifiers())) {
                try {
                    constructor0 = class0.getDeclaredConstructor(null);
                }
                catch(NoSuchMethodException unused_ex) {
                    goto label_38;
                }
                if(v != 1 && (!gqbz.a(constructor0, null) || v == 4 && !Modifier.isPublic(constructor0.getModifiers()))) {
                    gqbv2 = new gqaq(a.O(class0, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
                }
                else if(v == 1) {
                    try {
                        constructor0.setAccessible(true);
                        s = null;
                    }
                    catch(Exception exception0) {
                        s = "Failed making constructor \'" + gqev.c(constructor0) + "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + exception0.getMessage() + gqev.f(exception0);
                    }
                    if(s == null) {
                        v = 1;
                        gqbv2 = () -> try {
                            return constructor0.newInstance(null);
                        }
                        catch(InstantiationException instantiationException0) {
                            throw new RuntimeException(a.a(gqev.c(constructor0), "Failed to invoke constructor \'", "\' with no args"), instantiationException0);
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            throw new RuntimeException(a.a(gqev.c(constructor0), "Failed to invoke constructor \'", "\' with no args"), invocationTargetException0.getCause());
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            throw gqev.b(illegalAccessException0);
                        };
                    }
                    else {
                        gqbv2 = new gqar(s);
                    }
                }
                else {
                    gqbv2 = () -> try {
                        return constructor0.newInstance(null);
                    }
                    catch(InstantiationException instantiationException0) {
                        throw new RuntimeException(a.a(gqev.c(constructor0), "Failed to invoke constructor \'", "\' with no args"), instantiationException0);
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        throw new RuntimeException(a.a(gqev.c(constructor0), "Failed to invoke constructor \'", "\' with no args"), invocationTargetException0.getCause());
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        throw gqev.b(illegalAccessException0);
                    };
                }
            }
        label_38:
            if(gqbv2 == null) {
                if(!Collection.class.isAssignableFrom(class0)) {
                    if(Map.class.isAssignableFrom(class0)) {
                        if(!class0.isAssignableFrom(gqbt.class)) {
                        label_61:
                            if(class0.isAssignableFrom(LinkedHashMap.class)) {
                                gqbv0 = new gqam();
                            }
                            else if(class0.isAssignableFrom(TreeMap.class)) {
                                gqbv0 = new gqan();
                            }
                            else if(class0.isAssignableFrom(ConcurrentHashMap.class)) {
                                gqbv0 = new gqao();
                            }
                            else if(class0.isAssignableFrom(ConcurrentSkipListMap.class)) {
                                gqbv0 = new gqap();
                            }
                        }
                        else if((type0 instanceof ParameterizedType)) {
                            Type[] arr_type = ((ParameterizedType)type0).getActualTypeArguments();
                            if(arr_type.length != 0 && gqbi.a(arr_type[0]) == String.class) {
                                gqbv0 = new gqal();
                            }
                            else {
                                goto label_61;
                            }
                        }
                        else {
                            gqbv0 = new gqal();
                        }
                    }
                }
                else if(class0.isAssignableFrom(ArrayList.class)) {
                    gqbv0 = new gqax();
                }
                else if(class0.isAssignableFrom(LinkedHashSet.class)) {
                    gqbv0 = new gqay();
                }
                else if(class0.isAssignableFrom(TreeSet.class)) {
                    gqbv0 = new gqaz();
                }
                else if(class0.isAssignableFrom(ArrayDeque.class)) {
                    gqbv0 = new gqba();
                }
                if(gqbv0 != null) {
                    return gqbv0;
                }
                String s1 = gqbc.c(class0);
                if(s1 != null) {
                    return new gqau(s1);
                }
                if(!z) {
                    return new gqav(a.O(class0, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."));
                }
                return v != 1 ? new gqaw(a.O(class0, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.")) : new gqbb(class0);
            }
            return gqbv2;
        }
        return new gqas(gpzn1);
    }

    static String c(Class class0) {
        int v = class0.getModifiers();
        if(Modifier.isInterface(v)) {
            return "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + class0.getName();
        }
        return Modifier.isAbstract(v) ? "Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + class0.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class" : null;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

