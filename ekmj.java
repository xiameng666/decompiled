import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import j..util.Comparator.-CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class ekmj extends lqd {
    public final Context a;
    private final ejyv h;
    private final ejyn i;
    private final boolean j;
    private gmcd k;
    private gmcd l;

    public ekmj(Context context0, ejyv ejyv0, ejyn ejyn0, boolean z) {
        this.a = context0;
        this.h = ejyv0;
        this.i = ejyn0;
        this.j = z;
    }

    public static gged_interceptors b(List list0, Resources resources0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s = ((RawContactEntity)object0).a;
            if(!TextUtils.isEmpty(s)) {
                arrayList0.add(new ejyw(s, ekmu.a(resources0, s)));
            }
        }
        return gged_interceptors.D(Comparator.-CC.comparing(new ekmg()), arrayList0);
    }

    @Override  // lqd
    protected final void c() {
        if(this.j) {
            String s = this.h.i();
            String s1 = this.h.j();
            Set set0 = this.h.n();
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                String[] arr_s = (String[])set0.toArray(new String[0]);
                gmcd gmcd0 = this.l;
                if(gmcd0 != null) {
                    gmcd0.cancel(true);
                }
                azzc azzc0 = new azzc();
                azzc0.c = new Feature[]{ejxq.e};
                azzc0.a = new ejxs(this.i, s, s1, arr_s);
                azzc0.d = 20408;
                azzd azzd0 = azzc0.a();
                gmcd gmcd1 = fhra.b(this.i.iG(azzd0));
                this.l = gmcd1;
                gmbu.t(gmcd1, new ekmh(this), gmap.a);
                return;
            }
            this.ii(new ArrayList());
            return;
        }
        String s2 = this.h.i();
        String s3 = this.h.j();
        Set set1 = this.h.n();
        if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3)) {
            ejze.a().x(true, 3, false);
            gmcd gmcd2 = this.k;
            if(gmcd2 != null) {
                gmcd2.cancel(true);
            }
            set1.add("BACKUP_GAB");
            String[] arr_s1 = (String[])set1.toArray(new String[0]);
            azzc azzc1 = new azzc();
            azzc1.d = 20401;
            azzc1.a = new ejyb(this.i, s2, s3, arr_s1);
            azzd azzd1 = azzc1.a();
            gmcd gmcd3 = fhra.b(this.i.iG(azzd1));
            this.k = gmcd3;
            gmbu.t(gmcd3, new ekmi(this), gmap.a);
            return;
        }
        ejze.a().d("ContactsRestoreContactsLD.skip_fetch_backup_contacts _call_due_to_no_account");
        this.ii(new ArrayList());
    }
}

