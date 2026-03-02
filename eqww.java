import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import java.util.ArrayList;

public final class eqww extends wby implements eqwx {
    final erbv a;
    final eqzi b;

    public eqww() {
        super("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartClientCallbacks");
    }

    public eqww(erbv erbv0, eqzi eqzi0) {
        this.a = erbv0;
        this.b = eqzi0;
        super("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartClientCallbacks");
    }

    @Override  // eqwx
    public final void a() {
        this.a.i.m("onDisconnected!", new Object[0]);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{epvj.o};
        azzc0.b = false;
        azzc0.a = new erak(((eraq)this.b));
        azzc0.d = 20763;
        azzd azzd0 = azzc0.a();
        ((azts)this.b).iG(azzd0);
    }

    @Override  // eqwx
    public final void b(QuickStartTargetEventData quickStartTargetEventData0) {
        ibuq.f(quickStartTargetEventData0, "eventData");
        switch(quickStartTargetEventData0.a) {
            case 1: {
                this.a.i.d("Advertisement started!", new Object[0]);
                return;
            }
            case 8: {
                ArrayList arrayList0 = quickStartTargetEventData0.f;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    erbv erbv0 = this.a;
                    erqc erqc0 = erbv0.i;
                    erqc0.d("Account transfer started!", new Object[0]);
                    ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
                    for(Object object0: arrayList0) {
                        String s = ((BootstrapAccount)object0).b;
                        ibuq.e(s, "getName(...)");
                        arrayList1.add(new erbk(s, ((BootstrapAccount)object0).i));
                    }
                    erqc0.d(a.aA(arrayList1, "Sending transfer started metadata for ", " accounts."), new Object[0]);
                    rui rui0 = new rui(new sei(erbv0.g(), 0x7F1527CD), null, null, erbv.I(erbv0, arrayList1), 6);  // string:quick_start_adding_accounts_header "Adding accounts"
                    erbv0.w(rui.class, rui0);
                    erbv0.j = ((BootstrapAccount)arrayList0.get(0)).b;
                    return;
                }
                this.a.i.f("No accounts to be transferred.", new Object[0]);
                return;
            }
            case 12: {
                erbv erbv1 = this.a;
                erbv1.i.d("Restore account received!", new Object[0]);
                String s1 = quickStartTargetEventData0.h;
                if(s1 != null && s1.length() != 0) {
                    erbv1.j = s1;
                }
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                QuickStartTargetEventData quickStartTargetEventData0 = (QuickStartTargetEventData)wbz.a(parcel0, QuickStartTargetEventData.CREATOR);
                eqww.gr(parcel0);
                this.b(quickStartTargetEventData0);
                break;
            }
            case 2: {
                this.a();
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

