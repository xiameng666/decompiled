import android.os.RemoteException;
import com.google.android.gms.auth.cryptauth.KeyInfoResult;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.concurrent.ExecutionException;

public final class ajjr implements Runnable {
    public final ajjs a;
    public final gmcd b;
    public final ajiz c;

    public ajjr(ajjs ajjs0, gmcd gmcd0, ajiz ajiz0) {
        this.a = ajjs0;
        this.b = gmcd0;
        this.c = ajiz0;
    }

    @Override
    public final void run() {
        String s1;
        String s3;
        String s2;
        String s;
        ajjs ajjs0;
        ajiz ajiz0;
        try {
            ajiz0 = this.c;
            ajjs0 = this.a;
            s = null;
            foec foec0 = (foec)gmbu.r(this.b);
            if(foec0 == null) {
                s2 = null;
                s3 = null;
            }
            else {
                s1 = foec0.f;
                s = foec0.c;
                goto label_14;
            }
            goto label_16;
        }
        catch(ExecutionException executionException0) {
            s1 = null;
            ajjs.c.n("Error getting Google Owner for " + ajiz0.f, executionException0, new Object[0]);
        }
    label_14:
        s3 = s;
        s2 = s1;
        try {
        label_16:
            ajjs.c.h("Returning KeyInfo.", new Object[0]);
            KeyInfoResult keyInfoResult0 = new KeyInfoResult(ajjs0.b, ajiz0.a, ajiz0.f, s2, s3);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            ajjs0.a.b(keyInfoResult0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            ajjs.c.n("Client died during GetKeyInfoOperation.", remoteException0, new Object[0]);
        }
    }
}

