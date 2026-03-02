import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.RemoveByDocumentIdRequest;
import com.google.android.gms.appsearch.aidl.RemoveByDocumentIdAidlRequest;

public final class acfx implements azys {
    public final acgm a;
    public final String b;
    public final RemoveByDocumentIdRequest c;

    public acfx(acgm acgm0, String s, RemoveByDocumentIdRequest removeByDocumentIdRequest0) {
        this.a = acgm0;
        this.b = s;
        this.c = removeByDocumentIdRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acgm acgm0 = this.a;
        acgl acgl0 = new acgl(acgm0, ((evqp)object1));
        try {
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            RemoveByDocumentIdAidlRequest removeByDocumentIdAidlRequest0 = new RemoveByDocumentIdAidlRequest(acgm0.b, this.b, this.c, userHandle0, v);
            Parcel parcel0 = acjk0.jo();
            wbz.f(parcel0, removeByDocumentIdAidlRequest0);
            wbz.h(parcel0, acgl0);
            acjk0.jp(15, parcel0);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            ((evqp)object1).a(remoteException0);
        }
        acgm0.d = true;
    }
}

