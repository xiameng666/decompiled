public final class gqlk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqlk a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gqlk gqlk0 = new gqlk();
        gqlk.a = gqlk0;
        ProtoLiteMessage.L(gqlk.class, ((ProtoLiteMessage)gqlk0));
    }

    private gqlk() {
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
                    return new hfvw(((MessageLite)gqlk.a), "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", gqks.class});
                }
                case 3: {
                    return new gqlk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqlk.a));
                }
                case 5: {
                    return gqlk.a;
                }
                case 6: {
                    Object object1 = gqlk.d;
                    if(object1 == null) {
                        Class class0 = gqlk.class;
                        synchronized(class0) {
                            hfvs0 = gqlk.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqlk.a));
                                gqlk.d = hfvs0;
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

