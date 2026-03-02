import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.common.BaseBluetoothStateChangeReceiver;
import com.google.android.gms.auth.proximity.exo.ExoChimeraService.BluetoothStateChangeReceiver;
import com.google.android.gms.auth.proximity.exo.ExoChimeraService;
import com.google.android.gms.auth.proximity.exo.RetryInitializationGmsTaskBoundService;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class albn implements Runnable {
    final ExoChimeraService a;

    public albn(ExoChimeraService exoChimeraService0) {
        Objects.requireNonNull(exoChimeraService0);
        this.a = exoChimeraService0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0;
        ExoChimeraService exoChimeraService0 = this.a;
        synchronized(exoChimeraService0.c) {
            aliu aliu0 = new aliu();
            Context context0 = AppContextProvider.a();
            if(hpzc.c() && !ExoChimeraService.f(context0, gqus.j)) {
                ExoChimeraService.a.h("Phone Hub is not enabled on any accounts, stopping service", new Object[0]);
                aliu0.V(3);
                exoChimeraService0.stopSelf();
                return;
            }
            if(!hpzc.c() && !ExoChimeraService.f(context0, gqus.n)) {
                ExoChimeraService.a.h("EXO_HOST is not enabled on any accounts, stopping service", new Object[0]);
                aliu0.V(3);
                exoChimeraService0.stopSelf();
                return;
            }
            List list0 = alft.b(context0, true, null);
            if(list0 == null) {
                new aliu().V(5);
                if(hpzc.a.b().e()) {
                    cljp cljp0 = cljp.a(context0);
                    clkn clkn0 = new clkn();
                    clkn0.w(RetryInitializationGmsTaskBoundService.class.getName());
                    clkn0.t("ExoInitialization");
                    clkn0.e(300L, 360L);
                    clkn0.v(0);
                    clkn0.x(0, 0);
                    clkn0.g(2);
                    cljp0.f(clkn0.a());
                }
                arrayList0 = new ArrayList();
            }
            else {
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: list0) {
                    SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)object1;
                    if(syncedCryptauthDevice0.l.contains(gqus.o.name())) {
                        arrayList1.add(syncedCryptauthDevice0);
                    }
                }
                arrayList0 = arrayList1;
            }
            if(arrayList0.isEmpty()) {
                ExoChimeraService.a.h("No valid clients, stopping service", new Object[0]);
                aliu0.V(4);
                exoChimeraService0.stopSelf();
                return;
            }
            synchronized(ExoChimeraService.class) {
                if(ExoChimeraService.b == null) {
                    ExoChimeraService.b = new ExoChimeraService.BluetoothStateChangeReceiver();
                    jwe.b(context0, ExoChimeraService.b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
                }
            }
            if(!BaseBluetoothStateChangeReceiver.c(context0)) {
                ExoChimeraService.a.h("Bluetooth not enabled, waiting for bluetooth", new Object[0]);
                aliu0.V(2);
                return;
            }
            ExoChimeraService exoChimeraService1 = this.a;
            exoChimeraService1.d.b(exoChimeraService1, arrayList0);
            akzn akzn0 = akzn.c();
            for(Object object2: arrayList0) {
                String s = RemoteDevice.a(((SyncedCryptauthDevice)object2).a);
                if(akzn0.i(s, 5)) {
                    alat alat0 = exoChimeraService1.e;
                    if(alat0.a(s) == null) {
                        ExoChimeraService.a.h("Adding connection for existing authenticated device %s", new Object[]{akwe.a(s)});
                        aliu0.p();
                        alat0.b(s);
                    }
                }
            }
            exoChimeraService1.b();
            ExoChimeraService.a.h("Finished initialization", new Object[0]);
            aliu0.V(0);
        }
    }
}

