import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class acqv extends wby implements acqw, cjug {
    private final grob a;
    private final String b;
    private final String c;
    private final cjts d;

    public acqv() {
        super("com.google.android.gms.audit.internal.IAuditService");
    }

    public acqv(grob grob0, cjts cjts0, String s, String s1) {
        super("com.google.android.gms.audit.internal.IAuditService");
        this.b = s;
        this.c = s1;
        this.a = grob0;
        this.d = cjts0;
    }

    @Override  // acqw
    public final void a(LogAuditRecordsRequest logAuditRecordsRequest0, azxs azxs0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.z);
        azuf0.g(bbdq.aH);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        acrl acrl0 = new acrl(this.a, logAuditRecordsRequest0, azxs0, azug0);
        this.d.b(acrl0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs0;
        if(v == 1) {
            LogAuditRecordsRequest logAuditRecordsRequest0 = (LogAuditRecordsRequest)wbz.a(parcel0, LogAuditRecordsRequest.CREATOR);
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                azxs0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
            }
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            acqv.gr(parcel0);
            this.a(logAuditRecordsRequest0, azxs0, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

