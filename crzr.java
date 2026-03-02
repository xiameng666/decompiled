import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.internal.EventListenerRequest;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

public final class crzr extends cjtm {
    private static final bboh a;
    private final crxi b;
    private final EventListenerRequest c;
    private final crwy d;
    private final Object e;
    private volatile Context f;
    private crxn g;

    static {
        crzr.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crzr(crxi crxi0, EventListenerRequest eventListenerRequest0, azug azug0) {
        super(0x9E, "AddEventListener", azug0);
        this.e = new Object();
        this.b = crxi0;
        if(eventListenerRequest0 != null && eventListenerRequest0.e == null) {
            EventListenerRequest eventListenerRequest1 = new EventListenerRequest();
            eventListenerRequest1.a = eventListenerRequest0.a;
            eventListenerRequest1.b = eventListenerRequest0.b;
            eventListenerRequest1.c = eventListenerRequest0.c;
            eventListenerRequest1.d = eventListenerRequest0.d;
            eventListenerRequest1.e = null;
            eventListenerRequest1.f = eventListenerRequest0.f;
            eventListenerRequest1.e = crxn.b();
            eventListenerRequest0 = eventListenerRequest1;
        }
        if(eventListenerRequest0 != null && eventListenerRequest0.d == null) {
            EventListenerRequest eventListenerRequest2 = new EventListenerRequest();
            eventListenerRequest2.a = eventListenerRequest0.a;
            eventListenerRequest2.b = eventListenerRequest0.b;
            eventListenerRequest2.c = eventListenerRequest0.c;
            eventListenerRequest2.d = null;
            eventListenerRequest2.e = eventListenerRequest0.e;
            eventListenerRequest2.f = eventListenerRequest0.f;
            eventListenerRequest2.d = (int)0;
            eventListenerRequest0 = eventListenerRequest2;
        }
        this.c = eventListenerRequest0;
        this.d = new crwy();
    }

    private final crxn b() {
        synchronized(this.e) {
            if(this.g == null) {
                this.g = new crxn(this.f);
            }
        }
        return this.g;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Status status1;
        Status status0;
        this.f = context0;
        EventListenerRequest eventListenerRequest0 = this.c;
        if(eventListenerRequest0 != null && !TextUtils.isEmpty(eventListenerRequest0.b)) {
            crxn crxn0 = this.b();
            String s = eventListenerRequest0.b;
            String s1 = s == null ? "CLIENT_TestInvalid" : "CLIENT_".concat(s);
            gizg gizg0 = crxn0.D(18, "GTAF_Server", s1);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gizg0));
            if(hvkk.h()) {
                crxn.T(hftp0, eventListenerRequest0.f);
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjad.a).v_newBuilder();
            int v = eventListenerRequest0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gjad)hftv0).b = v;
            String s2 = eventListenerRequest0.b;
            if(s2 == null) {
                s2 = "";
            }
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gjad)hftv1).c = s2;
            boolean z = eventListenerRequest0.c;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gjad)hftp1.b_message).d = z;
            gjad gjad0 = (gjad)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            gjad0.getClass();
            gizg1.s = gjad0;
            gizg1.b |= 0x200;
            Long long0 = eventListenerRequest0.e;
            long v1 = long0 == null ? 0L : ((long)long0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).t = v1;
            crxn0.e(((gizg)hftp0.N_build()), hhct.bf, eventListenerRequest0.d);
            if(eventListenerRequest0.c) {
                crwy crwy0 = this.d;
                if(hvko.E()) {
                    String s3 = eventListenerRequest0.b;
                    if(TextUtils.isEmpty(s3)) {
                        status0 = new Status(27016, "Empty Package Name");
                    }
                    else {
                        int v2 = crug.b(eventListenerRequest0.a);
                        synchronized(crwy.a) {
                            crwy0.b();
                            Map map0 = crwy0.c;
                            Set set1 = (Set)map0.get(crug.a(v2));
                            if(set1 == null) {
                                status0 = crwy0.a();
                            }
                            else if(set1.add(s3)) {
                                map0.put(crug.a(v2), set1);
                                status0 = crwy0.a();
                            }
                            else {
                                ((ggtj)crwy.b.j()).B("%s already registered for event listener before", s3);
                                status0 = new Status(27014, String.format("%s already registered for event listener before", s3));
                            }
                        }
                    }
                }
                else {
                    status0 = new Status(27013, "Event Listener Not Enabled");
                }
                if(!status0.equals(Status.b)) {
                    this.j(status0);
                    return;
                }
            }
            else {
                crwy crwy1 = this.d;
                EventListenerRequest eventListenerRequest1 = this.c;
                if(hvko.E()) {
                    batl.s(eventListenerRequest1);
                    String s4 = eventListenerRequest1.b;
                    batl.s(s4);
                    int v3 = crug.b(eventListenerRequest1.a);
                    synchronized(crwy.a) {
                        crwy1.b();
                        Set set3 = (Set)crwy1.c.get(crug.a(v3));
                        if(set3 != null && !set3.remove(s4)) {
                            ((ggtj)crwy.b.j()).B("%s hasn\'t registered for event listener before", s4);
                            status1 = new Status(27015, String.format("%s hasn\'t registered for event listener before", s4));
                        }
                        else {
                            status1 = crwy1.a();
                        }
                    }
                }
                else {
                    status1 = new Status(27013, "Event Listener Not Enabled");
                }
                if(!status1.equals(Status.b)) {
                    this.j(status1);
                    return;
                }
            }
            try {
                this.b.b(Status.b, ApiMetadata.b);
            }
            catch(RemoteException remoteException0) {
                a.e(crzr.a.i(), "Unable to complete UpdateEventListener callback for success. Error: %s", new gpnd(gpnc.a, remoteException0.getMessage()), remoteException0);
            }
            return;
        }
        this.j(new Status(27000, "Invalid Argument, need a non-empty package name request"));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Level level0 = cslm.h();
        crzr.a.g(level0).x("UpdateEventListenerOperation failed");
        long v = (long)status0.i;
        EventListenerRequest eventListenerRequest0 = this.c;
        crxn crxn0 = this.b();
        hhct hhct0 = hhct.bg;
        String s = eventListenerRequest0 == null ? "CLIENT_TestInvalid" : "CLIENT_" + eventListenerRequest0.b;
        Long long0 = null;
        Integer integer0 = eventListenerRequest0 == null ? null : eventListenerRequest0.d;
        if(eventListenerRequest0 != null) {
            long0 = eventListenerRequest0.e;
        }
        crxn0.n(hhct0, v, s, null, integer0, long0);
        try {
            this.b.b(status0, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            ggtj ggtj0 = (ggtj)((ggtj)crzr.a.i()).s(remoteException0);
            gpnd gpnd0 = new gpnd(gpnc.a, status0);
            ggtj0.R("Unable to complete api callback for failure: %s with status: {%s}", new gpnd(gpnc.a, remoteException0.getMessage()), gpnd0);
        }
    }
}

