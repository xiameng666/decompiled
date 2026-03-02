public final class gzdm extends ibfx {
    public gzdm(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        ibuq.f(iakq0, "callOptions");
        super(iakr0, iakq0);
    }

    public final Object a(gzbj gzbj0, iaof_metadata iaof0, ibrl ibrl0) {
        gzdg gzdg0;
        if((ibrl0 instanceof gzdg)) {
            gzdg0 = (gzdg)ibrl0;
            int v = gzdg0.c;
            if((v & 0x80000000) == 0) {
                gzdg0 = new gzdg(this, ibrl0);
            }
            else {
                gzdg0.c = v - 0x80000000;
            }
        }
        else {
            gzdg0 = new gzdg(this, ibrl0);
        }
        Object object0 = gzdg0.a;
        Object object1 = ibrx.a;
        switch(gzdg0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gzdf.c;
                if(iaoj0 == null) {
                    synchronized(gzdf.class) {
                        iaoj0 = gzdf.c;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.sharing.v1.NearbySharingService", "CancelSharing");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gzbj.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gzbk.a));
                            iaoj0 = iaog0.build();
                            gzdf.c = iaoj0;
                        }
                    }
                }
                gzdg0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gzbj0, this.b, iaof0, gzdg0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    public final Object b(gzbx gzbx0, iaof_metadata iaof0, ibrl ibrl0) {
        gzdh gzdh0;
        if((ibrl0 instanceof gzdh)) {
            gzdh0 = (gzdh)ibrl0;
            int v = gzdh0.c;
            if((v & 0x80000000) == 0) {
                gzdh0 = new gzdh(this, ibrl0);
            }
            else {
                gzdh0.c = v - 0x80000000;
            }
        }
        else {
            gzdh0 = new gzdh(this, ibrl0);
        }
        Object object0 = gzdh0.a;
        Object object1 = ibrx.a;
        switch(gzdh0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gzdf.a;
                if(iaoj0 == null) {
                    synchronized(gzdf.class) {
                        iaoj0 = gzdf.a;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.sharing.v1.NearbySharingService", "CreateSharing");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gzbx.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gzby.a));
                            iaoj0 = iaog0.build();
                            gzdf.a = iaoj0;
                        }
                    }
                }
                gzdh0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gzbx0, this.b, iaof0, gzdh0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    public final Object c(gzbz gzbz0, iaof_metadata iaof0, ibrl ibrl0) {
        gzdi gzdi0;
        if((ibrl0 instanceof gzdi)) {
            gzdi0 = (gzdi)ibrl0;
            int v = gzdi0.c;
            if((v & 0x80000000) == 0) {
                gzdi0 = new gzdi(this, ibrl0);
            }
            else {
                gzdi0.c = v - 0x80000000;
            }
        }
        else {
            gzdi0 = new gzdi(this, ibrl0);
        }
        Object object0 = gzdi0.a;
        Object object1 = ibrx.a;
        switch(gzdi0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gzdf.b;
                if(iaoj0 == null) {
                    synchronized(gzdf.class) {
                        iaoj0 = gzdf.b;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.sharing.v1.NearbySharingService", "FindSharing");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gzbz.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gzca.a));
                            iaoj0 = iaog0.build();
                            gzdf.b = iaoj0;
                        }
                    }
                }
                gzdi0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gzbz0, this.b, iaof0, gzdi0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    @Override  // ibjo
    public final ibjo d(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        return new gzdm(iakr0, iakq0);
    }

    public final Object e(gzdn gzdn0, iaof_metadata iaof0, ibrl ibrl0) {
        gzdj gzdj0;
        if((ibrl0 instanceof gzdj)) {
            gzdj0 = (gzdj)ibrl0;
            int v = gzdj0.c;
            if((v & 0x80000000) == 0) {
                gzdj0 = new gzdj(this, ibrl0);
            }
            else {
                gzdj0.c = v - 0x80000000;
            }
        }
        else {
            gzdj0 = new gzdj(this, ibrl0);
        }
        Object object0 = gzdj0.a;
        Object object1 = ibrx.a;
        switch(gzdj0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gzdf.f;
                if(iaoj0 == null) {
                    synchronized(gzdf.class) {
                        iaoj0 = gzdf.f;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.sharing.v1.NearbySharingService", "RemoveReceiver");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gzdn.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gzdo.a));
                            iaoj0 = iaog0.build();
                            gzdf.f = iaoj0;
                        }
                    }
                }
                gzdj0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gzdn0, this.b, iaof0, gzdj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    public final Object f(gzdx gzdx0, iaof_metadata iaof0, ibrl ibrl0) {
        gzdk gzdk0;
        if((ibrl0 instanceof gzdk)) {
            gzdk0 = (gzdk)ibrl0;
            int v = gzdk0.c;
            if((v & 0x80000000) == 0) {
                gzdk0 = new gzdk(this, ibrl0);
            }
            else {
                gzdk0.c = v - 0x80000000;
            }
        }
        else {
            gzdk0 = new gzdk(this, ibrl0);
        }
        Object object0 = gzdk0.a;
        Object object1 = ibrx.a;
        switch(gzdk0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gzdf.e;
                if(iaoj0 == null) {
                    synchronized(gzdf.class) {
                        iaoj0 = gzdf.e;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.sharing.v1.NearbySharingService", "UpdateSharing");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gzdx.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gzdy.a));
                            iaoj0 = iaog0.build();
                            gzdf.e = iaoj0;
                        }
                    }
                }
                gzdk0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gzdx0, this.b, iaof0, gzdk0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    public final Object g(gzdz gzdz0, iaof_metadata iaof0, ibrl ibrl0) {
        gzdl gzdl0;
        if((ibrl0 instanceof gzdl)) {
            gzdl0 = (gzdl)ibrl0;
            int v = gzdl0.c;
            if((v & 0x80000000) == 0) {
                gzdl0 = new gzdl(this, ibrl0);
            }
            else {
                gzdl0.c = v - 0x80000000;
            }
        }
        else {
            gzdl0 = new gzdl(this, ibrl0);
        }
        Object object0 = gzdl0.a;
        Object object1 = ibrx.a;
        switch(gzdl0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gzdf.d;
                if(iaoj0 == null) {
                    synchronized(gzdf.class) {
                        iaoj0 = gzdf.d;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.sharing.v1.NearbySharingService", "UpdateSharingUploads");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gzdz.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gzea.a));
                            iaoj0 = iaog0.build();
                            gzdf.d = iaoj0;
                        }
                    }
                }
                gzdl0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gzdz0, this.b, iaof0, gzdl0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }
}

