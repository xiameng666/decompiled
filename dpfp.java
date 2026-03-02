public final class dpfp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dpfp a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        dpfp dpfp0 = new dpfp();
        dpfp.a = dpfp0;
        ProtoLiteMessage.L(dpfp.class, ((ProtoLiteMessage)dpfp0));
    }

    private dpfp() {
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
                    return new hfvw(((MessageLite)dpfp.a), "\u0004\u000F\u0001\u0000\u0001\u000F\u000F\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000B:\u0000\f<\u0000\r<\u0000\u000E:\u0000\u000F:\u0000", new Object[]{"c", "b", dpfe.class, dpfg.class, gtgn.class, dpfm.class, dpff.class, dpfh.class, gtid.class, dpfo.class, gtjd.class, dpfn.class, dpfj.class, gtih.class});
                }
                case 3: {
                    return new dpfp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dpfp.a));
                }
                case 5: {
                    return dpfp.a;
                }
                case 6: {
                    Object object1 = dpfp.d;
                    if(object1 == null) {
                        Class class0 = dpfp.class;
                        synchronized(class0) {
                            hfvs0 = dpfp.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dpfp.a));
                                dpfp.d = hfvs0;
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

