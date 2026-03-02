import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.Deletion;
import com.google.android.gms.location.reporting.SendDataRequest;
import com.google.android.gms.semanticlocation.Activity;
import com.google.android.gms.semanticlocation.ActivityCandidate;
import com.google.android.gms.semanticlocation.AdditionalActivityCandidates;
import com.google.android.gms.semanticlocation.AdditionalPlaceCandidates;
import com.google.android.gms.semanticlocation.DebugData;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocation.SemanticSegment;
import com.google.android.gms.semanticlocation.TemporarilyClosedPlaceCandidates;
import com.google.android.gms.semanticlocation.Visit;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class fxth extends fxtg implements evpz {
    final fxtk b;
    private final fxto f;
    private final fxsw g;
    private fxpy h;
    private fxpu i;

    public fxth(fxtk fxtk0, fxts fxts0, fxtr fxtr0, fxtt fxtt0, fxsw fxsw0, fxqn fxqn0) {
        Objects.requireNonNull(fxtk0);
        this.b = fxtk0;
        super(fxtk0, new bblg(10), "UlrDispSvcFast");
        this.f = new fxto(fxtk0.a, fxts0, fxtr0, fxtt0, fxsw0, fxqn0);
        this.g = fxsw0;
    }

    @Override  // fxtg
    protected final void b(Intent intent0) {
        Object object11;
        int v8;
        int v21;
        gzua gzua0;
        String s = intent0.getAction();
        if(s != null) {
            fxtk.d(intent0);
            fxtk fxtk0 = this.b;
            fxtr fxtr0 = fxtk0.b;
            ReportingConfig reportingConfig0 = fxtr0.d();
            if(!reportingConfig0.e()) {
                switch(s.hashCode()) {
                    case 0xA07257B3: {
                        if(!s.equals("com.google.android.location.reporting.ACTION_UPDATE_WORLD")) {
                            fxqw.c("GCoreUlr", a.O(intent0, "DispatchingService ignoring ", " because ULR inactive"));
                            return;
                        }
                        break;
                    }
                    case 0xDE097CF0: {
                        if(!s.equals("com.google.android.location.reporting.GCM_ID_CHANGED")) {
                            fxqw.c("GCoreUlr", a.O(intent0, "DispatchingService ignoring ", " because ULR inactive"));
                            return;
                        }
                        break;
                    }
                    case 1115780759: {
                        if(!s.equals("com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE")) {
                            fxqw.c("GCoreUlr", a.O(intent0, "DispatchingService ignoring ", " because ULR inactive"));
                            return;
                        }
                        break;
                    }
                    default: {
                        fxqw.c("GCoreUlr", a.O(intent0, "DispatchingService ignoring ", " because ULR inactive"));
                        return;
                    }
                }
            }
            switch(s) {
                case "android.intent.action.AIRPLANE_MODE": 
                case "android.location.MODE_CHANGED": 
                case "android.location.PROVIDERS_CHANGED": 
                case "android.net.wifi.WIFI_STATE_CHANGED": 
                case "android.os.action.DEVICE_IDLE_MODE_CHANGED": 
                case "com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE": 
                case "com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE_THRESHOLD": 
                case "com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE": {
                    this.b.b.d();
                    this.f.i(s);
                    return;
                }
                case "com.google.android.gms.location.reporting.DELETE_OPERATION": {
                    batl.b("com.google.android.gms.location.reporting.DELETE_OPERATION".equals(intent0.getAction()));
                    ArrayList arrayList0 = intent0.hasExtra("deletions") ? intent0.getParcelableArrayListExtra("deletions") : null;
                    if(arrayList0 == null) {
                        fxqw.m(0x1F, "Received delete intent with no extra");
                        return;
                    }
                    int v = arrayList0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        Deletion deletion0 = (Deletion)arrayList0.get(v1);
                        this.b.j.m(deletion0.a, deletion0.b, deletion0.c);
                    }
                    return;
                }
                case "com.google.android.location.reporting.ACTION_ACTIVITY": {
                    if(hzek.p()) {
                        this.b.h();
                        return;
                    }
                    this.f().a(intent0, reportingConfig0);
                    return;
                }
                case "com.google.android.location.reporting.ACTION_APPLY_UPLOAD_REQUESTS": {
                    this.g.f(reportingConfig0, "DispatchingService.applyUploadRequests");
                    Location location1 = this.b.d.d();
                    this.b.f.d(reportingConfig0, location1);
                    return;
                }
                case "com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION": {
                    this.h(intent0, reportingConfig0, true);
                    return;
                }
                case "com.google.android.location.reporting.ACTION_LOCATION": {
                    this.h(intent0, reportingConfig0, false);
                    return;
                }
                case "com.google.android.location.reporting.ACTION_PLACE_INFERENCE": {
                    Uri uri0 = intent0.getData();
                    Account account4 = uri0 == null || !uri0.getScheme().equals("mailto:") ? null : new Account(uri0.getSchemeSpecificPart(), uri0.getFragment());
                    cnnq cnnq0 = cnnq.d(intent0);
                    if(cnnq0 == null) {
                        gzua0 = null;
                    }
                    else {
                        try {
                            ArrayList arrayList3 = new ArrayList(cnnq0.b());
                            bako bako0 = new bako(cnnq0);
                            while(bako0.hasNext()) {
                                Object object14 = bako0.next();
                                double f2 = (double)((cnno)object14).a();
                                String s8 = ((cnno)object14).iA().m();
                                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gztz.a).v_newBuilder();
                                if(s8 != null) {
                                    if(!hftp9.b_message.isImmutable()) {
                                        hftp9.ensureMutable();
                                    }
                                    gztz gztz0 = (gztz)hftp9.b_message;
                                    gztz0.b |= 1;
                                    gztz0.c = s8;
                                }
                                if(!hftp9.b_message.isImmutable()) {
                                    hftp9.ensureMutable();
                                }
                                gztz gztz1 = (gztz)hftp9.b_message;
                                gztz1.b |= 2;
                                gztz1.d = (int)(f2 * 10000.0);
                                arrayList3.add(((gztz)hftp9.N_build()));
                            }
                            Uri uri1 = intent0.getData();
                            boolean z3 = uri1 != null && uri1.getScheme().equals("mailto:");
                            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gzua.a).v_newBuilder();
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            gzua gzua1 = (gzua)hftp10.b_message;
                            hfuo hfuo5 = gzua1.c;
                            if(!hfuo5.c()) {
                                gzua1.c = ProtoLiteMessage.E(hfuo5);
                            }
                            hfrj.E(arrayList3, gzua1.c);
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            gzua gzua2 = (gzua)hftp10.b_message;
                            gzua2.b |= 2;
                            gzua2.e = z3;
                            switch(((int)hzdv.b())) {
                                case 100: {
                                    v21 = 5;
                                    break;
                                }
                                case 102: {
                                    v21 = 4;
                                    break;
                                }
                                case 104: {
                                    v21 = 3;
                                    break;
                                }
                                case 105: {
                                    v21 = 2;
                                    break;
                                }
                                default: {
                                    v21 = 1;
                                }
                            }
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ((gzua)hftp10.b_message).d = v21 - 1;
                            ((gzua)hftp10.b_message).b |= 1;
                            gzua0 = (gzua)hftp10.N_build();
                        }
                        finally {
                            cnnq0.iz();
                        }
                    }
                    if(gzua0 == null) {
                        fxqw.f("Received null place inference result");
                        return;
                    }
                    long v22 = System.currentTimeMillis();
                    ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    ProtoLiteMessage hftv16 = hftp11.b_message;
                    ((gzty)hftv16).i = gzua0;
                    ((gzty)hftv16).b |= 0x100;
                    if(!hftv16.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    gzty gzty7 = (gzty)hftp11.b_message;
                    gzty7.b |= 1;
                    gzty7.c = v22;
                    gzty gzty8 = (gzty)hftp11.N_build();
                    if(account4 == null) {
                        ReportingConfig reportingConfig2 = this.b.b.d();
                        cnug.b(reportingConfig2.c());
                        List list1 = reportingConfig2.c();
                        this.b.j.n(list1, gzty8, "place inference");
                        return;
                    }
                    this.b.j.l(account4, gzty8, "personalized place inference");
                    return;
                }
                case "com.google.android.location.reporting.ACTION_REPORT_PLACE": {
                    PlaceReport placeReport0 = (PlaceReport)intent0.getParcelableExtra("placeReport");
                    Account account1 = (Account)intent0.getParcelableExtra("account");
                    String s2 = intent0.getStringExtra("placeReportCaller");
                    if(placeReport0 == null || account1 == null || s2 == null) {
                        fxqw.m(33, "Received PlaceReport intent missing an extra: " + intent0);
                        return;
                    }
                    long v7 = System.currentTimeMillis();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzuc.a).v_newBuilder();
                    String s3 = placeReport0.c;
                    if(s3 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzuc gzuc0 = (gzuc)hftp2.b_message;
                        gzuc0.b |= 4;
                        gzuc0.e = s3;
                    }
                    String s4 = placeReport0.b;
                    if(s4 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzuc gzuc1 = (gzuc)hftp2.b_message;
                        gzuc1.b |= 1;
                        gzuc1.c = s4;
                    }
                    String s5 = placeReport0.d;
                    if(s5 == null) {
                        v8 = 0;
                    }
                    else {
                        switch(s5) {
                            case "inferredGeofencing": {
                                v8 = 34;
                                break;
                            }
                            case "inferredRadioSignals": {
                                v8 = 35;
                                break;
                            }
                            case "inferredReverseGeocoding": {
                                v8 = 36;
                                break;
                            }
                            case "inferredSnappedToRoad": {
                                v8 = 37;
                                break;
                            }
                            case "unknown": {
                                v8 = 1;
                                break;
                            }
                            case "userReported": {
                                v8 = 2;
                                break;
                            }
                            default: {
                                v8 = 0;
                            }
                        }
                    }
                    if(v8 != 0) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gzuc)hftp2.b_message).f = v8 - 1;
                        ((gzuc)hftp2.b_message).b |= 0x20;
                    }
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gzuc gzuc2 = (gzuc)hftp2.b_message;
                    gzuc2.b |= 2;
                    gzuc2.d = s2;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
                    gzuc gzuc3 = (gzuc)hftp2.N_build();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp3.b_message;
                    gzuc3.getClass();
                    ((gzty)hftv1).e = gzuc3;
                    ((gzty)hftv1).b |= 4;
                    if(!hftv1.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gzty gzty0 = (gzty)hftp3.b_message;
                    gzty0.b |= 1;
                    gzty0.c = v7;
                    gzty gzty1 = (gzty)hftp3.N_build();
                    fxtk0.j.l(account1, gzty1, "PlaceReportHelper");
                    if(!TextUtils.isEmpty(s4)) {
                        fxtk0.d.e = true;
                        ReportingConfig reportingConfig1 = fxtr0.d();
                        String s6 = fxtk.d(intent0);
                        this.g.g(reportingConfig1, "DispatchingService.requestImmediateLocation+" + s6, true);
                        return;
                    }
                    return;
                }
                case "com.google.android.location.reporting.ACTION_SEMANTIC_LOCATION_INFERENCE": {
                    fxra.g("OdlhOsPendingIntentReceivedFromCsl");
                    if(fxqd.f()) {
                        Account account2 = fxqd.a(intent0);
                        if(account2 == null) {
                            fxqw.f("Semantic Location account should not be null.");
                        }
                        else {
                            Map map0 = fxqd.d(intent0);
                            if(map0 == null) {
                                fxqw.f("Received null semantic location inference result");
                            }
                            else {
                                for(Object object2: map0.values()) {
                                    for(Object object3: ((List)object2)) {
                                        gzuo gzuo0 = (gzuo)object3;
                                        if(fxrc.q()) {
                                            fxrc.a.c(account2, gzuo0);
                                        }
                                    }
                                }
                                boolean z = fxth.i(SemanticLocationState.a(intent0));
                                ArrayList arrayList1 = new ArrayList();
                                for(Object object4: map0.keySet()) {
                                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
                                    long v9 = ((long)(((Long)object4))) * 1000L;
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp4.b_message;
                                    ((gzty)hftv2).b |= 1;
                                    ((gzty)hftv2).c = v9;
                                    if(!hftv2.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    gzty gzty2 = (gzty)hftp4.b_message;
                                    gzty2.b |= 0x8000;
                                    gzty2.o = z;
                                    for(Object object5: ((List)map0.get(((Long)object4)))) {
                                        if(!hftp4.b_message.isImmutable()) {
                                            hftp4.ensureMutable();
                                        }
                                        gzty gzty3 = (gzty)hftp4.b_message;
                                        ((gzuo)object5).getClass();
                                        hfuo hfuo0 = gzty3.m;
                                        if(!hfuo0.c()) {
                                            gzty3.m = ProtoLiteMessage.E(hfuo0);
                                        }
                                        gzty3.m.add(((gzuo)object5));
                                    }
                                    arrayList1.add(((gzty)hftp4.N_build()));
                                }
                                for(Object object6: arrayList1) {
                                    this.b.j.l(account2, ((gzty)object6), "semantic location inference");
                                }
                            }
                        }
                        if(hyac.X()) {
                            Account account3 = fxqd.a(intent0);
                            if(account3 == null) {
                                fxqw.f("Semantic location account should not be null.");
                                return;
                            }
                            SemanticLocationState semanticLocationState0 = SemanticLocationState.a(intent0);
                            if(semanticLocationState0 == null) {
                                object11 = null;
                            }
                            else {
                                DebugData debugData0 = semanticLocationState0.d;
                                if(debugData0 == null) {
                                    object11 = null;
                                }
                                else {
                                    ggfp ggfp0 = ggfp.G(debugData0.e);
                                    ArrayList arrayList2 = new ArrayList();
                                    for(Object object7: debugData0.c) {
                                        SemanticSegment semanticSegment0 = (SemanticSegment)object7;
                                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gzuv.a).v_newBuilder();
                                        long v10 = semanticSegment0.a * 1000L;
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv3 = hftp5.b_message;
                                        ((gzuv)hftv3).b |= 1;
                                        ((gzuv)hftv3).c = v10;
                                        long v11 = semanticSegment0.b * 1000L;
                                        if(!hftv3.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv4 = hftp5.b_message;
                                        ((gzuv)hftv4).b |= 2;
                                        ((gzuv)hftv4).d = v11;
                                        int v12 = semanticSegment0.c;
                                        if(!hftv4.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv5 = hftp5.b_message;
                                        ((gzuv)hftv5).b |= 4;
                                        ((gzuv)hftv5).e = v12;
                                        int v13 = semanticSegment0.d;
                                        if(!hftv5.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv6 = hftp5.b_message;
                                        ((gzuv)hftv6).b |= 8;
                                        ((gzuv)hftv6).f = v13;
                                        int v14 = gzuu.a(semanticSegment0.j);
                                        if(!hftv6.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv7 = hftp5.b_message;
                                        if(v14 == 0) {
                                            throw null;
                                        }
                                        ((gzuv)hftv7).g = v14 - 1;
                                        ((gzuv)hftv7).b |= 0x20;
                                        String s7 = semanticSegment0.e;
                                        if(!hftv7.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        gzuv gzuv0 = (gzuv)hftp5.b_message;
                                        s7.getClass();
                                        gzuv0.b |= 0x80;
                                        gzuv0.i = s7;
                                        if(ggfp0.contains(s7)) {
                                            if(!hftp5.b_message.isImmutable()) {
                                                hftp5.ensureMutable();
                                            }
                                            ((gzuv)hftp5.b_message).u = 1;
                                            ((gzuv)hftp5.b_message).b |= 0x20000;
                                        }
                                        boolean z1 = semanticSegment0.i != 0;
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv8 = hftp5.b_message;
                                        ((gzuv)hftv8).b |= 0x40;
                                        ((gzuv)hftv8).h = z1;
                                        switch(semanticSegment0.f) {
                                            case 1: {
                                                if(!hftv8.isImmutable()) {
                                                    hftp5.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv9 = hftp5.b_message;
                                                ((gzuv)hftv9).j = 1;
                                                ((gzuv)hftv9).b |= 0x100;
                                                Visit visit0 = semanticSegment0.g;
                                                if(visit0 != null) {
                                                    if(!hftv9.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv10 = hftp5.b_message;
                                                    ((gzuv)hftv10).b |= 0x2000;
                                                    ((gzuv)hftv10).q = visit0.a;
                                                    if(!hftv10.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    gzuv gzuv1 = (gzuv)hftp5.b_message;
                                                    gzuv1.b |= 0x200;
                                                    gzuv1.k = visit0.b;
                                                    gzvt gzvt0 = fxqd.c(visit0.d);
                                                    if(!hftp5.b_message.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    gzuv gzuv2 = (gzuv)hftp5.b_message;
                                                    gzvt0.getClass();
                                                    gzuv2.l = gzvt0;
                                                    gzuv2.b |= 0x800;
                                                    AdditionalPlaceCandidates additionalPlaceCandidates0 = visit0.e;
                                                    if(additionalPlaceCandidates0 != null) {
                                                        for(Object object8: additionalPlaceCandidates0.a) {
                                                            gzvt gzvt1 = fxqd.c(((PlaceCandidate)object8));
                                                            if(!hftp5.b_message.isImmutable()) {
                                                                hftp5.ensureMutable();
                                                            }
                                                            gzuv gzuv3 = (gzuv)hftp5.b_message;
                                                            gzvt1.getClass();
                                                            hfuo hfuo1 = gzuv3.m;
                                                            if(!hfuo1.c()) {
                                                                gzuv3.m = ProtoLiteMessage.E(hfuo1);
                                                            }
                                                            gzuv3.m.add(gzvt1);
                                                        }
                                                    }
                                                    TemporarilyClosedPlaceCandidates temporarilyClosedPlaceCandidates0 = visit0.g;
                                                    if(temporarilyClosedPlaceCandidates0 != null) {
                                                        for(Object object9: temporarilyClosedPlaceCandidates0.a) {
                                                            gzvt gzvt2 = fxqd.c(((PlaceCandidate)object9));
                                                            if(!hftp5.b_message.isImmutable()) {
                                                                hftp5.ensureMutable();
                                                            }
                                                            gzuv gzuv4 = (gzuv)hftp5.b_message;
                                                            gzvt2.getClass();
                                                            hfuo hfuo2 = gzuv4.n;
                                                            if(!hfuo2.c()) {
                                                                gzuv4.n = ProtoLiteMessage.E(hfuo2);
                                                            }
                                                            gzuv4.n.add(gzvt2);
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                            case 2: {
                                                if(!hftv8.isImmutable()) {
                                                    hftp5.ensureMutable();
                                                }
                                                ((gzuv)hftp5.b_message).j = 2;
                                                ((gzuv)hftp5.b_message).b |= 0x100;
                                                Activity activity0 = semanticSegment0.h;
                                                if(activity0 != null) {
                                                    gzuq gzuq0 = gzuq.a;
                                                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gzuq0).v_newBuilder();
                                                    if(!hftp6.b_message.isImmutable()) {
                                                        hftp6.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv11 = hftp6.b_message;
                                                    ((gzuq)hftv11).b |= 1;
                                                    PlaceCandidate.Point placeCandidate$Point0 = activity0.a;
                                                    ((gzuq)hftv11).c = placeCandidate$Point0.a;
                                                    if(!hftv11.isImmutable()) {
                                                        hftp6.ensureMutable();
                                                    }
                                                    gzuq gzuq1 = (gzuq)hftp6.b_message;
                                                    gzuq1.b |= 2;
                                                    gzuq1.d = placeCandidate$Point0.b;
                                                    gzuq gzuq2 = (gzuq)hftp6.N_build();
                                                    if(!hftp5.b_message.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    gzuv gzuv5 = (gzuv)hftp5.b_message;
                                                    gzuq2.getClass();
                                                    gzuv5.r = gzuq2;
                                                    gzuv5.b |= 0x4000;
                                                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gzuq0).v_newBuilder();
                                                    PlaceCandidate.Point placeCandidate$Point1 = activity0.b;
                                                    if(!hftp7.b_message.isImmutable()) {
                                                        hftp7.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv12 = hftp7.b_message;
                                                    ((gzuq)hftv12).b |= 1;
                                                    ((gzuq)hftv12).c = placeCandidate$Point1.a;
                                                    if(!hftv12.isImmutable()) {
                                                        hftp7.ensureMutable();
                                                    }
                                                    gzuq gzuq3 = (gzuq)hftp7.b_message;
                                                    gzuq3.b |= 2;
                                                    gzuq3.d = placeCandidate$Point1.b;
                                                    gzuq gzuq4 = (gzuq)hftp7.N_build();
                                                    if(!hftp5.b_message.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv13 = hftp5.b_message;
                                                    gzuq4.getClass();
                                                    ((gzuv)hftv13).s = gzuq4;
                                                    ((gzuv)hftv13).b |= 0x8000;
                                                    float f = activity0.c;
                                                    if(!hftv13.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    ProtoLiteMessage hftv14 = hftp5.b_message;
                                                    ((gzuv)hftv14).b |= 0x10000;
                                                    ((gzuv)hftv14).t = f;
                                                    float f1 = activity0.d;
                                                    if(!hftv14.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    gzuv gzuv6 = (gzuv)hftp5.b_message;
                                                    gzuv6.b |= 0x200;
                                                    gzuv6.k = f1;
                                                    gzsi gzsi0 = fxqd.b(activity0.f);
                                                    if(!hftp5.b_message.isImmutable()) {
                                                        hftp5.ensureMutable();
                                                    }
                                                    gzuv gzuv7 = (gzuv)hftp5.b_message;
                                                    gzsi0.getClass();
                                                    gzuv7.o = gzsi0;
                                                    gzuv7.b |= 0x1000;
                                                    AdditionalActivityCandidates additionalActivityCandidates0 = activity0.g;
                                                    if(additionalActivityCandidates0 != null) {
                                                        for(Object object10: additionalActivityCandidates0.a) {
                                                            gzsi gzsi1 = fxqd.b(((ActivityCandidate)object10));
                                                            if(!hftp5.b_message.isImmutable()) {
                                                                hftp5.ensureMutable();
                                                            }
                                                            gzuv gzuv8 = (gzuv)hftp5.b_message;
                                                            gzsi1.getClass();
                                                            hfuo hfuo3 = gzuv8.p;
                                                            if(!hfuo3.c()) {
                                                                gzuv8.p = ProtoLiteMessage.E(hfuo3);
                                                            }
                                                            gzuv8.p.add(gzsi1);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        arrayList2.add(((gzuv)hftp5.N_build()));
                                        continue;
                                    }
                                    object11 = arrayList2;
                                }
                            }
                            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
                            for(Object object12: ((List)object11)) {
                                if(!hftp8.b_message.isImmutable()) {
                                    hftp8.ensureMutable();
                                }
                                gzty gzty4 = (gzty)hftp8.b_message;
                                ((gzuv)object12).getClass();
                                hfuo hfuo4 = gzty4.n;
                                if(!hfuo4.c()) {
                                    gzty4.n = ProtoLiteMessage.E(hfuo4);
                                }
                                gzty4.n.add(((gzuv)object12));
                            }
                            if(hzeq.g() && object11 != null) {
                                fxra.h("OdlhOsTotalSegmentsReceivedFromCsl", ((long)((List)object11).size()));
                                fxra.k("OdlhOsTotalSegmentsReceivedFromCslHistogram", ((List)object11).size());
                                int v15 = 0;
                                int v16 = 0;
                                int v17 = 0;
                                for(Object object13: ((List)object11)) {
                                    int v18 = gzus.a(((gzuv)object13).j);
                                    if(v18 == 0) {
                                        v18 = 1;
                                    }
                                    switch(v18 - 1) {
                                        case 1: {
                                            ++v16;
                                            break;
                                        }
                                        case 2: {
                                            ++v17;
                                            break;
                                        }
                                        default: {
                                            ++v15;
                                        }
                                    }
                                    fxra.h("OdlhOsTotalVisitsReceivedFromCsl", ((long)v16));
                                    fxra.h("OdlhOsTotalActivitiesReceivedFromCsl", ((long)v17));
                                    fxra.h("OdlhOsTotalUnknownReceivedFromCsl", ((long)v15));
                                    fxra.k("OdlhOsTotalVisitsReceivedFromCslHistogram", v16);
                                    fxra.k("OdlhOsTotalActivitiesReceivedFromCslHistogram", v17);
                                    fxra.k("OdlhOsTotalUnknownReceivedFromCslHistogram", v15);
                                    v17 = v17;
                                }
                            }
                            SemanticLocationState semanticLocationState1 = SemanticLocationState.a(intent0);
                            long v19 = semanticLocationState1.c * 1000L;
                            if(!hftp8.b_message.isImmutable()) {
                                hftp8.ensureMutable();
                            }
                            ProtoLiteMessage hftv15 = hftp8.b_message;
                            ((gzty)hftv15).b |= 1;
                            ((gzty)hftv15).c = v19;
                            boolean z2 = fxth.i(semanticLocationState1);
                            if(!hftv15.isImmutable()) {
                                hftp8.ensureMutable();
                            }
                            gzty gzty5 = (gzty)hftp8.b_message;
                            gzty5.b |= 0x8000;
                            gzty5.o = z2;
                            gzty gzty6 = (gzty)hftp8.N_build();
                            this.b.j.l(account3, gzty6, "semantic location segments");
                            return;
                        }
                    }
                    return;
                }
                case "com.google.android.location.reporting.ACTION_SEND_DATA": {
                    SendDataRequest sendDataRequest0 = (SendDataRequest)bauc.b(intent0, "request", SendDataRequest.CREATOR);
                    Account account0 = (Account)intent0.getParcelableExtra("account");
                    if(sendDataRequest0 != null && account0 != null && intent0.getStringExtra("caller") != null) {
                        try {
                            batl.t(sendDataRequest0.b, "no data");
                            String s1 = sendDataRequest0.a;
                            batl.r(s1, "no data type");
                            batl.c(s1.length() < 0x80, "data type too long");
                            ByteString hfsf0 = ByteString.copyFrom(sendDataRequest0.b);
                            long v2 = System.currentTimeMillis();
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzvf.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gzvf gzvf0 = (gzvf)hftp0.b_message;
                            gzvf0.b |= 2;
                            gzvf0.d = s1;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            ((gzvf)hftv0).b |= 8;
                            ((gzvf)hftv0).e = hfsf0;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gzvf gzvf1 = (gzvf)hftp0.b_message;
                            gzvf1.b |= 1;
                            gzvf1.c = v2;
                            gzvf gzvf2 = (gzvf)hftp0.N_build();
                            fxqn fxqn0 = fxtk0.j;
                            List list0 = Collections.singletonList(account0);
                            Object object0 = fxqn0.c;
                            synchronized(object0) {
                                if(fxqn0.d == null) {
                                    return;
                                }
                                fxqm fxqm0 = new fxqm();
                                try {
                                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fxrq.a).v_newBuilder();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    fxrq fxrq0 = (fxrq)hftp1.b_message;
                                    gzvf2.getClass();
                                    fxrq0.g = gzvf2;
                                    fxrq0.b |= 16;
                                    fxrq fxrq1 = (fxrq)hftp1.N_build();
                                    fxqn0.g(fxqm0, list0, gzvf2.c, fxrq1, "SendDataHelper");
                                    fxqn0.d(fxqm0, "SendDataHelper");
                                }
                                finally {
                                    fxqm0.a();
                                }
                            }
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            fxqw.g(("bad user data: " + sendDataRequest0.a), illegalArgumentException0);
                        }
                        return;
                    }
                    fxqw.m(53, "Received SendData intent missing an extra: " + intent0);
                    return;
                }
                case "com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE": {
                    String s9 = fxtk.d(intent0);
                    this.g.f(reportingConfig0, "DispatchingService.updateActiveState+" + s9);
                    return;
                }
                case "com.google.android.location.reporting.ACTION_UPDATE_WORLD": {
                    this.f.b(intent0);
                    return;
                }
                case "com.google.android.location.reporting.CHANGE_PRIMARY_DEVICE": {
                    if(intent0.hasExtra("account") && intent0.hasExtra("isPrimaryDevice")) {
                        Account account5 = (Account)intent0.getParcelableExtra("account");
                        boolean z4 = intent0.getBooleanExtra("isPrimaryDevice", true);
                        AccountConfig accountConfig0 = this.b.b.c(account5);
                        fxud fxud0 = new fxud(account5, "com.google.android.gms+gcm-primary-device");
                        fxud0.b(accountConfig0.c);
                        fxud0.n = Boolean.valueOf(z4);
                        fxue fxue0 = new fxue(fxud0);
                        this.b.b.l("DispatchingService.handlePrimaryDeviceChange", fxue0, "DispatchingService.handlePrimaryDeviceChange");
                        return;
                    }
                    fxqw.f(("Received change primary device intent missing extras:" + intent0));
                    return;
                }
                case "com.google.android.location.reporting.GCM_ID_CHANGED": {
                    fxtr fxtr1 = this.b.b;
                    synchronized(fxtr.b) {
                        Account[] arr_account = fxtr1.e.b();
                        for(int v6 = 0; v6 < arr_account.length; ++v6) {
                            fxtr1.g(arr_account[v6]);
                        }
                    }
                    return;
                }
                case "com.google.android.location.reporting.WIFI_TRIGGERED_FLUSH_AND_UPLOAD": {
                    if(!hzek.m()) {
                        this.g.e.b().z(this);
                        return;
                    }
                    return;
                }
                case "com.google.android.location.reporting.WIFI_TRIGGERED_UPLOAD": {
                    if(!hzek.m()) {
                        Location location0 = this.b.d.d();
                        fxuv fxuv0 = this.b.f.b(location0);
                        this.b.f.e(reportingConfig0, fxuv0, location0, true);
                        return;
                    }
                    return;
                }
                default: {
                    fxqw.m(0x20, "Unsupported action in " + intent0);
                    return;
                }
            }
        }
        fxqw.j(a.O(intent0, "Legacy intent ", ", updating active state to cancel it"));
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(this.b.a, "com.google.android.location.reporting.service.DispatchingService"));
        PendingIntent pendingIntent0 = fxsw.a(this.b.a, intent1);
        this.b.e.e(pendingIntent0);
        pendingIntent0.cancel();
    }

    @Override  // fxtg
    protected final void d(WifiScan wifiScan0) {
        int v = wifiScan0.c();
        Boolean boolean0 = Boolean.valueOf(false);
        java.util.Objects.toString(boolean0);
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.p(v, boolean0);
    }

    private final fxpu f() {
        synchronized(this) {
            if(this.i == null) {
                fxva.g(this.b.a);
                this.i = new fxpu(this.b.d, this.b.j, this.g);
            }
        }
        return this.i;
    }

    private final fxpy g() {
        synchronized(this) {
            if(this.h == null) {
                fxva.g(this.b.a);
                fxur fxur0 = new fxur(this.b.a);
                WifiManager wifiManager0 = (WifiManager)this.b.a.getSystemService("wifi");
                this.h = new fxpy(this.b.a, this.b.d, this.b.j, fxur0, this.g, bbnk.a);
            }
        }
        return this.h;
    }

    private final void h(Intent intent0, ReportingConfig reportingConfig0, boolean z) {
        boolean z8;
        fxpx fxpx0;
        boolean z2;
        gzwe gzwe5;
        ArrayList arrayList7;
        boolean z7;
        ReportingConfig reportingConfig3;
        ArrayList arrayList6;
        int v33;
        ReportingConfig reportingConfig2;
        Iterator iterator7;
        Iterator iterator6;
        List list3;
        fxtz fxtz0;
        ArrayList arrayList5;
        boolean z5;
        ArrayList arrayList3;
        fxsd fxsd0;
        long v17;
        long v16;
        ProtoLiteBuilder hftp3;
        int v15;
        ArrayList arrayList2;
        int v14;
        int v13;
        WifiScan wifiScan0;
        int v12;
        long v11;
        int v8;
        ArrayList arrayList1;
        List list1;
        long v4;
        fxtr fxtr1;
        int v3;
        boolean z3;
        LocationResult locationResult1;
        LocationResult locationResult0;
        if(!hzek.p()) {
            try {
                locationResult0 = LocationResult.d(intent0) ? LocationResult.c(intent0) : null;
            }
            catch(RuntimeException runtimeException0) {
                fxqw.g("getting location result", runtimeException0);
                return;
            }
            boolean z1 = LocationAvailability.b(intent0);
            if(locationResult0 == null) {
                z2 = z1;
                if(!z2) {
                    fxqw.f("Received null location result");
                }
                fxpx0 = null;
            }
            else {
                fxpy fxpy0 = this.g();
                fxts fxts0 = fxpy0.b;
                fxtr fxtr0 = this.b.b;
                long v = System.currentTimeMillis();
                ReportingConfig reportingConfig1 = fxtr0.d();
                if(reportingConfig1.e()) {
                    List list0 = locationResult0.b;
                    if(list0.isEmpty()) {
                        fxqw.f("Received null or empty location result, so returning early.");
                        z2 = z1;
                        fxpx0 = null;
                    }
                    else {
                        ArrayList arrayList0 = new ArrayList();
                        Location location0 = fxts0.d();
                        int v1 = 0;
                        while(v1 < list0.size()) {
                            Location location1 = (Location)list0.get(v1);
                            if(((int)z) == 0 && location0 != null) {
                                locationResult1 = locationResult0;
                                z3 = z1;
                                long v2 = fxpy.a(fxts0);
                                if(!fxpy0.c(v2) && fxpy.d(v2, location0.getElapsedRealtimeNanos(), location1.getElapsedRealtimeNanos())) {
                                    fxqw.j("Received locations too frequently.");
                                    goto label_43;
                                }
                            }
                            else {
                                locationResult1 = locationResult0;
                                z3 = z1;
                            }
                            if(location1.isMock() && hzek.a.i().aw()) {
                                fxqw.c("GCoreUlr", "Filtering location: " + location1);
                            label_43:
                                v3 = v1;
                                fxtr1 = fxtr0;
                                v4 = v;
                                list1 = list0;
                                arrayList1 = arrayList0;
                            }
                            else {
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fxry.a).v_newBuilder();
                                int v5 = fxuu.a(location1.getLongitude());
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                fxry fxry0 = (fxry)hftp0.b_message;
                                fxry0.b |= 2;
                                fxry0.d = v5;
                                int v6 = fxuu.a(location1.getLatitude());
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                fxry fxry1 = (fxry)hftp0.b_message;
                                fxry1.b |= 1;
                                fxry1.c = v6;
                                fxry fxry2 = (fxry)hftp0.N_build();
                                int v7 = cmol.a(location1);
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fxrv.a).v_newBuilder();
                                switch(v7) {
                                    case 1: {
                                        v8 = 3;
                                        break;
                                    }
                                    case 2: {
                                        v8 = 2;
                                        break;
                                    }
                                    case 3: {
                                        v8 = 1;
                                        break;
                                    }
                                    default: {
                                        v8 = 4;
                                    }
                                }
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((fxrv)hftp1.b_message).d = v8 - 1;
                                ((fxrv)hftp1.b_message).b |= 2;
                                long v9 = location1.getTime();
                                v3 = v1;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp1.b_message;
                                list1 = list0;
                                ((fxrv)hftv0).b |= 4;
                                ((fxrv)hftv0).e = v9;
                                if(!hftv0.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                fxrv fxrv0 = (fxrv)hftp1.b_message;
                                fxry2.getClass();
                                fxrv0.c = fxry2;
                                fxrv0.b |= 1;
                                if(location1.hasSpeed()) {
                                    float f = location1.getSpeed();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    fxrv fxrv1 = (fxrv)hftp1.b_message;
                                    fxrv1.b |= 8;
                                    fxrv1.f = f;
                                }
                                if(location1.hasBearing()) {
                                    float f1 = location1.getBearing();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    fxrv fxrv2 = (fxrv)hftp1.b_message;
                                    fxrv2.b |= 16;
                                    fxrv2.g = f1;
                                }
                                if(location1.hasAltitude()) {
                                    double f2 = location1.getAltitude();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    fxrv fxrv3 = (fxrv)hftp1.b_message;
                                    fxrv3.b |= 0x20;
                                    fxrv3.h = f2;
                                }
                                if(location1.hasAccuracy()) {
                                    float f3 = location1.getAccuracy();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    fxrv fxrv4 = (fxrv)hftp1.b_message;
                                    fxrv4.b |= 0x40;
                                    fxrv4.i = f3;
                                }
                                if(location1.hasVerticalAccuracy()) {
                                    float f4 = location1.getVerticalAccuracyMeters();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    fxrv fxrv5 = (fxrv)hftp1.b_message;
                                    fxrv5.b |= 0x40000;
                                    fxrv5.t = f4;
                                }
                                fxrv fxrv6 = (fxrv)hftp1.N_build();
                                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)fxrv6).jf(5, null);
                                hftp2.X(((ProtoLiteMessage)fxrv6));
                                try {
                                    long v10 = fxts0.b();
                                    v11 = TimeUnit.NANOSECONDS.toMillis(location1.getElapsedRealtimeNanos());
                                    v12 = fxts0.e || v10 == -1L || v11 >= v10 + hzek.g() ? 1 : 0;
                                    wifiScan0 = WifiScan.k(location1);
                                    if(wifiScan0 == null) {
                                        goto label_209;
                                    }
                                    else {
                                        v13 = wifiScan0.c();
                                        v14 = v12;
                                        arrayList2 = new ArrayList(v13);
                                        v15 = 0;
                                        while(true) {
                                        label_138:
                                            if(v15 >= v13) {
                                                goto label_208;
                                            }
                                            hftp3 = ((ProtoLiteMessage)fxsd.a).v_newBuilder();
                                            fxtr1 = fxtr0;
                                            v16 = v;
                                            goto label_142;
                                        }
                                    }
                                    goto label_211;
                                }
                                catch(RuntimeException runtimeException1) {
                                    goto label_216;
                                }
                                try {
                                label_142:
                                    v17 = wifiScan0.i(v15);
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    fxsd0 = (fxsd)hftp3.b_message;
                                    arrayList3 = arrayList0;
                                    goto label_150;
                                }
                                catch(RuntimeException runtimeException1) {
                                    try {
                                        goto label_218;
                                    label_150:
                                        fxsd0.b |= 1;
                                        fxsd0.c = v17;
                                        int v18 = wifiScan0.a(v15);
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        fxsd fxsd1 = (fxsd)hftp3.b_message;
                                        fxsd1.b |= 2;
                                        fxsd1.d = v18;
                                        int v19 = wifiScan0.b(v15);
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        fxsd fxsd2 = (fxsd)hftp3.b_message;
                                        fxsd2.b |= 16;
                                        fxsd2.g = v19;
                                        if(wifiScan0.d(v15) != 0) {
                                            int v20 = wifiScan0.d(v15);
                                            if(!hftp3.b_message.isImmutable()) {
                                                hftp3.ensureMutable();
                                            }
                                            fxsd fxsd3 = (fxsd)hftp3.b_message;
                                            fxsd3.b |= 0x20;
                                            fxsd3.h = v20;
                                            int v21 = wifiScan0.h(v15);
                                            if(!hftp3.b_message.isImmutable()) {
                                                hftp3.ensureMutable();
                                            }
                                            fxsd fxsd4 = (fxsd)hftp3.b_message;
                                            fxsd4.b |= 0x40;
                                            fxsd4.i = v21;
                                            int v22 = wifiScan0.g(v15);
                                            if(!hftp3.b_message.isImmutable()) {
                                                hftp3.ensureMutable();
                                            }
                                            fxsd fxsd5 = (fxsd)hftp3.b_message;
                                            fxsd5.b |= 0x80;
                                            fxsd5.j = v22;
                                            int v23 = wifiScan0.f(v15);
                                            if(!hftp3.b_message.isImmutable()) {
                                                hftp3.ensureMutable();
                                            }
                                            fxsd fxsd6 = (fxsd)hftp3.b_message;
                                            fxsd6.b |= 0x100;
                                            fxsd6.k = v23;
                                            int v24 = wifiScan0.e(v15);
                                            if(!hftp3.b_message.isImmutable()) {
                                                hftp3.ensureMutable();
                                            }
                                            fxsd fxsd7 = (fxsd)hftp3.b_message;
                                            fxsd7.b |= 0x200;
                                            fxsd7.l = v24;
                                            wifiScan0.i(v15);
                                            wifiScan0.d(v15);
                                            wifiScan0.h(v15);
                                            wifiScan0.g(v15);
                                            wifiScan0.f(v15);
                                            wifiScan0.e(v15);
                                        }
                                        arrayList2.add(((fxsd)hftp3.N_build()));
                                        ++v15;
                                        fxtr0 = fxtr1;
                                        v13 = v13;
                                        v = v16;
                                        arrayList0 = arrayList3;
                                        goto label_138;
                                    }
                                    catch(RuntimeException runtimeException1) {
                                        goto label_270;
                                    }
                                }
                            label_208:
                                goto label_211;
                                try {
                                label_209:
                                    v14 = v12;
                                    arrayList2 = null;
                                label_211:
                                    fxtr1 = fxtr0;
                                    v16 = v;
                                    arrayList3 = arrayList0;
                                    goto label_220;
                                }
                                catch(RuntimeException runtimeException1) {
                                label_216:
                                    fxtr1 = fxtr0;
                                    v16 = v;
                                }
                            label_218:
                                arrayList3 = arrayList0;
                                goto label_270;
                                try {
                                label_220:
                                    if(arrayList2 != null && !arrayList2.isEmpty()) {
                                        fxra.i("UlrWifiReceived", reportingConfig1);
                                        fxra.l("UlrWifiReceivedScanSize", ((long)arrayList2.size()));
                                    }
                                    if(arrayList2 != null && v14 != 0) {
                                        Context context0 = fxpy0.a;
                                        if(hzek.a.i().ay()) {
                                            WifiInfo wifiInfo0 = fyam.a(context0);
                                            String s = wifiInfo0 == null ? null : wifiInfo0.getBSSID();
                                            if(s != null) {
                                                long v25 = gxtu.d(s);
                                                for(Object object0: arrayList2) {
                                                    fxsd fxsd8 = (fxsd)object0;
                                                    if(fxsd8.c == v25) {
                                                        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)fxsd8).jf(5, null);
                                                        hftp4.X(((ProtoLiteMessage)fxsd8));
                                                        if(!hftp4.b_message.isImmutable()) {
                                                            hftp4.ensureMutable();
                                                        }
                                                        fxsd fxsd9 = (fxsd)hftp4.b_message;
                                                        fxsd9.b |= 8;
                                                        fxsd9.f = true;
                                                        arrayList2.set(arrayList2.indexOf(fxsd8), ((fxsd)hftp4.N_build()));
                                                    }
                                                    else {
                                                        continue;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        ((fxrv)hftp2.b_message).o = hfvv.a;
                                        int v26 = arrayList2.size();
                                        for(Object object1: arrayList2) {
                                            fxsd fxsd10 = (fxsd)object1;
                                            if(!hftp2.b_message.isImmutable()) {
                                                hftp2.ensureMutable();
                                            }
                                            fxrv fxrv7 = (fxrv)hftp2.b_message;
                                            fxsd10.getClass();
                                            hfuo hfuo0 = fxrv7.o;
                                            if(!hfuo0.c()) {
                                                fxrv7.o = ProtoLiteMessage.E(hfuo0);
                                            }
                                            fxrv7.o.add(fxsd10);
                                        }
                                        hzek.g();
                                        if(v26 > 0) {
                                            fxts0.m(v11);
                                            fxra.i("UlrWifiAttached", reportingConfig1);
                                        }
                                    }
                                    else {
                                        hzek.g();
                                    }
                                    goto label_271;
                                }
                                catch(RuntimeException runtimeException1) {
                                }
                            label_270:
                                fxqw.g("Best-effort Wifi scan attachment failed", runtimeException1);
                            label_271:
                                hzee hzee0 = hzee.a;
                                boolean z4 = hzee0.b().e();
                                String s1 = cmol.k(location1);
                                if(!z4 && s1 != null) {
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    fxrv fxrv8 = (fxrv)hftp2.b_message;
                                    fxrv8.b |= 0x800;
                                    fxrv8.m = s1;
                                }
                                Integer integer0 = cmol.h(location1);
                                if(!z4 && integer0 != null) {
                                    int v27 = (int)integer0;
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    fxrv fxrv9 = (fxrv)hftp2.b_message;
                                    fxrv9.b |= 0x1000;
                                    fxrv9.n = v27;
                                }
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                fxrv fxrv10 = (fxrv)hftp2.b_message;
                                fxrv10.b |= 0x80;
                                fxrv10.j = 2023;
                                if(!hzee0.b().a()) {
                                    float f5 = fxuw.a(location1, location0);
                                    if(f5 > 0.0f) {
                                        float f6 = location0.distanceTo(location1);
                                        if(f6 > f5 && ((double)f6) > hzek.b()) {
                                            z5 = false;
                                            goto label_301;
                                        }
                                    }
                                    z5 = true;
                                label_301:
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    fxrv fxrv11 = (fxrv)hftp2.b_message;
                                    fxrv11.b |= 0x400;
                                    fxrv11.l = z5;
                                }
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                fxrv fxrv12 = (fxrv)hftp2.b_message;
                                fxrv12.b |= 0x10000;
                                v4 = v16;
                                fxrv12.s = v4;
                                arrayList1 = arrayList3;
                                arrayList1.add(((fxrv)hftp2.N_build()));
                                fxpy0.b.l();
                                location0 = location1;
                            }
                            v1 = v3 + 1;
                            arrayList0 = arrayList1;
                            v = v4;
                            fxtr0 = fxtr1;
                            list0 = list1;
                            z1 = z3;
                            locationResult0 = locationResult1;
                        }
                        z2 = z1;
                        fxtr fxtr2 = fxtr0;
                        ArrayList arrayList4 = arrayList0;
                        if(arrayList4.isEmpty()) {
                            fxqw.c("GCoreUlr", "No valid location reports to store");
                            fxpx0 = null;
                        }
                        else {
                            fxrv fxrv13 = (fxrv)arrayList4.remove(arrayList4.size() - 1);
                            ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)fxrv13).jf(5, null);
                            hftp5.X(((ProtoLiteMessage)fxrv13));
                            fxro fxro0 = fxur.a(fxpy0.d.b);
                            if(hzee.a.b().f()) {
                                boolean z6 = fxro0 != null && (fxro0.b & 1) != 0 && (fxrn.a(fxro0.c) != 0 && fxrn.a(fxro0.c) != 1);
                                if(!hftp5.b_message.isImmutable()) {
                                    hftp5.ensureMutable();
                                }
                                fxrv fxrv14 = (fxrv)hftp5.b_message;
                                fxrv14.b |= 0x200;
                                fxrv14.k = z6;
                            }
                            arrayList4.add(((fxrv)hftp5.N_build()));
                            fxpy0.b.g = fxro0;
                            Location location2 = locationResult0.a();
                            fxqn fxqn0 = fxpy0.c;
                            List list2 = fxtr2.d().b();
                            Object object2 = fxqn0.c;
                            __monitor_enter(object2);
                            try {
                                if(fxqn0.d == null) {
                                    goto label_460;
                                }
                                else {
                                    fxqm fxqm0 = new fxqm();
                                    try {
                                        Iterator iterator2 = arrayList4.iterator();
                                        while(iterator2.hasNext()) {
                                            Object object3 = iterator2.next();
                                            fxrv fxrv15 = (fxrv)object3;
                                            long v29 = fxrv15.e;
                                            Iterator iterator3 = list2.iterator();
                                            while(iterator3.hasNext()) {
                                                Object object4 = iterator3.next();
                                                Account account0 = ((AccountConfig)object4).a;
                                                Iterator iterator4 = fxtr2.j.iterator();
                                                while(true) {
                                                    if(iterator4.hasNext()) {
                                                        Object object5 = iterator4.next();
                                                        arrayList5 = arrayList4;
                                                        fxtz0 = (fxtz)object5;
                                                        list3 = list2;
                                                        if(account0.equals(fxtz0.c)) {
                                                            break;
                                                        }
                                                        else {
                                                            list2 = list3;
                                                            arrayList4 = arrayList5;
                                                            continue;
                                                        }
                                                    }
                                                    arrayList5 = arrayList4;
                                                    list3 = list2;
                                                    fxtz0 = null;
                                                    break;
                                                }
                                                if(fxtz0 == null) {
                                                    fxtz0 = new fxtz(account0, fxtr2.d);
                                                    fxtr2.j.add(fxtz0);
                                                }
                                                int v30 = fxtz0.a;
                                                fxtz0.a = v30 + 1;
                                                if(account0 == null) {
                                                    iterator6 = iterator2;
                                                    iterator7 = iterator3;
                                                    reportingConfig2 = reportingConfig1;
                                                    v33 = -1;
                                                }
                                                else {
                                                    fxtz fxtz1 = null;
                                                    Iterator iterator5 = fxtr2.j.iterator();
                                                    while(iterator5.hasNext()) {
                                                        Object object6 = iterator5.next();
                                                        fxtz fxtz2 = (fxtz)object6;
                                                        if(!account0.equals(fxtz2.c)) {
                                                            iterator5 = iterator5;
                                                            continue;
                                                        }
                                                        fxtz1 = fxtz2;
                                                        break;
                                                    }
                                                    if(fxtz1 == null) {
                                                        fxtz1 = new fxtz(account0, fxtr2.d);
                                                        fxtr2.j.add(fxtz1);
                                                    }
                                                    if(fxtz1.b == 0) {
                                                        iterator6 = iterator2;
                                                        String s2 = fxtu.d(fxtz1.c);
                                                        iterator7 = iterator3;
                                                        int v31 = fxtz1.d.a.getInt(s2, 0) + 1;
                                                        fxtz1.b = v31;
                                                        __monitor_enter(fxtz1.e);
                                                        int v32 = FIN.finallyOpen$NT();
                                                        String s3 = fxtu.d(fxtz1.c);
                                                        reportingConfig2 = reportingConfig1;
                                                        SharedPreferences.Editor sharedPreferences$Editor0 = fxtz1.d.a.edit();
                                                        sharedPreferences$Editor0.putInt(s3, v31);
                                                        sharedPreferences$Editor0.apply();
                                                        FIN.finallyCodeBegin$NT(v32);
                                                        __monitor_exit(fxtz1.e);
                                                        FIN.finallyCodeEnd$NT(v32);
                                                    }
                                                    else {
                                                        iterator6 = iterator2;
                                                        iterator7 = iterator3;
                                                        reportingConfig2 = reportingConfig1;
                                                    }
                                                    v33 = fxtz1.b;
                                                }
                                                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)fxrq.a).v_newBuilder();
                                                ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)fxrv15).jf(5, null);
                                                hftp7.X(((ProtoLiteMessage)fxrv15));
                                                if(!hftp7.b_message.isImmutable()) {
                                                    hftp7.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv1 = hftp7.b_message;
                                                ((fxrv)hftv1).b |= 0x4000;
                                                ((fxrv)hftv1).q = v33;
                                                if(!hftv1.isImmutable()) {
                                                    hftp7.ensureMutable();
                                                }
                                                fxrv fxrv16 = (fxrv)hftp7.b_message;
                                                fxrv16.b |= 0x8000;
                                                fxrv16.r = v30;
                                                fxrv fxrv17 = (fxrv)hftp7.N_build();
                                                if(!hftp6.b_message.isImmutable()) {
                                                    hftp6.ensureMutable();
                                                }
                                                fxrq fxrq0 = (fxrq)hftp6.b_message;
                                                fxrv17.getClass();
                                                fxrq0.c = fxrv17;
                                                fxrq0.b |= 1;
                                                fxrq fxrq1 = (fxrq)hftp6.N_build();
                                                byte[] arr_b = fxqn0.f(fxrq1, "Locations");
                                                if(arr_b != null) {
                                                    fxqm0.b(fxqq.b(account0, v29, fxrq1), arr_b);
                                                }
                                                list2 = list3;
                                                iterator2 = iterator6;
                                                reportingConfig1 = reportingConfig2;
                                                iterator3 = iterator7;
                                                fxrv15 = fxrv15;
                                                arrayList4 = arrayList5;
                                                fxtr2 = fxtr2;
                                            }
                                        }
                                        arrayList6 = arrayList4;
                                        reportingConfig3 = reportingConfig1;
                                        z7 = fxqn0.d(fxqm0, "Locations");
                                    }
                                    finally {
                                        fxqm0.a();
                                    }
                                    goto label_458;
                                }
                                goto label_468;
                            }
                            catch(Throwable throwable0) {
                                goto label_466;
                            }
                        label_458:
                            __monitor_exit(object2);
                            goto label_468;
                            try {
                            label_460:
                                __monitor_exit(object2);
                                arrayList6 = arrayList4;
                                reportingConfig3 = reportingConfig1;
                                z7 = false;
                            }
                            catch(Throwable throwable0) {
                            label_466:
                                __monitor_exit(object2);
                                throw throwable0;
                            }
                        label_468:
                            if(z7) {
                                fxqw.c("GCoreUlr", "Successfully inserted " + arrayList6.size() + " locations");
                                long v34 = SystemClock.elapsedRealtime();
                                fxpy0.b.s(location2, v34);
                            }
                            else {
                                fxqw.j("Location insertion failed for all accounts");
                            }
                            Object object7 = fxpy0.e.g.e;
                            __monitor_enter(object7);
                            int v35 = FIN.finallyOpen$NT();
                            Set set0 = fxpy0.e.g.b;
                            if(set0.isEmpty()) {
                                arrayList7 = new ArrayList();
                                FIN.finallyExec$NT(v35);
                            }
                            else {
                                ArrayList arrayList8 = new ArrayList(set0);
                                set0.clear();
                                FIN.finallyCodeBegin$NT(v35);
                                long v36 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                                for(Object object8: arrayList6) {
                                    fxrv fxrv18 = (fxrv)object8;
                                    if(fxrv18.o.size() == 0) {
                                        continue;
                                    }
                                    Iterator iterator9 = arrayList8.iterator();
                                    while(iterator9.hasNext()) {
                                        Object object9 = iterator9.next();
                                        WifiScan wifiScan1 = (WifiScan)object9;
                                        if(wifiScan1.c + v36 != fxrv18.e || wifiScan1.c() > fxrv18.o.size()) {
                                            continue;
                                        }
                                        iterator9.remove();
                                    }
                                }
                                int v37 = (int)hzek.a.i().R();
                                ArrayList arrayList9 = new ArrayList();
                                for(Object object10: arrayList8) {
                                    WifiScan wifiScan2 = (WifiScan)object10;
                                    ArrayList arrayList10 = new ArrayList();
                                    int v38 = 0;
                                    while(v38 < wifiScan2.c() && v38 < v37) {
                                        if(wifiScan2.d(v38) == 0) {
                                            gzwe5 = null;
                                        }
                                        else {
                                            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gzwe.a).v_newBuilder();
                                            int v39 = wifiScan2.d(v38);
                                            if(!hftp8.b_message.isImmutable()) {
                                                hftp8.ensureMutable();
                                            }
                                            gzwe gzwe0 = (gzwe)hftp8.b_message;
                                            gzwe0.b |= 1;
                                            gzwe0.c = v39;
                                            int v40 = wifiScan2.e(v38);
                                            if(!hftp8.b_message.isImmutable()) {
                                                hftp8.ensureMutable();
                                            }
                                            gzwe gzwe1 = (gzwe)hftp8.b_message;
                                            gzwe1.b |= 16;
                                            gzwe1.g = v40;
                                            int v41 = wifiScan2.f(v38);
                                            if(!hftp8.b_message.isImmutable()) {
                                                hftp8.ensureMutable();
                                            }
                                            gzwe gzwe2 = (gzwe)hftp8.b_message;
                                            gzwe2.b |= 8;
                                            gzwe2.f = v41;
                                            int v42 = wifiScan2.g(v38);
                                            if(!hftp8.b_message.isImmutable()) {
                                                hftp8.ensureMutable();
                                            }
                                            gzwe gzwe3 = (gzwe)hftp8.b_message;
                                            gzwe3.b |= 4;
                                            gzwe3.e = v42;
                                            int v43 = wifiScan2.h(v38);
                                            if(!hftp8.b_message.isImmutable()) {
                                                hftp8.ensureMutable();
                                            }
                                            gzwe gzwe4 = (gzwe)hftp8.b_message;
                                            gzwe4.b |= 2;
                                            gzwe4.d = v43;
                                            gzwe5 = (gzwe)hftp8.N_build();
                                            wifiScan2.i(v38);
                                            wifiScan2.d(v38);
                                            wifiScan2.h(v38);
                                            wifiScan2.g(v38);
                                            wifiScan2.f(v38);
                                            wifiScan2.e(v38);
                                        }
                                        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gzwd.a).v_newBuilder();
                                        int v44 = wifiScan2.b(v38);
                                        if(!hftp9.b_message.isImmutable()) {
                                            hftp9.ensureMutable();
                                        }
                                        gzwd gzwd0 = (gzwd)hftp9.b_message;
                                        gzwd0.b |= 16;
                                        gzwd0.g = v44;
                                        long v45 = wifiScan2.i(v38);
                                        if(!hftp9.b_message.isImmutable()) {
                                            hftp9.ensureMutable();
                                        }
                                        gzwd gzwd1 = (gzwd)hftp9.b_message;
                                        gzwd1.b |= 1;
                                        gzwd1.c = v45;
                                        int v46 = wifiScan2.a(v38);
                                        if(!hftp9.b_message.isImmutable()) {
                                            hftp9.ensureMutable();
                                        }
                                        ProtoLiteMessage hftv2 = hftp9.b_message;
                                        ((gzwd)hftv2).b |= 2;
                                        ((gzwd)hftv2).d = v46;
                                        if(gzwe5 != null) {
                                            if(!hftv2.isImmutable()) {
                                                hftp9.ensureMutable();
                                            }
                                            ((gzwd)hftp9.b_message).h = gzwe5;
                                            ((gzwd)hftp9.b_message).b |= 0x20;
                                        }
                                        arrayList10.add(((gzwd)hftp9.N_build()));
                                        ++v38;
                                        v36 = v36;
                                    }
                                    long v47 = v36 + wifiScan2.c;
                                    ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
                                    if(!hftp10.b_message.isImmutable()) {
                                        hftp10.ensureMutable();
                                    }
                                    gzty gzty0 = (gzty)hftp10.b_message;
                                    hfuo hfuo1 = gzty0.h;
                                    if(!hfuo1.c()) {
                                        gzty0.h = ProtoLiteMessage.E(hfuo1);
                                    }
                                    hfrj.E(arrayList10, gzty0.h);
                                    if(!hftp10.b_message.isImmutable()) {
                                        hftp10.ensureMutable();
                                    }
                                    gzty gzty1 = (gzty)hftp10.b_message;
                                    gzty1.b |= 1;
                                    gzty1.c = v47;
                                    arrayList9.add(((gzty)hftp10.N_build()));
                                    v36 = v36;
                                }
                                arrayList7 = arrayList9;
                            }
                            if(!arrayList7.isEmpty()) {
                                fxqn fxqn1 = fxpy0.c;
                                List list4 = reportingConfig3.c();
                                if(!arrayList7.isEmpty()) {
                                    Object object11 = fxqn1.c;
                                    __monitor_enter(object11);
                                    int v48 = FIN.finallyOpen$NT();
                                    if(fxqn1.d != null) {
                                        fxqm fxqm1 = new fxqm();
                                        int v49 = FIN.finallyOpen$NT();
                                        for(Object object12: arrayList7) {
                                            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)fxrq.a).v_newBuilder();
                                            if(!hftp11.b_message.isImmutable()) {
                                                hftp11.ensureMutable();
                                            }
                                            fxrq fxrq2 = (fxrq)hftp11.b_message;
                                            ((gzty)object12).getClass();
                                            fxrq2.e = (gzty)object12;
                                            fxrq2.b |= 4;
                                            fxrq fxrq3 = (fxrq)hftp11.N_build();
                                            fxqn1.g(fxqm1, list4, ((gzty)object12).c, fxrq3, "wifi scans");
                                        }
                                        fxqn1.d(fxqm1, "wifi scans");
                                        FIN.finallyCodeBegin$NT(v49);
                                        fxqm1.a();
                                        FIN.finallyCodeEnd$NT(v49);
                                    }
                                    FIN.finallyCodeBegin$NT(v48);
                                    __monitor_exit(object11);
                                    FIN.finallyCodeEnd$NT(v48);
                                }
                            }
                            if(!z7) {
                                location2 = null;
                            }
                            fxpx0 = new fxpx(location2);
                        }
                    }
                }
                else {
                    fxpy.b(reportingConfig1, fxpy0.e);
                    z2 = z1;
                    fxpx0 = null;
                }
                Boolean boolean0 = Boolean.valueOf(((boolean)(((int)z) ^ 1)));
                java.util.Objects.toString(boolean0);
                if(fxrc.q()) {
                    fxrc.a.k(boolean0);
                }
            }
            if(!z2) {
            label_663:
                if(fxpx0 != null) {
                label_664:
                    Location location3 = fxpx0 == null ? null : fxpx0.a;
                    if(!hzek.m() || ((int)z) != 0) {
                        this.b.f.d(reportingConfig0, location3);
                    }
                }
            }
            else if(LocationAvailability.a(intent0) != null) {
                fxpy fxpy1 = this.g();
                fxts fxts1 = fxpy1.b;
                long v50 = System.currentTimeMillis();
                Long long0 = fxts1.j();
                if(long0 == null) {
                label_651:
                    if(fxts1.j() == null) {
                        fxts1.t(v50);
                        gzty gzty2 = fxvb.d(v50, true);
                        cnug.b(reportingConfig0.c());
                        List list5 = reportingConfig0.c();
                        fxpy1.c.n(list5, gzty2, "location status");
                        z8 = true;
                    }
                    else {
                        z8 = false;
                    }
                }
                else {
                    long v51 = hzek.e();
                    if(!fxpy1.c(v51) && fxpy.d(v51, 0L, 0L)) {
                        fxqw.j(("Received location statuses too frequently: [" + long0 + "], [" + v50 + "]"));
                        z8 = false;
                        goto label_660;
                    }
                    goto label_651;
                }
            label_660:
                if(z8) {
                    goto label_664;
                }
                else {
                    goto label_663;
                }
            }
            else {
                fxqw.f("locationStatus not set.");
                goto label_663;
            }
            return;
        }
        this.b.h();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        fxtk.g(this.b.a);
    }

    private static final boolean i(SemanticLocationState semanticLocationState0) {
        return semanticLocationState0.d == null ? true : semanticLocationState0.d.d;
    }
}

