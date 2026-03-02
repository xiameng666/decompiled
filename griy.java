public final class griy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final griy a;
    public ByteString b;
    private static volatile Parser c;

    static {
        griy griy0 = new griy();
        griy.a = griy0;
        ProtoLiteMessage.L(griy.class, ((ProtoLiteMessage)griy0));
    }

    private griy() {
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
                    return new hfvw(((MessageLite)griy.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new griy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)griy.a));
                }
                case 5: {
                    return griy.a;
                }
                case 6: {
                    Object object1 = griy.c;
                    if(object1 == null) {
                        Class class0 = griy.class;
                        synchronized(class0) {
                            hfvs0 = griy.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)griy.a));
                                griy.c = hfvs0;
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

