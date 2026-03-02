public final class dpeh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dpeh a;
    public ByteString b;
    private static volatile Parser c;

    static {
        dpeh dpeh0 = new dpeh();
        dpeh.a = dpeh0;
        ProtoLiteMessage.L(dpeh.class, ((ProtoLiteMessage)dpeh0));
    }

    private dpeh() {
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
                    return new hfvw(((MessageLite)dpeh.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new dpeh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dpeh.a));
                }
                case 5: {
                    return dpeh.a;
                }
                case 6: {
                    Object object1 = dpeh.c;
                    if(object1 == null) {
                        Class class0 = dpeh.class;
                        synchronized(class0) {
                            hfvs0 = dpeh.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dpeh.a));
                                dpeh.c = hfvs0;
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

