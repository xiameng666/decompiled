import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

public final class ekgs extends cjtm {
    private static final bboh a;
    private final ekfh b;
    private final String c;
    private final String d;

    static {
        ekgs.a = bboh.b("CBR_FetchDevBackupOp", bbcu.bN);
    }

    public ekgs(ekfh ekfh0, String s, String s1, azug azug0) {
        super(0x87, "FetchDeviceBackups", azug0);
        this.b = ekfh0;
        this.c = s;
        this.d = s1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        List list0;
        new ArrayList();
        try {
            try {
                list0 = ekgr.b(context0, this.c, this.d, false);
                goto label_21;
            }
            catch(acse acse0) {
            }
            catch(iapl iapl0) {
                goto label_9;
            }
            catch(RuntimeException runtimeException0) {
                goto label_14;
            }
            ((ggtj)((ggtj)((ggtj)ekgs.a.i()).s(acse0)).ar(13590)).x("Auth Exception when fetching contacts from server");
            ejze.a().d("fetch_backups_error:authentication_failure");
        }
        catch(Throwable throwable0) {
            this.j(Status.d);
            throw throwable0;
        }
        this.j(Status.d);
        return;
        try {
        label_9:
            ((ggtj)((ggtj)((ggtj)ekgs.a.i()).s(iapl0)).ar(0x3517)).x("Status Exception when fetching contacts from server");
            ejze.a().d(a.ab(iapl0.a.t, "fetch_backups_error:status_error:"));
        }
        catch(Throwable throwable0) {
            this.j(Status.d);
            throw throwable0;
        }
        this.j(Status.d);
        return;
        try {
        label_14:
            ((ggtj)((ggtj)((ggtj)ekgs.a.i()).s(runtimeException0)).ar(0x3518)).x("Failed to fetch contacts backup due to runtime exception.");
            ejze.a().d("fetch_backups_error:runtime_error:" + runtimeException0.getMessage());
        }
        catch(Throwable throwable0) {
            this.j(Status.d);
            throw throwable0;
        }
        this.j(Status.d);
        return;
    label_21:
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
        this.b.e(Status.b, list0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.e(status0, null, ApiMetadata.b);
    }
}

