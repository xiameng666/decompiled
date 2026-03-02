public final class abzh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final abzh a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        abzh abzh0 = new abzh();
        abzh.a = abzh0;
        ProtoLiteMessage.L(abzh.class, ((ProtoLiteMessage)abzh0));
    }

    private abzh() {
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
                    return new hfvw(((MessageLite)abzh.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", abzf.class, "c", abze.class});
                }
                case 3: {
                    return new abzh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)abzh.a));
                }
                case 5: {
                    return abzh.a;
                }
                case 6: {
                    Object object1 = abzh.d;
                    if(object1 == null) {
                        Class class0 = abzh.class;
                        synchronized(class0) {
                            hfvs0 = abzh.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)abzh.a));
                                abzh.d = hfvs0;
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

