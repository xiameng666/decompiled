import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Objects;
import java.io.File;
import java.util.List;

final class dfyk implements dcqp {
    final dbzg a;
    final ShareTarget b;
    final Attachment c;
    final List d;
    final dfzz e;

    public dfyk(dfzz dfzz0, dbzg dbzg0, ShareTarget shareTarget0, Attachment attachment0, List list0) {
        this.a = dbzg0;
        this.b = shareTarget0;
        this.c = attachment0;
        this.d = list0;
        Objects.requireNonNull(dfzz0);
        this.e = dfzz0;
        super();
    }

    @Override  // dcqp
    public final void a(AppInstallMetadata appInstallMetadata0) {
        this.a.a(this.b, appInstallMetadata0);
        if(appInstallMetadata0.b) {
            Attachment attachment0 = this.c;
            if(attachment0.h()) {
                for(Object object0: this.d) {
                    String s = (String)object0;
                    (hrnt.i() ? new File(ccsb.a.a(s)) : new File(s)).delete();
                }
            }
            dfzz dfzz0 = this.e;
            int v = 3;
            int v1 = appInstallMetadata0.a == 2 ? 3 : 2;
            if(!attachment0.i()) {
                v = 2;
            }
            dcou dcou0 = dcpt.C(v1, v);
            dfzz0.w.i(dcou0);
        }
    }
}

