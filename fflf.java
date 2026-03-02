import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.LogEventRequest;
import j..util.Objects;

final class fflf extends ffee {
    final LogEventRequest c;
    final fdiy d;
    final fflv e;

    public fflf(fflv fflv0, LogEventRequest logEventRequest0, fdiy fdiy0) {
        this.c = logEventRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("logEvent");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdox fdox0 = this.e.D;
            batl.s(fdox0);
            hftc hftc0 = hftc.a();
            gild gild0 = gild.a;
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gild0), this.c.a, 0, this.c.a.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            icyj icyj0 = new icyj();
            ayvm ayvm0 = fhbe.b(fdox0.a, icyj0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
            bbed bbed0 = bbed.ff;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bbdv bbdv0 = (bbdv)hftp0.b_message;
            bbdv0.b = bbed0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((bbdv)hftv1).c = 1;
            bbdz bbdz0 = bbdz.c;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            bbdv bbdv1 = (bbdv)hftp0.b_message;
            bbdv1.d = bbdz0.a();
            bbdv bbdv2 = (bbdv)hftp0.N_build();
            if(fdox0.d.b()) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gilc.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gilc gilc0 = (gilc)hftp1.b_message;
                gilc0.b |= 2;
                gilc0.c = true;
                gilc gilc1 = (gilc)hftp1.N_build();
                hftr hftr0 = (hftr)((ProtoLiteMessage)gild0).w(((ProtoLiteMessage)(((gild)hftv0))));
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                gild gild1 = (gild)hftr0.b_message;
                gilc1.getClass();
                gild1.j = gilc1;
                gild1.d |= 4;
                gild gild2 = (gild)((ProtoLiteBuilder)hftr0).N_build();
                ayuc ayuc0 = fdox0.b.j(((MessageLite)gild2), ayvm0);
                ayuc0.l = bbdv2;
                ayuc0.d();
            }
            Status status0 = new Status(0);
            this.d.a(status0);
        }
        catch(hfur unused_ex) {
            Status status1 = new Status(13);
            this.d.a(status1);
        }
    }
}

