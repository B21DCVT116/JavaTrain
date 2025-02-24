import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class TaiKhoan{
  private String id;
  private String tenTaiKhoan;
  private List danhSachGhiChu;
  private static int nextIDGhiChu=1;

  public TaiKhoan(String id, String tenTaiKhoan){
    this.id = id;
    this.tenTaiKhoan = tenTaiKhoan;
    this.danhSachGhiChu = new ArrayList<>();
  }
}

class GhiChu{
  private int id;
  private  String noiDungGhiChu;
  private String ngayGhiChu;
  

  public GhiChu(int id, String noiDung, String ngayGhiChu){
    this.id = id;
    this.noiDungGhiChu = noiDung;
    this.ngayGhiChu = ngayGhiChu;
  }
  public int getID(){
    return id;
  }
  public String getNoiDung(){
    return noiDungGhiChu;
  }
  public String getNgayGhiChu(){
    String s = ngayGhiChu.substring(3,4)+ngayGhiChu.substring(0,2)+ngayGhiChu.substring(5, 6);
    return s;
  }
}

public class NoteClass_10 {

}
