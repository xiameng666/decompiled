import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.FileGroupResponse;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class cpyc extends cpxb {
    public final cpul h;
    public static final int i;
    private final cpws j;

    public cpyc(fjtv fjtv0, cpws cpws0, FileGroupRequest fileGroupRequest0, String s, int v, int v1, fkbg fkbg0, cpul cpul0, azug azug0) {
        super("GetFileGroupOperation", fjtv0, fileGroupRequest0, s, v, v1, fkbg0, azug0);
        this.j = cpws0;
        this.h = cpul0;
    }

    @Override  // cpxb
    protected final void c() {
        if(huck.f()) {
            if(this.j != null) {
                String s = cpws.a(this.b.a, this.b.b, this.b.c);
                FileGroupResponse fileGroupResponse0 = (FileGroupResponse)cpws.a.get(s);
                if(fileGroupResponse0 != null) {
                    ApiMetadata apiMetadata0 = cckf.d(bbdp.cM);
                    this.h.a(Status.b, fileGroupResponse0, apiMetadata0);
                    this.b(glsl.b, null);
                    return;
                }
            }
            AtomicReference atomicReference0 = new AtomicReference(null);
            AtomicReference atomicReference1 = new AtomicReference(glsl.a);
            ArrayList arrayList0 = new ArrayList();
            fjcl fjcl0 = fkds.e(this.b.a, this.b.b);
            gmcd gmcd0 = glzd.g(gmbt.h(this.a.k(fjcl0, true)), new cpxx(this, atomicReference0, atomicReference1, arrayList0), gmap.a);
            cpxy cpxy0 = new cpxy(this, atomicReference1, atomicReference0);
            glzd.g(glyi.g(gmcd0, Throwable.class, cpxy0, gmap.a), new cpxz(this, atomicReference1, arrayList0, atomicReference0), gmap.a);
            return;
        }
        this.b(glsl.c, null);
        throw new cjuh(17, "GetFileGroupOp : Api Disabled");
    }

    @Override  // cpxb
    protected final int d() {
        return 3;
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.h.a(status0, null, ApiMetadata.b);
    }
}

