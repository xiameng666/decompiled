public final class dciv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dciv a;
    private static volatile Parser b;

    static {
        dciv dciv0 = new dciv();
        dciv.a = dciv0;
        ProtoLiteMessage.L(dciv.class, ((ProtoLiteMessage)dciv0));
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
                    return new hfvw(((MessageLite)dciv.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new dciv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dciv.a));
                }
                case 5: {
                    return dciv.a;
                }
                case 6: {
                    Object object1 = dciv.b;
                    if(object1 == null) {
                        Class class0 = dciv.class;
                        synchronized(class0) {
                            hfvs0 = dciv.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dciv.a));
                                dciv.b = hfvs0;
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

