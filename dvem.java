import com.google.android.gms.mdocstore.types.ProvisioningId;
import j..util.Objects;

public final class dvem implements dpug {
    public final dvfh a;
    public final ProvisioningId b;
    public final ByteString c;

    public dvem(dvfh dvfh0, ProvisioningId provisioningId0, ByteString hfsf0) {
        this.a = dvfh0;
        this.b = provisioningId0;
        this.c = hfsf0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        String s = ((hjzw)object0).b.toStringUtf8();
        ghjc ghjc0 = ghjc.d;
        boolean z = ghjc0.l(s);
        dvfh dvfh0 = this.a;
        if(z) {
            byte[] arr_b = ghjc0.q(s);
            dvev dvev0 = new dvev(dvfh0, this.b, this.c);
            dvew dvew0 = new dvew(dvfh0);
            evql evql0 = dvfh0.H.q(this.b, arr_b);
            Objects.requireNonNull(dvfh0.H);
            evql evql1 = evql0.g(new dvef(dvfh0.H));
            evql1.b(new dveg(dvev0, evql0));
            evql1.A(dvew0);
            return;
        }
        dvfh0.h("Received challenge is not a valid Base64.", new Exception("Cannot Base64-decode challenge: " + s));
    }
}

