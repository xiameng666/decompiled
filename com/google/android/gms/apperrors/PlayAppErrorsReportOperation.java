package com.google.android.gms.apperrors;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import azox;
import azql;
import batl;
import bauc;
import bbcu;
import bbic;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.finsky.apperrors.PlayAppErrorReport;
import com.google.android.finsky.updateprompt.PlayAppFilteredError;
import ggtj;
import java.util.logging.Level;
import wbz;
import yxe;
import yxi;

public class PlayAppErrorsReportOperation extends IntentOperation {
    public static final int a;
    private static final bboh b;
    private static final Intent c;
    private static final Intent d;

    static {
        PlayAppErrorsReportOperation.b = bboh.b("PlayAppErrorsReportOperation", bbcu.ed);
        PlayAppErrorsReportOperation.c = new Intent("com.google.android.finsky.BIND_APP_ERROR_SERVICE").setPackage("com.android.vending");
        PlayAppErrorsReportOperation.d = new Intent("com.google.android.finsky.BIND_APP_FILTERED_ERROR_SERVICE").setPackage("com.android.vending");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        yxe yxe0 = null;
        if(!azql.c(this).g("com.android.vending")) {
            ((ggtj)PlayAppErrorsReportOperation.b.g(Level.WARNING).ar(470)).x("Could not verify Play Store signature");
            return;
        }
        if("com.google.android.gms.apperrors.PLAY_APP_ERRORS_REPORT_ACTION".equals(intent0.getAction())) {
            PlayAppErrorReport playAppErrorReport0 = (PlayAppErrorReport)bauc.b(intent0, "report", PlayAppErrorReport.CREATOR);
            batl.s(playAppErrorReport0);
            azox azox0 = new azox();
            try {
                if(bbic.a().d(this, PlayAppErrorsReportOperation.c, azox0, 1)) {
                    IBinder iBinder0 = azox0.a();
                    if(iBinder0 != null) {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.apperrors.IPlayAppErrorsService");
                        yxe0 = (iInterface0 instanceof yxe) ? ((yxe)iInterface0) : new yxe(iBinder0);
                    }
                    if(yxe0 == null) {
                        ((ggtj)PlayAppErrorsReportOperation.b.g(Level.WARNING).ar(474)).x("Connection failed");
                        return;
                    }
                    Parcel parcel0 = yxe0.jo();
                    wbz.f(parcel0, playAppErrorReport0);
                    yxe0.jq(1, parcel0);
                    return;
                }
            }
            catch(InterruptedException | RemoteException exception0) {
                ((ggtj)((ggtj)PlayAppErrorsReportOperation.b.g(Level.WARNING).s(exception0)).ar(473)).x("Service call failed");
            }
            finally {
                bbic.a().b(this, azox0);
            }
            return;
        }
        if("com.google.android.gms.apperrors.PLAY_APP_FILTERED_ERROR_ACTION".equals(intent0.getAction())) {
            PlayAppFilteredError playAppFilteredError0 = (PlayAppFilteredError)bauc.b(intent0, "error", PlayAppFilteredError.CREATOR);
            batl.s(playAppFilteredError0);
            azox azox1 = new azox();
            try {
                if(bbic.a().d(this, PlayAppErrorsReportOperation.d, azox1, 1)) {
                    IBinder iBinder1 = azox1.a();
                    if(iBinder1 != null) {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.finsky.updateprompt.IPlayAppFilteredErrorsService");
                        yxe0 = (iInterface1 instanceof yxi) ? ((yxi)iInterface1) : new yxi(iBinder1);
                    }
                    if(yxe0 == null) {
                        ((ggtj)PlayAppErrorsReportOperation.b.g(Level.WARNING).ar(472)).x("Connection failed");
                        return;
                    }
                    Parcel parcel1 = yxe0.jo();
                    wbz.f(parcel1, playAppFilteredError0);
                    yxe0.jq(1, parcel1);
                    return;
                }
            }
            catch(InterruptedException | RemoteException exception1) {
                ((ggtj)((ggtj)PlayAppErrorsReportOperation.b.g(Level.WARNING).s(exception1)).ar(471)).x("Service call failed");
            }
            finally {
                bbic.a().b(this, azox1);
            }
            return;
        }
        ((ggtj)PlayAppErrorsReportOperation.b.g(Level.WARNING).ar(469)).B("Unknown intent action \'%s\'", intent0.getAction());
    }
}

