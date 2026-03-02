public final class MagnetometerCalAlgorithm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final MagnetometerCalAlgorithm a;
    public int b_algorithm_type;
    private static volatile Parser c;

    static {
        MagnetometerCalAlgorithm gvrs0 = new MagnetometerCalAlgorithm();
        MagnetometerCalAlgorithm.a = gvrs0;
        ProtoLiteMessage.L(MagnetometerCalAlgorithm.class, gvrs0);
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
                    return new hfvw(((MessageLite)MagnetometerCalAlgorithm.a), "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\f", new Object[]{"b"});
                }
                case 3: {
                    return new MagnetometerCalAlgorithm();
                }
                case 4: {
                    return new ProtoLiteBuilder(MagnetometerCalAlgorithm.a);
                }
                case 5: {
                    return MagnetometerCalAlgorithm.a;
                }
                case 6: {
                    Object object1 = MagnetometerCalAlgorithm.c;
                    if(object1 == null) {
                        Class class0 = MagnetometerCalAlgorithm.class;
                        synchronized(class0) {
                            hfvs0 = MagnetometerCalAlgorithm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(MagnetometerCalAlgorithm.a);
                                MagnetometerCalAlgorithm.c = hfvs0;
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

