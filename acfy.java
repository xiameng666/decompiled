import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.PersistToDiskAidlRequest;

public final class acfy implements azys {
    public final acgm a;

    public acfy(acgm acgm0) {
        this.a = acgm0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        evqp evqp0 = (evqp)object1;
        try {
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            PersistToDiskAidlRequest persistToDiskAidlRequest0 = new PersistToDiskAidlRequest(this.a.b, userHandle0, v);
            Parcel parcel0 = acjk0.jo();
            wbz.f(parcel0, persistToDiskAidlRequest0);
            acjk0.jp(18, parcel0);
            evqp0.b(null);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            evqp0.a(remoteException0);
        }
    }
}

