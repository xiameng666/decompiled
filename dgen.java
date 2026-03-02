import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.AppInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class dgen implements dgeo {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final List e;
    public boolean f;

    public dgen(long v, String s, long v1, String s1, List list0) {
        ibuq.f(s, "appName");
        ibuq.f(s1, "packageName");
        ibuq.f(list0, "appFileInfoList");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = list0;
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(v1 > 0L) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override  // dgeo
    public final long a() {
        return this.a;
    }

    @Override  // dgeo
    public final long b() {
        return this.c;
    }

    public final AppAttachment c(AppInfo appInfo0) {
        List list0 = this.e;
        boolean z = true;
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(((dgem)object0).d == null) {
                    z = false;
                    break;
                }
            }
        }
        dbvf dbvf0 = new dbvf(this.b);
        dbvf0.a = this.a;
        dbvf0.b = this.c;
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            arrayList0.add(((dgem)object1).a);
        }
        dbvf0.d = (String[])arrayList0.toArray(new String[0]);
        ArrayList arrayList1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object2: list0) {
            arrayList1.add(Long.valueOf(((dgem)object2).c));
        }
        dbvf0.e = ibpo.aG(arrayList1);
        dbvf0.f = this.d;
        dbvf0.c();
        if(z) {
            ArrayList arrayList2 = new ArrayList(ibpo.q(list0, 10));
            for(Object object3: list0) {
                arrayList2.add(((dgem)object3).d);
            }
            dbvf0.c = (String[])arrayList2.toArray(new String[0]);
        }
        AppAttachment appAttachment0 = dbvf0.a();
        if(appInfo0 != null) {
            dggb.b(appAttachment0, appInfo0);
        }
        return appAttachment0;
    }

    @Override  // dgeo
    public final boolean d() {
        List list0 = this.e;
        if((list0 instanceof Collection) && list0.isEmpty()) {
            return true;
        }
        for(Object object0: list0) {
            if(!(((dgem)object0).e instanceof dgfs)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgen)) {
            return false;
        }
        if(this.a != ((dgen)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((dgen)object0).b)) {
            return false;
        }
        if(this.c != ((dgen)object0).c) {
            return false;
        }
        return ibuq.m(this.d, ((dgen)object0).d) ? ibuq.m(this.e, ((dgen)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return (((dgek.a(this.a) * 0x1F + this.b.hashCode()) * 0x1F + dgek.a(this.c)) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "AppMetadata(attachmentId=" + this.a + ", appName=" + this.b + ", size=" + this.c + ", packageName=" + this.d + ", appFileInfoList=" + this.e + ")";
    }
}

