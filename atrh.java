import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

public final class atrh implements azsu {
    final CastDevice a;
    final atri b;
    final Bundle c;
    final int d;
    final String e;

    public atrh(atrg atrg0) {
        this.a = atrg0.a;
        this.b = atrg0.b;
        this.d = 0;
        this.c = null;
        this.e = UUID.randomUUID().toString();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof atrh) ? bata.b(this.a, ((atrh)object0).a) && bata.a(null, null) && bata.b(this.e, ((atrh)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, 0, ((int)0), this.e});
    }
}

