public final class bnrj implements gfsi {
    public final bnrl a;

    public bnrj(bnrl bnrl0) {
        this.a = bnrl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        for(int v = 0; true; v = (short)(v + 1)) {
            fqux[] arr_fqux = this.a.d;
            if(v >= arr_fqux.length) {
                break;
            }
            if(arr_fqux[v].equals(((bnrz)object0).a)) {
                return (short)v;
            }
        }
        throw new AssertionError("Can\'t find the index of the CanonicDeviceId");
    }
}

