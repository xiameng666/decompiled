import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.semanticlocation.ActivityCandidate;
import com.google.android.gms.semanticlocation.ActivityEndEvent;
import com.google.android.gms.semanticlocation.ActivityOngoingEvent;
import com.google.android.gms.semanticlocation.ActivityStartEvent;
import com.google.android.gms.semanticlocation.AdditionalActivityCandidates;
import com.google.android.gms.semanticlocation.AdditionalPlaceCandidates;
import com.google.android.gms.semanticlocation.DebugData;
import com.google.android.gms.semanticlocation.DevicePersonalizedPlaceInfo.DeviceInteractionTypeSummary;
import com.google.android.gms.semanticlocation.DevicePersonalizedPlaceInfo.PersonalPlace;
import com.google.android.gms.semanticlocation.DevicePersonalizedPlaceInfo;
import com.google.android.gms.semanticlocation.InputPlaceCandidate.FeatureId;
import com.google.android.gms.semanticlocation.InputPlaceCandidate;
import com.google.android.gms.semanticlocation.InputSignals;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import com.google.android.gms.semanticlocation.PlaceEnterEvent;
import com.google.android.gms.semanticlocation.PlaceExitEvent;
import com.google.android.gms.semanticlocation.PlaceOngoingEvent;
import com.google.android.gms.semanticlocation.RtslCellInfo;
import com.google.android.gms.semanticlocation.RtslDebugData;
import com.google.android.gms.semanticlocation.SemanticLocationEvent;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class fxqd {
    public final Context a;
    public final bzs b;

    public fxqd(Context context0) {
        this.b = new bzs();
        this.a = context0;
    }

    public static Account a(Intent intent0) {
        Uri uri0 = intent0.getData();
        if(uri0 != null) {
            String s = uri0.getScheme();
            batl.s(s);
            String s1 = "com.google";
            if(hzdy.a.b().c()) {
                String s2 = uri0.getSchemeSpecificPart();
                if(s.equals("mailto")) {
                    if(!s2.startsWith(":")) {
                        goto label_12;
                    }
                    s2 = s2.substring(1);
                    goto label_12;
                }
                if(s.equals("mailto:")) {
                label_12:
                    String s3 = uri0.getFragment();
                    if(s3 != null) {
                        s1 = s3;
                    }
                    return new Account(s2, s1);
                }
            }
            else if(s.equals("mailto:")) {
                String s4 = uri0.getFragment();
                return s4 == null ? new Account(uri0.getSchemeSpecificPart(), "com.google") : new Account(uri0.getSchemeSpecificPart(), s4);
            }
        }
        return null;
    }

    public static gzsi b(ActivityCandidate activityCandidate0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzsi.a).v_newBuilder();
        int v = gzsh.a(activityCandidate0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        ((gzsi)hftv0).c = v - 1;
        ((gzsi)hftv0).b |= 1;
        float f = activityCandidate0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzsi gzsi0 = (gzsi)hftp0.b_message;
        gzsi0.b |= 2;
        gzsi0.d = f;
        return (gzsi)hftp0.N_build();
    }

    public static gzvt c(PlaceCandidate placeCandidate0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzvt.a).v_newBuilder();
        long v = placeCandidate0.a.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gzvt)hftv0).b |= 1;
        ((gzvt)hftv0).c = v;
        int v1 = gzvs.a(placeCandidate0.b);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        if(v1 == 0) {
            throw null;
        }
        ((gzvt)hftv1).d = v1 - 1;
        ((gzvt)hftv1).b |= 2;
        float f = placeCandidate0.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzvt gzvt0 = (gzvt)hftp0.b_message;
        gzvt0.b |= 4;
        gzvt0.e = f;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzvq.a).v_newBuilder();
        PlaceCandidate.Point placeCandidate$Point0 = placeCandidate0.e;
        int v2 = placeCandidate$Point0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gzvq)hftv2).b |= 1;
        ((gzvq)hftv2).c = v2;
        int v3 = placeCandidate$Point0.b;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzvq gzvq0 = (gzvq)hftp1.b_message;
        gzvq0.b |= 2;
        gzvq0.d = v3;
        gzvq gzvq1 = (gzvq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzvt gzvt1 = (gzvt)hftp0.b_message;
        gzvq1.getClass();
        gzvt1.f = gzvq1;
        gzvt1.b |= 16;
        return (gzvt)hftp0.N_build();
    }

    public static Map d(Intent intent0) {
        long v33;
        Iterator iterator10;
        SemanticLocationState semanticLocationState1;
        int v27;
        int v26;
        int v24;
        int v22;
        int v18;
        int v7;
        SemanticLocationState semanticLocationState0 = SemanticLocationState.a(intent0);
        Throwable throwable0 = null;
        if(semanticLocationState0 == null) {
            return null;
        }
        Map map0 = new HashMap();
        Iterator iterator0 = semanticLocationState0.b.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            SemanticLocationEvent semanticLocationEvent0 = (SemanticLocationEvent)object0;
            long v = semanticLocationEvent0.a;
            if(v == 0L) {
                continue;
            }
            long v1 = semanticLocationState0.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzuo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gzuo)hftv0).b |= 1;
            ((gzuo)hftv0).c = v1 * 1000L;
            int v2 = semanticLocationEvent0.c;
            int v3 = gzun.a(v2);
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            if(v3 == 0) {
                throw throwable0;
            }
            ((gzuo)hftv1).d = v3 - 1;
            ((gzuo)hftv1).b |= 4;
            switch(v2) {
                case 1: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((gzuo)hftv2).d = 1;
                    ((gzuo)hftv2).b |= 4;
                    PlaceEnterEvent placeEnterEvent0 = semanticLocationEvent0.d;
                    if(placeEnterEvent0 != null) {
                        if(!hftv2.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp0.b_message;
                        ((gzuo)hftv3).b |= 0x20;
                        ((gzuo)hftv3).g = placeEnterEvent0.a;
                        if(!hftv3.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo0 = (gzuo)hftp0.b_message;
                        gzuo0.b |= 8;
                        gzuo0.e = placeEnterEvent0.b;
                        gzvt gzvt0 = fxqd.c(placeEnterEvent0.d);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo1 = (gzuo)hftp0.b_message;
                        gzvt0.getClass();
                        gzuo1.h = gzvt0;
                        gzuo1.b |= 0x40;
                        fxqd.h(hftp0, placeEnterEvent0.e);
                    }
                    break;
                }
                case 2: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp0.b_message;
                    ((gzuo)hftv4).d = 2;
                    ((gzuo)hftv4).b |= 4;
                    PlaceExitEvent placeExitEvent0 = semanticLocationEvent0.e;
                    if(placeExitEvent0 != null) {
                        if(!hftv4.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv5 = hftp0.b_message;
                        ((gzuo)hftv5).b |= 0x20;
                        ((gzuo)hftv5).g = placeExitEvent0.a;
                        if(!hftv5.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo2 = (gzuo)hftp0.b_message;
                        gzuo2.b |= 8;
                        gzuo2.e = placeExitEvent0.b;
                        gzvt gzvt1 = fxqd.c(placeExitEvent0.d);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo3 = (gzuo)hftp0.b_message;
                        gzvt1.getClass();
                        gzuo3.h = gzvt1;
                        gzuo3.b |= 0x40;
                        fxqd.h(hftp0, placeExitEvent0.e);
                    }
                    break;
                }
                case 3: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp0.b_message;
                    ((gzuo)hftv6).d = 3;
                    ((gzuo)hftv6).b |= 4;
                    PlaceOngoingEvent placeOngoingEvent0 = semanticLocationEvent0.f;
                    if(placeOngoingEvent0 != null) {
                        if(!hftv6.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv7 = hftp0.b_message;
                        ((gzuo)hftv7).b |= 0x20;
                        ((gzuo)hftv7).g = placeOngoingEvent0.a;
                        if(!hftv7.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo4 = (gzuo)hftp0.b_message;
                        gzuo4.b |= 8;
                        gzuo4.e = placeOngoingEvent0.b;
                        gzvt gzvt2 = fxqd.c(placeOngoingEvent0.d);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo5 = (gzuo)hftp0.b_message;
                        gzvt2.getClass();
                        gzuo5.h = gzvt2;
                        gzuo5.b |= 0x40;
                        fxqd.h(hftp0, placeOngoingEvent0.e);
                    }
                    break;
                }
                case 4: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp0.b_message;
                    ((gzuo)hftv8).d = 4;
                    ((gzuo)hftv8).b |= 4;
                    ActivityStartEvent activityStartEvent0 = semanticLocationEvent0.g;
                    if(activityStartEvent0 != null) {
                        if(!hftv8.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo6 = (gzuo)hftp0.b_message;
                        gzuo6.b |= 8;
                        gzuo6.e = activityStartEvent0.a;
                        gzsi gzsi0 = fxqd.b(activityStartEvent0.c);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo7 = (gzuo)hftp0.b_message;
                        gzsi0.getClass();
                        gzuo7.j = gzsi0;
                        gzuo7.b |= 0x80;
                        fxqd.g(hftp0, activityStartEvent0.d);
                    }
                    break;
                }
                case 5: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv9 = hftp0.b_message;
                    ((gzuo)hftv9).d = 5;
                    ((gzuo)hftv9).b |= 4;
                    ActivityEndEvent activityEndEvent0 = semanticLocationEvent0.h;
                    if(activityEndEvent0 != null) {
                        if(!hftv9.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo8 = (gzuo)hftp0.b_message;
                        gzuo8.b |= 8;
                        gzuo8.e = activityEndEvent0.a;
                        gzsi gzsi1 = fxqd.b(activityEndEvent0.c);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo9 = (gzuo)hftp0.b_message;
                        gzsi1.getClass();
                        gzuo9.j = gzsi1;
                        gzuo9.b |= 0x80;
                        fxqd.g(hftp0, activityEndEvent0.d);
                    }
                    break;
                }
                case 6: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv10 = hftp0.b_message;
                    ((gzuo)hftv10).d = 6;
                    ((gzuo)hftv10).b |= 4;
                    ActivityOngoingEvent activityOngoingEvent0 = semanticLocationEvent0.i;
                    if(activityOngoingEvent0 != null) {
                        if(!hftv10.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo10 = (gzuo)hftp0.b_message;
                        gzuo10.b |= 8;
                        gzuo10.e = activityOngoingEvent0.a;
                        gzsi gzsi2 = fxqd.b(activityOngoingEvent0.c);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gzuo gzuo11 = (gzuo)hftp0.b_message;
                        gzsi2.getClass();
                        gzuo11.j = gzsi2;
                        gzuo11.b |= 0x80;
                        fxqd.g(hftp0, activityOngoingEvent0.d);
                    }
                }
            }
            DebugData debugData0 = semanticLocationState0.d;
            if(debugData0 == null) {
                semanticLocationState1 = semanticLocationState0;
                iterator10 = iterator0;
                v33 = v;
            }
            else {
                for(Object object1: debugData0.a) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gztq.a).v_newBuilder();
                    long v4 = ((InputSignals)object1).a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv11 = hftp1.b_message;
                    ((gztq)hftv11).b |= 1;
                    ((gztq)hftv11).c = v4;
                    int v5 = ((InputSignals)object1).b;
                    if(!hftv11.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gztq gztq0 = (gztq)hftp1.b_message;
                    gztq0.b |= 2;
                    gztq0.d = v5;
                    Location location0 = ((InputSignals)object1).c;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gztu.a).v_newBuilder();
                    long v6 = location0.getTime();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gztu gztu0 = (gztu)hftp2.b_message;
                    gztu0.b |= 1;
                    gztu0.c = v6;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzuk.a).v_newBuilder();
                    Bundle bundle0 = location0.getExtras();
                    if(bundle0 != null) {
                        switch(bundle0.getInt("locationType", 0)) {
                            case 1: {
                                v7 = 3;
                                goto label_206;
                            }
                            case 2: {
                                v7 = 2;
                                goto label_206;
                            }
                            case 3: {
                                v7 = 1;
                                goto label_206;
                            }
                        }
                    }
                    v7 = 4;
                label_206:
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((gzuk)hftp3.b_message).c = v7 - 1;
                    ((gzuk)hftp3.b_message).b |= 1;
                    gzuk gzuk0 = (gzuk)hftp3.N_build();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gztu gztu1 = (gztu)hftp2.b_message;
                    gzuk0.getClass();
                    gztu1.d = gzuk0;
                    gztu1.b |= 2;
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gzts.a).v_newBuilder();
                    int v8 = GeoMath.l(location0.getLatitude());
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts0 = (gzts)hftp4.b_message;
                    gzts0.b |= 1;
                    gzts0.c = v8;
                    int v9 = GeoMath.l(location0.getLongitude());
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts1 = (gzts)hftp4.b_message;
                    gzts1.b |= 2;
                    gzts1.d = v9;
                    int v10 = Math.round(location0.getAccuracy());
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts2 = (gzts)hftp4.b_message;
                    gzts2.b |= 0x80;
                    gzts2.j = v10;
                    int v11 = (int)location0.getAltitude();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts3 = (gzts)hftp4.b_message;
                    gzts3.b |= 16;
                    gzts3.g = v11;
                    int v12 = Math.round(location0.getSpeed());
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts4 = (gzts)hftp4.b_message;
                    gzts4.b |= 4;
                    gzts4.e = v12;
                    gzts gzts5 = (gzts)hftp4.N_build();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gztu gztu2 = (gztu)hftp2.b_message;
                    gzts5.getClass();
                    gztu2.e = gzts5;
                    gztu2.b |= 4;
                    gztu gztu3 = (gztu)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gztq gztq1 = (gztq)hftp1.b_message;
                    gztu3.getClass();
                    gztq1.e = gztu3;
                    gztq1.b |= 4;
                    WifiScan wifiScan0 = ((InputSignals)object1).d;
                    int v13 = 0;
                    while(v13 < wifiScan0.c()) {
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gzwd.a).v_newBuilder();
                        long v14 = wifiScan0.i(v13);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gzwd gzwd0 = (gzwd)hftp5.b_message;
                        gzwd0.b |= 1;
                        gzwd0.c = v14;
                        int v15 = wifiScan0.a(v13);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gzwd gzwd1 = (gzwd)hftp5.b_message;
                        gzwd1.b |= 2;
                        gzwd1.d = v15;
                        int v16 = wifiScan0.b(v13);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gzwd gzwd2 = (gzwd)hftp5.b_message;
                        gzwd2.b |= 16;
                        gzwd2.g = v16;
                        gzwd gzwd3 = (gzwd)hftp5.N_build();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gztq gztq2 = (gztq)hftp1.b_message;
                        gzwd3.getClass();
                        hfuo hfuo0 = gztq2.f;
                        if(!hfuo0.c()) {
                            gztq2.f = ProtoLiteMessage.E(hfuo0);
                        }
                        gztq2.f.add(gzwd3);
                        ++v13;
                        semanticLocationState0 = semanticLocationState0;
                    }
                    for(Iterator iterator2 = ((InputSignals)object1).e.iterator(); iterator2.hasNext(); iterator2 = iterator2) {
                        Object object2 = iterator2.next();
                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gzsp.a).v_newBuilder();
                        long v17 = ((ActivityRecognitionResult)object2).b;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gzsp gzsp0 = (gzsp)hftp6.b_message;
                        gzsp0.b |= 1;
                        gzsp0.c = v17;
                        for(Object object3: ((ActivityRecognitionResult)object2).a) {
                            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gzsm.a).v_newBuilder();
                            switch(((DetectedActivity)object3).a()) {
                                case 0: {
                                    v18 = 1;
                                    break;
                                }
                                case 1: {
                                    v18 = 2;
                                    break;
                                }
                                case 2: {
                                    v18 = 3;
                                    break;
                                }
                                case 3: {
                                    v18 = 4;
                                    break;
                                }
                                case 5: {
                                    v18 = 6;
                                    break;
                                }
                                case 6: {
                                    v18 = 7;
                                    break;
                                }
                                case 7: {
                                    v18 = 8;
                                    break;
                                }
                                case 8: {
                                    v18 = 9;
                                    break;
                                }
                                case 16: {
                                    v18 = 10;
                                    break;
                                }
                                case 17: {
                                    v18 = 11;
                                    break;
                                }
                                case 18: {
                                    v18 = 12;
                                    break;
                                }
                                default: {
                                    v18 = 5;
                                }
                            }
                            if(!hftp7.b_message.isImmutable()) {
                                hftp7.ensureMutable();
                            }
                            ProtoLiteMessage hftv12 = hftp7.b_message;
                            ((gzsm)hftv12).c = v18 - 1;
                            ((gzsm)hftv12).b |= 1;
                            int v19 = ((DetectedActivity)object3).e;
                            if(!hftv12.isImmutable()) {
                                hftp7.ensureMutable();
                            }
                            gzsm gzsm0 = (gzsm)hftp7.b_message;
                            gzsm0.b |= 2;
                            gzsm0.d = v19;
                            gzsm gzsm1 = (gzsm)hftp7.N_build();
                            if(!hftp6.b_message.isImmutable()) {
                                hftp6.ensureMutable();
                            }
                            gzsp gzsp1 = (gzsp)hftp6.b_message;
                            gzsm1.getClass();
                            gzsp1.b();
                            gzsp1.d.add(gzsm1);
                            iterator2 = iterator2;
                        }
                        gzsp gzsp2 = (gzsp)hftp6.N_build();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gztq gztq3 = (gztq)hftp1.b_message;
                        gzsp2.getClass();
                        hfuo hfuo1 = gztq3.g;
                        if(!hfuo1.c()) {
                            gztq3.g = ProtoLiteMessage.E(hfuo1);
                        }
                        gztq3.g.add(gzsp2);
                    }
                    Iterator iterator4 = ((InputSignals)object1).f.iterator();
                    while(iterator4.hasNext()) {
                        Object object4 = iterator4.next();
                        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gztp.a).v_newBuilder();
                        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gzto.a).v_newBuilder();
                        InputPlaceCandidate.FeatureId inputPlaceCandidate$FeatureId0 = ((InputPlaceCandidate)object4).a;
                        long v20 = inputPlaceCandidate$FeatureId0.a;
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        ProtoLiteMessage hftv13 = hftp9.b_message;
                        ((gzto)hftv13).b |= 1;
                        ((gzto)hftv13).c = v20;
                        long v21 = inputPlaceCandidate$FeatureId0.b;
                        if(!hftv13.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        gzto gzto0 = (gzto)hftp9.b_message;
                        gzto0.b |= 2;
                        gzto0.d = v21;
                        gzto gzto1 = (gzto)hftp9.N_build();
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        gztp gztp0 = (gztp)hftp8.b_message;
                        gzto1.getClass();
                        gztp0.c = gzto1;
                        gztp0.b |= 1;
                        DevicePersonalizedPlaceInfo devicePersonalizedPlaceInfo0 = ((InputPlaceCandidate)object4).b;
                        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gztg.a).v_newBuilder();
                        Iterator iterator5 = devicePersonalizedPlaceInfo0.b.iterator();
                        while(iterator5.hasNext()) {
                            Object object5 = iterator5.next();
                            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gztf.a).v_newBuilder();
                            switch(((DevicePersonalizedPlaceInfo.PersonalPlace)object5).a) {
                                case 1: {
                                    v22 = 2;
                                    break;
                                }
                                case 2: {
                                    v22 = 3;
                                    break;
                                }
                                case 3: {
                                    v22 = 4;
                                    break;
                                }
                                default: {
                                    v22 = 1;
                                }
                            }
                            if(!hftp11.b_message.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            ProtoLiteMessage hftv14 = hftp11.b_message;
                            ((gztf)hftv14).c = v22 - 1;
                            ((gztf)hftv14).b |= 1;
                            int v23 = ((DevicePersonalizedPlaceInfo.PersonalPlace)object5).b;
                            switch(v23) {
                                case 0: {
                                    v24 = 1;
                                    break;
                                }
                                case 1: {
                                    v24 = 2;
                                    break;
                                }
                                default: {
                                    v24 = v23 == 2 ? 3 : 1;
                                }
                            }
                            if(!hftv14.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            ProtoLiteMessage hftv15 = hftp11.b_message;
                            ((gztf)hftv15).d = v24 - 1;
                            ((gztf)hftv15).b |= 2;
                            int v25 = ((DevicePersonalizedPlaceInfo.PersonalPlace)object5).c;
                            if(v25 != 0) {
                                switch(v25) {
                                    case 1: {
                                        v26 = 2;
                                        goto label_435;
                                    }
                                    case 2: {
                                        v26 = 3;
                                        goto label_435;
                                    }
                                    default: {
                                        if(v25 == 3) {
                                            v26 = 4;
                                            goto label_435;
                                        }
                                    }
                                }
                            }
                            v26 = 1;
                        label_435:
                            if(!hftv15.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            ((gztf)hftp11.b_message).e = v26 - 1;
                            ((gztf)hftp11.b_message).b |= 4;
                            gztf gztf0 = (gztf)hftp11.N_build();
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            gztg gztg0 = (gztg)hftp10.b_message;
                            gztf0.getClass();
                            hfuo hfuo2 = gztg0.b;
                            if(!hfuo2.c()) {
                                gztg0.b = ProtoLiteMessage.E(hfuo2);
                            }
                            gztg0.b.add(gztf0);
                            iterator5 = iterator5;
                            v = v;
                        }
                        for(Object object6: devicePersonalizedPlaceInfo0.c) {
                            ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gztb.a).v_newBuilder();
                            switch(((DevicePersonalizedPlaceInfo.DeviceInteractionTypeSummary)object6).a) {
                                case 150: {
                                    v27 = 0x97;
                                    break;
                                }
                                case 0x97: {
                                    v27 = 0x98;
                                    break;
                                }
                                case 0x98: {
                                    v27 = 0x99;
                                    break;
                                }
                                case 0x99: {
                                    v27 = 0x9A;
                                    break;
                                }
                                case 0xA0: {
                                    v27 = 0xA1;
                                    break;
                                }
                                case 0xA1: {
                                    v27 = 0xA2;
                                    break;
                                }
                                case 0xA2: {
                                    v27 = 0xA3;
                                    break;
                                }
                                case 0xA3: {
                                    v27 = 0xA4;
                                    break;
                                }
                                case 0xA4: {
                                    v27 = 0xA5;
                                    break;
                                }
                                case 0xA5: {
                                    v27 = 0xA6;
                                    break;
                                }
                                case 0xA6: {
                                    v27 = 0xA7;
                                    break;
                                }
                                case 0xA8: {
                                    v27 = 0xA9;
                                    break;
                                }
                                case 0xB0: {
                                    v27 = 0xB1;
                                    break;
                                }
                                case 0xB2: {
                                    v27 = 0xB3;
                                    break;
                                }
                                case 0xC4: {
                                    v27 = 0xC5;
                                    break;
                                }
                                case 0xD8: {
                                    v27 = 0xD9;
                                    break;
                                }
                                default: {
                                    v27 = 1;
                                }
                            }
                            if(!hftp12.b_message.isImmutable()) {
                                hftp12.ensureMutable();
                            }
                            ProtoLiteMessage hftv16 = hftp12.b_message;
                            ((gztb)hftv16).c = v27 - 1;
                            ((gztb)hftv16).b |= 1;
                            int v28 = ((DevicePersonalizedPlaceInfo.DeviceInteractionTypeSummary)object6).b;
                            if(!hftv16.isImmutable()) {
                                hftp12.ensureMutable();
                            }
                            gztb gztb0 = (gztb)hftp12.b_message;
                            gztb0.b |= 2;
                            gztb0.d = v28;
                            for(Object object7: ((DevicePersonalizedPlaceInfo.DeviceInteractionTypeSummary)object6).c) {
                                long v29 = (long)(((Long)object7));
                                if(!hftp12.b_message.isImmutable()) {
                                    hftp12.ensureMutable();
                                }
                                gztb gztb1 = (gztb)hftp12.b_message;
                                hfui hfui0 = gztb1.e;
                                if(!hfui0.c()) {
                                    gztb1.e = ProtoLiteMessage.D(hfui0);
                                }
                                gztb1.e.g(v29);
                            }
                            gztb gztb2 = (gztb)hftp12.N_build();
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            gztg gztg1 = (gztg)hftp10.b_message;
                            gztb2.getClass();
                            hfuo hfuo3 = gztg1.c;
                            if(!hfuo3.c()) {
                                gztg1.c = ProtoLiteMessage.E(hfuo3);
                            }
                            gztg1.c.add(gztb2);
                        }
                        gztg gztg2 = (gztg)hftp10.N_build();
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        gztp gztp1 = (gztp)hftp8.b_message;
                        gztg2.getClass();
                        gztp1.d = gztg2;
                        gztp1.b |= 2;
                        gztp gztp2 = (gztp)hftp8.N_build();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gztq gztq4 = (gztq)hftp1.b_message;
                        gztp2.getClass();
                        hfuo hfuo4 = gztq4.h;
                        if(!hfuo4.c()) {
                            gztq4.h = ProtoLiteMessage.E(hfuo4);
                        }
                        gztq4.h.add(gztp2);
                        iterator4 = iterator4;
                        iterator0 = iterator0;
                        v = v;
                    }
                    RtslDebugData rtslDebugData0 = ((InputSignals)object1).g;
                    if(rtslDebugData0 != null) {
                        for(Object object8: rtslDebugData0.b) {
                            long v30 = (long)(((Long)object8));
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gztq gztq5 = (gztq)hftp1.b_message;
                            hfui hfui1 = gztq5.i;
                            if(!hfui1.c()) {
                                gztq5.i = ProtoLiteMessage.D(hfui1);
                            }
                            gztq5.i.g(v30);
                        }
                        for(Object object9: rtslDebugData0.a) {
                            RtslCellInfo rtslCellInfo0 = (RtslCellInfo)object9;
                            if(rtslCellInfo0 != null) {
                                ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)gzul.a).v_newBuilder();
                                if(!hftp13.b_message.isImmutable()) {
                                    hftp13.ensureMutable();
                                }
                                ProtoLiteMessage hftv17 = hftp13.b_message;
                                ((gzul)hftv17).b |= 1;
                                ((gzul)hftv17).c = rtslCellInfo0.a;
                                if(!hftv17.isImmutable()) {
                                    hftp13.ensureMutable();
                                }
                                ProtoLiteMessage hftv18 = hftp13.b_message;
                                ((gzul)hftv18).b |= 2;
                                ((gzul)hftv18).d = rtslCellInfo0.b;
                                int v31 = rtslCellInfo0.c;
                                if(!hftv18.isImmutable()) {
                                    hftp13.ensureMutable();
                                }
                                ProtoLiteMessage hftv19 = hftp13.b_message;
                                ((gzul)hftv19).b |= 4;
                                ((gzul)hftv19).e = v31;
                                long v32 = rtslCellInfo0.d;
                                if(!hftv19.isImmutable()) {
                                    hftp13.ensureMutable();
                                }
                                ProtoLiteMessage hftv20 = hftp13.b_message;
                                ((gzul)hftv20).b |= 8;
                                ((gzul)hftv20).f = v32;
                                String s = rtslCellInfo0.e;
                                if(s != null) {
                                    if(!hftv20.isImmutable()) {
                                        hftp13.ensureMutable();
                                    }
                                    gzul gzul0 = (gzul)hftp13.b_message;
                                    gzul0.b |= 16;
                                    gzul0.g = s;
                                }
                                gzul gzul1 = (gzul)hftp13.N_build();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                gztq gztq6 = (gztq)hftp1.b_message;
                                gzul1.getClass();
                                hfuo hfuo5 = gztq6.j;
                                if(!hfuo5.c()) {
                                    gztq6.j = ProtoLiteMessage.E(hfuo5);
                                }
                                gztq6.j.add(gzul1);
                            }
                        }
                    }
                    gztq gztq7 = (gztq)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzuo gzuo12 = (gzuo)hftp0.b_message;
                    gztq7.getClass();
                    hfuo hfuo6 = gzuo12.m;
                    if(!hfuo6.c()) {
                        gzuo12.m = ProtoLiteMessage.E(hfuo6);
                    }
                    gzuo12.m.add(gztq7);
                    semanticLocationState0 = semanticLocationState0;
                    iterator0 = iterator0;
                    v = v;
                }
                semanticLocationState1 = semanticLocationState0;
                iterator10 = iterator0;
                v33 = v;
                int v34 = debugData0.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzuo gzuo13 = (gzuo)hftp0.b_message;
                gzuo13.b |= 0x200;
                gzuo13.l = v34;
            }
            gzuo gzuo14 = (gzuo)hftp0.N_build();
            Long long0 = v33;
            if(map0.containsKey(long0)) {
                List list0 = (List)map0.get(long0);
                batl.s(list0);
                list0.add(gzuo14);
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(gzuo14);
                map0.put(long0, arrayList0);
            }
            throwable0 = throwable0;
            semanticLocationState0 = semanticLocationState1;
            iterator0 = iterator10;
            continue;
        }
        return map0;
    }

    public final void e() {
        bzs bzs0;
        for(int v = 0; true; ++v) {
            bzs0 = this.b;
            if(v >= bzs0.d_num) {
                break;
            }
            ((fxqg)bzs0.i(v)).b();
        }
        bzs0.clear();
    }

    public static boolean f() {
        return hyac.R() && hzdy.c();
    }

    private static void g(ProtoLiteBuilder hftp0, AdditionalActivityCandidates additionalActivityCandidates0) {
        if(additionalActivityCandidates0 != null) {
            for(Object object0: additionalActivityCandidates0.a) {
                gzsi gzsi0 = fxqd.b(((ActivityCandidate)object0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzuo gzuo0 = (gzuo)hftp0.b_message;
                gzsi0.getClass();
                hfuo hfuo0 = gzuo0.k;
                if(!hfuo0.c()) {
                    gzuo0.k = ProtoLiteMessage.E(hfuo0);
                }
                gzuo0.k.add(gzsi0);
            }
        }
    }

    private static void h(ProtoLiteBuilder hftp0, AdditionalPlaceCandidates additionalPlaceCandidates0) {
        if(additionalPlaceCandidates0 != null) {
            for(Object object0: additionalPlaceCandidates0.a) {
                gzvt gzvt0 = fxqd.c(((PlaceCandidate)object0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzuo gzuo0 = (gzuo)hftp0.b_message;
                gzvt0.getClass();
                hfuo hfuo0 = gzuo0.i;
                if(!hfuo0.c()) {
                    gzuo0.i = ProtoLiteMessage.E(hfuo0);
                }
                gzuo0.i.add(gzvt0);
            }
        }
    }
}

