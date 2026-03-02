public final class hfmf {
    public static final hfoa a;
    public static final hfoa b;
    public static final hfoa c;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfoa.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfoa hfoa0 = (hfoa)hftp0.b_message;
        hfoa0.b |= 1;
        hfoa0.c = "dma52_data_sharing_v4";
        hfoa hfoa1 = (hfoa)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfoa.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfoa hfoa2 = (hfoa)hftp1.b_message;
        hfoa2.b |= 1;
        hfoa2.c = "dma52_data_sharing_v4_prod";
        hfmf.a = (hfoa)hftp1.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfoa.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hfoa hfoa3 = (hfoa)hftp2.b_message;
        hfoa3.b |= 1;
        hfoa3.c = "dma52_data_sharing_v5";
        hfmf.b = (hfoa)hftp2.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfoa.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hfoa hfoa4 = (hfoa)hftp3.b_message;
        hfoa4.b |= 1;
        hfoa4.c = "dma52_data_sharing_v6";
        hfmf.c = (hfoa)hftp3.N_build();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfoa.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hfoa hfoa5 = (hfoa)hftp4.b_message;
        hfoa5.b |= 1;
        hfoa5.c = "workspace_processing_user_consent";
        hfoa hfoa6 = (hfoa)hftp4.N_build();
    }
}

