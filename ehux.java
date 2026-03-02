import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.LocationResult;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;

public final class ehux extends cmoa implements LocationListener, eifk {
    public final ehuz a;
    public final Set b;
    private final eicb c;
    private final long d;
    private int e;
    private long f;

    public ehux(ehuz ehuz0, eicb eicb0, long v) {
        this.b = new HashSet();
        this.e = 0;
        this.f = 0L;
        this.a = ehuz0;
        this.c = eicb0;
        this.d = v;
    }

    static float b(ehup ehup0, ehup ehup1) {
        gftb.check(ehup0);
        return ehuo.a(ehup0, ehup1);
    }

    protected final void c(eiiz eiiz0, gwhe gwhe0, ehup ehup0) {
        switch((gwhd.a(gwhe0.c) == 0 ? 1 : gwhd.a(gwhe0.c)) - 1) {
            case 1: {
                eiiz0.c();
                return;
            }
            case 2: {
                eiiz0.d();
                return;
            }
            case 4: {
                eiiz0.e();
                eicb eicb0 = this.c;
                long v = System.currentTimeMillis();
                gwoa gwoa0 = gwoa.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwnf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gwnf)hftv0).b |= 1;
                ((gwnf)hftv0).c = v;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwnf gwnf0 = (gwnf)hftp0.b_message;
                gwoa0.getClass();
                gwnf0.e = gwoa0;
                gwnf0.b |= 4;
                gwnf gwnf1 = (gwnf)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwik gwik0 = (gwik)hftp1.b_message;
                gwnf1.getClass();
                gwik0.P = gwnf1;
                gwik0.c |= 0x40;
                eicb0.o(((gwik)hftp1.N_build()), 41);
                return;
            }
            case 5: {
                eiiz0.e();
                eicb eicb1 = this.c;
                long v1 = System.currentTimeMillis();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwnf.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gwnf gwnf2 = (gwnf)hftp2.b_message;
                gwnf2.b |= 1;
                gwnf2.c = v1;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwml.a).v_newBuilder();
                gwmk gwmk0 = eicb.c(ehup0);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gwml gwml0 = (gwml)hftp3.b_message;
                gwmk0.getClass();
                gwml0.c = gwmk0;
                gwml0.b |= 1;
                gwml gwml1 = (gwml)hftp3.N_build();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                gwml1.getClass();
                ((gwnf)hftv1).h = gwml1;
                ((gwnf)hftv1).b |= 0x20;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gwnf)hftp2.b_message).d = 4;
                ((gwnf)hftp2.b_message).b |= 2;
                gwnf gwnf3 = (gwnf)hftp2.N_build();
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gwik gwik1 = (gwik)hftp4.b_message;
                gwnf3.getClass();
                gwik1.P = gwnf3;
                gwik1.c |= 0x40;
                eicb1.o(((gwik)hftp4.N_build()), 41);
            }
        }
    }

    @Override  // eifk
    public final void d(ActivityRecognitionResult activityRecognitionResult0) {
        gwhe gwhe0;
        int v2;
        DetectedActivity detectedActivity0 = activityRecognitionResult0.d();
        ehug ehug0 = new ehug();
        ehug0.e(detectedActivity0.a());
        ehug0.c(((float)detectedActivity0.e));
        ehug0.d(activityRecognitionResult0.c);
        ehug0.b(activityRecognitionResult0.b);
        ehuh ehuh0 = ehug0.a();
        int v = ehuh0.a;
        int v1 = 0;
        if(v == 0) {
            v2 = this.e + (ehuh0.b >= 95.0f ? 1 : 0);
        }
        else if(v == 5) {
            v2 = this.e;
            v = 5;
        }
        else {
            v2 = 0;
        }
        this.e = v2;
        if(v2 == 3) {
            for(Object object0: this.b) {
                eiiz eiiz0 = (eiiz)object0;
                if(eiiz0.g() == 2) {
                    eigb eigb0 = eiiz0.b;
                    hrtd.K();
                    if(hrtd.K()) {
                        evql evql0 = eigb0.c.c(eigb0.e, null);
                        evql0.b(new eify(eigb0));
                        evql0.A(new eifz());
                    }
                }
            }
        }
        ehut ehut0 = this.a.b;
        NavigableMap navigableMap0 = ehut0.e;
        if(navigableMap0.size() >= 200) {
            navigableMap0.remove(navigableMap0.firstKey());
        }
        long v3 = ehuh0.c;
        navigableMap0.put(Long.valueOf(v3), ehuh0);
        if(ehut.a.containsKey(Integer.valueOf(v))) {
            ehut0.d = 0;
            ehut0.c = 0L;
            ehut0.b = false;
        }
        else {
            int v4 = ehut0.d;
            if(v4 == 0) {
                ehut0.c = v3;
            }
            else {
                v1 = v4;
            }
            ++v1;
            ehut0.d = v1;
        }
        if(!ehut0.b && ((long)v1) >= ehut0.f.i && v3 >= ehut0.c + ehut0.f.j) {
            ehut0.b = true;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwhe.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gwhe)hftp0.b_message).c = 2;
            ((gwhe)hftp0.b_message).b |= 1;
            gwhe0 = (gwhe)hftp0.N_build();
        }
        else {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwhe.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gwhe)hftp1.b_message).c = 3;
            ((gwhe)hftp1.b_message).b |= 1;
            gwhe0 = (gwhe)hftp1.N_build();
        }
        for(Object object1: this.b) {
            eiiz eiiz1 = (eiiz)object1;
            int v5 = gwhe0.c;
            if(gwhd.a(v5) == 2) {
                eiiz1.c();
            }
            else {
                if(gwhd.a(v5) != 3) {
                    continue;
                }
                eiiz1.d();
            }
        }
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        if(hrtd.P() && locationResult0 != null) {
            List list0 = locationResult0.b;
            if(!list0.isEmpty()) {
                gwhe gwhe0 = null;
                ehup ehup0 = null;
                for(Object object0: list0) {
                    Location location0 = (Location)object0;
                    if((!location0.isMock() || hrtd.J()) && location0.hasAccuracy() && location0.getElapsedRealtimeNanos() >= this.f) {
                        this.f = location0.getElapsedRealtimeNanos();
                        ehup0 = ehuo.c(location0, this.d, System.currentTimeMillis());
                        gwhe0 = this.a.b(ehup0);
                    }
                }
                if(gwhe0 != null && ehup0 != null) {
                    for(Object object1: this.b) {
                        this.c(((eiiz)object1), gwhe0, ehup0);
                    }
                }
            }
        }
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(Location location0) {
        if(location0.isMock() && !hrtd.J()) {
            return;
        }
        if(location0.hasAccuracy()) {
            ehup ehup0 = ehuo.c(location0, this.d, System.currentTimeMillis());
            gwhe gwhe0 = this.a.b(ehup0);
            for(Object object0: this.b) {
                this.c(((eiiz)object0), gwhe0, ehup0);
            }
        }
    }
}

