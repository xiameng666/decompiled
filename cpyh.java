import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;

public final class cpyh extends cpxb {
    public final azxs h;
    private final boolean i;

    public cpyh(fjtv fjtv0, FileGroupRequest fileGroupRequest0, String s, int v, int v1, fkbg fkbg0, azxs azxs0, boolean z, azug azug0) {
        super("SetFileGroupActivationOperation", fjtv0, fileGroupRequest0, s, v, v1, fkbg0, azug0);
        this.h = azxs0;
        this.i = z;
    }

    @Override  // cpxb
    protected final void c() {
        if(huck.f() && huck.e()) {
            FileGroupRequest fileGroupRequest0 = this.b;
            String s = fileGroupRequest0.b;
            if(this.c.equals(s)) {
                fjcl fjcl0 = fkds.e(fileGroupRequest0.a, s);
                fjtv fjtv0 = this.a;
                gmbt gmbt0 = gmbt.h(gdtf.k(fjtv0.l(), new fjsn(fjtv0, fjcl0, this.i), fjtv0.n));
                cpyf cpyf0 = new cpyf(this);
                glzd.g(glyi.g(gmbt0, Throwable.class, cpyf0, gmap.a), new cpyg(this), gmap.a);
                return;
            }
            this.b(glsl.e, null);
            throw new cjuh(10, "SetFileGroupActivationOperation : Caller not the owner");
        }
        this.b(glsl.c, null);
        throw new cjuh(17, "SetFileGroupActivationOperation : Api Disabled");
    }

    @Override  // cpxb
    protected final int d() {
        return this.i ? 5 : 6;
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.h.a(status0);
    }
}

