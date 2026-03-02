import android.content.Context;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.common.api.Status;

public final class aibg extends cjtm {
    private final SmsRetrieverEvent a;

    public aibg(SmsRetrieverEvent smsRetrieverEvent0, azug azug0) {
        super(0xC5, "MetricsEventLoggingOperation", azug0);
        gftb.check(smsRetrieverEvent0);
        this.a = smsRetrieverEvent0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!bbmx.a(context0)) {
            return;
        }
        SmsRetrieverEvent smsRetrieverEvent0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghxu.a).v_newBuilder();
        if((smsRetrieverEvent0.n & 1) != 0) {
            int v = ghxr.a(smsRetrieverEvent0.a);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghxu ghxu0 = (ghxu)hftp0.b_message;
            if(v == 0) {
                throw null;
            }
            ghxu0.c = v - 1;
            ghxu0.b |= 1;
        }
        if((smsRetrieverEvent0.n & 2) != 0) {
            String s = smsRetrieverEvent0.b;
            if(s != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghxu ghxu1 = (ghxu)hftp0.b_message;
                ghxu1.b |= 2;
                ghxu1.d = s;
            }
        }
        if((smsRetrieverEvent0.n & 4) != 0) {
            int v1 = smsRetrieverEvent0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghxu ghxu2 = (ghxu)hftp0.b_message;
            ghxu2.b |= 4;
            ghxu2.e = v1;
        }
        if((smsRetrieverEvent0.n & 8) != 0) {
            int v2 = ghxp.a(smsRetrieverEvent0.d);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghxu ghxu3 = (ghxu)hftp0.b_message;
            if(v2 == 0) {
                throw null;
            }
            ghxu3.f = v2 - 1;
            ghxu3.b |= 8;
        }
        if((smsRetrieverEvent0.n & 16) != 0) {
            String s1 = smsRetrieverEvent0.e;
            if(s1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghxu ghxu4 = (ghxu)hftp0.b_message;
                ghxu4.b |= 16;
                ghxu4.g = s1;
            }
        }
        if((smsRetrieverEvent0.n & 0x20) != 0) {
            String s2 = smsRetrieverEvent0.f;
            if(s2 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghxu ghxu5 = (ghxu)hftp0.b_message;
                ghxu5.b |= 0x20;
                ghxu5.h = s2;
            }
        }
        if((smsRetrieverEvent0.n & 0x40) != 0) {
            int v3 = smsRetrieverEvent0.g;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghxu ghxu6 = (ghxu)hftp0.b_message;
            ghxu6.b |= 0x40;
            ghxu6.i = v3;
        }
        if((smsRetrieverEvent0.n & 0x80) != 0) {
            int v4 = smsRetrieverEvent0.h;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghxu ghxu7 = (ghxu)hftp0.b_message;
            ghxu7.b |= 0x80;
            ghxu7.j = v4;
        }
        if((smsRetrieverEvent0.n & 0x100) != 0) {
            ghxn ghxn0 = ghxn.b(smsRetrieverEvent0.i);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ghxu)hftp0.b_message).k = ghxn0.d;
            ((ghxu)hftp0.b_message).b |= 0x100;
        }
        if((smsRetrieverEvent0.n & 0x200) != 0) {
            ghxn ghxn1 = ghxn.b(smsRetrieverEvent0.j);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ghxu)hftp0.b_message).l = ghxn1.d;
            ((ghxu)hftp0.b_message).b |= 0x200;
        }
        if((smsRetrieverEvent0.n & 0x400) != 0) {
            boolean z = smsRetrieverEvent0.k;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghxu ghxu8 = (ghxu)hftp0.b_message;
            ghxu8.b |= 0x400;
            ghxu8.m = z;
        }
        if((smsRetrieverEvent0.n & 0x800) != 0) {
            String s3 = smsRetrieverEvent0.l;
            if(s3 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghxu ghxu9 = (ghxu)hftp0.b_message;
                ghxu9.b |= 0x800;
                ghxu9.n = s3;
            }
        }
        if((smsRetrieverEvent0.n & 0x1000) != 0) {
            int v5 = ghxt.a(smsRetrieverEvent0.m);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghxu ghxu10 = (ghxu)hftp0.b_message;
            if(v5 == 0) {
                throw null;
            }
            ghxu10.o = v5 - 1;
            ghxu10.b |= 0x1000;
        }
        ghxu ghxu11 = (ghxu)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ghon)hftv0).e = ghom0.av;
        ((ghon)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp1.b_message;
        ghxu11.getClass();
        ghon0.w = ghxu11;
        ghon0.b |= 0x100000;
        ghon ghon1 = (ghon)hftp1.N_build();
        cdwn.v().c(((ProtoLiteMessage)ghon1)).a();
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }
}

