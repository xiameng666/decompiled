import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.appsearch.aidl.RemoveByQueryAidlRequest;

public final class acfz implements azys {
    public final acgm a;
    public final String b;
    public final String c;
    public final SearchSpec d;

    public acfz(acgm acgm0, String s, SearchSpec searchSpec0) {
        this.a = acgm0;
        this.b = s;
        this.c = "";
        this.d = searchSpec0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acgm acgm0 = this.a;
        acga acga0 = new acga(acgm0, ((evqp)object1));
        try {
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            RemoveByQueryAidlRequest removeByQueryAidlRequest0 = new RemoveByQueryAidlRequest(acgm0.b, this.b, this.c, this.d, userHandle0, v);
            Parcel parcel0 = acjk0.jo();
            wbz.f(parcel0, removeByQueryAidlRequest0);
            wbz.h(parcel0, acga0);
            acjk0.jp(16, parcel0);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            ((evqp)object1).a(remoteException0);
        }
        acgm0.d = true;
    }
}

