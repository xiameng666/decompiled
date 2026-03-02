public final class bctf {
    public static final bcth a(xpa xpa0, ProtoLiteBuilder hftp0) {
        if((((heym)hftp0.b_message).b & 2) == 0) {
            xxe.G();
            hevj hevj0 = bctr.g(System.currentTimeMillis());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            heym heym0 = (heym)hftp0.b_message;
            hevj0.getClass();
            heym0.d = hevj0;
            heym0.b |= 2;
        }
        return new bcth(xpa0, ((heym)hftp0.N_build()));
    }

    public static final void b(byte[] arr_b, ProtoLiteBuilder hftp0) {
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        heym heym0 = (heym)hftp0.b_message;
        heym0.b |= 4;
        heym0.e = hfsf0;
    }

    public static final void c(bctr bctr0, ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((heym)hftp0.b_message).d = bctr0.a;
        ((heym)hftp0.b_message).b |= 2;
    }

    public static final void d(bctl bctl0, ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((heym)hftp0.b_message).f = bctl0.a;
        ((heym)hftp0.b_message).b |= 8;
    }
}

