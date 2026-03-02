import java.util.List;

public final class suc implements svi {
    private final ssp a;
    private final List b;

    public suc(ssp ssp0, List list0) {
        this.a = ssp0;
        this.b = list0;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        sww.a(srb0, 6);
        swh swh0 = new swh();
        for(Object object0: srb0.b.b()) {
            svt svt0 = (svt)object0;
            if(svt0.o(this.b)) {
                ssp ssp0 = svt0.e().f;
                ssp ssp1 = this.a;
                if(ssp0 != ssp1) {
                    swh0.b(svt0, ssp1);
                }
            }
        }
        srb0.c(swh0);
        return new swl();
    }
}

