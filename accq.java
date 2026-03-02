import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions;
import java.util.List;

public abstract class accq extends wby implements accr {
    public accq() {
        super("com.google.android.gms.appinvite.ui.context.ISelectionFragmentHolder");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw0 = null;
        if(v != 1) {
            switch(v) {
                case 2: {
                    IBinder iBinder0 = parcel0.readStrongBinder();
                    if(iBinder0 != null) {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
                    }
                    accq.gr(parcel0);
                    this.d(bjgw0);
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    SelectionFragmentOptions selectionFragmentOptions0 = (SelectionFragmentOptions)wbz.a(parcel0, SelectionFragmentOptions.CREATOR);
                    accq.gr(parcel0);
                    this.e(selectionFragmentOptions0);
                    parcel1.writeNoException();
                    return true;
                }
                case 101: {
                    List list0 = this.c();
                    parcel1.writeNoException();
                    parcel1.writeTypedList(list0);
                    return true;
                }
                case 102: {
                    IBinder iBinder1 = parcel0.readStrongBinder();
                    if(iBinder1 != null) {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.appinvite.ui.context.ILoadingListener");
                        bjgw0 = (iInterface1 instanceof acco) ? ((acco)iInterface1) : new acco(iBinder1);
                    }
                    accq.gr(parcel0);
                    this.k(((acco)bjgw0));
                    parcel1.writeNoException();
                    return true;
                }
                case 103: {
                    IBinder iBinder2 = parcel0.readStrongBinder();
                    if(iBinder2 != null) {
                        IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.appinvite.ui.context.ISelectionChangeListener");
                        bjgw0 = (iInterface2 instanceof accp) ? ((accp)iInterface2) : new accp(iBinder2);
                    }
                    accq.gr(parcel0);
                    this.l(((accp)bjgw0));
                    parcel1.writeNoException();
                    return true;
                }
                case 104: {
                    boolean z = wbz.i(parcel0);
                    accq.gr(parcel0);
                    this.j(z);
                    parcel1.writeNoException();
                    return true;
                }
                case 105: {
                    ContactPerson contactPerson0 = (ContactPerson)wbz.a(parcel0, ContactPerson.CREATOR);
                    accq.gr(parcel0);
                    this.g(contactPerson0);
                    parcel1.writeNoException();
                    return true;
                }
                case 106: {
                    ContactPerson contactPerson1 = (ContactPerson)wbz.a(parcel0, ContactPerson.CREATOR);
                    accq.gr(parcel0);
                    this.f(contactPerson1);
                    parcel1.writeNoException();
                    return true;
                }
                case 107: {
                    int v1 = parcel0.readInt();
                    accq.gr(parcel0);
                    this.h(v1);
                    parcel1.writeNoException();
                    return true;
                }
                case 108: {
                    int v2 = parcel0.readInt();
                    accq.gr(parcel0);
                    this.i(v2);
                    parcel1.writeNoException();
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        bjgw bjgw1 = this.a();
        parcel1.writeNoException();
        wbz.h(parcel1, bjgw1);
        return true;
    }
}

