import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class erem implements evpz {
    public final erew a;
    public final erhb b;

    public erem(erew erew0, erhb erhb0) {
        this.a = erew0;
        this.b = erhb0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        List list0 = (List)evql0.j();
        ArrayList arrayList0 = new ArrayList(list0.size());
        Iterator iterator0 = list0.iterator();
        erhb erhb0 = this.b;
        while(true) {
            int v = 0x29A0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            evql evql1 = (evql)object0;
            if(evql1.n()) {
                arrayList0.add(((UserBootstrapInfo)evql1.j()));
            }
            else {
                erew erew0 = this.a;
                if((evql1.i() instanceof aztb)) {
                    v = ((aztb)evql1.i()).b();
                }
                erew0.e.a(v);
                Exception exception0 = evql1.i();
                erew.a.n("GetUserBootstrapInfo failed.", exception0, new Object[0]);
            }
        }
        Status status0 = arrayList0.isEmpty() ? new Status(0x29A0) : Status.b;
        try {
            erhb0.i(status0, ((UserBootstrapInfo[])arrayList0.toArray(new UserBootstrapInfo[0])));
        }
        catch(RemoteException remoteException0) {
            erew.a.l(remoteException0);
        }
    }
}

