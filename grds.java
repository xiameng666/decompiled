public final class grds extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grds a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        grds grds0 = new grds();
        grds.a = grds0;
        ProtoLiteMessage.L(grds.class, ((ProtoLiteMessage)grds0));
    }

    private grds() {
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
                    return new hfvw(((MessageLite)grds.a), "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", grdp.class, grdo.class, grdr.class});
                }
                case 3: {
                    return new grds();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grds.a));
                }
                case 5: {
                    return grds.a;
                }
                case 6: {
                    Object object1 = grds.d;
                    if(object1 == null) {
                        Class class0 = grds.class;
                        synchronized(class0) {
                            hfvs0 = grds.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grds.a));
                                grds.d = hfvs0;
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

