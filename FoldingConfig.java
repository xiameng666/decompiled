public final class FoldingConfig extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final FoldingConfig a;
    public boolean b_use_folding_behavior;
    private static volatile Parser c;

    static {
        FoldingConfig gvsb0 = new FoldingConfig();
        FoldingConfig.a = gvsb0;
        ProtoLiteMessage.L(FoldingConfig.class, gvsb0);
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
                    return new hfvw(((MessageLite)FoldingConfig.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new FoldingConfig();
                }
                case 4: {
                    return new ProtoLiteBuilder(FoldingConfig.a);
                }
                case 5: {
                    return FoldingConfig.a;
                }
                case 6: {
                    Object object1 = FoldingConfig.c;
                    if(object1 == null) {
                        Class class0 = FoldingConfig.class;
                        synchronized(class0) {
                            hfvs0 = FoldingConfig.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(FoldingConfig.a);
                                FoldingConfig.c = hfvs0;
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

