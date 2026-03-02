public final class gxph extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxph a;
    public long b;
    public int c;
    private static volatile Parser d;

    static {
        gxph gxph0 = new gxph();
        gxph.a = gxph0;
        ProtoLiteMessage.L(gxph.class, ((ProtoLiteMessage)gxph0));
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
                    return new hfvw(((MessageLite)gxph.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gxph();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxph.a));
                }
                case 5: {
                    return gxph.a;
                }
                case 6: {
                    Object object1 = gxph.d;
                    if(object1 == null) {
                        Class class0 = gxph.class;
                        synchronized(class0) {
                            hfvs0 = gxph.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxph.a));
                                gxph.d = hfvs0;
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

