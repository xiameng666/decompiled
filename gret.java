public final class gret extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gret a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        gret gret0 = new gret();
        gret.a = gret0;
        ProtoLiteMessage.L(gret.class, ((ProtoLiteMessage)gret0));
    }

    private gret() {
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
                    return new hfvw(((MessageLite)gret.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gret();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gret.a));
                }
                case 5: {
                    return gret.a;
                }
                case 6: {
                    Object object1 = gret.d;
                    if(object1 == null) {
                        Class class0 = gret.class;
                        synchronized(class0) {
                            hfvs0 = gret.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gret.a));
                                gret.d = hfvs0;
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

