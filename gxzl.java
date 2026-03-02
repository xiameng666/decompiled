public final class gxzl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxzl a;
    public ByteString b;
    public boolean c;
    private static volatile Parser d;

    static {
        gxzl gxzl0 = new gxzl();
        gxzl.a = gxzl0;
        ProtoLiteMessage.L(gxzl.class, ((ProtoLiteMessage)gxzl0));
    }

    private gxzl() {
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
                    return new hfvw(((MessageLite)gxzl.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gxzl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxzl.a));
                }
                case 5: {
                    return gxzl.a;
                }
                case 6: {
                    Object object1 = gxzl.d;
                    if(object1 == null) {
                        Class class0 = gxzl.class;
                        synchronized(class0) {
                            hfvs0 = gxzl.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxzl.a));
                                gxzl.d = hfvs0;
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

