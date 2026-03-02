public final class envj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        emis emis0 = (emis)((ProtoLiteMessage)emit.a).v_newBuilder();
        int v = ((emit)object0).o;
        if(!emis0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)emis0).ensureMutable();
        }
        emit emit0 = (emit)emis0.b_message;
        emit0.b |= 0x400;
        emit0.o = v;
        return (emit)((ProtoLiteBuilder)emis0).N_build();
    }
}

