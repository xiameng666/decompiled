import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import java.util.ArrayList;

public abstract class fdja extends wby implements fdjb {
    public fdja() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        fdiv fdiv0;
        switch(v) {
            case 1: {
                DataHolder dataHolder0 = (DataHolder)wbz.a(parcel0, DataHolder.CREATOR);
                fdja.gr(parcel0);
                this.g(dataHolder0);
                return true;
            }
            case 2: {
                MessageEventParcelable messageEventParcelable0 = (MessageEventParcelable)wbz.a(parcel0, MessageEventParcelable.CREATOR);
                fdja.gr(parcel0);
                this.i(messageEventParcelable0);
                return true;
            }
            case 3: {
                NodeParcelable nodeParcelable0 = (NodeParcelable)wbz.a(parcel0, NodeParcelable.CREATOR);
                fdja.gr(parcel0);
                this.l(nodeParcelable0);
                return true;
            }
            case 4: {
                NodeParcelable nodeParcelable1 = (NodeParcelable)wbz.a(parcel0, NodeParcelable.CREATOR);
                fdja.gr(parcel0);
                this.m(nodeParcelable1);
                return true;
            }
            case 5: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(NodeParcelable.CREATOR);
                fdja.gr(parcel0);
                this.d(arrayList0);
                return true;
            }
            case 6: {
                AncsNotificationParcelable ancsNotificationParcelable0 = (AncsNotificationParcelable)wbz.a(parcel0, AncsNotificationParcelable.CREATOR);
                fdja.gr(parcel0);
                this.k(ancsNotificationParcelable0);
                return true;
            }
            case 7: {
                ChannelEventParcelable channelEventParcelable0 = (ChannelEventParcelable)wbz.a(parcel0, ChannelEventParcelable.CREATOR);
                fdja.gr(parcel0);
                this.a(channelEventParcelable0);
                return true;
            }
            case 8: {
                CapabilityInfoParcelable capabilityInfoParcelable0 = (CapabilityInfoParcelable)wbz.a(parcel0, CapabilityInfoParcelable.CREATOR);
                fdja.gr(parcel0);
                this.c(capabilityInfoParcelable0);
                return true;
            }
            case 9: {
                AmsEntityUpdateParcelable amsEntityUpdateParcelable0 = (AmsEntityUpdateParcelable)wbz.a(parcel0, AmsEntityUpdateParcelable.CREATOR);
                fdja.gr(parcel0);
                this.h(amsEntityUpdateParcelable0);
                return true;
            }
            case 13: {
                MessageEventParcelable messageEventParcelable1 = (MessageEventParcelable)wbz.a(parcel0, MessageEventParcelable.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    fdiv0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    fdiv0 = (iInterface0 instanceof fdiv) ? ((fdiv)iInterface0) : new fdit(iBinder0);
                }
                fdja.gr(parcel0);
                this.n(messageEventParcelable1, fdiv0);
                return true;
            }
            case 14: {
                ConsentResponse consentResponse0 = (ConsentResponse)wbz.a(parcel0, ConsentResponse.CREATOR);
                fdja.gr(parcel0);
                return true;
            }
            case 15: {
                ConnectionStateEventParcelable connectionStateEventParcelable0 = (ConnectionStateEventParcelable)wbz.a(parcel0, ConnectionStateEventParcelable.CREATOR);
                fdja.gr(parcel0);
                this.e(connectionStateEventParcelable0);
                return true;
            }
            case 16: {
                NodeMigratedEventParcelable nodeMigratedEventParcelable0 = (NodeMigratedEventParcelable)wbz.a(parcel0, NodeMigratedEventParcelable.CREATOR);
                fdja.gr(parcel0);
                this.j(nodeMigratedEventParcelable0);
                return true;
            }
            case 17: {
                RestoreCompletedEventParcelable restoreCompletedEventParcelable0 = (RestoreCompletedEventParcelable)wbz.a(parcel0, RestoreCompletedEventParcelable.CREATOR);
                fdja.gr(parcel0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

