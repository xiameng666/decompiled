public final class iaqw extends iaqy {
    final iaqy[] a;

    public iaqw(iaqy[] arr_iaqy) {
        this.a = arr_iaqy;
        super();
    }

    @Override  // iaqy
    public final iapk a(int v) {
        iaqy[] arr_iaqy = this.a;
        for(int v1 = 0; v1 < arr_iaqy.length; ++v1) {
            iapk iapk0 = arr_iaqy[v1].a(v);
            if(!iapk0.h()) {
                return iapk0;
            }
        }
        return iapk.b;
    }
}

