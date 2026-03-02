public final class ghno extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ghno a;
    private static volatile Parser b;

    static {
        ghno ghno0 = new ghno();
        ghno.a = ghno0;
        ProtoLiteMessage.L(ghno.class, ((ProtoLiteMessage)ghno0));
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
                    return new hfvw(((MessageLite)ghno.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new ghno();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ghno.a));
                }
                case 5: {
                    return ghno.a;
                }
                case 6: {
                    Object object1 = ghno.b;
                    if(object1 == null) {
                        Class class0 = ghno.class;
                        synchronized(class0) {
                            hfvs0 = ghno.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ghno.a));
                                ghno.b = hfvs0;
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

