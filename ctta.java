import android.os.IBinder;
import com.google.android.gms.dtdi.core.SelectedDevice;

public final class ctta implements bhzn {
    final cttb a;
    final SelectedDevice b;

    public ctta(cttb cttb0, SelectedDevice selectedDevice0) {
        this.a = cttb0;
        this.b = selectedDevice0;
        super();
    }

    @Override  // bhzn
    public final void a(String s) {
        cttb cttb0 = this.a;
        ggtj ggtj0 = (ggtj)cttb0.b.h();
        if(s == null) {
            s = "none";
        }
        ggtj0.B("onConnectionClosed with reason: %s", s);
        synchronized(cttb0) {
            cttb0.d.remove(this.b.a.toString());
            iced iced0 = (iced)cttb0.e.remove(this.b.a.toString());
            if(iced0 != null) {
                iceb.a(iced0);
            }
        }
    }

    @Override  // bhzn
    public final void b(String s, IBinder iBinder0, byte[] arr_b) {
        ibuq.f(s, "channelName");
        ibuq.f(iBinder0, "token");
        ibuq.f(arr_b, "bytes");
        synchronized(this.a) {
        }
        if(((SelectedDevice)this.a.d.get(iBinder0.toString())) != null) {
            cttb cttb0 = this.a;
            icck icck0 = cttb0.c;
            if(icck0 != null) {
                icbb.b(icck0, null, null, new ctsz(cttb0, iBinder0, arr_b, null), 3);
            }
        }
    }
}

