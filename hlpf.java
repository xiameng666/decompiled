public final class hlpf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlpf a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hlpf hlpf0 = new hlpf();
        hlpf.a = hlpf0;
        ProtoLiteMessage.L(hlpf.class, ((ProtoLiteMessage)hlpf0));
    }

    private hlpf() {
        this.b = hfvv.a;
    }

    public final void b() {
        hfuo hfuo0 = this.b;
        if(!hfuo0.c()) {
            this.b = ProtoLiteMessage.E(hfuo0);
        }
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)hlpf.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hlpe.class});
                }
                case 3: {
                    return new hlpf();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return hlpf.a;
                }
                case 6: {
                    Object object1 = hlpf.c;
                    if(object1 == null) {
                        Class class0 = hlpf.class;
                        synchronized(class0) {
                            hfvs0 = hlpf.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlpf.a));
                                hlpf.c = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

