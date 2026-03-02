import android.app.Dialog;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.managed.ui.EmmChimeraActivity;

public final class akpq extends de implements luo {
    protected gmcd ag;
    protected ProgressDialog ah;
    private akqy ai;
    private akqv aj;
    private byte[] ak;
    private hlxd al;

    public akpq() {
        this.ag = null;
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        gmcd gmcd0;
        String s4;
        lvb lvb0;
        fjcv fjcv0;
        hfrn hfrn0;
        gged_interceptors gged0;
        fjgp fjgp0;
        switch(v) {
            case 1: {
                if(hpwe.h()) {
                    aknc aknc0 = new aknc(this.getContext());
                    akqy akqy0 = this.ai;
                    hlxd hlxd0 = this.al;
                    String s = this.getArguments().getString("downloadFileDestinationUri");
                    String s1 = hlxd0.j;
                    try {
                        fjgp0 = new fjgp(null);
                        fjgp0.c(-1);
                        gged0 = ggna.a;
                        if(gged0 != null) {
                            fjgp0.f = gged0;
                            fjgp0.j = true;
                            fjgp0.l = (byte)(fjgp0.l | 6);
                            fjgp0.b(fjhe.a);
                            hfrn0 = hfrn.a;
                            fjgp0.a(hfrn0);
                            Uri uri0 = Uri.parse(s);
                            if(uri0 != null) {
                                fjgp0.a = uri0;
                                if(s1 != null) {
                                    fjgp0.b = s1;
                                    fjgp0.d = gfsx.m(new akqx(akqy0, aknc0, hlxd0));
                                    hpwe hpwe0 = hpwe.a;
                                    if(hpwe0.b().l()) {
                                        fjgp0.b(fjhe.c);
                                    }
                                    if(hpwe0.b().b()) {
                                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfrn0).v_newBuilder();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((hfrn)hftp0.b_message).b = "type.googleapis.com/gmscore.facets.datacollection.DataCollectionIdentifier";
                                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
                                        bbed bbed0 = bbed.gn;
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        bbdv bbdv0 = (bbdv)hftp1.b_message;
                                        bbdv0.b = bbed0.a();
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        ((bbdv)hftp1.b_message).c = 3;
                                        ByteString hfsf0 = ((bbdv)hftp1.N_build()).getDefaultInstanceForType();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((hfrn)hftp0.b_message).c = hfsf0;
                                        fjgp0.a(((hfrn)hftp0.N_build()));
                                        fjgp0.c(0x9700);
                                    }
                                    fjcv0 = akqy0.a;
                                    String s2 = fjgp0.g;
                                    gfsx gfsx0 = s2 == null ? gfqx.a : gfsx.m(s2);
                                    if(!gfsx0.i()) {
                                        String s3 = fjgp0.b;
                                        if(s3 == null) {
                                            throw new IllegalStateException("Property \"urlToDownload\" has not been set");
                                        }
                                        fjgp0.g = s3;
                                    }
                                    goto label_63;
                                }
                                lvb0 = aknc0;
                                s4 = null;
                                throw new NullPointerException("Null urlToDownload");
                            }
                            lvb0 = aknc0;
                            s4 = s1;
                            throw new NullPointerException("Null destinationFileUri");
                        }
                        lvb0 = aknc0;
                        s4 = s1;
                        throw new NullPointerException("Null extraHttpHeaders");
                    }
                    catch(RuntimeException runtimeException0) {
                        lvb0 = aknc0;
                        s4 = s1;
                        goto label_198;
                    }
                    try {
                    label_63:
                        lvb0 = aknc0;
                        s4 = s1;
                        if(fjgp0.l != 7) {
                            goto label_78;
                        }
                        Uri uri1 = fjgp0.a;
                        if(uri1 == null) {
                            goto label_78;
                        }
                        String s5 = fjgp0.b;
                        if(s5 == null) {
                            goto label_78;
                        }
                        fjhe fjhe0 = fjgp0.c;
                        if(fjhe0 == null) {
                            goto label_78;
                        }
                        gged_interceptors gged1 = fjgp0.f;
                        if(gged1 == null) {
                            goto label_78;
                        }
                        String s6 = fjgp0.g;
                        if(s6 == null) {
                            goto label_78;
                        }
                        hfrn hfrn1 = fjgp0.k;
                        if(hfrn1 == null) {
                        label_78:
                            StringBuilder stringBuilder0 = new StringBuilder();
                            if(fjgp0.a == null) {
                                stringBuilder0.append(" destinationFileUri");
                            }
                            if(fjgp0.b == null) {
                                stringBuilder0.append(" urlToDownload");
                            }
                            if(fjgp0.c == null) {
                                stringBuilder0.append(" downloadConstraints");
                            }
                            if((fjgp0.l & 1) == 0) {
                                stringBuilder0.append(" trafficTag");
                            }
                            if(fjgp0.f == null) {
                                stringBuilder0.append(" extraHttpHeaders");
                            }
                            if((fjgp0.l & 2) == 0) {
                                stringBuilder0.append(" fileSizeBytes");
                            }
                            if(fjgp0.g == null) {
                                stringBuilder0.append(" notificationContentTitle");
                            }
                            if((fjgp0.l & 4) == 0) {
                                stringBuilder0.append(" showDownloadedNotification");
                            }
                            if(fjgp0.k == null) {
                                stringBuilder0.append(" customDownloaderMetadata");
                            }
                            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
                        }
                        fjgq fjgq0 = new fjgq(uri1, s5, fjhe0, fjgp0.d, fjgp0.e, gged1, s6, fjgp0.h, fjgp0.i, fjgp0.j, hfrn1);
                        fkel fkel0 = new fkel(null);
                        fkel0.e(-1);
                        fkel0.b(gged0);
                        fkel0.f();
                        fkel0.d(true);
                        fkel0.a(hfrn0);
                        Uri uri2 = fjgq0.a;
                        if(uri2 == null) {
                            throw new NullPointerException("Null destinationFileUri");
                        }
                        fkel0.a = uri2;
                        String s7 = fjgq0.b;
                        if(s7 == null) {
                            throw new NullPointerException("Null urlToDownload");
                        }
                        fkel0.b = s7;
                        fjhe fjhe1 = fjgq0.c;
                        if(fjhe1 == null) {
                            throw new NullPointerException("Null downloadConstraints");
                        }
                        fkel0.c = fjhe1;
                        gfsx gfsx1 = fjgq0.d;
                        gfsx gfsx2 = gfsx1.i() ? gfsx.m(new fkdv(((akqx)gfsx1.d()))) : gfqx.a;
                        fkel0.d = gfsx2;
                        fkel0.e(fjgq0.e);
                        fkel0.b(fjgq0.f);
                        fkel0.f();
                        fkel0.c(fjgq0.g);
                        gfsx gfsx3 = fjgq0.h;
                        if(gfsx3 == null) {
                            throw new NullPointerException("Null notificationContentTextOptional");
                        }
                        fkel0.h = gfsx3;
                        gfsx gfsx4 = fjgq0.i;
                        if(gfsx4 == null) {
                            throw new NullPointerException("Null notificationContentIntentOptional");
                        }
                        fkel0.i = gfsx4;
                        fkel0.d(fjgq0.j);
                        fkel0.a(fjgq0.k);
                        String s8 = fkel0.g;
                        gfsx gfsx5 = s8 == null ? gfqx.a : gfsx.m(s8);
                        if(!gfsx5.i()) {
                            String s9 = fkel0.b;
                            if(s9 == null) {
                                throw new IllegalStateException("Property \"urlToDownload\" has not been set");
                            }
                            fkel0.c(s9);
                        }
                        fkev fkev0 = ((fjge)fjcv0).l;
                        if(fkel0.l != 7) {
                            goto label_161;
                        }
                        Uri uri3 = fkel0.a;
                        if(uri3 == null) {
                            goto label_161;
                        }
                        String s10 = fkel0.b;
                        if(s10 == null) {
                            goto label_161;
                        }
                        fjhe fjhe2 = fkel0.c;
                        if(fjhe2 == null) {
                            goto label_161;
                        }
                        gged_interceptors gged2 = fkel0.f;
                        if(gged2 == null) {
                            goto label_161;
                        }
                        String s11 = fkel0.g;
                        if(s11 == null) {
                            goto label_161;
                        }
                        hfrn hfrn2 = fkel0.k;
                        if(hfrn2 == null) {
                        label_161:
                            StringBuilder stringBuilder1 = new StringBuilder();
                            if(fkel0.a == null) {
                                stringBuilder1.append(" destinationFileUri");
                            }
                            if(fkel0.b == null) {
                                stringBuilder1.append(" urlToDownload");
                            }
                            if(fkel0.c == null) {
                                stringBuilder1.append(" downloadConstraints");
                            }
                            if((fkel0.l & 1) == 0) {
                                stringBuilder1.append(" trafficTag");
                            }
                            if(fkel0.f == null) {
                                stringBuilder1.append(" extraHttpHeaders");
                            }
                            if((fkel0.l & 2) == 0) {
                                stringBuilder1.append(" fileSizeBytes");
                            }
                            if(fkel0.g == null) {
                                stringBuilder1.append(" notificationContentTitle");
                            }
                            if((fkel0.l & 4) == 0) {
                                stringBuilder1.append(" showDownloadedNotification");
                            }
                            if(fkel0.k == null) {
                                stringBuilder1.append(" customDownloaderMetadata");
                            }
                            throw new IllegalStateException("Missing required properties:" + stringBuilder1.toString());
                        }
                        fkem fkem0 = new fkem(uri3, s10, fjhe2, fkel0.d, fkel0.e, gged2, s11, fkel0.h, fkel0.i, fkel0.j, hfrn2);
                        ghga ghga0 = ghgc.a.h();
                        ghga0.n(fkem0.a.toString());
                        ghga0.n("|");
                        fjii fjii0 = new fjii(2, ghga0.s().toString());
                        gmcd0 = gdtf.k(gdtf.k(fkev0.e.c(fjii0.a), new fker(fkev0, fjii0.a), fkev0.a), new fken(fkev0, fkem0, fjii0), fkev0.a);
                        this.ag = gmcd0;
                        return lvb0;
                    }
                    catch(RuntimeException runtimeException0) {
                    }
                label_198:
                    Log.w("Auth", "[AuthManaged, AuthManagedMddHelper] Error occurred while returning download future for url " + s4 + ": " + runtimeException0.getMessage());
                    ((aknc)lvb0).b();
                    gmcd0 = gmbu.h(runtimeException0);
                    this.ag = gmcd0;
                    return lvb0;
                }
                return new akmy(this.getContext(), this.getArguments().getLong("downloadRequestId"));
            }
            case 2: {
                return new akna(this.getContext(), this.getArguments().getLong("downloadRequestId"), this.getArguments().getString("downloadFileDestinationUri"), this.al);
            }
            default: {
                return null;
            }
        }
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        int v = lvb0.getId();
        if(v == 1) {
            switch(((int)(((Integer)object0)))) {
                case -2: {
                    this.y(1);
                    return;
                }
                case -1: {
                    goto label_7;
                }
                case 101: {
                    goto label_11;
                }
            }
            this.z(((int)(((Integer)object0))) * 98 / 100);
            return;
        label_7:
            ProgressDialog progressDialog0 = this.ah;
            if(progressDialog0 != null) {
                progressDialog0.setMessage(this.getArguments().getCharSequence("pausedMessage"));
                return;
            label_11:
                this.z(98);
                akrd.a(this.getContext()).j(11, this.al);
                akrd.a(this.getContext()).j(12, this.al);
                lup.a(this).c(2, null, this);
            }
        }
        else if(v == 2) {
            switch(((int)(((Integer)object0)))) {
                case -2: {
                    gmcd gmcd0 = this.ag;
                    if(gmcd0 != null) {
                        gmcd0.cancel(false);
                    }
                    this.y(3);
                    return;
                }
                case -1: {
                    this.y(1);
                    return;
                }
                case 101: {
                    akrd.a(this.getContext()).j(13, this.al);
                    this.y(2);
                }
            }
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }

    @Override  // de
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.aj = akqv.f();
        byte[] arr_b = this.getArguments().getByteArray("packageInformationBytes");
        this.ak = arr_b;
        this.al = this.aj.g(arr_b);
        this.ai = akqy.a(this.getContext());
        if(this.al == null) {
            this.y(1);
        }
        akrd.a(this.getContext()).j(10, this.al);
        lup.a(this).c(1, null, this);
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 4) {
            if(v1 == -1) {
                akrd.a(this.getContext()).j(13, this.al);
                this.y(2);
                return;
            }
            this.y(1);
        }
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        this.y(0);
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        ProgressDialog progressDialog0 = new ProgressDialog(this.getContext());
        this.ah = progressDialog0;
        progressDialog0.setTitle(this.getArguments().getCharSequence("title"));
        this.ah.setMessage(this.getArguments().getCharSequence("message"));
        this.ah.setProgressStyle(1);
        this.ah.setCancelable(true);
        this.ah.setCanceledOnTouchOutside(false);
        this.ah.setProgressNumberFormat(null);
        this.ah.setButton(-2, this.getText(0x7F1507F2), new akpp(this));  // string:common_cancel "Cancel"
        return this.ah;
    }

    final void y(int v) {
        if(((EmmChimeraActivity)this.getContext()) != null) {
            EmmChimeraActivity emmChimeraActivity0 = (EmmChimeraActivity)this.getContext();
            emmChimeraActivity0.m.d = null;
            if(v == 3) {
                emmChimeraActivity0.u();
            }
            else if(v == 1) {
                emmChimeraActivity0.s();
            }
            else if(v == 2) {
                emmChimeraActivity0.w(-1);
            }
            if(!hpwe.h()) {
                long v1 = emmChimeraActivity0.p;
                ((DownloadManager)emmChimeraActivity0.getSystemService("download")).remove(new long[]{v1});
                emmChimeraActivity0.m.c = -1L;
            }
            emmChimeraActivity0.m.b = null;
        }
        this.dismissAllowingStateLoss();
    }

    public final void z(int v) {
        ProgressDialog progressDialog0 = this.ah;
        if(progressDialog0 != null) {
            progressDialog0.setMessage(this.getArguments().getCharSequence("message"));
            this.ah.setProgress(v);
        }
    }
}

