import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class eiiz {
    public final eiiv a;
    public final eigb b;
    public final ArrayDeque c;
    private eiix d;
    private final eicb e;
    private final List f;

    public eiiz(eigb eigb0, eifs eifs0, eicb eicb0) {
        this.c = new ArrayDeque();
        this.f = new ArrayList();
        eiiv eiiv0 = new eiiv(new eijb(eigb0, eifs0), new eijc(eigb0, eifs0), new eija(eigb0, eifs0));
        this.a = eiiv0;
        this.b = eigb0;
        this.d = eiiv0.a;
        this.e = eicb0;
    }

    public final void a(eiiy eiiy0) {
        this.f.add(eiiy0);
    }

    public final void b(eiix eiix0) {
        int v2;
        String s;
        if(eiix0 == this.d) {
            return;
        }
        int v = this.h(eiix0);
        for(Object object0: this.f) {
            ((eiiy)object0).g(v);
        }
        ArrayDeque arrayDeque0 = this.c;
        eiiv eiiv0 = this.a;
        if(eiiv0.c.equals(eiix0)) {
            s = "M";
        }
        else {
            s = eiiv0.a.equals(eiix0) ? "O" : "S";
        }
        eica.b(arrayDeque0, "State changed to " + s);
        this.d.b();
        eiix0.a();
        eicb eicb0 = this.e;
        long v1 = System.currentTimeMillis();
        if(eicb.m()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwnf.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwnf gwnf0 = (gwnf)hftp0.b_message;
            gwnf0.b |= 1;
            gwnf0.c = v1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwor.a).v_newBuilder();
            switch(v - 1) {
                case 1: {
                    v2 = 2;
                    break;
                }
                case 2: {
                    v2 = 3;
                    break;
                }
                case 3: {
                    v2 = 4;
                    break;
                }
                default: {
                    v2 = 1;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gwor)hftp1.b_message).c = v2 - 1;
            ((gwor)hftp1.b_message).b |= 1;
            gwor gwor0 = (gwor)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            gwor0.getClass();
            ((gwnf)hftv0).g = gwor0;
            ((gwnf)hftv0).b |= 16;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gwnf)hftp0.b_message).d = 3;
            ((gwnf)hftp0.b_message).b |= 2;
            gwnf gwnf1 = (gwnf)hftp0.N_build();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwik gwik0 = (gwik)hftp2.b_message;
            gwnf1.getClass();
            gwik0.P = gwnf1;
            gwik0.c |= 0x40;
            eicb0.o(((gwik)hftp2.N_build()), 41);
        }
        this.d = eiix0;
    }

    public final void c() {
        this.b(this.a.c);
    }

    public final void d() {
        this.b(this.a.b);
    }

    public final void e() {
        this.b(this.a.b);
        for(Object object0: this.f) {
            ((eiiy)object0).e();
        }
    }

    public final void f() {
        this.b(this.a.a);
    }

    public final int g() {
        return this.h(this.d);
    }

    private final int h(eiix eiix0) {
        eiiv eiiv0 = this.a;
        if(eiiv0.c.equals(eiix0)) {
            return 3;
        }
        if(eiiv0.b.equals(eiix0)) {
            return 2;
        }
        return eiiv0.a.equals(eiix0) ? 4 : 1;
    }
}

