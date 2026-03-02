import java.util.Iterator;
import java.util.Map;

public final class ity implements ibvi, ivj, Iterable {
    public boolean a;
    public boolean b;
    public final bzk c;
    private Map d;

    public ity() {
        this.c = new bzk(null);
    }

    @Override  // ivj
    public final void a(ivi ivi0, Object object0) {
        if((object0 instanceof itj) && this.f(ivi0)) {
            bzk bzk0 = this.c;
            Object object1 = bzk0.a(ivi0);
            ibuq.d(object1, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            String s = ((itj)object0).a;
            if(s == null) {
                s = ((itj)object1).a;
            }
            ibnk ibnk0 = ((itj)object0).b;
            if(ibnk0 == null) {
                ibnk0 = ((itj)object1).b;
            }
            bzk0.k(ivi0, new itj(s, ibnk0));
            return;
        }
        this.c.k(ivi0, object0);
    }

    public final ity b() {
        ity ity0 = new ity();
        ity0.a = this.a;
        ity0.b = this.b;
        bzk bzk0 = ity0.c;
        Object[] arr_object = this.c.b;
        Object[] arr_object1 = this.c.c;
        long[] arr_v = this.c.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            bzk0.k(arr_object[v5], arr_object1[v5]);
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return ity0;
    }

    public final Object c(ivi ivi0) {
        Object object0 = this.c.a(ivi0);
        if(object0 != null) {
            return object0;
        }
        throw new IllegalStateException(a.i(ivi0, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final Object d(ivi ivi0, ibth ibth0) {
        Object object0 = this.c.a(ivi0);
        return object0 == null ? ibth0.a() : object0;
    }

    public final void e(ity ity0) {
        Object[] arr_object = ity0.c.b;
        Object[] arr_object1 = ity0.c.c;
        long[] arr_v = ity0.c.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object0 = arr_object[v5];
                            Object object1 = arr_object1[v5];
                            ivi ivi0 = (ivi)object0;
                            bzk bzk0 = this.c;
                            Object object2 = bzk0.a(ivi0);
                            ibuq.d(ivi0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                            Object object3 = ivi0.b.a(object2, object1);
                            if(object3 != null) {
                                bzk0.k(ivi0, object3);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_26;
                    }
                    break;
                }
            label_26:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ity)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ity)object0).c)) {
            return false;
        }
        return this.a == ((ity)object0).a ? this.b == ((ity)object0).b : false;
    }

    public final boolean f(ivi ivi0) {
        return this.c.c(ivi0);
    }

    @Override
    public final int hashCode() {
        return (this.c.hashCode() * 0x1F + itx.a(this.a)) * 0x1F + itx.a(this.b);
    }

    @Override
    public final Iterator iterator() {
        Map map0 = this.d;
        if(map0 == null) {
            bym bym0 = new bym(this.c);
            this.d = bym0;
            map0 = bym0;
        }
        return map0.entrySet().iterator();
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a) {
            stringBuilder0.append("mergeDescendants=true");
            s = ", ";
        }
        else {
            s = "";
        }
        if(this.b) {
            stringBuilder0.append(s);
            stringBuilder0.append("isClearingSemantics=true");
            s = ", ";
        }
        Object[] arr_object = this.c.b;
        Object[] arr_object1 = this.c.c;
        long[] arr_v = this.c.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((v2 & 0xFFL) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object0 = arr_object[v5];
                            Object object1 = arr_object1[v5];
                            stringBuilder0.append(s);
                            stringBuilder0.append(((ivi)object0).a);
                            stringBuilder0.append(" : ");
                            stringBuilder0.append(object1);
                            s = ", ";
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_34;
                    }
                    break;
                }
            label_34:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return ipy.a(this) + "{ " + stringBuilder0 + " }";
    }
}

