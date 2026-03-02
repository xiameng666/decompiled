public final class ftmd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftmd a;
    private static volatile Parser b;

    static {
        ftmd ftmd0 = new ftmd();
        ftmd.a = ftmd0;
        ProtoLiteMessage.L(ftmd.class, ((ProtoLiteMessage)ftmd0));
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
                    return new hfvw(((MessageLite)ftmd.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ftmd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftmd.a));
                }
                case 5: {
                    return ftmd.a;
                }
                case 6: {
                    Object object1 = ftmd.b;
                    if(object1 == null) {
                        Class class0 = ftmd.class;
                        synchronized(class0) {
                            hfvs0 = ftmd.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftmd.a));
                                ftmd.b = hfvs0;
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

