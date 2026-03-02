import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;

public final class egmk extends eglh {
    private final eggv a;
    private final Uri b;
    private final boolean c;

    public egmk(String s, int v, eggv eggv0, Uri uri0, azug azug0) {
        super(s, v, null, "GetGalProviderType", azug0, null);
        this.a = eggv0;
        this.b = uri0;
        this.c = hxen.c();
    }

    private final void b(egof egof0, String s, int v, int v1) {
        eggv eggv0 = this.a;
        if(eggv0 != null) {
            try {
                try {
                    ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                    eggv0.f(egof0.h, s, apiMetadata0);
                    goto label_18;
                }
                catch(RemoteException remoteException0) {
                }
                egig.c("GetTypeOperation", "Operation failed remotely: ", remoteException0);
                if(this.c) {
                    goto label_8;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_13;
            }
        label_8:
            efpo efpo0 = this.q;
            if(efpo0 != null) {
                efpo0.d(10, 0);
                return;
            label_13:
                if(this.c) {
                    efpo efpo1 = this.q;
                    if(efpo1 != null) {
                        efpo1.d(v, v1);
                    }
                }
                throw throwable0;
            label_18:
                if(this.c) {
                    efpo efpo2 = this.q;
                    if(efpo2 != null) {
                        efpo2.d(v, v1);
                    }
                }
            }
        }
    }

    @Override  // eglh
    public final void d(Context context0, azug azug0) {
        if(this.c) {
            efpo efpo0 = this.q;
            if(efpo0 != null && this.n) {
                efpo0.d(8, 0);
                return;
            }
        }
        if(!"com.google.android.syncadapters.contacts".equals(this.g)) {
            egig.k("GetTypeOperation", "Not allowed to the caller.");
            this.b(egof.f, null, 11, 0);
            return;
        }
        String s = context0.getContentResolver().getType(this.b);
        this.b(egof.a, s, 2, 1);
    }
}

