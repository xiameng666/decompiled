public final class gtah extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtah a;
    private static volatile Parser b;

    static {
        gtah gtah0 = new gtah();
        gtah.a = gtah0;
        ProtoLiteMessage.L(gtah.class, ((ProtoLiteMessage)gtah0));
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
                    return new hfvw(((MessageLite)gtah.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gtah();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtah.a));
                }
                case 5: {
                    return gtah.a;
                }
                case 6: {
                    Object object1 = gtah.b;
                    if(object1 == null) {
                        Class class0 = gtah.class;
                        synchronized(class0) {
                            hfvs0 = gtah.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtah.a));
                                gtah.b = hfvs0;
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

