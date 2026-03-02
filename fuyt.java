import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.List;

public final class fuyt {
    public final ayud a;
    public final ayvm b;
    public final faik c;
    private static final Object d;
    private static fuyt e;
    private cczf f;
    private cczf g;

    static {
        fuyt.d = new Object();
    }

    public fuyt(Context context0) {
        ayud ayud0 = new aytt(context0, "ACTIVITY_RECOGNITION").a();
        faik faik0 = faih.a(context0);
        super();
        this.b = fhbe.b(context0, new gwii());
        this.a = ayud0;
        this.c = faik0;
        if(humr.k()) {
            this.f = cfwx.v();
        }
        if(humr.j()) {
            this.g = cfvy.v();
        }
    }

    public static fuyt a(Context context0) {
        synchronized(fuyt.d) {
            if(fuyt.e == null) {
                fuyt.e = new fuyt(context0.getApplicationContext());
            }
        }
        return fuyt.e;
    }

    public final void b(gwis gwis0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwis0.getClass();
        gwik0.n = gwis0;
        gwik0.b |= 0x400;
        gwik gwik1 = (gwik)hftp0.N_build();
        ayuc ayuc0 = this.a.i(((MessageLite)gwik1));
        ayuc0.k(12);
        if(humr.q()) {
            ayuc0.o = this.b;
        }
        ayuc0.d();
    }

    public final void c(String s, String s1, long v, ActivityRecognitionRequest activityRecognitionRequest0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwip.a).v_newBuilder();
        gwiz gwiz0 = fuyt.p(s, s1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gwiz0.getClass();
        ((gwip)hftv0).c = gwiz0;
        ((gwip)hftv0).b |= 1;
        long v1 = activityRecognitionRequest0.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwip)hftv1).b |= 2;
        ((gwip)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwip gwip0 = (gwip)hftp1.b_message;
        gwip0.b |= 4;
        gwip0.e = v;
        gwip gwip1 = (gwip)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwip1.getClass();
        gwik0.d = gwip1;
        gwik0.b |= 1;
        gwik gwik1 = (gwik)hftp0.N_build();
        ayuc ayuc0 = this.a.i(((MessageLite)gwik1));
        ayuc0.k(1);
        if(humr.q()) {
            ayuc0.o = this.b;
        }
        ayuc0.d();
    }

    public final void d(List list0, List list1, long v) {
        gwiq gwiq0 = null;
        if(list0 != null && !list0.isEmpty() && list1 != null && !list1.isEmpty()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwiq.a).v_newBuilder();
            for(int v1 = 0; v1 < list1.size(); ++v1) {
                gwiz gwiz0 = fuyt.p(((String)list1.get(v1)), null);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwiq gwiq1 = (gwiq)hftp0.b_message;
                gwiz0.getClass();
                hfuo hfuo0 = gwiq1.b;
                if(!hfuo0.c()) {
                    gwiq1.b = ProtoLiteMessage.E(hfuo0);
                }
                gwiq1.b.add(gwiz0);
            }
            int v2 = 0;
            while(v2 < list0.size()) {
                ActivityRecognitionResult activityRecognitionResult0 = (ActivityRecognitionResult)list0.get(v2);
                if(activityRecognitionResult0 != null) {
                    List list2 = activityRecognitionResult0.a;
                    if(list2 != null && !list2.isEmpty()) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwjb.a).v_newBuilder();
                        for(int v3 = 0; v3 < list2.size(); ++v3) {
                            DetectedActivity detectedActivity0 = (DetectedActivity)list2.get(v3);
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwja.a).v_newBuilder();
                            int v4 = detectedActivity0.a();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp2.b_message;
                            ((gwja)hftv0).b |= 4;
                            ((gwja)hftv0).d = v4;
                            float f = (float)detectedActivity0.e;
                            if(!hftv0.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwja gwja0 = (gwja)hftp2.b_message;
                            gwja0.b |= 2;
                            gwja0.c = f;
                            gwja gwja1 = (gwja)hftp2.N_build();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gwjb gwjb0 = (gwjb)hftp1.b_message;
                            gwja1.getClass();
                            hfuo hfuo1 = gwjb0.c;
                            if(!hfuo1.c()) {
                                gwjb0.c = ProtoLiteMessage.E(hfuo1);
                            }
                            gwjb0.c.add(gwja1);
                        }
                        long v5 = activityRecognitionResult0.b;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp1.b_message;
                        ((gwjb)hftv1).b |= 1;
                        ((gwjb)hftv1).d = v5;
                        if(!hftv1.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp1.b_message;
                        ((gwjb)hftv2).b |= 2;
                        ((gwjb)hftv2).e = v;
                        int v6 = activityRecognitionResult0.d;
                        if(!hftv2.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gwjb gwjb1 = (gwjb)hftp1.b_message;
                        gwjb1.b |= 4;
                        gwjb1.f = v6;
                        gwiq0 = (gwjb)hftp1.N_build();
                    }
                }
                if(gwiq0 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwiq gwiq2 = (gwiq)hftp0.b_message;
                    hfuo hfuo2 = gwiq2.c;
                    if(!hfuo2.c()) {
                        gwiq2.c = ProtoLiteMessage.E(hfuo2);
                    }
                    gwiq2.c.add(gwiq0);
                }
                ++v2;
                gwiq0 = null;
            }
            gwiq0 = (gwiq)hftp0.N_build();
        }
        if(gwiq0 != null) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gwik)hftp3.b_message).e = gwiq0;
            ((gwik)hftp3.b_message).b |= 2;
            gwik gwik0 = (gwik)hftp3.N_build();
            if(!humr.j()) {
                goto label_92;
            }
            cczf cczf0 = this.g;
            if(cczf0 != null) {
                ((cdgb)cczf0).j(((ProtoLiteMessage)gwik0));
                return;
            label_92:
                ayuc ayuc0 = this.a.i(((MessageLite)gwik0));
                ayuc0.k(2);
                if(humr.q()) {
                    ayuc0.o = this.b;
                }
                ayuc0.d();
            }
        }
    }

    public final void e(int v, int v1, long v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        gwja gwja0 = gwja.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwja0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gwja)hftv0).b |= 4;
        ((gwja)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwja gwja1 = (gwja)hftp1.b_message;
        gwja1.b |= 2;
        gwja1.c = 100.0f;
        gwja gwja2 = (gwja)hftp1.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwja0).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gwja)hftv1).b |= 4;
        ((gwja)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwja gwja3 = (gwja)hftp2.b_message;
        gwja3.b |= 2;
        gwja3.c = 100.0f;
        gwja gwja4 = (gwja)hftp2.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwir.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        gwja2.getClass();
        ((gwir)hftv2).c = gwja2;
        ((gwir)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        gwja4.getClass();
        ((gwir)hftv3).d = gwja4;
        ((gwir)hftv3).b |= 2;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        gwir gwir0 = (gwir)hftp3.b_message;
        gwir0.b |= 4;
        gwir0.e = v2;
        gwir gwir1 = (gwir)hftp3.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwir1.getClass();
        gwik0.g = gwir1;
        gwik0.b |= 8;
        gwik gwik1 = (gwik)hftp0.N_build();
        if(humr.k()) {
            cczf cczf0 = this.f;
            if(cczf0 != null) {
                ((cdgb)cczf0).j(((ProtoLiteMessage)gwik1));
            }
            return;
        }
        ayuc ayuc0 = this.a.i(((MessageLite)gwik1));
        ayuc0.k(5);
        if(humr.q()) {
            ayuc0.o = this.b;
        }
        ayuc0.d();
    }

    public final void f(gwkr gwkr0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwko.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gwko)hftp1.b_message).d = gwkr0.Y;
        ((gwko)hftp1.b_message).b |= 2;
        gwko gwko0 = (gwko)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwko0.getClass();
        gwik0.t = gwko0;
        gwik0.b |= 0x10000;
        gwik gwik1 = (gwik)hftp0.N_build();
        cczb cczb0 = ceem.v().c(((ProtoLiteMessage)gwik1));
        cczb0.c = (int)18;
        cczb0.a();
    }

    public final void g(gwkv gwkv0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwkp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gwkp)hftp1.b_message).d = gwkv0.W;
        ((gwkp)hftp1.b_message).b |= 2;
        gwkp gwkp0 = (gwkp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwkp0.getClass();
        gwik0.s = gwkp0;
        gwik0.b |= 0x8000;
        gwik gwik1 = (gwik)hftp0.N_build();
        cczb cczb0 = ceep.v().c(((ProtoLiteMessage)gwik1));
        cczb0.c = (int)17;
        cczb0.a();
    }

    public final void h(gwov gwov0) {
        if(humr.l()) {
            this.c.cp().b(new fuyq(this, gwov0));
            return;
        }
        this.i(gwov0);
    }

    public final void i(gwov gwov0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwov0.getClass();
        gwik0.r = gwov0;
        gwik0.b |= 0x4000;
        gwik gwik1 = (gwik)hftp0.N_build();
        ayuc ayuc0 = this.a.i(((MessageLite)gwik1));
        ayuc0.k(16);
        if(huwz.a.h().B()) {
            ayuc0.o = this.b;
        }
        ayuc0.d();
    }

    public final void j(String s, String s1, int v, long v1) {
        if(humr.l()) {
            this.c.cp().b(new fuyr(this, s, s1, v, v1));
            return;
        }
        this.k(s, s1, v, v1);
    }

    public final void k(String s, String s1, int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwio.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gwio)hftp1.b_message).c = v - 1;
        ((gwio)hftp1.b_message).b |= 1;
        gwiz gwiz0 = fuyt.p(s, s1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gwiz0.getClass();
        ((gwio)hftv0).d = gwiz0;
        ((gwio)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwio)hftv1).e = 1;
        ((gwio)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwio gwio0 = (gwio)hftp1.b_message;
        gwio0.b |= 8;
        gwio0.f = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwio gwio1 = (gwio)hftp1.N_build();
        gwio1.getClass();
        gwik0.j = gwio1;
        gwik0.b |= 0x40;
        gwik gwik1 = (gwik)hftp0.N_build();
        ayuc ayuc0 = this.a.i(((MessageLite)gwik1));
        ayuc0.k(8);
        if(humr.q()) {
            ayuc0.o = this.b;
        }
        ayuc0.d();
    }

    public final void l(int v) {
        if(humr.l()) {
            this.c.cp().b(new fuyn(this, v));
            return;
        }
        this.m(v);
    }

    public final void m(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwkk.a).v_newBuilder();
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwkk)hftv0).b |= 2;
        ((gwkk)hftv0).d = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwkk)hftp0.b_message).c = v - 1;
        ((gwkk)hftp0.b_message).b |= 1;
        gwkk gwkk0 = (gwkk)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp1.b_message;
        gwkk0.getClass();
        gwik0.i = gwkk0;
        gwik0.b |= 0x20;
        gwik gwik1 = (gwik)hftp1.N_build();
        ayuc ayuc0 = this.a.i(((MessageLite)gwik1));
        ayuc0.k(7);
        if(huue.a.f().o()) {
            cczb cczb0 = cees.v().c(((ProtoLiteMessage)gwik1));
            cczb0.c = (int)7;
            cczb0.a();
            return;
        }
        if(humr.q()) {
            ayuc0.o = this.b;
        }
        ayuc0.d();
    }

    public final void n(boolean z, int v) {
        if(huue.k()) {
            this.o(z, v);
            return;
        }
        if(humr.l()) {
            this.c.cp().b(new fuyl(this, z, v));
            return;
        }
        this.o(z, v);
    }

    public final void o(boolean z, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwki.a).v_newBuilder();
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwki)hftv0).b |= 1;
        ((gwki)hftv0).c = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwki)hftv1).b |= 2;
        ((gwki)hftv1).d = z;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwki)hftp0.b_message).e = v - 1;
        ((gwki)hftp0.b_message).b |= 0x40;
        gwki gwki0 = (gwki)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp1.b_message;
        gwki0.getClass();
        gwik0.f = gwki0;
        gwik0.b |= 4;
        gwik gwik1 = (gwik)hftp1.N_build();
        ayuc ayuc0 = this.a.i(((MessageLite)gwik1));
        ayuc0.k(4);
        if(humr.q()) {
            ayuc0.o = this.b;
        }
        ayuc0.d();
    }

    private static gwiz p(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwiz.a).v_newBuilder();
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwiz gwiz0 = (gwiz)hftp0.b_message;
            s.getClass();
            gwiz0.b |= 1;
            gwiz0.c = s;
        }
        if(!TextUtils.isEmpty(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwiz gwiz1 = (gwiz)hftp0.b_message;
            s1.getClass();
            gwiz1.b |= 2;
            gwiz1.d = s1;
        }
        return (gwiz)hftp0.N_build();
    }
}

