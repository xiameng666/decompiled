import android.accounts.Account;

public final class fkwa implements glzn {
    public final fkwe a;
    public final Account b;
    public final String c;

    public fkwa(fkwe fkwe0, Account account0, String s) {
        this.a = fkwe0;
        this.b = account0;
        this.c = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ggdy ggdy0 = new ggdy();
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            fiyh fiyh0 = (fiyh)((gged_interceptors)object0).get(v1);
            if(fkwe.c(fiyh0) && fkwe.b(fiyh0, this.b)) {
                gftb.checkTrue(fkwe.c(fiyh0));
                if(!fiyh0.c.substring(17).equals(this.c)) {
                    fjgk fjgk0 = fkwe.a(fiyh0);
                    ggdy0.i(this.a.a.k(fjgk0));
                }
            }
        }
        return gdtf.k(gmbu.o(ggdy0.h()), new fkwb(), gmap.a);
    }
}

