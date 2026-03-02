import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdd.FileGroupRequest;

public final class cpvk implements azys {
    public final cpvn a;
    public final FileGroupRequest b;

    public cpvk(cpvn cpvn0, FileGroupRequest fileGroupRequest0) {
        this.a = cpvn0;
        this.b = fileGroupRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cpvp cpvp0 = (cpvp)object0;
        cpuk cpuk0 = new cpuk(this.a, ((evqp)object1));
        cpur cpur0 = (cpur)cpvp0.H();
        ApiMetadata apiMetadata0 = cclr.a(cpvp0.r);
        cpur0.f(cpuk0, this.b, apiMetadata0);
    }
}

