public final class grhd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grhd a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        grhd grhd0 = new grhd();
        grhd.a = grhd0;
        ProtoLiteMessage.L(grhd.class, ((ProtoLiteMessage)grhd0));
    }

    private grhd() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)grhd.a), "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", grhc.class, grgw.class, grgy.class});
                }
                case 3: {
                    return new grhd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grhd.a));
                }
                case 5: {
                    return grhd.a;
                }
                case 6: {
                    Object object1 = grhd.d;
                    if(object1 == null) {
                        Class class0 = grhd.class;
                        synchronized(class0) {
                            hfvs0 = grhd.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grhd.a));
                                grhd.d = hfvs0;
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

