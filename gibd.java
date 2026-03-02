public final class gibd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gibd a;
    private static volatile Parser b;

    static {
        gibd gibd0 = new gibd();
        gibd.a = gibd0;
        ProtoLiteMessage.L(gibd.class, ((ProtoLiteMessage)gibd0));
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
                    return new hfvw(((MessageLite)gibd.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gibd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gibd.a));
                }
                case 5: {
                    return gibd.a;
                }
                case 6: {
                    Object object1 = gibd.b;
                    if(object1 == null) {
                        Class class0 = gibd.class;
                        synchronized(class0) {
                            hfvs0 = gibd.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gibd.a));
                                gibd.b = hfvs0;
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

