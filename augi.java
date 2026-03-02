public final class augi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final augi a;
    public hfuo b;
    private static volatile Parser c;

    static {
        augi augi0 = new augi();
        augi.a = augi0;
        ProtoLiteMessage.L(augi.class, ((ProtoLiteMessage)augi0));
    }

    private augi() {
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
                    return new hfvw(((MessageLite)augi.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", augh.class});
                }
                case 3: {
                    return new augi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)augi.a));
                }
                case 5: {
                    return augi.a;
                }
                case 6: {
                    Object object1 = augi.c;
                    if(object1 == null) {
                        Class class0 = augi.class;
                        synchronized(class0) {
                            hfvs0 = augi.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)augi.a));
                                augi.c = hfvs0;
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

