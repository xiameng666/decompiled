import android.net.Uri;

public final class fkyc implements ibts {
    public final fkvu a;
    public final gssv b;
    public final fkys c;

    public fkyc(fkvu fkvu0, gssv gssv0, fkys fkys0) {
        this.a = fkvu0;
        this.b = gssv0;
        this.c = fkys0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        fizl fizl3;
        ibuq.f(((Boolean)object0), "shouldDownload");
        if(!((Boolean)object0).booleanValue()) {
            return gmbu.i((this.a.d == null ? fkvt.a : this.a.d));
        }
        gdmz gdmz0 = fkzi.a(this.b);
        if(gdmz0 == null) {
            return gmbu.i(fkvt.a);
        }
        String s = gdmz0.f;
        Uri uri0 = Uri.parse(gdmz0.d);
        fkwk fkwk0 = this.c.c;
        try {
            fizj fizj0 = (fizj)((ProtoLiteMessage)fizl.a).v_newBuilder();
            if(!fizj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fizj0).ensureMutable();
            }
            fizl fizl0 = (fizl)fizj0.b_message;
            fizl0.b |= 1;
            fizl0.c = "photos_filegroup_" + s;
            fizi fizi0 = fizi.a;
            hftr hftr0 = (hftr)((ProtoLiteMessage)fizi0).v_newBuilder();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            fizi fizi1 = (fizi)hftr0.b_message;
            fizi1.b |= 1;
            fizi1.c = "tiny-photo-id";
            String s1 = fkwk0.c(uri0, 0);
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            fizi fizi2 = (fizi)hftr0.b_message;
            s1.getClass();
            fizi2.b |= 2;
            fizi2.d = s1;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            fizi.b(((fizi)hftr0.b_message));
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            ((fizi)hftr0.b_message).f = 1;
            ((fizi)hftr0.b_message).b |= 8;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            fizi fizi3 = (fizi)hftr0.b_message;
            fizi3.b |= 16;
            fizi3.g = "";
            fizj0.a(hftr0);
            hftr hftr1 = (hftr)((ProtoLiteMessage)fizi0).v_newBuilder();
            if(!hftr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr1).ensureMutable();
            }
            fizi fizi4 = (fizi)hftr1.b_message;
            fizi4.b |= 1;
            fizi4.c = "small-photo-id";
            String s2 = fkwk0.c(uri0, 1);
            if(!hftr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr1).ensureMutable();
            }
            fizi fizi5 = (fizi)hftr1.b_message;
            s2.getClass();
            fizi5.b |= 2;
            fizi5.d = s2;
            if(!hftr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr1).ensureMutable();
            }
            fizi.b(((fizi)hftr1.b_message));
            if(!hftr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr1).ensureMutable();
            }
            ((fizi)hftr1.b_message).f = 1;
            ((fizi)hftr1.b_message).b |= 8;
            if(!hftr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr1).ensureMutable();
            }
            fizi fizi6 = (fizi)hftr1.b_message;
            fizi6.b |= 16;
            fizi6.g = "";
            fizj0.a(hftr1);
            hftr hftr2 = (hftr)((ProtoLiteMessage)fizi0).v_newBuilder();
            if(!hftr2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr2).ensureMutable();
            }
            fizi fizi7 = (fizi)hftr2.b_message;
            fizi7.b |= 1;
            fizi7.c = "medium-photo-id";
            String s3 = fkwk0.c(uri0, 2);
            if(!hftr2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr2).ensureMutable();
            }
            fizi fizi8 = (fizi)hftr2.b_message;
            s3.getClass();
            fizi8.b |= 2;
            fizi8.d = s3;
            if(!hftr2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr2).ensureMutable();
            }
            fizi.b(((fizi)hftr2.b_message));
            if(!hftr2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr2).ensureMutable();
            }
            ((fizi)hftr2.b_message).f = 1;
            ((fizi)hftr2.b_message).b |= 8;
            if(!hftr2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr2).ensureMutable();
            }
            fizi fizi9 = (fizi)hftr2.b_message;
            fizi9.b |= 16;
            fizi9.g = "";
            fizj0.a(hftr2);
            hftr hftr3 = (hftr)((ProtoLiteMessage)fizi0).v_newBuilder();
            if(!hftr3.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr3).ensureMutable();
            }
            fizi fizi10 = (fizi)hftr3.b_message;
            fizi10.b |= 1;
            fizi10.c = "large-photo-id";
            String s4 = fkwk0.c(uri0, 3);
            if(!hftr3.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr3).ensureMutable();
            }
            fizi fizi11 = (fizi)hftr3.b_message;
            s4.getClass();
            fizi11.b |= 2;
            fizi11.d = s4;
            if(!hftr3.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr3).ensureMutable();
            }
            fizi.b(((fizi)hftr3.b_message));
            if(!hftr3.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr3).ensureMutable();
            }
            ((fizi)hftr3.b_message).f = 1;
            ((fizi)hftr3.b_message).b |= 8;
            if(!hftr3.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr3).ensureMutable();
            }
            fizi fizi12 = (fizi)hftr3.b_message;
            fizi12.b |= 16;
            fizi12.g = "";
            fizj0.a(hftr3);
            hftr hftr4 = (hftr)((ProtoLiteMessage)fizi0).v_newBuilder();
            if(!hftr4.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr4).ensureMutable();
            }
            fizi fizi13 = (fizi)hftr4.b_message;
            fizi13.b |= 1;
            fizi13.c = "thumbnail-photo-id";
            String s5 = fkwk0.c(uri0, 4);
            if(!hftr4.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr4).ensureMutable();
            }
            fizi fizi14 = (fizi)hftr4.b_message;
            s5.getClass();
            fizi14.b |= 2;
            fizi14.d = s5;
            if(!hftr4.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr4).ensureMutable();
            }
            fizi.b(((fizi)hftr4.b_message));
            if(!hftr4.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr4).ensureMutable();
            }
            ((fizi)hftr4.b_message).f = 1;
            ((fizi)hftr4.b_message).b |= 8;
            if(!hftr4.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr4).ensureMutable();
            }
            fizi fizi15 = (fizi)hftr4.b_message;
            fizi15.b |= 16;
            fizi15.g = "";
            fizj0.a(hftr4);
            hftr hftr5 = (hftr)((ProtoLiteMessage)fizi0).v_newBuilder();
            if(!hftr5.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr5).ensureMutable();
            }
            fizi fizi16 = (fizi)hftr5.b_message;
            fizi16.b |= 1;
            fizi16.c = "x-large-photo-id";
            String s6 = fkwk0.c(uri0, 5);
            if(!hftr5.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr5).ensureMutable();
            }
            fizi fizi17 = (fizi)hftr5.b_message;
            s6.getClass();
            fizi17.b |= 2;
            fizi17.d = s6;
            if(!hftr5.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr5).ensureMutable();
            }
            fizi.b(((fizi)hftr5.b_message));
            if(!hftr5.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr5).ensureMutable();
            }
            ((fizi)hftr5.b_message).f = 1;
            ((fizi)hftr5.b_message).b |= 8;
            if(!hftr5.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr5).ensureMutable();
            }
            fizi fizi18 = (fizi)hftr5.b_message;
            fizi18.b |= 16;
            fizi18.g = "";
            fizj0.a(hftr5);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hfrn)hftp0.b_message).b = "type.googleapis.com/gmscore.facets.datacollection.DataCollectionIdentifier";
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
            bbed bbed0 = bbed.dq;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            bbdv bbdv0 = (bbdv)hftp1.b_message;
            bbdv0.b = bbed0.a();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((bbdv)hftp1.b_message).c = 5;
            ByteString hfsf0 = ((bbdv)hftp1.N_build()).getDefaultInstanceForType();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hfrn)hftp0.b_message).c = hfsf0;
            if(!fizj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fizj0).ensureMutable();
            }
            fizl fizl1 = (fizl)fizj0.b_message;
            hfrn hfrn0 = (hfrn)hftp0.N_build();
            hfrn0.getClass();
            fizl1.h = hfrn0;
            fizl1.b |= 0x20;
            if(!fizj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fizj0).ensureMutable();
            }
            fizl fizl2 = (fizl)fizj0.b_message;
            fizl2.b |= 0x2000;
            fizl2.n = 0x5601;
            fizl3 = (fizl)((ProtoLiteBuilder)fizj0).N_build();
        }
        catch(fhsm fhsm0) {
            return gmbu.h(fhsm0);
        }
        fiyr fiyr0 = new fiyr(null);
        fiyr0.b(gfsx.m(fkwk0.a));
        fiyr0.c(fizl3);
        fiys fiys0 = fiyr0.a();
        return gdta.g(fkwk0.b.a(fiys0)).i(new fkwf(fkwk0, s), gmap.a).h(new fkwg(), gmap.a);
    }
}

