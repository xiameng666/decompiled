import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class ajke extends cjtm {
    private final ajib a;
    private final String b;
    private final Account c;

    public ajke(ajib ajib0, String s, Account account0, azug azug0) {
        super(0x81, "RetrieveDeviceSyncMetadataOperation", azug0);
        this.a = ajib0;
        this.b = s;
        this.c = account0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        List list2;
        List list1;
        String s;
        Account account0;
        ajiy ajiy0;
        baun baun0;
        ajfp ajfp0;
        List list0 = null;
        if(hptg.c()) {
            ajfv ajfv0 = new ajfv(context0);
            ajfp0 = new ajfp(context0);
            baun0 = new baun(new String[]{"DeviceMetadataFetcher"}, null);
            ajiy0 = ajix.a(context0, new ajip(context0));
            account0 = this.c;
            s = this.b;
            try(ajfu ajfu0 = ajfv0.a()) {
                list1 = ajfu0.b(s, account0);
                if(list1 == null) {
                    baun0.m("No device metadata packets for key " + s, new Object[0]);
                }
                else {
                    list2 = ajfu0.a(s, account0);
                    if(list2 == null) {
                        baun0.m("No device feature statuses for key " + s, new Object[0]);
                    }
                    else {
                        goto label_25;
                    }
                }
            }
            goto label_26;
        label_25:
            list0 = ajgc.a(s, account0, list1, list2, ajfp0, ajiy0, baun0);
        }
    label_26:
        ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
        this.a.b(list0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

