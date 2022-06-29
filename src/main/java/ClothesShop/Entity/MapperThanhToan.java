package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

public class MapperThanhToan  implements RowMapper<String[]>{

	public String[] mapRow(ResultSet rs, int rowNum) throws SQLException {
		String [] strings = new String[1];
		strings[0]= rs.getString("tongtien");
		return strings;
	}
}

