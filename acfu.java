import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.InitializeAidlRequest;

public final class acfu implements azys {
    public final acgm a;

    public acfu(acgm acgm0) {
        this.a = acgm0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acgh acgh0 = new acgh(this.a, ((evqp)object1));
        try {
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            InitializeAidlRequest initializeAidlRequest0 = new InitializeAidlRequest(this.a.b, userHandle0, v);
            Parcel parcel0 = acjk0.jo();
            wbz.f(parcel0, initializeAidlRequest0);
            wbz.h(parcel0, acgh0);
            acjk0.jp(1, parcel0);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            ((evqp)object1).a(remoteException0);
        }
    }
}

