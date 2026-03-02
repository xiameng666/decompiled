public final class dpfg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dpfg a;
    public ByteString b;
    private static volatile Parser c;

    static {
        dpfg dpfg0 = new dpfg();
        dpfg.a = dpfg0;
        ProtoLiteMessage.L(dpfg.class, ((ProtoLiteMessage)dpfg0));
    }

    private dpfg() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)dpfg.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new dpfg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dpfg.a));
                }
                case 5: {
                    return dpfg.a;
                }
                case 6: {
                    Object object1 = dpfg.c;
                    if(object1 == null) {
                        Class class0 = dpfg.class;
                        synchronized(class0) {
                            hfvs0 = dpfg.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dpfg.a));
                                dpfg.c = hfvs0;
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

