final class bnrl {
    public final long[] a;
    public final short[] b;
    public final long[] c;
    public final fqux[] d;

    public bnrl(ggfz ggfz0) {
        this.a = glxd.j(ggfz0.d);
        bnri bnri0 = new bnri();
        boolean z = false;
        fqux[] arr_fqux = (fqux[])ggfp.F(gggq.j(ggfz0.e, bnri0)).toArray(new fqux[0]);
        this.d = arr_fqux;
        if(arr_fqux.length < 0x7FFF) {
            z = true;
        }
        gftb.q(z);
        this.b = glxf.e(ggch.j(ggfz0.e).l(new bnrj(this)).n());
        this.c = glxd.j(ggch.j(ggfz0.e).l(new bnrk()).n());
    }

    public bnrl(long[] arr_v, short[] arr_v1, long[] arr_v2, fqux[] arr_fqux) {
        this.a = arr_v;
        this.b = arr_v1;
        this.c = arr_v2;
        this.d = arr_fqux;
    }
}

