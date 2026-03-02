import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.List;

public final class crkv implements Runnable {
    public final AppMetadata a;
    public final Bundle b;
    public final cril c;
    public final String d;
    public final crih e;

    public crkv(crih crih0, AppMetadata appMetadata0, Bundle bundle0, cril cril0, String s) {
        this.e = crih0;
        this.a = appMetadata0;
        this.b = bundle0;
        this.c = cril0;
        this.d = s;
    }

    @Override
    public final void run() {
        crih crih0 = this.e;
        crih0.a.F();
        List list0 = crih0.a.D(this.a, this.b);
        try {
            this.c.a(list0);
        }
        catch(RemoteException remoteException0) {
            crih0.a.aJ().c.c("Failed to return trigger URIs for app", this.d, remoteException0);
        }
    }
}

