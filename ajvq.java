import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

public final class ajvq extends cjtm {
    private final ajst a;
    private final akbo b;

    public ajvq(ajst ajst0, String s, azug azug0) {
        super(0xAC, "CanSilentlyAddGaiaPassword", azug0);
        this.a = ajst0;
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s, "com.google");
        akbm0.b = akbn.s;
        this.b = akbm0.a();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            grdg grdg0 = new akbl(this.b).e().b;
            if(grdg0 == null) {
                grdg0 = grdg.a;
            }
            boolean z = true;
            int v = grdg0.b & 1;
            ajst ajst0 = this.a;
            Status status0 = Status.b;
            ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
            if(1 != v) {
                z = false;
            }
            ajst0.a(status0, z, apiMetadata0);
        }
        catch(akbi akbi0) {
            Locale locale0 = Locale.US;
            int v1 = akbi0.a;
            if(v1 == 0) {
                throw null;
            }
            this.j(new Status(13, String.format(locale0, "CanSilentlyAddGaiaPasswordOperation failed with FolsomSyncException result code: %d", ((int)(v1 - 1)))));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.a.a(status0, false, apiMetadata0);
    }
}

