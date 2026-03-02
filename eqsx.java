import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class eqsx extends cjtm {
    public final eqbv a;
    public final ParcelFileDescriptor[] b;
    public final epyl c;
    public final eqtg d;
    private final DirectTransferConfigurations e;
    private final Handler f;

    public eqsx(eqtg eqtg0, DirectTransferConfigurations directTransferConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyl epyl0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(210, "StartDirectTransferOperation", azug0);
        this.d = eqtg0;
        this.a = eqbv0;
        this.e = directTransferConfigurations0;
        this.b = arr_parcelFileDescriptor;
        this.c = epyl0;
        this.f = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        epxi epxi0 = new epxi();
        HashMap hashMap0 = new HashMap();
        DirectTransferConfigurations directTransferConfigurations0 = this.e;
        String s = directTransferConfigurations0.a;
        if(s != null) {
            hashMap0.put("directTransferConfirmationBodyText", s);
        }
        String s1 = directTransferConfigurations0.c;
        if(s1 != null) {
            hashMap0.put("directTransferConfirmationTitleText", s1);
        }
        String s2 = directTransferConfigurations0.b;
        if(s2 != null) {
            hashMap0.put("directTransfer3pConfirmationBodyText", s2);
        }
        String s3 = directTransferConfigurations0.d;
        if(s3 != null) {
            hashMap0.put("directTransferConfirmationWatchIcon", s3);
        }
        String s4 = directTransferConfigurations0.e;
        if(s4 != null) {
            hashMap0.put("directTransferTheme", s4);
        }
        String s5 = directTransferConfigurations0.h;
        if(s5 != null) {
            hashMap0.put("directTransferTransitionTitle", s5);
        }
        String s6 = directTransferConfigurations0.i;
        if(s6 != null) {
            hashMap0.put("directTransferTransitionDescription", s6);
        }
        epxi0.b.putAll(hashMap0);
        if(directTransferConfigurations0.f) {
            epxi0.c();
            epxi0.e = directTransferConfigurations0.g;
            epxi0.a = new ArrayList();
        }
        else {
            List list0 = eqck.t(context0);
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = directTransferConfigurations0.k;
            if(arrayList1 != null && !arrayList1.isEmpty()) {
                HashMap hashMap1 = new HashMap();
                for(Object object0: list0) {
                    hashMap1.put(((BootstrapAccount)object0).b, ((BootstrapAccount)object0));
                }
                int v = arrayList1.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    BootstrapAccount bootstrapAccount0 = (BootstrapAccount)arrayList1.get(v1);
                    if(hashMap1.containsKey(bootstrapAccount0.b)) {
                        arrayList0.add(((BootstrapAccount)hashMap1.get(bootstrapAccount0.b)));
                    }
                }
            }
            else {
                arrayList0.addAll(list0);
            }
            epxi0.a = arrayList0;
        }
        AuthenticatingUser authenticatingUser0 = directTransferConfigurations0.j;
        if(authenticatingUser0 != null) {
            epxi0.f = authenticatingUser0;
        }
        if(hygx.f() && directTransferConfigurations0.l == 1) {
            epxi0.c = true;
            epxi0.d = erpk.a(context0);
        }
        if(hygx.g()) {
            epxi0.g = directTransferConfigurations0.m;
        }
        eqsw eqsw0 = new eqsw(this, epxi0.a());
        this.f.post(eqsw0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.a(status0);
    }
}

