public final class gsdp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsdp a;
    private static volatile Parser b;

    static {
        gsdp gsdp0 = new gsdp();
        gsdp.a = gsdp0;
        ProtoLiteMessage.L(gsdp.class, ((ProtoLiteMessage)gsdp0));
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
                    return new hfvw(((MessageLite)gsdp.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gsdp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsdp.a));
                }
                case 5: {
                    return gsdp.a;
                }
                case 6: {
                    Object object1 = gsdp.b;
                    if(object1 == null) {
                        Class class0 = gsdp.class;
                        synchronized(class0) {
                            hfvs0 = gsdp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsdp.a));
                                gsdp.b = hfvs0;
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

