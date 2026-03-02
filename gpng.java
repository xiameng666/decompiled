import java.nio.charset.Charset;

public final class gpng {
    public static final glcx a;
    public static final Charset b;
    private final gpnj c;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((glcx)hftv0).b |= 1;
        ((glcx)hftv0).c = 0L;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        glcx.c(((glcx)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glcx.b(((glcx)hftp0.b_message));
        gpng.a = (glcx)hftp0.N_build();
        gpng.b = Charset.forName("UTF-8");
        gpnf.a().a();
    }

    public gpng(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gpnk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gpnk)hftv0).b |= 1;
        ((gpnk)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gpnk gpnk0 = (gpnk)hftp0.b_message;
        gpnk0.b |= 2;
        gpnk0.d = "25.34.34 (190400-{{cl}})";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gpnj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gpnj gpnj0 = (gpnj)hftp1.b_message;
        gpnk gpnk1 = (gpnk)hftp0.N_build();
        gpnk1.getClass();
        gpnj0.c = gpnk1;
        gpnj0.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gpnp.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gpnp)hftp2.b_message).c = 3;
        ((gpnp)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gpnj gpnj1 = (gpnj)hftp1.b_message;
        gpnp gpnp0 = (gpnp)hftp2.N_build();
        gpnp0.getClass();
        gpnj1.d = gpnp0;
        gpnj1.b |= 2;
        this.c = (gpnj)hftp1.N_build();
    }

    public static String a(ggtu ggtu0) {
        ggux ggux0 = ggtu0.d();
        if(ggux0 != null) {
            return ggux0.b;
        }
        Object object0 = ggtu0.e();
        if((object0 instanceof String)) {
            return (String)object0;
        }
        return object0 == null ? "null" : object0.getClass().getName();
    }

    public final ProtoLiteBuilder b(glmy glmy0, gpnf gpnf0, Object[] arr_object) {
        gfsx gfsx0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gpnn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gpnn)hftv0).c = 1;
        ((gpnn)hftv0).b |= 1;
        gpnj gpnj0 = this.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        gpnj0.getClass();
        ((gpnn)hftv1).e = gpnj0;
        ((gpnn)hftv1).b |= 16;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gpnn gpnn0 = (gpnn)hftp0.b_message;
        glmy0.getClass();
        gpnn0.f = glmy0;
        gpnn0.b |= 0x20;
        int v = 0;
        if(gpnf0.a) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gpnm.a).v_newBuilder();
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 == null) {
                    gfsx0 = gfsx.m("null");
                }
                else if((object0 instanceof foqh)) {
                    gfsx0 = gfsx.m(((foqh)object0).b());
                }
                else {
                    gfsx0 = gfqx.a;
                }
                if(gfsx0.i()) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpnm gpnm0 = (gpnm)hftp1.b_message;
                    hfuf hfuf0 = gpnm0.b;
                    if(!hfuf0.c()) {
                        gpnm0.b = ProtoLiteMessage.C(hfuf0);
                    }
                    gpnm0.b.i(v1);
                    Object object1 = gfsx0.d();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpnm gpnm1 = (gpnm)hftp1.b_message;
                    hfuo hfuo0 = gpnm1.c;
                    if(!hfuo0.c()) {
                        gpnm1.c = ProtoLiteMessage.E(hfuo0);
                    }
                    gpnm1.c.add(object1);
                }
            }
            if(((gpnm)hftp1.b_message).b.size() > 0) {
                gpnm gpnm2 = (gpnm)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gpnn gpnn1 = (gpnn)hftp0.b_message;
                gpnm2.getClass();
                gpnn1.i = gpnm2;
                gpnn1.b |= 0x100;
            }
        }
        while(v < arr_object.length) {
            Object object2 = arr_object[v];
            if(object2 != null) {
                if(!(object2 instanceof gpnd)) {
                    gpnh gpnh0 = (gpnh)object2.getClass().getAnnotation(gpnh.class);
                    if(gpnh0 != null && gpnh0.a() != gpnc.e) {
                    label_66:
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gpnr.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gpnr gpnr0 = (gpnr)hftp2.b_message;
                        gpnr0.b |= 1;
                        gpnr0.c = v;
                        String s = object2.toString();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gpnr gpnr1 = (gpnr)hftp2.b_message;
                        s.getClass();
                        gpnr1.b |= 2;
                        gpnr1.d = s;
                        gpnr gpnr2 = (gpnr)hftp2.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gpnn gpnn2 = (gpnn)hftp0.b_message;
                        gpnr2.getClass();
                        hfuo hfuo1 = gpnn2.h;
                        if(!hfuo1.c()) {
                            gpnn2.h = ProtoLiteMessage.E(hfuo1);
                        }
                        gpnn2.h.add(gpnr2);
                    }
                }
                else if(((gpnd)object2).a != gpnc.e) {
                    goto label_66;
                }
            }
            ++v;
        }
        return hftp0;
    }
}

