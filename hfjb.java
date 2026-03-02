public final class hfjb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfjb a;
    public long b;
    private static volatile Parser c;

    static {
        hfjb hfjb0 = new hfjb();
        hfjb.a = hfjb0;
        ProtoLiteMessage.L(hfjb.class, ((ProtoLiteMessage)hfjb0));
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
                    return new hfvw(((MessageLite)hfjb.a), "\u0004\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u0002", new Object[]{"b"});
                }
                case 3: {
                    return new hfjb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfjb.a));
                }
                case 5: {
                    return hfjb.a;
                }
                case 6: {
                    Object object1 = hfjb.c;
                    if(object1 == null) {
                        Class class0 = hfjb.class;
                        synchronized(class0) {
                            hfvs0 = hfjb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfjb.a));
                                hfjb.c = hfvs0;
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

