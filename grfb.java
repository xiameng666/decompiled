public final class grfb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grfb a;
    public ByteString b;
    public ByteString c;
    private static volatile Parser d;

    static {
        grfb grfb0 = new grfb();
        grfb.a = grfb0;
        ProtoLiteMessage.L(grfb.class, ((ProtoLiteMessage)grfb0));
    }

    private grfb() {
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
                    return new hfvw(((MessageLite)grfb.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new grfb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grfb.a));
                }
                case 5: {
                    return grfb.a;
                }
                case 6: {
                    Object object1 = grfb.d;
                    if(object1 == null) {
                        Class class0 = grfb.class;
                        synchronized(class0) {
                            hfvs0 = grfb.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grfb.a));
                                grfb.d = hfvs0;
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

