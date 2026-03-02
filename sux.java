import java.util.List;

public final class sux implements svi {
    private final boolean a;
    private final boolean b;
    private final List c;

    public sux(List list0, boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
        this.c = list0;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        if((srb0.a() instanceof swa)) {
            return new swl();
        }
        sww.a(srb0, 6);
        List list0 = srb0.b.b();
        sxk sxk0 = new sxk();
        for(Object object0: this.c) {
            ssr ssr0 = (ssr)object0;
            int v = 1;
            while(v < list0.size()) {
                svt svt0 = (svt)list0.get(v);
                if(svt0.p(ssr0)) {
                    if(this.a) {
                        sxd sxd0 = svt0.m();
                        if(sxd0.d() && ((byte[])sxd0.b())[0] == -1) {
                            goto label_16;
                        }
                    }
                    else {
                    label_16:
                        sxk0.d((svt0.e().c() ? ssr.a.a : ssr.c.a), svt0.e().a());
                        if(this.b) {
                            ssy ssy0 = ssn.a;
                            sxd sxd1 = svt0.i(ssy0);
                            if(sxd1.d()) {
                                byte[] arr_b = ((stb)sxd1.b()).a();
                                sxk0.d(ssy0.a, arr_b);
                            }
                        }
                    }
                }
                ++v;
            }
        }
        return new swl(sxk0.b());
    }
}

