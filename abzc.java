public final class abzc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final abzc a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        abzc abzc0 = new abzc();
        abzc.a = abzc0;
        ProtoLiteMessage.L(abzc.class, ((ProtoLiteMessage)abzc0));
    }

    private abzc() {
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
                    return new hfvw(((MessageLite)abzc.a), "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", abyt.class, abys.class, abyy.class, abzb.class, abyx.class, abyz.class, abyw.class, abyo.class, abyr.class, abza.class});
                }
                case 3: {
                    return new abzc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)abzc.a));
                }
                case 5: {
                    return abzc.a;
                }
                case 6: {
                    Object object1 = abzc.d;
                    if(object1 == null) {
                        Class class0 = abzc.class;
                        synchronized(class0) {
                            hfvs0 = abzc.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)abzc.a));
                                abzc.d = hfvs0;
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

