package com.google.protos.home.internal.generic_channel;

import MessageLite;
import MessageLiteOrBuilder;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import hftq;
import hfvw;

public final class Payload extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final Payload a;
    private static volatile Parser b;

    static {
        Payload payload0 = new Payload();
        Payload.a = payload0;
        ProtoLiteMessage.L(Payload.class, ((ProtoLiteMessage)payload0));
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
                    return new hfvw(((MessageLite)Payload.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new Payload();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)Payload.a));
                }
                case 5: {
                    return Payload.a;
                }
                case 6: {
                    Object object1 = Payload.b;
                    if(object1 == null) {
                        Class class0 = Payload.class;
                        synchronized(class0) {
                            hfvs0 = Payload.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)Payload.a));
                                Payload.b = hfvs0;
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

