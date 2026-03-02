import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class fvwq implements Callable {
    public final fvww a;
    public final fvwx[] b;
    public final int c;
    public final boolean d;

    public fvwq(fvww fvww0, fvwx[] arr_fvwx, int v, boolean z) {
        this.a = fvww0;
        this.b = arr_fvwx;
        this.c = v;
        this.d = z;
    }

    @Override
    public final Object call() {
        fvww fvww0 = this.a;
        synchronized(fvww0) {
            fvww0.d(this.b, this.c);
            if(this.d) {
                DataOutputStream dataOutputStream0 = fvww0.a;
                if(dataOutputStream0 != null) {
                    try {
                        dataOutputStream0.flush();
                    }
                    catch(IOException unused_ex) {
                    }
                }
            }
        }
        return Boolean.TRUE;
    }
}

