public final class gzkh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzkh a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gzkh gzkh0 = new gzkh();
        gzkh.a = gzkh0;
        ProtoLiteMessage.L(gzkh.class, ((ProtoLiteMessage)gzkh0));
    }

    private gzkh() {
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
                    return new hfvw(((MessageLite)gzkh.a), "\u0004\u0018\u0001\u0000\u0002\u0019\u0018\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000B<\u0000\f<\u0000\r<\u0000\u000E<\u0000\u000F<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000", new Object[]{"c", "b", gzju.class, gzix.class, gzjm.class, gzka.class, gzkd.class, gzjs.class, gzkb.class, gzjg.class, gzjc.class, gzki.class, gzif.class, gzhq.class, gzhw.class, gzip.class, gzjw.class, gzik.class, gzic.class, gzjz.class, gzht.class, gzjl.class, gzis.class, gzhz.class, gziw.class, gziv.class});
                }
                case 3: {
                    return new gzkh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzkh.a));
                }
                case 5: {
                    return gzkh.a;
                }
                case 6: {
                    Object object1 = gzkh.d;
                    if(object1 == null) {
                        Class class0 = gzkh.class;
                        synchronized(class0) {
                            hfvs0 = gzkh.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzkh.a));
                                gzkh.d = hfvs0;
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

