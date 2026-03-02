public final class ftmt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftmt a;
    private static volatile Parser b;

    static {
        ftmt ftmt0 = new ftmt();
        ftmt.a = ftmt0;
        ProtoLiteMessage.L(ftmt.class, ((ProtoLiteMessage)ftmt0));
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
                    return new hfvw(((MessageLite)ftmt.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ftmt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftmt.a));
                }
                case 5: {
                    return ftmt.a;
                }
                case 6: {
                    Object object1 = ftmt.b;
                    if(object1 == null) {
                        Class class0 = ftmt.class;
                        synchronized(class0) {
                            hfvs0 = ftmt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftmt.a));
                                ftmt.b = hfvs0;
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

