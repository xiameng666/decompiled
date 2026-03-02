import android.content.Intent;

public final class ehpg {
    public final String a;
    public final String b;
    public final Intent c;
    public final awkv d;
    public final boolean e;
    public final ibtw f;

    public ehpg(String s, String s1, Intent intent0, awkv awkv0, boolean z) {
        ibuq.f(s, "title");
        ibuq.f(intent0, "launchIntent");
        super();
        this.a = s;
        this.b = s1;
        this.c = intent0;
        this.d = awkv0;
        this.e = z;
        this.f = new ehpf(this);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ehpg)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ehpg)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ehpg)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ehpg)object0).c)) {
            return false;
        }
        return this.d == ((ehpg)object0).d ? this.e == ((ehpg)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        return this.e ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "ControlUiState(title=" + this.a + ", description=" + this.b + ", launchIntent=" + this.c + ", id=" + this.d + ", enabled=" + this.e + ")";
    }
}

