import android.text.TextUtils;
import com.google.gms.mdns.MdnsServiceInfo.TextEntry;
import com.google.gms.mdns.MdnsServiceInfo;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class gpsp extends gprm {
    public List a;

    public gpsp(String[] arr_s, gprh gprh0, boolean z) {
        super(arr_s, 16, gprh0, z);
    }

    public gpsp(String[] arr_s, boolean z) {
        super(arr_s, 16, (z ? 0x8000 : 0) | 1, 0L, false, 0L);
    }

    @Override  // gprm
    protected final void a(gprh gprh0) {
        this.a = new ArrayList();
        while(gprh0.a() > 0) {
            int v = gprh0.c();
            gprh0.d(v);
            byte[] arr_b = new byte[v];
            int v1 = 0;
            System.arraycopy(gprh0.a, gprh0.c, arr_b, 0, v);
            gprh0.c += v;
            while(true) {
                if(v1 < v) {
                    if(arr_b[v1] == 61) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                v1 = -1;
                break;
            }
            MdnsServiceInfo.TextEntry mdnsServiceInfo$TextEntry0 = null;
            if(v1 < 0) {
                mdnsServiceInfo$TextEntry0 = new MdnsServiceInfo.TextEntry(new String(arr_b, MdnsServiceInfo.a), null);
            }
            else if(v1 != 0) {
                byte[] arr_b1 = Arrays.copyOf(arr_b, v1);
                byte[] arr_b2 = Arrays.copyOfRange(arr_b, v1 + 1, v);
                mdnsServiceInfo$TextEntry0 = new MdnsServiceInfo.TextEntry(new String(arr_b1, MdnsServiceInfo.a), arr_b2);
            }
            if(mdnsServiceInfo$TextEntry0 != null) {
                this.a.add(mdnsServiceInfo$TextEntry0);
            }
        }
    }

    @Override  // gprm
    protected final void b(gpri gpri0) {
        List list0 = this.a;
        if(list0 != null) {
            for(Object object0: list0) {
                byte[] arr_b = ((MdnsServiceInfo.TextEntry)object0).a.getBytes(MdnsServiceInfo.a);
                byte[] arr_b1 = ((MdnsServiceInfo.TextEntry)object0).b;
                if(arr_b1 != null) {
                    byte[][] arr2_b = {arr_b, new byte[]{61}, arr_b1};
                    int v = 0;
                    for(int v1 = 0; v1 < 3; ++v1) {
                        v += arr2_b[v1].length;
                    }
                    arr_b = new byte[v];
                    int v2 = 0;
                    for(int v3 = 0; v3 < 3; ++v3) {
                        byte[] arr_b2 = arr2_b[v3];
                        System.arraycopy(arr_b2, 0, arr_b, v2, arr_b2.length);
                        v2 += arr_b2.length;
                    }
                }
                gpri0.e(arr_b.length);
                gpri0.b(arr_b);
            }
        }
    }

    private final boolean c() {
        if(this.a != null && this.a.size() != 0) {
            if(this.a.size() == 1) {
                MdnsServiceInfo.TextEntry mdnsServiceInfo$TextEntry0 = (MdnsServiceInfo.TextEntry)this.a.get(0);
                return TextUtils.isEmpty(mdnsServiceInfo$TextEntry0.a) && (mdnsServiceInfo$TextEntry0.b == null || mdnsServiceInfo$TextEntry0.b.length == 0);
            }
            return false;
        }
        return true;
    }

    @Override  // gprm
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gpsp)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        return !this.c() || !((gpsp)object0).c() ? Objects.equals(this.a, ((gpsp)object0).a) : true;
    }

    @Override  // gprm
    public final int hashCode() {
        int v = super.hashCode() * 0x1F;
        return this.c() ? v : v + Objects.hash(new Object[]{this.a});
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

