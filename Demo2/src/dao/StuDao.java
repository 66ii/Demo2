package dao;
import java.util.List;

public interface StuDao {
	public boolean check(String username)throws Exception;
	public List getAllStus()throws Exception;
}
