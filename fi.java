import java.util.ArrayList;

final class fi implements fh {
    final String a;
    final int b;
    final int c;
    final fm d;

    public fi(fm fm0, String s, int v, int v1) {
        this.d = fm0;
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override  // fh
    public final boolean k(ArrayList arrayList0, ArrayList arrayList1) {
        return this.d.t == null || this.b >= 0 || this.a != null || !this.d.t.getChildFragmentManager().av() ? this.d.ay(arrayList0, arrayList1, this.a, this.b, this.c) : false;
    }
}

