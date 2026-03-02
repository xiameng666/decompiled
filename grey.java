public final class grey extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grey a;
    public int b;
    public Object c;
    public boolean d;
    private static volatile Parser e;

    static {
        grey grey0 = new grey();
        grey.a = grey0;
        ProtoLiteMessage.L(grey.class, ((ProtoLiteMessage)grey0));
    }

    private grey() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)grey.a), "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", "d", grev.class, grfc.class, grex.class, grew.class, grfb.class, grfd.class});
                }
                case 3: {
                    return new grey();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grey.a));
                }
                case 5: {
                    return grey.a;
                }
                case 6: {
                    Object object1 = grey.e;
                    if(object1 == null) {
                        Class class0 = grey.class;
                        synchronized(class0) {
                            hfvs0 = grey.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grey.a));
                                grey.e = hfvs0;
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

