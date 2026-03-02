import android.hardware.biometrics.BiometricManager;
import j..time.Duration;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class eyff implements ibts {
    public final gzyz a;
    public final gzym b;
    public final gzyj c;
    public final Duration d;
    public final Duration e;
    public final Duration f;
    public final Duration g;
    public final eyfl h;
    public final int i;

    public eyff(gzyz gzyz0, gzym gzym0, int v, gzyj gzyj0, Duration duration0, Duration duration1, Duration duration2, Duration duration3, eyfl eyfl0) {
        this.a = gzyz0;
        this.b = gzym0;
        this.i = v;
        this.c = gzyj0;
        this.d = duration0;
        this.e = duration1;
        this.f = duration2;
        this.g = duration3;
        this.h = eyfl0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gzyu gzyu0;
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ((gzxd)object0).b(gzxz.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzzb.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzyz gzyz0 = this.a;
        ibuq.f(gzyz0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyj gzyj0 = this.c;
        gzzb gzzb0 = (gzzb)hftp0.b_message;
        gzzb0.c = gzyz0.a();
        gzxj gzxj0 = gzxi.a(((ProtoLiteMessage)gzyg.a).v_newBuilder());
        gzxj0.c(((int)(homc.b() * 1000.0)));
        gzxj0.d(((int)homc.f()));
        if(gzyj0 != null) {
            gzxj0.b(gzyj0);
        }
        gzyg gzyg0 = gzxj0.a();
        ibuq.f(gzyg0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Duration duration0 = this.d;
        gzzb gzzb1 = (gzzb)hftp0.b_message;
        gzyg0.getClass();
        gzzb1.d = gzyg0;
        gzzb1.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzza.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        if(duration0 != null) {
            hfst hfst0 = hfyo.a(duration0);
            ibuq.f(hfst0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzza gzza0 = (gzza)hftp1.b_message;
            hfst0.getClass();
            gzza0.d = hfst0;
            gzza0.b |= 2;
        }
        Duration duration1 = this.e;
        if(duration1 != null) {
            hfst hfst1 = hfyo.a(duration1);
            ibuq.f(hfst1, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzza gzza1 = (gzza)hftp1.b_message;
            hfst1.getClass();
            gzza1.e = hfst1;
            gzza1.b |= 4;
        }
        Duration duration2 = this.f;
        if(duration2 != null) {
            hfst hfst2 = hfyo.a(duration2);
            ibuq.f(hfst2, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzza gzza2 = (gzza)hftp1.b_message;
            hfst2.getClass();
            gzza2.c = hfst2;
            gzza2.b |= 1;
        }
        Duration duration3 = this.g;
        if(duration3 != null) {
            hfst hfst3 = hfyo.a(duration3);
            ibuq.f(hfst3, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzza gzza3 = (gzza)hftp1.b_message;
            hfst3.getClass();
            gzza3.f = hfst3;
            gzza3.b |= 8;
        }
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzza)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzb gzzb2 = (gzzb)hftp0.b_message;
        ((gzza)hftv0).getClass();
        gzzb2.e = (gzza)hftv0;
        gzzb2.b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzyv.b).v_newBuilder();
        ibuq.f(hftp2, "builder");
        BiometricManager biometricManager0 = this.h.c;
        if(biometricManager0.canAuthenticate(15) == 0) {
            gzxk.a(hftp2);
            gzxk.b(gzys.c, hftp2);
        }
        if(biometricManager0.canAuthenticate(0xFF) == 0) {
            gzxk.a(hftp2);
            gzxk.b(gzys.d, hftp2);
        }
        if(gzxk.a(hftp2).isEmpty()) {
            gzxk.a(hftp2);
            gzxk.b(gzys.a, hftp2);
        }
        List list0 = DesugarCollections.unmodifiableList(((gzyv)hftp2.b_message).d);
        ibuq.e(list0, "getTriggerConfigList(...)");
        new hfxu(list0);
        hfuo hfuo0 = homc.h().b;
        ibuq.e(hfuo0, "getTriggersList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object1: hfuo0) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzyt.a).v_newBuilder();
            ibuq.f(hftp3, "builder");
            exln exln0 = exln.b(((exns)object1).b);
            if(exln0 == null) {
                exln0 = exln.i;
            }
            ibuq.e(exln0, "getTriggerType(...)");
            switch(exln0.ordinal()) {
                case 1: {
                    gzyu0 = gzyu.b;
                    break;
                }
                case 2: {
                    gzyu0 = gzyu.c;
                    break;
                }
                case 3: {
                    gzyu0 = gzyu.d;
                    break;
                }
                case 4: {
                    gzyu0 = gzyu.e;
                    break;
                }
                case 5: {
                    gzyu0 = gzyu.f;
                    break;
                }
                case 6: {
                    gzyu0 = gzyu.g;
                    break;
                }
                case 7: {
                    gzyu0 = gzyu.h;
                    break;
                }
                case 0: 
                case 8: {
                    gzyu0 = gzyu.a;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            ibuq.f(gzyu0, "value");
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gzyt gzyt0 = (gzyt)hftp3.b_message;
            gzyt0.b = gzyu0.a();
            List list1 = DesugarCollections.unmodifiableList(((gzyt)hftp3.b_message).c);
            ibuq.e(list1, "getFlagsList(...)");
            new hfxu(list1);
            hfuf hfuf0 = ((exns)object1).c;
            ibuq.e(hfuf0, "getFlagsList(...)");
            ibuq.f(hfuf0, "values");
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gzyt gzyt1 = (gzyt)hftp3.b_message;
            hfuf hfuf1 = gzyt1.c;
            if(!hfuf1.c()) {
                gzyt1.c = ProtoLiteMessage.C(hfuf1);
            }
            hfrj.E(hfuf0, gzyt1.c);
            ProtoLiteMessage hftv1 = hftp3.N_build();
            ibuq.e(hftv1, "build(...)");
            arrayList0.add(((gzyt)hftv1));
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gzyv gzyv0 = (gzyv)hftp2.b_message;
        hfuo hfuo1 = gzyv0.d;
        if(!hfuo1.c()) {
            gzyv0.d = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList0, gzyv0.d);
        ProtoLiteMessage hftv2 = hftp2.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((gzyv)hftv2), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzym gzym0 = this.b;
        gzzb gzzb3 = (gzzb)hftp0.b_message;
        ((gzyv)hftv2).getClass();
        gzzb3.f = (gzyv)hftv2;
        gzzb3.b |= 4;
        ibuq.f(gzym0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = this.i;
        gzzb gzzb4 = (gzzb)hftp0.b_message;
        gzzb4.g = gzym0.a();
        if(v != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzzb gzzb5 = (gzzb)hftp0.b_message;
            if(v == 1) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            gzzb5.h = v - 2;
        }
        ProtoLiteMessage hftv3 = hftp0.N_build();
        ibuq.e(hftv3, "build(...)");
        ibuq.f(((gzzb)hftv3), "value");
        ProtoLiteBuilder hftp4 = ((gzxd)object0).a;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp4.b_message;
        ((gzzb)hftv3).getClass();
        gzzc0.d = (gzzb)hftv3;
        gzzc0.c = 2;
        return ibom.a;
    }
}

