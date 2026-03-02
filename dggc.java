import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class dggc {
    public final int a;
    public final boolean b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final boolean h;
    public final Map i;
    public final List j;
    public final BigDecimal k;
    public final boolean l;
    public final boolean m;

    public dggc(int v, boolean z, List list0, List list1, List list2, List list3, String s, boolean z1) {
        boolean z3;
        this.a = v;
        this.b = z;
        this.c = list0;
        this.d = list1;
        this.e = list2;
        this.f = list3;
        this.g = s;
        this.h = z1;
        this.i = new LinkedHashMap();
        ibqm ibqm0 = new ibqm(null);
        ibqm0.addAll(list0);
        ibqm0.addAll(list1);
        ibqm0.addAll(list2);
        ibqm0.addAll(list3);
        this.j = ibpo.a(ibqm0);
        BigDecimal bigDecimal0 = BigDecimal.ZERO;
        for(Object object0: list0) {
            ibuq.c(bigDecimal0);
            BigDecimal bigDecimal1 = BigDecimal.valueOf(((FileAttachment)object0).c);
            ibuq.e(bigDecimal1, "valueOf(...)");
            bigDecimal0 = bigDecimal0.add(bigDecimal1);
            ibuq.e(bigDecimal0, "add(...)");
        }
        ibuq.e(bigDecimal0, "fold(...)");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        for(Object object1: this.f) {
            ibuq.c(bigDecimal2);
            BigDecimal bigDecimal3 = BigDecimal.valueOf(((AppAttachment)object1).b);
            ibuq.e(bigDecimal3, "valueOf(...)");
            bigDecimal2 = bigDecimal2.add(bigDecimal3);
            ibuq.e(bigDecimal2, "add(...)");
        }
        ibuq.e(bigDecimal2, "fold(...)");
        BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        ibuq.e(bigDecimal4, "add(...)");
        this.k = bigDecimal4;
        boolean z2 = true;
        if(this.d.isEmpty()) {
        label_50:
            z3 = false;
        }
        else {
            z3 = true;
            List list4 = this.j;
            if(!(list4 instanceof Collection) || !list4.isEmpty()) {
                for(Object object2: list4) {
                    if(!(((Attachment)object2) instanceof TextAttachment)) {
                        goto label_50;
                    }
                }
            }
        }
        this.l = z3;
        if(this.c.isEmpty()) {
            z2 = false;
        }
        else {
            List list5 = this.j;
            if(!(list5 instanceof Collection) || !list5.isEmpty()) {
                for(Object object3: list5) {
                    if(!(((Attachment)object3) instanceof FileAttachment)) {
                        z2 = false;
                        break;
                    }
                }
            }
        }
        this.m = z2;
    }

    public final dggl a() {
        BigDecimal bigDecimal0 = BigDecimal.valueOf(hvqs.az());
        ibuq.e(bigDecimal0, "valueOf(...)");
        if(this.k.compareTo(bigDecimal0) > 0) {
            return dggl.c;
        }
        return !this.c.isEmpty() || !this.f.isEmpty() ? dggl.a : dggl.b;
    }

    public final boolean b() {
        return this.c() ? true : this.d.isEmpty() && this.c.isEmpty() && !this.f.isEmpty() && this.e.isEmpty();
    }

    public final boolean c() {
        return this.d.isEmpty() && (this.c.size() == 1 && this.f.isEmpty() && this.e.isEmpty() && ((FileAttachment)this.c.get(0)).b == 3);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dggc)) {
            return false;
        }
        if(this.a != ((dggc)object0).a) {
            return false;
        }
        if(this.b != ((dggc)object0).b) {
            return false;
        }
        if(!ibuq.m(this.c, ((dggc)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dggc)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dggc)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((dggc)object0).f)) {
            return false;
        }
        return ibuq.m(this.g, ((dggc)object0).g) ? this.h == ((dggc)object0).h : false;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.a * 0x1F + dgga.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
        return this.g == null ? v * 0x1F * 0x1F + dgga.a(this.h) : (v * 0x1F + this.g.hashCode()) * 0x1F + dgga.a(this.h);
    }

    @Override
    public final String toString() {
        return "ShareContent(useCase=" + this.a + ", shouldGeneratePreviews=" + this.b + ", fileAttachments=" + this.c + ", textAttachments=" + this.d + ", wifiCredentialsAttachments=" + this.e + ", appAttachments=" + this.f + ", requiredPackage=" + this.g + ", isQrCodeSession=" + this.h + ")";
    }
}

