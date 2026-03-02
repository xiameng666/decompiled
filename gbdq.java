import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class gbdq {
    gbdq a;
    final bzt b;
    final bzt c;
    public final gbcg d;
    private final gbdr e;

    public gbdq(MessageLite hfvm0, gbdq gbdq0, gbdr gbdr0) {
        this.c = new bzt();
        gbcg[] arr_gbcg = gbdc.a;
        for(int v = 0; v < 34; ++v) {
            gbcg gbcg0 = arr_gbcg[v];
            if(gbcg0.a.getClass().isAssignableFrom(hfvm0.getClass())) {
                this.d = gbcg0;
                this.a = gbdq0;
                this.b = gbcg0.j().length <= 0 ? null : new bzt();
                this.e = gbdr0;
                return;
            }
        }
        Object[] arr_object = {hfvm0.getClass()};
        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported proto type: %s", arr_object));
    }

    public final float a(int v, int v1) {
        MessageLite hfvm0 = this.f(v, v1);
        return this.d.d(hfvm0, v);
    }

    public final int b(int v, int v1) {
        MessageLite hfvm0 = this.f(v, v1);
        int v2 = this.d.e(hfvm0, v);
        if(gbcb.b(v2)) {
            Integer integer0 = gbcb.a(this.e.a(), v2);
            if(integer0 == null) {
                return this.a == null ? v2 : this.a.b(v, v1);
            }
            return (int)integer0;
        }
        return v2;
    }

    public final int c(int v, int v1) {
        MessageLite hfvm0 = this.f(v, v1);
        return this.d.e(hfvm0, v);
    }

    public final gbdq d(int v) {
        gbdq gbdq0 = this.b == null ? null : ((gbdq)bzu.a(this.b, v));
        return gbdq0 == null ? this.p(v) : gbdq0;
    }

    public final MessageLite e(int v, int v1, Class class0) {
        MessageLite hfvm0 = this.f(v, v1);
        MessageLite hfvm1 = this.d.f(hfvm0, v);
        gftb.check(hfvm1);
        return (MessageLite)class0.cast(hfvm1);
    }

    public final MessageLite f(int v, int v1) {
        gbdt gbdt0 = (gbdt)bzu.a(this.c, v);
        MessageLite hfvm0 = null;
        if(gbdt0 == null) {
        label_12:
            if(hfvm0 == null) {
                gbdq gbdq0 = this.a;
                if(gbdq0 != null) {
                    hfvm0 = gbdq0.f(v, v1);
                }
            }
        }
        else {
            ArrayList arrayList0 = gbdt0.a;
            int v2 = arrayList0.size();
            while(true) {
                --v2;
                if(v2 < 0) {
                    goto label_12;
                }
                gbds gbds0 = (gbds)arrayList0.get(v2);
                if(gbds0.a(v1)) {
                    hfvm0 = gbds0.b;
                    goto label_12;
                }
            }
        }
        return hfvm0 == null ? this.d.a : hfvm0;
    }

    public final Object g(int v, int v1, Class class0) {
        MessageLite hfvm0 = this.f(v, v1);
        Object object0 = this.d.g(hfvm0, v);
        gftb.check(object0);
        return class0.cast(object0);
    }

    public final List h(int v, int v1) {
        MessageLite hfvm0 = this.f(v, v1);
        List list0 = this.d.h(hfvm0, v);
        List list1 = new ArrayList();
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            if((list0.get(v2) instanceof Integer)) {
                list1.add(Integer.valueOf(this.o(v, v1, ((Integer)list0.get(v2)).intValue(), v2)));
            }
        }
        return list1;
    }

    public final List i(int v, int v1) {
        MessageLite hfvm0 = this.f(v, v1);
        return this.d.h(hfvm0, v);
    }

    final void j(MessageLite hfvm0, int v) {
        gbcg gbcg0 = this.d;
        int[] arr_v = gbcg0.j();
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v3 = arr_v[v2];
            if(gbcg0.b(hfvm0, v3)) {
                MessageLite hfvm1 = gbcg0.a(hfvm0, v3);
                bzt bzt0 = this.b;
                if(bzt0 != null) {
                    gbdq gbdq0 = (gbdq)bzu.a(bzt0, v3);
                    if(gbdq0 == null) {
                        gbdq0 = new gbdq(hfvm1, this.p(v3), this.e);
                        bzt0.h(v3, gbdq0);
                    }
                    gbdq0.j(hfvm1, v);
                }
            }
        }
        if(gbcg0.b == null) {
            gbcg0.b = gbcg0.i();
        }
        int[] arr_v1 = gbcg0.b;
        for(int v1 = 0; v1 < arr_v1.length; ++v1) {
            int v4 = arr_v1[v1];
            if(gbcg0.b(hfvm0, v4)) {
                bzt bzt1 = this.c;
                gbdt gbdt0 = (gbdt)bzu.a(bzt1, v4);
                if(gbdt0 == null) {
                    gbdt0 = new gbdt();
                    bzt1.h(v4, gbdt0);
                }
                gbds gbds0 = new gbds(hfvm0, v);
                ArrayList arrayList0 = gbdt0.a;
                int v5 = arrayList0.size();
                while(true) {
                    --v5;
                    if(v5 < 0) {
                        break;
                    }
                    if(gbds0.a(((gbds)arrayList0.get(v5)).a)) {
                        arrayList0.remove(v5);
                    }
                }
                arrayList0.add(gbds0);
            }
        }
    }

    final void k(gbdq gbdq0) {
        this.a = gbdq0;
        bzt bzt0 = this.b;
        int v1 = bzt0 == null ? 0 : bzt0.c();
        for(int v = 0; v < v1; ++v) {
            gftb.check(bzt0);
            ((gbdq)bzt0.e(v)).k(this.p(bzt0.b(v)));
        }
    }

    public final boolean l(int v, int v1) {
        MessageLite hfvm0 = this.f(v, v1);
        return this.d.b(hfvm0, v);
    }

    public final boolean m(int v) {
        MessageLite hfvm0 = this.f(4, v);
        return this.d.k(hfvm0);
    }

    public final List n(int v) {
        MessageLite hfvm0 = this.f(1, v);
        List list0 = this.d.h(hfvm0, 1);
        List list1 = new ArrayList(list0.size());
        ArrayList arrayList0 = new ArrayList();
        ibuq.f(list0, "colorConfigList");
        for(Object object0: list0) {
            hdjw hdjw0 = (hdjw)object0;
            if(gbcb.b(hdjw0.c)) {
                Context context0 = this.e.a();
                ibuq.e(context0, "getDynamicColorContext(...)");
                Integer integer0 = gbcb.a(context0, hdjw0.c);
                if(integer0 == null) {
                    hfuo hfuo0 = hdjw0.b;
                    ibuq.e(hfuo0, "getTargetPathList(...)");
                    arrayList0.add(hfuo0);
                }
                else {
                    list1.add(new gbdo(hdjw0, integer0));
                }
            }
            else {
                list1.add(new gbdo(hdjw0, null));
            }
        }
        if(!arrayList0.isEmpty()) {
            gbdq gbdq0 = this.a;
            if(gbdq0 != null) {
                List list2 = gbdq0.n(v);
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: list2) {
                    if(arrayList0.contains(((gbdo)object1).a())) {
                        arrayList1.add(object1);
                    }
                }
                list1.addAll(arrayList1);
            }
        }
        return list1;
    }

    private final int o(int v, int v1, int v2, int v3) {
        Integer integer0 = gbcb.a(this.e.a(), v2);
        if(integer0 != null) {
            return (int)integer0;
        }
        try {
            return this.a == null ? v2 : ((int)(((Integer)this.a.i(v, v1).get(v3))));
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new IllegalArgumentException("Parent propertyClass contains fewer colors than current propertyClass", indexOutOfBoundsException0);
        }
    }

    private final gbdq p(int v) {
        return this.a == null ? null : this.a.d(v);
    }
}

