import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class ajkd extends cjtm {
    private final ajib a;
    private final String b;

    public ajkd(ajib ajib0, String s, azug azug0) {
        super(0x81, "RetrieveDeviceSyncMetadataOperation", azug0);
        this.a = ajib0;
        this.b = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        HashMap hashMap0;
        Map map0;
        String s;
        ajiy ajiy0;
        baun baun0;
        ajfp ajfp0;
        List list0 = null;
        if(hptg.c()) {
            try {
                ajfv ajfv0 = new ajfv(context0);
                ajfp0 = new ajfp(context0);
                baun0 = new baun(new String[]{"DeviceMetadataFetcher"}, null);
                ajiy0 = ajix.a(context0, new ajip(context0));
                s = this.b;
                ajfu ajfu0 = ajfv0.a();
                TWR.declareResource(ajfu0);
                TWR.useResource$NT(ajfu0);
                map0 = ajfu0.c(s);
                Class class0 = ajfs.class;
                __monitor_enter(class0);
                int v = FIN.finallyOpen$NT();
                hashMap0 = new HashMap();
                if(((ajfs)ajfu0).d()) {
                    TWR.useResource$NT(ajfu0);
                    Iterator iterator0 = bbmn.h(((ajfs)ajfu0).b, "com.google.android.gms").iterator();
                    while(true) {
                        TWR.useResource$NT(ajfu0);
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        TWR.useResource$NT(ajfu0);
                        Object object0 = iterator0.next();
                        Account account0 = (Account)object0;
                        List list1 = ((ajfs)ajfu0).b(s, account0);
                        if(list1 == null) {
                            continue;
                        }
                        TWR.useResource$NT(ajfu0);
                        hashMap0.put(account0.name, list1);
                    }
                    TWR.useResource$NT(ajfu0);
                    FIN.finallyCodeBegin$NT(v);
                }
                else {
                    TWR.useResource$NT(ajfu0);
                    FIN.finallyExec$NT(v);
                }
            }
            catch(Throwable throwable0) {
                TWR.moot$NT();
                throw throwable0;
            }
            list0 = new ArrayList();
            for(Object object1: map0.keySet()) {
                String s1 = (String)object1;
                if(hashMap0.containsKey(s1)) {
                    list0.addAll(ajgc.a(s, new Account(s1, "com.google"), ((List)hashMap0.get(s1)), ((List)map0.get(s1)), ajfp0, ajiy0, baun0));
                }
                else {
                    baun0.m("Missing device metadata packets for account with key " + s, new Object[0]);
                }
            }
        }
        ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
        this.a.b(list0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

