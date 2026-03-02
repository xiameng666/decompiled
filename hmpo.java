import java.util.ArrayList;
import java.util.List;

public final class hmpo extends hmpf {
    final hmpd b;
    private static final List c;
    private static final List d;

    static {
        ArrayList arrayList0 = new ArrayList();
        hmpo.c = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        hmpo.d = arrayList1;
        hmpg hmpg0 = new hmpg(3, 3, 3, 3);
        hmpg hmpg1 = new hmpg(3, 4, 4, 3);
        hmpg hmpg2 = new hmpg(3, 4, 4, 4);
        hmpg hmpg3 = new hmpg(2, 2, 4, 4);
        hmpg hmpg4 = new hmpg(3, 2, 4, 4);
        hmpg hmpg5 = new hmpg(2, 4, 4, 4);
        hmpg hmpg6 = new hmpg(3, 2, 2, 3);
        hmpg hmpg7 = new hmpg(4, 4, 4, 4);
        arrayList0.add(hmpg0);
        arrayList0.add(hmpg1);
        arrayList0.add(hmpg2);
        arrayList0.add(hmpg3);
        arrayList0.add(hmpg4);
        arrayList0.add(hmpg5);
        arrayList0.add(hmpg6);
        arrayList0.add(hmpg7);
        hmpp hmpp0 = new hmpp(1, 1, 1, 4);
        hmpp hmpp1 = new hmpp(1, 1, 1, 1);
        hmpp hmpp2 = new hmpp(1, 4, 1, 4);
        hmpp hmpp3 = new hmpp(4, 2, 3, 2);
        hmpp hmpp4 = new hmpp(4, 2, 3, 4);
        hmpp hmpp5 = new hmpp(4, 4, 3, 2);
        hmpp hmpp6 = new hmpp(4, 4, 3, 4);
        hmpp hmpp7 = new hmpp(4, 4, 3, 4);
        arrayList1.add(hmpp0);
        arrayList1.add(hmpp1);
        arrayList1.add(hmpp2);
        arrayList1.add(hmpp3);
        arrayList1.add(hmpp4);
        arrayList1.add(hmpp5);
        arrayList1.add(hmpp6);
        arrayList1.add(hmpp7);
    }

    public hmpo(byte[] arr_b, Integer integer0) {
        this.a = arr_b;
        hmpd hmpd0 = new hmpd();
        this.b = hmpd0;
        hmpd0.b(arr_b);
    }

    @Override  // hmpf
    public final void a(byte[] arr_b) {
        if(arr_b == null || arr_b.length != 16) {
            throw new hmoy(12);
        }
        this.a = arr_b;
        this.b.b(this.a);
    }

    @Override  // hmpf
    public final byte[] b() {
        return this.a;
    }

    public final hmpg c(int v) {
        int v1 = this.b.a(v).a();
        return (hmpg)hmpo.c.get(v1);
    }

    public final hmpp d(int v) {
        int v1 = this.b.a(v).a();
        return (hmpp)hmpo.d.get(v1);
    }

    public final boolean e(int v, int v1) {
        return this.c(v1).a == v;
    }

    public final boolean f(int v, int v1) {
        int v2 = this.d(v1).d;
        return v2 == v && v2 != 4;
    }

    public final boolean g(int v, int v1) {
        int v2 = this.d(v1).b;
        return v2 == v && v2 != 4;
    }
}

