import android.os.Bundle;

public final class gayz {
    public heaa a;
    private hadb b;
    private gkxf c;

    public final void a(gcme gcme0, gaym gaym0, long v) {
        ibuq.f(gcme0, "modulePipeline");
        ibuq.f(gaym0, "eventLogger");
        if(this.f()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
            gkxf gkxf0 = this.c == null ? gkxf.d : this.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gkxt)hftv0).m = gkxf0.g;
            ((gkxt)hftv0).b |= 0x40;
            gkwx gkwx0 = gkwx.s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gkxt)hftp0.b_message).g = gkwx0.G;
            ((gkxt)hftp0.b_message).b |= 4;
            hadb hadb0 = gcme0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            hadb0.getClass();
            ((gkxt)hftv1).d = hadb0;
            ((gkxt)hftv1).c = 22;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkxt gkxt0 = (gkxt)hftp0.b_message;
            gkxt0.b |= 0x20;
            gkxt0.l = v;
            gaym0.f(hftp0);
        }
    }

    public final void b(Bundle bundle0) {
        if(this.g()) {
            this.b = (hadb)gawi.e(bundle0, "modularPipelineLogs", ((MessageLite)hadb.a));
        }
    }

    public final void c(gcme gcme0) {
        ibuq.f(gcme0, "modularPipeline");
        if(this.g()) {
            hadb hadb0 = this.b;
            if(hadb0 != null) {
                int v = hadb0.b.size();
                gged_interceptors gged0 = gcme0.a;
                int v1 = ((ggna)gged0).c;
                batl.d(v == v1 + 1, "Expected %d modules, but got %d modules", new Object[]{((int)(v1 + 1)), hadb0.b.size()});
                hadd hadd0 = (hadd)hadb0.b.get(0);
                batl.d((hadf.b(hadd0.c) == null ? hadf.a : hadf.b(hadd0.c)) == hadf.b, "Expected type PIPELINE_MODULE_TYPE_BASE, but got type %s", new Object[]{(hadf.b(hadd0.c) == null ? hadf.a : hadf.b(hadd0.c)).name()});
                batl.d(hadd0.d.size() == 1, "Expected 1 processor, but got %d processors", new Object[]{hadd0.d.size()});
                hadh hadh0 = (hadh)hadd0.d.get(0);
                gcme0.b.l(hadh0);
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    ++v3;
                    ((gcna)gged0.get(v2)).g(((hadd)hadb0.b.get(v3)));
                }
                this.b = null;
            }
        }
    }

    public final void d(Bundle bundle0, gcme gcme0) {
        ibuq.f(bundle0, "bundle");
        ibuq.f(gcme0, "modularPipeline");
        if(this.g()) {
            hadb hadb0 = gcme0.a();
            ibuq.e(hadb0, "collectLogs(...)");
            gawi.p(bundle0, "modularPipelineLogs", ((MessageLite)hadb0));
        }
    }

    public final void e(gkxf gkxf0) {
        ibuq.f(gkxf0, "result");
        if(this.f() && this.c == null) {
            this.c = gkxf0;
        }
    }

    private final boolean f() {
        return this.a != null;
    }

    private final boolean g() {
        return this.a != null && this.a.b;
    }
}

