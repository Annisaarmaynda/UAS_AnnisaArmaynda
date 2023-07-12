public abstract class Peminjam implements UserLogin{
    
    private boolean isLogin;
    private boolean isAntiDenda;

    @Override 
    public void doLogin(){
        System.out.println("Peminjam berhasil login");
        isLogin = true;
    }

    @Override
    public void doLogout(){
        System.out.println("Peminjam berhasil logout");
        isLogin = false;
    }

    @Override
    public boolean isLogin (){
        return isLogin;
    }

    public abstract void setKodePeminjam (String kodePeminjam);
    public abstract String getKodePeminjam();
    public abstract void setNamaPeminjam (String namaPeminjam);
    public abstract String getNamaPeminjam();
    // public abstract void addAntiDenda();
    // public abstract void removeAntiDenda();
    // public abstract boolean getAntiDenda();

    public void addAntiDenda (){

    }
        
    public void removeAntiDenda(){
        
    }

    public boolean getAntiDenda(){
        return isAntiDenda;
    }
}

