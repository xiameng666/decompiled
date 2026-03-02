public final class igrj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final igrj a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        igrj igrj0 = new igrj();
        igrj.a = igrj0;
        ProtoLiteMessage.L(igrj.class, ((ProtoLiteMessage)igrj0));
    }

    private igrj() {
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
                    return new hfvw(((MessageLite)igrj.a), "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", igrh.class, igrn.class, igrp.class});
                }
                case 3: {
                    return new igrj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)igrj.a));
                }
                case 5: {
                    return igrj.a;
                }
                case 6: {
                    Object object1 = igrj.d;
                    if(object1 == null) {
                        Class class0 = igrj.class;
                        synchronized(class0) {
                            hfvs0 = igrj.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)igrj.a));
                                igrj.d = hfvs0;
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

