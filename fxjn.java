import android.content.Context;
import com.google.android.location.quake.ealert.GcmReceiverChimeraService;
import java.io.PrintWriter;

public final class fxjn extends cnmf {
    @Override  // cnmf
    public final void a(Context context0) {
        if(huqb.E()) {
            new bblp(1, 9).d(new fxjo());
            return;
        }
        new bblp(1, 9).d(new fxka());
    }

    @Override  // cnmf
    public final void b() {
    }

    @Override  // cnmf
    public final void d(PrintWriter printWriter0) {
        if(huqb.E()) {
            if(fxjt.c != null && huqb.G()) {
                fxjt fxjt0 = fxjt.c;
                printWriter0.println("####EAlert Start");
                printWriter0.println("init= @n/a");
                GcmReceiverChimeraService.b(printWriter0);
                fxpk fxpk0 = fxjt0.f;
                if(fxpk0 != null) {
                    fxpk0.b(printWriter0);
                }
                printWriter0.println("####EAlert End");
            }
        }
        else if(fxkh.c != null && huqb.G()) {
            fxkh fxkh0 = fxkh.c;
            printWriter0.println("####EAlert Start");
            printWriter0.println("init= @n/a");
            GcmReceiverChimeraService.b(printWriter0);
            fxpk fxpk1 = fxkh0.f;
            if(fxpk1 != null) {
                fxpk1.b(printWriter0);
            }
            printWriter0.println("####EAlert End");
        }
    }
}

