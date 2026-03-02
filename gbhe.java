import android.accounts.Account;
import android.content.Context;
import android.os.Binder;

public final class gbhe {
    public static hckh a(Context context0, hckk hckk0, Long long0, byte[] arr_b, int v, String s, boolean z, boolean z1, int v1, boolean z2, Account account0, Account[] arr_account, hcke hcke0) {
        hckh hckh0;
        gaxl.a();
        gawf gawf0 = hzng.c() ? gawf.a(context0) : null;
        gaxl.a();
        bmei bmei0 = new bmei(context0);
        gaxl.a();
        long v2 = hzks.b();
        long v3 = Binder.clearCallingIdentity();
        try {
            gbhd gbhd0 = new gbhd(context0.getApplicationContext());
            gbhd0.b = hckk0;
            gbhd0.e = long0;
            gbhd0.s = 1;
            gbhd0.c = true;
            gbhd0.t = 3;
            gbhd0.d = v;
            gbhd0.f = s;
            gbhd0.g = z;
            gbhd0.h = z1;
            gbhd0.u = v1;
            gaxl.a();
            gbhd0.i = gaxm.o();
            gbhd0.j = z2;
            gbhd0.r = gawf0;
            gbhd0.k = bmei0;
            gbhd0.l = v2;
            gbhd0.m = account0;
            gbhd0.n = arr_account;
            gbhd0.o = hcke0;
            gbhd0.p = null;
            gbhd0.c();
            gbhd0.q = arr_b;
            hckh0 = gbhd0.b();
        }
        finally {
            Binder.restoreCallingIdentity(v3);
        }
        return hckh0;
    }
}

