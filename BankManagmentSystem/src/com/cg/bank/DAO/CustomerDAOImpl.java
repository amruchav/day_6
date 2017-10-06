package com.cg.bank.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.bank.DbUtil.DbUtil;
import com.cg.bank.bean.CustomerBean;



public class CustomerDAOImpl implements ICustomerDAO{

	public int addDetails(CustomerBean bean){
		Connection conn=null;
		int row=0;
		int result=0;
		try
		{
		conn=DbUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement("INSERT INTO CustomerDetails VALUES(custId_seq.nextval,?,?,?)");
		
		ps.setString(1, bean.getCustomerName());
		ps.setString(2, bean.getPhoneNo());
		ps.setString(3, bean.getPassword());
		row=ps.executeUpdate();
		
		PreparedStatement ps1=conn.prepareStatement("select custId_seq.currval from CustomerDetails");
		ResultSet rs=ps1.executeQuery();
	    while(rs.next())
	    {
	    	result = rs.getInt(1);
	    }  
	    
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return result;
		
	}

}
