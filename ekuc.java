public final class ekuc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ekuc a;
    public hfuo b;
    private static volatile Parser c;

    static {
        ekuc ekuc0 = new ekuc();
        ekuc.a = ekuc0;
        ProtoLiteMessage.L(ekuc.class, ((ProtoLiteMessage)ekuc0));
    }

    private ekuc() {
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
                    return new hfvw(((MessageLite)ekuc.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", ekub.class});
                }
                case 3: {
                    return new ekuc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ekuc.a));
                }
                case 5: {
                    return ekuc.a;
                }
                case 6: {
                    Object object1 = ekuc.c;
                    if(object1 == null) {
                        Class class0 = ekuc.class;
                        synchronized(class0) {
                            hfvs0 = ekuc.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ekuc.a));
                                ekuc.c = hfvs0;
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

