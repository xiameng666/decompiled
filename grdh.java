public final class grdh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grdh a;
    private static volatile Parser b;

    static {
        grdh grdh0 = new grdh();
        grdh.a = grdh0;
        ProtoLiteMessage.L(grdh.class, ((ProtoLiteMessage)grdh0));
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
                    return new hfvw(((MessageLite)grdh.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new grdh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grdh.a));
                }
                case 5: {
                    return grdh.a;
                }
                case 6: {
                    Object object1 = grdh.b;
                    if(object1 == null) {
                        Class class0 = grdh.class;
                        synchronized(class0) {
                            hfvs0 = grdh.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grdh.a));
                                grdh.b = hfvs0;
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

