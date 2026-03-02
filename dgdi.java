import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;

final class dgdi {
    public final long a;
    public final dgfh b;
    public final dgdh c;
    public boolean d;
    public int e;
    public TransferMetadata f;

    public dgdi(long v, dgfh dgfh0, dgdh dgdh0) {
        ibuq.f(dgfh0, "metadata");
        super();
        this.a = v;
        this.b = dgfh0;
        this.c = dgdh0;
        this.d = true;
        this.e = 0;
        this.f = new dcnn(1000).a();
    }

    public final ShareTarget a() {
        dgdh dgdh0 = this.c;
        int v = dgdh0.a();
        ShareTarget shareTarget0 = this.b.a(this.a, true, v).a();
        if(dgdh0.b() != null) {
            String s = dgdh0.b();
            shareTarget0.e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", s);
        }
        for(Object object0: dgdh0.d()) {
            shareTarget0.l(((FileAttachment)object0));
        }
        for(Object object1: dgdh0.e()) {
            shareTarget0.n(((TextAttachment)object1));
        }
        for(Object object2: dgdh0.f()) {
            shareTarget0.o(((WifiCredentialsAttachment)object2));
        }
        for(Object object3: dgdh0.c()) {
            shareTarget0.k(((AppAttachment)object3));
        }
        return shareTarget0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgdi)) {
            return false;
        }
        if(this.a != ((dgdi)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((dgdi)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dgdi)object0).c)) {
            return false;
        }
        return this.d == ((dgdi)object0).d ? this.e == ((dgdi)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        return this.d ? (v * 0x1F + 0x4CF) * 0x1F + this.e : (v * 0x1F + 0x4D5) * 0x1F + this.e;
    }

    @Override
    public final String toString() {
        return "ShareTargetInfo(id=" + this.a + ", metadata=" + this.b + ", shareData=" + this.c + ", isInitialStatus=" + this.d + ", connectionMedium=" + this.e + ")";
    }
}

