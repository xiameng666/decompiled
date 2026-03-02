import com.google.android.gms.dtdi.core.SelectedDevice;

public final class ctsj implements evqc {
    public final cttb a;
    public final SelectedDevice b;

    public ctsj(cttb cttb0, SelectedDevice selectedDevice0) {
        this.a = cttb0;
        this.b = selectedDevice0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)this.a.b.j()).s(exception0)).B("Failed to register payload receiver for device %s", this.b.b);
    }
}

