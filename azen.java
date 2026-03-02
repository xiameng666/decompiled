import android.content.Context;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.clearcut.uploader.QosUploaderChimeraService;
import com.google.android.gms.common.api.Status;

public final class azen extends cjtm {
    private final azcx a;
    private final String b;
    private final cjtn c;

    public azen(azcx azcx0, String s, cjtn cjtn0) {
        super(40, "ForceUploadOperation");
        this.a = azcx0;
        this.b = s;
        this.c = cjtn0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if((!this.c.e() || !hrbd.a.b().a().b.contains(this.b)) && !ClearcutLoggerChimeraService.c(this.b)) {
            throw new cjuh(31001, "Operation disallowed");
        }
        QosUploaderChimeraService qosUploaderChimeraService0 = new QosUploaderChimeraService();
        qosUploaderChimeraService0.e(context0);
        try {
            boolean z = qosUploaderChimeraService0.g("qos_debug_force_upload");
            this.a.a((z ? Status.b : Status.d));
        }
        finally {
            qosUploaderChimeraService0.f();
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

