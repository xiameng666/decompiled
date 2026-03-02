public final class ghsl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ghsl a;
    private static volatile Parser b;

    static {
        ghsl ghsl0 = new ghsl();
        ghsl.a = ghsl0;
        ProtoLiteMessage.L(ghsl.class, ((ProtoLiteMessage)ghsl0));
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
                    return new hfvw(((MessageLite)ghsl.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new ghsl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ghsl.a));
                }
                case 5: {
                    return ghsl.a;
                }
                case 6: {
                    Object object1 = ghsl.b;
                    if(object1 == null) {
                        Class class0 = ghsl.class;
                        synchronized(class0) {
                            hfvs0 = ghsl.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ghsl.a));
                                ghsl.b = hfvs0;
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

