public final class gxzk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxzk a;
    public ByteString b;
    private static volatile Parser c;

    static {
        gxzk gxzk0 = new gxzk();
        gxzk.a = gxzk0;
        ProtoLiteMessage.L(gxzk.class, ((ProtoLiteMessage)gxzk0));
    }

    private gxzk() {
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
                    return new hfvw(((MessageLite)gxzk.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new gxzk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxzk.a));
                }
                case 5: {
                    return gxzk.a;
                }
                case 6: {
                    Object object1 = gxzk.c;
                    if(object1 == null) {
                        Class class0 = gxzk.class;
                        synchronized(class0) {
                            hfvs0 = gxzk.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxzk.a));
                                gxzk.c = hfvs0;
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

