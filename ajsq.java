import j..util.Objects;

public final class ajsq {
    public final ajrc a;
    public final akbo b;

    public ajsq(akbo akbo0) {
        this.a = new ajrc(akbo0.a);
        this.b = akbo0;
    }

    public final grdx a(grdw grdw0) {
        grdx grdx0;
        String s = ajsq.f((grdw0.c == null ? greu.a : grdw0.c).b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghsx)hftp0.b_message).c = 3;
        ((ghsx)hftp0.b_message).b |= 1;
        int v = grdw0.f.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghsx ghsx0 = (ghsx)hftp0.b_message;
        ghsx0.b |= 4;
        ghsx0.e = v;
        grff grff0 = grdw0.d == null ? grff.a : grdw0.d;
        int v1 = grff0.f == 0 ? grdw0.e : grff0.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghsx ghsx1 = (ghsx)hftp0.b_message;
        ghsx1.b |= 8;
        ghsx1.f = v1;
        try {
            akbo akbo0 = this.b;
            ProtoLiteBuilder hftp1 = akbo0.g;
            ProtoLiteMessage hftv0 = hftp1.b_message;
            int v2 = ((ghth)hftv0).l + 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghth ghth0 = (ghth)hftp1.b_message;
            ghth0.b |= 0x800;
            ghth0.l = v2;
            long v3 = hput.b();
            if(v3 <= 0L) {
                Objects.requireNonNull(this.a);
                ajrj ajrj1 = new ajrj(this.a);
                ajrl ajrl0 = new ajrl(grdw0);
                grdx0 = (grdx)this.a.b(ajrj1, ajrl0);
            }
            else if(hput.f()) {
                Objects.requireNonNull(this.a);
                ajsf ajsf0 = new ajsf(this.a);
                ajsp ajsp0 = new ajsp(v3, grdw0);
                grdx0 = (grdx)this.a.b(ajsf0, ajsp0);
            }
            else {
                Objects.requireNonNull(this.a);
                ajrj ajrj0 = new ajrj(this.a);
                ajrk ajrk0 = new ajrk(v3, grdw0);
                grdx0 = (grdx)this.a.b(ajrj0, ajrk0);
            }
            int v4 = iaph.a.r;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx2 = (ghsx)hftp0.b_message;
            ghsx2.b |= 2;
            ghsx2.d = v4;
            akdz.c(s, ((ghsx)hftp0.N_build()), akbo0.e);
            return grdx0;
        }
        catch(ajqz ajqz0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx3 = (ghsx)hftp0.b_message;
            ghsx3.b |= 2;
            ghsx3.d = ajqz0.a;
            akdz.c(s, ((ghsx)hftp0.N_build()), this.b.e);
            throw ajqz0;
        }
    }

    public final greb b(grea grea0) {
        greb greb0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghsx)hftp0.b_message).c = 11;
        ((ghsx)hftp0.b_message).b |= 1;
        try {
            akbo akbo0 = this.b;
            ProtoLiteBuilder hftp1 = akbo0.g;
            ProtoLiteMessage hftv0 = hftp1.b_message;
            int v = ((ghth)hftv0).k + 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghth ghth0 = (ghth)hftp1.b_message;
            ghth0.b |= 0x100;
            ghth0.j = v;
            long v1 = hput.b();
            if(v1 <= 0L) {
                Objects.requireNonNull(this.a);
                ajrj ajrj1 = new ajrj(this.a);
                ajsi ajsi0 = new ajsi(grea0);
                greb0 = (greb)this.a.b(ajrj1, ajsi0);
            }
            else if(hput.f()) {
                Objects.requireNonNull(this.a);
                ajsf ajsf0 = new ajsf(this.a);
                ajsg ajsg0 = new ajsg(v1, grea0);
                greb0 = (greb)this.a.b(ajsf0, ajsg0);
            }
            else {
                Objects.requireNonNull(this.a);
                ajrj ajrj0 = new ajrj(this.a);
                ajsh ajsh0 = new ajsh(v1, grea0);
                greb0 = (greb)this.a.b(ajrj0, ajsh0);
            }
            int v2 = iaph.a.r;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx0 = (ghsx)hftp0.b_message;
            ghsx0.b |= 2;
            ghsx0.d = v2;
            akdz.c("general", ((ghsx)hftp0.N_build()), akbo0.e);
            return greb0;
        }
        catch(ajqz ajqz0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx1 = (ghsx)hftp0.b_message;
            ghsx1.b |= 2;
            ghsx1.d = ajqz0.a;
            akdz.c("general", ((ghsx)hftp0.N_build()), this.b.e);
            throw ajqz0;
        }
    }

    public final gree c(gred gred0) {
        gree gree1;
        gree gree0;
        ghsx ghsx0 = ghsx.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsx0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghsx)hftp0.b_message).c = 2;
        ((ghsx)hftp0.b_message).b |= 1;
        String s = gred0.e.isEmpty() ? null : ajsq.f(((String)gred0.e.get(0)));
        try {
            long v = hput.b();
            if(v <= 0L) {
                Objects.requireNonNull(this.a);
                ajrj ajrj1 = new ajrj(this.a);
                ajsb ajsb0 = new ajsb(gred0);
                gree0 = (gree)this.a.b(ajrj1, ajsb0);
            }
            else if(hput.f()) {
                Objects.requireNonNull(this.a);
                ajsf ajsf0 = new ajsf(this.a);
                ajrz ajrz0 = new ajrz(v, gred0);
                gree0 = (gree)this.a.b(ajsf0, ajrz0);
            }
            else {
                Objects.requireNonNull(this.a);
                ajrj ajrj0 = new ajrj(this.a);
                ajsa ajsa0 = new ajsa(v, gred0);
                gree0 = (gree)this.a.b(ajrj0, ajsa0);
            }
            int v1 = iaph.a.r;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx1 = (ghsx)hftp0.b_message;
            ghsx1.b |= 2;
            ghsx1.d = v1;
            ghsx ghsx2 = (ghsx)hftp0.N_build();
            String s1 = this.b.e;
            akdz.c(s, ghsx2, s1);
            if(!hpvv.i()) {
                return gree0;
            }
            String s2 = gree0.c;
            while(true) {
                if(gfta.c(s2)) {
                    return gree0;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghsx0).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghsx ghsx3 = (ghsx)hftp1.b_message;
                ghsx3.c = 2;
                ghsx3.b |= 1;
                hfuo hfuo0 = gred0.e;
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gred0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)gred0));
                grec grec0 = (grec)hftp2;
                if(!grec0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)grec0).ensureMutable();
                }
                gred gred1 = (gred)grec0.b_message;
                s2.getClass();
                gred1.g = s2;
                gred gred2 = (gred)((ProtoLiteBuilder)grec0).N_build();
                String s3 = hfuo0.isEmpty() ? null : ajsq.f(((String)hfuo0.get(0)));
                try {
                    long v2 = hput.b();
                    if(v2 <= 0L) {
                        Objects.requireNonNull(this.a);
                        ajrj ajrj3 = new ajrj(this.a);
                        ajrv ajrv0 = new ajrv(gred2);
                        gree1 = (gree)this.a.b(ajrj3, ajrv0);
                    }
                    else if(hput.f()) {
                        Objects.requireNonNull(this.a);
                        ajsf ajsf1 = new ajsf(this.a);
                        ajrs ajrs0 = new ajrs(v2, gred2);
                        gree1 = (gree)this.a.b(ajsf1, ajrs0);
                    }
                    else {
                        Objects.requireNonNull(this.a);
                        ajrj ajrj2 = new ajrj(this.a);
                        ajrt ajrt0 = new ajrt(v2, gred2);
                        gree1 = (gree)this.a.b(ajrj2, ajrt0);
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ghsx ghsx4 = (ghsx)hftp1.b_message;
                    ghsx4.b |= 2;
                    ghsx4.d = v1;
                    akdz.c(s3, ((ghsx)hftp1.N_build()), s1);
                }
                catch(ajqz ajqz1) {
                    int v3 = ajqz1.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ghsx ghsx5 = (ghsx)hftp1.b_message;
                    ghsx5.b |= 2;
                    ghsx5.d = v3;
                    akdz.c(s3, ((ghsx)hftp1.N_build()), this.b.e);
                    throw ajqz1;
                }
                s2 = gree1.c;
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gree0).jf(5, null);
                hftp3.X(((ProtoLiteMessage)gree0));
                hfuo hfuo1 = gree1.b;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gree gree2 = (gree)hftp3.b_message;
                hfuo hfuo2 = gree2.b;
                if(!hfuo2.c()) {
                    gree2.b = ProtoLiteMessage.E(hfuo2);
                }
                hfrj.E(hfuo1, gree2.b);
                String s4 = gree1.c;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gree gree3 = (gree)hftp3.b_message;
                s4.getClass();
                gree3.c = s4;
                gree0 = (gree)hftp3.N_build();
            }
        }
        catch(ajqz ajqz0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx6 = (ghsx)hftp0.b_message;
            ghsx6.b |= 2;
            ghsx6.d = ajqz0.a;
            akdz.c(s, ((ghsx)hftp0.N_build()), this.b.e);
            throw ajqz0;
        }
    }

    public final grff d(grdt grdt0) {
        grff grff0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghsx)hftp0.b_message).c = 1;
        ((ghsx)hftp0.b_message).b |= 1;
        try {
            akbo akbo0 = this.b;
            ProtoLiteBuilder hftp1 = akbo0.g;
            ProtoLiteMessage hftv0 = hftp1.b_message;
            int v = ((ghth)hftv0).k + 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghth ghth0 = (ghth)hftp1.b_message;
            ghth0.b |= 0x100;
            ghth0.j = v;
            long v1 = hput.b();
            if(v1 <= 0L) {
                Objects.requireNonNull(this.a);
                ajrj ajrj1 = new ajrj(this.a);
                ajsl ajsl0 = new ajsl(grdt0);
                grff0 = (grff)this.a.b(ajrj1, ajsl0);
            }
            else if(hput.f()) {
                Objects.requireNonNull(this.a);
                ajsf ajsf0 = new ajsf(this.a);
                ajsj ajsj0 = new ajsj(v1, grdt0);
                grff0 = (grff)this.a.b(ajsf0, ajsj0);
            }
            else {
                Objects.requireNonNull(this.a);
                ajrj ajrj0 = new ajrj(this.a);
                ajsk ajsk0 = new ajsk(v1, grdt0);
                grff0 = (grff)this.a.b(ajrj0, ajsk0);
            }
            int v2 = iaph.a.r;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx0 = (ghsx)hftp0.b_message;
            ghsx0.b |= 2;
            ghsx0.d = v2;
            akdz.c(null, ((ghsx)hftp0.N_build()), akbo0.e);
            return grff0;
        }
        catch(ajqz ajqz0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx1 = (ghsx)hftp0.b_message;
            ghsx1.b |= 2;
            ghsx1.d = ajqz0.a;
            akdz.c(null, ((ghsx)hftp0.N_build()), this.b.e);
            throw ajqz0;
        }
    }

    public final grfp e(grfo grfo0) {
        grfp grfp0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghsx)hftp0.b_message).c = 12;
        ((ghsx)hftp0.b_message).b |= 1;
        try {
            long v = hput.b();
            if(v <= 0L) {
                Objects.requireNonNull(this.a);
                ajrj ajrj1 = new ajrj(this.a);
                ajso ajso0 = new ajso(grfo0);
                grfp0 = (grfp)this.a.b(ajrj1, ajso0);
            }
            else if(hput.f()) {
                Objects.requireNonNull(this.a);
                ajsf ajsf0 = new ajsf(this.a);
                ajsm ajsm0 = new ajsm(v, grfo0);
                grfp0 = (grfp)this.a.b(ajsf0, ajsm0);
            }
            else {
                Objects.requireNonNull(this.a);
                ajrj ajrj0 = new ajrj(this.a);
                ajsn ajsn0 = new ajsn(v, grfo0);
                grfp0 = (grfp)this.a.b(ajrj0, ajsn0);
            }
            int v1 = iaph.a.r;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx0 = (ghsx)hftp0.b_message;
            ghsx0.b |= 2;
            ghsx0.d = v1;
            akdz.c("general", ((ghsx)hftp0.N_build()), this.b.e);
            return grfp0;
        }
        catch(ajqz ajqz0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx1 = (ghsx)hftp0.b_message;
            ghsx1.b |= 2;
            ghsx1.d = ajqz0.a;
            akdz.c("general", ((ghsx)hftp0.N_build()), this.b.e);
            throw ajqz0;
        }
    }

    public static final String f(String s) {
        return s.substring(25);
    }
}

