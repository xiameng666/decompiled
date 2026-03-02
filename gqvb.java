public final class gqvb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqvb a;
    public ByteString b;
    public ByteString c;
    public ByteString d;
    private static volatile Parser e;

    static {
        gqvb gqvb0 = new gqvb();
        gqvb.a = gqvb0;
        ProtoLiteMessage.L(gqvb.class, ((ProtoLiteMessage)gqvb0));
    }

    private gqvb() {
        this.b = ByteString.b;
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)gqvb.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new gqvb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqvb.a));
                }
                case 5: {
                    return gqvb.a;
                }
                case 6: {
                    Object object1 = gqvb.e;
                    if(object1 == null) {
                        Class class0 = gqvb.class;
                        synchronized(class0) {
                            hfvs0 = gqvb.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqvb.a));
                                gqvb.e = hfvs0;
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

