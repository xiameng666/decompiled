import android.os.Bundle;

public final class beue implements beug {
    private final xob a;

    public beue(xob xob0) {
        this.a = xob0;
    }

    @Override  // beug
    public final void a() {
        this.a.getSupportFragmentManager().U();
    }

    @Override  // beug
    public final void b(beuf beuf0) {
        ibuq.f(beuf0, "targetScreen");
        ibuq.f(beuf0, "targetScreen");
        this.c(beuf0, false, null);
    }

    @Override  // beug
    public final void c(beuf beuf0, boolean z, Bundle bundle0) {
        String s;
        bfve bfve0;
        ibuq.f(beuf0, "targetScreen");
        switch(beuf0.ordinal()) {
            case 0: {
                bfve0 = new bfve();
                s = "PWMLoadingScreenFragment";
                break;
            }
            case 1: {
                bfve0 = new bftu();
                s = "PWMErrorScreenFragment";
                break;
            }
            case 2: {
                bfve0 = new bfxo();
                s = "PWMPwdListFragment";
                break;
            }
            case 3: {
                bfve0 = new bfzg();
                s = "PWMSearchScreenFragment";
                break;
            }
            case 4: {
                bfve0 = new bfql();
                s = "PWMAddCredScrnFrgmnt";
                break;
            }
            case 5: {
                bfve0 = new bgad();
                s = "PWMSettingsScreenFragment";
                break;
            }
            case 6: {
                bfve0 = new bfqx();
                s = "PWMAffiliatedGroupDetailsScreenFragment";
                break;
            }
            case 7: {
                bfve0 = new bfto();
                s = "PWMCredEditScrnFrgmnt";
                break;
            }
            case 8: {
                bfve0 = new bfyb();
                s = "PWMPickerScreenFragment";
                break;
            }
            case 9: {
                bfve0 = new bfsp();
                s = "PWMCheckupScreenFragment";
                break;
            }
            case 10: {
                bfve0 = new bfwo();
                s = "PWMPasskeyWizardScreenFragment";
                break;
            }
            case 11: {
                bfve0 = new bfvk();
                s = "PWMPasskeyWizardDemoEntryScreenFragment";
                break;
            }
            case 12: {
                bfve0 = new bfwd();
                s = "PWMPasskeyWizardDemoScreenFragment";
                break;
            }
            case 13: {
                bfve0 = new bezc();
                s = "PWMImportScreenFragment";
                break;
            }
            case 14: {
                bfve0 = new bdmb();
                s = "PWMImportCredentialsScreenFragment";
                break;
            }
            case 15: {
                bfve0 = new bddc();
                s = "MovePasswordsScreenFragment";
                break;
            }
            case 16: {
                bfve0 = new bfuk();
                s = "PWMHomeScreenFragment";
                break;
            }
            case 17: {
                bfve0 = new bfnq();
                s = "PWMReauthFragment";
                break;
            }
            default: {
                throw new IllegalStateException("The given target screen to navigate to is undefined.");
            }
        }
        if(bundle0 != null) {
            Bundle bundle1 = bfve0.getArguments();
            if(bundle1 != null) {
                bundle0.putAll(bundle1);
            }
            bfve0.setArguments(bundle0);
        }
        ca ca0 = new ca(this.a.getSupportFragmentManager());
        ca0.z(0x7F0B1889, bfve0, s);  // id:main_container
        ca0.w(s);
        ca0.j = hsaj.c() || z ? 0 : 0x1001;
        ca0.a();
    }
}

