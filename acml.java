public final class acml {
    public static void a(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gldk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gldk)hftp0.b_message).c = 1;
        ((gldk)hftp0.b_message).b |= 1;
        acml.c(v, 3, ((gldk)hftp0.N_build()));
    }

    public static void b(glim glim0) {
        cfdb.v().j(((ProtoLiteMessage)glim0));
    }

    public static void c(long v, int v1, gldk gldk0) {
        glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gldm)hftv0).b |= 1;
        ((gldm)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gldm)hftv1).g = v1 - 1;
        ((gldm)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gldm gldm0 = (gldm)hftp0.b_message;
        gldk0.getClass();
        gldm0.d = gldk0;
        gldm0.c = 7;
        glil0.a(((gldm)hftp0.N_build()));
        acml.b(((glim)((ProtoLiteBuilder)glil0).N_build()));
    }
}

