public final class gimh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gimh a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        gimh gimh0 = new gimh();
        gimh.a = gimh0;
        ProtoLiteMessage.L(gimh.class, ((ProtoLiteMessage)gimh0));
    }

    private gimh() {
        this.b = hfvv.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)gimh.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", gimj.class, "c", gimz.class});
                }
                case 3: {
                    return new gimh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gimh.a));
                }
                case 5: {
                    return gimh.a;
                }
                case 6: {
                    Object object1 = gimh.d;
                    if(object1 == null) {
                        Class class0 = gimh.class;
                        synchronized(class0) {
                            hfvs0 = gimh.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gimh.a));
                                gimh.d = hfvs0;
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

