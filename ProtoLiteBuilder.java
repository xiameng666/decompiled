import com.google.android.gms.ads.cache.p;
import com.google.android.gms.ads.cache.q;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ProtoLiteBuilder extends hfrj implements acmo, aqff, exmv, gqhh, MessageLiteOrBuilder, hhyn, hktr {
    public final ProtoLiteMessage a_defaultInstance;
    public ProtoLiteMessage b_message;

    public ProtoLiteBuilder() {
        throw null;
    }

    public ProtoLiteBuilder(ProtoLiteMessage msg) {
        this.a_defaultInstance = msg;
        if(msg.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b_message = this.P_newInstance();
    }

    public ProtoLiteBuilder(byte[] arr_b) {
        this(aqet.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, byte[] arr_b1) {
        this(cyxt.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, char[] arr_c) {
        this(gyoh.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, float[] arr_f) {
        this(aolw.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, int[] arr_v) {
        this(gkwb.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, short[] arr_v) {
        this(gdmb.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, boolean[] arr_z) {
        this(hjrn.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, byte[][] arr2_b) {
        this(gijq.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, char[][] arr2_c) {
        this(glkw.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, float[][] arr2_f) {
        this(hgfv.b);
    }

    public ProtoLiteBuilder(byte[] arr_b, int[][] arr2_v) {
        this(bqat.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, short[][] arr2_v) {
        this(hkte.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, boolean[][] arr2_z) {
        this(feyx.a);
    }

    public ProtoLiteBuilder(byte[] arr_b, byte[][][] arr3_b) {
        this(idat.a);
    }

    public ProtoLiteBuilder(char[] arr_c) {
        this(awbu.a);
    }

    public ProtoLiteBuilder(char[] arr_c, byte[] arr_b) {
        this(fgdt.a);
    }

    public ProtoLiteBuilder(char[] arr_c, char[] arr_c1) {
        this(hjie.a);
    }

    public ProtoLiteBuilder(char[] arr_c, float[] arr_f) {
        this(bhyk.a);
    }

    public ProtoLiteBuilder(char[] arr_c, int[] arr_v) {
        this(gryj.a);
    }

    public ProtoLiteBuilder(char[] arr_c, short[] arr_v) {
        this(emla.a);
    }

    public ProtoLiteBuilder(char[] arr_c, boolean[] arr_z) {
        this(artk.a);
    }

    public ProtoLiteBuilder(char[] arr_c, byte[][] arr2_b) {
        this(ewri.a);
    }

    public ProtoLiteBuilder(char[] arr_c, char[][] arr2_c) {
        this(gtdx.a);
    }

    public ProtoLiteBuilder(char[] arr_c, float[][] arr2_f) {
        this(hbyp.a);
    }

    public ProtoLiteBuilder(char[] arr_c, int[][] arr2_v) {
        this(crsd.a);
    }

    public ProtoLiteBuilder(char[] arr_c, short[][] arr2_v) {
        this(asbo.a);
    }

    public ProtoLiteBuilder(char[] arr_c, boolean[][] arr2_z) {
        this(ejbw.a);
    }

    public ProtoLiteBuilder(char[] arr_c, byte[][][] arr3_b) {
        this(awbb.a);
    }

    public ProtoLiteBuilder(float[] arr_f) {
        this(cyxn.a);
    }

    public ProtoLiteBuilder(float[] arr_f, byte[] arr_b) {
        this(gwtg.a);
    }

    public ProtoLiteBuilder(float[] arr_f, char[] arr_c) {
        this(geew.a);
    }

    public ProtoLiteBuilder(float[] arr_f, float[] arr_f1) {
        this(dxec.a);
    }

    public ProtoLiteBuilder(float[] arr_f, int[] arr_v) {
        this(hjgk.a);
    }

    public ProtoLiteBuilder(float[] arr_f, short[] arr_v) {
        this(grwa.a);
    }

    public ProtoLiteBuilder(float[] arr_f, boolean[] arr_z) {
        this(gezv.a);
    }

    public ProtoLiteBuilder(float[] arr_f, byte[][] arr2_b) {
        this(ajxc.a);
    }

    public ProtoLiteBuilder(float[] arr_f, char[][] arr2_c) {
        this(asbl.a);
    }

    public ProtoLiteBuilder(float[] arr_f, float[][] arr2_f) {
        this(apap.a);
    }

    public ProtoLiteBuilder(float[] arr_f, int[][] arr2_v) {
        this(dxfb.a);
    }

    public ProtoLiteBuilder(float[] arr_f, short[][] arr2_v) {
        this(gjdw.a);
    }

    public ProtoLiteBuilder(float[] arr_f, boolean[][] arr2_z) {
        this(gwhg.a);
    }

    public ProtoLiteBuilder(float[] arr_f, byte[][][] arr3_b) {
        this(gknn.a);
    }

    public ProtoLiteBuilder(int[] arr_v) {
        this(fwhk.a);
    }

    public ProtoLiteBuilder(int[] arr_v, byte[] arr_b) {
        this(grvk.a);
    }

    public ProtoLiteBuilder(int[] arr_v, char[] arr_c) {
        this(awby.a);
    }

    public ProtoLiteBuilder(int[] arr_v, float[] arr_f) {
        this(girt.a);
    }

    public ProtoLiteBuilder(int[] arr_v, int[] arr_v1) {
        this(hdua.a);
    }

    public ProtoLiteBuilder(int[] arr_v, short[] arr_v1) {
        this(fhbj.a);
    }

    public ProtoLiteBuilder(int[] arr_v, boolean[] arr_z) {
        this(awjn.a);
    }

    public ProtoLiteBuilder(int[] arr_v, byte[][] arr2_b) {
        this(fqzv.b);
    }

    public ProtoLiteBuilder(int[] arr_v, char[][] arr2_c) {
        this(gzsp.a);
    }

    public ProtoLiteBuilder(int[] arr_v, float[][] arr2_f) {
        this(anzw.a);
    }

    public ProtoLiteBuilder(int[] arr_v, int[][] arr2_v) {
        this(gjrn.a);
    }

    public ProtoLiteBuilder(int[] arr_v, short[][] arr2_v) {
        this(bqas.a);
    }

    public ProtoLiteBuilder(int[] arr_v, boolean[][] arr2_z) {
        this(gqqe.a);
    }

    public ProtoLiteBuilder(int[] arr_v, byte[][][] arr3_b) {
        this(bszp.a);
    }

    public ProtoLiteBuilder(short[] arr_v) {
        this(bwpn.a);
    }

    public ProtoLiteBuilder(short[] arr_v, byte[] arr_b) {
        this(gkpm.a);
    }

    public ProtoLiteBuilder(short[] arr_v, char[] arr_c) {
        this(aqex.a);
    }

    public ProtoLiteBuilder(short[] arr_v, float[] arr_f) {
        this(cpfn.a);
    }

    public ProtoLiteBuilder(short[] arr_v, int[] arr_v1) {
        this(ajaz.a);
    }

    public ProtoLiteBuilder(short[] arr_v, short[] arr_v1) {
        this(dash.a);
    }

    public ProtoLiteBuilder(short[] arr_v, boolean[] arr_z) {
        this(aokj.a);
    }

    public ProtoLiteBuilder(short[] arr_v, byte[][] arr2_b) {
        this(dkal.a);
    }

    public ProtoLiteBuilder(short[] arr_v, char[][] arr2_c) {
        this(hery.a);
    }

    public ProtoLiteBuilder(short[] arr_v, float[][] arr2_f) {
        this(idcp.a);
    }

    public ProtoLiteBuilder(short[] arr_v, int[][] arr2_v) {
        this(anzo.a);
    }

    public ProtoLiteBuilder(short[] arr_v, short[][] arr2_v) {
        this(aoly.a);
    }

    public ProtoLiteBuilder(short[] arr_v, boolean[][] arr2_z) {
        this(ftow.a);
    }

    public ProtoLiteBuilder(short[] arr_v, byte[][][] arr3_b) {
        this(aqdq.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z) {
        this(ejyo.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, byte[] arr_b) {
        this(hbzw.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, char[] arr_c) {
        this(byfo.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, float[] arr_f) {
        this(exod.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, int[] arr_v) {
        this(gxoh.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, short[] arr_v) {
        this(gkro.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, boolean[] arr_z1) {
        this(cllz.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, byte[][] arr2_b) {
        this(glna.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, char[][] arr2_c) {
        this(hklb.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, float[][] arr2_f) {
        this(avuo.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, int[][] arr2_v) {
        this(fbba.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, short[][] arr2_v) {
        this(cptr.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, boolean[][] arr2_z) {
        this(ajwt.a);
    }

    public ProtoLiteBuilder(boolean[] arr_z, byte[][][] arr3_b) {
        this(ctek.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b) {
        this(ffrm.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, byte[] arr_b) {
        this(hhma.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, char[] arr_c) {
        this(emny.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, float[] arr_f) {
        this(fsyf.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, int[] arr_v) {
        this(arad.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, short[] arr_v) {
        this(hdil.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, boolean[] arr_z) {
        this(etnc.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, byte[][] arr2_b1) {
        this(gtiw.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, char[][] arr2_c) {
        this(aime.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, float[][] arr2_f) {
        this(bsms.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, int[][] arr2_v) {
        this(ftbb.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, short[][] arr2_v) {
        this(eygr.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, boolean[][] arr2_z) {
        this(hguo.a);
    }

    public ProtoLiteBuilder(byte[][] arr2_b, byte[][][] arr3_b) {
        this(ajar.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c) {
        this(gkph.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, byte[] arr_b) {
        this(aqhv.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, char[] arr_c) {
        this(dbvc.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, float[] arr_f) {
        this(glnb.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, int[] arr_v) {
        this(aoju.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, short[] arr_v) {
        this(gxkj.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, boolean[] arr_z) {
        this(dcjk.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, byte[][] arr2_b) {
        this(hffu.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, char[][] arr2_c1) {
        this(aolt.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, float[][] arr2_f) {
        this(andr.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, int[][] arr2_v) {
        this(gocg.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, short[][] arr2_v) {
        this(dxeo.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, boolean[][] arr2_z) {
        this(hbyy.a);
    }

    public ProtoLiteBuilder(char[][] arr2_c, byte[][][] arr3_b) {
        this(fexe.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f) {
        this(hhdt.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, byte[] arr_b) {
        this(gera.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, char[] arr_c) {
        this(hdtt.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, float[] arr_f) {
        this(hlpf.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, int[] arr_v) {
        this(epng.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, short[] arr_v) {
        this(aoim.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, boolean[] arr_z) {
        this(gliz.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, byte[][] arr2_b) {
        this(aolc.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, char[][] arr2_c) {
        this(exmt.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, float[][] arr2_f1) {
        this(fbbi.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, int[][] arr2_v) {
        this(idaj.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, short[][] arr2_v) {
        this(anjs.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, boolean[][] arr2_z) {
        this(ctef.a);
    }

    public ProtoLiteBuilder(float[][] arr2_f, byte[][][] arr3_b) {
        this(gutq.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v) {
        this(hbyx.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, byte[] arr_b) {
        this(awiw.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, char[] arr_c) {
        this(gkvz.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, float[] arr_f) {
        this(hfxm.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, int[] arr_v) {
        this(bzyi.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, short[] arr_v) {
        this(alvg.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, boolean[] arr_z) {
        this(ammf.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, byte[][] arr2_b) {
        this(hksz.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, char[][] arr2_c) {
        this(cpfl.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, float[][] arr2_f) {
        this(ajbw.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, int[][] arr2_v1) {
        this(hgdi.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, short[][] arr2_v1) {
        this(glnj.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, boolean[][] arr2_z) {
        this(apdm.a);
    }

    public ProtoLiteBuilder(int[][] arr2_v, byte[][][] arr3_b) {
        this(ftjh.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v) {
        this(grax.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, byte[] arr_b) {
        this(aojj.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, char[] arr_c) {
        this(fjco.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, float[] arr_f) {
        this(gucl.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, int[] arr_v) {
        this(awjj.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, short[] arr_v) {
        this(hhmc.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, boolean[] arr_z) {
        this(anjp.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, byte[][] arr2_b) {
        this(hadb.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, char[][] arr2_c) {
        this(bayr.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, float[][] arr2_f) {
        this(crsq.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, int[][] arr2_v1) {
        this(gujd.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, short[][] arr2_v1) {
        this(ftaj.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, boolean[][] arr2_z) {
        this(avvg.a);
    }

    public ProtoLiteBuilder(short[][] arr2_v, byte[][][] arr3_b) {
        this(egnn.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z) {
        this(gwpa.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, byte[] arr_b) {
        this(bzpb.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, char[] arr_c) {
        this(grxh.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, float[] arr_f) {
        this(hait.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, int[] arr_v) {
        this(geww.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, short[] arr_v) {
        this(aqhp.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, boolean[] arr_z) {
        this(fqzc.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, byte[][] arr2_b) {
        this(artu.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, char[][] arr2_c) {
        this(gilw.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, float[][] arr2_f) {
        this(gkai.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, int[][] arr2_v) {
        this(hbyf.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, short[][] arr2_v) {
        this(guep.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, boolean[][] arr2_z1) {
        this(bszf.a);
    }

    public ProtoLiteBuilder(boolean[][] arr2_z, byte[][][] arr3_b) {
        this(gokw.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b) {
        this(aqfe.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, byte[] arr_b) {
        this(enxq.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, char[] arr_c) {
        this(gxlb.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, float[] arr_f) {
        this(aryq.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, int[] arr_v) {
        this(dcjb.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, short[] arr_v) {
        this(awhr.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, boolean[] arr_z) {
        this(gslp.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, byte[][] arr2_b) {
        this(ayvv.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, char[][] arr2_c) {
        this(dpfs.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, float[][] arr2_f) {
        this(dyir.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, int[][] arr2_v) {
        this(ajww.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, short[][] arr2_v) {
        this(hgbi.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, boolean[][] arr2_z) {
        this(gkaj.a);
    }

    public ProtoLiteBuilder(byte[][][] arr3_b, byte[][][] arr3_b1) {
        this(ajxj.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c) {
        this(andq.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, byte[] arr_b) {
        this(dciz.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, char[] arr_c) {
        this(hhyf.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, float[] arr_f) {
        this(ajbz.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, int[] arr_v) {
        this(fqcc.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, short[] arr_v) {
        this(bzpa.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, boolean[] arr_z) {
        this(held.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, byte[][] arr2_b) {
        this(clvi.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, char[][] arr2_c) {
        this(fsvb.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, float[][] arr2_f) {
        this(ftdj.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, int[][] arr2_v) {
        this(awbc.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, short[][] arr2_v) {
        this(amoi.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, boolean[][] arr2_z) {
        this(fbbj.a);
    }

    public ProtoLiteBuilder(char[][][] arr3_c, byte[][][] arr3_b) {
        this(hggf.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f) {
        this(emkq.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, byte[] arr_b) {
        this(heib.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, char[] arr_c) {
        this(byfl.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, float[] arr_f) {
        this(aoie.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, int[] arr_v) {
        this(gzdr.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, short[] arr_v) {
        this(fjhu.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, boolean[] arr_z) {
        this(alul.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, byte[][] arr2_b) {
        this(fqzo.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, char[][] arr2_c) {
        this(hadd.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, float[][] arr2_f) {
        this(hbyz.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, int[][] arr2_v) {
        this(gknv.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, short[][] arr2_v) {
        this(apag.a);
    }

    public ProtoLiteBuilder(float[][][] arr3_f, boolean[][] arr2_z) {
        this(gutg.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v) {
        this(byfr.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, byte[] arr_b) {
        this(glgl.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, char[] arr_c) {
        this(aoad.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, float[] arr_f) {
        this(ayvz.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, int[] arr_v) {
        this(gslb.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, short[] arr_v) {
        this(enwx.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, boolean[] arr_z) {
        this(hkao.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, byte[][] arr2_b) {
        this(ewmb.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, char[][] arr2_c) {
        this(guam.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, float[][] arr2_f) {
        this(gumy.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, int[][] arr2_v) {
        this(btwa.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, short[][] arr2_v) {
        this(iczu.a);
    }

    public ProtoLiteBuilder(int[][][] arr3_v, boolean[][] arr2_z) {
        this(ftdv.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v) {
        this(awbv.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, byte[] arr_b) {
        this(fpqy.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, char[] arr_c) {
        this(aqew.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, float[] arr_f) {
        this(aolq.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, int[] arr_v) {
        this(glik.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, short[] arr_v) {
        this(genc.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, boolean[] arr_z) {
        this(gzjr.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, byte[][] arr2_b) {
        this(gezx.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, char[][] arr2_c) {
        this(glnd.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, float[][] arr2_f) {
        this(gokm.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, int[][] arr2_v) {
        this(aqdu.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, short[][] arr2_v) {
        this(hals.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, boolean[][] arr2_z) {
        this(eagu.a);
    }

    public ProtoLiteBuilder(short[][][] arr3_v, byte[][][] arr3_b) {
        this(hbyv.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z) {
        this(gdki.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, byte[] arr_b) {
        this(gskp.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, char[] arr_c) {
        this(awbx.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, float[] arr_f) {
        this(cobt.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, int[] arr_v) {
        this(hejx.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, short[] arr_v) {
        this(dbwy.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, boolean[] arr_z) {
        this(asbn.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, byte[][] arr2_b) {
        this(dcjq.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, char[][] arr2_c) {
        this(hfjs.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, float[][] arr2_f) {
        this(hgdx.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, int[][] arr2_v) {
        this(cvxb.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, short[][] arr2_v) {
        this(atph.a);
    }

    public ProtoLiteBuilder(boolean[][][] arr3_z, boolean[][] arr2_z) {
        this(goku.a);
    }

    @Override  // hfrj
    public final void F(hfsl hfsl0, hftc hftc0) {
        this.W(hfsl0, hftc0);
    }

    @Override  // hfrj
    public final hfrj I(byte[] arr_b, int v) {
        this.bF(arr_b, v);
        return this;
    }

    @Override  // hfrj
    public final hfrj J(byte[] arr_b, int v, hftc hftc0) {
        this.Y(arr_b, v, hftc0);
        return this;
    }

    public final ProtoLiteBuilder M_clone() {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)this.a_defaultInstance.jf(5, null);
        hftp0.b_message = this.O_buildPartial();
        return hftp0;
    }

    public final ProtoLiteMessage N_build() {
        ProtoLiteMessage hftv0 = this.O_buildPartial();
        if(hftv0.isInitialized()) {
            return hftv0;
        }
        throw new hfwr();
    }

    public ProtoLiteMessage O_buildPartial() {
        if(!this.b_message.isImmutable()) {
            return this.b_message;
        }
        this.b_message.J_markImmutable();
        return this.b_message;
    }

    public final ProtoLiteMessage P_newInstance() {
        return this.a_defaultInstance.x_newMutableInstance();
    }

    @Override  // Builder
    public MessageLite build() {
        return this.N_build();
    }

    @Override  // Builder
    public MessageLite buildPartial() {
        return this.O_buildPartial();
    }

    @Override  // MessageLiteOrBuilder
    public final MessageLite S() {
        return this.a_defaultInstance;
    }

    public final void T() {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
    }

    public void ensureMutable() {
        ProtoLiteMessage hftv0 = this.P_newInstance();
        ProtoLiteBuilder.a(hftv0, this.b_message);
        this.b_message = hftv0;
    }

    @Override  // MessageLiteOrBuilder
    public final boolean isInitialized() {
        return ProtoLiteMessage.N(this.b_message, false);
    }

    public final void W(hfsl hfsl0, hftc hftc0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        try {
            hfvu.a.c(this.b_message).l(this.b_message, hfsm.p(hfsl0), hftc0);
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof IOException)) {
                throw (IOException)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
    }

    public final void X(ProtoLiteMessage hftv0) {
        if(!this.a_defaultInstance.equals(hftv0)) {
            if(!this.b_message.isImmutable()) {
                this.ensureMutable();
            }
            ProtoLiteBuilder.a(this.b_message, hftv0);
        }
    }

    public final void Y(byte[] arr_b, int v, hftc hftc0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        try {
            hfvu.a.c(this.b_message).i(this.b_message, arr_b, 0, v, new hfro(hftc0));
        }
        catch(hfur hfur0) {
            throw hfur0;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new hfur("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
        }
    }

    public final void Z(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        zs zs0 = (zs)this.b_message;
        hfuo hfuo0 = zs0.b;
        if(!hfuo0.c()) {
            zs0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, zs0.b);
    }

    private static void a(Object object0, Object object1) {
        hfvu.a.c(object0).h(object0, object1);
    }

    public final xkx aA(int v) {
        return (xkx)((xlk)this.b_message).B.get(v);
    }

    public final xla aB(int v) {
        return (xla)((xlk)this.b_message).t.get(v);
    }

    public final xlb aC(int v) {
        return (xlb)((xlk)this.b_message).m.get(v);
    }

    public final xle aD(int v) {
        return (xle)((xlk)this.b_message).o.get(v);
    }

    public final xll aE(int v) {
        return (xll)((xlk)this.b_message).i.get(v);
    }

    public final xlm aF(int v) {
        return (xlm)((xlk)this.b_message).l.get(v);
    }

    public final xln aG(int v) {
        return (xln)((xlk)this.b_message).k.get(v);
    }

    public final xlp aH(int v) {
        return (xlp)((xlk)this.b_message).j.get(v);
    }

    public final xlq aI(int v) {
        return (xlq)((xlk)this.b_message).u.get(v);
    }

    public final xlr aJ(int v) {
        return (xlr)((xlk)this.b_message).w.get(v);
    }

    public final void aK(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.b();
        hfrj.E(iterable0, xlk0.n);
    }

    public final void aL(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.c();
        hfrj.E(iterable0, xlk0.q);
    }

    public final void aM(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.d();
        hfrj.E(iterable0, xlk0.B);
    }

    public final void aN(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        hfuo hfuo0 = xlk0.x;
        if(!hfuo0.c()) {
            xlk0.x = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, xlk0.x);
    }

    public final void aO(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.e();
        hfrj.E(iterable0, xlk0.t);
    }

    public final void aP(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        hfuo hfuo0 = xlk0.r;
        if(!hfuo0.c()) {
            xlk0.r = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, xlk0.r);
    }

    public final void aQ(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.g();
        hfrj.E(iterable0, xlk0.o);
    }

    public final void aR(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.h();
        hfrj.E(iterable0, xlk0.s);
    }

    public final void aS(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        hfuo hfuo0 = xlk0.i;
        if(!hfuo0.c()) {
            xlk0.i = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, xlk0.i);
    }

    public final void aT(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.i();
        hfrj.E(iterable0, xlk0.l);
    }

    public final void aU(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.j();
        hfrj.E(iterable0, xlk0.k);
    }

    public final void aV(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.k();
        hfrj.E(iterable0, xlk0.j);
    }

    public final void aW(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.l();
        hfrj.E(iterable0, xlk0.u);
    }

    public final void aX(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlk0.m();
        hfrj.E(iterable0, xlk0.w);
    }

    public final void aY(int v, xks xks0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xks0.getClass();
        xlk0.b();
        xlk0.n.set(v, xks0);
    }

    public final void aZ(int v, xku xku0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xku0.getClass();
        xlk0.c();
        xlk0.q.set(v, xku0);
    }

    public final void aa(long v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        rfi rfi0 = (rfi)this.b_message;
        hfui hfui0 = rfi0.s;
        if(!hfui0.c()) {
            rfi0.s = ProtoLiteMessage.D(hfui0);
        }
        rfi0.s.g(v);
    }

    public final void ab(rfl rfl0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        rfi rfi0 = (rfi)this.b_message;
        rfl0.getClass();
        hfuo hfuo0 = rfi0.q;
        if(!hfuo0.c()) {
            rfi0.q = ProtoLiteMessage.E(hfuo0);
        }
        rfi0.q.add(rfl0);
    }

    public final void ac(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        sfy sfy0 = (sfy)this.b_message;
        hfuo hfuo0 = sfy0.m;
        if(!hfuo0.c()) {
            sfy0.m = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, sfy0.m);
    }

    public final void ad(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        sfy sfy0 = (sfy)this.b_message;
        hfuo hfuo0 = sfy0.i;
        if(!hfuo0.c()) {
            sfy0.i = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, sfy0.i);
    }

    public final void ae(sgo sgo0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        sgp sgp0 = (sgp)this.b_message;
        sgo0.getClass();
        hfuo hfuo0 = sgp0.b;
        if(!hfuo0.c()) {
            sgp0.b = ProtoLiteMessage.E(hfuo0);
        }
        sgp0.b.add(sgo0);
    }

    public final void af(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        wuy wuy0 = (wuy)this.b_message;
        hfuf hfuf0 = wuy0.e;
        if(!hfuf0.c()) {
            wuy0.e = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, wuy0.e);
    }

    public final void ag(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xde xde0 = (xde)this.b_message;
        hfuo hfuo0 = xde0.b;
        if(!hfuo0.c()) {
            xde0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, xde0.b);
    }

    public final void ah(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xdf xdf0 = (xdf)this.b_message;
        xdf0.b();
        hfrj.E(iterable0, xdf0.b);
    }

    public final void ai(xdc xdc0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xdf xdf0 = (xdf)this.b_message;
        xdc0.getClass();
        xdf0.b();
        xdf0.b.add(xdc0);
    }

    public final xev aj(int v) {
        return (xev)((xet)this.b_message).f.get(v);
    }

    public final void ak(int v, xev xev0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xet xet0 = (xet)this.b_message;
        xev0.getClass();
        xet0.b();
        xet0.f.set(v, xev0);
    }

    public final xet al(int v) {
        return (xet)((xeu)this.b_message).d.get(v);
    }

    public final xev am(int v) {
        return (xev)((xeu)this.b_message).e.get(v);
    }

    public final void an(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xeu xeu0 = (xeu)this.b_message;
        xeu0.b();
        hfrj.E(iterable0, xeu0.e);
    }

    public final void ao(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xeu xeu0 = (xeu)this.b_message;
        xeu0.c();
        hfrj.E(iterable0, xeu0.d);
    }

    public final void ap(int v, xet xet0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xeu xeu0 = (xeu)this.b_message;
        xet0.getClass();
        xeu0.c();
        xeu0.d.set(v, xet0);
    }

    public final xlm aq(int v) {
        return (xlm)((xkw)this.b_message).c.get(v);
    }

    public final xlc ar(int v) {
        return (xlc)((xld)this.b_message).e.get(v);
    }

    public final xlc as(int v) {
        return (xlc)((xld)this.b_message).d.get(v);
    }

    public final void at(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xld xld0 = (xld)this.b_message;
        xld0.c();
        hfrj.E(iterable0, xld0.d);
    }

    public final void au(xlc xlc0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xld xld0 = (xld)this.b_message;
        xlc0.getClass();
        xld0.c();
        xld0.d.add(xlc0);
    }

    public final xld av(int v) {
        return (xld)((xle)this.b_message).d.get(v);
    }

    public final void aw(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xle xle0 = (xle)this.b_message;
        xle0.b();
        hfrj.E(iterable0, xle0.d);
    }

    public final void ax(int v, xld xld0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xle xle0 = (xle)this.b_message;
        xld0.getClass();
        xle0.b();
        xle0.d.set(v, xld0);
    }

    public final xks ay(int v) {
        return (xks)((xlk)this.b_message).n.get(v);
    }

    public final xku az(int v) {
        return (xku)((xlk)this.b_message).q.get(v);
    }

    @Override  // acmo
    public final hfwn b() {
        hfwn hfwn0 = ((acmn)this.b_message).d;
        return hfwn0 == null ? hfwn.a : hfwn0;
    }

    public final void bA(String s, aiha aiha0) {
        s.getClass();
        aiha0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((aigx)this.b_message).b().put(s, aiha0);
    }

    public final void bB(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((aigx)this.b_message).b().remove(s);
    }

    public final void bC(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((aiha)this.b_message).b().remove(s);
    }

    public final void bD(int v, ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xkw xkw0 = (xkw)this.b_message;
        xlm xlm0 = (xlm)hftp0.N_build();
        xlm0.getClass();
        xkw0.c();
        xkw0.c.set(v, xlm0);
    }

    public final void bE(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        q q0 = (q)this.b_message;
        p p0 = (p)hftp0.N_build();
        p0.getClass();
        hfuo hfuo0 = q0.c;
        if(!hfuo0.c()) {
            q0.c = ProtoLiteMessage.E(hfuo0);
        }
        q0.c.add(p0);
    }

    public final void bF(byte[] arr_b, int v) {
        this.Y(arr_b, v, hftc.a);
    }

    public final void bG(aimh aimh0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aime aime0 = (aime)this.b_message;
        aimh0.getClass();
        aime0.c();
        aime0.b.add(aimh0);
    }

    public final void bH(ajaq ajaq0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ajar ajar0 = (ajar)this.b_message;
        ajaq0.getClass();
        hfuo hfuo0 = ajar0.c;
        if(!hfuo0.c()) {
            ajar0.c = ProtoLiteMessage.E(hfuo0);
        }
        ajar0.c.add(ajaq0);
    }

    public final ajbw bI(String s, ajbw ajbw0) {
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((ajbz)this.b_message).e);
        return map0.containsKey(s) ? ((ajbw)map0.get(s)) : ajbw0;
    }

    public final void bJ(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).b().putAll(map0);
    }

    public final void bK(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).c().putAll(map0);
    }

    public final void bL(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).d().putAll(map0);
    }

    public final void bM(String s, ByteString hfsf0) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).b().put(s, hfsf0);
    }

    public final void bN(String s, ajbw ajbw0) {
        s.getClass();
        ajbw0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).c().put(s, ajbw0);
    }

    public final void bO(String s, ajbp ajbp0) {
        s.getClass();
        ajbp0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).d().put(s, ajbp0);
    }

    public final void bP(String s, ajbc ajbc0) {
        s.getClass();
        ajbc0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).e().put(s, ajbc0);
    }

    public final void bQ(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).b().remove(s);
    }

    public final void bR(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).c().remove(s);
    }

    public final void bS(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbz)this.b_message).d().remove(s);
    }

    public final void bT(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbw)this.b_message).b().putAll(map0);
    }

    public final void bU(String s, ajbr ajbr0) {
        s.getClass();
        ajbr0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajbw)this.b_message).b().put(s, ajbr0);
    }

    public final void bV(String s, ajww ajww0) {
        s.getClass();
        ajww0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajwt)this.b_message).b().put(s, ajww0);
    }

    public final ajxj bW(String s, ajxj ajxj0) {
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((ajww)this.b_message).b);
        return map0.containsKey(s) ? ((ajxj)map0.get(s)) : ajxj0;
    }

    public final void bX(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ajww ajww0 = (ajww)this.b_message;
        hfuo hfuo0 = ajww0.c;
        if(!hfuo0.c()) {
            ajww0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ajww0.c);
    }

    public final void bY(String s, ajxj ajxj0) {
        s.getClass();
        ajxj0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajww)this.b_message).c().put(s, ajxj0);
    }

    public final void bZ(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajxc)this.b_message).c().remove(s);
    }

    public final void ba(int v, xle xle0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xle0.getClass();
        xlk0.g();
        xlk0.o.set(v, xle0);
    }

    public final void bb(int v, xlm xlm0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlm0.getClass();
        xlk0.i();
        xlk0.l.set(v, xlm0);
    }

    public final void bc(int v, xln xln0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xln0.getClass();
        xlk0.j();
        xlk0.k.set(v, xln0);
    }

    public final void bd(int v, xlp xlp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlp0.getClass();
        xlk0.k();
        xlk0.j.set(v, xlp0);
    }

    public final void be(int v, xlq xlq0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        xlk xlk0 = (xlk)this.b_message;
        xlq0.getClass();
        xlk0.l();
        xlk0.u.set(v, xlq0);
    }

    public final abzk bf(int v) {
        return (abzk)((abzl)this.b_message).b.get(v);
    }

    public final void bg(int v, abzk abzk0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        abzl abzl0 = (abzl)this.b_message;
        abzk0.getClass();
        abzl0.b();
        abzl0.b.set(v, abzk0);
    }

    public final acmm bh(String s, acmm acmm0) {
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((acmr)this.b_message).c);
        return map0.containsKey(s) ? ((acmm)map0.get(s)) : acmm0;
    }

    public final acmn bi(String s, acmn acmn0) {
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((acmr)this.b_message).b);
        return map0.containsKey(s) ? ((acmn)map0.get(s)) : acmn0;
    }

    public final acmn bj(String s) {
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((acmr)this.b_message).b);
        if(map0.containsKey(s)) {
            return (acmn)map0.get(s);
        }
        throw new IllegalArgumentException();
    }

    public final void bk(String s, acmm acmm0) {
        s.getClass();
        acmm0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((acmr)this.b_message).b().put(s, acmm0);
    }

    public final void bl(String s, acmn acmn0) {
        s.getClass();
        acmn0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((acmr)this.b_message).c().put(s, acmn0);
    }

    public final void bm(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((acmr)this.b_message).b().remove(s);
    }

    public final void bn(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((acmr)this.b_message).c().remove(s);
    }

    public final void bo(String s, adse adse0) {
        s.getClass();
        adse0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        adsc adsc0 = (adsc)this.b_message;
        hfvh hfvh0 = adsc0.c;
        if(!hfvh0.b) {
            adsc0.c = hfvh0.a();
        }
        adsc0.c.put(s, adse0);
    }

    public final void bp(String s, adsc adsc0) {
        s.getClass();
        adsc0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((adsg)this.b_message).b().put(s, adsc0);
    }

    public final void bq() {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        afoe afoe0 = (afoe)this.b_message;
        hfuo hfuo0 = afoe0.c;
        if(!hfuo0.c()) {
            afoe0.c = ProtoLiteMessage.E(hfuo0);
        }
        afoe0.c.add("delegate_permission/common.handle_all_urls");
    }

    public final void br(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        afoe afoe0 = (afoe)this.b_message;
        s.getClass();
        hfuo hfuo0 = afoe0.b;
        if(!hfuo0.c()) {
            afoe0.b = ProtoLiteMessage.E(hfuo0);
        }
        afoe0.b.add(s);
    }

    public final void bs(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        afoe afoe0 = (afoe)this.b_message;
        s.getClass();
        hfuo hfuo0 = afoe0.e;
        if(!hfuo0.c()) {
            afoe0.e = ProtoLiteMessage.E(hfuo0);
        }
        afoe0.e.add(s);
    }

    public final void bt(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        afoe afoe0 = (afoe)this.b_message;
        s.getClass();
        hfuo hfuo0 = afoe0.d;
        if(!hfuo0.c()) {
            afoe0.d = ProtoLiteMessage.E(hfuo0);
        }
        afoe0.d.add(s);
    }

    public final void bu(String s, ahxg ahxg0) {
        s.getClass();
        ahxg0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ahzg ahzg0 = (ahzg)this.b_message;
        hfvh hfvh0 = ahzg0.b;
        if(!hfvh0.b) {
            ahzg0.b = hfvh0.a();
        }
        ahzg0.b.put(s, ahxg0);
    }

    public final aigx bv(String s, aigx aigx0) {
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((aigv)this.b_message).b);
        return map0.containsKey(s) ? ((aigx)map0.get(s)) : aigx0;
    }

    public final void bw(String s, aigx aigx0) {
        s.getClass();
        aigx0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((aigv)this.b_message).c().put(s, aigx0);
    }

    public final void bx(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((aigv)this.b_message).b().remove(s);
    }

    public final void by(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((aigv)this.b_message).c().remove(s);
    }

    public final aiha bz(String s, aiha aiha0) {
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((aigx)this.b_message).b);
        return map0.containsKey(s) ? ((aiha)map0.get(s)) : aiha0;
    }

    @Override  // acmo
    public final hfwn c() {
        hfwn hfwn0 = ((acmn)this.b_message).e;
        return hfwn0 == null ? hfwn.a : hfwn0;
    }

    public final void cA(int v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aolc aolc0 = (aolc)this.b_message;
        hfuf hfuf0 = aolc0.e;
        if(!hfuf0.c()) {
            aolc0.e = ProtoLiteMessage.C(hfuf0);
        }
        aolc0.e.i(v - 2);
    }

    public final void cB(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aolq aolq0 = (aolq)this.b_message;
        hfuo hfuo0 = aolq0.e;
        if(!hfuo0.c()) {
            aolq0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, aolq0.e);
    }

    public final void cC(int v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aolt aolt0 = (aolt)this.b_message;
        hfuf hfuf0 = aolt0.c;
        if(!hfuf0.c()) {
            aolt0.c = ProtoLiteMessage.C(hfuf0);
        }
        aolt0.c.i(v);
    }

    public final void cD(aolt aolt0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aolw aolw0 = (aolw)this.b_message;
        aolt0.getClass();
        hfuo hfuo0 = aolw0.b;
        if(!hfuo0.c()) {
            aolw0.b = ProtoLiteMessage.E(hfuo0);
        }
        aolw0.b.add(aolt0);
    }

    public final void cE(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aoly aoly0 = (aoly)this.b_message;
        hfuf hfuf0 = aoly0.e;
        if(!hfuf0.c()) {
            aoly0.e = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, aoly0.e);
    }

    public final void cF(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        apag apag0 = (apag)this.b_message;
        hfuo hfuo0 = apag0.d;
        if(!hfuo0.c()) {
            apag0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, apag0.d);
    }

    public final void cG(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((apap)this.b_message).b().putAll(map0);
    }

    public final void cH(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        apap apap0 = (apap)this.b_message;
        hfvh hfvh0 = apap0.e;
        if(!hfvh0.b) {
            apap0.e = hfvh0.a();
        }
        apap0.e.putAll(map0);
    }

    public final void cI(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        apdm apdm0 = (apdm)this.b_message;
        hfuo hfuo0 = apdm0.i;
        if(!hfuo0.c()) {
            apdm0.i = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, apdm0.i);
    }

    public final void cJ(String s, aqhy aqhy0) {
        s.getClass();
        aqhy0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aqdu aqdu0 = (aqdu)this.b_message;
        hfvh hfvh0 = aqdu0.c;
        if(!hfvh0.b) {
            aqdu0.c = hfvh0.a();
        }
        aqdu0.c.put(s, aqhy0);
    }

    public final void cK(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aqet aqet0 = (aqet)this.b_message;
        aqeq aqeq0 = (aqeq)hftp0.N_build();
        aqeq0.getClass();
        aqet0.b();
        aqet0.f.add(aqeq0);
    }

    public final void cL(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aqet aqet0 = (aqet)this.b_message;
        aqfq aqfq0 = (aqfq)hftp0.N_build();
        aqfq0.getClass();
        hfuo hfuo0 = aqet0.g;
        if(!hfuo0.c()) {
            aqet0.g = ProtoLiteMessage.E(hfuo0);
        }
        aqet0.g.add(aqfq0);
    }

    public final void cM(aqet aqet0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)this.b_message;
        aqet0.getClass();
        aqfe0.c();
        aqfe0.l.add(aqet0);
    }

    public final aqet cN() {
        return (aqet)((aqfe)this.b_message).l.get(0);
    }

    public final void cO(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aqew aqew0 = (aqew)this.b_message;
        s.getClass();
        hfuo hfuo0 = aqew0.c;
        if(!hfuo0.c()) {
            aqew0.c = ProtoLiteMessage.E(hfuo0);
        }
        aqew0.c.add(s);
    }

    public final void cP(String s, aqhn aqhn0) {
        s.getClass();
        aqhn0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aqhp aqhp0 = (aqhp)this.b_message;
        hfvh hfvh0 = aqhp0.b;
        if(!hfvh0.b) {
            aqhp0.b = hfvh0.a();
        }
        aqhp0.b.put(s, aqhn0);
    }

    public final void cQ(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        arad arad0 = (arad)this.b_message;
        arao arao0 = (arao)hftp0.N_build();
        arao0.getClass();
        hfuo hfuo0 = arad0.c;
        if(!hfuo0.c()) {
            arad0.c = ProtoLiteMessage.E(hfuo0);
        }
        arad0.c.add(arao0);
    }

    public final void cR(String s, arti arti0) {
        s.getClass();
        arti0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        artk artk0 = (artk)this.b_message;
        hfvh hfvh0 = artk0.b;
        if(!hfvh0.b) {
            artk0.b = hfvh0.a();
        }
        artk0.b.put(s, arti0);
    }

    public final void cS(String s, arts arts0) {
        s.getClass();
        arts0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        artu artu0 = (artu)this.b_message;
        hfvh hfvh0 = artu0.c;
        if(!hfvh0.b) {
            artu0.c = hfvh0.a();
        }
        artu0.c.put(s, arts0);
    }

    public final void cT(aryn aryn0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aryq aryq0 = (aryq)this.b_message;
        aryn0.getClass();
        hfuo hfuo0 = aryq0.e;
        if(!hfuo0.c()) {
            aryq0.e = ProtoLiteMessage.E(hfuo0);
        }
        aryq0.e.add(aryn0);
    }

    public final void cU(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        asbl asbl0 = (asbl)this.b_message;
        asbk asbk0 = (asbk)hftp0.N_build();
        asbk0.getClass();
        hfuo hfuo0 = asbl0.b;
        if(!hfuo0.c()) {
            asbl0.b = ProtoLiteMessage.E(hfuo0);
        }
        asbl0.b.add(asbk0);
    }

    public final void cV(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        asbn asbn0 = (asbn)this.b_message;
        asbn0.b();
        hfrj.E(iterable0, asbn0.d);
    }

    public final void cW(String s, atpg atpg0) {
        s.getClass();
        atpg0.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        atph atph0 = (atph)this.b_message;
        hfvh hfvh0 = atph0.b;
        if(!hfvh0.b) {
            atph0.b = hfvh0.a();
        }
        atph0.b.put(s, atpg0);
    }

    public final void cX(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        avuo avuo0 = (avuo)this.b_message;
        s.getClass();
        hfuo hfuo0 = avuo0.q;
        if(!hfuo0.c()) {
            avuo0.q = ProtoLiteMessage.E(hfuo0);
        }
        avuo0.q.add(s);
    }

    public final void cY(int v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        avvg avvg0 = (avvg)this.b_message;
        hfuf hfuf0 = avvg0.f;
        if(!hfuf0.c()) {
            avvg0.f = ProtoLiteMessage.C(hfuf0);
        }
        avvg0.f.i(v - 1);
    }

    public final void cZ(String s, long v) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((awbb)this.b_message).b().put(s, Long.valueOf(v));
    }

    public final void ca(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajxc)this.b_message).d().remove(s);
    }

    public final void cb(String s) {
        s.getClass();
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((ajxc)this.b_message).e().remove(s);
    }

    public final void cc(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ajxj ajxj0 = (ajxj)this.b_message;
        hfuo hfuo0 = ajxj0.d;
        if(!hfuo0.c()) {
            ajxj0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ajxj0.d);
    }

    public final void cd(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        alul alul0 = (alul)this.b_message;
        alsv alsv0 = (alsv)hftp0.N_build();
        alsv0.getClass();
        hfuo hfuo0 = alul0.i;
        if(!hfuo0.c()) {
            alul0.i = ProtoLiteMessage.E(hfuo0);
        }
        alul0.i.add(alsv0);
    }

    public final void ce(alsw alsw0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        alvg alvg0 = (alvg)this.b_message;
        alsw0.getClass();
        hfuo hfuo0 = alvg0.b;
        if(!hfuo0.c()) {
            alvg0.b = ProtoLiteMessage.E(hfuo0);
        }
        alvg0.b.add(alsw0);
    }

    public final void cf(String s) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        amoi amoi0 = (amoi)this.b_message;
        s.getClass();
        hfuo hfuo0 = amoi0.i;
        if(!hfuo0.c()) {
            amoi0.i = ProtoLiteMessage.E(hfuo0);
        }
        amoi0.i.add(s);
    }

    public final void cg(andr andr0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andq andq0 = (andq)this.b_message;
        andr0.getClass();
        andq0.b();
        andq0.b.add(andr0);
    }

    public final void ch(andk andk0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andr andr0 = (andr)this.b_message;
        andk0.getClass();
        hfuo hfuo0 = andr0.h;
        if(!hfuo0.c()) {
            andr0.h = ProtoLiteMessage.E(hfuo0);
        }
        andr0.h.add(andk0);
    }

    public final void ci(andl andl0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andr andr0 = (andr)this.b_message;
        andl0.getClass();
        hfuo hfuo0 = andr0.c;
        if(!hfuo0.c()) {
            andr0.c = ProtoLiteMessage.E(hfuo0);
        }
        andr0.c.add(andl0);
    }

    public final void cj(andm andm0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andr andr0 = (andr)this.b_message;
        andm0.getClass();
        hfuo hfuo0 = andr0.d;
        if(!hfuo0.c()) {
            andr0.d = ProtoLiteMessage.E(hfuo0);
        }
        andr0.d.add(andm0);
    }

    public final void ck(andn andn0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andr andr0 = (andr)this.b_message;
        andn0.getClass();
        hfuo hfuo0 = andr0.e;
        if(!hfuo0.c()) {
            andr0.e = ProtoLiteMessage.E(hfuo0);
        }
        andr0.e.add(andn0);
    }

    public final void cl(andp andp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andr andr0 = (andr)this.b_message;
        andp0.getClass();
        hfuo hfuo0 = andr0.i;
        if(!hfuo0.c()) {
            andr0.i = ProtoLiteMessage.E(hfuo0);
        }
        andr0.i.add(andp0);
    }

    @Override  // hfrj
    public final Object clone() {
        return this.M_clone();
    }

    public final void cm(ands ands0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andr andr0 = (andr)this.b_message;
        ands0.getClass();
        hfuo hfuo0 = andr0.f;
        if(!hfuo0.c()) {
            andr0.f = ProtoLiteMessage.E(hfuo0);
        }
        andr0.f.add(ands0);
    }

    public final void cn(andt andt0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andr andr0 = (andr)this.b_message;
        andt0.getClass();
        hfuo hfuo0 = andr0.g;
        if(!hfuo0.c()) {
            andr0.g = ProtoLiteMessage.E(hfuo0);
        }
        andr0.g.add(andt0);
    }

    public final void co(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        anjp anjp0 = (anjp)this.b_message;
        hfuf hfuf0 = anjp0.e;
        if(!hfuf0.c()) {
            anjp0.e = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, anjp0.e);
    }

    public final void cp(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        anjs anjs0 = (anjs)this.b_message;
        hfvh hfvh0 = anjs0.b;
        if(!hfvh0.b) {
            anjs0.b = hfvh0.a();
        }
        anjs0.b.putAll(map0);
    }

    public final void cq(Map map0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        ((anjs)this.b_message).b().putAll(map0);
    }

    public final void cr(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        anzw anzw0 = (anzw)this.b_message;
        hfrn hfrn0 = (hfrn)hftp0.N_build();
        hfrn0.getClass();
        anzw0.b();
        anzw0.d.add(hfrn0);
    }

    public final void cs(aolo aolo0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aoie aoie0 = (aoie)this.b_message;
        aolo0.getClass();
        aoie0.b();
        aoie0.e.i(aolo0.a());
    }

    public final void ct(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aoim aoim0 = (aoim)this.b_message;
        hfuf hfuf0 = aoim0.f;
        if(!hfuf0.c()) {
            aoim0.f = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            aoim0.f.i(((aolv)object0).a());
        }
    }

    public final void cu(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aoim aoim0 = (aoim)this.b_message;
        hfuo hfuo0 = aoim0.e;
        if(!hfuo0.c()) {
            aoim0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, aoim0.e);
    }

    public final void cv(aojh aojh0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aojj aojj0 = (aojj)this.b_message;
        aojh0.getClass();
        hfuo hfuo0 = aojj0.j;
        if(!hfuo0.c()) {
            aojj0.j = ProtoLiteMessage.E(hfuo0);
        }
        aojj0.j.add(aojh0);
    }

    public final void cw(aolw aolw0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aojj aojj0 = (aojj)this.b_message;
        aolw0.getClass();
        hfuo hfuo0 = aojj0.d;
        if(!hfuo0.c()) {
            aojj0.d = ProtoLiteMessage.E(hfuo0);
        }
        aojj0.d.add(aolw0);
    }

    public final void cx(aoji aoji0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aojj aojj0 = (aojj)this.b_message;
        aoji0.getClass();
        hfuo hfuo0 = aojj0.h;
        if(!hfuo0.c()) {
            aojj0.h = ProtoLiteMessage.E(hfuo0);
        }
        aojj0.h.add(aoji0);
    }

    public final void cy(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aoju aoju0 = (aoju)this.b_message;
        hfuo hfuo0 = aoju0.g;
        if(!hfuo0.c()) {
            aoju0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, aoju0.g);
    }

    public final void cz(int v) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aokj aokj0 = (aokj)this.b_message;
        hfuf hfuf0 = aokj0.d;
        if(!hfuf0.c()) {
            aokj0.d = ProtoLiteMessage.C(hfuf0);
        }
        aokj0.d.i(v - 2);
    }

    @Override  // aqff
    public final boolean d() {
        return (((aqfe)this.b_message).b & 0x2000) != 0;
    }

    public final void da(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        awbu awbu0 = (awbu)this.b_message;
        awbu0.b();
        hfrj.E(iterable0, awbu0.d);
    }

    public final void db(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        awbu awbu0 = (awbu)this.b_message;
        hfuo hfuo0 = awbu0.c;
        if(!hfuo0.c()) {
            awbu0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, awbu0.c);
    }

    public final void dc(giju giju0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        awbu awbu0 = (awbu)this.b_message;
        giju0.getClass();
        awbu0.c();
        awbu0.b.add(giju0);
    }

    public final void dd(awbu awbu0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        awbv awbv0 = (awbv)this.b_message;
        awbu0.getClass();
        awbv0.b();
        awbv0.b.add(awbu0);
    }

    public final void de(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        awbx awbx0 = (awbx)this.b_message;
        awbx0.b();
        hfrj.E(iterable0, awbx0.b);
    }

    public final awiv df(int v) {
        return (awiv)((awiw)this.b_message).d.get(v);
    }

    public final void dg(int v, ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        awiw awiw0 = (awiw)this.b_message;
        awiv awiv0 = (awiv)hftp0.N_build();
        awiv0.getClass();
        awiw0.b();
        awiw0.d.set(v, awiv0);
    }

    public final void dh(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        awjn awjn0 = (awjn)this.b_message;
        awjn0.b();
        hfrj.E(iterable0, awjn0.e);
    }

    public final void di(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        andq andq0 = (andq)this.b_message;
        andr andr0 = (andr)hftp0.N_build();
        andr0.getClass();
        andq0.b();
        andq0.b.add(andr0);
    }

    public final void dj(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)this.b_message;
        aqet aqet0 = (aqet)hftp0.N_build();
        aqet0.getClass();
        aqfe0.c();
        aqfe0.l.add(aqet0);
    }

    public final void dk(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            this.ensureMutable();
        }
        asbo asbo0 = (asbo)this.b_message;
        asbn asbn0 = (asbn)hftp0.N_build();
        asbn0.getClass();
        asbo0.b();
        asbo0.c.add(asbn0);
    }

    @Override  // aqff
    public final boolean e() {
        return (((aqfe)this.b_message).b & 0x4000) != 0;
    }

    @Override  // aqff
    public final boolean f() {
        return (((aqfe)this.b_message).b & 0x40000) != 0;
    }

    @Override  // aqff
    public final boolean g() {
        return (((aqfe)this.b_message).b & 0x100000) != 0;
    }

    @Override  // aqff
    public final boolean h() {
        return (((aqfe)this.b_message).b & 0x1000) != 0;
    }

    @Override  // aqff
    public final List hx() {
        return DesugarCollections.unmodifiableList(((aqfe)this.b_message).l);
    }

    @Override  // aqff
    public final boolean i() {
        return (((aqfe)this.b_message).b & 0x20000) != 0;
    }

    @Override  // aqff
    public final boolean j() {
        return (((aqfe)this.b_message).b & 0x80000) != 0;
    }

    @Override  // hfrj
    public final hfrj v() {
        return this.M_clone();
    }

    @Override  // hfrj
    protected final hfrj w(hfrk hfrk0) {
        this.X(((ProtoLiteMessage)hfrk0));
        return this;
    }

    @Override  // hfrj
    public final hfrj z(hfsl hfsl0, hftc hftc0) {
        this.W(hfsl0, hftc0);
        return this;
    }
}

