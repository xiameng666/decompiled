import android.content.Context;
import android.location.Location;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

final class fxgn extends fxpd {
    private final Context a;
    private final Supplier b;
    private final fxgm c;
    private final ibnf d;
    private fxec i;
    private final fxgq j;

    public fxgn(Context context0, Supplier supplier0, fxgq fxgq0, fxgm fxgm0, ibnf ibnf0) {
        super("ResRep");
        this.a = context0;
        this.b = supplier0;
        this.j = fxgq0;
        this.c = fxgm0;
        this.d = ibnf0;
    }

    @Override  // fxpd
    public final void a() {
        fxec fxec0 = (fxec)this.d.get();
        this.i = fxec0;
        fxec0.c();
        this.h.i();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        fxec fxec0 = this.i;
        if(fxec0 != null) {
            fxec0.d();
            this.i = null;
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        gwuv gwuv0;
        double f6;
        fvsf fvsf0;
        if(this.i == null) {
            return false;
        }
        int v = fxpj0.a;
        if(v != 6) {
            switch(v) {
                case 8: {
                    fxpk fxpk0 = this.h;
                    long v1 = huwd.e() / 2L;
                    fxpk0.f(10, fxpj0.b, v1);
                    return false;
                }
                case 10: {
                    if(this.i != null) {
                        fxgu fxgu0 = (fxgu)fxpj0.b;
                        gxnz gxnz0 = this.c.e();
                        long v2 = TimeUnit.MILLISECONDS.toNanos(huwd.e()) / 2L;
                        Object object0 = gxnz0.g;
                        synchronized(object0) {
                            long v4 = fxgu0.a - gxnz0.j;
                            long v5 = v4 - v2;
                            fvrw fvrw0 = gxnz0.a;
                            int v6 = fvrw0.b(v5, fvrw0.c(v5));
                            int v7 = fvrw0.c(v4 + v2);
                            if(v6 == -1 || v7 == -1) {
                                fvsf0 = null;
                            }
                            else if(v7 < v6) {
                                fvsf0 = null;
                            }
                            else {
                                int v8 = v7 - v6 + 1;
                                long[] arr_v = new long[v8];
                                float[][] arr2_f = new float[3][v8];
                                for(int v9 = 0; v9 < v8; ++v9) {
                                    int v10 = v6 + v9;
                                    arr_v[v9] = fvrw0.d(v10) + gxnz0.j;
                                    float[] arr_f = arr2_f[0];
                                    arr_f[v9] = fvrw0.a(v10, 0);
                                    float[] arr_f1 = arr2_f[1];
                                    arr_f1[v9] = fvrw0.a(v10, 1);
                                    float[] arr_f2 = arr2_f[2];
                                    arr_f2[v9] = fvrw0.a(v10, 2);
                                }
                                fvsf0 = new fvsf(arr_v, arr2_f);
                            }
                        }
                        fxec fxec0 = this.i;
                        Location location0 = ((fxob)this.b.get()).b.a;
                        long v11 = TimeUnit.NANOSECONDS.toMillis(fxgu0.a);
                        long v12 = fxgu0.b.a;
                        boolean z = fxgu0.b.b;
                        boolean z1 = fxgu0.b.c;
                        double f = fxgu0.b.d;
                        double f1 = fxgu0.b.e;
                        double f2 = fxgu0.b.f;
                        double f3 = fxgu0.b.g;
                        double f4 = fxgu0.b.h;
                        double f5 = fxgu0.b.i;
                        int v13 = fxgu0.b.j;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwsz.a).v_newBuilder();
                        if(location0 == null) {
                            f6 = f5;
                        }
                        else {
                            gwtr gwtr0 = fxec.a(location0);
                            f6 = f5;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwsz gwsz0 = (gwsz)hftp0.b_message;
                            gwtr0.getClass();
                            gwsz0.c = gwtr0;
                            gwsz0.b |= 1;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gwsz)hftv0).b |= 8;
                        ((gwsz)hftv0).d = v11;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwsz gwsz1 = (gwsz)hftp0.b_message;
                        gwsz1.b |= 0x20;
                        gwsz1.e = v12;
                        if(huwd.p()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwsz gwsz2 = (gwsz)hftp0.b_message;
                            gwsz2.b |= 0x40;
                            gwsz2.f = z;
                        }
                        if(huwd.q()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwsz gwsz3 = (gwsz)hftp0.b_message;
                            gwsz3.b |= 0x80;
                            gwsz3.g = z1;
                        }
                        if(huwd.a.n().aq()) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwta.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp1.b_message;
                            ((gwta)hftv1).b |= 1;
                            ((gwta)hftv1).c = f;
                            if(!hftv1.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gwta gwta0 = (gwta)hftp1.b_message;
                            gwta0.b |= 2;
                            gwta0.d = f1;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwsz gwsz4 = (gwsz)hftp0.b_message;
                            gwta gwta1 = (gwta)hftp1.N_build();
                            gwta1.getClass();
                            gwsz4.h = gwta1;
                            gwsz4.b |= 0x100;
                        }
                        if(huwd.o() || huwd.r()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwsz gwsz5 = (gwsz)hftp0.b_message;
                            gwsz5.b |= 0x200;
                            gwsz5.i = f2;
                        }
                        if(huwd.r()) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp0.b_message;
                            ((gwsz)hftv2).b |= 0x400;
                            ((gwsz)hftv2).j = f3;
                            if(!hftv2.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp0.b_message;
                            ((gwsz)hftv3).b |= 0x800;
                            ((gwsz)hftv3).k = f4;
                            if(!hftv3.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwsz gwsz6 = (gwsz)hftp0.b_message;
                            gwsz6.b |= 0x1000;
                            gwsz6.l = f6;
                        }
                        if(huwd.k() == 1L) {
                            int v14 = gwsy.a(v13);
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwsz gwsz7 = (gwsz)hftp0.b_message;
                            if(v14 == 0) {
                                throw null;
                            }
                            gwsz7.m = v14 - 2;
                            gwsz7.b |= 0x2000;
                        }
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwsw.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gwsw gwsw0 = (gwsw)hftp2.b_message;
                        gwsz gwsz8 = (gwsz)hftp0.N_build();
                        gwsz8.getClass();
                        gwsw0.c = gwsz8;
                        gwsw0.b |= 1;
                        gwsw gwsw1 = (gwsw)hftp2.N_build();
                        if(fvsf0 == null) {
                            gwuv0 = null;
                        }
                        else {
                            gwuu gwuu0 = (gwuu)((ProtoLiteMessage)gwuv.a).v_newBuilder();
                            if(!gwuu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)gwuu0).ensureMutable();
                            }
                            gwuv gwuv1 = (gwuv)gwuu0.b_message;
                            gwuv1.b |= 1;
                            gwuv1.c = 0L;
                            long v15 = fvsf0.d(0);
                            for(int v16 = 0; v16 < fvsf0.c; ++v16) {
                                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwua.a).v_newBuilder();
                                long v17 = fvsf0.d(v16) - v15;
                                v15 = fvsf0.d(v16);
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gwua gwua0 = (gwua)hftp3.b_message;
                                gwua0.b |= 0x80;
                                gwua0.h = (int)v17;
                                float f7 = fvsf0.a(v16, 0);
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gwua gwua1 = (gwua)hftp3.b_message;
                                gwua1.b |= 1;
                                gwua1.c = f7;
                                float f8 = fvsf0.a(v16, 1);
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gwua gwua2 = (gwua)hftp3.b_message;
                                gwua2.b |= 2;
                                gwua2.d = f8;
                                float f9 = fvsf0.a(v16, 2);
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                gwua gwua3 = (gwua)hftp3.b_message;
                                gwua3.b |= 4;
                                gwua3.e = f9;
                                if(!gwuu0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)gwuu0).ensureMutable();
                                }
                                gwuv gwuv2 = (gwuv)gwuu0.b_message;
                                gwua gwua4 = (gwua)hftp3.N_build();
                                gwua4.getClass();
                                gwuv2.b();
                                gwuv2.e.add(gwua4);
                            }
                            if(location0 != null) {
                                gwuu0.a(fxec.a(location0));
                            }
                            gwuv0 = (gwuv)((ProtoLiteBuilder)gwuu0).N_build();
                        }
                        fxec0.b(fxec.e(gwsw1, gwuv0));
                        this.h.d(19);
                        return true;
                    }
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        huwd huwd0 = huwd.a;
        if(huwd0.n().aS()) {
            fxgt fxgt0 = this.j.a.a(fxen.a(this.a), System.currentTimeMillis());
            fxec fxec1 = this.i;
            Context context0 = fxec1.a;
            long v18 = fxgt0.c;
            int v19 = fxgt0.d;
            int v20 = fxgt0.e;
            int v21 = fxgt0.f;
            int v22 = fxgt0.g;
            int v23 = fxgt0.a;
            long v24 = fxgt0.b;
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwtc.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp4.b_message;
            ((gwtc)hftv4).c = 2;
            ((gwtc)hftv4).b |= 1;
            if(!hftv4.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp4.b_message;
            ((gwtc)hftv5).b |= 2;
            ((gwtc)hftv5).d = v18;
            if(!hftv5.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp4.b_message;
            ((gwtc)hftv6).b |= 4;
            ((gwtc)hftv6).e = v19;
            if(!hftv6.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp4.b_message;
            ((gwtc)hftv7).b |= 8;
            ((gwtc)hftv7).f = v20;
            if(!hftv7.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp4.b_message;
            ((gwtc)hftv8).b |= 16;
            ((gwtc)hftv8).g = v21;
            if(!hftv8.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv9 = hftp4.b_message;
            ((gwtc)hftv9).b |= 0x20;
            ((gwtc)hftv9).h = v22;
            if(!hftv9.isImmutable()) {
                hftp4.ensureMutable();
            }
            gwtc gwtc0 = (gwtc)hftp4.b_message;
            gwtc0.b |= 0x40;
            gwtc0.i = v23;
            if(huwd0.n().aM()) {
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gwtc gwtc1 = (gwtc)hftp4.b_message;
                gwtc1.b |= 0x80;
                gwtc1.j = v24;
            }
            if(huwd0.n().aP()) {
                int v25 = fxej.a(context0);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gwtc gwtc2 = (gwtc)hftp4.b_message;
                gwtc2.b |= 0x200;
                gwtc2.k = v25;
            }
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gwsw.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gwsw gwsw2 = (gwsw)hftp5.b_message;
            gwtc gwtc3 = (gwtc)hftp4.N_build();
            gwtc3.getClass();
            gwsw2.d = gwtc3;
            gwsw2.b |= 2;
            fxec1.b(fxec.e(((gwsw)hftp5.N_build()), null));
        }
        return false;
    }
}

