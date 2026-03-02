import android.util.Pair;

public final class dvdn implements lqj {
    public final dvfh a;

    public dvdn(dvfh dvfh0) {
        this.a = dvfh0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        gtxg gtxg0;
        dvfh dvfh0 = this.a;
        if(hwmp.z()) {
            dtyx dtyx0 = (dtyx)dvfh0.l.ij();
            gtxg0 = dtyx0 == null ? ((gtxg)dvfh0.j.ij()) : dtyx0.a;
        }
        else {
            gtxg0 = (gtxg)dvfh0.j.ij();
        }
        if(((gtxx)object0) != null && gtxg0 != null) {
            Pair pair0 = Pair.create(((gtxx)object0), gtxg0);
            dvfh0.n.l(pair0);
        }
    }
}

