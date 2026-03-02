import android.text.TextUtils;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ajlg implements Runnable {
    final EasyUnlockChimeraService a;

    public ajlg(EasyUnlockChimeraService easyUnlockChimeraService0) {
        Objects.requireNonNull(easyUnlockChimeraService0);
        this.a = easyUnlockChimeraService0;
        super();
    }

    private final Set a(ajls ajls0) {
        Set set0 = new bxf();
        alez alez0 = new alez(this.a);
        Set set1 = ajlq.a(this.a);
        if(!set1.isEmpty()) {
            try {
                for(Object object0: ((List)evrg.o(alez0.c(), hpue.b(), TimeUnit.SECONDS))) {
                    SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)object0;
                    String s = syncedCryptauthDevice0.b;
                    if(set1.contains(s) && (hpul.a.b().b() && syncedCryptauthDevice0.l.contains(gqus.e.name()) || syncedCryptauthDevice0.f && Objects.equals(syncedCryptauthDevice0.i, "chrome"))) {
                        ArrayList arrayList0 = new ArrayList();
                        set0.add(new RemoteDevice(3, RemoteDevice.a(syncedCryptauthDevice0.a), syncedCryptauthDevice0.c, s, syncedCryptauthDevice0.a, syncedCryptauthDevice0.d, arrayList0, syncedCryptauthDevice0.i, null));
                    }
                }
                return set0;
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                goto label_15;
            }
        }
        return set0;
    label_15:
        a.ae(EasyUnlockChimeraService.a.j(), "Error getting synced metadata.", exception0);
        if((exception0 instanceof InterruptedException)) {
            ajls0.b(5);
            Thread.currentThread().interrupt();
            return null;
        }
        if((exception0 instanceof TimeoutException)) {
            ajls0.b(6);
            return null;
        }
        ajls0.b(7);
        return null;
    }

    @Override
    public final void run() {
        ajls ajls0 = new ajls();
        if(!hpue.d()) {
            ((ggtj)EasyUnlockChimeraService.a.h()).x("EasyUnlock not enabled, skipping initialization.");
            ajls0.b(1);
            this.a.stopSelf();
            return;
        }
        EasyUnlockChimeraService easyUnlockChimeraService0 = this.a;
        if(easyUnlockChimeraService0.b != null && easyUnlockChimeraService0.b.isEnabled()) {
            ajli ajli0 = EasyUnlockChimeraService.b();
            Set set0 = this.a(ajls0);
            if(set0 == null) {
                easyUnlockChimeraService0.stopSelf();
                return;
            }
            if(set0.isEmpty()) {
                ajls0.b(3);
                easyUnlockChimeraService0.stopSelf();
                return;
            }
            if(ajli0 != null && ajli0.c) {
                synchronized(ajli0.b) {
                    boolean z = ajli0.a.equals(set0);
                }
                if(z) {
                    ((ggtj)EasyUnlockChimeraService.a.h()).H("Nothing to do. %d remote devices have not changed:\n    %s", ((bxf)set0).c, TextUtils.join("\n    ", set0));
                    ajls0.b(4);
                    return;
                }
            }
            ((ggtj)EasyUnlockChimeraService.a.h()).H("Initializing ProximityAuth with %d devices:\n    %s", ((bxf)set0).c, TextUtils.join("\n    ", set0));
            if(ajli0 != null) {
                ajli0.g();
            }
            ajli ajli1 = new ajli(this.a, set0);
            EasyUnlockChimeraService.c(ajli1);
            ajli1.c();
            ajls0.b(0);
            return;
        }
        ajls0.b(2);
        easyUnlockChimeraService0.stopSelf();
    }
}

