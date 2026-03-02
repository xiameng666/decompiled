import j..util.DesugarCollections;
import java.util.List;

public final class cpzz implements fkwn {
    public static final gsts a;
    public final gste b;
    private static final List c;
    private static final List d;
    private static final gsru e;

    static {
        cpzz.c = ibpo.g(new String[]{"person.email", "person.name", "person.photo", "person.read_only_profile_info"});
        cpzz.d = ibpo.g(new gsuc[]{gsuc.e, gsuc.c, gsuc.b});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsru.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gsru)hftv0).c = "profile-sync-client";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsru)hftp0.b_message).d = "1";
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        cpzz.e = (gsru)hftv1;
        gstu gstu0 = gstt.a(((ProtoLiteMessage)gsts.a).v_newBuilder());
        ibuq.f(((gsru)hftv1), "value");
        ProtoLiteBuilder hftp1 = gstu0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gsts gsts0 = (gsts)hftp1.b_message;
        ((gsru)hftv1).getClass();
        gsts0.c = (gsru)hftv1;
        gsts0.b |= 1;
        cpzz.a = gstu0.a();
    }

    public cpzz(gste gste0, cqao cqao0) {
        ibuq.f(cqao0, "internalFlags");
        super();
        this.b = gste0;
    }

    public static final gssr a() {
        gssr gssr0 = hvev.a.b().c();
        gssr gssr1 = gssr.a;
        if(!ibuq.m(gssr0, gssr1)) {
            return gssr0;
        }
        gsst gsst0 = gsss.a(((gssq)((ProtoLiteMessage)gssr1).v_newBuilder()));
        gsua gsua0 = (gsua)((ProtoLiteMessage)gsub.b).v_newBuilder();
        ibuq.f(gsua0, "builder");
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        ibuq.f(hftf0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((hftg)hftf0.b_message).b);
        ibuq.e(list0, "getPathsList(...)");
        new hfxu(list0);
        ibuq.f(cpzz.c, "values");
        hftf0.a(cpzz.c);
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftf0).N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hftg)hftv0), "value");
        if(!gsua0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsua0).ensureMutable();
        }
        gsub gsub0 = (gsub)gsua0.b_message;
        ((hftg)hftv0).getClass();
        gsub0.d = (hftg)hftv0;
        gsub0.c |= 1;
        new hfxu(new hfuh(gsub0.e, gsub.a));
        List list1 = cpzz.d;
        ibuq.f(list1, "values");
        if(!gsua0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsua0).ensureMutable();
        }
        gsub gsub1 = (gsub)gsua0.b_message;
        gsub1.b();
        for(Object object0: list1) {
            gsub1.e.i(((gsuc)object0).a());
        }
        ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)gsua0).N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gsub)hftv1), "value");
        gssq gssq0 = gsst0.a;
        if(!gssq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gssq0).ensureMutable();
        }
        gssr gssr2 = (gssr)gssq0.b_message;
        ((gsub)hftv1).getClass();
        gssr2.d = (gsub)hftv1;
        gssr2.b |= 2;
        gsst0.b(cpzz.a);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hinb.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hima.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        hilz hilz0 = hilz.c;
        ibuq.f(hilz0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hima)hftp1.b_message).c = hilz0.e;
        ((hima)hftp1.b_message).b |= 1;
        ProtoLiteMessage hftv2 = hftp1.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((hima)hftv2), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hinb hinb0 = (hinb)hftp0.b_message;
        ((hima)hftv2).getClass();
        hinb0.c = (hima)hftv2;
        hinb0.b |= 2;
        ProtoLiteMessage hftv3 = hftp0.N_build();
        ibuq.e(hftv3, "build(...)");
        ibuq.f(((hinb)hftv3), "value");
        if(!gssq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gssq0).ensureMutable();
        }
        gssr gssr3 = (gssr)gssq0.b_message;
        ((hinb)hftv3).getClass();
        gssr3.i = (hinb)hftv3;
        gssr3.b |= 0x40;
        return gsst0.a();
    }
}

