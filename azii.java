public final class azii extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final azii a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        azii azii0 = new azii();
        azii.a = azii0;
        ProtoLiteMessage.L(azii.class, ((ProtoLiteMessage)azii0));
    }

    private azii() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)azii.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u0002<\u0000", new Object[]{"c", "b", azil.class});
                }
                case 3: {
                    return new azii();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)azii.a));
                }
                case 5: {
                    return azii.a;
                }
                case 6: {
                    Object object1 = azii.d;
                    if(object1 == null) {
                        Class class0 = azii.class;
                        synchronized(class0) {
                            hfvs0 = azii.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)azii.a));
                                azii.d = hfvs0;
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

