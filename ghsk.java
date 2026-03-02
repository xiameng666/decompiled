public final class ghsk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ghsk a;
    private static volatile Parser b;

    static {
        ghsk ghsk0 = new ghsk();
        ghsk.a = ghsk0;
        ProtoLiteMessage.L(ghsk.class, ((ProtoLiteMessage)ghsk0));
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
                    return new hfvw(((MessageLite)ghsk.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new ghsk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ghsk.a));
                }
                case 5: {
                    return ghsk.a;
                }
                case 6: {
                    Object object1 = ghsk.b;
                    if(object1 == null) {
                        Class class0 = ghsk.class;
                        synchronized(class0) {
                            hfvs0 = ghsk.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ghsk.a));
                                ghsk.b = hfvs0;
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

