import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.JoinSpec;
import com.google.android.gms.appsearch.aidl.GetNextPageAidlRequest;
import com.google.android.gms.appsearch.aidl.SearchAidlRequest;

public final class acii implements azys {
    public final acik a;

    public acii(acik acik0) {
        this.a = acik0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acik acik0 = this.a;
        acij acij0 = new acij(acik0, ((evqp)object1));
        try {
            acjk acjk0 = (acjk)acjz0.H();
            long v = SystemClock.elapsedRealtime();
            UserHandle userHandle0 = Process.myUserHandle();
            int v1 = 0;
            if(acik0.h) {
                acik0.h = false;
                SearchAidlRequest searchAidlRequest0 = new SearchAidlRequest(acik0.b, acik0.c, acik0.d, acik0.e, userHandle0, v);
                Parcel parcel0 = acjk0.jo();
                wbz.f(parcel0, searchAidlRequest0);
                wbz.h(parcel0, acij0);
                acjk0.jp(7, parcel0);
                return;
            }
            JoinSpec joinSpec0 = acik0.e.m;
            if(joinSpec0 != null && (joinSpec0.c != null && !joinSpec0.c.isEmpty())) {
                v1 = 1;
            }
            GetNextPageAidlRequest getNextPageAidlRequest0 = new GetNextPageAidlRequest(acik0.b, acik0.c, acik0.g, v1, userHandle0, v, false);
            Parcel parcel1 = acjk0.jo();
            wbz.f(parcel1, getNextPageAidlRequest0);
            wbz.h(parcel1, acij0);
            acjk0.jp(9, parcel1);
        }
        catch(RemoteException remoteException0) {
            ((evqp)object1).a(remoteException0);
        }
    }
}

