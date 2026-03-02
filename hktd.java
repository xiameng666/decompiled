public final class hktd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hktd a;
    public ByteString b;
    public boolean c;
    private static volatile Parser d;

    static {
        hktd hktd0 = new hktd();
        hktd.a = hktd0;
        ProtoLiteMessage.L(hktd.class, ((ProtoLiteMessage)hktd0));
    }

    private hktd() {
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
                    return new hfvw(((MessageLite)hktd.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hktd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hktd.a));
                }
                case 5: {
                    return hktd.a;
                }
                case 6: {
                    Object object1 = hktd.d;
                    if(object1 == null) {
                        Class class0 = hktd.class;
                        synchronized(class0) {
                            hfvs0 = hktd.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hktd.a));
                                hktd.d = hfvs0;
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

