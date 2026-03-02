import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class aife implements gmbg {
    final aiff a;

    public aife(aiff aiff0) {
        Objects.requireNonNull(aiff0);
        this.a = aiff0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        try {
            Status status0 = aifo.b(aifo.a(throwable0));
            this.a.j(status0);
            this.a.b(status0.i);
        }
        catch(RemoteException remoteException0) {
            aiff.a.n("RemoteException when calling back onSilentSignedInToGoogle", remoteException0, new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        gfsx gfsx0 = (gfsx)object0;
        try {
            GoogleSignInAccount googleSignInAccount0 = (GoogleSignInAccount)gfsx0.g();
            this.a.b.d(googleSignInAccount0, Status.b);
            this.a.b(0);
        }
        catch(RemoteException remoteException0) {
            aiff.a.n("RemoteException when calling back onSilentSignedInToGoogle().", remoteException0, new Object[0]);
        }
    }
}

