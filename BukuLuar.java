import java.time.LocalDate;

public class BukuLuar extends Buku {
    private String imporOleh;
    private LocalDate tglImpor;

    public BukuLuar(String idBuku, String namaBuku){
        super(idBuku, namaBuku);
    }


    public void setImporOleh (String importOleh){
        this.imporOleh = importOleh;
    }

    public String getmporOleh(){
        return imporOleh;
    }

    public void setTglImpor (LocalDate tglImpor){
        this.tglImpor = tglImpor;
    }

    public LocalDate getTglImpor(){
        return tglImpor;
    }
}

