import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

public final class ccgi implements glzn {
    public final ccgo a;
    public final ccgn b;
    public final AtomicReference c;
    public final AtomicReference d;

    public ccgi(ccgo ccgo0, ccgn ccgn0, AtomicReference atomicReference0, AtomicReference atomicReference1) {
        this.a = ccgo0;
        this.b = ccgn0;
        this.c = atomicReference0;
        this.d = atomicReference1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fnap)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fnap)object0))));
        ccgd ccgd0 = new ccgd();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ccgo ccgo0 = this.a;
        for(Object object1: DesugarCollections.unmodifiableList(((fnap)((fnao)hftp0).b_message).b)) {
            fnan fnan0 = (fnan)object1;
            if(ccgd0.a(fnan0)) {
                arrayList1.add(fnan0);
            }
            else {
                arrayList0.add(fnan0);
            }
        }
        if(!arrayList1.isEmpty()) {
            if(!((fnao)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fnao)hftp0))).ensureMutable();
            }
            ((fnap)((fnao)hftp0).b_message).b = hfvv.a;
            ((fnao)hftp0).a(arrayList0);
        }
        fnap fnap0 = (fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build();
        gfsz gfsz0 = this.b.a(fnap0);
        this.c.set(gfsz0.b);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fnap)gfsz0.a))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((fnap)gfsz0.a))));
        fnao fnao0 = (fnao)hftp1;
        try {
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            AtomicReference atomicReference0 = new AtomicReference();
            ccge ccge0 = new ccge(ccgo0, atomicReference0);
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: DesugarCollections.unmodifiableList(((fnap)fnao0.b_message).b)) {
                fnan fnan1 = (fnan)object2;
                if(fnan1.e.isEmpty()) {
                    ccge0.accept("Empty app package name");
                }
                else if(!hashSet0.add(fnan1.f)) {
                    ccge0.accept("Duplicate session names");
                }
                else if(fnan1.f.isEmpty()) {
                    ccge0.accept("Empty session name");
                }
                else if(!hashSet4.add(Integer.valueOf(fnan1.g))) {
                    ccge0.accept("Duplicate job IDs");
                }
                else if(fnan1.g == 0) {
                    ccge0.accept("Job ID == 0");
                }
                else if(fnan1.c == 4 && ((fnaf)fnan1.d).c.isEmpty()) {
                    ccge0.accept("Empty population name");
                }
                else if(fnan1.c == 4 && !hashSet1.add(((fnaf)fnan1.d).c)) {
                    ccge0.accept("Duplicate population names");
                }
                else if(fnan1.c == 13 && ((fnah)fnan1.d).c.isEmpty()) {
                    ccge0.accept("Missing personlization plan URI");
                }
                else if(fnan1.c == 13 && !((fnah)fnan1.d).d.isEmpty()) {
                    ccge0.accept("Initial params is set for PersonalizedOptions, but it\'s no longer supported.");
                }
                else if(fnan1.c == 13 && ((fnah)fnan1.d).g.isEmpty() && (fnan1.c == 13 ? ((fnah)fnan1.d) : fnah.a).h.isEmpty()) {
                    ccge0.accept("Missing input directory and input resources.");
                }
                else if(fnan1.c == 13 && !hashSet2.add(new gfsz(((fnah)fnan1.d).c, ((fnah)fnan1.d).g))) {
                    ccge0.accept("Duplicate (personalization plan, input directory)");
                }
                else if(fnan1.c == 13 && ((fnah)fnan1.d).e.isEmpty()) {
                    ccge0.accept("Missing output directory");
                }
                else if(fnan1.c != 13 || hashSet3.add(((fnah)fnan1.d).e)) {
                    fnah fnah0 = fnan1.c == 13 ? ((fnah)fnan1.d) : fnah.a;
                    if(fnak.a((fnah0.f == null ? fnal.a : fnah0.f).c) == 3 && ccgo.b((fnan1.c == 13 ? ((fnah)fnan1.d) : fnah.a)) <= 0L) {
                        ccge0.accept("Invalid value for user defined minimum training interval");
                    }
                    else if((fnan1.b & 1) == 0 || !hfyn.p((fnan1.h == null ? hfwn.a : fnan1.h))) {
                        ccge0.accept("Missing/invalid creation time");
                    }
                    else if((fnan1.b & 2) == 0 || !hfyn.p((fnan1.i == null ? hfwn.a : fnan1.i))) {
                        ccge0.accept("Missing/invalid last scheduled time");
                    }
                    else if((fnan1.b & 4) != 0 && !hfyn.p((fnan1.j == null ? hfwn.a : fnan1.j))) {
                        ccge0.accept("Invalid last run start time");
                    }
                    else if((fnan1.b & 8) != 0 && !hfyn.p((fnan1.k == null ? hfwn.a : fnan1.k))) {
                        ccge0.accept("Invalid last run end time");
                    }
                    else if((fnan1.b & 16) != 0 && hfyn.p((fnan1.l == null ? hfwn.a : fnan1.l))) {
                        arrayList2.add(fnan1);
                    }
                    else {
                        ccge0.accept("Missing/invalid earliest next run time");
                    }
                }
                else {
                    ccge0.accept("Duplicate output directory");
                }
            }
            if(ccgo0.c.O()) {
                if(!fnao0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fnao0).ensureMutable();
                }
                ((fnap)fnao0.b_message).b = hfvv.a;
                fnao0.a(arrayList2);
            }
            IllegalStateException illegalStateException1 = (IllegalStateException)atomicReference0.get();
            if(illegalStateException1 != null) {
                throw illegalStateException1;
            }
        }
        catch(IllegalStateException illegalStateException0) {
            if(!ccgo0.c.O()) {
                throw illegalStateException0;
            }
            this.d.set(illegalStateException0);
            return gmbu.i(((fnap)((ProtoLiteBuilder)fnao0).N_build()));
        }
        return gmbu.i(((fnap)((ProtoLiteBuilder)fnao0).N_build()));
    }
}

