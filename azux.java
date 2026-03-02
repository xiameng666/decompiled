import java.util.Arrays;

public final class azux {
    private final int a;
    private final azta_api b;
    private final azsx c;
    private final String d;

    public azux(azta_api azta0, azsx azsx0, String s) {
        this.b = azta0;
        this.c = azsx0;
        this.d = s;
        this.a = Arrays.hashCode(new Object[]{azta0, azsx0, s});
    }

    public final String a() {
        return this.b.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof azux) ? bata.b(this.b, ((azux)object0).b) && bata.b(this.c, ((azux)object0).c) && bata.b(this.d, ((azux)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }
}

