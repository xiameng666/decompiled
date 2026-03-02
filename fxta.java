import android.accounts.Account;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import java.io.IOException;

public final class fxta extends bbkj {
    public fxta(Context context0) {
        super(context0, false, "location");
    }

    @Override  // bbkj
    protected final int a() {
        return 8705;
    }

    @Override  // bbkj
    protected final void b(Account account0, Bundle bundle0, String s, SyncResult syncResult0) {
        Context context0 = this.getContext();
        if(bundle0 != null && bundle0.getBoolean("initialize", false)) {
            ReportingSyncChimeraService.a(account0, context0);
            return;
        }
        fxtb fxtb0 = fxtb.b(context0);
        try {
            fxtb0.d(account0, null, null, null, false, null);
        }
        catch(acse acse0) {
            fxqw.k("", acse0);
            ++syncResult0.stats.numAuthExceptions;
            fxra.g("UlrSyncException");
        }
        catch(IOException iOException0) {
            fxqw.k("", iOException0);
            ++syncResult0.stats.numIoExceptions;
            fxra.g("UlrSyncException");
        }
        catch(iapl iapl0) {
            fxqw.k("", iapl0);
            if(iapl0.a.t == iaph.q) {
                ++syncResult0.stats.numAuthExceptions;
            }
            else {
                ++syncResult0.stats.numIoExceptions;
            }
            fxra.g("UlrSyncException");
        }
        finally {
            if(fxrc.u(account0, context0)) {
                fxrc.p(account0, context0);
            }
        }
    }
}

