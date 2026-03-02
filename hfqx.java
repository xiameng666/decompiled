public final class hfqx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfqx a;
    public hfuf b;
    private static volatile Parser c;

    static {
        hfqx hfqx0 = new hfqx();
        hfqx.a = hfqx0;
        ProtoLiteMessage.L(hfqx.class, ((ProtoLiteMessage)hfqx0));
    }

    private hfqx() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)hfqx.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"b"});
                }
                case 3: {
                    return new hfqx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfqx.a));
                }
                case 5: {
                    return hfqx.a;
                }
                case 6: {
                    Object object1 = hfqx.c;
                    if(object1 == null) {
                        Class class0 = hfqx.class;
                        synchronized(class0) {
                            hfvs0 = hfqx.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfqx.a));
                                hfqx.c = hfvs0;
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

