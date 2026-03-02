public final class gyvk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyvk a;
    private static volatile Parser b;

    static {
        gyvk gyvk0 = new gyvk();
        gyvk.a = gyvk0;
        ProtoLiteMessage.L(gyvk.class, ((ProtoLiteMessage)gyvk0));
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
                    return new hfvw(((MessageLite)gyvk.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gyvk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyvk.a));
                }
                case 5: {
                    return gyvk.a;
                }
                case 6: {
                    Object object1 = gyvk.b;
                    if(object1 == null) {
                        Class class0 = gyvk.class;
                        synchronized(class0) {
                            hfvs0 = gyvk.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyvk.a));
                                gyvk.b = hfvs0;
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

