package cn.zhku.Lianjiechi;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

public class TxQueryRunner extends QueryRunner {

	@Override
	public int[] batch(String sql, Object[][] params) throws SQLException {
		return null;
	/*
	 * 1.得到链接
	 * 2.执行父类方法
	 * 3.释放连接
	 * 4.返回值
	 */
	}

	@Override
	public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh)
			throws SQLException {
		// TODO Auto-generated method stub
		return super.query(conn, sql, rsh);
	}

	@Override
	public <T> T query(String sql, Object param, ResultSetHandler<T> rsh)
			throws SQLException {
		// TODO Auto-generated method stub
		return super.query(sql, param, rsh);
	}

	@Override
	public <T> T query(String sql, Object[] params, ResultSetHandler<T> rsh)
			throws SQLException {
		// TODO Auto-generated method stub
		return super.query(sql, params, rsh);
	}

	@Override
	public <T> T query(String sql, ResultSetHandler<T> rsh, Object... params)
			throws SQLException {
		// TODO Auto-generated method stub
		return super.query(sql, rsh, params);
	}

	@Override
	public <T> T query(String sql, ResultSetHandler<T> rsh) throws SQLException {
		// TODO Auto-generated method stub
		return super.query(sql, rsh);
	}

	@Override
	public int update(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return super.update(sql);
	}

	@Override
	public int update(String sql, Object param) throws SQLException {
		// TODO Auto-generated method stub
		return super.update(sql, param);
	}

	@Override
	public int update(String sql, Object... params) throws SQLException {
		// TODO Auto-generated method stub
		return super.update(sql, params);
	}

}
