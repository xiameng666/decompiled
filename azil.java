public final class azil extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final azil a;
    public hfvh b;
    private static volatile Parser c;

    static {
        azil azil0 = new azil();
        azil.a = azil0;
        ProtoLiteMessage.L(azil.class, ((ProtoLiteMessage)azil0));
    }

    private azil() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)azil.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", azij.a});
                }
                case 3: {
                    return new azil();
                }
                case 4: {
                    return new azik();
                }
                case 5: {
                    return azil.a;
                }
                case 6: {
                    Object object1 = azil.c;
                    if(object1 == null) {
                        Class class0 = azil.class;
                        synchronized(class0) {
                            hfvs0 = azil.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)azil.a));
                                azil.c = hfvs0;
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

