public final class gsdo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsdo a;
    private static volatile Parser b;

    static {
        gsdo gsdo0 = new gsdo();
        gsdo.a = gsdo0;
        ProtoLiteMessage.L(gsdo.class, ((ProtoLiteMessage)gsdo0));
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
                    return new hfvw(((MessageLite)gsdo.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gsdo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsdo.a));
                }
                case 5: {
                    return gsdo.a;
                }
                case 6: {
                    Object object1 = gsdo.b;
                    if(object1 == null) {
                        Class class0 = gsdo.class;
                        synchronized(class0) {
                            hfvs0 = gsdo.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsdo.a));
                                gsdo.b = hfvs0;
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

