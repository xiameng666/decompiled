import j..util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class ggmo implements Comparator {
    public gged_interceptors a(Iterable iterable0) {
        return gged_interceptors.D(this, iterable0);
    }

    public ggmo b() {
        return new ggnp(this);
    }

    public List c(Iterable iterable0) {
        Object[] arr_object = gggq.z(iterable0);
        Arrays.sort(arr_object, this);
        return new ArrayList(Arrays.asList(arr_object));
    }

    @Override
    public abstract int compare(Object arg1, Object arg2);

    public ggmo d() {
        return new ggmj(this);
    }

    public ggmo e() {
        return new ggmk(this);
    }

    public final ggmo f(Comparator comparator0) {
        gftb.check(comparator0);
        return new ggbf(this, comparator0);
    }

    public static ggmo g(Comparator comparator0) {
        return (comparator0 instanceof ggmo) ? ((ggmo)comparator0) : new ggba(comparator0);
    }

    public Object h(Iterable iterable0) {
        return this.i(iterable0.iterator());
    }

    public Object i(Iterator iterator0) {
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = this.j(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    public Object j(Object object0, Object object1) {
        return this.compare(object0, object1) < 0 ? object1 : object0;
    }

    public Object k(Iterable iterable0) {
        return this.l(iterable0.iterator());
    }

    public Object l(Iterator iterator0) {
        Object object0;
        for(object0 = iterator0.next(); iterator0.hasNext(); object0 = this.m(object0, object1)) {
            Object object1 = iterator0.next();
        }
        return object0;
    }

    public Object m(Object object0, Object object1) {
        return this.compare(object0, object1) > 0 ? object1 : object0;
    }

    public final List n(Iterable iterable0, int v) {
        return this.b().o(iterable0, v);
    }

    public final List o(Iterable iterable0, int v) {
        int v4;
        if((iterable0 instanceof Collection)) {
            long v1 = (long)v;
            if(((long)((Collection)iterable0).size()) <= v1 + v1) {
                Object[] arr_object = ((Collection)iterable0).toArray();
                Arrays.sort(arr_object, this);
                if(arr_object.length > v) {
                    arr_object = Arrays.copyOf(arr_object, v);
                }
                return DesugarCollections.unmodifiableList(Arrays.asList(arr_object));
            }
        }
        Iterator iterator0 = iterable0.iterator();
        gftb.check(iterator0);
        ggag.c(v, "k");
        if(v != 0 && iterator0.hasNext()) {
            if(v >= 0x3FFFFFFF) {
                ArrayList arrayList0 = ggia.c(iterator0);
                Collections.sort(arrayList0, this);
                if(arrayList0.size() > v) {
                    arrayList0.subList(v, arrayList0.size()).clear();
                }
                arrayList0.trimToSize();
                return DesugarCollections.unmodifiableList(arrayList0);
            }
            gftb.d(v >= 0, "k (%s) must be >= 0", v);
            int v2 = glug.a(v, 2);
            Object[] arr_object1 = new Object[v2];
            int v3 = 0;
            Object object0 = null;
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(v == 0) {
                }
                else if(v3 == 0) {
                    arr_object1[0] = object1;
                    v3 = 1;
                    object0 = object1;
                }
                else {
                    if(v3 < v) {
                        v4 = v3 + 1;
                        arr_object1[v3] = object1;
                        if(this.compare(object1, object0) > 0) {
                            object0 = object1;
                        }
                    }
                    else {
                        if(this.compare(object1, object0) >= 0) {
                            continue;
                        }
                        v4 = v3 + 1;
                        arr_object1[v3] = object1;
                        int v5 = v + v;
                        if(v4 == v5) {
                            int v6 = v5 - 1;
                            int v7 = gluj.b(v6, RoundingMode.CEILING) * 3;
                            int v8 = 0;
                            int v9 = 0;
                            int v10 = 0;
                            while(v8 < v6) {
                                int v11 = v8 + v6 + 1 >>> 1;
                                Object object2 = arr_object1[v11];
                                arr_object1[v11] = arr_object1[v6];
                                int v12 = v8;
                                int v13 = v12;
                                while(v12 < v6) {
                                    if(this.compare(arr_object1[v12], object2) < 0) {
                                        Object object3 = arr_object1[v13];
                                        arr_object1[v13] = arr_object1[v12];
                                        arr_object1[v12] = object3;
                                        ++v13;
                                    }
                                    ++v12;
                                }
                                arr_object1[v6] = arr_object1[v13];
                                arr_object1[v13] = object2;
                                if(v13 > v) {
                                    v6 = v13 - 1;
                                    goto label_70;
                                }
                                else if(v13 < v) {
                                    v8 = Math.max(v13, v8 + 1);
                                    v10 = v13;
                                label_70:
                                    if(v9 + 1 < v7) {
                                        ++v9;
                                        continue;
                                    }
                                    else {
                                        Arrays.sort(arr_object1, v8, v6 + 1, this);
                                    }
                                }
                                break;
                            }
                            int v14 = v10 + 1;
                            object0 = arr_object1[v10];
                            while(v14 < v) {
                                if(this.compare(arr_object1[v14], object0) > 0) {
                                    object0 = arr_object1[v14];
                                }
                                ++v14;
                            }
                            v3 = v;
                            continue;
                        }
                    }
                    v3 = v4;
                }
            }
            Arrays.sort(arr_object1, 0, v3, this);
            if(v3 > v) {
                Arrays.fill(arr_object1, v, v2, null);
                Object object4 = arr_object1[v - 1];
                return DesugarCollections.unmodifiableList(Arrays.asList(Arrays.copyOf(arr_object1, v)));
            }
            return DesugarCollections.unmodifiableList(Arrays.asList(Arrays.copyOf(arr_object1, v3)));
        }
        return Collections.EMPTY_LIST;
    }

    public final boolean p(Iterable iterable0) {
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(this.compare(object0, object1) <= 0) {
                    object0 = object1;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}

