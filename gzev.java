public final class gzev extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzev a;
    public ByteString b;
    private static volatile Parser c;

    static {
        gzev gzev0 = new gzev();
        gzev.a = gzev0;
        ProtoLiteMessage.L(gzev.class, ((ProtoLiteMessage)gzev0));
    }

    private gzev() {
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
                    return new hfvw(((MessageLite)gzev.a), "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"b"});
                }
                case 3: {
                    return new gzev();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzev.a));
                }
                case 5: {
                    return gzev.a;
                }
                case 6: {
                    Object object1 = gzev.c;
                    if(object1 == null) {
                        Class class0 = gzev.class;
                        synchronized(class0) {
                            hfvs0 = gzev.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzev.a));
                                gzev.c = hfvs0;
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

