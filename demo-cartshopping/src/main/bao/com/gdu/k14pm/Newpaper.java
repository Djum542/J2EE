package com.gdu.k14pm;
import java.time.Period;
import java.util.Set;

/**
 * NewpaperControler
 */
public class Newpaper {
    private int maTT;
    private String tieuDe;
    private String noidungTT;
    private String lienKet;
    private int maDM;
    public NewpaperControler(int maTT, String tieuDe, String noidungTT, String lienKet, int maDM) {
        this.maTT = maTT;
        this.tieuDe = tieuDe;
        this.noidungTT = noidungTT;
        this.lienKet = lienKet;
        this.maDM = maDM;
    }
    public void setLienKet(String lienKet) {
        this.lienKet = lienKet;
    }
    public String getLienKet() {
        return lienKet;
    }
    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }
    public void setMaTT(int maTT) {
        this.maTT = maTT;
    }
    public int getMaDM() {
        return maDM;
    }
    public void setNoidungTT(String noidungTT) {
        this.noidungTT = noidungTT;
    }
    public int getMaTT() {
        return maTT;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getNoidungTT() {
        return noidungTT;
    }
    
}