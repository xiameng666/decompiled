import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import java.util.ArrayList;
import java.util.List;

public final class ereq implements evpz {
    public final erew a;
    public final erhb b;

    public ereq(erew erew0, erhb erhb0) {
        this.a = erew0;
        this.b = erhb0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        Status status0 = Status.b;
        List list0 = (List)evql0.j();
        ArrayList arrayList0 = new ArrayList();
        erhb erhb0 = this.b;
        for(Object object0: list0) {
            evql evql1 = (evql)object0;
            if(evql1.n()) {
                arrayList0.add(((Assertion)evql1.j()));
            }
        }
        if(arrayList0.isEmpty()) {
            erew.a.f("No assertion infos returned!", new Object[0]);
            status0 = new Status(10650);
            this.a.e.a(status0.i);
        }
        Assertion[] arr_assertion = (Assertion[])arrayList0.toArray(new Assertion[0]);
        try {
            erhb0.a(status0, arr_assertion);
        }
        catch(RemoteException remoteException0) {
            erew.a.l(remoteException0);
        }
    }
}

