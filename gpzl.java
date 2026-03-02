import com.google.gson.reflect.TypeToken;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class gpzl {
    public static final gpzf a = null;
    final List b;
    final gpzf c;
    public static final gqab d = null;
    public static final gqab e = null;
    static final int f = 1;
    private final ThreadLocal g;
    private final ConcurrentMap h;
    private final gqbc i;
    private final gqcu j;

    static {
        try {
            gpzl.a = gpzf.a;
            gpzl.d = gqab.a;
            gpzl.e = gqab.b;
            Class.forName("hfvm");
        }
        catch(ClassNotFoundException unused_ex) {
        }
    }

    public gpzl() {
        this(gqbe.a, gpzl.f, Collections.EMPTY_MAP, gpzl.a, Collections.EMPTY_LIST, gpzl.d, gpzl.e, Collections.EMPTY_LIST);
    }

    public gpzl(gqbe gqbe0, int v, Map map0, gpzf gpzf0, List list0, gqab gqab0, gqab gqab1, List list1) {
        this.g = new ThreadLocal();
        this.h = new ConcurrentHashMap();
        gqbc gqbc0 = new gqbc(map0, list1);
        this.i = gqbc0;
        this.c = gpzf0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(gqeq.U);
        gqae gqae0 = gqab0 == gqab.a ? gqdb.a : new gqda(gqab0);
        arrayList0.add(gqae0);
        arrayList0.add(gqbe0);
        arrayList0.addAll(list0);
        arrayList0.add(gqeq.A);
        arrayList0.add(gqeq.m);
        arrayList0.add(gqeq.g);
        arrayList0.add(gqeq.i);
        arrayList0.add(gqeq.k);
        arrayList0.add(new gqef(Long.TYPE, Long.class, gqeq.t));
        Class class0 = Double.TYPE;
        gpzg gpzg0 = new gpzg(this);
        arrayList0.add(new gqef(class0, Double.class, gpzg0));
        Class class1 = Float.TYPE;
        gpzh gpzh0 = new gpzh(this);
        arrayList0.add(new gqef(class1, Float.class, gpzh0));
        arrayList0.add((gqab1 == gqab.b ? gqcz.a : gqcz.c(gqab1)));
        arrayList0.add(gqeq.o);
        arrayList0.add(gqeq.q);
        gqad gqad0 = new gpzi(gqeq.t).d();
        arrayList0.add(new gqed(AtomicLong.class, gqad0));
        gqad gqad1 = new gpzj(gqeq.t).d();
        arrayList0.add(new gqed(AtomicLongArray.class, gqad1));
        arrayList0.add(gqeq.s);
        arrayList0.add(gqeq.v);
        arrayList0.add(gqeq.C);
        arrayList0.add(gqeq.E);
        arrayList0.add(new gqed(BigDecimal.class, gqeq.x));
        arrayList0.add(new gqed(BigInteger.class, gqeq.y));
        arrayList0.add(new gqed(gqbl.class, gqeq.z));
        arrayList0.add(gqeq.G);
        arrayList0.add(gqeq.I);
        arrayList0.add(gqeq.M);
        arrayList0.add(gqeq.O);
        arrayList0.add(gqeq.S);
        arrayList0.add(gqeq.K);
        arrayList0.add(gqeq.d);
        arrayList0.add(gqcq.a);
        arrayList0.add(gqeq.Q);
        if(gqfe.a) {
            arrayList0.add(gqfe.c);
            arrayList0.add(gqfe.b);
            arrayList0.add(gqfe.d);
        }
        arrayList0.add(gqck.a);
        arrayList0.add(gqeq.b);
        arrayList0.add(new gqcm(gqbc0));
        arrayList0.add(new gqcx(gqbc0));
        gqcu gqcu0 = new gqcu(gqbc0);
        this.j = gqcu0;
        arrayList0.add(gqcu0);
        arrayList0.add(gqeq.V);
        arrayList0.add(new gqdi(gqbc0, v, gqbe0, gqcu0, list1));
        this.b = DesugarCollections.unmodifiableList(arrayList0);
    }

    public final gqad a(TypeToken typeToken0) {
        gqad gqad2;
        boolean z1;
        Objects.requireNonNull(typeToken0, "type must not be null");
        gqad gqad0 = (gqad)this.h.get(typeToken0);
        if(gqad0 != null) {
            return gqad0;
        }
        ThreadLocal threadLocal0 = this.g;
        Map map0 = (Map)threadLocal0.get();
        boolean z = false;
        if(map0 == null) {
            map0 = new HashMap();
            threadLocal0.set(map0);
            z1 = true;
            goto label_15;
        }
        gqad gqad1 = (gqad)map0.get(typeToken0);
        if(gqad1 == null) {
            z1 = false;
            try {
            label_15:
                gpzk gpzk0 = new gpzk();
                map0.put(typeToken0, gpzk0);
                gqad2 = null;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                label_19:
                    if(!iterator0.hasNext()) {
                        goto label_33;
                    }
                    Object object0 = iterator0.next();
                    gqad2 = ((gqae)object0).a(this, typeToken0);
                    if(gqad2 != null) {
                        if(gpzk0.a != null) {
                            throw new AssertionError("Delegate is already set");
                        }
                        gpzk0.a = gqad2;
                        map0.put(typeToken0, gqad2);
                        goto label_33;
                    }
                }
            }
            catch(Throwable throwable0) {
                if(z1) {
                    this.g.remove();
                }
                throw throwable0;
            }
            goto label_19;
        label_33:
            if(z1) {
                this.g.remove();
                z = true;
            }
            if(gqad2 == null) {
                throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken0);
            }
            if(z) {
                this.h.putAll(map0);
            }
            return gqad2;
        }
        return gqad1;
    }

    public final gqad b(Class class0) {
        return this.a(TypeToken.get(class0));
    }

    public final gqad c(gqae gqae0, TypeToken typeToken0) {
        Objects.requireNonNull(gqae0, "skipPast must not be null");
        Objects.requireNonNull(typeToken0, "type must not be null");
        Objects.requireNonNull(typeToken0);
        Objects.requireNonNull(gqae0);
        if(gqae0 == gqcu.a) {
            gqae0 = this.j;
        }
        else {
            gqcu gqcu0 = this.j;
            Class class0 = typeToken0.getRawType();
            gqae gqae1 = (gqae)gqcu0.c.get(class0);
            if(gqae1 == null) {
                gqag gqag0 = gqcu.d(class0);
                if(gqag0 != null) {
                    Class class1 = gqag0.a();
                    if(gqae.class.isAssignableFrom(class1) && gqcu0.c(class0, ((gqae)gqcu.e(gqcu0.b, class1))) == gqae0) {
                        gqae0 = this.j;
                    }
                }
            }
            else if(gqae1 == gqae0) {
                gqae0 = this.j;
            }
        }
        boolean z = false;
        for(Object object0: this.b) {
            gqae gqae2 = (gqae)object0;
            if(z) {
                gqad gqad0 = gqae2.a(this, typeToken0);
                if(gqad0 != null) {
                    return gqad0;
                }
            }
            else {
                if(gqae2 != gqae0) {
                    continue;
                }
                z = true;
            }
        }
        if(!z) {
            return this.a(typeToken0);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken0);
    }

    public final gqfh d(Writer writer0) {
        gqfh gqfh0 = new gqfh(writer0);
        gqfh0.b(this.c);
        gqfh0.c = true;
        gqfh0.c(gqaa.b);
        gqfh0.d = false;
        return gqfh0;
    }

    public final Object e(gqff gqff0, TypeToken typeToken0) {
        Object object0;
        gqaa gqaa0 = gqff0.a;
        if(gqaa0 == gqaa.b) {
            gqff0.q(gqaa.a);
        }
        try {
            boolean z = true;
            gqff0.u();
            z = false;
            gqad gqad0 = this.a(typeToken0);
            object0 = gqad0.a(gqff0);
            Class class0 = typeToken0.getRawType();
            if(class0 == Integer.TYPE) {
                class0 = Integer.class;
            }
            else if(class0 == Float.TYPE) {
                class0 = Float.class;
            }
            else if(class0 == Byte.TYPE) {
                class0 = Byte.class;
            }
            else if(class0 == Double.TYPE) {
                class0 = Double.class;
            }
            else if(class0 == Long.TYPE) {
                class0 = Long.class;
            }
            else if(class0 == Character.TYPE) {
                class0 = Character.class;
            }
            else if(class0 == Boolean.TYPE) {
                class0 = Boolean.class;
            }
            else if(class0 == Short.TYPE) {
                class0 = Short.class;
            }
            else if(class0 == Void.TYPE) {
                class0 = Void.class;
            }
            if(object0 != null && !class0.isInstance(object0)) {
                throw new ClassCastException("Type adapter \'" + gqad0.toString() + "\' returned wrong type; requested " + typeToken0.getRawType() + " but got instance of " + object0.getClass() + "\nVerify that the adapter was registered for the correct type.");
            }
        }
        catch(EOFException eOFException0) {
            if(z) {
                return null;
            }
            throw new gpzy(eOFException0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new gpzy(illegalStateException0);
        }
        catch(IOException iOException0) {
            throw new gpzy(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.13.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            gqff0.q(gqaa0);
        }
        return object0;
    }

    public final Object f(String s, TypeToken typeToken0) {
        if(s == null) {
            return null;
        }
        gqff gqff0 = new gqff(new StringReader(s));
        gqff0.q(gqaa.b);
        Object object0 = this.e(gqff0, typeToken0);
        if(object0 != null) {
            try {
                if(gqff0.u() != 10) {
                    throw new gpzy("JSON document was not fully consumed.");
                }
                return object0;
            }
            catch(gqfi gqfi0) {
                throw new gpzy(gqfi0);
            }
            catch(IOException iOException0) {
                throw new gpzr(iOException0);
            }
        }
        return object0;
    }

    public final Object g(String s, Class class0) {
        return this.f(s, TypeToken.get(class0));
    }

    public final Object h(String s, Type type0) {
        return this.f(s, TypeToken.get(type0));
    }

    public final String i(Object object0) {
        StringBuilder stringBuilder0;
        if(object0 == null) {
            stringBuilder0 = new StringBuilder();
            try {
                gqfh gqfh0 = this.d(new gqcb(stringBuilder0));
                gpzl.l(gpzs.a, gqfh0);
                return stringBuilder0.toString();
            }
            catch(IOException iOException0) {
                throw new gpzr(iOException0);
            }
        }
        stringBuilder0 = new StringBuilder();
        Class class0 = object0.getClass();
        try {
            this.k(object0, class0, this.d(new gqcb(stringBuilder0)));
            return stringBuilder0.toString();
        }
        catch(IOException iOException1) {
            throw new gpzr(iOException1);
        }
    }

    static void j(double f) {
        if(!Double.isNaN(f) && !Double.isInfinite(f)) {
            return;
        }
        throw new IllegalArgumentException(f + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final void k(Object object0, Type type0, gqfh gqfh0) {
        boolean z1;
        boolean z;
        gqad gqad0 = this.a(TypeToken.get(type0));
        gqaa gqaa0 = gqfh0.b;
        if(gqaa0 == gqaa.b) {
            gqfh0.c(gqaa.a);
        }
        try {
            z = gqfh0.c;
            z1 = gqfh0.d;
            gqfh0.c = true;
            gqfh0.d = false;
            gqad0.b(gqfh0, object0);
        }
        catch(IOException iOException0) {
            throw new gpzr(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.13.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            gqfh0.c(gqaa0);
            gqfh0.c = z;
            gqfh0.d = z1;
        }
    }

    public static final void l(gpzq gpzq0, gqfh gqfh0) {
        gqaa gqaa0 = gqfh0.b;
        boolean z = gqfh0.c;
        boolean z1 = gqfh0.d;
        gqfh0.c = true;
        gqfh0.d = false;
        if(gqaa0 == gqaa.b) {
            gqfh0.c(gqaa.a);
        }
        try {
            gqcc.b(gpzq0, gqfh0);
        }
        catch(IOException iOException0) {
            throw new gpzr(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.13.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            gqfh0.c(gqaa0);
            gqfh0.c = z;
            gqfh0.d = z1;
        }
    }

    @Override
    public final String toString() {
        return "{serializeNulls:false,factories:" + this.b + ",instanceCreators:" + this.i.toString() + "}";
    }
}

