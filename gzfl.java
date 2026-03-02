public final class gzfl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzfl a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        gzfl gzfl0 = new gzfl();
        gzfl.a = gzfl0;
        ProtoLiteMessage.L(gzfl.class, ((ProtoLiteMessage)gzfl0));
    }

    private gzfl() {
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
                    return new hfvw(((MessageLite)gzfl.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gzfl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzfl.a));
                }
                case 5: {
                    return gzfl.a;
                }
                case 6: {
                    Object object1 = gzfl.d;
                    if(object1 == null) {
                        Class class0 = gzfl.class;
                        synchronized(class0) {
                            hfvs0 = gzfl.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzfl.a));
                                gzfl.d = hfvs0;
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

