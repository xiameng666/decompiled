import java.io.Serializable;
import java.util.EnumSet;

public final class fdco implements Serializable {
    private final EnumSet a;

    public fdco(EnumSet enumSet0) {
        this.a = enumSet0;
    }

    public static fdco a() {
        return new fdco(EnumSet.noneOf(fdcn.class));
    }

    @Deprecated
    public final ffco b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffco.a).v_newBuilder();
        boolean z = this.g(fdcn.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco0 = (ffco)hftp0.b_message;
        ffco0.b |= 1;
        ffco0.c = z;
        boolean z1 = this.g(fdcn.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco1 = (ffco)hftp0.b_message;
        ffco1.b |= 2;
        ffco1.d = z1;
        boolean z2 = this.g(fdcn.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco2 = (ffco)hftp0.b_message;
        ffco2.b |= 4;
        ffco2.e = z2;
        return (ffco)hftp0.N_build();
    }

    public final ffco c(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffco.a).v_newBuilder();
        hfwn hfwn0 = hfyn.l();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco0 = (ffco)hftp0.b_message;
        hfwn0.getClass();
        ffco0.h = hfwn0;
        ffco0.b |= 0x20;
        boolean z = this.g(fdcn.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco1 = (ffco)hftp0.b_message;
        ffco1.b |= 1;
        ffco1.c = z;
        boolean z1 = this.g(fdcn.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco2 = (ffco)hftp0.b_message;
        ffco2.b |= 2;
        ffco2.d = z1;
        boolean z2 = this.g(fdcn.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ffco)hftv0).b |= 4;
        ((ffco)hftv0).e = z2;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffco ffco3 = (ffco)hftp0.b_message;
            ffco3.b |= 16;
            ffco3.g = s;
        }
        if(s1 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffcn.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffcn ffcn0 = (ffcn)hftp1.b_message;
            hfuo hfuo0 = ffcn0.b;
            if(!hfuo0.c()) {
                ffcn0.b = ProtoLiteMessage.E(hfuo0);
            }
            ffcn0.b.add(s1);
            ffcn ffcn1 = (ffcn)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffco ffco4 = (ffco)hftp0.b_message;
            ffcn1.getClass();
            ffco4.i = ffcn1;
            ffco4.b |= 0x40;
        }
        return (ffco)hftp0.N_build();
    }

    @Deprecated
    public final ffco d(String s, hfwn hfwn0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffco.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((ffco)hftv0).b |= 16;
        ((ffco)hftv0).g = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco0 = (ffco)hftp0.b_message;
        hfwn0.getClass();
        ffco0.h = hfwn0;
        ffco0.b |= 0x20;
        boolean z = this.g(fdcn.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco1 = (ffco)hftp0.b_message;
        ffco1.b |= 1;
        ffco1.c = z;
        boolean z1 = this.g(fdcn.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco2 = (ffco)hftp0.b_message;
        ffco2.b |= 2;
        ffco2.d = z1;
        boolean z2 = this.g(fdcn.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco3 = (ffco)hftp0.b_message;
        ffco3.b |= 4;
        ffco3.e = z2;
        return (ffco)hftp0.N_build();
    }

    public final void e(ffco ffco0) {
        this.a.clear();
        this.f(fdcn.a, ffco0.c);
        this.f(fdcn.b, ffco0.d);
        this.f(fdcn.c, ffco0.e);
    }

    public final void f(fdcn fdcn0, boolean z) {
        EnumSet enumSet0 = this.a;
        if(z) {
            enumSet0.add(fdcn0);
            return;
        }
        enumSet0.remove(fdcn0);
    }

    public final boolean g(fdcn fdcn0) {
        return this.a.contains(fdcn0);
    }
}

