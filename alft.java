import android.content.Context;
import android.os.RemoteException;
import android.util.MutableBoolean;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class alft extends cjtm {
    public static final baun a;
    private final alig b;
    private final ajes c;

    static {
        alft.a = new baun("ProximityAuth", new String[]{"GetSyncedDevices"});
    }

    public alft(alig alig0, azug azug0) {
        ajes ajes0 = new ajes(AppContextProvider.a());
        super(0x8E, "GetSyncedDevices", azug0);
        this.b = alig0;
        this.c = ajes0;
    }

    public static List b(Context context0, boolean z, azug azug0) {
        List list0 = new ArrayList();
        MutableBoolean mutableBoolean0 = new MutableBoolean(false);
        alft alft0 = new alft(new alfs(z, list0, context0, mutableBoolean0), azug0);
        try {
            alft0.f(context0);
            return mutableBoolean0.value ? list0 : null;
        }
        catch(cjuh | RemoteException unused_ex) {
            alft.a.m("Failed to fetch new device list.", new Object[0]);
            return null;
        }
    }

    private final void c(Context context0) {
        allv allv0;
        aliu aliu0 = new aliu();
        try {
            ajdp ajdp0 = new ajdp(this.c);
            evql evql0 = this.c.iG(ajdp0);
            evrg.o(evql0, hpyw.a.f().a(), TimeUnit.SECONDS);
            List list0 = (List)evql0.j();
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            if((exception0 instanceof ExecutionException)) {
                aliu0.B(8);
            }
            else if((exception0 instanceof InterruptedException)) {
                aliu0.B(9);
            }
            else {
                aliu0.B(10);
            }
            throw new cjuh(8, exception0.getMessage());
        }
        ArrayList arrayList0 = new ArrayList();
        if(list0 != null) {
            for(Object object0: list0) {
                DeviceMetadata deviceMetadata0 = (DeviceMetadata)object0;
                String s = bzoe.h(context0).b();
                if(!deviceMetadata0.b.equals(s)) {
                    arrayList0.add(deviceMetadata0);
                }
            }
        }
        List list1 = hpyz.e() ? alft.d(context0) : ggna.a;
        HashMap hashMap0 = new HashMap();
        for(Object object1: arrayList0) {
            DeviceMetadata deviceMetadata1 = (DeviceMetadata)object1;
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)allv.a), deviceMetadata1.c, 0, deviceMetadata1.c.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                allv0 = (allv)hftv0;
            }
            catch(hfur unused_ex) {
                akwi.a.m("Couldn\'t decode BetterTogetherDeviceMetadata in device metadata", new Object[0]);
                continue;
            }
            hashMap0.put(bbmu.c(allv0.b.toByteArray()), akwd.a(deviceMetadata1));
        }
        for(Object object2: list1) {
            SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)object2;
            String s1 = bbmu.c(syncedCryptauthDevice0.a);
            if(!hashMap0.containsKey(s1)) {
                hashMap0.put(s1, syncedCryptauthDevice0);
            }
        }
        ArrayList arrayList1 = ggia.b(hashMap0.values());
        aliu0.C("get_synced_devices_backfill_count", arrayList1.size() - arrayList0.size());
        aliu0.B(7);
        this.b.a(Status.b, arrayList1);
    }

    private static final List d(Context context0) {
        List list0 = new ArrayList();
        try(alvp alvp0 = alvq.a(context0)) {
            if(!alvp0.d()) {
                alft.a.m("Initial sync not done", new Object[0]);
                new aliu().B(6);
                return list0;
            }
            Iterator iterator0 = alvp0.c().entrySet().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                Iterator iterator1 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    list0.add(akwd.b(((alhh)object1), ((String)map$Entry0.getKey())));
                }
            }
            new aliu().B(0);
        }
        return list0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(hpyz.i()) {
            this.c(context0);
            return;
        }
        List list0 = alft.d(context0);
        this.b.a(Status.b, list0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, null);
    }
}

