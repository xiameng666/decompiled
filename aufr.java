import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.usonia.DeviceInfo;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

public final class aufr {
    public final avjh a;
    public final augl b;
    public augk c;
    public final auiz d;
    public final Set e;
    private final atxp f;
    private final avij g;

    public aufr(augl augl0, atxp atxp0) {
        this.a = new avjh("CChordResponseHandler");
        this.e = new HashSet();
        this.b = augl0;
        this.d = augl0.e;
        this.f = atxp0;
        this.g = avij.e();
    }

    public final void a(DeviceInfo deviceInfo0, augi augi0, String s) {
        CastDevice castDevice0;
        InetAddress inetAddress0;
        long v = System.currentTimeMillis();
        auiz auiz0 = this.d;
        auju auju0 = auiz0.e(s);
        if(auju0 == null) {
            auju0 = auiz0.f(s, v);
        }
        try {
            inetAddress0 = InetAddress.getByAddress(deviceInfo0.a);
        }
        catch(UnknownHostException unknownHostException0) {
            this.a.e(unknownHostException0, "Failed to create InetAddress", new Object[0]);
            return;
        }
        for(Object object0: augi0.b) {
            augh augh0 = (augh)object0;
            auiz auiz1 = this.d;
            aujd aujd0 = auiz1.c(augh0.b);
            if(aujd0 == null) {
                atrq atrq0 = new atrq(augh0.b, inetAddress0);
                this.b(atrq0, augh0);
                castDevice0 = atrq0.a();
                aujd aujd1 = auiz1.d(castDevice0);
                aujd1.h(augh0.h);
                aujd1.h = v;
                auju0.b(aujd1);
                this.b.m.a(aujd1, gkfz.j, true, false);
            }
            else {
                boolean z = aujd0.m();
                atrq atrq1 = new atrq(aujd0.c);
                atrq1.b = inetAddress0.getHostAddress();
                this.b(atrq1, augh0);
                CastDevice castDevice1 = atrq1.a();
                aujd0.j(castDevice1, false);
                aujd0.h(augh0.h);
                auju0.b(aujd0);
                if(!z) {
                    auiz.r(auiz1, castDevice1, s);
                }
                castDevice0 = castDevice1;
            }
            if(this.e.add(castDevice0.f())) {
                this.f.e(castDevice0, v);
            }
        }
        this.b.l.e(false);
    }

    private final void b(atrq atrq0, augh augh0) {
        atrq0.c = augh0.g;
        atrq0.d = augh0.e;
        atrq0.f = augh0.d;
        atrq0.i = (int)augh0.f;
        atrq0.q = augh0.c;
        if(this.g.F()) {
            atrq0.k = Boolean.valueOf(false);
        }
    }
}

