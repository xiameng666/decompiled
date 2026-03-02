public final class igfl {
    public final igfh[] a;
    public igfk[] b;

    public igfl(igfh[] arr_igfh) {
        this.a = arr_igfh;
        this.b = new igfk[16];
    }

    final int a() {
        return this.a.length;
    }

    public final igfl b(int v) {
        igfh[] arr_igfh = this.a;
        if(v >= arr_igfh.length) {
            throw new IndexOutOfBoundsException();
        }
        igfh[] arr_igfh1 = new igfh[arr_igfh.length - 1];
        int v2 = 0;
        for(int v1 = 0; v1 < arr_igfh.length; ++v1) {
            if(v1 != v) {
                arr_igfh1[v2] = arr_igfh[v1];
                ++v2;
            }
        }
        return new igfl(arr_igfh1);
    }
}

