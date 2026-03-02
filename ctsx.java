import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.SelectedDevice;

final class ctsx implements icih {
    final cttb a;
    final ChannelInfo b;

    public ctsx(cttb cttb0, ChannelInfo channelInfo0) {
        this.a = cttb0;
        this.b = channelInfo0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        SelectedDevice selectedDevice0;
        byte[] arr_b = (byte[])((ibns)object0).b;
        synchronized(this.a) {
            selectedDevice0 = (SelectedDevice)this.a.d.get(((String)((ibns)object0).a));
        }
        if(selectedDevice0 == null) {
            return ibom.a;
        }
        evql evql0 = this.a.a.d(this.b, selectedDevice0.a, arr_b);
        evql0.b(new ctsv(new ctsu()));
        evql0.A(new ctsw(this.a, selectedDevice0));
        return ibom.a;
    }
}

