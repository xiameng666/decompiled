import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class bpnl extends cjtm {
    private final bpnk a;
    private final Object b;
    private final bpnj c;

    public bpnl(String s, bpnk bpnk0, Object object0, bpnj bpnj0) {
        super(284, s);
        this.a = bpnk0;
        this.b = object0;
        this.c = bpnj0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            Object object0 = this.c.a(this.b).get();
            this.a.a(Status.b, object0);
        }
        catch(ExecutionException executionException0) {
            if(!(executionException0.getCause() instanceof aztb)) {
                String s = this.q();
                if(executionException0.getCause() != null) {
                    executionException0 = executionException0.getCause();
                }
                throw new cjuh(13, s + " failed.", null, executionException0);
            }
            aztb aztb0 = (aztb)executionException0.getCause();
            throw new cjuh(aztb0.a.i, aztb0.a.j, aztb0.a.k, aztb0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new cjuh(14, this.q() + " was interrupted.", null, interruptedException0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null);
    }
}

