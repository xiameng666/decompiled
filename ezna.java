import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import java.util.concurrent.ExecutionException;

public abstract class ezna extends cjtm {
    protected final bkcm a;
    protected final baqr b;
    protected final FacsCacheCallOptions c;
    protected final ezqo d;
    protected final fpfg e;
    protected final hffs f;
    protected final bkcb g;
    private static final ggtl h;

    static {
        ezna.h = ezqu.c();
    }

    public ezna(String s, bkcm bkcm0, baqr baqr0, FacsCacheCallOptions facsCacheCallOptions0, ezqo ezqo0, fpfg fpfg0, hffs hffs0, bkcb bkcb0) {
        super(202, s);
        this.a = bkcm0;
        this.b = baqr0;
        this.c = facsCacheCallOptions0;
        this.d = ezqo0;
        this.e = fpfg0;
        this.f = hffs0;
        this.g = bkcb0;
    }

    final long b() {
        return this.c.b;
    }

    final String c() {
        return this.b.d + "#" + this.c.a;
    }

    final void d() {
        if(this.b.b != null) {
            return;
        }
        throw new cjuh(5, "Provided client context doesn\'t have a resolved account!");
    }

    final void e(String s) {
        if(!gfud.e(',').d().n(s).contains(this.b.d)) {
            return;
        }
        throw new cjuh(35000, "The calling package is blacklisted!");
    }

    final void g(int v, long v1) {
        hffs hffs0 = this.f;
        String s = this.c();
        long v2 = this.b();
        if(hzdj.r()) {
            cioq cioq0 = cioq.v();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
            hfeq hfeq0 = (hfeq)((ProtoLiteMessage)hfet.a).v_newBuilder();
            if(!hfeq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfeq0).ensureMutable();
            }
            hfet hfet0 = (hfet)hfeq0.b_message;
            hfet0.b |= 1;
            hfet0.c = v;
            if(!hfeq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfeq0).ensureMutable();
            }
            hfet hfet1 = (hfet)hfeq0.b_message;
            hfet1.b |= 2;
            hfet1.d = v1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfer.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((hfer)hftv0).b |= 1;
            ((hfer)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfer hfer0 = (hfer)hftp2.b_message;
            hfer0.b |= 2;
            hfer0.d = v2;
            if(!hfeq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfeq0).ensureMutable();
            }
            hfet hfet2 = (hfet)hfeq0.b_message;
            hfer hfer1 = (hfer)hftp2.N_build();
            hfer1.getClass();
            hfet2.e = hfer1;
            hfet2.b |= 4;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hffn hffn0 = (hffn)hftp1.b_message;
            hfet hfet3 = (hfet)((ProtoLiteBuilder)hfeq0).N_build();
            hfet3.getClass();
            hffn0.c = hfet3;
            hffn0.b = 3;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj0 = (hfgj)hftp0.b_message;
            hffn hffn1 = (hffn)hftp1.N_build();
            hffn1.getClass();
            hfgj0.d = hffn1;
            hfgj0.c = 3;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hfgc hfgc0 = (hfgc)hftp3.b_message;
            hfgc0.b |= 1;
            hfgc0.c = "com.google.android.gms#udc-facs";
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj1 = (hfgj)hftp0.b_message;
            hfgc hfgc1 = (hfgc)hftp3.N_build();
            hfgc1.getClass();
            hfgj1.f = hfgc1;
            hfgj1.b |= 2;
            cczb cczb0 = cioq0.c(((ProtoLiteMessage)(((hfgj)hftp0.N_build()))));
            cczb0.c = (int)hffs0.I;
            cczb0.a();
        }
        else {
            ezqo ezqo0 = this.d;
            long v3 = (long)(((Long)ezqo0.c.mr()));
            if(ezqo0.d.a(v3)) {
                ayud ayud0 = (ayud)ezqo0.b.mr();
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hfgj hfgj2 = (hfgj)hftp4.b_message;
                hfgj2.b |= 1;
                hfgj2.e = (int)v3;
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                hfeq hfeq1 = (hfeq)((ProtoLiteMessage)hfet.a).v_newBuilder();
                if(!hfeq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfeq1).ensureMutable();
                }
                hfet hfet4 = (hfet)hfeq1.b_message;
                hfet4.b |= 1;
                hfet4.c = v;
                if(!hfeq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfeq1).ensureMutable();
                }
                hfet hfet5 = (hfet)hfeq1.b_message;
                hfet5.b |= 2;
                hfet5.d = v1;
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfer.a).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp6.b_message;
                ((hfer)hftv1).b |= 1;
                ((hfer)hftv1).c = s;
                if(!hftv1.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hfer hfer2 = (hfer)hftp6.b_message;
                hfer2.b |= 2;
                hfer2.d = v2;
                if(!hfeq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfeq1).ensureMutable();
                }
                hfet hfet6 = (hfet)hfeq1.b_message;
                hfer hfer3 = (hfer)hftp6.N_build();
                hfer3.getClass();
                hfet6.e = hfer3;
                hfet6.b |= 4;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                hffn hffn2 = (hffn)hftp5.b_message;
                hfet hfet7 = (hfet)((ProtoLiteBuilder)hfeq1).N_build();
                hfet7.getClass();
                hffn2.c = hfet7;
                hffn2.b = 3;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hfgj hfgj3 = (hfgj)hftp4.b_message;
                hffn hffn3 = (hffn)hftp5.N_build();
                hffn3.getClass();
                hfgj3.d = hffn3;
                hfgj3.c = 3;
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                hfgc hfgc2 = (hfgc)hftp7.b_message;
                hfgc2.b |= 1;
                hfgc2.c = "com.google.android.gms#udc-facs";
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hfgj hfgj4 = (hfgj)hftp4.b_message;
                hfgc hfgc3 = (hfgc)hftp7.N_build();
                hfgc3.getClass();
                hfgj4.f = hfgc3;
                hfgj4.b |= 2;
                ayuc ayuc0 = ayud0.i(((MessageLite)hftp4.N_build()));
                ayuc0.k(hffs0.I);
                ayuc0.d();
            }
        }
        if(v == Status.b.i) {
            ezna.h.h().ar(0x442C).B("Operation \'%s\' successful!", this.q());
            return;
        }
        ezna.h.j().ar(0x442B).P("Operation \'%s\' failed with status \'%d\'!", this.q(), v);
    }

    static final Object h(evql evql0) {
        try {
            return evrg.n(evql0);
        }
        catch(InterruptedException interruptedException0) {
            throw new cjuh(14, "Upload thread interrupted!", null, interruptedException0);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if((throwable0 instanceof aztb)) {
                throw new cjuh(((aztb)throwable0).b(), "Internal sync API failure!", null, throwable0);
            }
            gfut.e(throwable0);
            throw new IllegalStateException(throwable0);
        }
    }
}

