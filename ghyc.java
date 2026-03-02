public final class ghyc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ghyc a;
    private static volatile Parser b;

    static {
        ghyc ghyc0 = new ghyc();
        ghyc.a = ghyc0;
        ProtoLiteMessage.L(ghyc.class, ((ProtoLiteMessage)ghyc0));
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
                    return new hfvw(((MessageLite)ghyc.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new ghyc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ghyc.a));
                }
                case 5: {
                    return ghyc.a;
                }
                case 6: {
                    Object object1 = ghyc.b;
                    if(object1 == null) {
                        Class class0 = ghyc.class;
                        synchronized(class0) {
                            hfvs0 = ghyc.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ghyc.a));
                                ghyc.b = hfvs0;
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

