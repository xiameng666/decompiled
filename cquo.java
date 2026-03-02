import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdns.MdnsSearchOptions;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.ArrayList;
import java.util.List;

public final class cquo extends wby implements cqup, cqvw {
    private final cqum a;
    private final azyf b;

    public cquo() {
        super("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
    }

    public cquo(cqum cqum0, azyf azyf0) {
        super("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
        this.a = cqum0;
        this.b = azyf0;
    }

    @Override  // cqup
    public final void a(List list0, int v) {
        cquz cquz0 = new cquz(this, list0, v);
        this.b.b(cquz0);
    }

    @Override  // cqup
    public final void b(int v, int v1) {
        cqva cqva0 = new cqva(this, v, v1);
        this.b.b(cqva0);
    }

    @Override  // cqup
    public final void c() {
        cquy cquy0 = new cquy(this);
        this.b.b(cquy0);
    }

    @Override  // cqup
    public final void d(int v) {
        cqux cqux0 = new cqux(this, v);
        this.b.b(cqux0);
    }

    @Override  // cqup
    public final void e(MdnsServiceInfo mdnsServiceInfo0) {
        cquu cquu0 = new cquu(this, mdnsServiceInfo0);
        this.b.b(cquu0);
    }

    @Override  // cqup
    public final void f(String s) {
        cquw cquw0 = new cquw(this, s);
        this.b.b(cquw0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                MdnsServiceInfo mdnsServiceInfo0 = (MdnsServiceInfo)wbz.a(parcel0, MdnsServiceInfo.CREATOR);
                cquo.gr(parcel0);
                this.e(mdnsServiceInfo0);
                return true;
            }
            case 2: {
                MdnsServiceInfo mdnsServiceInfo1 = (MdnsServiceInfo)wbz.a(parcel0, MdnsServiceInfo.CREATOR);
                cquo.gr(parcel0);
                this.g(mdnsServiceInfo1);
                return true;
            }
            case 3: {
                String s = parcel0.readString();
                cquo.gr(parcel0);
                this.f(s);
                return true;
            }
            case 4: {
                int v1 = parcel0.readInt();
                cquo.gr(parcel0);
                this.d(v1);
                return true;
            }
            case 5: {
                this.c();
                return true;
            }
            case 6: {
                ArrayList arrayList0 = parcel0.createStringArrayList();
                int v2 = parcel0.readInt();
                cquo.gr(parcel0);
                this.a(arrayList0, v2);
                return true;
            }
            case 7: {
                int v3 = parcel0.readInt();
                int v4 = parcel0.readInt();
                cquo.gr(parcel0);
                this.b(v3, v4);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // cqup
    public final void g(MdnsServiceInfo mdnsServiceInfo0) {
        cquv cquv0 = new cquv(this, mdnsServiceInfo0);
        this.b.b(cquv0);
    }

    @Override  // cqvw
    public final void h(ApiMetadata apiMetadata0) {
        this.a.d(this, apiMetadata0);
    }

    @Override  // cqvw
    public final boolean i(MdnsSearchOptions mdnsSearchOptions0, ApiMetadata apiMetadata0) {
        this.a.c(this, mdnsSearchOptions0, apiMetadata0);
        return true;
    }
}

