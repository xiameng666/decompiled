public final class grcn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grcn a;
    public ByteString b;
    public int c;
    public ByteString d;
    public int e;
    private static volatile Parser f;

    static {
        grcn grcn0 = new grcn();
        grcn.a = grcn0;
        ProtoLiteMessage.L(grcn.class, ((ProtoLiteMessage)grcn0));
    }

    private grcn() {
        this.b = ByteString.b;
        this.d = ByteString.b;
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
                    return new hfvw(((MessageLite)grcn.a), "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u000B\u0003\n\u0004\f", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new grcn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grcn.a));
                }
                case 5: {
                    return grcn.a;
                }
                case 6: {
                    Object object1 = grcn.f;
                    if(object1 == null) {
                        Class class0 = grcn.class;
                        synchronized(class0) {
                            hfvs0 = grcn.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grcn.a));
                                grcn.f = hfvs0;
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

