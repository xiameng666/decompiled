import java.util.Arrays;

public final class svb implements svi {
    private final ssr a;

    public svb(ssr ssr0) {
        this.a = ssr0;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        sww.a(srb0, 97);
        ssr ssr0 = this.a;
        swg swg0 = srb0.b;
        if(!swg0.c(ssr0.a())) {
            throw new sqy("OID does not match any ADF", srg.m);
        }
        swh swh0 = new swh();
        swy swy0 = new swy(null, ssr0);
        swh0.c.add(swy0);
        swe swe0 = swg0.c;
        sxd sxd0 = swe0.b;
        boolean z = svb.b(ssr0, sxd0);
        sxd sxd1 = swe0.a;
        boolean z1 = svb.b(ssr0, sxd1);
        if(z) {
        label_15:
            if(z1) {
                sxd1 = sxd.a;
            }
            if(z) {
                sxd0 = sxd.a;
            }
            swh0.c(new swe(sxd1, sxd0, swe0.c));
        }
        else if(z1) {
            z1 = true;
            goto label_15;
        }
        srb0.c(swh0);
        srb0.d(srb0.a(), ((boolean)(srb0.c.e() ^ 1)), true);
        return new swl();
    }

    private static final boolean b(ssr ssr0, sxd sxd0) {
        return sxd0.d() && Arrays.equals(((ssr)sxd0.b()).a(), ssr0.a());
    }
}

