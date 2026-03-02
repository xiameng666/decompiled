import android.content.Context;
import java.io.PrintWriter;

public final class fxfl extends cnmf {
    @Override  // cnmf
    public final void a(Context context0) {
        new bblp(1, 9).d(new fxgb());
    }

    @Override  // cnmf
    public final void b() {
    }

    @Override  // cnmf
    public final void d(PrintWriter printWriter0) {
        if(fxgr.b != null && huwd.u()) {
            fxgr fxgr0 = fxgr.b;
            printWriter0.println("####EQMon Start");
            fxpk fxpk0 = fxgr0.h;
            if(fxpk0 != null) {
                fxpk0.b(printWriter0);
            }
            printWriter0.println("####EQMon End");
        }
    }
}

