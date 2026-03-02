import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class aqqk {
    public static final bboh a;
    public static final AtomicReference b;
    private static final icck c;
    private final Context d;
    private final boolean e;
    private final Long f;

    static {
        aqqk.a = bboh.b("AndroidBackupEventsLogger", bbcu.dF);
        aqqk.b = new AtomicReference(null);
        aqqk.c = iccl.b(cclv.e());
    }

    public aqqk(Context context0) {
        this(context0, false, false, 14);
    }

    public aqqk(Context context0, boolean z) {
        this(context0, false, z, 8);
    }

    public aqqk(Context context0, boolean z, boolean z1, int v) {
        this.d = context0;
        int v1 = 0;
        this.e = ((v & 4) == 0 ? 1 : 0) & ((int)z1);
        if((v & 2) == 0) {
            v1 = 1;
        }
        this.f = (v1 & ((int)z)) == 1 ? ((long)aqra.a()) : null;
    }

    public aqqk(Context context0, byte[] arr_b) {
        this(context0, true, false, 12);
    }

    public final void a(ghys ghys0, ghyr ghyr0) {
        ibuq.f(ghys0, "event");
        ibuq.f(ghyr0, "eventType");
        this.b(ghys0, ghyr0, this.f);
    }

    public final void b(ghys ghys0, ghyr ghyr0, Long long0) {
        ibuq.f(ghys0, "event");
        ibuq.f(ghyr0, "eventType");
        AtomicReference atomicReference0 = aqqk.b;
        atomicReference0.get();
        if(!hqjs.f()) {
            ((ggtj)aqqk.a.j()).x("Flag disabled, logging without sampling");
            aqqk.d(ghys0, ghyr0, long0);
            return;
        }
        if(this.e) {
            aqqk.d(ghys0, ghyr0, long0);
            return;
        }
        Context context0 = this.d;
        if(context0 == null) {
            ((ggtj)aqqk.a.i()).B("Context is null, not using sampling. Event: %s", ghyr0);
            aqqk.d(aqqk.e(ghys0, true, false, false, 6), ghyr0, long0);
            return;
        }
        Boolean boolean0 = (Boolean)atomicReference0.get();
        if(ibuq.m(boolean0, Boolean.valueOf(true))) {
            aqqk.c(ghys0, ghyr0, long0);
            return;
        }
        if(ibuq.m(boolean0, Boolean.valueOf(false))) {
            aqqk.d(ghys0, ghyr0, long0);
            return;
        }
        if(boolean0 != null) {
            throw new ibnq();
        }
        aqqj aqqj0 = new aqqj(this, ghys0, ghyr0, long0, context0, null);
        icbb.b(aqqk.c, null, null, aqqj0, 3);
    }

    public static final void c(ghys ghys0, ghyr ghyr0, Long long0) {
        ((ggtj)aqqk.a.h()).B("Logging with sampling event %s", ghys0);
        cczb cczb0 = cdrv.v().c(((ProtoLiteMessage)ghys0));
        cczb0.c = (int)ghyr0.aR;
        if(long0 != null) {
            cczb0.e = long0;
        }
        cczb0.a();
    }

    public static final void d(ghys ghys0, ghyr ghyr0, Long long0) {
        ((ggtj)aqqk.a.h()).B("Logging without sampling %s", ghys0);
        cczb cczb0 = cdrq.v().c(((ProtoLiteMessage)ghys0));
        cczb0.c = (int)ghyr0.aR;
        if(long0 != null) {
            cczb0.e = long0;
        }
        cczb0.a();
    }

    static ghys e(ghys ghys0, boolean z, boolean z1, boolean z2, int v) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghys0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ghys0));
        ghyp ghyp0 = ghyo.a(hftp0);
        giya giya0 = gixz.a(((ProtoLiteMessage)gidi.a).v_newBuilder());
        if((((int)z) & (v & 1 ^ 1)) != 0) {
            ProtoLiteBuilder hftp1 = giya0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gidi gidi0 = (gidi)hftp1.b_message;
            gidi0.b |= 2;
            gidi0.d = true;
        }
        int v1 = 0;
        if((((v & 2) == 0 ? 1 : 0) & ((int)z1)) != 0) {
            ProtoLiteBuilder hftp2 = giya0.a;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gidi gidi1 = (gidi)hftp2.b_message;
            gidi1.b |= 8;
            gidi1.f = true;
        }
        if((v & 4) == 0) {
            v1 = 1;
        }
        if((v1 & ((int)z2)) != 0) {
            ProtoLiteBuilder hftp3 = giya0.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gidi gidi2 = (gidi)hftp3.b_message;
            gidi2.b |= 4;
            gidi2.e = true;
        }
        ghyp0.c(giya0.a());
        return ghyp0.a();
    }
}

