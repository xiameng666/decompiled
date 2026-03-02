public final class gtae extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtae a;
    public int b;
    public Object c;
    public int d;
    private static volatile Parser e;

    static {
        gtae gtae0 = new gtae();
        gtae.a = gtae0;
        ProtoLiteMessage.L(gtae.class, ((ProtoLiteMessage)gtae0));
    }

    private gtae() {
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
                    return new hfvw(((MessageLite)gtae.a), "\u0000\u0003\u0001\u0000\t\u000B\u0003\u0000\u0000\u0000\t<\u0000\n<\u0000\u000B\f", new Object[]{"c", "b", gtat.class, gtaj.class, "d"});
                }
                case 3: {
                    return new gtae();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtae.a));
                }
                case 5: {
                    return gtae.a;
                }
                case 6: {
                    Object object1 = gtae.e;
                    if(object1 == null) {
                        Class class0 = gtae.class;
                        synchronized(class0) {
                            hfvs0 = gtae.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtae.a));
                                gtae.e = hfvs0;
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

