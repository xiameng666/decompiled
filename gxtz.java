import android.content.Context;

public class gxtz {
    private gxty a;
    private gxty b;
    private gxty c;
    private final cunt d;
    public final Context f;

    public gxtz(Context context0) {
        this.f = context0;
        this.d = new cunt(context0);
    }

    public gxtz(Context context0, byte[] arr_b) {
        this(context0);
        cune.a("NearbySettingsLogger");
    }

    public final Long J(String s) {
        return this.d.a(s);
    }

    public final void K(hiat hiat0, boolean z) {
        gxty gxty0;
        Boolean.valueOf(z).getClass();
        if(z) {
            Context context0 = this.f;
            String s = cxxy.d(context0);
            if(s == null) {
                if(this.b == null) {
                    this.b = new gxty(context0, ayud.l(context0, "COPRESENCE"), ((gful_cronetEngineProvider)new gxtw()), null);
                }
                gxty0 = this.b;
            }
            else {
                if(this.a == null) {
                    aytt aytt0 = new aytt(context0, "COPRESENCE");
                    aytt0.f = s;
                    this.a = new gxty(context0, aytt0.a(), ((gful_cronetEngineProvider)new gxtv()), s);
                }
                gxty0 = this.a;
            }
        }
        else {
            if(this.c == null) {
                ayud ayud0 = new aytt(this.f, "COPRESENCE_NO_IDS").a();
                gxtx gxtx0 = new gxtx();
                this.c = new gxty(this.f, ayud0, ((gful_cronetEngineProvider)gxtx0), null);
            }
            gxty0 = this.c;
        }
        if(hvqf.a.n().P()) {
            String s1 = gxty0.d;
            if(s1 != null) {
                ((cczf)gxty0.c.mr()).i(hiat0, s1);
                return;
            }
            ((cczf)gxty0.c.mr()).f(hiat0);
            return;
        }
        ayuc ayuc0 = gxty0.b.i(((MessageLite)hiat0));
        if(hvqf.z()) {
            icwt icwt0 = new icwt();
            ayuc0.o = fhbe.b(gxty0.a, icwt0);
        }
        ayuc0.d();
    }

    public final void L(String s, String s1, hics hics0) {
        if(!cusc.a(this.f)) {
            return;
        }
        hiat hiat0 = gxtz.M(s, s1, 6);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hiat0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hiat0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hiat hiat1 = (hiat)hftp0.b_message;
        hics0.getClass();
        hiat1.h = hics0;
        hiat1.b |= 0x80;
        this.K(((hiat)hftp0.N_build()), false);
    }

    public static hiat M(String s, String s1, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hiat.a).v_newBuilder();
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hiat hiat0 = (hiat)hftp0.b_message;
            hiat0.b |= 4;
            hiat0.d = s;
        }
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hiat hiat1 = (hiat)hftp0.b_message;
            hiat1.b |= 8;
            hiat1.e = s1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hiat)hftp0.b_message).f = v - 1;
        ((hiat)hftp0.b_message).b |= 16;
        return (hiat)hftp0.N_build();
    }
}

