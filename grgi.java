public final class grgi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grgi a;
    private static volatile Parser b;

    static {
        grgi grgi0 = new grgi();
        grgi.a = grgi0;
        ProtoLiteMessage.L(grgi.class, ((ProtoLiteMessage)grgi0));
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
                    return new hfvw(((MessageLite)grgi.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new grgi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grgi.a));
                }
                case 5: {
                    return grgi.a;
                }
                case 6: {
                    Object object1 = grgi.b;
                    if(object1 == null) {
                        Class class0 = grgi.class;
                        synchronized(class0) {
                            hfvs0 = grgi.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grgi.a));
                                grgi.b = hfvs0;
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

