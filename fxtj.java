import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.location.WifiScan;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import j..util.Objects;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class fxtj extends fxtg {
    public final fxsh b;
    private final fxtb f;
    private FutureTask g;
    private final fvrv h;
    private final bbll i;

    public fxtj(fxtk fxtk0) {
        Objects.requireNonNull(fxtk0);
        super(fxtk0, new bblg(10), "UlrDispSvcSlow");
        fxso fxso0 = fxso.b(fxtk0.a);
        this.b = new fxsh(fxtk0.a, fxtk0.b, fxtk0.c, fxso0, fxtk0.j, fxtk0.d, new Random(System.currentTimeMillis()), bbnk.a);
        this.f = fxtb.b(fxtk0.a);
        this.h = fvru.a(fxtk0.a);
        this.i = new bbll(1, 10);
    }

    @Override  // fxtg
    protected final void b(Intent intent0) {
        String s = intent0.getAction();
        if("com.google.android.location.reporting.UPLOAD".equals(s)) {
            if(this.g != null && !this.g.isDone()) {
                fxqw.c("GCoreUlr", "Previous upload task still in progress");
                return;
            }
            long v = hzek.a.i().P();
            FutureTask futureTask0 = new FutureTask(new fxti(this), null);
            this.g = futureTask0;
            this.i.execute(futureTask0);
            try {
                this.g.get(v, TimeUnit.MILLISECONDS);
            }
            catch(CancellationException | InterruptedException exception0) {
                fxqw.g("Upload task interrupted or cancelled", exception0);
                fxra.g("UlrUploadTaskCancelled");
            }
            catch(TimeoutException timeoutException0) {
                fxqw.g(a.D(v, "Upload task timed out after ", "ms "), timeoutException0);
                fxra.g("UlrUploadTaskTimeout");
            }
            catch(ExecutionException executionException0) {
                fxqw.e(7, "Upload task exception", executionException0);
            }
            return;
        }
        if("com.google.android.location.reporting.ACTION_INSISTENT_SYNC".equals(s)) {
            Account account0 = fxtp.a(intent0);
            if(account0 != null) {
                Account account1 = new Account(account0.name.toLowerCase(Locale.US), account0.type);
                intent0.putExtra("account", account1);
                account0 = account1;
            }
            if(account0 != null && this.h.d(account0)) {
                fxtb fxtb0 = this.f;
                intent0.getStringExtra("label");
                Account account2 = (Account)intent0.getParcelableExtra("account");
                Boolean boolean0 = fxtb.c(intent0, "reportingEnabled");
                Boolean boolean1 = fxtb.c(intent0, "historyEnabled");
                Boolean boolean2 = fxtb.c(intent0, "adsSubconsentEnabled");
                Boolean boolean3 = fxtb.c(intent0, "ulrRelatedSettingChange");
                String s1 = intent0.getStringExtra("auditToken");
                try {
                    fxtb0.d(account2, boolean0, boolean1, boolean2, boolean3.booleanValue(), s1);
                }
                catch(IOException | acse | iapl exception1) {
                    fxqw.k("Insistent sync failed, requesting regular sync with retry", exception1);
                    ReportingSyncChimeraService.b(account2, fxtb0.a);
                    fxra.g("UlrSyncException");
                }
                return;
            }
            fxqw.d(42, "Received sync request for invalid account: " + cnug.a(account0));
            return;
        }
        fxqw.m(19, "Unsupported Slow action in " + intent0);
    }

    @Override  // fxtg
    protected final void d(WifiScan wifiScan0) {
        fxqw.h(new UnsupportedOperationException("DispatchingService.Slow unexpectedly received wifi scan"));
    }

    @Override  // fxtg
    public final void e() {
        if(this.g != null && !this.g.isDone()) {
            this.g.cancel(true);
        }
        super.e();
    }
}

