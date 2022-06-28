package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperNhatKy implements RowMapper<NhatKy>{
	public NhatKy mapRow(ResultSet rs, int rowNum) throws SQLException {
		NhatKy nhatky = new NhatKy();
		nhatky.setId(rs.getInt("id"));
		nhatky.setId_dh(rs.getInt("id_dh"));
		nhatky.setThoigianupdate(rs.getDate("thoigianupdate"));
		nhatky.setTrangthai(rs.getString("trangthai"));
		return nhatky;
	}
}
