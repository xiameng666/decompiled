import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.aidlrequests.ApplyActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangePasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CheckActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ConfirmPasswordResetAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CreateUserWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.DeleteAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetAccessTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetProvidersForEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkEmailAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkPhoneAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ReloadAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendEmailVerificationWithSettingsAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendGetOobConfirmationCodeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendVerificationCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SetFirebaseUiVersionAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInAnonymouslyAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCustomTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailLinkAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithPhoneNumberAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnenrollMfaAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkEmailCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UpdateProfileAidlRequest;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public final class goxh extends wby implements IInterface, cjug {
    private final String a;
    private final String b;
    private final goxi c;
    private final cjts d;
    private final baun e;

    public goxh() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    public goxh(String s, String s1, goxi goxi0, cjts cjts0, Context context0) {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        batl.q(s);
        this.a = s;
        batl.q(s1);
        this.b = s1;
        this.c = goxi0;
        this.d = cjts0;
        this.e = new baun("FirebaseAuth", new String[0]);
        gqig.a(context0);
    }

    public final void A(LinkPhoneAuthCredentialAidlRequest linkPhoneAuthCredentialAidlRequest0, goxg goxg0) {
        batl.s(linkPhoneAuthCredentialAidlRequest0);
        batl.q(linkPhoneAuthCredentialAidlRequest0.a);
        batl.s(linkPhoneAuthCredentialAidlRequest0.b);
        gouo gouo0 = new gouo(this.a, this.b, this.c, linkPhoneAuthCredentialAidlRequest0.a, linkPhoneAuthCredentialAidlRequest0.b, goxg0);
        this.d.b(gouo0);
    }

    @Deprecated
    public final void B(String s, goxg goxg0) {
        this.C(new ReloadAidlRequest(s), goxg0);
    }

    public final void C(ReloadAidlRequest reloadAidlRequest0, goxg goxg0) {
        batl.s(reloadAidlRequest0);
        batl.q(reloadAidlRequest0.a);
        goup goup0 = new goup(this.a, this.b, this.c, reloadAidlRequest0.a, goxg0);
        this.d.b(goup0);
    }

    @Deprecated
    public final void D(String s, ActionCodeSettings actionCodeSettings0, goxg goxg0) {
        this.E(new SendEmailVerificationWithSettingsAidlRequest(s, actionCodeSettings0), goxg0);
    }

    public final void E(SendEmailVerificationWithSettingsAidlRequest sendEmailVerificationWithSettingsAidlRequest0, goxg goxg0) {
        batl.s(sendEmailVerificationWithSettingsAidlRequest0);
        batl.q(sendEmailVerificationWithSettingsAidlRequest0.a);
        gouq gouq0 = new gouq(this.a, this.b, this.c, sendEmailVerificationWithSettingsAidlRequest0.a, sendEmailVerificationWithSettingsAidlRequest0.b, goxg0);
        this.d.b(gouq0);
    }

    @Deprecated
    public final void H(String s, ActionCodeSettings actionCodeSettings0, goxg goxg0) {
        this.I(new SendGetOobConfirmationCodeEmailAidlRequest(s, actionCodeSettings0, null), goxg0);
    }

    public final void I(SendGetOobConfirmationCodeEmailAidlRequest sendGetOobConfirmationCodeEmailAidlRequest0, goxg goxg0) {
        batl.q(sendGetOobConfirmationCodeEmailAidlRequest0.a);
        batl.s(sendGetOobConfirmationCodeEmailAidlRequest0.b);
        gour gour0 = new gour(this.a, this.b, this.c, sendGetOobConfirmationCodeEmailAidlRequest0.a, sendGetOobConfirmationCodeEmailAidlRequest0.b, sendGetOobConfirmationCodeEmailAidlRequest0.c, goxg0);
        this.d.b(gour0);
    }

    @Deprecated
    public final void J(String s, ActionCodeSettings actionCodeSettings0, goxg goxg0) {
        if(actionCodeSettings0 == null) {
            actionCodeSettings0 = new ActionCodeSettings();
        }
        actionCodeSettings0.i = gqqm.b.p;
        this.H(s, actionCodeSettings0, goxg0);
    }

    @Deprecated
    public final void K(SendVerificationCodeRequest sendVerificationCodeRequest0, goxg goxg0) {
        this.L(new SendVerificationCodeAidlRequest(sendVerificationCodeRequest0), goxg0);
    }

    public final void L(SendVerificationCodeAidlRequest sendVerificationCodeAidlRequest0, goxg goxg0) {
        batl.s(sendVerificationCodeAidlRequest0);
        batl.s(sendVerificationCodeAidlRequest0.a);
        goxh.Z(sendVerificationCodeAidlRequest0.a.b);
        SendVerificationCodeRequest sendVerificationCodeRequest0 = new SendVerificationCodeRequest(goxh.Y(sendVerificationCodeAidlRequest0.a.a), sendVerificationCodeAidlRequest0.a.b, sendVerificationCodeAidlRequest0.a.c, sendVerificationCodeAidlRequest0.a.d, sendVerificationCodeAidlRequest0.a.e, null);
        govg govg0 = new govg(this.a, this.b, this.c, sendVerificationCodeRequest0, goxg0);
        this.d.b(govg0);
    }

    @Deprecated
    public final void M(String s, goxg goxg0) {
        this.N(new SetFirebaseUiVersionAidlRequest(s), goxg0);
    }

    public final void N(SetFirebaseUiVersionAidlRequest setFirebaseUiVersionAidlRequest0, goxg goxg0) {
        batl.s(setFirebaseUiVersionAidlRequest0);
        gous gous0 = new gous(this.a, this.b, this.c, setFirebaseUiVersionAidlRequest0.a, goxg0);
        this.d.b(gous0);
    }

    @Deprecated
    public final void O(goxg goxg0) {
        this.P(new SignInAnonymouslyAidlRequest(null), goxg0);
    }

    public final void P(SignInAnonymouslyAidlRequest signInAnonymouslyAidlRequest0, goxg goxg0) {
        batl.s(signInAnonymouslyAidlRequest0);
        gout gout0 = new gout(this.a, this.b, this.c, signInAnonymouslyAidlRequest0.a, goxg0);
        this.d.b(gout0);
    }

    public final void Q(SignInWithCredentialAidlRequest signInWithCredentialAidlRequest0, goxg goxg0) {
        batl.s(signInWithCredentialAidlRequest0);
        batl.s(signInWithCredentialAidlRequest0.a);
        gouu gouu0 = new gouu(this.a, this.b, this.c, signInWithCredentialAidlRequest0.a, goxg0);
        this.d.b(gouu0);
    }

    public final void R(SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest0, goxg goxg0) {
        batl.s(signInWithCustomTokenAidlRequest0);
        batl.q(signInWithCustomTokenAidlRequest0.a);
        gouv gouv0 = new gouv(this.a, this.b, this.c, signInWithCustomTokenAidlRequest0, goxg0);
        this.d.b(gouv0);
    }

    public final void S(SignInWithEmailAndPasswordAidlRequest signInWithEmailAndPasswordAidlRequest0, goxg goxg0) {
        batl.s(signInWithEmailAndPasswordAidlRequest0);
        batl.q(signInWithEmailAndPasswordAidlRequest0.a);
        batl.q(signInWithEmailAndPasswordAidlRequest0.b);
        gouw gouw0 = new gouw(this.a, this.b, this.c, signInWithEmailAndPasswordAidlRequest0.a, signInWithEmailAndPasswordAidlRequest0.b, signInWithEmailAndPasswordAidlRequest0.c, goxg0);
        this.d.b(gouw0);
    }

    public final void T(SignInWithEmailLinkAidlRequest signInWithEmailLinkAidlRequest0, goxg goxg0) {
        batl.s(signInWithEmailLinkAidlRequest0);
        batl.s(signInWithEmailLinkAidlRequest0.a);
        goux goux0 = new goux(this.a, this.b, this.c, signInWithEmailLinkAidlRequest0.a, goxg0);
        this.d.b(goux0);
    }

    public final void U(SignInWithPhoneNumberAidlRequest signInWithPhoneNumberAidlRequest0, goxg goxg0) {
        batl.s(signInWithPhoneNumberAidlRequest0);
        batl.s(signInWithPhoneNumberAidlRequest0.a);
        gouy gouy0 = new gouy(this.a, this.b, this.c, signInWithPhoneNumberAidlRequest0.a, signInWithPhoneNumberAidlRequest0.b, goxg0);
        this.d.b(gouy0);
    }

    public final void V(UnlinkEmailCredentialAidlRequest unlinkEmailCredentialAidlRequest0, goxg goxg0) {
        batl.s(unlinkEmailCredentialAidlRequest0);
        batl.q(unlinkEmailCredentialAidlRequest0.a);
        gova gova0 = new gova(this.a, this.b, this.c, unlinkEmailCredentialAidlRequest0.a, goxg0);
        this.d.b(gova0);
    }

    public final void W(UnlinkFederatedCredentialAidlRequest unlinkFederatedCredentialAidlRequest0, goxg goxg0) {
        batl.s(unlinkFederatedCredentialAidlRequest0);
        batl.q(unlinkFederatedCredentialAidlRequest0.a);
        batl.q(unlinkFederatedCredentialAidlRequest0.b);
        govb govb0 = new govb(this.a, this.b, this.c, unlinkFederatedCredentialAidlRequest0.a, unlinkFederatedCredentialAidlRequest0.b, goxg0);
        this.d.b(govb0);
    }

    public final void X(UpdateProfileAidlRequest updateProfileAidlRequest0, goxg goxg0) {
        batl.s(updateProfileAidlRequest0);
        batl.q(updateProfileAidlRequest0.b);
        batl.s(updateProfileAidlRequest0.a);
        govc govc0 = new govc(this.a, this.b, this.c, updateProfileAidlRequest0.b, updateProfileAidlRequest0.a, goxg0);
        this.d.b(govc0);
    }

    private static String Y(String s) {
        String s1 = null;
        String s2 = TextUtils.isEmpty(null) ? "ZZ" : null;
        try {
            gqju gqju0 = gqiv.e().f(s, gqgf.b(s2));
            s1 = gqiv.e().q(gqju0, 1);
        }
        catch(gqim unused_ex) {
        }
        return TextUtils.isEmpty(s1) ? s : s1;
    }

    private static void Z(long v) {
        if(v >= 0L && v <= 120L) {
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }

    @Deprecated
    public final void a(String s, goxg goxg0) {
        this.c(new ApplyActionCodeAidlRequest(s, null), goxg0);
    }

    public final void c(ApplyActionCodeAidlRequest applyActionCodeAidlRequest0, goxg goxg0) {
        batl.s(applyActionCodeAidlRequest0);
        batl.q(applyActionCodeAidlRequest0.a);
        goub goub0 = new goub(this.a, this.b, this.c, applyActionCodeAidlRequest0.a, applyActionCodeAidlRequest0.b, goxg0);
        this.d.b(goub0);
    }

    @Deprecated
    public final void d(String s, String s1, goxg goxg0) {
        this.e(new ChangeEmailAidlRequest(s, s1), goxg0);
    }

    public final void e(ChangeEmailAidlRequest changeEmailAidlRequest0, goxg goxg0) {
        batl.s(changeEmailAidlRequest0);
        batl.q(changeEmailAidlRequest0.a);
        batl.q(changeEmailAidlRequest0.b);
        gouc gouc0 = new gouc(this.a, this.b, this.c, changeEmailAidlRequest0.a, changeEmailAidlRequest0.b, goxg0);
        this.d.b(gouc0);
    }

    @Deprecated
    public final void f(String s, String s1, goxg goxg0) {
        this.g(new ChangePasswordAidlRequest(s, s1), goxg0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        goxg goxg5;
        goxg goxg4;
        goxg goxg3;
        goxg goxg2;
        goxg goxg1;
        goxg goxg0 = null;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface0 instanceof goxg) ? ((goxg)iInterface0) : new goxg(iBinder0);
                }
                goxh.gr(parcel0);
                this.r(s, goxg0);
                break;
            }
            case 2: {
                String s1 = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    goxg1 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg1 = (iInterface1 instanceof goxg) ? ((goxg)iInterface1) : new goxg(iBinder1);
                }
                goxh.gr(parcel0);
                this.R(new SignInWithCustomTokenAidlRequest(s1, null), goxg1);
                break;
            }
            case 3: {
                VerifyAssertionRequest verifyAssertionRequest0 = (VerifyAssertionRequest)wbz.a(parcel0, VerifyAssertionRequest.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface2 instanceof goxg) ? ((goxg)iInterface2) : new goxg(iBinder2);
                }
                goxh.gr(parcel0);
                this.Q(new SignInWithCredentialAidlRequest(verifyAssertionRequest0), goxg0);
                break;
            }
            case 4: {
                String s2 = parcel0.readString();
                UserProfileChangeRequest userProfileChangeRequest0 = (UserProfileChangeRequest)wbz.a(parcel0, UserProfileChangeRequest.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface3 instanceof goxg) ? ((goxg)iInterface3) : new goxg(iBinder3);
                }
                goxh.gr(parcel0);
                this.X(new UpdateProfileAidlRequest(userProfileChangeRequest0, s2), goxg0);
                break;
            }
            case 5: {
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface4 instanceof goxg) ? ((goxg)iInterface4) : new goxg(iBinder4);
                }
                goxh.gr(parcel0);
                this.d(s3, s4, goxg0);
                break;
            }
            case 6: {
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface5 instanceof goxg) ? ((goxg)iInterface5) : new goxg(iBinder5);
                }
                goxh.gr(parcel0);
                this.f(s5, s6, goxg0);
                break;
            }
            case 7: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface6 instanceof goxg) ? ((goxg)iInterface6) : new goxg(iBinder6);
                }
                goxh.gr(parcel0);
                this.l(s7, s8, goxg0);
                break;
            }
            case 8: {
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 == null) {
                    goxg2 = null;
                }
                else {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg2 = (iInterface7 instanceof goxg) ? ((goxg)iInterface7) : new goxg(iBinder7);
                }
                goxh.gr(parcel0);
                this.S(new SignInWithEmailAndPasswordAidlRequest(s9, s10, null), goxg2);
                break;
            }
            case 9: {
                String s11 = parcel0.readString();
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface8 instanceof goxg) ? ((goxg)iInterface8) : new goxg(iBinder8);
                }
                goxh.gr(parcel0);
                this.t(s11, goxg0);
                break;
            }
            case 10: {
                String s12 = parcel0.readString();
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 == null) {
                    goxg3 = null;
                }
                else {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg3 = (iInterface9 instanceof goxg) ? ((goxg)iInterface9) : new goxg(iBinder9);
                }
                goxh.gr(parcel0);
                this.J(s12, null, goxg3);
                break;
            }
            case 11: {
                String s13 = parcel0.readString();
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface10 instanceof goxg) ? ((goxg)iInterface10) : new goxg(iBinder10);
                }
                goxh.gr(parcel0);
                this.v(s13, s14, s15, goxg0);
                break;
            }
            case 12: {
                String s16 = parcel0.readString();
                VerifyAssertionRequest verifyAssertionRequest1 = (VerifyAssertionRequest)wbz.a(parcel0, VerifyAssertionRequest.CREATOR);
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface11 instanceof goxg) ? ((goxg)iInterface11) : new goxg(iBinder11);
                }
                goxh.gr(parcel0);
                this.x(s16, verifyAssertionRequest1, goxg0);
                break;
            }
            case 13: {
                String s17 = parcel0.readString();
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface12 instanceof goxg) ? ((goxg)iInterface12) : new goxg(iBinder12);
                }
                goxh.gr(parcel0);
                this.V(new UnlinkEmailCredentialAidlRequest(s17), goxg0);
                break;
            }
            case 14: {
                String s18 = parcel0.readString();
                String s19 = parcel0.readString();
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface13 instanceof goxg) ? ((goxg)iInterface13) : new goxg(iBinder13);
                }
                goxh.gr(parcel0);
                this.W(new UnlinkFederatedCredentialAidlRequest(s18, s19), goxg0);
                break;
            }
            case 15: {
                String s20 = parcel0.readString();
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface14 instanceof goxg) ? ((goxg)iInterface14) : new goxg(iBinder14);
                }
                goxh.gr(parcel0);
                this.B(s20, goxg0);
                break;
            }
            case 16: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface15 instanceof goxg) ? ((goxg)iInterface15) : new goxg(iBinder15);
                }
                goxh.gr(parcel0);
                this.O(goxg0);
                break;
            }
            case 17: {
                String s21 = parcel0.readString();
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface16 instanceof goxg) ? ((goxg)iInterface16) : new goxg(iBinder16);
                }
                goxh.gr(parcel0);
                this.n(s21, goxg0);
                break;
            }
            case 18: {
                String s22 = parcel0.readString();
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 == null) {
                    goxg4 = null;
                }
                else {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg4 = (iInterface17 instanceof goxg) ? ((goxg)iInterface17) : new goxg(iBinder17);
                }
                goxh.gr(parcel0);
                this.D(s22, null, goxg4);
                break;
            }
            case 19: {
                String s23 = parcel0.readString();
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface18 instanceof goxg) ? ((goxg)iInterface18) : new goxg(iBinder18);
                }
                goxh.gr(parcel0);
                this.h(s23, goxg0);
                break;
            }
            case 20: {
                String s24 = parcel0.readString();
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface19 instanceof goxg) ? ((goxg)iInterface19) : new goxg(iBinder19);
                }
                goxh.gr(parcel0);
                this.a(s24, goxg0);
                break;
            }
            case 21: {
                String s25 = parcel0.readString();
                String s26 = parcel0.readString();
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface20 instanceof goxg) ? ((goxg)iInterface20) : new goxg(iBinder20);
                }
                goxh.gr(parcel0);
                this.j(s25, s26, goxg0);
                break;
            }
            case 22: {
                SendVerificationCodeRequest sendVerificationCodeRequest0 = (SendVerificationCodeRequest)wbz.a(parcel0, SendVerificationCodeRequest.CREATOR);
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface21 instanceof goxg) ? ((goxg)iInterface21) : new goxg(iBinder21);
                }
                goxh.gr(parcel0);
                this.K(sendVerificationCodeRequest0, goxg0);
                break;
            }
            case 23: {
                PhoneAuthCredential phoneAuthCredential0 = (PhoneAuthCredential)wbz.a(parcel0, PhoneAuthCredential.CREATOR);
                IBinder iBinder22 = parcel0.readStrongBinder();
                if(iBinder22 == null) {
                    goxg5 = null;
                }
                else {
                    IInterface iInterface22 = iBinder22.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg5 = (iInterface22 instanceof goxg) ? ((goxg)iInterface22) : new goxg(iBinder22);
                }
                goxh.gr(parcel0);
                this.U(new SignInWithPhoneNumberAidlRequest(phoneAuthCredential0, null), goxg5);
                break;
            }
            case 24: {
                String s27 = parcel0.readString();
                PhoneAuthCredential phoneAuthCredential1 = (PhoneAuthCredential)wbz.a(parcel0, PhoneAuthCredential.CREATOR);
                IBinder iBinder23 = parcel0.readStrongBinder();
                if(iBinder23 != null) {
                    IInterface iInterface23 = iBinder23.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface23 instanceof goxg) ? ((goxg)iInterface23) : new goxg(iBinder23);
                }
                goxh.gr(parcel0);
                this.z(s27, phoneAuthCredential1, goxg0);
                break;
            }
            case 25: {
                String s28 = parcel0.readString();
                ActionCodeSettings actionCodeSettings0 = (ActionCodeSettings)wbz.a(parcel0, ActionCodeSettings.CREATOR);
                IBinder iBinder24 = parcel0.readStrongBinder();
                if(iBinder24 != null) {
                    IInterface iInterface24 = iBinder24.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface24 instanceof goxg) ? ((goxg)iInterface24) : new goxg(iBinder24);
                }
                goxh.gr(parcel0);
                this.J(s28, actionCodeSettings0, goxg0);
                break;
            }
            case 26: {
                String s29 = parcel0.readString();
                ActionCodeSettings actionCodeSettings1 = (ActionCodeSettings)wbz.a(parcel0, ActionCodeSettings.CREATOR);
                IBinder iBinder25 = parcel0.readStrongBinder();
                if(iBinder25 != null) {
                    IInterface iInterface25 = iBinder25.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface25 instanceof goxg) ? ((goxg)iInterface25) : new goxg(iBinder25);
                }
                goxh.gr(parcel0);
                this.D(s29, actionCodeSettings1, goxg0);
                break;
            }
            case 27: {
                String s30 = parcel0.readString();
                IBinder iBinder26 = parcel0.readStrongBinder();
                if(iBinder26 != null) {
                    IInterface iInterface26 = iBinder26.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface26 instanceof goxg) ? ((goxg)iInterface26) : new goxg(iBinder26);
                }
                goxh.gr(parcel0);
                this.M(s30, goxg0);
                break;
            }
            case 28: {
                String s31 = parcel0.readString();
                ActionCodeSettings actionCodeSettings2 = (ActionCodeSettings)wbz.a(parcel0, ActionCodeSettings.CREATOR);
                IBinder iBinder27 = parcel0.readStrongBinder();
                if(iBinder27 != null) {
                    IInterface iInterface27 = iBinder27.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface27 instanceof goxg) ? ((goxg)iInterface27) : new goxg(iBinder27);
                }
                goxh.gr(parcel0);
                this.H(s31, actionCodeSettings2, goxg0);
                break;
            }
            case 29: {
                EmailAuthCredential emailAuthCredential0 = (EmailAuthCredential)wbz.a(parcel0, EmailAuthCredential.CREATOR);
                IBinder iBinder28 = parcel0.readStrongBinder();
                if(iBinder28 != null) {
                    IInterface iInterface28 = iBinder28.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface28 instanceof goxg) ? ((goxg)iInterface28) : new goxg(iBinder28);
                }
                goxh.gr(parcel0);
                this.T(new SignInWithEmailLinkAidlRequest(emailAuthCredential0), goxg0);
                break;
            }
            case 101: {
                GetAccessTokenAidlRequest getAccessTokenAidlRequest0 = (GetAccessTokenAidlRequest)wbz.a(parcel0, GetAccessTokenAidlRequest.CREATOR);
                IBinder iBinder29 = parcel0.readStrongBinder();
                if(iBinder29 != null) {
                    IInterface iInterface29 = iBinder29.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface29 instanceof goxg) ? ((goxg)iInterface29) : new goxg(iBinder29);
                }
                goxh.gr(parcel0);
                this.s(getAccessTokenAidlRequest0, goxg0);
                break;
            }
            case 102: {
                SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest0 = (SignInWithCustomTokenAidlRequest)wbz.a(parcel0, SignInWithCustomTokenAidlRequest.CREATOR);
                IBinder iBinder30 = parcel0.readStrongBinder();
                if(iBinder30 != null) {
                    IInterface iInterface30 = iBinder30.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface30 instanceof goxg) ? ((goxg)iInterface30) : new goxg(iBinder30);
                }
                goxh.gr(parcel0);
                this.R(signInWithCustomTokenAidlRequest0, goxg0);
                break;
            }
            case 103: {
                SignInWithCredentialAidlRequest signInWithCredentialAidlRequest0 = (SignInWithCredentialAidlRequest)wbz.a(parcel0, SignInWithCredentialAidlRequest.CREATOR);
                IBinder iBinder31 = parcel0.readStrongBinder();
                if(iBinder31 != null) {
                    IInterface iInterface31 = iBinder31.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface31 instanceof goxg) ? ((goxg)iInterface31) : new goxg(iBinder31);
                }
                goxh.gr(parcel0);
                this.Q(signInWithCredentialAidlRequest0, goxg0);
                break;
            }
            case 104: {
                UpdateProfileAidlRequest updateProfileAidlRequest0 = (UpdateProfileAidlRequest)wbz.a(parcel0, UpdateProfileAidlRequest.CREATOR);
                IBinder iBinder32 = parcel0.readStrongBinder();
                if(iBinder32 != null) {
                    IInterface iInterface32 = iBinder32.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface32 instanceof goxg) ? ((goxg)iInterface32) : new goxg(iBinder32);
                }
                goxh.gr(parcel0);
                this.X(updateProfileAidlRequest0, goxg0);
                break;
            }
            case 105: {
                ChangeEmailAidlRequest changeEmailAidlRequest0 = (ChangeEmailAidlRequest)wbz.a(parcel0, ChangeEmailAidlRequest.CREATOR);
                IBinder iBinder33 = parcel0.readStrongBinder();
                if(iBinder33 != null) {
                    IInterface iInterface33 = iBinder33.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface33 instanceof goxg) ? ((goxg)iInterface33) : new goxg(iBinder33);
                }
                goxh.gr(parcel0);
                this.e(changeEmailAidlRequest0, goxg0);
                break;
            }
            case 106: {
                ChangePasswordAidlRequest changePasswordAidlRequest0 = (ChangePasswordAidlRequest)wbz.a(parcel0, ChangePasswordAidlRequest.CREATOR);
                IBinder iBinder34 = parcel0.readStrongBinder();
                if(iBinder34 != null) {
                    IInterface iInterface34 = iBinder34.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface34 instanceof goxg) ? ((goxg)iInterface34) : new goxg(iBinder34);
                }
                goxh.gr(parcel0);
                this.g(changePasswordAidlRequest0, goxg0);
                break;
            }
            case 107: {
                CreateUserWithEmailAndPasswordAidlRequest createUserWithEmailAndPasswordAidlRequest0 = (CreateUserWithEmailAndPasswordAidlRequest)wbz.a(parcel0, CreateUserWithEmailAndPasswordAidlRequest.CREATOR);
                IBinder iBinder35 = parcel0.readStrongBinder();
                if(iBinder35 != null) {
                    IInterface iInterface35 = iBinder35.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface35 instanceof goxg) ? ((goxg)iInterface35) : new goxg(iBinder35);
                }
                goxh.gr(parcel0);
                this.m(createUserWithEmailAndPasswordAidlRequest0, goxg0);
                break;
            }
            case 108: {
                SignInWithEmailAndPasswordAidlRequest signInWithEmailAndPasswordAidlRequest0 = (SignInWithEmailAndPasswordAidlRequest)wbz.a(parcel0, SignInWithEmailAndPasswordAidlRequest.CREATOR);
                IBinder iBinder36 = parcel0.readStrongBinder();
                if(iBinder36 != null) {
                    IInterface iInterface36 = iBinder36.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface36 instanceof goxg) ? ((goxg)iInterface36) : new goxg(iBinder36);
                }
                goxh.gr(parcel0);
                this.S(signInWithEmailAndPasswordAidlRequest0, goxg0);
                break;
            }
            case 109: {
                GetProvidersForEmailAidlRequest getProvidersForEmailAidlRequest0 = (GetProvidersForEmailAidlRequest)wbz.a(parcel0, GetProvidersForEmailAidlRequest.CREATOR);
                IBinder iBinder37 = parcel0.readStrongBinder();
                if(iBinder37 != null) {
                    IInterface iInterface37 = iBinder37.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface37 instanceof goxg) ? ((goxg)iInterface37) : new goxg(iBinder37);
                }
                goxh.gr(parcel0);
                this.u(getProvidersForEmailAidlRequest0, goxg0);
                break;
            }
            case 0x6F: {
                LinkEmailAuthCredentialAidlRequest linkEmailAuthCredentialAidlRequest0 = (LinkEmailAuthCredentialAidlRequest)wbz.a(parcel0, LinkEmailAuthCredentialAidlRequest.CREATOR);
                IBinder iBinder38 = parcel0.readStrongBinder();
                if(iBinder38 != null) {
                    IInterface iInterface38 = iBinder38.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface38 instanceof goxg) ? ((goxg)iInterface38) : new goxg(iBinder38);
                }
                goxh.gr(parcel0);
                this.w(linkEmailAuthCredentialAidlRequest0, goxg0);
                break;
            }
            case 0x70: {
                LinkFederatedCredentialAidlRequest linkFederatedCredentialAidlRequest0 = (LinkFederatedCredentialAidlRequest)wbz.a(parcel0, LinkFederatedCredentialAidlRequest.CREATOR);
                IBinder iBinder39 = parcel0.readStrongBinder();
                if(iBinder39 != null) {
                    IInterface iInterface39 = iBinder39.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface39 instanceof goxg) ? ((goxg)iInterface39) : new goxg(iBinder39);
                }
                goxh.gr(parcel0);
                this.y(linkFederatedCredentialAidlRequest0, goxg0);
                break;
            }
            case 0x71: {
                UnlinkEmailCredentialAidlRequest unlinkEmailCredentialAidlRequest0 = (UnlinkEmailCredentialAidlRequest)wbz.a(parcel0, UnlinkEmailCredentialAidlRequest.CREATOR);
                IBinder iBinder40 = parcel0.readStrongBinder();
                if(iBinder40 != null) {
                    IInterface iInterface40 = iBinder40.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface40 instanceof goxg) ? ((goxg)iInterface40) : new goxg(iBinder40);
                }
                goxh.gr(parcel0);
                this.V(unlinkEmailCredentialAidlRequest0, goxg0);
                break;
            }
            case 0x72: {
                UnlinkFederatedCredentialAidlRequest unlinkFederatedCredentialAidlRequest0 = (UnlinkFederatedCredentialAidlRequest)wbz.a(parcel0, UnlinkFederatedCredentialAidlRequest.CREATOR);
                IBinder iBinder41 = parcel0.readStrongBinder();
                if(iBinder41 != null) {
                    IInterface iInterface41 = iBinder41.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface41 instanceof goxg) ? ((goxg)iInterface41) : new goxg(iBinder41);
                }
                goxh.gr(parcel0);
                this.W(unlinkFederatedCredentialAidlRequest0, goxg0);
                break;
            }
            case 0x73: {
                ReloadAidlRequest reloadAidlRequest0 = (ReloadAidlRequest)wbz.a(parcel0, ReloadAidlRequest.CREATOR);
                IBinder iBinder42 = parcel0.readStrongBinder();
                if(iBinder42 != null) {
                    IInterface iInterface42 = iBinder42.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface42 instanceof goxg) ? ((goxg)iInterface42) : new goxg(iBinder42);
                }
                goxh.gr(parcel0);
                this.C(reloadAidlRequest0, goxg0);
                break;
            }
            case 0x74: {
                SignInAnonymouslyAidlRequest signInAnonymouslyAidlRequest0 = (SignInAnonymouslyAidlRequest)wbz.a(parcel0, SignInAnonymouslyAidlRequest.CREATOR);
                IBinder iBinder43 = parcel0.readStrongBinder();
                if(iBinder43 != null) {
                    IInterface iInterface43 = iBinder43.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface43 instanceof goxg) ? ((goxg)iInterface43) : new goxg(iBinder43);
                }
                goxh.gr(parcel0);
                this.P(signInAnonymouslyAidlRequest0, goxg0);
                break;
            }
            case 0x75: {
                DeleteAidlRequest deleteAidlRequest0 = (DeleteAidlRequest)wbz.a(parcel0, DeleteAidlRequest.CREATOR);
                IBinder iBinder44 = parcel0.readStrongBinder();
                if(iBinder44 != null) {
                    IInterface iInterface44 = iBinder44.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface44 instanceof goxg) ? ((goxg)iInterface44) : new goxg(iBinder44);
                }
                goxh.gr(parcel0);
                this.o(deleteAidlRequest0, goxg0);
                break;
            }
            case 0x77: {
                CheckActionCodeAidlRequest checkActionCodeAidlRequest0 = (CheckActionCodeAidlRequest)wbz.a(parcel0, CheckActionCodeAidlRequest.CREATOR);
                IBinder iBinder45 = parcel0.readStrongBinder();
                if(iBinder45 != null) {
                    IInterface iInterface45 = iBinder45.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface45 instanceof goxg) ? ((goxg)iInterface45) : new goxg(iBinder45);
                }
                goxh.gr(parcel0);
                this.i(checkActionCodeAidlRequest0, goxg0);
                break;
            }
            case 120: {
                ApplyActionCodeAidlRequest applyActionCodeAidlRequest0 = (ApplyActionCodeAidlRequest)wbz.a(parcel0, ApplyActionCodeAidlRequest.CREATOR);
                IBinder iBinder46 = parcel0.readStrongBinder();
                if(iBinder46 != null) {
                    IInterface iInterface46 = iBinder46.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface46 instanceof goxg) ? ((goxg)iInterface46) : new goxg(iBinder46);
                }
                goxh.gr(parcel0);
                this.c(applyActionCodeAidlRequest0, goxg0);
                break;
            }
            case 0x79: {
                ConfirmPasswordResetAidlRequest confirmPasswordResetAidlRequest0 = (ConfirmPasswordResetAidlRequest)wbz.a(parcel0, ConfirmPasswordResetAidlRequest.CREATOR);
                IBinder iBinder47 = parcel0.readStrongBinder();
                if(iBinder47 != null) {
                    IInterface iInterface47 = iBinder47.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface47 instanceof goxg) ? ((goxg)iInterface47) : new goxg(iBinder47);
                }
                goxh.gr(parcel0);
                this.k(confirmPasswordResetAidlRequest0, goxg0);
                break;
            }
            case 0x7A: {
                SendVerificationCodeAidlRequest sendVerificationCodeAidlRequest0 = (SendVerificationCodeAidlRequest)wbz.a(parcel0, SendVerificationCodeAidlRequest.CREATOR);
                IBinder iBinder48 = parcel0.readStrongBinder();
                if(iBinder48 != null) {
                    IInterface iInterface48 = iBinder48.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface48 instanceof goxg) ? ((goxg)iInterface48) : new goxg(iBinder48);
                }
                goxh.gr(parcel0);
                this.L(sendVerificationCodeAidlRequest0, goxg0);
                break;
            }
            case 0x7B: {
                SignInWithPhoneNumberAidlRequest signInWithPhoneNumberAidlRequest0 = (SignInWithPhoneNumberAidlRequest)wbz.a(parcel0, SignInWithPhoneNumberAidlRequest.CREATOR);
                IBinder iBinder49 = parcel0.readStrongBinder();
                if(iBinder49 != null) {
                    IInterface iInterface49 = iBinder49.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface49 instanceof goxg) ? ((goxg)iInterface49) : new goxg(iBinder49);
                }
                goxh.gr(parcel0);
                this.U(signInWithPhoneNumberAidlRequest0, goxg0);
                break;
            }
            case 0x7C: {
                LinkPhoneAuthCredentialAidlRequest linkPhoneAuthCredentialAidlRequest0 = (LinkPhoneAuthCredentialAidlRequest)wbz.a(parcel0, LinkPhoneAuthCredentialAidlRequest.CREATOR);
                IBinder iBinder50 = parcel0.readStrongBinder();
                if(iBinder50 != null) {
                    IInterface iInterface50 = iBinder50.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface50 instanceof goxg) ? ((goxg)iInterface50) : new goxg(iBinder50);
                }
                goxh.gr(parcel0);
                this.A(linkPhoneAuthCredentialAidlRequest0, goxg0);
                break;
            }
            case 0x7E: {
                SendEmailVerificationWithSettingsAidlRequest sendEmailVerificationWithSettingsAidlRequest0 = (SendEmailVerificationWithSettingsAidlRequest)wbz.a(parcel0, SendEmailVerificationWithSettingsAidlRequest.CREATOR);
                IBinder iBinder51 = parcel0.readStrongBinder();
                if(iBinder51 != null) {
                    IInterface iInterface51 = iBinder51.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface51 instanceof goxg) ? ((goxg)iInterface51) : new goxg(iBinder51);
                }
                goxh.gr(parcel0);
                this.E(sendEmailVerificationWithSettingsAidlRequest0, goxg0);
                break;
            }
            case 0x7F: {
                SetFirebaseUiVersionAidlRequest setFirebaseUiVersionAidlRequest0 = (SetFirebaseUiVersionAidlRequest)wbz.a(parcel0, SetFirebaseUiVersionAidlRequest.CREATOR);
                IBinder iBinder52 = parcel0.readStrongBinder();
                if(iBinder52 != null) {
                    IInterface iInterface52 = iBinder52.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface52 instanceof goxg) ? ((goxg)iInterface52) : new goxg(iBinder52);
                }
                goxh.gr(parcel0);
                this.N(setFirebaseUiVersionAidlRequest0, goxg0);
                break;
            }
            case 0x80: {
                SendGetOobConfirmationCodeEmailAidlRequest sendGetOobConfirmationCodeEmailAidlRequest0 = (SendGetOobConfirmationCodeEmailAidlRequest)wbz.a(parcel0, SendGetOobConfirmationCodeEmailAidlRequest.CREATOR);
                IBinder iBinder53 = parcel0.readStrongBinder();
                if(iBinder53 != null) {
                    IInterface iInterface53 = iBinder53.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface53 instanceof goxg) ? ((goxg)iInterface53) : new goxg(iBinder53);
                }
                goxh.gr(parcel0);
                this.I(sendGetOobConfirmationCodeEmailAidlRequest0, goxg0);
                break;
            }
            case 0x81: {
                SignInWithEmailLinkAidlRequest signInWithEmailLinkAidlRequest0 = (SignInWithEmailLinkAidlRequest)wbz.a(parcel0, SignInWithEmailLinkAidlRequest.CREATOR);
                IBinder iBinder54 = parcel0.readStrongBinder();
                if(iBinder54 != null) {
                    IInterface iInterface54 = iBinder54.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface54 instanceof goxg) ? ((goxg)iInterface54) : new goxg(iBinder54);
                }
                goxh.gr(parcel0);
                this.T(signInWithEmailLinkAidlRequest0, goxg0);
                break;
            }
            case 130: {
                StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest0 = (StartMfaPhoneNumberEnrollmentAidlRequest)wbz.a(parcel0, StartMfaPhoneNumberEnrollmentAidlRequest.CREATOR);
                IBinder iBinder55 = parcel0.readStrongBinder();
                if(iBinder55 != null) {
                    IInterface iInterface55 = iBinder55.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface55 instanceof goxg) ? ((goxg)iInterface55) : new goxg(iBinder55);
                }
                goxh.gr(parcel0);
                batl.s(startMfaPhoneNumberEnrollmentAidlRequest0);
                goxh.Z(startMfaPhoneNumberEnrollmentAidlRequest0.d);
                String s32 = goxh.Y(startMfaPhoneNumberEnrollmentAidlRequest0.b);
                StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest1 = new StartMfaPhoneNumberEnrollmentAidlRequest(startMfaPhoneNumberEnrollmentAidlRequest0.a, s32, startMfaPhoneNumberEnrollmentAidlRequest0.c, startMfaPhoneNumberEnrollmentAidlRequest0.d, startMfaPhoneNumberEnrollmentAidlRequest0.e, startMfaPhoneNumberEnrollmentAidlRequest0.f);
                gove gove0 = new gove(this.a, this.b, this.c, startMfaPhoneNumberEnrollmentAidlRequest1, goxg0);
                this.d.b(gove0);
                break;
            }
            case 0x83: {
                UnenrollMfaAidlRequest unenrollMfaAidlRequest0 = (UnenrollMfaAidlRequest)wbz.a(parcel0, UnenrollMfaAidlRequest.CREATOR);
                IBinder iBinder56 = parcel0.readStrongBinder();
                if(iBinder56 != null) {
                    IInterface iInterface56 = iBinder56.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface56 instanceof goxg) ? ((goxg)iInterface56) : new goxg(iBinder56);
                }
                goxh.gr(parcel0);
                batl.s(unenrollMfaAidlRequest0);
                gouz gouz0 = new gouz(this.a, this.b, this.c, unenrollMfaAidlRequest0.a, unenrollMfaAidlRequest0.b, goxg0);
                this.d.b(gouz0);
                break;
            }
            case 0x84: {
                FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest0 = (FinalizeMfaEnrollmentAidlRequest)wbz.a(parcel0, FinalizeMfaEnrollmentAidlRequest.CREATOR);
                IBinder iBinder57 = parcel0.readStrongBinder();
                if(iBinder57 != null) {
                    IInterface iInterface57 = iBinder57.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface57 instanceof goxg) ? ((goxg)iInterface57) : new goxg(iBinder57);
                }
                goxh.gr(parcel0);
                this.p(finalizeMfaEnrollmentAidlRequest0, goxg0);
                break;
            }
            case 0x85: {
                StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest0 = (StartMfaPhoneNumberSignInAidlRequest)wbz.a(parcel0, StartMfaPhoneNumberSignInAidlRequest.CREATOR);
                IBinder iBinder58 = parcel0.readStrongBinder();
                if(iBinder58 != null) {
                    IInterface iInterface58 = iBinder58.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface58 instanceof goxg) ? ((goxg)iInterface58) : new goxg(iBinder58);
                }
                goxh.gr(parcel0);
                batl.s(startMfaPhoneNumberSignInAidlRequest0);
                goxh.Z(startMfaPhoneNumberSignInAidlRequest0.d);
                String s33 = goxh.Y(startMfaPhoneNumberSignInAidlRequest0.a.d);
                startMfaPhoneNumberSignInAidlRequest0.a = new PhoneMultiFactorInfo(startMfaPhoneNumberSignInAidlRequest0.a.a, startMfaPhoneNumberSignInAidlRequest0.a.b, startMfaPhoneNumberSignInAidlRequest0.a.c, s33);
                govf govf0 = new govf(this.a, this.b, this.c, startMfaPhoneNumberSignInAidlRequest0, goxg0);
                this.d.b(govf0);
                break;
            }
            case 0x86: {
                FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest0 = (FinalizeMfaSignInAidlRequest)wbz.a(parcel0, FinalizeMfaSignInAidlRequest.CREATOR);
                IBinder iBinder59 = parcel0.readStrongBinder();
                if(iBinder59 != null) {
                    IInterface iInterface59 = iBinder59.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface59 instanceof goxg) ? ((goxg)iInterface59) : new goxg(iBinder59);
                }
                goxh.gr(parcel0);
                this.q(finalizeMfaSignInAidlRequest0, goxg0);
                break;
            }
            case 0x87: {
                VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest0 = (VerifyBeforeUpdateEmailAidlRequest)wbz.a(parcel0, VerifyBeforeUpdateEmailAidlRequest.CREATOR);
                IBinder iBinder60 = parcel0.readStrongBinder();
                if(iBinder60 != null) {
                    IInterface iInterface60 = iBinder60.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    goxg0 = (iInterface60 instanceof goxg) ? ((goxg)iInterface60) : new goxg(iBinder60);
                }
                goxh.gr(parcel0);
                if(hsyp.a.b().a()) {
                    batl.s(verifyBeforeUpdateEmailAidlRequest0);
                    govd govd0 = new govd(this.a, this.b, this.c, verifyBeforeUpdateEmailAidlRequest0, goxg0);
                    this.d.b(govd0);
                }
                else {
                    try {
                        goxg0.a(new Status(17080));
                    }
                    catch(RemoteException remoteException0) {
                        this.e.g("RemoteException when sending failure result.", remoteException0, new Object[0]);
                    }
                }
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public final void g(ChangePasswordAidlRequest changePasswordAidlRequest0, goxg goxg0) {
        batl.s(changePasswordAidlRequest0);
        batl.q(changePasswordAidlRequest0.a);
        batl.q(changePasswordAidlRequest0.b);
        goud goud0 = new goud(this.a, this.b, this.c, changePasswordAidlRequest0.a, changePasswordAidlRequest0.b, goxg0);
        this.d.b(goud0);
    }

    @Deprecated
    public final void h(String s, goxg goxg0) {
        this.i(new CheckActionCodeAidlRequest(s, null), goxg0);
    }

    public final void i(CheckActionCodeAidlRequest checkActionCodeAidlRequest0, goxg goxg0) {
        batl.s(checkActionCodeAidlRequest0);
        batl.q(checkActionCodeAidlRequest0.a);
        goue goue0 = new goue(this.a, this.b, this.c, checkActionCodeAidlRequest0.a, checkActionCodeAidlRequest0.b, goxg0);
        this.d.b(goue0);
    }

    @Deprecated
    public final void j(String s, String s1, goxg goxg0) {
        this.k(new ConfirmPasswordResetAidlRequest(s, s1, null), goxg0);
    }

    public final void k(ConfirmPasswordResetAidlRequest confirmPasswordResetAidlRequest0, goxg goxg0) {
        batl.s(confirmPasswordResetAidlRequest0);
        batl.q(confirmPasswordResetAidlRequest0.a);
        batl.q(confirmPasswordResetAidlRequest0.b);
        gouf gouf0 = new gouf(this.a, this.b, this.c, confirmPasswordResetAidlRequest0.a, confirmPasswordResetAidlRequest0.b, confirmPasswordResetAidlRequest0.c, goxg0);
        this.d.b(gouf0);
    }

    @Deprecated
    public final void l(String s, String s1, goxg goxg0) {
        this.m(new CreateUserWithEmailAndPasswordAidlRequest(s, s1, null), goxg0);
    }

    public final void m(CreateUserWithEmailAndPasswordAidlRequest createUserWithEmailAndPasswordAidlRequest0, goxg goxg0) {
        batl.s(createUserWithEmailAndPasswordAidlRequest0);
        batl.q(createUserWithEmailAndPasswordAidlRequest0.a);
        batl.q(createUserWithEmailAndPasswordAidlRequest0.b);
        goug goug0 = new goug(this.a, this.b, this.c, createUserWithEmailAndPasswordAidlRequest0.a, createUserWithEmailAndPasswordAidlRequest0.b, createUserWithEmailAndPasswordAidlRequest0.c, goxg0);
        this.d.b(goug0);
    }

    @Deprecated
    public final void n(String s, goxg goxg0) {
        this.o(new DeleteAidlRequest(s), goxg0);
    }

    public final void o(DeleteAidlRequest deleteAidlRequest0, goxg goxg0) {
        batl.s(deleteAidlRequest0);
        batl.q(deleteAidlRequest0.a);
        gouh gouh0 = new gouh(this.a, this.b, this.c, deleteAidlRequest0.a, goxg0);
        this.d.b(gouh0);
    }

    public final void p(FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest0, goxg goxg0) {
        batl.s(finalizeMfaEnrollmentAidlRequest0);
        goui goui0 = new goui(this.a, this.b, this.c, finalizeMfaEnrollmentAidlRequest0, goxg0);
        this.d.b(goui0);
    }

    public final void q(FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest0, goxg goxg0) {
        batl.s(finalizeMfaSignInAidlRequest0);
        gouj gouj0 = new gouj(this.a, this.b, this.c, finalizeMfaSignInAidlRequest0, goxg0);
        this.d.b(gouj0);
    }

    @Deprecated
    public final void r(String s, goxg goxg0) {
        this.s(new GetAccessTokenAidlRequest(s), goxg0);
    }

    public final void s(GetAccessTokenAidlRequest getAccessTokenAidlRequest0, goxg goxg0) {
        batl.s(getAccessTokenAidlRequest0);
        batl.q(getAccessTokenAidlRequest0.a);
        gouk gouk0 = new gouk(this.a, this.b, this.c, getAccessTokenAidlRequest0.a, goxg0);
        this.d.b(gouk0);
    }

    @Deprecated
    public final void t(String s, goxg goxg0) {
        this.u(new GetProvidersForEmailAidlRequest(s, null), goxg0);
    }

    public final void u(GetProvidersForEmailAidlRequest getProvidersForEmailAidlRequest0, goxg goxg0) {
        batl.s(getProvidersForEmailAidlRequest0);
        batl.q(getProvidersForEmailAidlRequest0.a);
        goul goul0 = new goul(this.a, this.b, this.c, getProvidersForEmailAidlRequest0.a, getProvidersForEmailAidlRequest0.b, goxg0);
        this.d.b(goul0);
    }

    @Deprecated
    public final void v(String s, String s1, String s2, goxg goxg0) {
        this.w(new LinkEmailAuthCredentialAidlRequest(s, s1, s2), goxg0);
    }

    public final void w(LinkEmailAuthCredentialAidlRequest linkEmailAuthCredentialAidlRequest0, goxg goxg0) {
        batl.s(linkEmailAuthCredentialAidlRequest0);
        batl.q(linkEmailAuthCredentialAidlRequest0.a);
        batl.q(linkEmailAuthCredentialAidlRequest0.b);
        batl.q(linkEmailAuthCredentialAidlRequest0.c);
        goum goum0 = new goum(this.a, this.b, this.c, linkEmailAuthCredentialAidlRequest0.a, linkEmailAuthCredentialAidlRequest0.b, linkEmailAuthCredentialAidlRequest0.c, goxg0);
        this.d.b(goum0);
    }

    @Deprecated
    public final void x(String s, VerifyAssertionRequest verifyAssertionRequest0, goxg goxg0) {
        this.y(new LinkFederatedCredentialAidlRequest(s, verifyAssertionRequest0), goxg0);
    }

    public final void y(LinkFederatedCredentialAidlRequest linkFederatedCredentialAidlRequest0, goxg goxg0) {
        batl.s(linkFederatedCredentialAidlRequest0);
        batl.q(linkFederatedCredentialAidlRequest0.a);
        batl.s(linkFederatedCredentialAidlRequest0.b);
        goun goun0 = new goun(this.a, this.b, this.c, linkFederatedCredentialAidlRequest0.a, linkFederatedCredentialAidlRequest0.b, goxg0);
        this.d.b(goun0);
    }

    @Deprecated
    public final void z(String s, PhoneAuthCredential phoneAuthCredential0, goxg goxg0) {
        this.A(new LinkPhoneAuthCredentialAidlRequest(s, phoneAuthCredential0), goxg0);
    }
}

