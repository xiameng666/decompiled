public final class grek extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grek a;
    public ByteString b;
    private static volatile Parser c;

    static {
        grek grek0 = new grek();
        grek.a = grek0;
        ProtoLiteMessage.L(grek.class, ((ProtoLiteMessage)grek0));
    }

    private grek() {
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
                    return new hfvw(((MessageLite)grek.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new grek();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grek.a));
                }
                case 5: {
                    return grek.a;
                }
                case 6: {
                    Object object1 = grek.c;
                    if(object1 == null) {
                        Class class0 = grek.class;
                        synchronized(class0) {
                            hfvs0 = grek.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grek.a));
                                grek.c = hfvs0;
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

