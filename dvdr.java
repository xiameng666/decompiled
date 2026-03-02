import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class dvdr implements Runnable {
    public final dvfh a;
    public final ProvisioningId b;
    public final ByteString c;

    public dvdr(dvfh dvfh0, ProvisioningId provisioningId0, ByteString hfsf0) {
        this.a = dvfh0;
        this.b = provisioningId0;
        this.c = hfsf0;
    }

    @Override
    public final void run() {
        dvem dvem0 = new dvem(this.a, this.b, this.c);
        dpud dpud0 = new dpud(new dven(this.a), dvem0);
        this.a.I.d(this.b.a, this.c, dpud0);
    }
}

