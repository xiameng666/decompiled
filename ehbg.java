import android.content.ContentProviderOperation;

public final class ehbg {
    public final ehbk a;

    public ehbg(ehbk ehbk0) {
        this.a = ehbk0;
    }

    public final long a() {
        return this.a.b().g;
    }

    public final void b() {
        this.f(null);
    }

    public final void c(long v, boolean z, boolean z1) {
        egig.m("FSA2_PeopleSyncState", "@setLastFullSynctime = %d", new Object[]{v});
        egig.m("FSA2_PeopleSyncState", "@setFullySyncedDownLunarDates = %s", new Object[]{Boolean.valueOf(z)});
        egig.m("FSA2_PeopleSyncState", "@setFullySyncedDownCallingCard = %s", new Object[]{Boolean.valueOf(z1)});
        egyn egyn0 = this.a.b();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egyn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)egyn0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        egyn egyn1 = (egyn)hftp0.b_message;
        egyn1.b |= 0x20;
        egyn1.g = v;
        if(z) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egyn egyn2 = (egyn)hftp0.b_message;
            egyn2.b |= 0x80;
            egyn2.h = true;
        }
        if(z1) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egyn egyn3 = (egyn)hftp0.b_message;
            egyn3.b |= 0x200;
            egyn3.j = true;
        }
        this.g(((egyn)hftp0.N_build()));
    }

    public final void d(String s) {
        egyn egyn0 = this.a.b();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egyn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)egyn0));
        if(s == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egyn egyn2 = (egyn)hftp0.b_message;
            egyn2.b &= -2;
            egyn2.c = egyn.a.c;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egyn egyn1 = (egyn)hftp0.b_message;
            egyn1.b |= 1;
            egyn1.c = s;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        egyn egyn3 = (egyn)hftp0.b_message;
        egyn3.b &= -3;
        egyn3.d = egyn.a.d;
        this.g(((egyn)hftp0.N_build()));
    }

    public final void e(String s) {
        egyn egyn0 = this.a.b();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egyn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)egyn0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        egyn egyn1 = (egyn)hftp0.b_message;
        egyn1.b |= 8;
        egyn1.f = s;
        this.g(((egyn)hftp0.N_build()));
    }

    public final void f(String s) {
        egyn egyn0 = this.a.b();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egyn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)egyn0));
        if(s == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egyn egyn2 = (egyn)hftp0.b_message;
            egyn2.b &= -5;
            egyn2.e = egyn.a.e;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egyn egyn1 = (egyn)hftp0.b_message;
            egyn1.b |= 4;
            egyn1.e = s;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        egyn egyn3 = (egyn)hftp0.b_message;
        egyn3.b &= -9;
        egyn3.f = egyn.a.f;
        this.g(((egyn)hftp0.N_build()));
    }

    public final void g(egyn egyn0) {
        if(egyn0 == null) {
            return;
        }
        ContentProviderOperation contentProviderOperation0 = this.a.a(egyn0);
        this.a.c(contentProviderOperation0);
    }

    public final boolean h() {
        try {
            return this.a.b().j;
        }
        catch(ehfh ehfh0) {
            egig.c("FSA2_PeopleSyncState", "Failed to read fully synced down calling card", ehfh0);
            return false;
        }
    }

    public final boolean i() {
        try {
            return this.a.b().h;
        }
        catch(ehfh ehfh0) {
            egig.c("FSA2_PeopleSyncState", "Failed to read fully synced down lunar dates", ehfh0);
            return false;
        }
    }
}

