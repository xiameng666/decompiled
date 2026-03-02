public final class gsbe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsbe a;
    private static volatile Parser b;

    static {
        gsbe gsbe0 = new gsbe();
        gsbe.a = gsbe0;
        ProtoLiteMessage.L(gsbe.class, ((ProtoLiteMessage)gsbe0));
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
                    return new hfvw(((MessageLite)gsbe.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gsbe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsbe.a));
                }
                case 5: {
                    return gsbe.a;
                }
                case 6: {
                    Object object1 = gsbe.b;
                    if(object1 == null) {
                        Class class0 = gsbe.class;
                        synchronized(class0) {
                            hfvs0 = gsbe.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsbe.a));
                                gsbe.b = hfvs0;
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

