public abstract class gark extends gann {
    @Override  // gann
    protected final boolean E(gano gano0) {
        String s = gano0.g();
        switch(s.hashCode()) {
            case -1008936477: {
                return s.equals("LaunchGoogleHelpAction");
            }
            case 0xD0AA1EC7: {
                return s.equals("CredentialPresentationAction");
            }
            case 0xDB374302: {
                return s.equals("tokenizeInstrument");
            }
            case 0xDE19ED2B: {
                return s.equals("RequestPermissionsAction");
            }
            case -262008184: {
                return s.equals("TokenizeCardWithToken");
            }
            case 0x231CE68F: {
                return s.equals("DialNumberAction");
            }
            case 0x4E5478F2: {
                return s.equals("tokenizeAccount");
            }
            case 0x5DC77FB5: {
                return s.equals("startActivityForResult");
            }
            case 1721620818: {
                return s.equals("RedirectAction");
            }
            case 0x6D99C302: {
                return s.equals("LoadO1WidgetAction");
            }
            case 0x7AF044EE: {
                return s.equals("BiometricAction");
            }
            default: {
                return false;
            }
        }
    }

    @Override  // gann
    protected final void F() {
        throw null;
    }
}

