public final class FloatValue extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final FloatValue a;
    public float b_value;
    private static volatile Parser c;

    static {
        FloatValue gvss0 = new FloatValue();
        FloatValue.a = gvss0;
        ProtoLiteMessage.L(FloatValue.class, ((ProtoLiteMessage)gvss0));
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
                    return new hfvw(((MessageLite)FloatValue.a), "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\u0001", new Object[]{"b"});
                }
                case 3: {
                    return new FloatValue();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)FloatValue.a));
                }
                case 5: {
                    return FloatValue.a;
                }
                case 6: {
                    Object object1 = FloatValue.c;
                    if(object1 == null) {
                        Class class0 = FloatValue.class;
                        synchronized(class0) {
                            hfvs0 = FloatValue.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)FloatValue.a));
                                FloatValue.c = hfvs0;
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

