public final class ftix extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftix a;
    public long b;
    private static volatile Parser c;

    static {
        ftix ftix0 = new ftix();
        ftix.a = ftix0;
        ProtoLiteMessage.L(ftix.class, ((ProtoLiteMessage)ftix0));
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
                    return new hfvw(((MessageLite)ftix.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
                }
                case 3: {
                    return new ftix();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftix.a));
                }
                case 5: {
                    return ftix.a;
                }
                case 6: {
                    Object object1 = ftix.c;
                    if(object1 == null) {
                        Class class0 = ftix.class;
                        synchronized(class0) {
                            hfvs0 = ftix.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftix.a));
                                ftix.c = hfvs0;
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

