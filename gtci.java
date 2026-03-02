public final class gtci extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtci a;
    public ByteString b;
    public ByteString c;
    private static volatile Parser d;

    static {
        gtci gtci0 = new gtci();
        gtci.a = gtci0;
        ProtoLiteMessage.L(gtci.class, ((ProtoLiteMessage)gtci0));
    }

    private gtci() {
        this.b = ByteString.b;
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)gtci.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gtci();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtci.a));
                }
                case 5: {
                    return gtci.a;
                }
                case 6: {
                    Object object1 = gtci.d;
                    if(object1 == null) {
                        Class class0 = gtci.class;
                        synchronized(class0) {
                            hfvs0 = gtci.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtci.a));
                                gtci.d = hfvs0;
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

