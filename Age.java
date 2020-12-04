import java.text.SimpleDateFormat;
import java.util.Date;
public class Age {
    private int yearBirth, yearNow;
    private String red = "\u001B[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        int umur=yearNow - yearBirth;
        return umur;
    }
    
    public String tandanyaKamu(int umur){
        String dukun = "";
        if(0<=umur&&umur<=5){
            dukun = "LAGI LUCU-LUCUNYA";
        }else if(5<umur&&umur<=10){
            dukun = "MASIH ANAK-ANAK";
        }else if(10<umur&&umur<=13){
            dukun = "MASIH REMADJA";
        }else if(13<umur&&umur<=19){
            dukun = "ALAY";
        }else if(19<umur&&umur<=29){
            dukun = "LAGI SIBUK NYARI JODOH";
        }else if(29<umur&&umur<=35){
            dukun = "LAGI SIBUK NYARI UANG";
        }else if(35<umur&&umur<=150){
            dukun = "SUDAH TUA";
        }else{
        }
        return red+dukun;
    }
}