import android.os.PersistableBundle;

public final class erbd implements scz {
    public static final erbc a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        erbd.a = new erbc();
    }

    public erbd() {
        this(null, false, false, 15);
    }

    public erbd(String s, boolean z, boolean z1, int v) {
        int v1 = 1;
        if(1 == (v & 1)) {
            s = null;
        }
        if((v & 8) != 0) {
            v1 = 0;
        }
        this(s, ((boolean)(((int)z) & ((v & 2) == 0 ? 1 : 0))), (v & 4) != 0, ((boolean)(((int)z1) & v1)));
    }

    public erbd(String s, boolean z, boolean z1, boolean z2) {
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = z2;
    }

    @Override  // scz
    public final PersistableBundle a() {
        return jzg.a(new ibns[]{new ibns("shared_secret", this.b), new ibns("has_rebooted", Boolean.valueOf(this.c)), new ibns("use_launcher", Boolean.valueOf(this.d)), new ibns("is_os_migration", Boolean.valueOf(this.e))});
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof erbd)) {
            return false;
        }
        if(!ibuq.m(this.b, ((erbd)object0).b)) {
            return false;
        }
        if(this.c != ((erbd)object0).c) {
            return false;
        }
        return this.d == ((erbd)object0).d ? this.e == ((erbd)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? (erbb.a(this.c) * 0x1F + erbb.a(this.d)) * 0x1F + erbb.a(this.e) : ((this.b.hashCode() * 0x1F + erbb.a(this.c)) * 0x1F + erbb.a(this.d)) * 0x1F + erbb.a(this.e);
    }

    @Override
    public final String toString() {
        return "AccountTransferInput(sharedSecret=" + this.b + ", hasRebooted=" + this.c + ", useLauncher=" + this.d + ", isOsMigration=" + this.e + ")";
    }
}

