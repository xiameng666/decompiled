import android.content.Context;
import j..util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class arqx extends arqo {
    public Set a;
    public arko b;
    public static final int c;
    private static final aqql d;
    private List e;
    private final arqr f;

    static {
        arqx.d = new aqql(new String[]{"MediaFlavorHandler"});
    }

    public arqx(arqr arqr0) {
        this.f = arqr0;
    }

    @Override  // arqo
    public final File a(asby asby0) {
        this.f();
        if(this.a.contains(asby0.e)) {
            return arqx.g(asby0);
        }
        throw new IOException("Item not advertised by the source: " + asby0.e);
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        return new arrh(new arqv(this, asby0));
    }

    @Override  // arqo
    public final List c() {
        List list0 = new ArrayList();
        this.f();
        for(Object object0: this.e) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asby.a).v_newBuilder();
            arhc arhc0 = ((arhh)object0).a;
            String s = arhc0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asby asby0 = (asby)hftp0.b_message;
            asby0.b |= 1;
            asby0.e = s;
            File file0 = arqx.g(((asby)hftp0.N_build()));
            long v = file0.length();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asby asby1 = (asby)hftp0.b_message;
            asby1.b |= 2;
            asby1.f = v;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbs.a).v_newBuilder();
            String s1 = arhc0.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbs asbs0 = (asbs)hftp1.b_message;
            asbs0.b |= 1;
            asbs0.c = s1;
            long v1 = file0.lastModified();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbs asbs1 = (asbs)hftp1.b_message;
            asbs1.b |= 2;
            asbs1.d = v1;
            gfsx gfsx0 = ((arhh)object0).b;
            if(gfsx0.i()) {
                String s2 = (String)gfsx0.d();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asbs asbs2 = (asbs)hftp1.b_message;
                asbs2.b |= 8;
                asbs2.e = s2;
            }
            gfsx gfsx1 = ((arhh)object0).c;
            if(gfsx1.i()) {
                int v2 = (int)(((Integer)gfsx1.d()));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asbs asbs3 = (asbs)hftp1.b_message;
                asbs3.b |= 0x20;
                asbs3.g = v2;
            }
            asbs asbs4 = (asbs)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asby asby2 = (asby)hftp0.b_message;
            asbs4.getClass();
            asby2.d = asbs4;
            asby2.c = 100;
            list0.add(((asby)hftp0.N_build()));
        }
        return list0;
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        bbpb.b(inputStream0);
    }

    public final void f() {
        synchronized(this) {
            if(this.e == null) {
                try {
                    List list0 = this.f.a();
                    this.e = list0;
                    this.a = ggog.i(list0.size());
                    for(Object object0: this.e) {
                        this.a.add(((arhh)object0).a.a);
                    }
                    return;
                }
                catch(ExecutionException executionException0) {
                    arqx.d.g("ExecutionException in PathFetcher", executionException0, new Object[0]);
                    return;
                }
                catch(InterruptedException interruptedException0) {
                    goto label_18;
                }
            }
            return;
        label_18:
            arqx.d.g("InterruptedException in PathFetcher", interruptedException0, new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    public static final File g(asby asby0) {
        return hrnt.i() ? new File(ccsb.a.a(asby0.e)) : new File(asby0.e);
    }

    public final void h(Context context0, ProtoLiteBuilder hftp0, ProtoLiteBuilder hftp1) {
        aqql aqql0;
        fpsz fpsz0;
        gRPCMethodDescriptor iaoj2;
        HashMap hashMap0;
        aqso aqso0 = (aqso)gfus.a(((gful_cronetEngineProvider)new arqu(aqso.a(context0)))).mr();
        aqvc aqvc0 = aqvd.a();
        aqvc0.c(19);
        aqvk aqvk0 = aqso0.b(aqvc0.a());
        aqvj aqvj0 = aqvk0.a;
        if(aqvj0 == aqvj.c) {
            arqx.d.m("Error while photo account sync call, proceeding with restore of all media files", new Object[0]);
            asbv asbv0 = arqx.i(3);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asbo asbo0 = (asbo)hftp0.b_message;
            asbv0.getClass();
            asbo0.f = asbv0;
            asbo0.b |= 8;
            return;
        }
        String s = aqvk0.b;
        if(aqvj0 == aqvj.a && s != null) {
            try {
                arko arko0 = new arko(context0);
                this.b = arko0;
                baun baun0 = arko.a;
                baun0.d("getLocalMediaBackupStatus()", new Object[0]);
                hashMap0 = new HashMap();
                for(long v = 0L; Long.compare(v, -1L) != 0; v = fpsv0.c) {
                    if(arko0.d) {
                        arko.a.d("HybridPhotoApiGrpcClient cancelled", new Object[0]);
                        break;
                    }
                    fpsx fpsx0 = arko0.e;
                    if(fpsx0 == null) {
                        ianj_grpcChannel ianj0 = arko0.c;
                        if(ianj0 == null) {
                            ggoh ggoh0 = new ggoh("com.google.android.apps.photos");
                            iaqy iaqy0 = gpjc.b(arko0.b, ggoh0);
                            iaqq iaqq0 = iaqq.m(iaql.b("com.google.android.apps.photos", "com.google.android.apps.photos.backup.apiservice.hybridrestore.HybridRestoreApiService"), arko0.b);
                            iaqq0.p(iaqy0);
                            arko0.c = iaqq0.a();
                            ianj0 = arko0.c;
                        }
                        arko0.e = (fpsx)fpsx.f(new fpsw(), ianj0);
                        fpsx0 = arko0.e;
                    }
                    fpsu fpsu0 = fpsu.a;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fpsu0).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    ((fpsu)hftv0).b |= 1;
                    ((fpsu)hftv0).c = s;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    fpsu fpsu1 = (fpsu)hftp2.b_message;
                    fpsu1.b |= 2;
                    fpsu1.d = v;
                    fpsu fpsu2 = (fpsu)hftp2.N_build();
                    iakr iakr0 = fpsx0.a;
                    gRPCMethodDescriptor iaoj0 = fpsy.a;
                    if(iaoj0 == null) {
                        Class class0 = fpsy.class;
                        synchronized(class0) {
                            gRPCMethodDescriptor iaoj1 = fpsy.a;
                            if(iaoj1 == null) {
                                gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                                iaog0.methodType = gRPCMethodType.a;
                                iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.libraries.photos.api.hybridrestore.HybridRestoreApiService", "GetLocalMediaBackupStatus");
                                iaog0.setSampledToLocalTracing();
                                iaog0.requestMarshaller = new ibjh(((MessageLite)fpsu0));
                                iaog0.responseMarshaller = new ibjh(((MessageLite)fpsv.a));
                                iaoj2 = iaog0.build();
                                fpsy.a = iaoj2;
                            }
                            else {
                                iaoj2 = iaoj1;
                            }
                            iaoj0 = iaoj2;
                        }
                    }
                    fpsv fpsv0 = (fpsv)((glyq)ibjw.a(iakr0.a(iaoj0, fpsx0.b), fpsu2)).v(hqhq.h(), TimeUnit.SECONDS);
                    for(Object object0: fpsv0.b) {
                        Integer integer0 = (int)((fpta)object0).b;
                        switch(((fpta)object0).c) {
                            case 0: {
                                fpsz0 = fpsz.a;
                                break;
                            }
                            case 1: {
                                fpsz0 = fpsz.b;
                                break;
                            }
                            case 2: {
                                fpsz0 = fpsz.c;
                                break;
                            }
                            case 3: {
                                fpsz0 = fpsz.d;
                                break;
                            }
                            case 4: {
                                fpsz0 = fpsz.e;
                                break;
                            }
                            default: {
                                fpsz0 = null;
                            }
                        }
                        if(fpsz0 == null) {
                            fpsz0 = fpsz.f;
                        }
                        hashMap0.put(integer0, fpsz0);
                    }
                    baun0.d("Media ids portion of size: %d is loaded", new Object[]{fpsv0.b.size()});
                }
                arko.a.d("Media ids are successfully fetched", new Object[0]);
                ianj_grpcChannel ianj1 = arko0.c;
                if(ianj1 != null) {
                    ianj1.d();
                }
                aqql0 = arqx.d;
                aqql0.h("Number of media ids fetched: %d", new Object[]{hashMap0.size()});
            }
            catch(ExecutionException | InterruptedException exception0) {
                arqx.d.n("Unable to fetch media ids with error: ", exception0, new Object[0]);
                asbv asbv1 = arqx.i(4);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                asbo asbo1 = (asbo)hftp0.b_message;
                asbv1.getClass();
                asbo1.f = asbv1;
                asbo1.b |= 8;
                return;
            }
            catch(TimeoutException unused_ex) {
                Object[] arr_object = {hqhq.h()};
                arqx.d.m("Timeout while querying media ids: %d sec", arr_object);
                asbv asbv2 = arqx.i(5);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                asbo asbo2 = (asbo)hftp0.b_message;
                asbv2.getClass();
                asbo2.f = asbv2;
                asbo2.b |= 8;
                return;
            }
            ArrayList arrayList0 = new ArrayList(DesugarCollections.unmodifiableList(((asbn)hftp1.b_message).d));
            aqql0.h("HMR item list size %d", new Object[]{arrayList0.size()});
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((asbn)hftp1.b_message).d = hfvv.a;
            Collections.sort(arrayList0, new arqw());
            long v1 = hqhq.a.j().E();
            aqql0.h("HMR lastNMediaFilesTransferCount: %d", new Object[]{v1});
            int v2 = 0;
            while(v2 < arrayList0.size()) {
                asby asby0 = (asby)arrayList0.get(v2);
                int v3 = hashMap0.get(Integer.valueOf((asby0.c == 100 ? ((asbs)asby0.d) : asbs.a).g)) == fpsz.c ? 1 : 0;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)asby.a).v_newBuilder();
                String s1 = asby0.e;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp3.b_message;
                s1.getClass();
                ((asby)hftv1).b |= 1;
                ((asby)hftv1).e = s1;
                long v4 = asby0.f;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                asby asby1 = (asby)hftp3.b_message;
                asby1.b |= 2;
                asby1.f = v4;
                asbs asbs0 = asby0.c == 100 ? ((asbs)asby0.d) : asbs.a;
                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)asbs0).jf(5, null);
                hftp4.X(((ProtoLiteMessage)asbs0));
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                asbs asbs1 = (asbs)hftp4.b_message;
                asbs1.b |= 16;
                asbs1.f = (((long)v2) >= v1 ? 1 : 0) & v3;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                asby asby2 = (asby)hftp3.b_message;
                asbs asbs2 = (asbs)hftp4.N_build();
                asbs2.getClass();
                asby2.d = asbs2;
                asby2.c = 100;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asbn asbn0 = (asbn)hftp1.b_message;
                asby asby3 = (asby)hftp3.N_build();
                asby3.getClass();
                asbn0.b();
                asbn0.d.add(asby3);
                asby asby4 = (asby)hftp3.b_message;
                aqql0.d("HMR item %s status %s", new Object[]{(asby4.c == 100 ? ((asbs)asby4.d) : asbs.a).c, Boolean.valueOf((asby4.c == 100 ? ((asbs)asby4.d) : asbs.a).f)});
                ++v2;
                arrayList0 = arrayList0;
                v1 = v1;
            }
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)asbv.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            asbv asbv3 = (asbv)hftp5.b_message;
            asbv3.b |= 1;
            asbv3.c = s;
            asbv asbv4 = (asbv)hftp5.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asbo asbo3 = (asbo)hftp0.b_message;
            asbv4.getClass();
            asbo3.f = asbv4;
            asbo3.b |= 8;
            aqql0.d("Summary flavor list is successfully updated with hybrid media info", new Object[0]);
            return;
        }
        arqx.d.d("Google Photo sync disabled, proceeding with restore of all media files", new Object[0]);
        asbv asbv5 = arqx.i(2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbo asbo4 = (asbo)hftp0.b_message;
        asbv5.getClass();
        asbo4.f = asbv5;
        asbo4.b |= 8;
    }

    private static final asbv i(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((asbv)hftp0.b_message).d = v - 1;
        ((asbv)hftp0.b_message).b |= 2;
        return (asbv)hftp0.N_build();
    }
}

