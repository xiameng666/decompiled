public final class hceu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hceu a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hceu hceu0 = new hceu();
        hceu.a = hceu0;
        ProtoLiteMessage.L(hceu.class, ((ProtoLiteMessage)hceu0));
    }

    private hceu() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)hceu.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hcet.class});
                }
                case 3: {
                    return new hceu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hceu.a));
                }
                case 5: {
                    return hceu.a;
                }
                case 6: {
                    Object object1 = hceu.c;
                    if(object1 == null) {
                        Class class0 = hceu.class;
                        synchronized(class0) {
                            hfvs0 = hceu.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hceu.a));
                                hceu.c = hfvs0;
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

