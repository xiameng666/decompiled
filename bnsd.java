import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.Status;

public final class bnsd implements bnvk {
    public static final ByteString a;
    private static final gged_interceptors b;
    private final Context c;
    private final String d;
    private final bnxi e;
    private int f;

    static {
        ByteString hfsf0 = ByteString.A(gfuk.b("\u0000", 0x20));
        bnsd.a = hfsf0;
        bnsd.b = gged_interceptors.l(new SharedKey(1, hfsf0.toByteArray()));
    }

    public bnsd(int v, Context context0, String s, bnxi bnxi0) {
        this.f = v;
        this.c = context0;
        this.d = s;
        this.e = bnxi0;
    }

    @Override  // bnvk
    public final bnxi a() {
        return this.e;
    }

    @Override  // bnvk
    public final gmcd b() {
        return gmbu.h(new UnsupportedOperationException("A fake domain cannot be silently created using the Gaia password."));
    }

    @Override  // bnvk
    public final gmcd c() {
        return gmbu.i(Boolean.valueOf(false));
    }

    @Override  // bnvk
    public final gmcd d() {
        int v = this.f;
        if(v != 0) {
            return gmbu.i(Boolean.valueOf(v == 1));
        }
        throw null;
    }

    @Override  // bnvk
    public final gmcd e() {
        int v = this.f - 1;
        if(this.f != 0) {
            switch(v) {
                case 1: {
                    return gmbu.i(new bnvi(false, false));
                }
                case 0: 
                case 2: {
                    return gmbu.i(new bnvi(true, true));
                }
                default: {
                    return gmbu.i(new bnvi(false, true));
                }
            }
        }
        throw null;
    }

    @Override  // bnvk
    public final gmcd f() {
        switch(this.f) {
            case 0: {
                throw null;
            }
            case 1: {
                return gmbu.i(bnsd.b);
            }
            default: {
                Intent intent0 = bnsg.a("RETRIEVE_DOMAIN");
                PendingIntent pendingIntent0 = fqaw.a(this.c, 0, intent0, 0x4000000);
                gftb.check(pendingIntent0);
                return gmbu.h(new azuh(new Status(38500, "Key retrieval required", pendingIntent0)));
            }
        }
    }

    @Override  // bnvk
    public final gmcd g() {
        switch(this.f) {
            case 0: {
                throw null;
            }
            case 1: {
                return gmbu.i(bnvj.h);
            }
            default: {
                return gmbu.i(bnvj.c);
            }
        }
    }

    @Override  // bnvk
    public final gmcd h() {
        return gmbx.a;
    }

    @Override  // bnvk
    public final gmcd i() {
        int v = this.f - 1;
        if(this.f != 0) {
            switch(v) {
                case 0: {
                    return gmbu.h(new UnsupportedOperationException("The SILENT fake domain cannot be reset."));
                }
                case 1: {
                    return gmbu.h(new UnsupportedOperationException("The FAIL_TO_CREATE fake domain does not exist."));
                }
                default: {
                    this.f = 2;
                    return gmbx.a;
                }
            }
        }
        throw null;
    }

    @Override  // bnvk
    public final gmcd j(boolean z) {
        int v = this.f;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                return z ? gmbx.a : gmbu.h(new UnsupportedOperationException("The SILENT fake domain always has LSKF consent."));
            }
            default: {
                return z ? gmbu.h(new UnsupportedOperationException("The " + bnsc.a(v) + " fake domain never has LSKF consent.")) : gmbx.a;
            }
        }
    }

    @Override  // bnvk
    public final gmcd k() {
        gftb.q(this.e.equals(bnxi.a));
        int v = this.f;
        switch(v) {
            case 0: {
                throw null;
            }
            case 2: {
                Intent intent0 = bnsg.a("CREATE_DOMAIN");
                PendingIntent pendingIntent0 = fqaw.a(this.c, 0, intent0, 0x4000000);
                gftb.check(pendingIntent0);
                return gmbu.i(pendingIntent0);
            }
            default: {
                return gmbu.h(new UnsupportedOperationException("The " + bnsc.a(v) + " fake domain has already been created."));
            }
        }
    }

    @Override  // bnvk
    public final String l() {
        return this.d;
    }

    @Override  // bnvk
    public final boolean m() {
        return bnvh.a(this);
    }
}

