public final class gtal extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtal a;
    public ByteString b;
    public ByteString c;
    public int d;
    private static volatile Parser e;

    static {
        gtal gtal0 = new gtal();
        gtal.a = gtal0;
        ProtoLiteMessage.L(gtal.class, ((ProtoLiteMessage)gtal0));
    }

    private gtal() {
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
                    return new hfvw(((MessageLite)gtal.a), "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new gtal();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtal.a));
                }
                case 5: {
                    return gtal.a;
                }
                case 6: {
                    Object object1 = gtal.e;
                    if(object1 == null) {
                        Class class0 = gtal.class;
                        synchronized(class0) {
                            hfvs0 = gtal.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtal.a));
                                gtal.e = hfvs0;
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

