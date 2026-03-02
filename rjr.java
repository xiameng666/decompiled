import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import com.android.onboarding.contracts.annotations.OnboardingNode;
import com.android.onboarding.pending.PendingActivityContract;
import com.android.onboarding.pending.PendingContract.ErasedActivity;
import j..time.Instant;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public abstract class rjr extends adc implements rnb, roo {
    public static final Map a;
    public final rna b;
    private final ibnn d;
    private final ibnn e;
    private final ibnn f;
    private final rjo g;

    static {
        rjr.a = new LinkedHashMap();
    }

    public rjr() {
        this.d = new ibnz(new rji(this));
        this.e = new ibnz(new rjp(this.f()));
        this.f = new ibnz(new rjq(this.f()));
        this.b = new rjj(this);
        this.g = new rjo(this);
    }

    @Override  // adc
    public final Intent a(Context context0, Object object0) {
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        rjo rjo0 = this.g;
        Intent intent0 = rjo0.a.e(context0, object0);
        long v = rnx.a(context0);
        long v1 = rjo0.d;
        if(Long.compare(v1, -1L) == 0) {
            rjo0.d = intent0.getLongExtra("com.android.onboarding.ONBOARDING_NODE_ID", -1L);
            sct.e(rjo0.b, "getSynchronousResult was not called when creating intent.");
        }
        else {
            ibuq.c(intent0.putExtra("com.android.onboarding.ONBOARDING_NODE_ID", v1));
        }
        rpv rpv0 = rqa.c;
        long v2 = rjo0.d;
        Instant instant0 = Instant.now();
        if(rjo0 == null) {
            ibuq.i("nodeRef");
        }
        ibuq.f(instant0, "timestamp");
        rpv0.a(new rou(new ron(rjo0), v, v2, object0, instant0));
        rjo0.d = -1L;
        return intent0;
    }

    @Override  // adc
    public final Object b(int v, Intent intent0) {
        long v1 = intent0 == null ? -1L : rnx.b(intent0);
        Object object0 = this.g.a(new ActivityResult(v, intent0));
        rpv rpv0 = rqa.c;
        Instant instant0 = Instant.now();
        ibuq.f(instant0, "timestamp");
        rpv0.a(new rpa(new ron(this.g), v1, object0, instant0));
        if((object0 instanceof rjf)) {
            rpv0.a(new rox(v1, object0.toString(), Instant.now()));
        }
        return object0;
    }

    @Override  // adc
    public final adb c(Context context0, Object object0) {
        Object object2;
        Iterable iterable0;
        Object object1;
        ibns ibns0;
        rjg rjg0;
        rjo rjo0 = this.g;
        String s = rix.a(rjo0);
        try {
            if(((Boolean)rix.a.a()).booleanValue()) {
                try {
                    ibuq.e("com.google.android.gms", "getPackageName(...)");
                    Uri uri0 = riz.b(riz.a("com.google.android.gms")).buildUpon().path("fake_activity_node_config").appendPath(s).build();
                    ibuq.e(uri0, "build(...)");
                    Cursor cursor0 = context0.getContentResolver().query(uri0, new String[0], null, null, null, null);
                    if(cursor0 == null) {
                        object1 = null;
                    }
                    else {
                        try {
                            if(cursor0.getExtras() == null) {
                                goto label_39;
                            }
                            else {
                                Bundle bundle0 = cursor0.getExtras();
                                ibuq.e(bundle0, "getExtras(...)");
                                ibuq.f(bundle0, "bundle");
                                String s1 = bundle0.getString("FAKE_CONTRACT_CLASS_IDENTIFIER");
                                if(s1 == null) {
                                    ibns0 = null;
                                }
                                else {
                                    int v = bundle0.getInt("CONTRACT_RESULT_CODE");
                                    Intent intent0 = Build.VERSION.SDK_INT < 33 ? ((Intent)bundle0.getParcelable("CONTRACT_RESULT_INTENT")) : ((Intent)bundle0.getParcelable("CONTRACT_RESULT_INTENT", Intent.class));
                                    String s2 = bundle0.getString("CONTRACT_RESULT_TYPE");
                                    if(s2 == null) {
                                        Objects.toString(bundle0);
                                        throw new IllegalStateException("ContractResult type shouldn\'t be null in bundle " + bundle0);
                                    }
                                    if(ibuq.m(s2, "CONTRACT_RESULT_SUCCESS")) {
                                        rjg0 = new rjg(v, intent0);
                                    }
                                    else {
                                        if(!ibuq.m(s2, "CONTRACT_RESULT_FAILURE")) {
                                            throw new IllegalStateException("Invalid contract result type " + s2);
                                        }
                                        rjg0 = new rjf(v, intent0, bundle0.getString("CONTRACT_RESULT_FAILURE_REASON"));
                                    }
                                    ibns0 = new ibns(s1, rjg0);
                                }
                                if(ibns0 == null) {
                                    goto label_37;
                                }
                                else {
                                    object1 = (rjh)ibns0.b;
                                    goto label_35;
                                }
                            }
                            goto label_50;
                        }
                        catch(Throwable throwable2) {
                            ibsx.a(cursor0, throwable2);
                            throw throwable2;
                        }
                    label_35:
                        ibsx.a(cursor0, null);
                        goto label_50;
                    label_37:
                        ibsx.a(cursor0, null);
                        goto label_49;
                    label_39:
                        ibsx.a(cursor0, null);
                        goto label_49;
                    }
                }
                catch(Throwable throwable1) {
                    Log.e("ContractUtils", "Error while fetching fake contract response of node " + s, throwable1);
                    goto label_49;
                }
            }
            else {
                goto label_49;
            }
            goto label_50;
        }
        catch(Throwable throwable0) {
            Log.e("ContractUtils", "Error while fetching fake contract response of contract " + s, throwable0);
            goto label_49;
        }
        object1 = null;
        goto label_50;
    label_49:
        object1 = null;
    label_50:
        if(object1 != null) {
            sct.d(rjo0.b, a.L(object1, s, "Contract result fetched for fake node ", " is "));
            return new adb(rjo0.a(((rjh)object1).c()));
        }
        long v1 = rnx.a(context0);
        rjo0.d = UUID.randomUUID().getLeastSignificantBits();
        rpv rpv0 = rqa.c;
        long v2 = rjo0.d;
        Instant instant0 = Instant.now();
        if(rjo0 == null) {
            ibuq.i("nodeRef");
        }
        ibuq.f(instant0, "timestamp");
        rpv0.a(new rpg(new ron(rjo0), v1, v2, object0, instant0));
        if(rjo0 == null) {
            ibuq.i("nodeRef");
        }
        try {
            if(((Boolean)riv.a.a()).booleanValue()) {
                ibuq.e("com.google.android.gms", "getPackageName(...)");
                Uri uri1 = riz.b(riz.a("com.google.android.gms")).buildUpon().path("test_config").build();
                ibuq.e(uri1, "build(...)");
                Cursor cursor1 = context0.getContentResolver().query(uri1, new String[]{"allowed_node"}, null, null, null, null);
                if(cursor1 != null) {
                    try {
                        if(cursor1.moveToFirst()) {
                            iterable0 = null;
                            do {
                                int v3 = cursor1.getColumnIndex("allowed_node");
                                if(v3 == -1) {
                                    throw new IllegalArgumentException("Column allowed_node not found.");
                                }
                                String s3 = cursor1.getString(v3);
                                if(iterable0 == null) {
                                    iterable0 = new LinkedHashSet();
                                }
                                ibuq.c(s3);
                                ((Set)iterable0).add(s3);
                            }
                            while(cursor1.moveToNext());
                        }
                        else {
                            goto label_89;
                        }
                        goto label_90;
                    }
                    catch(Throwable throwable4) {
                        ibsx.a(cursor1, throwable4);
                        throw throwable4;
                    }
                }
            label_89:
                iterable0 = null;
            label_90:
                ibsx.a(cursor1, null);
                if(iterable0 == null) {
                    object2 = null;
                }
                else {
                    object2 = ibpo.ay(iterable0);
                    if(object2 == null) {
                        object2 = null;
                    }
                }
            }
            else {
                object2 = null;
            }
            if(!ibuq.m(object2, null)) {
                String s4 = rix.a(rjo0);
                if(!((Set)object2).contains(s4)) {
                    Log.w("TestFramework", a.a(s4, "Contract ", " is not allowed to execute"));
                    Process.killProcess(Process.myPid());
                    return null;
                }
            }
        }
        catch(Throwable throwable3) {
            Log.e("TestFramework", "Error while fetching list of allowed nodes", throwable3);
            return null;
        }
        return null;
    }

    protected abstract Object d(Intent arg1);

    protected abstract Intent e(Context arg1, Object arg2);

    public final OnboardingNode f() {
        return (OnboardingNode)this.d.a();
    }

    @Override  // rof
    public final String fa() {
        return (String)this.e.a();
    }

    @Override  // roo
    public final String fb() {
        return (String)this.f.a();
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override  // rne
    public final rna g() {
        return this.b;
    }

    @Override  // rnf
    public final rna h() {
        throw null;
    }

    public final PendingContract.ErasedActivity i(Context context0, Object object0) {
        ibuq.f(context0, "context");
        PendingContract.ErasedActivity pendingContract$ErasedActivity0 = new PendingActivityContract(this.e(context0, object0));
        String s = this.fa();
        ibuq.f(s, "value");
        pendingContract$ErasedActivity0.a.a.putString("com.android.onboarding.pending.COMPONENT", s);
        String s1 = this.fb();
        ibuq.f(s1, "value");
        pendingContract$ErasedActivity0.a.a.putString("com.android.onboarding.pending.NODE", s1);
        long v = rnx.a(context0);
        pendingContract$ErasedActivity0.a.a.putLong("com.android.onboarding.pending.CREATOR_ID", v);
        int v1 = rri.a();
        pendingContract$ErasedActivity0.a.a.putInt("com.android.onboarding.pending.TARGET_USER_ID", v1);
        long v2 = pendingContract$ErasedActivity0.a.a.getLong("com.android.onboarding.pending.CREATOR_ID", -1L);
        Instant instant0 = Instant.now();
        ibuq.f(instant0, "timestamp");
        rps rps0 = new rps(this.o(), v2, object0, instant0);
        rqa.c.a(rps0);
        return pendingContract$ErasedActivity0;
    }

    public final Object j(Intent intent0) {
        ibuq.f(intent0, "intent");
        rpv rpv0 = rqa.c;
        long v = rnx.b(intent0);
        rpi rpi0 = rjr.q(intent0);
        Instant instant0 = Instant.now();
        ibuq.f(instant0, "timestamp");
        rpv0.a(new row(this.o(), v, rpi0, instant0));
        rjs rjs0 = rjt.a;
        ibuq.f(intent0, "<this>");
        Bundle bundle0 = intent0.getBundleExtra("result_redirection_config");
        if(bundle0 != null) {
            rjs0.c(scv.a(bundle0, null));
        }
        Object object0 = this.d(intent0);
        long v1 = rnx.b(intent0);
        Instant instant1 = Instant.now();
        ibuq.f(instant1, "timestamp");
        rpv0.a(new ror(this.o(), v1, object0, instant1));
        return object0;
    }

    protected abstract Object k(ActivityResult arg1);

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // roo
    public final String m() {
        return rol.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    public final void p(Activity activity0, lpg lpg0, Intent intent0) {
        Object object0;
        ibuq.f(activity0, "activity");
        ibuq.f(intent0, "intent");
        rjl rjl0 = new rjl(activity0);
        rjm rjm0 = new rjm(activity0);
        rjn rjn0 = lpg0 == null ? null : new rjn(lpg0);
        ibuq.f(intent0, "intent");
        long v = rnx.b(intent0);
        rpi rpi0 = rjr.q(intent0);
        Instant instant0 = Instant.now();
        ibuq.f(instant0, "timestamp");
        rph rph0 = new rph(this.o(), v, rpi0, instant0);
        rqa.c.a(rph0);
        try {
            object0 = this.j(intent0);
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            long v1 = rnx.b(intent0);
            rpi rpi1 = rjr.q(intent0);
            Instant instant1 = Instant.now();
            ibuq.f(instant1, "timestamp");
            roy roy0 = new roy(this.o(), v1, throwable1, rpi1, instant1);
            rqa.c.a(roy0);
        }
        if(ibnw.b(object0)) {
            object0 = Boolean.valueOf(true);
        }
        Boolean boolean0 = Boolean.valueOf(false);
        if((object0 instanceof ibnv)) {
            object0 = boolean0;
        }
        Boolean boolean1 = (Boolean)object0;
        if(rjn0 != null) {
            rjk rjk0 = new rjk(rjl0, intent0, rjm0, this);
            rjn0.a.c(rjk0);
        }
    }

    private static final rpi q(Intent intent0) {
        ibqu ibqu0 = new ibqu();
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                ibuq.c(((String)object0));
                ibqu0.put(((String)object0), bundle0.get(((String)object0)));
            }
        }
        Map map0 = ibpz.b(ibqu0);
        return new rpi(intent0.getAction(), map0);
    }
}

