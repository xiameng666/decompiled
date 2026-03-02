import com.google.android.gms.common.Feature;
import com.google.android.gms.pay.GetIntegrityTokenForPixRequest;
import com.google.android.gms.pay.GetIntegrityTokenForPixResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class gapv implements gaqb {
    private final azts a;

    public gapv(azts azts0) {
        this.a = azts0;
    }

    @Override  // gaqb
    public final gaqa a(gamx gamx0, long v, String s) {
        try {
            GetIntegrityTokenForPixRequest getIntegrityTokenForPixRequest0 = new GetIntegrityTokenForPixRequest();
            getIntegrityTokenForPixRequest0.a = s;
            azzc azzc0 = new azzc();
            azzc0.a = new dooz(this.a, getIntegrityTokenForPixRequest0);
            azzc0.c = new Feature[]{dlde.aE};
            azzc0.b = false;
            azzc0.d = 0x1CB0;
            azzd azzd0 = azzc0.a();
            evql evql0 = this.a.jn(azzd0);
            gaxl.a();
            String s1 = ((GetIntegrityTokenForPixResponse)gawm.a(evql0, Long.valueOf(hzji.a.d().b()))).a;
            return s1 != null ? new gapz(s1) : new gapy(17);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            fzxw fzxw0 = (throwable0 instanceof fzxw) ? ((fzxw)throwable0) : null;
            return fzxw0 == null ? new gapy(20) : new gapy(gawh.a(fzxw0.a()));
        }
        catch(TimeoutException unused_ex) {
            return new gapy(19);
        }
        catch(InterruptedException unused_ex) {
            return new gapy(17);
        }
    }
}

