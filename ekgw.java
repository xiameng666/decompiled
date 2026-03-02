import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.EmailAddressEntity;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;
import java.util.Arrays;

public final class ekgw extends cjtm {
    private static final bboh a;
    private final String b;
    private final String c;
    private final String[] d;
    private final ekfh e;

    static {
        ekgw.a = bboh.b("CBR_GetCachedBackedUpOp", bbcu.bN);
    }

    public ekgw(ekfh ekfh0, String s, String s1, String[] arr_s, azug azug0) {
        super(0x87, "GetCachedBackedUpContacts", azug0);
        this.b = s;
        this.e = ekfh0;
        this.c = s1;
        this.d = arr_s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ArrayList arrayList0 = new ArrayList();
        String s = this.b;
        String s1 = this.c;
        String[] arr_s = this.d;
        gfsx gfsx0 = ekgy.a.a(s, s1, arr_s);
        if(gfsx0.i()) {
            for(Object object0: ((gsug)gfsx0.d()).c) {
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for(Object object1: ((gsva)object0).f) {
                    arrayList1.add(new EmailAddressEntity(new EmailAddressEntity(((gsuw)object1).b)));
                }
                for(Object object2: ((gsva)object0).g) {
                    arrayList2.add(new PhoneNumberEntity(new PhoneNumberEntity(((gsux)object2).b)));
                }
                arrayList0.add(new RawContactEntity(((gsva)object0).c, arrayList1, arrayList2));
            }
        }
        else {
            ((ggtj)((ggtj)ekgw.a.i()).ar(0x351E)).R("No contacts found in cache for account : %s, device id : %s ", s, s1);
        }
        ((ggtj)((ggtj)ekgw.a.h()).ar(0x351F)).Y("Number of contacts found for account :  %s, deviceId : %s, Sources : %s is %d", s, s1, Arrays.toString(arr_s), Integer.valueOf(arrayList0.size()));
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
        this.e.a(Status.b, arrayList0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e.a(status0, null, ApiMetadata.b);
    }
}

