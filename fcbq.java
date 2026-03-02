import android.content.Context;

public final class fcbq extends fcby {
    public fcbq(Context context0) {
        super(context0);
    }

    @Override  // fcby
    public final void c(boolean z, boolean z1) {
        super.c(z, z1);
        if(!this.h && !this.h()) {
            this.c.setVisibility((z ? 8 : 0));
        }
    }

    public static fcbq e(Context context0, geyp geyp0) {
        fcbq fcbq0 = new fcbq(context0);
        fcbq0.g(geyp0);
        fcbq0.q(geyp0.c);
        return fcbq0;
    }

    @Override  // fcby
    protected final gfgo f() {
        gfgo gfgo0 = ((geyp)this.p).e;
        return gfgo0 == null ? gfgo.a : gfgo0;
    }

    public final void g(geyp geyp0) {
        super.i(((MessageLite)geyp0));
        this.setId(((int)(((geyp)this.p).c ^ ((geyp)this.p).c >>> 0x20)));
        this.d.setText(geyp0.d);
    }

    @Override  // fcby
    protected final boolean h() {
        geyp geyp0 = (geyp)this.p;
        return (geyp0.b & 4) == 0 ? false : !(geyp0.e == null ? gfgo.a : geyp0.e).d.isEmpty();
    }
}

