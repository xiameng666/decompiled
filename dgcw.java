import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.NoSuchElementException;

public final class dgcw implements ibts {
    public final dgdi a;
    public final long b;
    public final dbzg c;
    public final long d;

    public dgcw(dgdi dgdi0, long v, dbzg dbzg0, long v1) {
        this.a = dgdi0;
        this.b = v;
        this.c = dbzg0;
        this.d = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((AppInstallMetadata)object0), "result");
        dgdi dgdi0 = this.a;
        for(Object object1: ((dgdf)dgdi0.c).a.j) {
            Attachment attachment0 = (Attachment)object1;
            if(attachment0.b() == this.d) {
                dgym.a().a(new dgyd(this.b, ((AppInstallMetadata)object0).a, attachment0 instanceof AppAttachment));
                ShareTarget shareTarget0 = dgdi0.a();
                this.c.a(shareTarget0, ((AppInstallMetadata)object0));
                return ibom.a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

