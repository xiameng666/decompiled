import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdd.FileGroupRequest;

public final class cpvn extends azts {
    public cpvn(Context context0) {
        super(context0, cpvh.a, azsx.s, aztr_settings.a);
    }

    public final void e(String s) {
        FileGroupRequest fileGroupRequest0 = new FileGroupRequest(s, "com.google.android.gms", null);
        azzc azzc0 = new azzc();
        azzc0.b(new cpvi(this, fileGroupRequest0));
        azzc0.c = new Feature[]{bwkn.b};
        azzc0.d = 312;
        this.iG(azzc0.a());
    }

    public final evql f(String s) {
        FileGroupRequest fileGroupRequest0 = new FileGroupRequest(s, "com.google.android.gms", null);
        azzc azzc0 = new azzc();
        azzc0.d = 310;
        azzc0.a = new cpvk(this, fileGroupRequest0);
        return this.iG(azzc0.a());
    }
}

