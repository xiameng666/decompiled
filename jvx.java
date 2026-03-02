import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j..util.Objects;

public final class jvx {
    public final CharSequence a;
    public final IconCompat b;
    final String c;
    public final String d;
    final boolean e;
    final boolean f;

    public jvx(jvw jvw0) {
        this.a = jvw0.a;
        this.b = jvw0.b;
        this.c = jvw0.c;
        this.d = jvw0.d;
        this.e = jvw0.e;
        this.f = jvw0.f;
    }

    public static jvx a(Bundle bundle0) {
        Bundle bundle1 = bundle0.getBundle("icon");
        jvw jvw0 = new jvw();
        jvw0.a = bundle0.getCharSequence("name");
        jvw0.b = bundle1 == null ? null : IconCompat.d(bundle1);
        jvw0.c = bundle0.getString("uri");
        jvw0.d = bundle0.getString("key");
        jvw0.e = bundle0.getBoolean("isBot");
        jvw0.f = bundle0.getBoolean("isImportant");
        return new jvx(jvw0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof jvx)) {
            return false;
        }
        String s = ((jvx)object0).d;
        return this.d != null || s != null ? Objects.equals(this.d, s) : Objects.equals(Objects.toString(this.a), Objects.toString(((jvx)object0).a)) && Objects.equals(this.c, ((jvx)object0).c) && Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(((jvx)object0).e)) && Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(((jvx)object0).f));
    }

    @Override
    public final int hashCode() {
        return this.d == null ? Objects.hash(new Object[]{this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f)}) : this.d.hashCode();
    }
}

