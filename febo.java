public final class febo implements Runnable {
    public final febq a;

    public febo(febq febq0) {
        this.a = febq0;
    }

    @Override
    public final void run() {
        febr febr0 = this.a.c;
        gged_interceptors gged0 = febr0.c.a();
        fewx fewx0 = (fewx)((ProtoLiteMessage)fewy.a).v_newBuilder();
        if(!fewx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fewx0).ensureMutable();
        }
        ((fewy)fewx0.b_message).c = 2;
        ((fewy)fewx0.b_message).b |= 1;
        fewx0.a(gged0);
        febr0.e(((fewy)((ProtoLiteBuilder)fewx0).N_build()), false);
    }
}

