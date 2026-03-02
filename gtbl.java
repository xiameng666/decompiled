public final class gtbl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtbl a;
    public int b;
    public int c;
    public boolean d;
    private static volatile Parser e;

    static {
        gtbl gtbl0 = new gtbl();
        gtbl.a = gtbl0;
        ProtoLiteMessage.L(gtbl.class, ((ProtoLiteMessage)gtbl0));
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
                    return new hfvw(((MessageLite)gtbl.a), "\u0000\u0003\u0000\u0000\u0002\u0006\u0003\u0000\u0000\u0000\u0002\f\u0005\f\u0006\u0007", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new gtbl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtbl.a));
                }
                case 5: {
                    return gtbl.a;
                }
                case 6: {
                    Object object1 = gtbl.e;
                    if(object1 == null) {
                        Class class0 = gtbl.class;
                        synchronized(class0) {
                            hfvs0 = gtbl.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtbl.a));
                                gtbl.e = hfvs0;
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

