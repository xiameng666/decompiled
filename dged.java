import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.List;

final class dged {
    public final dgfh a;
    public boolean b;
    public ibtw c;
    public TransferMetadata d;
    public dggc e;
    public int f;
    private final int g;

    public dged(int v, dgfh dgfh0, boolean z, ibtw ibtw0, TransferMetadata transferMetadata0, dggc dggc0, int v1) {
        this.g = v;
        this.a = dgfh0;
        this.b = z;
        this.c = ibtw0;
        this.d = transferMetadata0;
        this.e = dggc0;
        this.f = v1;
    }

    public final ShareTarget a(long v) {
        dcls dcls0 = this.a.a(v, false, this.g);
        if(this.a.a == 4) {
            List list0 = ibpo.b(Integer.valueOf(2));
            ibuq.f(list0, "value");
            dcls0.y = list0;
        }
        ShareTarget shareTarget0 = dcls0.a();
        dggc dggc0 = this.e;
        if(dggc0 != null) {
            for(Object object0: dggc0.c) {
                shareTarget0.l(((FileAttachment)object0));
            }
            for(Object object1: dggc0.d) {
                shareTarget0.n(((TextAttachment)object1));
            }
            for(Object object2: dggc0.e) {
                shareTarget0.o(((WifiCredentialsAttachment)object2));
            }
            for(Object object3: dggc0.f) {
                shareTarget0.k(((AppAttachment)object3));
            }
        }
        return shareTarget0;
    }

    public static dged b(dged dged0, dgfh dgfh0) {
        return new dged(dged0.g, dgfh0, dged0.b, dged0.c, dged0.d, dged0.e, dged0.f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dged)) {
            return false;
        }
        if(this.g != ((dged)object0).g) {
            return false;
        }
        if(!ibuq.m(this.a, ((dged)object0).a)) {
            return false;
        }
        if(this.b != ((dged)object0).b) {
            return false;
        }
        if(!ibuq.m(this.c, ((dged)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dged)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((dged)object0).e) ? this.f == ((dged)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = this.g * 0x1F + this.a.hashCode();
        int v1 = this.b ? 0x4CF : 0x4D5;
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        dggc dggc0 = this.e;
        if(dggc0 != null) {
            v2 = dggc0.hashCode();
        }
        return ((((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2) * 0x1F + this.f;
    }

    @Override
    public final String toString() {
        return "ShareTargetInfo(useCase=" + this.g + ", metadata=" + this.a + ", isInitialState=" + this.b + ", onTransferUpdate=" + this.c + ", transferMetadata=" + this.d + ", shareContent=" + this.e + ", connectionMedium=" + this.f + ")";
    }
}

