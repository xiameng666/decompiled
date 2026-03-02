import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.ArrayList;
import java.util.List;

public final class gapa extends gaok {
    private final fbou b;

    public gapa(gamx gamx0, fbou fbou0) {
        super(gamx0);
        this.b = fbou0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        gkwm gkwm0;
        List list0 = gawi.o(gano0.a, "features", ((MessageLite)hdff.a));
        gaym gaym0 = this.f();
        ibuq.f(list0, "featureList");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkyd.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkyc.a).v_newBuilder();
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            hdff hdff0 = (hdff)object0;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkya.a).v_newBuilder();
            String s = hdff0.c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s.getClass();
            ((gkya)hftv0).b |= 1;
            ((gkya)hftv0).c = s;
            if((hdff0.b & 2) != 0) {
                long v = hdff0.d;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkya gkya0 = (gkya)hftp2.b_message;
                gkya0.b |= 2;
                gkya0.d = v;
            }
            arrayList0.add(((gkya)hftp2.N_build()));
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkyc gkyc0 = (gkyc)hftp1.b_message;
        hfuo hfuo0 = gkyc0.b;
        if(!hfuo0.c()) {
            gkyc0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, gkyc0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkyd gkyd0 = (gkyd)hftp0.b_message;
        gkyc gkyc1 = (gkyc)hftp1.N_build();
        gkyc1.getClass();
        gkyd0.c = gkyc1;
        gkyd0.b = 1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx0 = gkwx.u;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((gkxt)hftv2).g = gkwx0.G;
        ((gkxt)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp3.b_message;
        ((gkyd)hftv1).getClass();
        gkxt0.d = (gkyd)hftv1;
        gkxt0.c = 26;
        gaym0.f(hftp3);
        fbou fbou0 = this.b;
        boolean z = fbou0.a(list0) == 1;
        ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
        moduleManager$FeatureRequest0.setUrgent();
        for(Object object1: list0) {
            hdff hdff1 = (hdff)object1;
            moduleManager$FeatureRequest0 = (hdff1.b & 2) == 0 ? moduleManager$FeatureRequest0.requestFeatureAtAnyVersion(hdff1.c) : moduleManager$FeatureRequest0.requestFeatureAtVersion(hdff1.c, hdff1.d);
        }
        boolean z1 = fbou0.a.requestFeatures(moduleManager$FeatureRequest0);
        Intent intent0 = null;
        if(Log.isLoggable("OptionalModuleAction", 4)) {
            Log.i("OptionalModuleAction", "Request feature result: " + z1);
        }
        boolean z2 = false;
        int v1 = 0;
        while(intent0 == null) {
            if(Thread.currentThread().isInterrupted()) {
                intent0 = ganp.e(4);
                z2 = true;
            }
            else {
                v1 = fbou0.a(list0);
                switch(v1) {
                    case 1: {
                        intent0 = ganp.e(0);
                        break;
                    }
                    case 2: {
                        intent0 = ganp.d(2);
                        break;
                    }
                    case 3: {
                        intent0 = ganp.d(3);
                    }
                }
                try {
                    gaxl.a();
                    Thread.sleep(((int)hzik.a.b().a()));
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        gaym gaym1 = this.f();
        if(z2) {
            gkwm0 = gkwm.c;
        }
        else {
            switch(v1) {
                case 0: {
                    gkwm0 = gkwm.a;
                    break;
                }
                case 1: {
                    gkwm0 = gkwm.b;
                    break;
                }
                case 2: {
                    gkwm0 = gkwm.d;
                    break;
                }
                case 3: {
                    gkwm0 = gkwm.f;
                    break;
                }
                default: {
                    gkwm0 = gkwm.e;
                }
            }
        }
        ibuq.f(gkwm0, "optionalFeatureStatusType");
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gkyd.a).v_newBuilder();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gkyb.a).v_newBuilder();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp5.b_message;
        ((gkyb)hftv3).d = gkwm0.g;
        ((gkyb)hftv3).b |= 2;
        if(!hftv3.isImmutable()) {
            hftp5.ensureMutable();
        }
        gkyb gkyb0 = (gkyb)hftp5.b_message;
        gkyb0.b |= 1;
        gkyb0.c = z;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gkyd gkyd1 = (gkyd)hftp4.b_message;
        gkyb gkyb1 = (gkyb)hftp5.N_build();
        gkyb1.getClass();
        gkyd1.c = gkyb1;
        gkyd1.b = 2;
        ProtoLiteMessage hftv4 = hftp4.N_build();
        ibuq.e(hftv4, "build(...)");
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx1 = gkwx.v;
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp6.b_message;
        ((gkxt)hftv5).g = gkwx1.G;
        ((gkxt)hftv5).b |= 4;
        if(!hftv5.isImmutable()) {
            hftp6.ensureMutable();
        }
        gkxt gkxt1 = (gkxt)hftp6.b_message;
        ((gkyd)hftv4).getClass();
        gkxt1.d = (gkyd)hftv4;
        gkxt1.c = 26;
        gaym1.f(hftp6);
        return new ganp(intent0);
    }

    public static gano b(WidgetConfig widgetConfig0, int v, List list0) {
        Intent intent0 = gano.c("CheckOptionalModuleAvailabilityAction", widgetConfig0, v);
        gawi.s(intent0, "features", list0);
        return new gano(intent0);
    }
}

