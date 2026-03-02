import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gril.CallKpi;
import com.google.android.gril.CongestionStatus;
import com.google.android.gril.ImsCallInfo;
import com.google.android.gril.ImsCallModification;
import com.google.android.gril.ImsCallRing;
import com.google.android.gril.LastCallFailCause;
import com.google.android.gril.MarginalCoverageInfo;
import com.google.android.gril.RadioIssue;
import com.google.android.gril.RadioLinkConditionInfo;
import com.google.android.gril.RegistrationStatus;
import com.google.android.gril.RtpQualityEvent;
import com.google.android.gril.TrafficStatsIndication;
import j..util.Objects;

public final class fftf extends wby implements IInterface {
    final ffsr a;

    public fftf() {
        super("com.google.android.grilservice.IGRilListener");
    }

    public fftf(ffsr ffsr0) {
        Objects.requireNonNull(ffsr0);
        this.a = ffsr0;
        super("com.google.android.grilservice.IGRilListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0;
        switch(v) {
            case 1: {
                parcel0.readInt();
                fftf.gr(parcel0);
                object0 = this.a.c;
                synchronized(object0) {
                    object0.notifyAll();
                }
                return true;
            }
            case 2: {
                return true;
            }
            case 3: {
                RadioIssue radioIssue0 = (RadioIssue)wbz.a(parcel0, RadioIssue.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 4: {
                parcel0.readInt();
                fftf.gr(parcel0);
                return true;
            }
            case 5: {
                TrafficStatsIndication trafficStatsIndication0 = (TrafficStatsIndication)wbz.a(parcel0, TrafficStatsIndication.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 6: {
                parcel0.readInt();
                fftf.gr(parcel0);
                return true;
            }
            case 7: {
                parcel0.readInt();
                fftf.gr(parcel0);
                return true;
            }
            case 8: {
                CongestionStatus congestionStatus0 = (CongestionStatus)wbz.a(parcel0, CongestionStatus.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 9: {
                MarginalCoverageInfo marginalCoverageInfo0 = (MarginalCoverageInfo)wbz.a(parcel0, MarginalCoverageInfo.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 10: {
                RadioLinkConditionInfo radioLinkConditionInfo0 = (RadioLinkConditionInfo)wbz.a(parcel0, RadioLinkConditionInfo.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 11: {
                CallKpi callKpi0 = (CallKpi)wbz.a(parcel0, CallKpi.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 12: {
                wbz.i(parcel0);
                fftf.gr(parcel0);
                return true;
            }
            case 13: {
                LastCallFailCause lastCallFailCause0 = (LastCallFailCause)wbz.a(parcel0, LastCallFailCause.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 14: {
                ImsCallInfo imsCallInfo0 = (ImsCallInfo)wbz.a(parcel0, ImsCallInfo.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 15: {
                RtpQualityEvent rtpQualityEvent0 = (RtpQualityEvent)wbz.a(parcel0, RtpQualityEvent.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 16: {
                ImsCallModification imsCallModification0 = (ImsCallModification)wbz.a(parcel0, ImsCallModification.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 17: {
                ImsCallRing imsCallRing0 = (ImsCallRing)wbz.a(parcel0, ImsCallRing.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            case 18: {
                RegistrationStatus registrationStatus0 = (RegistrationStatus)wbz.a(parcel0, RegistrationStatus.CREATOR);
                fftf.gr(parcel0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

