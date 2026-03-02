import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.List;

public final class fxpu {
    private final fxts a;
    private final fxqn b;
    private final fxsw c;

    public fxpu(fxts fxts0, fxqn fxqn0, fxsw fxsw0) {
        this.a = fxts0;
        this.b = fxqn0;
        this.c = fxsw0;
    }

    public final void a(Intent intent0, ReportingConfig reportingConfig0) {
        fxbp fxbp0;
        if(!reportingConfig0.e()) {
            fxpy.b(reportingConfig0, this.c);
            return;
        }
        ActivityRecognitionResult activityRecognitionResult0 = ActivityRecognitionResult.c(intent0);
        if(activityRecognitionResult0 == null) {
            fxqw.h(new IllegalStateException(intent0 + " has no activity"));
            return;
        }
        fxts fxts0 = this.a;
        fxts0.b = activityRecognitionResult0;
        if(fxrc.q()) {
            fxrc.a.a();
        }
        long v = activityRecognitionResult0.c;
        if(v <= 0L) {
            Log.wtf("GCoreUlr", new IllegalArgumentException("No realtime in activity result: " + activityRecognitionResult0.toString()));
            return;
        }
        ActivityRecognitionResult activityRecognitionResult1 = fxts0.g();
        if(activityRecognitionResult1 != null && activityRecognitionResult1.d().a() == activityRecognitionResult0.d().a() && v - activityRecognitionResult1.c <= hzek.a.i().d()) {
            return;
        }
        fxts0.r(activityRecognitionResult0);
        fxra.i("UlrActivityReceived", reportingConfig0);
        fxqn fxqn0 = this.b;
        List list0 = reportingConfig0.c();
        synchronized(fxqn0.c) {
            if(fxqn0.d == null) {
                return;
            }
            if(activityRecognitionResult0.a.isEmpty()) {
                fxbp0 = null;
            }
            else {
                fxbo fxbo0 = (fxbo)((ProtoLiteMessage)fxbp.a).v_newBuilder();
                long v2 = activityRecognitionResult0.c;
                if(!fxbo0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fxbo0).ensureMutable();
                }
                fxbp fxbp1 = (fxbp)fxbo0.b_message;
                fxbp1.b |= 1;
                fxbp1.d = v2;
                long v3 = activityRecognitionResult0.b;
                if(!fxbo0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fxbo0).ensureMutable();
                }
                fxbp fxbp2 = (fxbp)fxbo0.b_message;
                fxbp2.b |= 2;
                fxbp2.e = v3;
                for(Object object1: activityRecognitionResult0.a) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fxbu.a).v_newBuilder();
                    int v4 = fwsb.b(((DetectedActivity)object1).a());
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((fxbu)hftv0).c = v4;
                    ((fxbu)hftv0).b |= 1;
                    int v5 = ((DetectedActivity)object1).e;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fxbu fxbu0 = (fxbu)hftp0.b_message;
                    fxbu0.b |= 2;
                    fxbu0.d = v5;
                    fxbo0.a(((fxbu)hftp0.N_build()));
                }
                Bundle bundle0 = activityRecognitionResult0.b();
                if(bundle0 != null) {
                    for(Object object2: bundle0.keySet()) {
                        String s = (String)object2;
                        Object object3 = bundle0.get(s);
                        if(object3 != null) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fxbr.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp1.b_message;
                            s.getClass();
                            ((fxbr)hftv1).b |= 2;
                            ((fxbr)hftv1).f = s;
                            if((object3 instanceof Integer)) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).c = 3;
                                ((fxbr)hftp1.b_message).d = (Integer)object3;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).e = 1;
                            }
                            else if((object3 instanceof Boolean)) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).c = 8;
                                ((fxbr)hftp1.b_message).d = (Boolean)object3;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).e = 1;
                            }
                            else if((object3 instanceof Double)) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).c = 6;
                                ((fxbr)hftp1.b_message).d = (Double)object3;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).e = 1;
                            }
                            else if((object3 instanceof Float)) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).c = 5;
                                ((fxbr)hftp1.b_message).d = (Float)object3;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).e = 1;
                            }
                            else if((object3 instanceof Long)) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).c = 4;
                                ((fxbr)hftp1.b_message).d = (Long)object3;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).e = 1;
                            }
                            else if((object3 instanceof String)) {
                                if(!hftv1.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv2 = hftp1.b_message;
                                ((fxbr)hftv2).c = 7;
                                ((fxbr)hftv2).d = (String)object3;
                                if(!hftv2.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).e = 1;
                            }
                            else {
                                if(!hftv1.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxbr)hftp1.b_message).e = 0;
                            }
                            ((fxbr)hftp1.b_message).b |= 1;
                            if(!fxbo0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)fxbo0).ensureMutable();
                            }
                            fxbp fxbp3 = (fxbp)fxbo0.b_message;
                            fxbr fxbr0 = (fxbr)hftp1.N_build();
                            fxbr0.getClass();
                            hfuo hfuo0 = fxbp3.f;
                            if(!hfuo0.c()) {
                                fxbp3.f = ProtoLiteMessage.E(hfuo0);
                            }
                            fxbp3.f.add(fxbr0);
                        }
                    }
                }
                fxbp0 = (fxbp)((ProtoLiteBuilder)fxbo0).N_build();
            }
            fxqm fxqm0 = new fxqm();
            try {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fxrq.a).v_newBuilder();
                if(fxbp0 != null) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((fxrq)hftp2.b_message).d = fxbp0;
                    ((fxrq)hftp2.b_message).b |= 2;
                }
                fxqn0.g(fxqm0, list0, activityRecognitionResult0.b, ((fxrq)hftp2.N_build()), "Activity");
                fxqn0.d(fxqm0, "Activity");
            }
            finally {
                fxqm0.a();
            }
        }
    }
}

