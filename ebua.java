import com.google.android.gms.common.api.Status;

public final class ebua implements evqc {
    public final ebub a;

    public ebua(ebub ebub0) {
        this.a = ebub0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ggtj ggtj0 = (ggtj)((ggtj)ebub.a.j()).s(exception0);
        ebub ebub0 = this.a;
        ggtj0.B("Failed to get octopus card: %s", (ebub0.b.b == 6 ? ((dyhd)ebub0.b.c) : dyhd.a).c);
        if((exception0 instanceof fsev)) {
            fseu fseu0 = ((fsev)exception0).a;
            if((fseu0 instanceof fser)) {
                ibuq.d(fseu0, "null cannot be cast to non-null type com.google.android.libraries.tapandpay.octopus.client.OctopusClientException.Reason.OctopusServerError");
                Status status0 = new Status(8, ((fser)fseu0).a);
                ebub0.c.x(status0);
                return;
            }
        }
        ebub0.c.x(Status.d);
    }
}

