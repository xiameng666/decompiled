public final class grfl extends ibjl {
    public grfl(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final grdx a(grdw grdw0) {
        gRPCMethodDescriptor iaoj0 = grfm.a;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "JoinSecurityDomain");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grdw.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grdx.a));
                    iaoj0 = iaog0.build();
                    grfm.a = iaoj0;
                }
            }
            return (grdx)ibjw.b(this.a, iaoj0, this.b, grdw0);
        }
        return (grdx)ibjw.b(this.a, iaoj0, this.b, grdw0);
    }

    public final greb b(grea grea0) {
        gRPCMethodDescriptor iaoj0 = grfm.i;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.i;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "ListProductKeys");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grea.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)greb.a));
                    iaoj0 = iaog0.build();
                    grfm.i = iaoj0;
                }
            }
            return (greb)ibjw.b(this.a, iaoj0, this.b, grea0);
        }
        return (greb)ibjw.b(this.a, iaoj0, this.b, grea0);
    }

    public final gree c(gred gred0) {
        gRPCMethodDescriptor iaoj0 = grfm.g;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.g;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "ListSecurityDomainMembers");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)gred.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gree.a));
                    iaoj0 = iaog0.build();
                    grfm.g = iaoj0;
                }
            }
            return (gree)ibjw.b(this.a, iaoj0, this.b, gred0);
        }
        return (gree)ibjw.b(this.a, iaoj0, this.b, gred0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new grfl(iakr0, iakq0);
    }

    public final greu e(grdu grdu0) {
        gRPCMethodDescriptor iaoj0 = grfm.e;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.e;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "GetSecurityDomain");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grdu.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)greu.a));
                    iaoj0 = iaog0.build();
                    grfm.e = iaoj0;
                }
            }
            return (greu)ibjw.b(this.a, iaoj0, this.b, grdu0);
        }
        return (greu)ibjw.b(this.a, iaoj0, this.b, grdu0);
    }

    public final grff f(grdt grdt0) {
        gRPCMethodDescriptor iaoj0 = grfm.f;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.f;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "GetSecurityDomainMember");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grdt.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grff.a));
                    iaoj0 = iaog0.build();
                    grfm.f = iaoj0;
                }
            }
            return (grff)ibjw.b(this.a, iaoj0, this.b, grdt0);
        }
        return (grff)ibjw.b(this.a, iaoj0, this.b, grdt0);
    }

    public final grff g(grfu grfu0) {
        gRPCMethodDescriptor iaoj0 = grfm.d;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.d;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "UpdateSecurityDomainMember");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grfu.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grff.a));
                    iaoj0 = iaog0.build();
                    grfm.d = iaoj0;
                }
            }
            return (grff)ibjw.b(this.a, iaoj0, this.b, grfu0);
        }
        return (grff)ibjw.b(this.a, iaoj0, this.b, grfu0);
    }

    public final grfp h(grfo grfo0) {
        gRPCMethodDescriptor iaoj0 = grfm.j;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.j;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "StoreProductKey");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grfo.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)grfp.a));
                    iaoj0 = iaog0.build();
                    grfm.j = iaoj0;
                }
            }
            return (grfp)ibjw.b(this.a, iaoj0, this.b, grfo0);
        }
        return (grfp)ibjw.b(this.a, iaoj0, this.b, grfo0);
    }

    public final hfsw i(grdy grdy0) {
        gRPCMethodDescriptor iaoj0 = grfm.b;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "LeaveSecurityDomain");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grdy.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hfsw.a));
                    iaoj0 = iaog0.build();
                    grfm.b = iaoj0;
                }
            }
            return (hfsw)ibjw.b(this.a, iaoj0, this.b, grdy0);
        }
        return (hfsw)ibjw.b(this.a, iaoj0, this.b, grdy0);
    }

    public final hfsw j(grep grep0) {
        gRPCMethodDescriptor iaoj0 = grfm.c;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "ResetSecurityDomain");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grep.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hfsw.a));
                    iaoj0 = iaog0.build();
                    grfm.c = iaoj0;
                }
            }
            return (hfsw)ibjw.b(this.a, iaoj0, this.b, grep0);
        }
        return (hfsw)ibjw.b(this.a, iaoj0, this.b, grep0);
    }
}

