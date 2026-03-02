import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class aip {
    static final Executor a;
    public static final int b;

    static {
        adz.a();
        aip.a = Executors.newCachedThreadPool();
    }

    public static gmcd a(aio aio0) {
        kay.i(aio0);
        acgr acgr0 = new acgr(aio0.c);
        bawz bawz0 = new bawz(aio0.a);
        acgm acgm0 = new acgm(aio0.a, acgr0, bawz0);
        Feature[] arr_feature = acgm0.gm();
        acgn.a();
        ExecutorService executorService0 = achl.a();
        evqp evqp0 = new evqp();
        achv achv0 = new achv(evqp0, acgm0.e);
        ArrayList arrayList0 = new ArrayList();
        bavv.b(new acht(arr_feature), arrayList0);
        bavw bavw0 = bavv.a(arrayList0, achv0);
        evql evql0 = acgm0.e.c(bavw0).f(executorService0, new achu(arr_feature, evqp0));
        evql0.A(new acfq());
        return ajj.a(evql0.d(executorService0, new acfr()).g(new acfp(acgm0)), new aim(aio0), aio0.c);
    }
}

