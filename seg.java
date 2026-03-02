import android.content.Context;
import android.graphics.Bitmap;
import android.os.PersistableBundle;

public final class seg implements scz {
    public static final sef a;
    private final sdb b;
    private final ibns c;

    static {
        seg.a = new sef();
    }

    public seg(Context context0, int v) {
        this("com.google.android.gms", v);
    }

    public seg(Bitmap bitmap0) {
        this(new sdb(bitmap0), null);
    }

    public seg(String s, int v) {
        this(null, new ibns(s, v));
    }

    public seg(sdb sdb0, ibns ibns0) {
        this.b = sdb0;
        this.c = ibns0;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sdb sdb0 = this.b;
        if(sdb0 != null) {
            sdn.b(persistableBundle0, "value", sdb0);
        }
        ibns ibns0 = this.c;
        if(ibns0 != null) {
            persistableBundle0.putString("packageName", ((String)ibns0.a));
            persistableBundle0.putInt("resourceId", ((Number)ibns0.b).intValue());
        }
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof seg)) {
            return false;
        }
        return ibuq.m(this.b, ((seg)object0).b) ? ibuq.m(this.c, ((seg)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        ibns ibns0 = this.c;
        if(ibns0 != null) {
            v = ibns0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        sdb sdb0 = this.b;
        if(sdb0 != null) {
            return a.i(sdb0, "BitmapResource{value=", "}");
        }
        ibuq.c(this.c);
        return "BitmapResource{package=" + this.c.a + ", resourceId=" + this.c.b;
    }
}

