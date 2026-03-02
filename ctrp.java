import android.os.IBinder;
import com.google.android.gms.dtdi.core.ChannelInfo;

public final class ctrp implements bhzn {
    final ctrq a;

    public ctrp(ctrq ctrq0) {
        this.a = ctrq0;
        super();
    }

    @Override  // bhzn
    public final void a(String s) {
        ctrq ctrq0 = this.a;
        ggtj ggtj0 = (ggtj)ctrq0.d.h();
        if(s == null) {
            s = "none";
        }
        ggtj0.B("onConnectionClosed with reason: %s", s);
        synchronized(ctrq0) {
            ctrq0.e = null;
        }
        ctrq ctrq1 = this.a;
        icck icck0 = ctrq1.f;
        if(icck0 != null) {
            iccl.i(icck0);
        }
        ctrq1.f = null;
        icnl icnl0 = ctrq1.k;
        do {
            Object object0 = icnl0.b();
            ctow ctow0 = (ctow)object0;
        }
        while(!icnl0.h(object0, ctot.a));
    }

    @Override  // bhzn
    public final void b(String s, IBinder iBinder0, byte[] arr_b) {
        ibuq.f(s, "channelName");
        ibuq.f(iBinder0, "token");
        ibuq.f(arr_b, "bytes");
        ctrq ctrq0 = this.a;
        synchronized(ctrq0) {
            if(!ibuq.m(iBinder0, ctrq0.a.a)) {
                throw new IllegalStateException("Check failed.");
            }
            ChannelInfo channelInfo0 = ctrq0.e;
            if(channelInfo0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if(!ibuq.m(s, channelInfo0.a)) {
                throw new IllegalStateException("Check failed.");
            }
        }
        icck icck0 = ctrq0.f;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new ctro(ctrq0, arr_b, null), 3);
        }
    }
}

