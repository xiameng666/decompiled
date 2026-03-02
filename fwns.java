import android.net.ConnectivityManager.NetworkCallback;

public final class fwns implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        cmzz cmzz0 = (cmzz)object0;
        synchronized(cmzz0.a) {
            if(!cmzz0.y) {
                return;
            }
            cmzz0.y = false;
            if(huly.c()) {
                cmzz0.v.b();
                ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0 = cmzz0.B;
                if(connectivityManager$NetworkCallback0 != null) {
                    cmzz0.w.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
                    cmzz0.B = null;
                }
            }
            cnam cnam0 = cmzz0.h;
            if(cnam0 != null) {
                cnam0.b.unregisterReceiver(cnam0.c);
                cnxt.f(cnam0.b, cnam0);
                synchronized(cnam0) {
                    cnam0.e.clear();
                    cnam0.f.clear();
                    cnam0.g = false;
                    cnam0.h = null;
                    cnam0.i = 0L;
                    cnam0.j = 0L;
                    cnam0.k = null;
                }
                cmzz0.n.j(cmzz0);
                cnyl cnyl0 = cmzz0.A;
                if(cnyl0 != null) {
                    cnyl0.b();
                }
            }
            cmzz0.m(new cmze());
            if(huqy_phenotype.q() || huqy_phenotype.B()) {
                cnxt.f(cmzz0.x.a, cmzz0.x.c);
            }
            cmzz0.z.a();
            cmzz0.z.s(false);
            cmzz0.k.d();
            cmzz0.f.f();
            cmzz0.s.c();
            cmzz0.n.l(cmzz0);
        }
    }
}

