import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.GetByDocumentIdRequest;
import com.google.android.gms.appsearch.aidl.GetDocumentsAidlRequest;

public final class acfn implements azys {
    public final acgm a;
    public final String b;
    public final GetByDocumentIdRequest c;

    public acfn(acgm acgm0, String s, GetByDocumentIdRequest getByDocumentIdRequest0) {
        this.a = acgm0;
        this.b = s;
        this.c = getByDocumentIdRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acgk acgk0 = new acgk(this.a, ((evqp)object1));
        try {
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            GetDocumentsAidlRequest getDocumentsAidlRequest0 = new GetDocumentsAidlRequest(this.a.b, this.a.a, this.b, this.c, userHandle0, v, false);
            Parcel parcel0 = acjk0.jo();
            wbz.f(parcel0, getDocumentsAidlRequest0);
            wbz.h(parcel0, acgk0);
            acjk0.jp(6, parcel0);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            ((evqp)object1).a(remoteException0);
        }
    }
}

