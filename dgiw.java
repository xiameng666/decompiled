import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.Attachment;
import java.io.File;
import java.util.List;

public final class dgiw implements dcqp {
    final ibts a;
    final Attachment b;
    final List c;

    public dgiw(ibts ibts0, Attachment attachment0, List list0) {
        this.a = ibts0;
        this.b = attachment0;
        this.c = list0;
        super();
    }

    @Override  // dcqp
    public final void a(AppInstallMetadata appInstallMetadata0) {
        this.a.a(appInstallMetadata0);
        if(appInstallMetadata0.b && this.b.h()) {
            for(Object object0: this.c) {
                String s = (String)object0;
                if(hrnt.k()) {
                    s = ccsb.a.a(s);
                }
                new File(s).delete();
            }
        }
    }
}

