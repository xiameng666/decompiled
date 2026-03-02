import com.google.android.gms.mdns.MdnsServiceInfo.TextEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cqto extends cqsd {
    public List a;

    public cqto(String[] arr_s, cqrw cqrw0) {
        super(arr_s, 16, cqrw0);
    }

    @Override  // cqsd
    protected final void a(cqrw cqrw0) {
        this.a = new ArrayList();
        while(cqrw0.a() > 0) {
            int v = cqrw0.c();
            cqrw0.d(v);
            byte[] arr_b = new byte[v];
            System.arraycopy(cqrw0.a, cqrw0.c, arr_b, 0, v);
            cqrw0.c += v;
            MdnsServiceInfo.TextEntry mdnsServiceInfo$TextEntry0 = MdnsServiceInfo.TextEntry.a(arr_b);
            if(mdnsServiceInfo$TextEntry0 != null) {
                this.a.add(mdnsServiceInfo$TextEntry0);
            }
        }
    }

    @Override  // cqsd
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof cqto) ? super.equals(object0) && bata.b(this.a, ((cqto)object0).a) : false;
    }

    @Override  // cqsd
    public final int hashCode() {
        int v = Arrays.hashCode(new Object[]{this.a});
        return super.hashCode() * 0x1F + v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TXT: {");
        List list0 = this.a;
        if(list0 != null) {
            for(Object object0: list0) {
                stringBuilder0.append(' ');
                stringBuilder0.append(((MdnsServiceInfo.TextEntry)object0));
            }
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

