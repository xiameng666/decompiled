import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;

public abstract class fxmn extends du implements AudioManager.OnAudioFocusChangeListener {
    private AudioManager a;
    public EAlertUxArgs ag;
    protected boolean ah;
    protected boolean ai;
    public CountDownTimer aj;
    public MediaPlayer ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private AudioFocusRequest aq;
    private int ar;
    private boolean as;
    protected static final bboh b;
    public xni c;
    protected View d;

    static {
        fxmn.b = bboh.c("EAlert", bbcu.g, "TAF");
    }

    protected abstract void A();

    protected abstract void B();

    protected abstract void C();

    protected abstract void D(LayoutInflater arg1, ViewGroup arg2);

    public final void E() {
        CountDownTimer countDownTimer0 = this.aj;
        if(countDownTimer0 != null) {
            countDownTimer0.cancel();
            this.aj = null;
        }
    }

    protected final void F() {
        if(huqb.z()) {
            this.as = true;
        }
        MediaPlayer mediaPlayer0 = this.ak;
        if(mediaPlayer0 != null) {
            mediaPlayer0.release();
            this.ai = false;
        }
        try {
            if(this.G()) {
                AudioManager audioManager0 = this.a;
                if(audioManager0 != null) {
                    audioManager0.setMode(this.ap);
                    this.a.setStreamVolume(this.ar, this.al, 0);
                    if(huqb.R()) {
                        this.a.setStreamVolume(3, this.ao, 0);
                        this.a.setStreamVolume(0, this.am, 0);
                        this.a.setStreamVolume(2, this.an, 0);
                    }
                    AudioFocusRequest audioFocusRequest0 = this.aq;
                    if(audioFocusRequest0 != null) {
                        this.a.abandonAudioFocusRequest(audioFocusRequest0);
                        return;
                    }
                    this.a.abandonAudioFocus(this);
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
    }

    private final boolean G() {
        bayn bayn0 = bayn.f(this.c);
        if(bayn0 == null) {
            return false;
        }
        return bayn0.B() ? true : bayn0.a() == 1;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
        if(v != 1) {
            return;
        }
        this.z();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        boolean z1;
        xni xni0 = (xni)this.requireContext();
        this.c = xni0;
        this.a = (AudioManager)xni0.getSystemService("audio");
        EAlertUxArgs eAlertUxArgs0 = fxmp.b(this.c.getIntent().getExtras());
        if(eAlertUxArgs0 == null) {
            return null;
        }
        this.ag = eAlertUxArgs0;
        Bundle bundle1 = this.c.getIntent().getExtras();
        boolean z = true;
        if(bundle1 == null) {
            z1 = false;
        }
        else {
            String s = bundle1.getString("EALERT_UX_EXTRA");
            z1 = !TextUtils.isEmpty(s) && s.equals("EALERT_DEMO");
        }
        this.ah = z1;
        this.C();
        if(huqb.z()) {
            if(bundle0 == null || !bundle0.getBoolean("soundIsMutedOrFinished")) {
                z = false;
            }
            this.as = z;
            if(!z) {
                this.y();
            }
        }
        else {
            this.y();
        }
        this.D(layoutInflater0, viewGroup0);
        if(!this.ah) {
            this.aj = new fxmm(this, this.ag.j).start();
        }
        return this.d;
    }

    @Override  // du
    public void onDestroy() {
        super.onDestroy();
        if(this.ag != null && this.aj != null) {
            fxmt.b().a(this.ag.h, this.ag.i, this.ag.k, 3);
        }
        this.E();
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        if(huqb.z() && this.as) {
            bundle0.putBoolean("soundIsMutedOrFinished", true);
        }
    }

    private final void y() {
        AudioDeviceInfo audioDeviceInfo0;
        MediaPlayer mediaPlayer0;
        AudioManager audioManager0 = this.a;
        if(audioManager0 == null) {
            return;
        }
        this.ar = (int)huqb.a.s().J();
        this.ao = audioManager0.getStreamVolume(3);
        this.am = audioManager0.getStreamVolume(0);
        this.an = audioManager0.getStreamVolume(2);
        this.al = audioManager0.getStreamVolume(this.ar);
        this.ap = audioManager0.getMode();
        AudioAttributes audioAttributes0 = new AudioAttributes.Builder().setUsage(((int)huqb.k())).setContentType(((int)huqb.j())).build();
        try {
            if(this.G()) {
                AudioManager audioManager1 = this.a;
                if(audioManager1 != null) {
                    AudioDeviceInfo[] arr_audioDeviceInfo = audioManager1.getDevices(2);
                    int v1 = 0;
                    while(v1 < arr_audioDeviceInfo.length) {
                        switch(arr_audioDeviceInfo[v1].getType()) {
                            case 3: 
                            case 4: 
                            case 7: 
                            case 8: {
                                goto label_20;
                            }
                        }
                        ++v1;
                        continue;
                    label_20:
                        if(audioAttributes0 == null) {
                            this.a.requestAudioFocus(this, this.ar, 2);
                            this.a.setMode(((int)huqb.l()));
                            this.z();
                            this.a.setSpeakerphoneOn(true);
                        }
                        else {
                            AudioFocusRequest audioFocusRequest0 = new AudioFocusRequest.Builder(4).setAudioAttributes(audioAttributes0).setOnAudioFocusChangeListener(this).setAcceptsDelayedFocusGain(true).build();
                            this.aq = audioFocusRequest0;
                            if(audioFocusRequest0 != null) {
                                switch(this.a.requestAudioFocus(audioFocusRequest0)) {
                                    case 1: {
                                        this.a.setSpeakerphoneOn(true);
                                        this.a.setMode(((int)huqb.l()));
                                        this.z();
                                        break;
                                    }
                                    case 0: 
                                    case 2: {
                                        this.z();
                                    }
                                }
                            }
                        }
                        goto label_40;
                    }
                }
                this.z();
            }
        }
        catch(SecurityException unused_ex) {
        }
    label_40:
        huqb huqb0 = huqb.a;
        if(Long.compare(Build.VERSION.SDK_INT, huqb0.s().z()) < 0) {
            mediaPlayer0 = MediaPlayer.create(this.c, 0x7F140275);  // raw:take_action_alert_sound
        }
        else if(audioAttributes0 != null) {
            mediaPlayer0 = MediaPlayer.create(this.c, 0x7F140275, audioAttributes0, this.a.generateAudioSessionId());  // raw:take_action_alert_sound
        }
        else {
            mediaPlayer0 = MediaPlayer.create(this.c, 0x7F140275);  // raw:take_action_alert_sound
        }
        this.ak = mediaPlayer0;
        if(huqb0.s().aT()) {
            AudioDeviceInfo[] arr_audioDeviceInfo1 = this.a.getDevices(2);
            for(int v = 0; true; ++v) {
                audioDeviceInfo0 = null;
                if(v >= arr_audioDeviceInfo1.length) {
                    break;
                }
                AudioDeviceInfo audioDeviceInfo1 = arr_audioDeviceInfo1[v];
                if(audioDeviceInfo1.getType() == 2) {
                    audioDeviceInfo0 = audioDeviceInfo1;
                    break;
                }
            }
            if(audioDeviceInfo0 != null) {
                this.ak.setPreferredDevice(audioDeviceInfo0);
            }
        }
        this.ak.setLooping(true);
        this.ak.setOnPreparedListener(new fxmk(this));
        new fxml(this, huqb0.s().O()).start();
        this.ai = true;
    }

    private final void z() {
        this.a.setStreamVolume(this.ar, ((int)Math.round(((double)this.a.getStreamMaxVolume(this.ar)) * huqb.b())), 0);
        if(huqb.R()) {
            this.a.setStreamVolume(3, ((int)Math.round(((double)this.a.getStreamMaxVolume(3)) * huqb.b())), 0);
            this.a.setStreamVolume(0, ((int)Math.round(((double)this.a.getStreamMaxVolume(0)) * huqb.b())), 0);
            this.a.setStreamVolume(2, ((int)Math.round(((double)this.a.getStreamMaxVolume(2)) * huqb.b())), 0);
        }
    }
}

