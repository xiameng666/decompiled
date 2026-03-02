import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class gbbb {
    public static final gcsn a(clcn clcn0, gcso gcso0) {
        Object object0;
        try {
            gmcd gmcd0 = clcn0.a();
            gaxl.a();
            clcp clcp0 = (clcp)gmcd0.get(hzse.b(), TimeUnit.MILLISECONDS);
            object0 = new gbbd(gcso0);
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        ibwv[] arr_ibwv = new ibwv[4];
        arr_ibwv[0] = new ibuk(ExecutionException.class);
        arr_ibwv[1] = new ibuk(InterruptedException.class);
        arr_ibwv[2] = new ibuk(TimeoutException.class);
        arr_ibwv[3] = new ibuk(clbw.class);
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            for(int v = 0; v < 4; ++v) {
                if(arr_ibwv[v].d(throwable1)) {
                    if(gcso0.d == 302) {
                        throw new gcqz(gbbe.b(gcso0.a), new gcrc(((Exception)throwable1), gcso0.f, gcso0.g));
                    }
                    clcn0.b();
                    throw new gcqz(gbbe.b(gcso0.a), ((Exception)throwable1));
                }
            }
        }
        ibnx.b(object0);
        return (gcsn)object0;
    }
}

