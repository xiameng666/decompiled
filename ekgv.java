import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.EmailAddressEntity;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ekgv extends cjtm {
    private static final bboh a;
    private final ekfh b;
    private final String c;
    private final String d;
    private final String[] e;

    static {
        ekgv.a = bboh.b("CBR_GetBackedUpOp", bbcu.bN);
    }

    public ekgv(ekfh ekfh0, String s, String s1, String[] arr_s, azug azug0) {
        super(0x87, "GetBackedUpDeviceContacts", azug0);
        this.c = s;
        this.b = ekfh0;
        this.d = s1;
        this.e = arr_s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ArrayList arrayList0 = new ArrayList();
        List list0 = Arrays.asList(this.e);
        boolean z = list0.contains("BACKUP_GAB");
        Collections.replaceAll(list0, "BACKUP_GAB", "com.google");
        try {
            try {
                ekfu ekfu0 = new ekfu(context0);
                baqr baqr0 = ekfr.a(context0, this.c);
                String[] arr_s = (String[])list0.toArray(new String[0]);
                Iterator iterator0 = ekfu0.a(baqr0, this.d, arr_s).c.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_35;
                    }
                    Object object0 = iterator0.next();
                    gsva gsva0 = (gsva)object0;
                    if(!z || !gsva0.i.equals("com.google")) {
                        ArrayList arrayList1 = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for(Object object1: gsva0.f) {
                            arrayList1.add(new EmailAddressEntity(new EmailAddressEntity(((gsuw)object1).b)));
                        }
                        for(Object object2: gsva0.g) {
                            arrayList2.add(new PhoneNumberEntity(new PhoneNumberEntity(((gsux)object2).b)));
                        }
                        arrayList0.add(new RawContactEntity(gsva0.c, arrayList1, arrayList2));
                    }
                }
            }
            catch(acse unused_ex) {
            }
            catch(iapl unused_ex) {
                goto label_29;
            }
            ((ggtj)((ggtj)ekgv.a.i()).ar(0x351C)).x("Auth Exception when fetching contacts from server");
        }
        catch(Throwable throwable0) {
            this.b.a(Status.d, null, ApiMetadata.b);
            throw throwable0;
        }
        this.b.a(Status.d, null, ApiMetadata.b);
        return;
        try {
        label_29:
            ((ggtj)((ggtj)ekgv.a.i()).ar(0x351D)).x("Operation Exception when fetching contacts from server");
        }
        catch(Throwable throwable0) {
            this.b.a(Status.d, null, ApiMetadata.b);
            throw throwable0;
        }
        this.b.a(Status.d, null, ApiMetadata.b);
        return;
    label_35:
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
        this.b.a(Status.b, arrayList0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, null, ApiMetadata.b);
    }
}

