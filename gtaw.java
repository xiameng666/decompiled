public final class gtaw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtaw a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gtaw gtaw0 = new gtaw();
        gtaw.a = gtaw0;
        ProtoLiteMessage.L(gtaw.class, ((ProtoLiteMessage)gtaw0));
    }

    private gtaw() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)gtaw.a), "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001B", new Object[]{"b", gtbk.class});
                }
                case 3: {
                    return new gtaw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtaw.a));
                }
                case 5: {
                    return gtaw.a;
                }
                case 6: {
                    Object object1 = gtaw.c;
                    if(object1 == null) {
                        Class class0 = gtaw.class;
                        synchronized(class0) {
                            hfvs0 = gtaw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtaw.a));
                                gtaw.c = hfvs0;
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

