public final class hlwy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlwy a;
    public hfuf b;
    public hfuo c;
    private static volatile Parser d;

    static {
        hlwy hlwy0 = new hlwy();
        hlwy.a = hlwy0;
        ProtoLiteMessage.L(hlwy.class, ((ProtoLiteMessage)hlwy0));
    }

    private hlwy() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)hlwy.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\'\u0002\u001C", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hlwy();
                }
                case 4: {
                    return new hlwx();
                }
                case 5: {
                    return hlwy.a;
                }
                case 6: {
                    Object object1 = hlwy.d;
                    if(object1 == null) {
                        Class class0 = hlwy.class;
                        synchronized(class0) {
                            hfvs0 = hlwy.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlwy.a));
                                hlwy.d = hfvs0;
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

