import java.util.ArrayList;
import java.util.List;

final class six implements iau {
    final float a;
    final float b;

    public six(float f, float f1) {
        this.a = f;
        this.b = f1;
        super();
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        return iat.a(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        return iat.b(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        return iat.c(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        return iat.d(this, hzg0, list0, v);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        ibvb ibvb7;
        ibvb ibvb6;
        ibvb ibvb5;
        float f1;
        float f;
        six six0 = this;
        iax iax1 = iax0;
        ibuq.f(iax1, "$this$Layout");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ibvb ibvb0 = new ibvb();
        ibvb ibvb1 = new ibvb();
        ArrayList arrayList3 = new ArrayList();
        ibvb ibvb2 = new ibvb();
        int v1 = list0.size();
        int v2 = 0;
        ibvb ibvb3 = ibvb0;
        ArrayList arrayList4 = arrayList2;
        ibvb ibvb4 = new ibvb();
        while(true) {
            f = six0.b;
            f1 = six0.a;
            if(v2 >= v1) {
                break;
            }
            ibq ibq0 = ((ias)list0.get(v2)).e(v);
            if(arrayList3.isEmpty()) {
                ibvb5 = ibvb2;
                ibvb6 = ibvb3;
                ibvb7 = ibvb1;
            }
            else if(ibvb2.a + iax1.ei(f1) + ibq0.a > jkp.b(v)) {
                ibvb5 = ibvb2;
                ibvb6 = ibvb3;
                arrayList0 = arrayList0;
                six.f(arrayList0, ibvb1, iax1, f, arrayList3, arrayList1, ibvb4, arrayList4, ibvb6, ibvb5);
                ibvb7 = ibvb1;
                iax1 = iax1;
            }
            else {
                ibvb5 = ibvb2;
                ibvb6 = ibvb3;
                ibvb7 = ibvb1;
                arrayList0 = arrayList0;
            }
            if(!arrayList3.isEmpty()) {
                ibvb5.a += iax1.ei(f1);
            }
            arrayList3.add(ibq0);
            ibvb5.a += ibq0.a;
            ibvb4.a = Math.max(ibvb4.a, ibq0.b);
            ibvb3 = ibvb6;
            ibvb2 = ibvb5;
            ++v2;
            v1 = v1;
            ibvb1 = ibvb7;
            six0 = this;
        }
        ibvb ibvb8 = ibvb3;
        ibvb ibvb9 = ibvb1;
        if(!arrayList3.isEmpty()) {
            six.f(arrayList0, ibvb9, iax1, f, arrayList3, arrayList1, ibvb4, arrayList4, ibvb8, ibvb2);
            arrayList0 = arrayList0;
            ibvb9 = ibvb9;
            ibvb8 = ibvb8;
            arrayList4 = arrayList4;
        }
        int v3 = Math.max(ibvb8.a, jkp.d(v));
        return iaw.b(iax0, v3, Math.max(ibvb9.a, jkp.c(v)), new siw(arrayList0, iax0, f1, v3, arrayList4));
    }

    private static final void f(List list0, ibvb ibvb0, iax iax0, float f, List list1, List list2, ibvb ibvb1, List list3, ibvb ibvb2, ibvb ibvb3) {
        if(!list0.isEmpty()) {
            ibvb0.a += iax0.ei(f);
        }
        list0.add(0, ibpo.ar(list1));
        list2.add(Integer.valueOf(ibvb1.a));
        list3.add(Integer.valueOf(ibvb0.a));
        ibvb0.a += ibvb1.a;
        ibvb2.a = Math.max(ibvb2.a, ibvb3.a);
        list1.clear();
        ibvb3.a = 0;
        ibvb1.a = 0;
    }
}

