import android.content.Context;

public final class iaqk implements iakw {
    public static final iaoa a;
    public final String b;
    public final Context c;
    public final boolean d;

    static {
        iaqk.a = new iant("Authorization", iaof_metadata.c);
    }

    public iaqk(Context context0, String s, boolean z) {
        this.c = context0;
        this.b = s;
        this.d = z;
    }

    @Override  // iakw
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0, iakr iakr0) {
        return new iaqj(this, iakr0.a(iaoj0, iakq0));
    }
}

