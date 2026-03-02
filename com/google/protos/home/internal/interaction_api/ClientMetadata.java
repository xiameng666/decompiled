package com.google.protos.home.internal.interaction_api;

import MessageLite;
import MessageLiteOrBuilder;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import hftq;
import hfvw;

public final class ClientMetadata extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ClientMetadata a;
    private static volatile Parser b;

    static {
        ClientMetadata clientMetadata0 = new ClientMetadata();
        ClientMetadata.a = clientMetadata0;
        ProtoLiteMessage.L(ClientMetadata.class, ((ProtoLiteMessage)clientMetadata0));
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
                    return new hfvw(((MessageLite)ClientMetadata.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ClientMetadata();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ClientMetadata.a));
                }
                case 5: {
                    return ClientMetadata.a;
                }
                case 6: {
                    Object object1 = ClientMetadata.b;
                    if(object1 == null) {
                        Class class0 = ClientMetadata.class;
                        synchronized(class0) {
                            hfvs0 = ClientMetadata.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ClientMetadata.a));
                                ClientMetadata.b = hfvs0;
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

