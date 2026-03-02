import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.DocumentsParcel;
import com.google.android.gms.appsearch.aidl.PutDocumentsAidlRequest;
import j..util.DesugarCollections;

public final class acfw implements azys {
    public final acgm a;
    public final acib b;
    public final String c;

    public acfw(acgm acgm0, acib acib0, String s) {
        this.a = acgm0;
        this.b = acib0;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acgm acgm0 = this.a;
        acgj acgj0 = new acgj(acgm0, ((evqp)object1));
        try {
            DocumentsParcel documentsParcel0 = new DocumentsParcel(acgm.k(DesugarCollections.unmodifiableList(this.b.a)), acgm.k(DesugarCollections.unmodifiableList(this.b.b)));
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            PutDocumentsAidlRequest putDocumentsAidlRequest0 = new PutDocumentsAidlRequest(acgm0.b, this.c, documentsParcel0, userHandle0, v);
            Parcel parcel0 = acjk0.jo();
            wbz.f(parcel0, putDocumentsAidlRequest0);
            wbz.h(parcel0, acgj0);
            acjk0.jp(5, parcel0);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            ((evqp)object1).a(remoteException0);
        }
        acgm0.d = true;
    }
}

