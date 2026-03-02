public final class asbx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final asbx a;
    private static volatile Parser b;

    static {
        asbx asbx0 = new asbx();
        asbx.a = asbx0;
        ProtoLiteMessage.L(asbx.class, ((ProtoLiteMessage)asbx0));
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
                    return new hfvw(((MessageLite)asbx.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new asbx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)asbx.a));
                }
                case 5: {
                    return asbx.a;
                }
                case 6: {
                    Object object1 = asbx.b;
                    if(object1 == null) {
                        Class class0 = asbx.class;
                        synchronized(class0) {
                            hfvs0 = asbx.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)asbx.a));
                                asbx.b = hfvs0;
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

