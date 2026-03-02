public final class gppa extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gppa a;
    private static volatile Parser b;

    static {
        gppa gppa0 = new gppa();
        gppa.a = gppa0;
        ProtoLiteMessage.L(gppa.class, ((ProtoLiteMessage)gppa0));
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
                    return new hfvw(((MessageLite)gppa.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gppa();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gppa.a));
                }
                case 5: {
                    return gppa.a;
                }
                case 6: {
                    Object object1 = gppa.b;
                    if(object1 == null) {
                        Class class0 = gppa.class;
                        synchronized(class0) {
                            hfvs0 = gppa.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gppa.a));
                                gppa.b = hfvs0;
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

