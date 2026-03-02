import android.util.Pair;

public final class dvdo implements lqj {
    public final dvfh a;

    public dvdo(dvfh dvfh0) {
        this.a = dvfh0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        gtxx gtxx0;
        dvfh dvfh0 = this.a;
        if(hwmp.z()) {
            dtyx dtyx0 = (dtyx)dvfh0.l.ij();
            gtxx0 = dtyx0 == null ? ((gtxx)dvfh0.i.ij()) : dtyx0.c;
        }
        else {
            gtxx0 = (gtxx)dvfh0.i.ij();
        }
        if(gtxx0 != null && ((gtxg)object0) != null) {
            Pair pair0 = Pair.create(gtxx0, ((gtxg)object0));
            dvfh0.n.l(pair0);
        }
    }
}

