import j..util.Objects;

public final class etow implements etqp {
    @Override  // etqp
    public final Object a(etqg etqg0) {
        if(etqg0.d.equals("unacknowledged")) {
            etqg0.d = "active";
            etqg0.e = null;
            etqg0.g = null;
            etqg0.n = null;
            hksr hksr0 = etqg0.o;
            if(hksr0 != null) {
                hksr hksr1 = (hksr)Objects.requireNonNull(hksr0);
                etqg0.l = hksr1.c;
                etqg0.m = gged_interceptors.i(hksr1.d);
                etqg0.o = null;
            }
        }
        etqg0.j = null;
        return etqg0;
    }
}

