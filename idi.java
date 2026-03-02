import java.util.HashSet;

final class idi extends ibur implements ibth {
    final idj a;

    public idi(idj idj0) {
        this.a = idj0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        idj idj0 = this.a;
        idj0.e = false;
        HashSet hashSet0 = new HashSet();
        gwq gwq0 = idj0.c;
        Object[] arr_object = gwq0.a;
        int v1 = gwq0.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            ify ify0 = (ify)arr_object[v2];
            idg idg0 = (idg)idj0.d.a[v2];
            hfb hfb0 = ify0.u.f;
            if(hfb0.B) {
                idj.b(hfb0, idg0, hashSet0);
            }
        }
        gwq0.g();
        idj0.d.g();
        gwq gwq1 = idj0.a;
        Object[] arr_object1 = gwq1.a;
        int v3 = gwq1.b;
        for(int v = 0; v < v3; ++v) {
            idx idx0 = (idx)arr_object1[v];
            idg idg1 = (idg)idj0.b.a[v];
            if(idx0.B) {
                idj.b(idx0, idg1, hashSet0);
            }
        }
        gwq1.g();
        idj0.b.g();
        for(Object object0: hashSet0) {
            ((idx)object0).z();
        }
        return ibom.a;
    }
}

