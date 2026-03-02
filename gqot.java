public final class gqot extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqot a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gqot gqot0 = new gqot();
        gqot.a = gqot0;
        ProtoLiteMessage.L(gqot.class, ((ProtoLiteMessage)gqot0));
    }

    private gqot() {
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
                    return new hfvw(((MessageLite)gqot.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000", new Object[]{"c", "b"});
                }
                case 3: {
                    return new gqot();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqot.a));
                }
                case 5: {
                    return gqot.a;
                }
                case 6: {
                    Object object1 = gqot.d;
                    if(object1 == null) {
                        Class class0 = gqot.class;
                        synchronized(class0) {
                            hfvs0 = gqot.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqot.a));
                                gqot.d = hfvs0;
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

