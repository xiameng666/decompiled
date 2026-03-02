import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

abstract class epyd {
    private final float a;
    private final int b;
    private final int c;

    public epyd(int v, int v1, float f) {
        this.a = f;
        this.b = v;
        this.c = v1;
    }

    protected abstract Future a();

    protected abstract ProtoLiteMessage b(int arg1);

    public final ProtoLiteMessage c() {
        int v = 0;
        while(v < this.c) {
            Future future0 = this.a();
            try {
                return ((cldc)future0.get()).b;
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(!(throwable0 instanceof clbr)) {
                    return this.b(1);
                }
                if(((clbr)throwable0).a() == 2 && epye.d(this.b, this.a, v, this.c)) {
                    ++v;
                    continue;
                }
                epyf.b.g("Network error calling exchange_session_checkpoints", executionException0, new Object[0]);
                return this.b(3);
            }
            catch(InterruptedException interruptedException0) {
                epyf.b.n("Operation interrupted: " + interruptedException0.toString(), interruptedException0, new Object[0]);
                return this.b(1);
            }
        }
        return this.b(1);
    }
}

