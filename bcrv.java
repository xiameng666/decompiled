import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.CallLog.Calls;
import android.telephony.PhoneNumberRange;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Pair;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bcrv implements bcsg {
    public static final baun a;
    public final bbxx b;
    public final bcrd c;
    public final bcrr d;
    public final Object e;
    public hofq f;
    gmfx g;
    final bcru h;
    private final BlockingQueue i;
    private final ExecutorService j;
    private final ScheduledExecutorService k;
    private final bcpt l;
    private long m;
    private final bcsi n;

    static {
        bcrv.a = bcrh.a("flash_call_verifier");
    }

    public bcrv(hofs hofs0, bbxx bbxx0, bcrd bcrd0, bcrr bcrr0) {
        ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(1);
        bcpt bcpt0 = bcpt.a();
        super();
        this.e = new Object();
        this.j = new bblp(1, 9);
        this.k = new bbll(1, 9);
        this.m = 0L;
        this.g = gmfx.a;
        this.h = new bcru(this);
        this.b = bbxx0;
        this.c = bcrd0;
        this.d = bcrr0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hofs0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hofs0));
        this.f = (hofq)hftp0;
        this.i = arrayBlockingQueue0;
        this.l = bcpt0;
        this.n = new bcsi(bcqx.a(AppContextProvider.a()));
    }

    @Override  // bcsg
    public final hofs a() {
        long v3;
        int v6;
        hofs hofs2;
        baun baun0 = bcrv.a;
        baun0.j("Do verification.", new Object[0]);
        synchronized(this.e) {
            hofs hofs0 = (hofs)this.f.b_message;
            hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
            hogd hogd0 = hobj0.g == null ? hogd.a : hobj0.g;
            long v1 = (hogd0.c == null ? hfwn.a : hogd0.c).b;
            hofs hofs1 = (hofs)this.f.b_message;
            hoer hoer1 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
            hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
            hogd hogd1 = hobj1.g == null ? hogd.a : hobj1.g;
            long v2 = v1 - (hogd1.d == null ? hfwn.a : hogd1.d).b;
            v3 = Math.min(hrfs.d(), v2);
        }
        try {
            hofs2 = (hofs)this.i.poll(v3, TimeUnit.SECONDS);
            baun0.j("Found verification %s.", new Object[]{hofs2});
        }
        catch(InterruptedException interruptedException0) {
            this.m();
            this.n(gmfx.aE, "Blocking queue polling failed.");
            throw new bcrc("Blocking queue polling failed.", gmfx.aE, false, interruptedException0);
        }
        this.m();
        synchronized(this.e) {
            gmfx gmfx0 = this.g;
            if(gmfx0 != gmfx.a) {
                baun0.j("Verification failed with error: %d.", new Object[]{gmfx0.a()});
                this.n(this.g, "Verification failed");
                int v5 = this.g.ordinal();
                if(v5 == 0) {
                    v6 = 2;
                }
                else {
                    switch(v5) {
                        case 0x3F: {
                            v6 = 4;
                            break;
                        }
                        case 0x40: {
                            v6 = 5;
                            break;
                        }
                        case 65: {
                            v6 = 6;
                            break;
                        }
                        case 66: {
                            v6 = 7;
                            break;
                        }
                        case 67: {
                            v6 = 8;
                            break;
                        }
                        case 68: {
                            v6 = 9;
                            break;
                        }
                        case 69: {
                            v6 = 10;
                            break;
                        }
                        case 70: {
                            v6 = 11;
                            break;
                        }
                        case 71: {
                            v6 = 12;
                            break;
                        }
                        case 72: {
                            v6 = 13;
                            break;
                        }
                        case 73: {
                            v6 = 14;
                            break;
                        }
                        case 74: {
                            v6 = 15;
                            break;
                        }
                        case 75: {
                            v6 = 16;
                            break;
                        }
                        case 76: {
                            v6 = 17;
                            break;
                        }
                        default: {
                            v6 = 3;
                        }
                    }
                }
            }
            else if(hofs2 == null) {
                baun0.j("Verification timed out for %d secs.", new Object[]{v3});
                this.g(gmfz.B);
                v6 = 4;
            }
            else {
                bcrg.e();
                if(bcrg.d(hofs2)) {
                    baun0.j("Verification succeeded.", new Object[0]);
                    this.g(gmfz.D);
                }
                else {
                    baun0.j("Verification failed on server.", new Object[0]);
                    this.g(gmfz.A);
                }
                v6 = 2;
            }
            if(v6 != 2) {
                hofq hofq0 = this.f;
                hofs hofs3 = (hofs)hofq0.b_message;
                hoer hoer2 = hofs3.c == 4 ? ((hoer)hofs3.d) : hoer.a;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hoer2).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hoer2));
                hofs hofs4 = (hofs)this.f.b_message;
                hoer hoer3 = hofs4.c == 4 ? ((hoer)hofs4.d) : hoer.a;
                hobj hobj2 = hoer3.c == null ? hobj.a : hoer3.c;
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hobj2).jf(5, null);
                hftp1.X(((ProtoLiteMessage)hobj2));
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hobr.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hobr hobr0 = (hobr)hftp2.b_message;
                hobr0.c = hobq.a(6);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hobj hobj3 = (hobj)hftp1.b_message;
                hobr hobr1 = (hobr)hftp2.N_build();
                hobr1.getClass();
                hobj3.d = hobr1;
                hobj3.c = 8;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hoer hoer4 = (hoer)hftp0.b_message;
                hobj hobj4 = (hobj)hftp1.N_build();
                hobj4.getClass();
                hoer4.c = hobj4;
                hoer4.b |= 1;
                if(!hofq0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hofq0).ensureMutable();
                }
                hofs hofs5 = (hofs)hofq0.b_message;
                hoer hoer5 = (hoer)hftp0.N_build();
                hoer5.getClass();
                hofs5.d = hoer5;
                hofs5.c = 4;
                hofs hofs6 = this.b();
                hobo hobo0 = bcrv.k("", v6);
                return this.b.j(this.c, hofs6, hobo0);
            }
        }
        if(hrel.c() && hofs2 != null) {
            bcrg.e();
            if(bcrg.d(hofs2)) {
                this.n.f(this.c, 5, System.currentTimeMillis() - this.m);
            }
        }
        return hofs2;
    }

    @Override  // bcsg
    public final hofs b() {
        synchronized(this.e) {
        }
        return (hofs)((ProtoLiteBuilder)this.f).N_build();
    }

    @Override  // bcsg
    public final String c() {
        hobk hobk0;
        synchronized(this.e) {
            hofs hofs0 = (hofs)this.f.b_message;
            hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
            hobk0 = hobj0.e == null ? hobk.a : hobj0.e;
        }
        return hobk0.b;
    }

    @Override  // bcsg
    public final void d() {
        hofs hofs0 = this.b();
        hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        hobr hobr0 = hobj0.c == 8 ? ((hobr)hobj0.d) : hobr.a;
        if(hrfs.g() && this.d != null && hobr0.b.size() > 0 && hobq.b(hobr0.c) == 3) {
            if(hrel.c()) {
                this.m = System.currentTimeMillis();
                this.n.e(this.c, 5);
            }
            this.f(((hocd)hobr0.b.get(0)));
            return;
        }
        bcrv.a.d("Preconditions weren\'t met.", new Object[0]);
        synchronized(this.e) {
            this.g = gmfx.ar;
        }
        this.h();
    }

    public final void e(String s) {
        try {
            bbln bbln0 = new bbln(9, new bcrs(this, s));
            this.j.execute(bbln0);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            bcrv.a.e("Couldn\'t execute proceed", rejectedExecutionException0, new Object[0]);
            synchronized(this.e) {
                this.g = gmfx.ax;
            }
        }
    }

    // Detected as a lambda impl.
    final void f(hocd hocd0) {
        Cursor cursor1;
        bcrd bcrd1;
        ArrayList arrayList2;
        Cursor cursor0;
        ArrayList arrayList1;
        synchronized(this.e) {
            if(this.g != gmfx.a) {
                return;
            }
            if(this.l() != 3) {
                this.g = gmfx.au;
                return;
            }
            if(hrfs.a.e().u() && hocd0 != null) {
                bcrd bcrd0 = this.c;
                ArrayList arrayList0 = new ArrayList();
                if(hrdy.k()) {
                    try {
                        List list0 = SubscriptionManager.from(AppContextProvider.a()).getActiveSubscriptionInfoList();
                        long v1 = System.currentTimeMillis();
                        if(list0 != null && !list0.isEmpty()) {
                            arrayList1 = new ArrayList();
                            if(hrdy.k()) {
                                long v2 = v1 - TimeUnit.HOURS.toMillis(hrdy.a.h().f());
                                try {
                                    cursor0 = AppContextProvider.a().getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"type", "number", "date", "subscription_id"}, "date > ?", new String[]{String.valueOf(v2)}, "date DESC");
                                }
                                catch(SQLiteException | IllegalArgumentException exception0) {
                                    bcqx.a(AppContextProvider.a()).e(bcrd0, gmfz.ax, exception0);
                                    cursor0 = null;
                                }
                                if(cursor0 == null) {
                                    goto label_80;
                                }
                                else {
                                    arrayList2 = new ArrayList();
                                    bcrd1 = bcrd0;
                                    goto label_34;
                                }
                            }
                            else {
                                bcrd1 = bcrd0;
                            }
                            goto label_82;
                        }
                        else {
                            goto label_84;
                        }
                        goto label_90;
                    }
                    catch(SecurityException securityException0) {
                        bcrd1 = bcrd0;
                        goto label_88;
                    }
                    try {
                    label_34:
                        int v3 = (int)hrdy.b();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = arrayList2;
                        int v4 = (int)hrdy.d();
                        ArrayList arrayList5 = new ArrayList();
                        int v5 = (int)hrdy.c();
                        while(cursor0.moveToNext() && (arrayList4.size() < v3 || arrayList3.size() < v4 || arrayList5.size() < v5) && cursor0.getLong(cursor0.getColumnIndex("date")) >= v2) {
                            String s = cursor0.getString(cursor0.getColumnIndex("number"));
                            gftb.check(s);
                            int v6 = cursor0.getColumnIndex("type");
                            String s1 = cursor0.getString(cursor0.getColumnIndex("subscription_id"));
                            gftb.check(s1);
                            String s2 = s;
                            switch(cursor0.getInt(v6)) {
                                case 2: {
                                    cursor1 = cursor0;
                                    arrayList3.add(new Pair(s1, s2));
                                    break;
                                }
                                case 3: {
                                    cursor1 = cursor0;
                                    arrayList4.add(new Pair(s1, s2));
                                    arrayList4 = arrayList4;
                                    break;
                                }
                                case 1: 
                                case 5: {
                                    cursor1 = cursor0;
                                    arrayList4.add(new Pair(s1, s2));
                                    arrayList4 = arrayList4;
                                    break;
                                }
                                default: {
                                    cursor1 = cursor0;
                                    bcpt.a.d("do nothing : call type unknown", new Object[0]);
                                }
                            }
                            cursor0 = cursor1;
                            v4 = v4;
                            arrayList5 = arrayList5;
                        }
                        cursor0.close();
                        ArrayList arrayList6 = new ArrayList();
                        for(Object object1: list0) {
                            SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)object1;
                            String s3 = String.valueOf(subscriptionInfo0.getSubscriptionId());
                            for(Object object2: arrayList4) {
                                Pair pair0 = (Pair)object2;
                                if(((String)pair0.first).equals(s3) || ((String)pair0.first).contains(subscriptionInfo0.getIccId())) {
                                    arrayList6.add(((String)pair0.second));
                                }
                            }
                        }
                        arrayList1.addAll(arrayList6);
                        goto label_82;
                    label_80:
                        bcrd1 = bcrd0;
                        bcpt.a.d("return empty list", new Object[0]);
                    label_82:
                        arrayList0.addAll(arrayList1);
                        goto label_90;
                    label_84:
                        bcrd1 = bcrd0;
                        bcpt.a.d("Active subscription list is empty", new Object[0]);
                        goto label_90;
                    }
                    catch(SecurityException securityException0) {
                    }
                label_88:
                    bcpt.a.g("No READ_PHONE_STATE permission", securityException0, new Object[0]);
                    bcqx.a(AppContextProvider.a()).e(bcrd1, gmfz.K, securityException0);
                }
            label_90:
                PhoneNumberRange phoneNumberRange0 = new PhoneNumberRange((hocd0.b.charAt(0) == 43 ? hocd0.b.substring(1) : hocd0.b), hocd0.c, hocd0.e, hocd0.d);
                if(!arrayList0.isEmpty()) {
                    for(Object object3: arrayList0) {
                        if(phoneNumberRange0.matches(((String)object3))) {
                            this.g = gmfx.at;
                            this.n(gmfx.at, "previous incoming call exists within the given phone number range and time period");
                            return;
                        }
                    }
                }
            }
            bcrr bcrr0 = this.d;
            PhoneNumberRange phoneNumberRange1 = new PhoneNumberRange((hocd0.b.charAt(0) == 43 ? hocd0.b.substring(1) : hocd0.b), hocd0.c, hocd0.e, hocd0.d);
            synchronized(bcrr0.e) {
                AtomicBoolean atomicBoolean0 = bcrr0.f;
                if(!atomicBoolean0.get()) {
                    bcrq bcrq0 = bcrr0.h;
                    if(bcrq0 != null) {
                        bcrr.a.m("Received a new request, ignored previous result (%s) of number verification with phone range: %s.", new Object[]{bcrq0, phoneNumberRange1});
                    }
                }
                try {
                    bcrr0.h = null;
                    bcrr0.i = new CountDownLatch(1);
                    long v8 = hrfs.c();
                    bcrr0.c.requestNumberVerification(phoneNumberRange1, v8, bcrr0.d, bcrr0.g);
                    Object[] arr_object = {hrfs.c(), phoneNumberRange1};
                    bcrr.a.d("Request done, with timeout: %d ms, phonerange: %s.", arr_object);
                    atomicBoolean0.set(true);
                    bcrr0.i.await(hrfs.a.e().g(), TimeUnit.MILLISECONDS);
                    long v9 = bcrr0.i.getCount();
                    goto label_140;
                }
                catch(InterruptedException interruptedException0) {
                    bcrr.a.g("Request failed, latch was interrupted.", interruptedException0, new Object[0]);
                }
                catch(SecurityException securityException1) {
                    baun baun0 = bcrr.a;
                    baun0.g("Request failed, gmscore is not set in device config.", securityException1, new Object[0]);
                    bcrr0.f.set(false);
                    bcrq bcrq1 = new bcrq(gmfx.as);
                    bcru bcru0 = bcrr0.j;
                    if(bcru0 == null) {
                        baun0.h("No listener to notify of the failure, storing error.", new Object[0]);
                        bcrr0.h = bcrq1;
                    }
                    else {
                        bcru0.b(bcrq1.b, bcrq1.d);
                    }
                }
            }
            goto label_147;
        label_140:
            if(v9 > 0L) {
                bcrv.a.d("Interception request succeeded, proceeding to trigger phone call.", new Object[0]);
                this.e("");
                return;
            }
        label_147:
            bcrv.a.d("Interception request failed, listening for failure callback.", new Object[0]);
            this.d.c(this.h);
        }
    }

    public final void g(gmfz gmfz0) {
        hofs hofs0 = this.b();
        this.n.a(this.c, hofs0, gmfz0);
    }

    public final void h() {
        this.i(hofs.a);
    }

    public final void i(hofs hofs0) {
        try {
            this.i.put(hofs0);
        }
        catch(InterruptedException interruptedException0) {
            bcrv.a.g("Failed to put into blocking queue.", interruptedException0, new Object[0]);
            synchronized(this.e) {
                this.g = gmfx.aE;
            }
        }
    }

    final void j(hocd hocd0, long v) {
        try {
            bbln bbln0 = new bbln(9, () -> {
                Cursor cursor1;
                bcrd bcrd1;
                ArrayList arrayList2;
                Cursor cursor0;
                ArrayList arrayList1;
                synchronized(this.e) {
                    if(this.g != gmfx.a) {
                        return;
                    }
                    if(this.l() != 3) {
                        this.g = gmfx.au;
                        return;
                    }
                    if(hrfs.a.e().u() && hocd0 != null) {
                        bcrd bcrd0 = this.c;
                        ArrayList arrayList0 = new ArrayList();
                        if(hrdy.k()) {
                            try {
                                List list0 = SubscriptionManager.from(AppContextProvider.a()).getActiveSubscriptionInfoList();
                                long v1 = System.currentTimeMillis();
                                if(list0 != null && !list0.isEmpty()) {
                                    arrayList1 = new ArrayList();
                                    if(hrdy.k()) {
                                        long v2 = v1 - TimeUnit.HOURS.toMillis(hrdy.a.h().f());
                                        try {
                                            cursor0 = AppContextProvider.a().getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"type", "number", "date", "subscription_id"}, "date > ?", new String[]{String.valueOf(v2)}, "date DESC");
                                        }
                                        catch(SQLiteException | IllegalArgumentException exception0) {
                                            bcqx.a(AppContextProvider.a()).e(bcrd0, gmfz.ax, exception0);
                                            cursor0 = null;
                                        }
                                        if(cursor0 == null) {
                                            goto label_80;
                                        }
                                        else {
                                            arrayList2 = new ArrayList();
                                            bcrd1 = bcrd0;
                                            goto label_34;
                                        }
                                    }
                                    else {
                                        bcrd1 = bcrd0;
                                    }
                                    goto label_82;
                                }
                                else {
                                    goto label_84;
                                }
                                goto label_90;
                            }
                            catch(SecurityException securityException0) {
                                bcrd1 = bcrd0;
                                goto label_88;
                            }
                            try {
                            label_34:
                                int v3 = (int)hrdy.b();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = arrayList2;
                                int v4 = (int)hrdy.d();
                                ArrayList arrayList5 = new ArrayList();
                                int v5 = (int)hrdy.c();
                                while(cursor0.moveToNext() && (arrayList4.size() < v3 || arrayList3.size() < v4 || arrayList5.size() < v5) && cursor0.getLong(cursor0.getColumnIndex("date")) >= v2) {
                                    String s = cursor0.getString(cursor0.getColumnIndex("number"));
                                    gftb.check(s);
                                    int v6 = cursor0.getColumnIndex("type");
                                    String s1 = cursor0.getString(cursor0.getColumnIndex("subscription_id"));
                                    gftb.check(s1);
                                    String s2 = s;
                                    switch(cursor0.getInt(v6)) {
                                        case 2: {
                                            cursor1 = cursor0;
                                            arrayList3.add(new Pair(s1, s2));
                                            break;
                                        }
                                        case 3: {
                                            cursor1 = cursor0;
                                            arrayList4.add(new Pair(s1, s2));
                                            arrayList4 = arrayList4;
                                            break;
                                        }
                                        case 1: 
                                        case 5: {
                                            cursor1 = cursor0;
                                            arrayList4.add(new Pair(s1, s2));
                                            arrayList4 = arrayList4;
                                            break;
                                        }
                                        default: {
                                            cursor1 = cursor0;
                                            bcpt.a.d("do nothing : call type unknown", new Object[0]);
                                        }
                                    }
                                    cursor0 = cursor1;
                                    v4 = v4;
                                    arrayList5 = arrayList5;
                                }
                                cursor0.close();
                                ArrayList arrayList6 = new ArrayList();
                                for(Object object1: list0) {
                                    SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)object1;
                                    String s3 = String.valueOf(subscriptionInfo0.getSubscriptionId());
                                    for(Object object2: arrayList4) {
                                        Pair pair0 = (Pair)object2;
                                        if(((String)pair0.first).equals(s3) || ((String)pair0.first).contains(subscriptionInfo0.getIccId())) {
                                            arrayList6.add(((String)pair0.second));
                                        }
                                    }
                                }
                                arrayList1.addAll(arrayList6);
                                goto label_82;
                            label_80:
                                bcrd1 = bcrd0;
                                bcpt.a.d("return empty list", new Object[0]);
                            label_82:
                                arrayList0.addAll(arrayList1);
                                goto label_90;
                            label_84:
                                bcrd1 = bcrd0;
                                bcpt.a.d("Active subscription list is empty", new Object[0]);
                                goto label_90;
                            }
                            catch(SecurityException securityException0) {
                            }
                        label_88:
                            bcpt.a.g("No READ_PHONE_STATE permission", securityException0, new Object[0]);
                            bcqx.a(AppContextProvider.a()).e(bcrd1, gmfz.K, securityException0);
                        }
                    label_90:
                        PhoneNumberRange phoneNumberRange0 = new PhoneNumberRange((hocd0.b.charAt(0) == 43 ? hocd0.b.substring(1) : hocd0.b), hocd0.c, hocd0.e, hocd0.d);
                        if(!arrayList0.isEmpty()) {
                            for(Object object3: arrayList0) {
                                if(phoneNumberRange0.matches(((String)object3))) {
                                    this.g = gmfx.at;
                                    this.n(gmfx.at, "previous incoming call exists within the given phone number range and time period");
                                    return;
                                }
                            }
                        }
                    }
                    bcrr bcrr0 = this.d;
                    PhoneNumberRange phoneNumberRange1 = new PhoneNumberRange((hocd0.b.charAt(0) == 43 ? hocd0.b.substring(1) : hocd0.b), hocd0.c, hocd0.e, hocd0.d);
                    synchronized(bcrr0.e) {
                        AtomicBoolean atomicBoolean0 = bcrr0.f;
                        if(!atomicBoolean0.get()) {
                            bcrq bcrq0 = bcrr0.h;
                            if(bcrq0 != null) {
                                bcrr.a.m("Received a new request, ignored previous result (%s) of number verification with phone range: %s.", new Object[]{bcrq0, phoneNumberRange1});
                            }
                        }
                        try {
                            bcrr0.h = null;
                            bcrr0.i = new CountDownLatch(1);
                            long v8 = hrfs.c();
                            bcrr0.c.requestNumberVerification(phoneNumberRange1, v8, bcrr0.d, bcrr0.g);
                            Object[] arr_object = {hrfs.c(), phoneNumberRange1};
                            bcrr.a.d("Request done, with timeout: %d ms, phonerange: %s.", arr_object);
                            atomicBoolean0.set(true);
                            bcrr0.i.await(hrfs.a.e().g(), TimeUnit.MILLISECONDS);
                            long v9 = bcrr0.i.getCount();
                            goto label_140;
                        }
                        catch(InterruptedException interruptedException0) {
                            bcrr.a.g("Request failed, latch was interrupted.", interruptedException0, new Object[0]);
                        }
                        catch(SecurityException securityException1) {
                            baun baun0 = bcrr.a;
                            baun0.g("Request failed, gmscore is not set in device config.", securityException1, new Object[0]);
                            bcrr0.f.set(false);
                            bcrq bcrq1 = new bcrq(gmfx.as);
                            bcru bcru0 = bcrr0.j;
                            if(bcru0 == null) {
                                baun0.h("No listener to notify of the failure, storing error.", new Object[0]);
                                bcrr0.h = bcrq1;
                            }
                            else {
                                bcru0.b(bcrq1.b, bcrq1.d);
                            }
                        }
                    }
                    goto label_147;
                label_140:
                    if(v9 > 0L) {
                        bcrv.a.d("Interception request succeeded, proceeding to trigger phone call.", new Object[0]);
                        this.e("");
                        return;
                    }
                label_147:
                    bcrv.a.d("Interception request failed, listening for failure callback.", new Object[0]);
                    this.d.c(this.h);
                }
            });
            ((bbll)this.k).g(bbln0, v, TimeUnit.MILLISECONDS);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            bcrv.a.e("Couldn\'t schedule phone call interception", rejectedExecutionException0, new Object[0]);
            synchronized(this.e) {
                this.g = gmfx.ay;
            }
        }
    }

    public static hobo k(String s, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hobs.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((hobs)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hobs)hftp1.b_message).c = v - 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hobo hobo0 = (hobo)hftp0.b_message;
        hobs hobs0 = (hobs)hftp1.N_build();
        hobs0.getClass();
        hobo0.c = hobs0;
        hobo0.b = 7;
        return (hobo)hftp0.N_build();
    }

    final int l() {
        int v1;
        synchronized(this.e) {
            hofs hofs0 = (hofs)this.f.b_message;
            hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
            hobr hobr0 = hobj0.c == 8 ? ((hobr)hobj0.d) : hobr.a;
            v1 = hobq.b(hobr0.c) == 0 ? 1 : hobq.b(hobr0.c);
        }
        return v1;
    }

    private final void m() {
        bcrr bcrr0 = this.d;
        if(bcrr0 != null) {
            bcrr0.b(this.h);
        }
        this.j.shutdown();
        this.k.shutdown();
    }

    private final void n(gmfx gmfx0, String s) {
        if(hrel.c()) {
            this.n.d(this.c, 5, gmfx0, s);
        }
        hofs hofs0 = this.b();
        this.n.c(this.c, hofs0, gmfz.C, gmfx0, s);
    }
}

