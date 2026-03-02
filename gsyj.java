public final class gsyj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsyj a;
    public int b;
    private static volatile Parser c;

    static {
        gsyj gsyj0 = new gsyj();
        gsyj.a = gsyj0;
        ProtoLiteMessage.L(gsyj.class, ((ProtoLiteMessage)gsyj0));
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
                    return new hfvw(((MessageLite)gsyj.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new gsyj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsyj.a));
                }
                case 5: {
                    return gsyj.a;
                }
                case 6: {
                    Object object1 = gsyj.c;
                    if(object1 == null) {
                        Class class0 = gsyj.class;
                        synchronized(class0) {
                            hfvs0 = gsyj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsyj.a));
                                gsyj.c = hfvs0;
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

