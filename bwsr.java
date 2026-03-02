import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class bwsr extends bwse {
    public boolean a;
    private final ActionImpl b;
    private final String c;
    private final String d;
    private bxgu e;
    private bwsa f;
    private Thing g;

    public bwsr(ActionImpl actionImpl0, String s, String s1) {
        super(0);
        this.b = actionImpl0;
        this.c = s;
        this.d = s1;
    }

    @Override  // bwse
    protected final void c(bwmx bwmx0, bwud bwud0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0) {
        String s = bwud0.e;
        String s1 = this.b.c;
        bwne.r("Processing reportUserActions synchronously for package %s. on url %s", s, s1);
        String s2 = this.f.b;
        String s3 = this.f.c();
        if(bwst.h(bwmx0.O(bwud0, s3, s2), this.f)) {
            bwst.g(bwud0, this.f, bwmx0);
        }
        bwst.i(bwmx0.b, bwmx0.r, 3);
        bwst.e(s2, s3, bwth.b(this.g), false, bwmx0, nativeIndex0, bwuc0, bwuj0);
        bwne.r("Synchronous reportUserAction completed for package %s and url %s", s, s1);
        nativeIndex0.v();
    }

    @Override  // bwse
    public final void d(bwqt bwqt0, bwud bwud0, bwmx bwmx0) {
        if(this.a) {
            bwqd bwqd0 = new bwqd(bwmx0, false, false);
            bwmx0.c.h(bwqd0);
            bwmx0.r.p(16004);
            this.a = false;
        }
    }

    @Override  // bwse
    public final void e(bwmx bwmx0) {
    }

    @Override  // bwsi
    public final void f(Context context0, SQLiteDatabase sQLiteDatabase0, bwqt bwqt0, bwud bwud0, bwtc bwtc0) {
        gftb.z(this.e, "executeOnDb called without successful validateInput");
        long v = System.currentTimeMillis();
        "com.google.android.gms".equals(this.d);
        String s = this.c;
        ActionImpl actionImpl0 = this.b;
        UsageInfo[] arr_usageInfo = {bwti.a(actionImpl0, v, s)};
        List list0 = bxgs.a(context0, v);
        if(!this.e.e(arr_usageInfo, s, v, list0, new bwsq(this))) {
            throw new IOException("Failed to log UsageInfo");
        }
        bxft.b(context0, s, arr_usageInfo, "FirebaseUserActions");
        bwsx.a(context0).d(s, actionImpl0);
    }

    @Override  // bwsi
    public final void h(bwmx bwmx0, bwud bwud0, bwrc bwrc0) {
        gftb.z(this.f, "execute called without validateInput");
        String s = this.f.b;
        String s1 = this.f.c();
        bwqw.a(bwmx0, bwud0, this.f);
        hlne hlne0 = bwth.b(this.g);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwlq.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwlu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((bwlu)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((bwlu)hftv1).d = s1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwlu bwlu0 = (bwlu)hftp1.b_message;
        hlne0.getClass();
        bwlu0.e = hlne0;
        bwlu0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwlq bwlq0 = (bwlq)hftp0.b_message;
        bwlu bwlu1 = (bwlu)hftp1.N_build();
        bwlu1.getClass();
        bwlq0.c = bwlu1;
        bwlq0.b = 6;
        bwrc0.a(((bwlq)hftp0.N_build()));
    }

    @Override  // bwsi
    public final void i(bwud bwud0, bwmx bwmx0, bwtc bwtc0) {
        Thing thing0;
        ActionImpl actionImpl0 = this.b;
        String s = actionImpl0.c;
        if(s == null) {
            throw new bwrw("Action.objectUrl cannot be null", this.b, glrs.t);
        }
        bxgu bxgu0 = bwmx0.j;
        if(bxgu0 == null) {
            throw new bwrw("Internal error.", actionImpl0, glrs.e);
        }
        this.e = bxgu0;
        if(hubu.a.b().o()) {
            try {
                ActionImpl.MetadataImpl actionImpl$MetadataImpl0 = actionImpl0.e;
                if(actionImpl$MetadataImpl0 != null && actionImpl$MetadataImpl0.f) {
                    throw new gopo("Cannot convert context-only Action to Indexable");
                }
                gopw gopw0 = new gopw("Action");
                gopw0.k(actionImpl0.b);
                gopw0.j(s);
                gopw0.h("additionalType", new String[]{actionImpl0.a});
                String s1 = actionImpl0.d;
                if(s1 != null) {
                    gopw0.h("sameAs", new String[]{s1});
                }
                Object object0 = null;
                String s2 = actionImpl0.f;
                if(s2 != null) {
                    switch(s2) {
                        case "http://schema.org/ActiveActionStatus": {
                            object0 = "ActiveActionStatus";
                            break;
                        }
                        case "http://schema.org/CompletedActionStatus": {
                            object0 = "CompletedActionStatus";
                            break;
                        }
                        case "http://schema.org/FailedActionStatus": {
                            object0 = "FailedActionStatus";
                        }
                    }
                }
                if(object0 != null) {
                    if(!"ActiveActionStatus".equals(object0) && !"CompletedActionStatus".equals(object0) && !"FailedActionStatus".equals(object0)) {
                        throw new IllegalArgumentException("Invalid action status " + ((String)object0));
                    }
                    gopw0.h("actionStatus", new String[]{object0});
                }
                Bundle bundle0 = actionImpl0.g;
                for(Object object1: bundle0.keySet()) {
                    String s3 = (String)object1;
                    Object object2 = bundle0.get(s3);
                    if((object2 instanceof long[])) {
                        gopw0.f(s3, ((long[])object2));
                    }
                    else if((object2 instanceof boolean[])) {
                        gopw0.i(s3, ((boolean[])object2));
                    }
                    else if((object2 instanceof String[])) {
                        gopw0.h(s3, ((String[])object2));
                    }
                    else if((object2 instanceof gops[])) {
                        Bundle bundle1 = gopw0.a;
                        batl.s(s3);
                        batl.s(((gops[])object2));
                        Thing[] arr_thing = new Thing[((gops[])object2).length];
                        for(int v = 0; v < ((gops[])object2).length; ++v) {
                            gops gops0 = ((gops[])object2)[v];
                            if(gops0 != null && !(gops0 instanceof Thing)) {
                                throw new gopo("Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable.");
                            }
                            arr_thing[v] = (Thing)gops0;
                        }
                        gopw.b(bundle1, s3, arr_thing);
                    }
                    else {
                        if(!(object2 instanceof double[])) {
                            continue;
                        }
                        double[] arr_f = (double[])object2;
                        Bundle bundle2 = gopw0.a;
                        batl.s(s3);
                        batl.s(arr_f);
                        int v1 = arr_f.length;
                        if(v1 > 0) {
                            if(v1 >= 100) {
                                goqs.b("Input Array of elements is too big, cutting off.");
                                arr_f = Arrays.copyOf(arr_f, 100);
                            }
                            bundle2.putDoubleArray(s3, arr_f);
                        }
                        else {
                            goqs.b("Double array is empty and is ignored by put method.");
                        }
                    }
                }
                if(actionImpl$MetadataImpl0 != null) {
                    gopr gopr0 = new gopr();
                    gopw0.f("eventStatus", new long[]{((long)actionImpl$MetadataImpl0.a)});
                    String s4 = actionImpl$MetadataImpl0.d;
                    if(!TextUtils.isEmpty(s4)) {
                        batl.s(s4);
                        batl.r(s4, "accountEmail must not be an empty string");
                        gopr0.a = s4;
                    }
                    String s5 = actionImpl$MetadataImpl0.c;
                    if(s5 != null) {
                        gopw0.h("completionToken", new String[]{s5});
                    }
                    byte[] arr_b = actionImpl$MetadataImpl0.e;
                    if(arr_b != null) {
                        gopw0.a.putByteArray("ssbContext", arr_b);
                    }
                    if(actionImpl$MetadataImpl0.b) {
                        gopw.c(gopr0.b, "scope", new long[]{3L});
                    }
                    gopw0.e(gopr0);
                }
                thing0 = (Thing)gopw0.a();
                this.g = thing0;
            }
            catch(gopo gopo0) {
                throw new bwrw(glrq.d, "Internal error happened in ActionIndexableConverter", this.b, glrs.e, gopo0);
            }
            bwsa bwsa0 = bwsb.a(thing0, bwud0.e, bwtc0);
            this.f = bwsa0;
            if(bwsa0 == null) {
                bwne.t("Internal error. CorpusConfig:%s", "null");
                throw new gopm("Internal error.");
            }
        }
    }
}

