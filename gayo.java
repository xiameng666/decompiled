import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import java.util.ArrayList;
import java.util.List;

public final class gayo {
    gayq a;
    hdzx b;
    final List c;
    int d;
    public final boolean e;
    public boolean f;
    private final HandlerThread g;
    private Handler h;

    public gayo(gayq gayq0) {
        this.g = new HandlerThread("frame-metrics");
        this.h = null;
        this.c = new ArrayList();
        this.d = -1;
        boolean z = gayr.a();
        this.e = z;
        if(z) {
            this.a = gayq0;
        }
    }

    public final void a() {
        this.d();
        this.b = null;
    }

    public final void b(hdzx hdzx0) {
        if(this.e && !this.f) {
            synchronized(this) {
                this.b = hdzx0;
            }
        }
    }

    public final void c() {
        if(this.e) {
            synchronized(this) {
                if(!this.f) {
                    hdzx hdzx0 = this.b;
                    if(hdzx0 != null) {
                        this.f = true;
                        if((hdzx0.b & 2) != 0) {
                            this.d = hdzx0.d;
                        }
                        gayq gayq0 = this.a;
                        if(gayq0.c) {
                            synchronized(gayq0) {
                                gayq0.a.add(this);
                            }
                        }
                        if(this.h == null) {
                            this.g.start();
                            this.h = new clht(this.g.getLooper());
                        }
                        if((hdzx0.b & 4) != 0) {
                            Handler handler0 = this.h;
                            gftb.check(handler0);
                            handler0.postDelayed(() -> {
                                List list1;
                                if(this.e && this.b != null) {
                                    synchronized(this) {
                                        if(this.f) {
                                            this.f = false;
                                            gayq gayq0 = this.a;
                                            if(gayq0.c) {
                                                synchronized(gayq0) {
                                                    gayq0.a.remove(this);
                                                }
                                            }
                                        }
                                        List list0 = this.c;
                                        if(!list0.isEmpty()) {
                                            gayq gayq1 = this.a;
                                            hdzx hdzx0 = this.b;
                                            gftb.check(hdzx0);
                                            int v2 = gkwz.a(hdzx0.c) == 0 ? 1 : gkwz.a(hdzx0.c);
                                            if(gayq1.c) {
                                                gaym gaym0 = gayq1.e.g;
                                                gkxn gkxn0 = gkxn.a;
                                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxn0).v_newBuilder();
                                                int v3 = 0;
                                                int v4 = 0;
                                                for(Object object0: list0) {
                                                    long v5 = ((FrameMetrics)object0).getMetric(8);
                                                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkxm.a).v_newBuilder();
                                                    long v6 = ((FrameMetrics)object0).getMetric(9);
                                                    if(!hftp1.b_message.isImmutable()) {
                                                        hftp1.ensureMutable();
                                                    }
                                                    gkxm gkxm0 = (gkxm)hftp1.b_message;
                                                    gkxm0.b |= 4;
                                                    gkxm0.e = v6;
                                                    long v7 = ((FrameMetrics)object0).getMetric(4);
                                                    if(!hftp1.b_message.isImmutable()) {
                                                        hftp1.ensureMutable();
                                                    }
                                                    gkxm gkxm1 = (gkxm)hftp1.b_message;
                                                    gkxm1.b |= 2;
                                                    gkxm1.d = v7;
                                                    long v8 = ((FrameMetrics)object0).getMetric(3);
                                                    if(!hftp1.b_message.isImmutable()) {
                                                        hftp1.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv0 = hftp1.b_message;
                                                    ((gkxm)hftv0).b |= 8;
                                                    ((gkxm)hftv0).f = v8;
                                                    if(!hftv0.isImmutable()) {
                                                        hftp1.ensureMutable();
                                                    }
                                                    gkxm gkxm2 = (gkxm)hftp1.b_message;
                                                    gkxm2.b |= 16;
                                                    gkxm2.g = v5;
                                                    if(v5 >= 16000000L) {
                                                        ++v3;
                                                    }
                                                    boolean z = v5 >= ((FrameMetrics)object0).getMetric(13);
                                                    if(z) {
                                                        ++v4;
                                                    }
                                                    if(!hftp1.b_message.isImmutable()) {
                                                        hftp1.ensureMutable();
                                                    }
                                                    gkxm gkxm3 = (gkxm)hftp1.b_message;
                                                    gkxm3.b |= 1;
                                                    gkxm3.c = z;
                                                    gkxm gkxm4 = (gkxm)hftp1.N_build();
                                                    if(!hftp0.b_message.isImmutable()) {
                                                        hftp0.ensureMutable();
                                                    }
                                                    gkxn gkxn1 = (gkxn)hftp0.b_message;
                                                    gkxm4.getClass();
                                                    hfuo hfuo0 = gkxn1.b;
                                                    if(!hfuo0.c()) {
                                                        gkxn1.b = ProtoLiteMessage.E(hfuo0);
                                                    }
                                                    gkxn1.b.add(gkxm4);
                                                    list0 = list0;
                                                }
                                                list1 = list0;
                                                gkxp gkxp0 = gkxp.a;
                                                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkxp0).v_newBuilder();
                                                if(!hftp2.b_message.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                ((gkxp)hftp2.b_message).e = v2 - 1;
                                                ((gkxp)hftp2.b_message).b |= 1;
                                                int v9 = list1.size();
                                                if(!hftp2.b_message.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv1 = hftp2.b_message;
                                                ((gkxp)hftv1).b |= 2;
                                                ((gkxp)hftv1).f = v9;
                                                if(!hftv1.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                gkxp gkxp1 = (gkxp)hftp2.b_message;
                                                gkxn gkxn2 = (gkxn)hftp0.N_build();
                                                gkxn2.getClass();
                                                gkxp1.d = gkxn2;
                                                gkxp1.c = 5;
                                                if(!hftp2.b_message.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv2 = hftp2.b_message;
                                                ((gkxp)hftv2).b |= 4;
                                                ((gkxp)hftv2).g = v3;
                                                if(!hftv2.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                gkxp gkxp2 = (gkxp)hftp2.b_message;
                                                gkxp2.b |= 8;
                                                gkxp2.h = v4;
                                                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
                                                gkwx gkwx0 = gkwx.l;
                                                if(!hftp3.b_message.isImmutable()) {
                                                    hftp3.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv3 = hftp3.b_message;
                                                ((gkxt)hftv3).g = gkwx0.G;
                                                ((gkxt)hftv3).b |= 4;
                                                if(!hftv3.isImmutable()) {
                                                    hftp3.ensureMutable();
                                                }
                                                gkxt gkxt0 = (gkxt)hftp3.b_message;
                                                gkxp gkxp3 = (gkxp)hftp2.N_build();
                                                gkxp3.getClass();
                                                gkxt0.d = gkxp3;
                                                gkxt0.c = 17;
                                                gaxl.a();
                                                if(hzjr.a.b().b()) {
                                                    gkxt gkxt1 = (gkxt)hftp3.b_message;
                                                    if(gkxt1.c == 17) {
                                                        gkxp0 = (gkxp)gkxt1.d;
                                                    }
                                                    if(gkxp0.c == 5) {
                                                        gkxn0 = (gkxn)gkxp0.d;
                                                    }
                                                    for(Object object1: gkxn0.b) {
                                                        gkxm gkxm5 = (gkxm)object1;
                                                    }
                                                }
                                                gaym0.f(hftp3);
                                            }
                                            else {
                                                list1 = list0;
                                            }
                                            list1.clear();
                                        }
                                    }
                                }
                            }, ((long)hdzx0.e));
                        }
                    }
                }
            }
        }
    }

    // Detected as a lambda impl.
    public final void d() {
        List list1;
        if(this.e && this.b != null) {
            synchronized(this) {
                if(this.f) {
                    this.f = false;
                    gayq gayq0 = this.a;
                    if(gayq0.c) {
                        synchronized(gayq0) {
                            gayq0.a.remove(this);
                        }
                    }
                }
                List list0 = this.c;
                if(!list0.isEmpty()) {
                    gayq gayq1 = this.a;
                    hdzx hdzx0 = this.b;
                    gftb.check(hdzx0);
                    int v2 = gkwz.a(hdzx0.c) == 0 ? 1 : gkwz.a(hdzx0.c);
                    if(gayq1.c) {
                        gaym gaym0 = gayq1.e.g;
                        gkxn gkxn0 = gkxn.a;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxn0).v_newBuilder();
                        int v3 = 0;
                        int v4 = 0;
                        for(Object object0: list0) {
                            long v5 = ((FrameMetrics)object0).getMetric(8);
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkxm.a).v_newBuilder();
                            long v6 = ((FrameMetrics)object0).getMetric(9);
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gkxm gkxm0 = (gkxm)hftp1.b_message;
                            gkxm0.b |= 4;
                            gkxm0.e = v6;
                            long v7 = ((FrameMetrics)object0).getMetric(4);
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gkxm gkxm1 = (gkxm)hftp1.b_message;
                            gkxm1.b |= 2;
                            gkxm1.d = v7;
                            long v8 = ((FrameMetrics)object0).getMetric(3);
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((gkxm)hftv0).b |= 8;
                            ((gkxm)hftv0).f = v8;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gkxm gkxm2 = (gkxm)hftp1.b_message;
                            gkxm2.b |= 16;
                            gkxm2.g = v5;
                            if(v5 >= 16000000L) {
                                ++v3;
                            }
                            boolean z = v5 >= ((FrameMetrics)object0).getMetric(13);
                            if(z) {
                                ++v4;
                            }
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gkxm gkxm3 = (gkxm)hftp1.b_message;
                            gkxm3.b |= 1;
                            gkxm3.c = z;
                            gkxm gkxm4 = (gkxm)hftp1.N_build();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gkxn gkxn1 = (gkxn)hftp0.b_message;
                            gkxm4.getClass();
                            hfuo hfuo0 = gkxn1.b;
                            if(!hfuo0.c()) {
                                gkxn1.b = ProtoLiteMessage.E(hfuo0);
                            }
                            gkxn1.b.add(gkxm4);
                            list0 = list0;
                        }
                        list1 = list0;
                        gkxp gkxp0 = gkxp.a;
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkxp0).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gkxp)hftp2.b_message).e = v2 - 1;
                        ((gkxp)hftp2.b_message).b |= 1;
                        int v9 = list1.size();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp2.b_message;
                        ((gkxp)hftv1).b |= 2;
                        ((gkxp)hftv1).f = v9;
                        if(!hftv1.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gkxp gkxp1 = (gkxp)hftp2.b_message;
                        gkxn gkxn2 = (gkxn)hftp0.N_build();
                        gkxn2.getClass();
                        gkxp1.d = gkxn2;
                        gkxp1.c = 5;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp2.b_message;
                        ((gkxp)hftv2).b |= 4;
                        ((gkxp)hftv2).g = v3;
                        if(!hftv2.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gkxp gkxp2 = (gkxp)hftp2.b_message;
                        gkxp2.b |= 8;
                        gkxp2.h = v4;
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
                        gkwx gkwx0 = gkwx.l;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp3.b_message;
                        ((gkxt)hftv3).g = gkwx0.G;
                        ((gkxt)hftv3).b |= 4;
                        if(!hftv3.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        gkxt gkxt0 = (gkxt)hftp3.b_message;
                        gkxp gkxp3 = (gkxp)hftp2.N_build();
                        gkxp3.getClass();
                        gkxt0.d = gkxp3;
                        gkxt0.c = 17;
                        gaxl.a();
                        if(hzjr.a.b().b()) {
                            gkxt gkxt1 = (gkxt)hftp3.b_message;
                            if(gkxt1.c == 17) {
                                gkxp0 = (gkxp)gkxt1.d;
                            }
                            if(gkxp0.c == 5) {
                                gkxn0 = (gkxn)gkxp0.d;
                            }
                            for(Object object1: gkxn0.b) {
                                gkxm gkxm5 = (gkxm)object1;
                            }
                        }
                        gaym0.f(hftp3);
                    }
                    else {
                        list1 = list0;
                    }
                    list1.clear();
                }
            }
        }
    }
}

