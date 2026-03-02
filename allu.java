public final class allu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final allu a;
    public ByteString b;
    public long c;
    public long d;
    private static volatile Parser e;

    static {
        allu allu0 = new allu();
        allu.a = allu0;
        ProtoLiteMessage.L(allu.class, ((ProtoLiteMessage)allu0));
    }

    private allu() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)allu.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0002\u0003\u0002", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new allu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)allu.a));
                }
                case 5: {
                    return allu.a;
                }
                case 6: {
                    Object object1 = allu.e;
                    if(object1 == null) {
                        Class class0 = allu.class;
                        synchronized(class0) {
                            hfvs0 = allu.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)allu.a));
                                allu.e = hfvs0;
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

