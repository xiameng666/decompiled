public final class hfsg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfsg a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hfsg hfsg0 = new hfsg();
        hfsg.a = hfsg0;
        ProtoLiteMessage.L(hfsg.class, ((ProtoLiteMessage)hfsg0));
    }

    private hfsg() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)hfsg.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new hfsg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfsg.a));
                }
                case 5: {
                    return hfsg.a;
                }
                case 6: {
                    Object object1 = hfsg.c;
                    if(object1 == null) {
                        Class class0 = hfsg.class;
                        synchronized(class0) {
                            hfvs0 = hfsg.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfsg.a));
                                hfsg.c = hfvs0;
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

