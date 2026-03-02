import com.google.android.gms.nearby.sharing.Attachment;
import java.util.Arrays;

public final class dcsk {
    public final icai a;
    public final Attachment b;
    public final byte[] c;
    private final String d;

    public dcsk(Attachment attachment0, byte[] arr_b) {
        ibuq.f(attachment0, "attachment");
        byte[] arr_b1 = new byte[16];
        icaf.a.nextBytes(arr_b1);
        arr_b1[6] = (byte)(arr_b1[6] & 15 | 0x40);
        arr_b1[8] = (byte)(arr_b1[8] & 0x3F | 0x80);
        icai icai0 = icah.a(icaj.a(arr_b1, 0), icaj.a(arr_b1, 8));
        super();
        this.a = icai0;
        this.b = attachment0;
        this.c = arr_b;
        this.d = null;
    }

    public final long a() {
        return this.b.c();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dcsk)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dcsk)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dcsk)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((dcsk)object0).c) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.c == null ? v * 0x1F * 0x1F : (v * 0x1F + Arrays.hashCode(this.c)) * 0x1F;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.c);
        return "CloudAttachment(id=" + this.a + ", attachment=" + this.b + ", preview=" + s + ", blobStoreId=null)";
    }
}

