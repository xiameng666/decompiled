public final class ifwp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ifwp DEFAULT_INSTANCE = null;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public hfvh flags_;

    static {
        ifwp ifwp0 = new ifwp();
        ifwp.DEFAULT_INSTANCE = ifwp0;
        ProtoLiteMessage.L(ifwp.class, ((ProtoLiteMessage)ifwp0));
    }

    private ifwp() {
        this.flags_ = hfvh.a;
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
                    return new hfvw(((MessageLite)ifwp.DEFAULT_INSTANCE), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", ifwo.a});
                }
                case 3: {
                    return new ifwp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ifwp.DEFAULT_INSTANCE));
                }
                case 5: {
                    return ifwp.DEFAULT_INSTANCE;
                }
                case 6: {
                    Object object1 = ifwp.PARSER;
                    if(object1 == null) {
                        Class class0 = ifwp.class;
                        synchronized(class0) {
                            hfvs0 = ifwp.PARSER;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ifwp.DEFAULT_INSTANCE));
                                ifwp.PARSER = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    return null;
                }
            }
        }
        throw null;
    }
}

