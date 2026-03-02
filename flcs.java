public final class flcs {
    public static fmap a(fmga fmga0) {
        fmao fmao0 = new fmao(null);
        fmfr fmfr0 = fmga0.f;
        int v = fmfr0.a() - 1;
        if(v == 1) {
            fmao0.c(2);
        }
        else {
        alab1:
            switch(v) {
                case 2: {
                    switch(fmfr0.b().a) {
                        case "photos": {
                            fmao0.c(3);
                            break alab1;
                        }
                        case "rich_card": {
                            fmao0.c(9);
                            break alab1;
                        }
                        default: {
                            fmao0.c(0);
                            break alab1;
                        }
                    }
                }
                case 3: {
                    fmao0.c(7);
                    break;
                }
                default: {
                    if(v == 4) {
                        fmao0.c(8);
                    }
                    else {
                        fmao0.c(0);
                    }
                }
            }
        }
        fmao0.d(fmga0.l);
        fmao0.b(fmga0.k.a().g);
        return fmao0.a();
    }
}

