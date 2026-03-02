import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.TrainingInterval;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cccg {
    public static TrainingInterval a(fnal fnal0) {
        return new TrainingInterval((fnak.a(fnal0.c) == 3 ? 0 : 1), hfyf.e((fnal0.d == null ? hfst.a : fnal0.d)));
    }

    public static fnaf b(InAppTrainerOptions inAppTrainerOptions0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fnaf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        inAppTrainerOptions0.d.getClass();
        ((fnaf)hftv0).c = inAppTrainerOptions0.d;
        int v = cccg.f(inAppTrainerOptions0.e);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fnaf fnaf0 = (fnaf)hftp0.b_message;
        fnaf0.d = fnae.a(v);
        TrainingInterval trainingInterval0 = inAppTrainerOptions0.j;
        if(trainingInterval0 != null) {
            fnal fnal0 = cccg.d(trainingInterval0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fnaf fnaf1 = (fnaf)hftp0.b_message;
            fnal0.getClass();
            fnaf1.e = fnal0;
            fnaf1.b |= 1;
        }
        return (fnaf)hftp0.N_build();
    }

    public static fnah c(InAppTrainerOptions inAppTrainerOptions0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fnah.a).v_newBuilder();
        String s = inAppTrainerOptions0.f.toString();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fnah fnah0 = (fnah)hftp0.b_message;
        s.getClass();
        fnah0.c = s;
        String s1 = inAppTrainerOptions0.i.toString();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fnah fnah1 = (fnah)hftp0.b_message;
        s1.getClass();
        fnah1.e = s1;
        fnal fnal0 = cccg.d(inAppTrainerOptions0.j);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fnah fnah2 = (fnah)hftp0.b_message;
        fnal0.getClass();
        fnah2.f = fnal0;
        fnah2.b |= 1;
        Uri uri0 = inAppTrainerOptions0.k;
        if(uri0 != null) {
            String s2 = uri0.toString();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fnah fnah3 = (fnah)hftp0.b_message;
            s2.getClass();
            fnah3.g = s2;
        }
        Bundle bundle0 = inAppTrainerOptions0.l;
        if(bundle0 != null) {
            List list0 = cccg.e(bundle0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fnah fnah4 = (fnah)hftp0.b_message;
            hfuo hfuo0 = fnah4.h;
            if(!hfuo0.c()) {
                fnah4.h = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, fnah4.h);
        }
        return (fnah)hftp0.N_build();
    }

    public static fnal d(TrainingInterval trainingInterval0) {
        if(trainingInterval0 == null) {
            return fnal.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fnal.a).v_newBuilder();
        int v = cccg.g(trainingInterval0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fnal)hftp0.b_message).c = v - 2;
        hfst hfst0 = hfyf.k(trainingInterval0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fnal fnal0 = (fnal)hftp0.b_message;
        hfst0.getClass();
        fnal0.d = hfst0;
        fnal0.b |= 1;
        return (fnal)hftp0.N_build();
    }

    public static List e(Bundle bundle0) {
        List list0 = new ArrayList();
        if(bundle0 != null) {
            ArrayList arrayList0 = new ArrayList(bundle0.keySet());
            Collections.sort(arrayList0);
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                String s = (String)arrayList0.get(v1);
                Uri uri0 = (Uri)bundle0.getParcelable(s);
                if(uri0 == null) {
                    throw new IllegalStateException("Empty input resource Uri.");
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fnag.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fnag fnag0 = (fnag)hftp0.b_message;
                s.getClass();
                fnag0.b = s;
                String s1 = uri0.toString();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fnag fnag1 = (fnag)hftp0.b_message;
                s1.getClass();
                fnag1.c = s1;
                list0.add(((fnag)hftp0.N_build()));
                ++v1;
                continue;
            }
        }
        return list0;
    }

    public static int f(int v) {
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 3;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }

    public static int g(int v) {
        if(v == 0) {
            return 3;
        }
        if(v == 1) {
            return 4;
        }
        throw new IllegalStateException("Unknown value for scheduling mode");
    }
}

