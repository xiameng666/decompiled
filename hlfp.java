public final class hlfp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlfp a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hlfp hlfp0 = new hlfp();
        hlfp.a = hlfp0;
        ProtoLiteMessage.L(hlfp.class, ((ProtoLiteMessage)hlfp0));
    }

    private hlfp() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hlfp.a), "\u0001\u0004\u0001\u0000\u0002\u0006\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004;\u0000\u0006;\u0000", new Object[]{"c", "b", hlfo.class, hlfo.class});
                }
                case 3: {
                    return new hlfp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlfp.a));
                }
                case 5: {
                    return hlfp.a;
                }
                case 6: {
                    Object object1 = hlfp.d;
                    if(object1 == null) {
                        Class class0 = hlfp.class;
                        synchronized(class0) {
                            hfvs0 = hlfp.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlfp.a));
                                hlfp.d = hfvs0;
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

