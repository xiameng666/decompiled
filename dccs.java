import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import j..util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dccs implements dizh {
    final AtomicBoolean a;
    final ShareTarget b;
    final gmcu c;
    final dikc d;
    final NearbySharingChimeraService e;

    public dccs(NearbySharingChimeraService nearbySharingChimeraService0, AtomicBoolean atomicBoolean0, ShareTarget shareTarget0, gmcu gmcu0, dikc dikc0) {
        this.a = atomicBoolean0;
        this.b = shareTarget0;
        this.c = gmcu0;
        this.d = dikc0;
        Objects.requireNonNull(nearbySharingChimeraService0);
        this.e = nearbySharingChimeraService0;
        super();
    }

    @Override  // dizh
    public final void a() {
        dcvz.a.b().p("Failed to download attachments", new Object[0]);
        this.c.r(new IllegalStateException("Failed to download attachments from " + this.d.b));
    }

    @Override  // dizh
    public final void b(List list0) {
        cunf cunf0 = dcvz.a;
        cunf0.b().p("Download finished.", new Object[0]);
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            ShareTarget shareTarget0 = this.b;
            Object object0 = iterator0.next();
            Attachment attachment0 = (Attachment)object0;
            if(attachment0.l()) {
                shareTarget0.n(((TextAttachment)attachment0));
                cunf0.d().i("Attached attachment %s to ShareTarget %s", attachment0, shareTarget0);
                continue;
            }
            else if(attachment0.j()) {
                shareTarget0.l(((FileAttachment)attachment0));
                cunf0.d().i("Attached attachment %s to ShareTarget %s", attachment0, shareTarget0);
                continue;
            }
            else if(attachment0.m()) {
                shareTarget0.o(((WifiCredentialsAttachment)attachment0));
                cunf0.d().i("Attached attachment %s to ShareTarget %s", attachment0, shareTarget0);
                continue;
            }
            else if(attachment0.i()) {
                shareTarget0.k(((AppAttachment)attachment0));
                cunf0.d().i("Attached attachment %s to ShareTarget %s", attachment0, shareTarget0);
                continue;
            }
            else if(hvqz.L() && attachment0.k()) {
                shareTarget0.m(((StreamAttachment)attachment0));
                cunf0.d().i("Attached attachment %s to ShareTarget %s", attachment0, shareTarget0);
                continue;
            }
            else {
                cunf0.e().i("Unable to add unknown attachment %s to ShareTarget %s", attachment0, shareTarget0);
            }
            break;
        }
        this.c.q(Integer.valueOf(0));
    }

    @Override  // dizh
    public final void c() {
        dcvz.a.b().p("Download in progress.", new Object[0]);
        this.a.set(true);
        dcnn dcnn0 = new dcnn(0x3F4);
        dcnn0.h = 1 ^ hvrc.m();
        TransferMetadata transferMetadata0 = dcnn0.a();
        this.e.ae(this.b, transferMetadata0);
    }

    @Override  // dizh
    public final void d() {
        dcvz.a.b().p("Files not ready yet, started to download attachment", new Object[0]);
    }
}

