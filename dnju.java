import com.google.android.gms.pay.fops.details.FopDetailsFragment;

public final class dnju implements ibts {
    public final FopDetailsFragment a;

    public dnju(FopDetailsFragment fopDetailsFragment0) {
        this.a = fopDetailsFragment0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        dnjs dnjs0 = this.a.z();
        if(dnjs0.t != z) {
            dnjs0.t = z;
            dnjs0.q();
        }
        return ibom.a;
    }
}

