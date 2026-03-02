public final class gqhi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqhi a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gqhi gqhi0 = new gqhi();
        gqhi.a = gqhi0;
        ProtoLiteMessage.L(gqhi.class, ((ProtoLiteMessage)gqhi0));
    }

    private gqhi() {
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
                    return new hfvw(((MessageLite)gqhi.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", gqhw.class, gqhx.class});
                }
                case 3: {
                    return new gqhi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqhi.a));
                }
                case 5: {
                    return gqhi.a;
                }
                case 6: {
                    Object object1 = gqhi.d;
                    if(object1 == null) {
                        Class class0 = gqhi.class;
                        synchronized(class0) {
                            hfvs0 = gqhi.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqhi.a));
                                gqhi.d = hfvs0;
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

