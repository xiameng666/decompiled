import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.TimeoutError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

abstract class epye {
    private final int a;
    private final int b;
    private final float c;

    public epye(int v, int v1, float f) {
        this.a = v;
        this.b = v1;
        this.c = f;
    }

    protected abstract Future a();

    protected abstract Object b(int arg1);

    public final Object c() {
        int v = 0;
        while(v < this.b) {
            Future future0 = this.a();
            try {
                return ((glyq)future0).u();
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(throwable0 == null) {
                    break;
                }
                if((throwable0 instanceof NoConnectionError)) {
                    if(!epye.d(this.a, this.c, v, this.b)) {
                        epyf.b.g("Network error calling exchange_session_checkpoints", executionException0, new Object[0]);
                        return this.b(3);
                    }
                    ++v;
                    continue;
                }
                if((throwable0 instanceof TimeoutError) || (throwable0 instanceof NetworkError)) {
                    epyf.b.g("Network error calling exchange_session_checkpoints", executionException0, new Object[0]);
                    return this.b(3);
                }
                break;
            }
            catch(InterruptedException interruptedException0) {
                epyf.b.n("Operation interrupted: " + interruptedException0.toString(), interruptedException0, new Object[0]);
                return this.b(1);
            }
        }
        return this.b(1);
    }

    public static boolean d(long v, float f, int v1, int v2) {
        try {
            Thread.sleep(((long)(((double)v) * Math.pow(f, v1))));
        }
        catch(InterruptedException interruptedException0) {
            epyf.b.k("Wait interrupted.", interruptedException0, new Object[0]);
        }
        return v1 + 1 < v2;
    }
}

