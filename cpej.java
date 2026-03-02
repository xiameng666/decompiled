import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

public final class cpej implements ywx {
    @Override  // ywx
    public final Bundle a(Context context0, Bundle bundle0, ywb ywb0) {
        gmcd gmcd0;
        Bundle bundle1 = new Bundle(Bundler.class.getClassLoader());
        cphc cphc0 = cpep.a().g;
        boolean z = true;
        if(cphc0 == null) {
            gmcd0 = gmbu.i(Boolean.valueOf(true));
        }
        else {
            cpdd cpdd0 = cphc0.a.e;
            if(cpdd0 != null) {
                z = cpdd0.c();
            }
            gmcd0 = gmbu.i(Boolean.valueOf(z));
        }
        BundlerType bundlerType0 = BundlerType.a("java.lang.Boolean");
        yvy.b(gmcd0, new ywu(ywb0, cpep.b, bundlerType0));
        return bundle1;
    }
}

