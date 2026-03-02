import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

public final class akyc implements akyd {
    private final ywh a;

    public akyc(ywh ywh0) {
        this.a = ywh0;
    }

    @Override  // akyd
    public final gmcd a(String s, ByteString hfsf0) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("java.lang.String");
        akyb.b.c(bundle0, "endpointId", s, bundlerType0);
        BundlerType bundlerType1 = BundlerType.a("com.google.protobuf.ByteString");
        akyb.b.c(bundle0, "payload", hfsf0, bundlerType1);
        BundlerType bundlerType2 = BundlerType.a("java.lang.Void");
        yvy yvy0 = new yvy(akyb.b, bundlerType2);
        this.a.b().v(3353660607420011320L, 7, bundle0, yvy0, yvy0.c);
        return yvy0.c;
    }

    @Override  // akyd
    public final void b(String s) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("java.lang.String");
        akyb.b.c(bundle0, "endpointId", s, bundlerType0);
        this.a.b().a(3353660607420011320L, 0, bundle0);
    }

    @Override  // akyd
    public final void c(String s) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("java.lang.String");
        akyb.b.c(bundle0, "endpointId", s, bundlerType0);
        this.a.b().a(3353660607420011320L, 1, bundle0);
    }

    @Override  // akyd
    public final void d(String s) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("java.lang.String");
        akyb.b.c(bundle0, "endpointId", s, bundlerType0);
        this.a.b().a(3353660607420011320L, 2, bundle0);
    }

    @Override  // akyd
    public final void e(String s) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("java.lang.String");
        akyb.b.c(bundle0, "endpointId", s, bundlerType0);
        this.a.b().a(3353660607420011320L, 3, bundle0);
    }

    @Override  // akyd
    public final void f(ByteString hfsf0, boolean z) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("com.google.protobuf.ByteString");
        akyb.b.c(bundle0, "eid", hfsf0, bundlerType0);
        BundlerType.a("boolean");
        bundle0.putBoolean("isFromWorkProfile", z);
        this.a.b().a(3353660607420011320L, 4, bundle0);
    }

    @Override  // akyd
    public final void g(String s, ByteString hfsf0) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("java.lang.String");
        akyb.b.c(bundle0, "endpointId", s, bundlerType0);
        BundlerType bundlerType1 = BundlerType.a("com.google.protobuf.ByteString");
        akyb.b.c(bundle0, "payload", hfsf0, bundlerType1);
        this.a.b().a(3353660607420011320L, 5, bundle0);
    }

    @Override  // akyd
    public final void h() {
        this.a.b().a(3353660607420011320L, 8, new Bundle(Bundler.class.getClassLoader()));
    }

    @Override  // akyd
    public final void i() {
        this.a.b().a(3353660607420011320L, 9, new Bundle(Bundler.class.getClassLoader()));
    }

    @Override  // akyd
    public final void j(String s, ParcelFileDescriptor parcelFileDescriptor0, long v) {
        Bundle bundle0 = new Bundle(Bundler.class.getClassLoader());
        BundlerType bundlerType0 = BundlerType.a("java.lang.String");
        akyb.b.c(bundle0, "endpointId", s, bundlerType0);
        BundlerType bundlerType1 = BundlerType.a("android.os.ParcelFileDescriptor");
        akyb.b.c(bundle0, "pfd", parcelFileDescriptor0, bundlerType1);
        BundlerType.a("long");
        ywq.a(bundle0, v);
        BundlerType bundlerType2 = BundlerType.a("java.lang.Void");
        yvy yvy0 = new yvy(akyb.b, bundlerType2);
        this.a.b().v(3353660607420011320L, 6, bundle0, yvy0, yvy0.c);
    }
}

