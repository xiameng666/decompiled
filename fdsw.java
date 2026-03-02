public final class fdsw implements fdtv {
    @Override  // fdtv
    public final byte[] a(MessageLite hfvm0, hfwn hfwn0) {
        feki feki0 = new feki();
        feki0.f("GetDataItemsRequest");
        feki0.j(hfwn0);
        feki0.g(1, ((hlau)hfvm0).d);
        feki0.h(2, ((hlau)hfvm0).e);
        feki0.g(3, ((hlau)hfvm0).f);
        feki0.g(4, ((hlau)hfvm0).g);
        feki0.d(5, ((hlau)hfvm0).h);
        hlbm hlbm0 = ((hlau)hfvm0).i;
        if(hlbm0 == null) {
            hlbm0 = hlbm.a;
        }
        if(hlbm0.b.size() > 0) {
            feki0.e(6);
            hlbm hlbm1 = ((hlau)hfvm0).i;
            if(hlbm1 == null) {
                hlbm1 = hlbm.a;
            }
            feki0.e(1);
            feki0.e(hlbm1.b.size());
            for(Object object0: hlbm1.b) {
                feki0.h(1, ((hlbk)object0).b);
                feki0.g(2, ((hlbk)object0).c);
            }
        }
        feki0.i(7, ((hlau)hfvm0).j);
        feki0.b(8, ((hlau)hfvm0).k);
        return feki0.a();
    }
}

