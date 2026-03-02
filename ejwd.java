import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.AccountState;

public final class ejwd extends ejvr {
    private final String b;

    public ejwd(ejtq ejtq0, String s, azug azug0) {
        super(ejtq0, "GetAccountState", azug0);
        this.b = s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ejth ejth0 = ejte.b(context0, this.b);
        if(ejth0 == null) {
            this.a.d(new Status(6000), ApiMetadata.b);
            return;
        }
        Long long0 = ejth0.e;
        Boolean[] arr_boolean = new Boolean[0x40];
        if(long0 != null) {
            for(int v = 0; v < 0x40; ++v) {
                arr_boolean[v] = Boolean.valueOf((((long)long0) & 1L << v) != 0L);
            }
        }
        ejtq ejtq0 = this.a;
        boolean[] arr_z = new boolean[0x40];
        boolean[] arr_z1 = new boolean[0x40];
        for(int v1 = 0; v1 < 0x40; ++v1) {
            Boolean boolean0 = arr_boolean[v1];
            if(boolean0 != null) {
                arr_z[v1] = boolean0.booleanValue();
                arr_z1[v1] = true;
            }
        }
        AccountState accountState0 = new AccountState(arr_z, arr_z1);
        Status status0 = new Status(0);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ex);
        Parcel parcel0 = ejtq0.jo();
        wbz.f(parcel0, accountState0);
        wbz.f(parcel0, status0);
        wbz.f(parcel0, apiMetadata0);
        ejtq0.jp(7, parcel0);
    }
}

