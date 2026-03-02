public final class grgw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grgw a;
    public ByteString b;
    private static volatile Parser c;

    static {
        grgw grgw0 = new grgw();
        grgw.a = grgw0;
        ProtoLiteMessage.L(grgw.class, ((ProtoLiteMessage)grgw0));
    }

    private grgw() {
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
                    return new hfvw(((MessageLite)grgw.a), "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"b"});
                }
                case 3: {
                    return new grgw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grgw.a));
                }
                case 5: {
                    return grgw.a;
                }
                case 6: {
                    Object object1 = grgw.c;
                    if(object1 == null) {
                        Class class0 = grgw.class;
                        synchronized(class0) {
                            hfvs0 = grgw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grgw.a));
                                grgw.c = hfvs0;
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

