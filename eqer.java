import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import j..util.Objects;

final class eqer implements Runnable {
    final eqes a;

    public eqer(eqes eqes0) {
        Objects.requireNonNull(eqes0);
        this.a = eqes0;
        super();
    }

    @Override
    public final void run() {
        this.a.a.a.E(2);
        eqeh eqeh0 = this.a.a.b;
        eqiw eqiw0 = this.a.b;
        if(eqeh0.i) {
            eqea eqea0 = eqeh0.g;
            if(eqea0 != null) {
                String s = ((eqed)eqea0).l;
                if(TextUtils.isEmpty(s)) {
                    eqeh.g(eqiw0, new Status(13));
                    return;
                }
                Uri uri0 = Uri.parse(hygr.a.b().b());
                eqoe eqoe0 = bbnp.o(eqeh0.c.getResources()) ? eqoe.g : eqoe.f;
                String s1 = uri0.buildUpon().appendPath(eqoe0.k + s).toString();
                String s2 = eqeh0.j == null ? "" : eqeh0.j;
                eqea eqea1 = eqeh0.g;
                batl.s(eqea1);
                AdvertisingInfo advertisingInfo0 = new AdvertisingInfo(s1, s2, bbmu.a(((eqed)eqea1).n), s);
                try {
                    eqiw0.d(Status.b, advertisingInfo0);
                }
                catch(RemoteException remoteException0) {
                    eqeh.a.l(remoteException0);
                }
                return;
            }
        }
        eqeh.g(eqiw0, new Status(10552));
    }
}

