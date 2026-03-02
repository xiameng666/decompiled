import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;

public final class czbw implements czdn {
    public final long a;

    public czbw(long v) {
        this.a = v;
    }

    @Override  // czdn
    public final void a(czbf czbf0, azvd azvd0) {
        czft czft0 = (czft)czbf0.H();
        CancelPayloadParams cancelPayloadParams0 = new CancelPayloadParams();
        cancelPayloadParams0.a = new czbc(azvd0);
        cancelPayloadParams0.b = this.a;
        czft0.e(cancelPayloadParams0);
    }
}

