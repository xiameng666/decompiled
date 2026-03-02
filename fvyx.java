public final class fvyx {
    public gkri a;
    public gkrk b;

    public fvyx() {
        this.a = gkri.a;
        this.b = gkrk.a;
    }

    public final void a(ProtoLiteBuilder hftp0) {
        cgbz cgbz0 = cgbz.v();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
        gixx gixx0 = gixx.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gixy)hftp1.b_message).d = gixx0.H;
        ((gixy)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gksb.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gksb)hftp2.b_message).g = 13;
        ((gksb)hftp2.b_message).b |= 16;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkrz.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gkrn.a).v_newBuilder();
        gkrc gkrc0 = (gkrc)((ProtoLiteMessage)gkrd.a).v_newBuilder();
        gkrm gkrm0 = gkrm.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkro)hftp0.b_message).d = gkrm0.e;
        ((gkro)hftp0.b_message).b |= 4;
        gkrk gkrk0 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkro)hftp0.b_message).e = gkrk0.g;
        ((gkro)hftp0.b_message).b |= 8;
        gkri gkri0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkro)hftp0.b_message).f = gkri0.f;
        ((gkro)hftp0.b_message).b |= 16;
        gkrc0.a(((gkro)hftp0.N_build()));
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gkrn gkrn0 = (gkrn)hftp4.b_message;
        gkrd gkrd0 = (gkrd)((ProtoLiteBuilder)gkrc0).N_build();
        gkrd0.getClass();
        gkrn0.i = gkrd0;
        gkrn0.b |= 0x20;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gkrz gkrz0 = (gkrz)hftp3.b_message;
        gkrn gkrn1 = (gkrn)hftp4.N_build();
        gkrn1.getClass();
        gkrz0.c = gkrn1;
        gkrz0.b |= 0x800;
        gkrz gkrz1 = (gkrz)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gksb gksb0 = (gksb)hftp2.b_message;
        gkrz1.getClass();
        gksb0.c = gkrz1;
        gksb0.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp1.b_message;
        gksb gksb1 = (gksb)hftp2.N_build();
        gksb1.getClass();
        gixy0.i = gksb1;
        gixy0.b |= 0x20;
        cgbz0.j(((ProtoLiteMessage)(((gixy)hftp1.N_build()))));
    }
}

