import android.accounts.Account;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.AppRecommendationsRequest;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayConfig;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AcceptTermsRequest;
import com.google.android.gms.wearable.internal.AddAccountToConsentRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AddSupervisedAccountRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.ConsentStatusRequest;
import com.google.android.gms.wearable.internal.FetchBackupRequest;
import com.google.android.gms.wearable.internal.GetRestoreStateRequest;
import com.google.android.gms.wearable.internal.LogCounterRequest;
import com.google.android.gms.wearable.internal.LogEventRequest;
import com.google.android.gms.wearable.internal.LogTimerRequest;
import com.google.android.gms.wearable.internal.PrivacyRecordOptinRequest;
import com.google.android.gms.wearable.internal.RecordTermConsentRequest;
import com.google.android.gms.wearable.internal.RecordUntetheredSupervisedAccountTransferRequest;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import com.google.android.gms.wearable.internal.RequestConnectionParcelable;
import com.google.android.gms.wearable.internal.SaveRestoreStateRequest;
import com.google.android.gms.wearable.internal.StartRestoreSessionRequest;

public abstract class fdjd extends wby implements fdje {
    public fdjd() {
        super("com.google.android.gms.wearable.internal.IWearableService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        fdiy fdiy4;
        fdiy fdiy3;
        fdiy fdiy2;
        fdiy fdiy1;
        fdiy fdiy0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface0 instanceof fdiy) ? ((fdiy)iInterface0) : new fdiw(iBinder0);
                }
                ConnectionConfiguration connectionConfiguration0 = (ConnectionConfiguration)wbz.a(parcel0, ConnectionConfiguration.CREATOR);
                fdjd.gr(parcel0);
                this.aX(fdiy0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface1 instanceof fdiy) ? ((fdiy)iInterface1) : new fdiw(iBinder1);
                }
                fdjd.gr(parcel0);
                this.M(fdiy0);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface2 instanceof fdiy) ? ((fdiy)iInterface2) : new fdiw(iBinder2);
                }
                fdjd.gr(parcel0);
                this.w(fdiy0);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface3 instanceof fdiy) ? ((fdiy)iInterface3) : new fdiw(iBinder3);
                }
                fdjd.gr(parcel0);
                this.o(fdiy0);
                break;
            }
            case 6: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface4 instanceof fdiy) ? ((fdiy)iInterface4) : new fdiw(iBinder4);
                }
                PutDataRequest putDataRequest0 = (PutDataRequest)wbz.a(parcel0, PutDataRequest.CREATOR);
                fdjd.gr(parcel0);
                this.av(fdiy0, putDataRequest0);
                break;
            }
            case 7: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface5 instanceof fdiy) ? ((fdiy)iInterface5) : new fdiw(iBinder5);
                }
                Uri uri0 = (Uri)wbz.a(parcel0, Uri.CREATOR);
                fdjd.gr(parcel0);
                this.P(fdiy0, uri0);
                break;
            }
            case 8: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface6 instanceof fdiy) ? ((fdiy)iInterface6) : new fdiw(iBinder6);
                }
                fdjd.gr(parcel0);
                this.Q(fdiy0);
                break;
            }
            case 9: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface7 instanceof fdiy) ? ((fdiy)iInterface7) : new fdiw(iBinder7);
                }
                Uri uri1 = (Uri)wbz.a(parcel0, Uri.CREATOR);
                fdjd.gr(parcel0);
                this.R(fdiy0, uri1);
                break;
            }
            case 11: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface8 instanceof fdiy) ? ((fdiy)iInterface8) : new fdiw(iBinder8);
                }
                Uri uri2 = (Uri)wbz.a(parcel0, Uri.CREATOR);
                fdjd.gr(parcel0);
                this.m(fdiy0, uri2);
                break;
            }
            case 12: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface9 instanceof fdiy) ? ((fdiy)iInterface9) : new fdiw(iBinder9);
                }
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                fdjd.gr(parcel0);
                this.aH(fdiy0, s, s1, arr_b);
                break;
            }
            case 13: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface10 instanceof fdiy) ? ((fdiy)iInterface10) : new fdiw(iBinder10);
                }
                Asset asset0 = (Asset)wbz.a(parcel0, Asset.CREATOR);
                fdjd.gr(parcel0);
                this.W(fdiy0, asset0);
                break;
            }
            case 14: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface11 instanceof fdiy) ? ((fdiy)iInterface11) : new fdiw(iBinder11);
                }
                fdjd.gr(parcel0);
                this.Y(fdiy0);
                break;
            }
            case 15: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface12 instanceof fdiy) ? ((fdiy)iInterface12) : new fdiw(iBinder12);
                }
                fdjd.gr(parcel0);
                this.O(fdiy0);
                break;
            }
            case 16: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface13 instanceof fdiy) ? ((fdiy)iInterface13) : new fdiw(iBinder13);
                }
                AddListenerRequest addListenerRequest0 = (AddListenerRequest)wbz.a(parcel0, AddListenerRequest.CREATOR);
                fdjd.gr(parcel0);
                this.d(fdiy0, addListenerRequest0);
                break;
            }
            case 17: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface14 instanceof fdiy) ? ((fdiy)iInterface14) : new fdiw(iBinder14);
                }
                RemoveListenerRequest removeListenerRequest0 = (RemoveListenerRequest)wbz.a(parcel0, RemoveListenerRequest.CREATOR);
                fdjd.gr(parcel0);
                this.aC(fdiy0, removeListenerRequest0);
                break;
            }
            case 18: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface15 instanceof fdiy) ? ((fdiy)iInterface15) : new fdiw(iBinder15);
                }
                fdjd.gr(parcel0);
                this.af(fdiy0);
                break;
            }
            case 19: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface16 instanceof fdiy) ? ((fdiy)iInterface16) : new fdiw(iBinder16);
                }
                fdjd.gr(parcel0);
                this.j(fdiy0);
                break;
            }
            case 20: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface17 instanceof fdiy) ? ((fdiy)iInterface17) : new fdiw(iBinder17);
                }
                ConnectionConfiguration connectionConfiguration1 = (ConnectionConfiguration)wbz.a(parcel0, ConnectionConfiguration.CREATOR);
                fdjd.gr(parcel0);
                this.au(fdiy0, connectionConfiguration1);
                break;
            }
            case 21: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface18 instanceof fdiy) ? ((fdiy)iInterface18) : new fdiw(iBinder18);
                }
                String s2 = parcel0.readString();
                fdjd.gr(parcel0);
                this.aB(fdiy0, s2);
                break;
            }
            case 22: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface19 instanceof fdiy) ? ((fdiy)iInterface19) : new fdiw(iBinder19);
                }
                fdjd.gr(parcel0);
                this.N(fdiy0);
                break;
            }
            case 23: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface20 instanceof fdiy) ? ((fdiy)iInterface20) : new fdiw(iBinder20);
                }
                String s3 = parcel0.readString();
                fdjd.gr(parcel0);
                this.x(fdiy0, s3);
                break;
            }
            case 24: {
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface21 instanceof fdiy) ? ((fdiy)iInterface21) : new fdiw(iBinder21);
                }
                String s4 = parcel0.readString();
                fdjd.gr(parcel0);
                this.p(fdiy0, s4);
                break;
            }
            case 25: {
                IBinder iBinder22 = parcel0.readStrongBinder();
                if(iBinder22 != null) {
                    IInterface iInterface22 = iBinder22.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface22 instanceof fdiy) ? ((fdiy)iInterface22) : new fdiw(iBinder22);
                }
                fdjd.gr(parcel0);
                this.y(fdiy0);
                break;
            }
            case 26: {
                IBinder iBinder23 = parcel0.readStrongBinder();
                if(iBinder23 != null) {
                    IInterface iInterface23 = iBinder23.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface23 instanceof fdiy) ? ((fdiy)iInterface23) : new fdiw(iBinder23);
                }
                fdjd.gr(parcel0);
                this.a(fdiy0);
                break;
            }
            case 27: {
                IBinder iBinder24 = parcel0.readStrongBinder();
                if(iBinder24 != null) {
                    IInterface iInterface24 = iBinder24.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface24 instanceof fdiy) ? ((fdiy)iInterface24) : new fdiw(iBinder24);
                }
                AncsNotificationParcelable ancsNotificationParcelable0 = (AncsNotificationParcelable)wbz.a(parcel0, AncsNotificationParcelable.CREATOR);
                fdjd.gr(parcel0);
                this.ak(fdiy0, ancsNotificationParcelable0);
                break;
            }
            case 28: {
                IBinder iBinder25 = parcel0.readStrongBinder();
                if(iBinder25 != null) {
                    IInterface iInterface25 = iBinder25.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface25 instanceof fdiy) ? ((fdiy)iInterface25) : new fdiw(iBinder25);
                }
                int v1 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.v(fdiy0, v1);
                break;
            }
            case 29: {
                IBinder iBinder26 = parcel0.readStrongBinder();
                if(iBinder26 != null) {
                    IInterface iInterface26 = iBinder26.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface26 instanceof fdiy) ? ((fdiy)iInterface26) : new fdiw(iBinder26);
                }
                int v2 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.q(fdiy0, v2);
                break;
            }
            case 30: {
                IBinder iBinder27 = parcel0.readStrongBinder();
                if(iBinder27 != null) {
                    IInterface iInterface27 = iBinder27.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface27 instanceof fdiy) ? ((fdiy)iInterface27) : new fdiw(iBinder27);
                }
                fdjd.gr(parcel0);
                this.aO(fdiy0);
                break;
            }
            case 0x1F: {
                IBinder iBinder28 = parcel0.readStrongBinder();
                if(iBinder28 != null) {
                    IInterface iInterface28 = iBinder28.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface28 instanceof fdiy) ? ((fdiy)iInterface28) : new fdiw(iBinder28);
                }
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                fdjd.gr(parcel0);
                this.ar(fdiy0, s5, s6);
                break;
            }
            case 0x20: {
                IBinder iBinder29 = parcel0.readStrongBinder();
                if(iBinder29 != null) {
                    IInterface iInterface29 = iBinder29.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface29 instanceof fdiy) ? ((fdiy)iInterface29) : new fdiw(iBinder29);
                }
                String s7 = parcel0.readString();
                fdjd.gr(parcel0);
                this.k(fdiy0, s7);
                break;
            }
            case 33: {
                IBinder iBinder30 = parcel0.readStrongBinder();
                if(iBinder30 != null) {
                    IInterface iInterface30 = iBinder30.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface30 instanceof fdiy) ? ((fdiy)iInterface30) : new fdiw(iBinder30);
                }
                String s8 = parcel0.readString();
                int v3 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.l(fdiy0, s8, v3);
                break;
            }
            case 34: {
                IBinder iBinder31 = parcel0.readStrongBinder();
                if(iBinder31 == null) {
                    fdiy1 = null;
                }
                else {
                    IInterface iInterface31 = iBinder31.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy1 = (iInterface31 instanceof fdiy) ? ((fdiy)iInterface31) : new fdiw(iBinder31);
                }
                IBinder iBinder32 = parcel0.readStrongBinder();
                if(iBinder32 != null) {
                    IInterface iInterface32 = iBinder32.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    fdiy0 = (iInterface32 instanceof fdir) ? ((fdir)iInterface32) : new fdir(iBinder32);
                }
                String s9 = parcel0.readString();
                fdjd.gr(parcel0);
                this.aY(fdiy1, ((fdir)fdiy0), s9);
                break;
            }
            case 35: {
                IBinder iBinder33 = parcel0.readStrongBinder();
                if(iBinder33 == null) {
                    fdiy2 = null;
                }
                else {
                    IInterface iInterface33 = iBinder33.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy2 = (iInterface33 instanceof fdiy) ? ((fdiy)iInterface33) : new fdiw(iBinder33);
                }
                IBinder iBinder34 = parcel0.readStrongBinder();
                if(iBinder34 != null) {
                    IInterface iInterface34 = iBinder34.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    fdiy0 = (iInterface34 instanceof fdir) ? ((fdir)iInterface34) : new fdir(iBinder34);
                }
                String s10 = parcel0.readString();
                fdjd.gr(parcel0);
                this.aZ(fdiy2, ((fdir)fdiy0), s10);
                break;
            }
            case 37: {
                IBinder iBinder35 = parcel0.readStrongBinder();
                if(iBinder35 != null) {
                    IInterface iInterface35 = iBinder35.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface35 instanceof fdiy) ? ((fdiy)iInterface35) : new fdiw(iBinder35);
                }
                fdjd.gr(parcel0);
                this.aS(fdiy0);
                break;
            }
            case 38: {
                IBinder iBinder36 = parcel0.readStrongBinder();
                if(iBinder36 != null) {
                    IInterface iInterface36 = iBinder36.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface36 instanceof fdiy) ? ((fdiy)iInterface36) : new fdiw(iBinder36);
                }
                String s11 = parcel0.readString();
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                fdjd.gr(parcel0);
                this.aW(fdiy0, s11, parcelFileDescriptor0);
                break;
            }
            case 39: {
                IBinder iBinder37 = parcel0.readStrongBinder();
                if(iBinder37 != null) {
                    IInterface iInterface37 = iBinder37.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface37 instanceof fdiy) ? ((fdiy)iInterface37) : new fdiw(iBinder37);
                }
                String s12 = parcel0.readString();
                ParcelFileDescriptor parcelFileDescriptor1 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                long v4 = parcel0.readLong();
                long v5 = parcel0.readLong();
                fdjd.gr(parcel0);
                this.aw(fdiy0, s12, parcelFileDescriptor1, v4, v5);
                break;
            }
            case 40: {
                IBinder iBinder38 = parcel0.readStrongBinder();
                if(iBinder38 != null) {
                    IInterface iInterface38 = iBinder38.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface38 instanceof fdiy) ? ((fdiy)iInterface38) : new fdiw(iBinder38);
                }
                Uri uri3 = (Uri)wbz.a(parcel0, Uri.CREATOR);
                int v6 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.S(fdiy0, uri3, v6);
                break;
            }
            case 41: {
                IBinder iBinder39 = parcel0.readStrongBinder();
                if(iBinder39 != null) {
                    IInterface iInterface39 = iBinder39.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface39 instanceof fdiy) ? ((fdiy)iInterface39) : new fdiw(iBinder39);
                }
                Uri uri4 = (Uri)wbz.a(parcel0, Uri.CREATOR);
                int v7 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.n(fdiy0, uri4, v7);
                break;
            }
            case 42: {
                IBinder iBinder40 = parcel0.readStrongBinder();
                if(iBinder40 != null) {
                    IInterface iInterface40 = iBinder40.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface40 instanceof fdiy) ? ((fdiy)iInterface40) : new fdiw(iBinder40);
                }
                String s13 = parcel0.readString();
                int v8 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.H(fdiy0, s13, v8);
                break;
            }
            case 43: {
                IBinder iBinder41 = parcel0.readStrongBinder();
                if(iBinder41 != null) {
                    IInterface iInterface41 = iBinder41.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface41 instanceof fdiy) ? ((fdiy)iInterface41) : new fdiw(iBinder41);
                }
                int v9 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.B(fdiy0, v9);
                break;
            }
            case 46: {
                IBinder iBinder42 = parcel0.readStrongBinder();
                if(iBinder42 != null) {
                    IInterface iInterface42 = iBinder42.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface42 instanceof fdiy) ? ((fdiy)iInterface42) : new fdiw(iBinder42);
                }
                String s14 = parcel0.readString();
                fdjd.gr(parcel0);
                this.e(fdiy0, s14);
                break;
            }
            case 0x2F: {
                IBinder iBinder43 = parcel0.readStrongBinder();
                if(iBinder43 != null) {
                    IInterface iInterface43 = iBinder43.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface43 instanceof fdiy) ? ((fdiy)iInterface43) : new fdiw(iBinder43);
                }
                String s15 = parcel0.readString();
                fdjd.gr(parcel0);
                this.aD(fdiy0, s15);
                break;
            }
            case 0x30: {
                IBinder iBinder44 = parcel0.readStrongBinder();
                if(iBinder44 != null) {
                    IInterface iInterface44 = iBinder44.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface44 instanceof fdiy) ? ((fdiy)iInterface44) : new fdiw(iBinder44);
                }
                boolean z = wbz.i(parcel0);
                fdjd.gr(parcel0);
                this.as(fdiy0, z);
                break;
            }
            case 49: {
                IBinder iBinder45 = parcel0.readStrongBinder();
                if(iBinder45 != null) {
                    IInterface iInterface45 = iBinder45.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface45 instanceof fdiy) ? ((fdiy)iInterface45) : new fdiw(iBinder45);
                }
                fdjd.gr(parcel0);
                this.I(fdiy0);
                break;
            }
            case 50: {
                IBinder iBinder46 = parcel0.readStrongBinder();
                if(iBinder46 != null) {
                    IInterface iInterface46 = iBinder46.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface46 instanceof fdiy) ? ((fdiy)iInterface46) : new fdiw(iBinder46);
                }
                boolean z1 = wbz.i(parcel0);
                fdjd.gr(parcel0);
                this.aL(fdiy0, z1);
                break;
            }
            case 51: {
                IBinder iBinder47 = parcel0.readStrongBinder();
                if(iBinder47 != null) {
                    IInterface iInterface47 = iBinder47.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface47 instanceof fdiy) ? ((fdiy)iInterface47) : new fdiw(iBinder47);
                }
                fdjd.gr(parcel0);
                this.K(fdiy0);
                break;
            }
            case 52: {
                IBinder iBinder48 = parcel0.readStrongBinder();
                if(iBinder48 != null) {
                    IInterface iInterface48 = iBinder48.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface48 instanceof fdiy) ? ((fdiy)iInterface48) : new fdiw(iBinder48);
                }
                fdjd.gr(parcel0);
                this.J(fdiy0);
                break;
            }
            case 53: {
                IBinder iBinder49 = parcel0.readStrongBinder();
                if(iBinder49 != null) {
                    IInterface iInterface49 = iBinder49.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface49 instanceof fdiy) ? ((fdiy)iInterface49) : new fdiw(iBinder49);
                }
                int v10 = parcel0.readByte();
                fdjd.gr(parcel0);
                this.aG(fdiy0, ((byte)v10));
                break;
            }
            case 58: {
                IBinder iBinder50 = parcel0.readStrongBinder();
                if(iBinder50 != null) {
                    IInterface iInterface50 = iBinder50.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface50 instanceof fdiy) ? ((fdiy)iInterface50) : new fdiw(iBinder50);
                }
                String s16 = parcel0.readString();
                String s17 = parcel0.readString();
                byte[] arr_b1 = parcel0.createByteArray();
                fdjd.gr(parcel0);
                this.aJ(fdiy0, s16, s17, arr_b1);
                break;
            }
            case 59: {
                IBinder iBinder51 = parcel0.readStrongBinder();
                if(iBinder51 != null) {
                    IInterface iInterface51 = iBinder51.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface51 instanceof fdiy) ? ((fdiy)iInterface51) : new fdiw(iBinder51);
                }
                String s18 = parcel0.readString();
                String s19 = parcel0.readString();
                byte[] arr_b2 = parcel0.createByteArray();
                MessageOptions messageOptions0 = (MessageOptions)wbz.a(parcel0, MessageOptions.CREATOR);
                fdjd.gr(parcel0);
                this.aI(fdiy0, s18, s19, arr_b2, messageOptions0);
                break;
            }
            case 60: {
                IBinder iBinder52 = parcel0.readStrongBinder();
                if(iBinder52 != null) {
                    IInterface iInterface52 = iBinder52.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface52 instanceof fdiy) ? ((fdiy)iInterface52) : new fdiw(iBinder52);
                }
                String s20 = parcel0.readString();
                String s21 = parcel0.readString();
                byte[] arr_b3 = parcel0.createByteArray();
                MessageOptions messageOptions1 = (MessageOptions)wbz.a(parcel0, MessageOptions.CREATOR);
                fdjd.gr(parcel0);
                this.aK(fdiy0, s20, s21, arr_b3, messageOptions1);
                break;
            }
            case 61: {
                IBinder iBinder53 = parcel0.readStrongBinder();
                if(iBinder53 != null) {
                    IInterface iInterface53 = iBinder53.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface53 instanceof fdiy) ? ((fdiy)iInterface53) : new fdiw(iBinder53);
                }
                int v11 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.T(fdiy0, v11);
                break;
            }
            case 62: {
                IBinder iBinder54 = parcel0.readStrongBinder();
                if(iBinder54 != null) {
                    IInterface iInterface54 = iBinder54.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface54 instanceof fdiy) ? ((fdiy)iInterface54) : new fdiw(iBinder54);
                }
                int v12 = parcel0.readInt();
                String s22 = parcel0.readString();
                fdjd.gr(parcel0);
                this.at(fdiy0, v12, s22);
                break;
            }
            case 0x3F: {
                IBinder iBinder55 = parcel0.readStrongBinder();
                if(iBinder55 != null) {
                    IInterface iInterface55 = iBinder55.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface55 instanceof fdiy) ? ((fdiy)iInterface55) : new fdiw(iBinder55);
                }
                String s23 = parcel0.readString();
                fdjd.gr(parcel0);
                this.L(fdiy0, s23);
                break;
            }
            case 0x40: {
                IBinder iBinder56 = parcel0.readStrongBinder();
                if(iBinder56 != null) {
                    IInterface iInterface56 = iBinder56.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface56 instanceof fdiy) ? ((fdiy)iInterface56) : new fdiw(iBinder56);
                }
                String s24 = parcel0.readString();
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                String s25 = parcel0.readString();
                String s26 = parcel0.readString();
                fdjd.gr(parcel0);
                this.g(fdiy0, s24, account0, s25, s26);
                break;
            }
            case 65: {
                IBinder iBinder57 = parcel0.readStrongBinder();
                if(iBinder57 != null) {
                    IInterface iInterface57 = iBinder57.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface57 instanceof fdiy) ? ((fdiy)iInterface57) : new fdiw(iBinder57);
                }
                fdjd.gr(parcel0);
                this.ah(fdiy0);
                break;
            }
            case 66: {
                IBinder iBinder58 = parcel0.readStrongBinder();
                if(iBinder58 != null) {
                    IInterface iInterface58 = iBinder58.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface58 instanceof fdiy) ? ((fdiy)iInterface58) : new fdiw(iBinder58);
                }
                AddAccountToConsentRequest addAccountToConsentRequest0 = (AddAccountToConsentRequest)wbz.a(parcel0, AddAccountToConsentRequest.CREATOR);
                fdjd.gr(parcel0);
                this.c(fdiy0, addAccountToConsentRequest0);
                break;
            }
            case 67: {
                IBinder iBinder59 = parcel0.readStrongBinder();
                if(iBinder59 != null) {
                    IInterface iInterface59 = iBinder59.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface59 instanceof fdiy) ? ((fdiy)iInterface59) : new fdiw(iBinder59);
                }
                String s27 = parcel0.readString();
                fdjd.gr(parcel0);
                this.Z(fdiy0, s27);
                break;
            }
            case 68: {
                IBinder iBinder60 = parcel0.readStrongBinder();
                if(iBinder60 != null) {
                    IInterface iInterface60 = iBinder60.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface60 instanceof fdiy) ? ((fdiy)iInterface60) : new fdiw(iBinder60);
                }
                AppRecommendationsRequest appRecommendationsRequest0 = (AppRecommendationsRequest)wbz.a(parcel0, AppRecommendationsRequest.CREATOR);
                fdjd.gr(parcel0);
                this.ab(fdiy0, appRecommendationsRequest0);
                break;
            }
            case 69: {
                IBinder iBinder61 = parcel0.readStrongBinder();
                if(iBinder61 != null) {
                    IInterface iInterface61 = iBinder61.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface61 instanceof fdiy) ? ((fdiy)iInterface61) : new fdiw(iBinder61);
                }
                String s28 = parcel0.readString();
                boolean z2 = wbz.i(parcel0);
                fdjd.gr(parcel0);
                this.aE(fdiy0, s28, z2);
                break;
            }
            case 70: {
                IBinder iBinder62 = parcel0.readStrongBinder();
                if(iBinder62 != null) {
                    IInterface iInterface62 = iBinder62.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface62 instanceof fdiy) ? ((fdiy)iInterface62) : new fdiw(iBinder62);
                }
                AddSupervisedAccountRequest addSupervisedAccountRequest0 = (AddSupervisedAccountRequest)wbz.a(parcel0, AddSupervisedAccountRequest.CREATOR);
                fdjd.gr(parcel0);
                this.f(fdiy0, addSupervisedAccountRequest0);
                break;
            }
            case 71: {
                IBinder iBinder63 = parcel0.readStrongBinder();
                if(iBinder63 != null) {
                    IInterface iInterface63 = iBinder63.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface63 instanceof fdiy) ? ((fdiy)iInterface63) : new fdiw(iBinder63);
                }
                PrivacyRecordOptinRequest privacyRecordOptinRequest0 = (PrivacyRecordOptinRequest)wbz.a(parcel0, PrivacyRecordOptinRequest.CREATOR);
                fdjd.gr(parcel0);
                this.ay(fdiy0, privacyRecordOptinRequest0);
                break;
            }
            case 72: {
                IBinder iBinder64 = parcel0.readStrongBinder();
                if(iBinder64 != null) {
                    IInterface iInterface64 = iBinder64.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface64 instanceof fdiy) ? ((fdiy)iInterface64) : new fdiw(iBinder64);
                }
                String s29 = parcel0.readString();
                int v13 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.aU(fdiy0, s29, v13);
                break;
            }
            case 73: {
                IBinder iBinder65 = parcel0.readStrongBinder();
                if(iBinder65 != null) {
                    IInterface iInterface65 = iBinder65.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface65 instanceof fdiy) ? ((fdiy)iInterface65) : new fdiw(iBinder65);
                }
                fdjd.gr(parcel0);
                this.ac(fdiy0);
                break;
            }
            case 74: {
                IBinder iBinder66 = parcel0.readStrongBinder();
                if(iBinder66 != null) {
                    IInterface iInterface66 = iBinder66.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface66 instanceof fdiy) ? ((fdiy)iInterface66) : new fdiw(iBinder66);
                }
                ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration)wbz.a(parcel0, ConnectionConfiguration.CREATOR);
                fdjd.gr(parcel0);
                this.aT(fdiy0, connectionConfiguration2);
                break;
            }
            case 75: {
                IBinder iBinder67 = parcel0.readStrongBinder();
                if(iBinder67 != null) {
                    IInterface iInterface67 = iBinder67.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface67 instanceof fdiy) ? ((fdiy)iInterface67) : new fdiw(iBinder67);
                }
                String s30 = parcel0.readString();
                boolean z3 = wbz.i(parcel0);
                fdjd.gr(parcel0);
                this.aM(fdiy0, s30, z3);
                break;
            }
            case 76: {
                IBinder iBinder68 = parcel0.readStrongBinder();
                if(iBinder68 != null) {
                    IInterface iInterface68 = iBinder68.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface68 instanceof fdiy) ? ((fdiy)iInterface68) : new fdiw(iBinder68);
                }
                ConnectionConfiguration connectionConfiguration3 = (ConnectionConfiguration)wbz.a(parcel0, ConnectionConfiguration.CREATOR);
                fdjd.gr(parcel0);
                this.i(fdiy0, connectionConfiguration3);
                break;
            }
            case 77: {
                IBinder iBinder69 = parcel0.readStrongBinder();
                if(iBinder69 != null) {
                    IInterface iInterface69 = iBinder69.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface69 instanceof fdiy) ? ((fdiy)iInterface69) : new fdiw(iBinder69);
                }
                AppTheme appTheme0 = (AppTheme)wbz.a(parcel0, AppTheme.CREATOR);
                fdjd.gr(parcel0);
                this.aN(fdiy0, appTheme0);
                break;
            }
            case 78: {
                IBinder iBinder70 = parcel0.readStrongBinder();
                if(iBinder70 != null) {
                    IInterface iInterface70 = iBinder70.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface70 instanceof fdiy) ? ((fdiy)iInterface70) : new fdiw(iBinder70);
                }
                String s31 = parcel0.readString();
                fdjd.gr(parcel0);
                this.C(fdiy0, s31);
                break;
            }
            case 0x4F: {
                IBinder iBinder71 = parcel0.readStrongBinder();
                if(iBinder71 != null) {
                    IInterface iInterface71 = iBinder71.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface71 instanceof fdiy) ? ((fdiy)iInterface71) : new fdiw(iBinder71);
                }
                String s32 = parcel0.readString();
                fdjd.gr(parcel0);
                this.E(fdiy0, s32);
                break;
            }
            case 80: {
                IBinder iBinder72 = parcel0.readStrongBinder();
                if(iBinder72 != null) {
                    IInterface iInterface72 = iBinder72.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface72 instanceof fdiy) ? ((fdiy)iInterface72) : new fdiw(iBinder72);
                }
                fdjd.gr(parcel0);
                this.ae(fdiy0);
                break;
            }
            case 82: {
                IBinder iBinder73 = parcel0.readStrongBinder();
                if(iBinder73 != null) {
                    IInterface iInterface73 = iBinder73.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface73 instanceof fdiy) ? ((fdiy)iInterface73) : new fdiw(iBinder73);
                }
                StartRestoreSessionRequest startRestoreSessionRequest0 = (StartRestoreSessionRequest)wbz.a(parcel0, StartRestoreSessionRequest.CREATOR);
                fdjd.gr(parcel0);
                this.aP(fdiy0, startRestoreSessionRequest0);
                break;
            }
            case 84: {
                IBinder iBinder74 = parcel0.readStrongBinder();
                if(iBinder74 != null) {
                    IInterface iInterface74 = iBinder74.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface74 instanceof fdiy) ? ((fdiy)iInterface74) : new fdiw(iBinder74);
                }
                fdjd.gr(parcel0);
                this.az(fdiy0);
                break;
            }
            case 85: {
                IBinder iBinder75 = parcel0.readStrongBinder();
                if(iBinder75 != null) {
                    IInterface iInterface75 = iBinder75.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface75 instanceof fdiy) ? ((fdiy)iInterface75) : new fdiw(iBinder75);
                }
                fdjd.gr(parcel0);
                this.aa(fdiy0);
                break;
            }
            case 86: {
                IBinder iBinder76 = parcel0.readStrongBinder();
                if(iBinder76 != null) {
                    IInterface iInterface76 = iBinder76.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface76 instanceof fdiy) ? ((fdiy)iInterface76) : new fdiw(iBinder76);
                }
                SaveRestoreStateRequest saveRestoreStateRequest0 = (SaveRestoreStateRequest)wbz.a(parcel0, SaveRestoreStateRequest.CREATOR);
                fdjd.gr(parcel0);
                this.aF(fdiy0, saveRestoreStateRequest0);
                break;
            }
            case 87: {
                IBinder iBinder77 = parcel0.readStrongBinder();
                if(iBinder77 != null) {
                    IInterface iInterface77 = iBinder77.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface77 instanceof fdiy) ? ((fdiy)iInterface77) : new fdiw(iBinder77);
                }
                GetRestoreStateRequest getRestoreStateRequest0 = (GetRestoreStateRequest)wbz.a(parcel0, GetRestoreStateRequest.CREATOR);
                fdjd.gr(parcel0);
                this.ad(fdiy0, getRestoreStateRequest0);
                break;
            }
            case 88: {
                IBinder iBinder78 = parcel0.readStrongBinder();
                if(iBinder78 != null) {
                    IInterface iInterface78 = iBinder78.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface78 instanceof fdiy) ? ((fdiy)iInterface78) : new fdiw(iBinder78);
                }
                String s33 = parcel0.readString();
                String s34 = parcel0.readString();
                fdjd.gr(parcel0);
                this.aR(fdiy0, s33, s34);
                break;
            }
            case 89: {
                IBinder iBinder79 = parcel0.readStrongBinder();
                if(iBinder79 != null) {
                    IInterface iInterface79 = iBinder79.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface79 instanceof fdiy) ? ((fdiy)iInterface79) : new fdiw(iBinder79);
                }
                String s35 = parcel0.readString();
                fdjd.gr(parcel0);
                this.aQ(fdiy0, s35);
                break;
            }
            case 90: {
                IBinder iBinder80 = parcel0.readStrongBinder();
                if(iBinder80 != null) {
                    IInterface iInterface80 = iBinder80.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface80 instanceof fdiy) ? ((fdiy)iInterface80) : new fdiw(iBinder80);
                }
                String s36 = parcel0.readString();
                fdjd.gr(parcel0);
                this.al(fdiy0, s36);
                break;
            }
            case 91: {
                IBinder iBinder81 = parcel0.readStrongBinder();
                if(iBinder81 != null) {
                    IInterface iInterface81 = iBinder81.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface81 instanceof fdiy) ? ((fdiy)iInterface81) : new fdiw(iBinder81);
                }
                String s37 = parcel0.readString();
                fdjd.gr(parcel0);
                this.D(fdiy0, s37);
                break;
            }
            case 92: {
                IBinder iBinder82 = parcel0.readStrongBinder();
                if(iBinder82 != null) {
                    IInterface iInterface82 = iBinder82.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface82 instanceof fdiy) ? ((fdiy)iInterface82) : new fdiw(iBinder82);
                }
                fdjd.gr(parcel0);
                this.V(fdiy0);
                break;
            }
            case 93: {
                IBinder iBinder83 = parcel0.readStrongBinder();
                if(iBinder83 != null) {
                    IInterface iInterface83 = iBinder83.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface83 instanceof fdiy) ? ((fdiy)iInterface83) : new fdiw(iBinder83);
                }
                String s38 = parcel0.readString();
                fdjd.gr(parcel0);
                this.h(fdiy0, s38);
                break;
            }
            case 94: {
                IBinder iBinder84 = parcel0.readStrongBinder();
                if(iBinder84 != null) {
                    IInterface iInterface84 = iBinder84.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface84 instanceof fdiy) ? ((fdiy)iInterface84) : new fdiw(iBinder84);
                }
                AcceptTermsRequest acceptTermsRequest0 = (AcceptTermsRequest)wbz.a(parcel0, AcceptTermsRequest.CREATOR);
                fdjd.gr(parcel0);
                this.b(fdiy0, acceptTermsRequest0);
                break;
            }
            case 0x5F: {
                IBinder iBinder85 = parcel0.readStrongBinder();
                if(iBinder85 != null) {
                    IInterface iInterface85 = iBinder85.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface85 instanceof fdiy) ? ((fdiy)iInterface85) : new fdiw(iBinder85);
                }
                RecordTermConsentRequest recordTermConsentRequest0 = (RecordTermConsentRequest)wbz.a(parcel0, RecordTermConsentRequest.CREATOR);
                fdjd.gr(parcel0);
                this.aA(fdiy0, recordTermConsentRequest0);
                break;
            }
            case 0x60: {
                IBinder iBinder86 = parcel0.readStrongBinder();
                if(iBinder86 != null) {
                    IInterface iInterface86 = iBinder86.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface86 instanceof fdiy) ? ((fdiy)iInterface86) : new fdiw(iBinder86);
                }
                int v14 = parcel0.readInt();
                fdjd.gr(parcel0);
                this.ag(fdiy0, v14);
                break;
            }
            case 97: {
                IBinder iBinder87 = parcel0.readStrongBinder();
                if(iBinder87 != null) {
                    IInterface iInterface87 = iBinder87.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface87 instanceof fdiy) ? ((fdiy)iInterface87) : new fdiw(iBinder87);
                }
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                fdjd.gr(parcel0);
                this.U(fdiy0, account1);
                break;
            }
            case 101: {
                IBinder iBinder88 = parcel0.readStrongBinder();
                if(iBinder88 != null) {
                    IInterface iInterface88 = iBinder88.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface88 instanceof fdiy) ? ((fdiy)iInterface88) : new fdiw(iBinder88);
                }
                ConnectionDelayConfig connectionDelayConfig0 = (ConnectionDelayConfig)wbz.a(parcel0, ConnectionDelayConfig.CREATOR);
                fdjd.gr(parcel0);
                this.aV(fdiy0, connectionDelayConfig0);
                break;
            }
            case 102: {
                IBinder iBinder89 = parcel0.readStrongBinder();
                if(iBinder89 != null) {
                    IInterface iInterface89 = iBinder89.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface89 instanceof fdiy) ? ((fdiy)iInterface89) : new fdiw(iBinder89);
                }
                String s39 = parcel0.readString();
                fdjd.gr(parcel0);
                this.aq(fdiy0, s39);
                break;
            }
            case 103: {
                IBinder iBinder90 = parcel0.readStrongBinder();
                if(iBinder90 != null) {
                    IInterface iInterface90 = iBinder90.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface90 instanceof fdiy) ? ((fdiy)iInterface90) : new fdiw(iBinder90);
                }
                String s40 = parcel0.readString();
                fdjd.gr(parcel0);
                this.z(fdiy0, s40);
                break;
            }
            case 104: {
                IBinder iBinder91 = parcel0.readStrongBinder();
                if(iBinder91 != null) {
                    IInterface iInterface91 = iBinder91.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface91 instanceof fdiy) ? ((fdiy)iInterface91) : new fdiw(iBinder91);
                }
                ConsentStatusRequest consentStatusRequest0 = (ConsentStatusRequest)wbz.a(parcel0, ConsentStatusRequest.CREATOR);
                fdjd.gr(parcel0);
                this.ai(fdiy0, consentStatusRequest0);
                break;
            }
            case 105: {
                IBinder iBinder92 = parcel0.readStrongBinder();
                if(iBinder92 != null) {
                    IInterface iInterface92 = iBinder92.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface92 instanceof fdiy) ? ((fdiy)iInterface92) : new fdiw(iBinder92);
                }
                RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest0 = (RecordUntetheredSupervisedAccountTransferRequest)wbz.a(parcel0, RecordUntetheredSupervisedAccountTransferRequest.CREATOR);
                fdjd.gr(parcel0);
                this.ax(fdiy0, recordUntetheredSupervisedAccountTransferRequest0);
                break;
            }
            case 106: {
                IBinder iBinder93 = parcel0.readStrongBinder();
                if(iBinder93 != null) {
                    IInterface iInterface93 = iBinder93.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface93 instanceof fdiy) ? ((fdiy)iInterface93) : new fdiw(iBinder93);
                }
                LogCounterRequest logCounterRequest0 = (LogCounterRequest)wbz.a(parcel0, LogCounterRequest.CREATOR);
                fdjd.gr(parcel0);
                this.an(fdiy0, logCounterRequest0);
                break;
            }
            case 107: {
                IBinder iBinder94 = parcel0.readStrongBinder();
                if(iBinder94 != null) {
                    IInterface iInterface94 = iBinder94.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface94 instanceof fdiy) ? ((fdiy)iInterface94) : new fdiw(iBinder94);
                }
                LogEventRequest logEventRequest0 = (LogEventRequest)wbz.a(parcel0, LogEventRequest.CREATOR);
                fdjd.gr(parcel0);
                this.ao(fdiy0, logEventRequest0);
                break;
            }
            case 108: {
                IBinder iBinder95 = parcel0.readStrongBinder();
                if(iBinder95 != null) {
                    IInterface iInterface95 = iBinder95.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface95 instanceof fdiy) ? ((fdiy)iInterface95) : new fdiw(iBinder95);
                }
                LogTimerRequest logTimerRequest0 = (LogTimerRequest)wbz.a(parcel0, LogTimerRequest.CREATOR);
                fdjd.gr(parcel0);
                this.ap(fdiy0, logTimerRequest0);
                break;
            }
            case 109: {
                IBinder iBinder96 = parcel0.readStrongBinder();
                if(iBinder96 != null) {
                    IInterface iInterface96 = iBinder96.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface96 instanceof fdiy) ? ((fdiy)iInterface96) : new fdiw(iBinder96);
                }
                fdjd.gr(parcel0);
                this.A(fdiy0);
                break;
            }
            case 110: {
                IBinder iBinder97 = parcel0.readStrongBinder();
                if(iBinder97 != null) {
                    IInterface iInterface97 = iBinder97.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface97 instanceof fdiy) ? ((fdiy)iInterface97) : new fdiw(iBinder97);
                }
                AppTheme appTheme1 = (AppTheme)wbz.a(parcel0, AppTheme.CREATOR);
                fdjd.gr(parcel0);
                this.G(fdiy0, appTheme1);
                break;
            }
            case 0x6F: {
                IBinder iBinder98 = parcel0.readStrongBinder();
                if(iBinder98 != null) {
                    IInterface iInterface98 = iBinder98.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface98 instanceof fdiy) ? ((fdiy)iInterface98) : new fdiw(iBinder98);
                }
                String s41 = parcel0.readString();
                fdjd.gr(parcel0);
                this.am(fdiy0, s41);
                break;
            }
            case 0x70: {
                IBinder iBinder99 = parcel0.readStrongBinder();
                if(iBinder99 == null) {
                    fdiy3 = null;
                }
                else {
                    IInterface iInterface99 = iBinder99.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy3 = (iInterface99 instanceof fdiy) ? ((fdiy)iInterface99) : new fdiw(iBinder99);
                }
                RequestConnectionParcelable requestConnectionParcelable0 = (RequestConnectionParcelable)wbz.a(parcel0, RequestConnectionParcelable.CREATOR);
                IBinder iBinder100 = parcel0.readStrongBinder();
                if(iBinder100 != null) {
                    IInterface iInterface100 = iBinder100.queryLocalInterface("com.google.android.gms.wearable.internal.IConnectionCallback");
                    fdiy0 = (iInterface100 instanceof fdis) ? ((fdis)iInterface100) : new fdis(iBinder100);
                }
                fdjd.gr(parcel0);
                this.bb(fdiy3, requestConnectionParcelable0, ((fdis)fdiy0));
                break;
            }
            case 0x71: {
                IBinder iBinder101 = parcel0.readStrongBinder();
                if(iBinder101 == null) {
                    fdiy4 = null;
                }
                else {
                    IInterface iInterface101 = iBinder101.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy4 = (iInterface101 instanceof fdiy) ? ((fdiy)iInterface101) : new fdiw(iBinder101);
                }
                IBinder iBinder102 = parcel0.readStrongBinder();
                if(iBinder102 != null) {
                    IInterface iInterface102 = iBinder102.queryLocalInterface("com.google.android.gms.wearable.internal.IConnectionCallback");
                    fdiy0 = (iInterface102 instanceof fdis) ? ((fdis)iInterface102) : new fdis(iBinder102);
                }
                fdjd.gr(parcel0);
                this.ba(fdiy4, ((fdis)fdiy0));
                break;
            }
            case 0x72: {
                IBinder iBinder103 = parcel0.readStrongBinder();
                if(iBinder103 != null) {
                    IInterface iInterface103 = iBinder103.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface103 instanceof fdiy) ? ((fdiy)iInterface103) : new fdiw(iBinder103);
                }
                FetchBackupRequest fetchBackupRequest0 = (FetchBackupRequest)wbz.a(parcel0, FetchBackupRequest.CREATOR);
                fdjd.gr(parcel0);
                this.aj(fdiy0, fetchBackupRequest0);
                break;
            }
            case 0x73: {
                IBinder iBinder104 = parcel0.readStrongBinder();
                if(iBinder104 != null) {
                    IInterface iInterface104 = iBinder104.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface104 instanceof fdiy) ? ((fdiy)iInterface104) : new fdiw(iBinder104);
                }
                FetchBackupRequest fetchBackupRequest1 = (FetchBackupRequest)wbz.a(parcel0, FetchBackupRequest.CREATOR);
                fdjd.gr(parcel0);
                this.F(fdiy0, fetchBackupRequest1);
                break;
            }
            case 0x74: {
                IBinder iBinder105 = parcel0.readStrongBinder();
                if(iBinder105 != null) {
                    IInterface iInterface105 = iBinder105.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    fdiy0 = (iInterface105 instanceof fdiy) ? ((fdiy)iInterface105) : new fdiw(iBinder105);
                }
                fdjd.gr(parcel0);
                this.X(fdiy0);
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

