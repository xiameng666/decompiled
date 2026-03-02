import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import j..util.Objects;

final class eret implements Runnable {
    final hkwk a;
    final erhb b;
    final erew c;

    public eret(erew erew0, hkwk hkwk0, erhb erhb0) {
        this.a = hkwk0;
        this.b = erhb0;
        Objects.requireNonNull(erew0);
        this.c = erew0;
        super();
    }

    @Override
    public final void run() {
        Throwable throwable2;
        Status status1;
        hkwl hkwl0;
        erew erew0;
        Status status0 = new Status(13);
        Challenge[] arr_challenge = null;
        try {
            erew0 = this.c;
            epxw epxw0 = erew0.d;
            hkwk hkwk0 = this.a;
            if(hyjq.c()) {
                epyf.b.d("New Gms Core network library", new Object[0]);
                clcf clcf0 = clcg.c("https://android.clients.google.com/auth/get_bootstrap_challenges", ckvq.b);
                hkwl0 = (hkwl)new epxx(((epyf)epxw0), ((epyf)epxw0).d, ((epyf)epxw0).e, ((epyf)epxw0).f, clcf0, hkwk0).c();
            }
            else {
                hkwl0 = (hkwl)new epxy(((epyf)epxw0), ((epyf)epxw0).d, ((epyf)epxw0).e, ((epyf)epxw0).f, hkwk0).c();
            }
            if(hkwl0 == null || ((hkwl0.b & 2) != 0 || (hkwl0.b & 1) == 0)) {
                status1 = new Status(10652);
                goto label_36;
            }
            else if((hkwl0.c == null ? gpoz.a : hkwl0.c).b.size() == 0) {
                status1 = new Status(10654);
                goto label_36;
            }
            else {
                Status status2 = new Status(0);
                try {
                    gpoz gpoz0 = hkwl0.c == null ? gpoz.a : hkwl0.c;
                    Challenge[] arr_challenge1 = new Challenge[gpoz0.b.size()];
                    for(int v = 0; v < gpoz0.b.size(); ++v) {
                        gpoh gpoh0 = (gpoh)gpoz0.b.get(v);
                        arr_challenge1[v] = new Challenge(gpoh0.b, gpoh0.c, gpoh0.d, gpoh0.e.toByteArray(), gpoh0.f.toByteArray());
                    }
                    arr_challenge = arr_challenge1;
                    status1 = status2;
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    status1 = status2;
                    goto label_40;
                }
            }
            goto label_45;
        }
        catch(Throwable throwable0) {
            status1 = status0;
            goto label_39;
        }
        try {
        label_36:
            erew0.e.a(status1.i);
            goto label_45;
        }
        catch(Throwable throwable0) {
        }
    label_39:
        throwable2 = throwable0;
        try {
        label_40:
            this.b.h(status1, null);
        }
        catch(RemoteException remoteException0) {
            erew.a.g("Error executing callback", remoteException0, new Object[0]);
        }
        throw throwable2;
        try {
        label_45:
            this.b.h(status1, arr_challenge);
        }
        catch(RemoteException remoteException1) {
            erew.a.g("Error executing callback", remoteException1, new Object[0]);
        }
    }
}

