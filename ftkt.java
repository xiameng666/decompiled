public final class ftkt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftkt a;
    private static volatile Parser b;

    static {
        ftkt ftkt0 = new ftkt();
        ftkt.a = ftkt0;
        ProtoLiteMessage.L(ftkt.class, ((ProtoLiteMessage)ftkt0));
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
                    return new hfvw(((MessageLite)ftkt.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ftkt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftkt.a));
                }
                case 5: {
                    return ftkt.a;
                }
                case 6: {
                    Object object1 = ftkt.b;
                    if(object1 == null) {
                        Class class0 = ftkt.class;
                        synchronized(class0) {
                            hfvs0 = ftkt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftkt.a));
                                ftkt.b = hfvs0;
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

