import java.util.Arrays;
import java.util.concurrent.Callable;

public final class ezyi {
    public final String a;
    public final fagj b;
    public final boolean c;
    public final Callable d;

    public ezyi(String s, fagj fagj0) {
        this(s, fagj0, false, null);
    }

    public ezyi(String s, fagj fagj0, boolean z, Callable callable0) {
        this.a = s;
        this.b = fagj0;
        this.c = z;
        this.d = callable0;
    }

    public ezyi(String s, fagj fagj0, byte[] arr_b) {
        this(s, fagj0, true, null);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ezyi) ? this.a.equals(((ezyi)object0).a) && this.b.equals(((ezyi)object0).b) && this.c == ((ezyi)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }
}

