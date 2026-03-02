public final class hkvf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkvf a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hkvf hkvf0 = new hkvf();
        hkvf.a = hkvf0;
        ProtoLiteMessage.L(hkvf.class, ((ProtoLiteMessage)hkvf0));
    }

    private hkvf() {
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
                    return new hfvw(((MessageLite)hkvf.a), "\u0004\u0013\u0001\u0000\u0001\u0013\u0013\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000B<\u0000\f<\u0000\r<\u0000\u000E<\u0000\u000F<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000", new Object[]{"c", "b", hkvu.class, ftif.class, hkwa.class, hkvl.class, hkvj.class, hkvy.class, hkvo.class, hfsw.class, hkvz.class, hkvr.class, hfsw.class, hfsw.class, hfsw.class, hkvt.class, hkvx.class, hkvw.class, hfsw.class, hfsw.class, hfsw.class});
                }
                case 3: {
                    return new hkvf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkvf.a));
                }
                case 5: {
                    return hkvf.a;
                }
                case 6: {
                    Object object1 = hkvf.d;
                    if(object1 == null) {
                        Class class0 = hkvf.class;
                        synchronized(class0) {
                            hfvs0 = hkvf.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkvf.a));
                                hkvf.d = hfvs0;
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

