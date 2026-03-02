public final class aayz {
    public static void a(glim glim0) {
        cfdb.v().j(((ProtoLiteMessage)glim0));
    }

    public static void b(int v, int v1, int v2, int v3) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gldi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gldi)hftv0).f = v - 1;
        ((gldi)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gldi)hftv1).e = v2 - 1;
        ((gldi)hftv1).b |= 4;
        if(v1 == 3) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gldi)hftp0.b_message).c = v3 - 1;
            ((gldi)hftp0.b_message).b |= 1;
        }
        long v4 = System.currentTimeMillis();
        glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gldm)hftv2).b |= 1;
        ((gldm)hftv2).e = v4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gldm)hftp1.b_message).g = v1 - 1;
        ((gldm)hftp1.b_message).b |= 4;
        gldi gldi0 = (gldi)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gldm gldm0 = (gldm)hftp1.b_message;
        gldi0.getClass();
        gldm0.d = gldi0;
        gldm0.c = 4;
        glil0.s(hftp1);
        aayz.a(((glim)((ProtoLiteBuilder)glil0).N_build()));
    }

    public static void c(int v, int v1, int v2) {
        aayz.b(14, v, v1, v2);
    }

    public static void d(int v, int v1, int v2) {
        aayz.b(13, v, v1, v2);
    }

    public static void e(int v) {
        aayz.d(2, v, 1);
    }
}

